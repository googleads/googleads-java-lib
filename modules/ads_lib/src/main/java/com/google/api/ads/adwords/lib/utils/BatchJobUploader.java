// Copyright 2015 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.lib.utils;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.soap.RequestInfo;
import com.google.api.ads.common.lib.soap.ResponseInfo;
import com.google.api.ads.common.lib.soap.SoapCallReturn;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.api.ads.common.lib.utils.Streams;
import com.google.api.ads.common.lib.utils.logging.AdsServiceLoggers;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.Charsets;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;


/**
 * Utility for uploading operations to a BatchJob and downloading results from
 * a completed BatchJob.
 *
 * @param <OperandT> Operand for the SOAP framework and AdWords API version.
 * @param <ApiErrorT> ApiError for the SOAP framework and AdWords API version.
 * @param <ResultT> MutateResult for the SOAP framework and AdWords API version.
 * @param <ResponseT> BatchJobMutateResponseInterface type for the SOAP framework and AdWords API
 * version.
 */
public class BatchJobUploader<OperandT, ApiErrorT,
    ResultT extends BatchJobMutateResultInterface<OperandT, ApiErrorT>,
    ResponseT extends BatchJobMutateResponseInterface<OperandT, ApiErrorT, ResultT>> {
  
  private final AdWordsSession session;
  private final HttpTransport httpTransport;
  private final UserAgentCombiner userAgentCombiner;
  private final AdsServiceLoggers serviceLoggers;

  /**
   * Charset for request contents.
   */
  private static final Charset REQUEST_CHARSET = Charsets.UTF_8;
  
  /**
   * Constructor that stores the session for authentication.
   */
  public BatchJobUploader(AdWordsSession session) {
    this.session = session;
    this.httpTransport = AdWordsInternals.getInstance().getHttpTransport();
    this.userAgentCombiner = AdWordsInternals.getInstance().getUserAgentCombiner();
    this.serviceLoggers = AdWordsInternals.getInstance().getAdsServiceLoggers();
  }

  private HttpHeaders createHttpHeaders() {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType("application/xml");
    headers.setUserAgent(userAgentCombiner.getUserAgent(session.getUserAgent()));
    return headers;
  }

  /**
   * Uploads a batch job's operations and returns the response.
   */
  public BatchJobUploadResponse uploadBatchJobOperations(
      BatchJobMutateRequestInterface request, String uploadUrl) throws BatchJobException {
    Preconditions.checkNotNull(request, "Null request");
    String requestXml = null;
    String responseMessage = null;
    Throwable exception = null;
    BatchJobUploadResponse batchJobUploadResponse = null;
    try {
      HttpRequestFactory requestFactory =
          httpTransport.createRequestFactory(new HttpRequestInitializer() {
            @Override
            public void initialize(HttpRequest request) throws IOException {
              request.setHeaders(createHttpHeaders());
              request.setLoggingEnabled(true);
            }
          });
      BatchJobUploadBodyProvider bodyProvider = request.createBatchJobUploadBodyProvider();

      // Non-incremental operations require a POST request.
      ByteArrayContent content = bodyProvider.getHttpContent(request, true, true);
      HttpRequest httpRequest = requestFactory.buildPostRequest(
          new GenericUrl(uploadUrl), content);
      
      requestXml = Streams.readAll(content.getInputStream(), REQUEST_CHARSET);
      content.getInputStream().reset();
      
      HttpResponse response = httpRequest.execute();

      batchJobUploadResponse =
          new BatchJobUploadResponse(response, httpRequest.getContent().getLength(), null);

      responseMessage = String.format("%s: %s", response.getStatusCode(), 
          response.getStatusMessage());
      return batchJobUploadResponse;
    } catch (IOException e) {
      responseMessage = e.getClass().getSimpleName();
      exception = e;
      throw new BatchJobException("Problem sending data to batch upload URL.", e);
    } finally {
      logRequestResponse(requestXml, responseMessage, uploadUrl, "uploadBatchJobOperations",
          batchJobUploadResponse, exception);
    }
  }
  
  /**
   * Incrementally uploads a batch job's operations and returns the response.
   *  
   * @param request the request to upload
   * @param isLastRequest if the request is the last request in the sequence of uploads for the job
   * @param batchJobUploadStatus the current upload status of the job
   */
  public BatchJobUploadResponse uploadIncrementalBatchJobOperations(
      final BatchJobMutateRequestInterface request, final boolean isLastRequest,
      final BatchJobUploadStatus batchJobUploadStatus) throws BatchJobException {
    Preconditions.checkNotNull(batchJobUploadStatus, "Null batch job upload status");
    Preconditions.checkNotNull(
        batchJobUploadStatus.getResumableUploadUri(), "No resumable session URI");
  
    // The process below follows the Google Cloud Storage guidelines for resumable
    // uploads of unknown size:
    // https://cloud.google.com/storage/docs/concepts-techniques#unknownresumables
    ByteArrayContent content = request.createBatchJobUploadBodyProvider().getHttpContent(
        request, batchJobUploadStatus.getTotalContentLength() == 0, isLastRequest);
    
    String requestXml = null;
    String responseMessage = null;
    Throwable exception = null;
    BatchJobUploadResponse batchJobUploadResponse = null;
    final long contentLength = content.getLength();
    
    try {
      HttpRequestFactory requestFactory =
          httpTransport.createRequestFactory(new HttpRequestInitializer() {
            @Override
            public void initialize(HttpRequest request) throws IOException {
              HttpHeaders headers = createHttpHeaders();
              headers.setContentLength(contentLength);
              headers.setContentRange(constructContentRangeHeaderValue(
                  contentLength, isLastRequest, batchJobUploadStatus));
              request.setHeaders(headers);
              request.setLoggingEnabled(true);
            }
          });
  
      // Incremental uploads require a PUT request.
      HttpRequest httpRequest = requestFactory.buildPutRequest(
          new GenericUrl(batchJobUploadStatus.getResumableUploadUri()), content);
  
      requestXml = Streams.readAll(content.getInputStream(), REQUEST_CHARSET);
      content.getInputStream().reset();
      
      HttpResponse response = httpRequest.execute();
      batchJobUploadResponse = new BatchJobUploadResponse(
          response,
          batchJobUploadStatus.getTotalContentLength() + httpRequest.getContent().getLength(),
          batchJobUploadStatus.getResumableUploadUri());
      return batchJobUploadResponse;
    } catch (HttpResponseException e) {
      if (e.getStatusCode() == 308) {
        // 308 indicates that the upload succeeded.
        batchJobUploadResponse =
            new BatchJobUploadResponse(new ByteArrayInputStream(new byte[0]), e.getStatusCode(),
                e.getStatusMessage(), batchJobUploadStatus.getTotalContentLength() + contentLength,
                batchJobUploadStatus.getResumableUploadUri());
        return batchJobUploadResponse;
      }
      responseMessage = e.getClass().getSimpleName();
      exception = e;
      throw new BatchJobException("Failed response status from batch upload URL.", e);
    } catch (IOException e) {
      responseMessage = e.getClass().getSimpleName();
      exception = e;
      throw new BatchJobException("Problem sending data to batch upload URL.", e);
    } finally {
      logRequestResponse(requestXml, responseMessage,
          batchJobUploadStatus.getResumableUploadUri().toString(),
          "uploadIncrementalBatchJobOperations", batchJobUploadResponse, exception);
    }
  }

  /**
   * Logs a request and response based on the standard rules for the library.
   */
  private void logRequestResponse(String requestXml, String responseMessage, String url,
      String methodName,
      BatchJobUploadResponse batchJobUploadResponse,
      Throwable exception){
    RequestInfo requestInfo =
        new RequestInfo.Builder()
            .withServiceName(BatchJobUploader.class.getSimpleName())
            .withMethodName(methodName)
            .withSoapRequestXml(requestXml)
            .withUrl(url)
            .build();
    // Construct a ResponseInfo with a dummy XML message, since the upload URL response will
    // not contain XML.
    ResponseInfo responseInfo =
        new ResponseInfo.Builder()
            .withSoapResponseXml(
                String.format("<uploadResponse>%s</uploadResponse>", responseMessage))
            .build();
    SoapCallReturn soapCallReturn =
        new SoapCallReturn.Builder()
            .withRequestInfo(requestInfo)
            .withResponseInfo(responseInfo)
            .withException(exception)
            .withReturnValue(batchJobUploadResponse)
            .build();
    serviceLoggers.logRequest(soapCallReturn);
    serviceLoggers.logSoapXml(soapCallReturn);
  }

  /**
   * Constructs the content range header value for the specified arguments.
   * @param requestLength the length of the request that's about to be uploaded
   * @param isLastRequest if the request is the last request for the job
   * @param batchJobUploadStatus the status of the job <em>before</em> this upload
   * @return the content range header value, e.g., {@code bytes 0-99/100},
   * {@code 100-199/*}, etc.
   */
  @VisibleForTesting
  String constructContentRangeHeaderValue(
      long requestLength, boolean isLastRequest, BatchJobUploadStatus batchJobUploadStatus) {
    Preconditions.checkArgument(requestLength > 0, "Request length %s is <= 0", requestLength);
    long previousTotalLength = batchJobUploadStatus.getTotalContentLength();
    long contentLowerBound = previousTotalLength;
    long contentUpperBound = previousTotalLength + requestLength - 1;

    String totalBytesString;
    if (isLastRequest) {
      totalBytesString = String.valueOf(contentUpperBound + 1);
    } else {
      totalBytesString = "*";
    }
    return String.format("bytes %d-%d/%s", contentLowerBound, contentUpperBound, totalBytesString);
  }
}
