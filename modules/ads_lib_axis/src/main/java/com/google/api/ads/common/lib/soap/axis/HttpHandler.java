// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.common.lib.soap.axis;

import static java.nio.charset.StandardCharsets.UTF_8;

import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.io.ByteStreams;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPOutputStream;
import javax.xml.soap.SOAPException;
import org.apache.axis.AxisFault;
import org.apache.axis.Constants;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.transport.http.HTTPConstants;
import org.apache.axis.utils.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Axis handler implementation that handles compression. */
public class HttpHandler extends BasicHandler implements HttpRequestInitializer {

  private static final Logger logger = LoggerFactory.getLogger(HttpHandler.class);

  private final HttpRequestFactory requestFactory;

  private final InputStreamEventListener inputStreamEventListener;

  /** The default transport used for everything except tests. */
  private static final HttpTransport defaultHttpTransport = new NetHttpTransport();

  public HttpHandler() {
    this(defaultHttpTransport, null);
  }

  @VisibleForTesting
  HttpHandler(HttpTransport transport, InputStreamEventListener inputStreamEventListener) {
    super();
    this.requestFactory = transport.createRequestFactory(this);
    this.inputStreamEventListener = inputStreamEventListener;
  }

  @Override
  public void invoke(MessageContext msgContext) throws AxisFault {
    if (msgContext == null) {
      throw AxisFault.makeFault(new NullPointerException("Null message context"));
    }

    // Catch any exception thrown and wrap it in an AxisFault, per the contract of Handler.invoke.
    try {
      HttpResponse response = null;
      // Create the request.
      HttpRequest postRequest = createHttpRequest(msgContext);
      // Execute the request.
      response = postRequest.execute();
      // Translate the HTTP response to an Axis message on the message context.
      msgContext.setResponseMessage(createResponseMessage(response));
    } catch (Exception e) {
      throw AxisFault.makeFault(e);
    }
  }

  /** Sets attributes of the request that are common to all requests for this handler. */
  @Override
  public void initialize(HttpRequest httpRequest) throws IOException {
    // Do not throw if execute fails, since Axis will handle unmarshalling the
    // fault.
    httpRequest.setThrowExceptionOnExecuteError(false);

    // For consistency with the default Axis HTTPSender and CommonsHTTPSender, do not
    // follow redirects.
    httpRequest.setFollowRedirects(false);

    // Retry should be handled by the client.
    httpRequest.setNumberOfRetries(0);
  }

  /**
   * Creates an HTTP request based on the message context.
   *
   * @param msgContext the Axis message context
   * @return a new {@link HttpRequest} with content and headers populated
   */
  private HttpRequest createHttpRequest(MessageContext msgContext)
      throws SOAPException, IOException {
    Message requestMessage =
        Preconditions.checkNotNull(
            msgContext.getRequestMessage(), "Null request message on message context");
    
    // Construct the output stream.
    String contentType = requestMessage.getContentType(msgContext.getSOAPConstants());
    ByteArrayOutputStream bos;
    int contentLength = Long.valueOf(requestMessage.getContentLength()).intValue();
    if (contentLength > 0) {
      bos = new ByteArrayOutputStream(contentLength);
    } else {
      bos = new ByteArrayOutputStream();
    }

    if (msgContext.isPropertyTrue(HTTPConstants.MC_GZIP_REQUEST)) {
      logger.debug("Compressing request");
      try (GZIPOutputStream gzipOs = new GZIPOutputStream(bos)) {
        requestMessage.writeTo(gzipOs);
      }
    } else {
      logger.debug("Not compressing request");
      requestMessage.writeTo(bos);
    }

    HttpRequest httpRequest =
        requestFactory.buildPostRequest(
            new GenericUrl(msgContext.getStrProp(MessageContext.TRANS_URL)),
            new ByteArrayContent(contentType, bos.toByteArray()));

    int timeoutMillis = msgContext.getTimeout();
    if (timeoutMillis >= 0) {
      logger.debug("Setting read and connect timeout to {} millis", timeoutMillis);
      // These are not the same, but MessageContext has only one definition of timeout.
      httpRequest.setReadTimeout(timeoutMillis);
      httpRequest.setConnectTimeout(timeoutMillis);
    }

    // Copy the request headers from the message context to the post request.
    setHttpRequestHeaders(msgContext, httpRequest);

    return httpRequest;
  }

  /** Sets HTTP request headers based on the Axis message context. */
  private void setHttpRequestHeaders(MessageContext msgContext, HttpRequest httpRequest) {
    @SuppressWarnings("unchecked")
    Map<Object, Object> requestHeaders =
        (Map<Object, Object>) msgContext.getProperty(HTTPConstants.REQUEST_HEADERS);
    if (requestHeaders != null) {
      for (Entry<Object, Object> headerEntry : requestHeaders.entrySet()) {
        Object headerKey = headerEntry.getKey();
        if (headerKey == null) {
          continue;
        }
        String headerName = headerKey.toString().trim();
        Object headerValue = headerEntry.getValue();
        if (HTTPConstants.HEADER_AUTHORIZATION.equals(headerName)
            && (headerValue instanceof String)) {
          // HttpRequest expects the Authorization header to be a list of values,
          // so handle the case where it is simply a string.
          httpRequest.getHeaders().setAuthorization((String) headerValue);
        } else {
          httpRequest.getHeaders().set(headerName, headerValue);
        }
      }
    }
    if (msgContext.isPropertyTrue(HTTPConstants.MC_GZIP_REQUEST)) {
      httpRequest.getHeaders().setContentEncoding(HTTPConstants.COMPRESSION_GZIP);
    }
  }

  /**
   * Returns a new Axis Message based on the contents of the HTTP response.
   *
   * @param httpResponse the HTTP response
   * @return an Axis Message for the HTTP response
   * @throws IOException if unable to retrieve the HTTP response's contents
   * @throws AxisFault if the HTTP response's status or contents indicate an unexpected error, such
   *     as a 405.
   */
  private Message createResponseMessage(HttpResponse httpResponse) throws IOException, AxisFault {
    int statusCode = httpResponse.getStatusCode();
    String contentType = httpResponse.getContentType();
    // The conditions below duplicate the logic in CommonsHTTPSender and HTTPSender.
    boolean shouldParseResponse =
        (statusCode > 199 && statusCode < 300)
            || (contentType != null
                && !contentType.equals("text/html")
                && statusCode > 499
                && statusCode < 600);
    // Wrap the content input stream in a notifying stream so the stream event listener will be
    // notified when it is closed.
    InputStream responseInputStream =
        new NotifyingInputStream(httpResponse.getContent(), inputStreamEventListener);
    if (!shouldParseResponse) {
      // The contents are not an XML response, so throw an AxisFault with
      // the HTTP status code and message details.
      String statusMessage = httpResponse.getStatusMessage();
      AxisFault axisFault =
          new AxisFault("HTTP", "(" + statusCode + ")" + statusMessage, null, null);
      byte[] contentBytes;
      try (InputStream stream = responseInputStream) {
        contentBytes = ByteStreams.toByteArray(stream);
      }
      axisFault.setFaultDetailString(
          Messages.getMessage(
              "return01", Integer.toString(statusCode), new String(contentBytes, UTF_8)));
      axisFault.addFaultDetail(
          Constants.QNAME_FAULTDETAIL_HTTPERRORCODE, Integer.toString(statusCode));
      throw axisFault;
    }
    // Response is an XML response. Do not consume and close the stream in this case, since that
    // will happen later when the response is deserialized by Axis (as confirmed by unit tests for
    // this class).
    Message responseMessage =
        new Message(
            responseInputStream, false, contentType, httpResponse.getHeaders().getLocation());
    responseMessage.setMessageType(Message.RESPONSE);
    return responseMessage;
  }

  /**
   * Lifecycle listener for an input stream. Used in tests to verify that input streams created by
   * this handler are properly closed.
   */
  @VisibleForTesting
  static interface InputStreamEventListener {
    void afterCreate();

    void afterClose();
  }

  /** Wrapper for an input stream that triggers lifecycle events. */
  private static class NotifyingInputStream extends FilterInputStream {
    private final InputStreamEventListener inputStreamEventListener;

    public NotifyingInputStream(
        InputStream inputStream, InputStreamEventListener inputStreamEventListener) {
      super(inputStream);
      this.inputStreamEventListener = inputStreamEventListener;
      if (this.inputStreamEventListener != null) {
        this.inputStreamEventListener.afterCreate();
      }
    }

    @Override
    public void close() throws IOException {
      if (inputStreamEventListener != null) {
        inputStreamEventListener.afterClose();
      }
      super.close();
    }
  }
}
