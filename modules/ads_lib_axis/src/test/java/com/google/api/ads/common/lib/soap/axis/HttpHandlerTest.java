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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.api.ads.adwords.lib.soap.testing.SoapResponseXmlProvider;
import com.google.api.ads.common.lib.soap.axis.HttpHandler.InputStreamEventListener;
import com.google.api.ads.common.lib.testing.MockHttpServer;
import com.google.api.ads.common.lib.testing.MockResponse;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.testing.http.MockLowLevelHttpRequest;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;
import com.google.common.base.MoreObjects;
import java.io.IOException;
import org.apache.axis.AxisEngine;
import org.apache.axis.AxisFault;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.client.AxisClient;
import org.apache.axis.transport.http.HTTPConstants;
import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/** Tests for {@link HttpHandler}. */
@RunWith(JUnit4.class)
public class HttpHandlerTest {

  private static final String API_VERSION = "v209901";

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Mock private AxisEngine axisEngine;
  @Mock private Message requestMessage;

  private HttpHandler httpHandler;
  private StreamListener streamListener;
  private MockHttpServer mockHttpServer;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    streamListener = new StreamListener();
    mockHttpServer = new MockHttpServer();
    httpHandler = new HttpHandler(mockHttpServer.getHttpTransport(), streamListener);
  }

  @After
  public void tearDown() throws Exception {
    // Assert that the response's input stream was properly closed if it was opened.
    streamListener.assertStateIsValid();
  }

  /**
   * Tests that a valid XML response results in a successful invocation of the handler that produces
   * a valid SOAP envelope.
   */
  @Test
  public void testInvokeReturnsValidXml() throws IOException {
    // Unlike the failure tests below, create the MessageContext here with an actual AxisClient,
    // not a mock AxisEngine. Otherwise, the call to getSOAPEnvelope below will fail.
    MessageContext messageContext = new MessageContext(new AxisClient());
    messageContext.setRequestMessage(requestMessage);
    messageContext.setProperty(MessageContext.TRANS_URL, mockHttpServer.getServerUrl());
    SoapResponseXmlProvider.getTestSoapResponse(API_VERSION);
    mockHttpServer.setMockResponse(
        new MockResponse(SoapResponseXmlProvider.getTestSoapResponse(API_VERSION)));

    httpHandler.invoke(messageContext);
    assertNotNull(
        "SOAP envelope of response is null", messageContext.getResponseMessage().getSOAPEnvelope());
  }

  /** Tests that a poorly formed XML response will result in an AxisFault. */
  @Test
  public void testInvokeReturnsInvalidXml() throws AxisFault {
    MessageContext messageContext = new MessageContext(axisEngine);

    messageContext.setRequestMessage(requestMessage);
    messageContext.setProperty(MessageContext.TRANS_URL, mockHttpServer.getServerUrl());
    messageContext.setProperty(HTTPConstants.MC_GZIP_REQUEST, true);
    mockHttpServer.setMockResponse(
        new MockResponse(
            "<?xml version='1.0' encoding='UTF-8' standalone='no'?>"
                + "<soap:Envelope xmlns:soap='http://schemas.xmlsoap.org/soap/envelope/'>"
                + "foo..."));

    httpHandler.invoke(messageContext);

    // Expect parsing to fail. Tear down will verify the stream was closed.
    thrown.expect(AxisFault.class);
    messageContext.getResponseMessage().getSOAPEnvelope();
  }

  /**
   * Tests that a failed, non-XML response results in an AxisFault containing the HTTP status and
   * message.
   */
  @Test
  public void testInvokeReturnsNonXmlResponse() throws AxisFault {
    MessageContext messageContext = new MessageContext(axisEngine);
    messageContext.setRequestMessage(requestMessage);
    messageContext.setProperty(MessageContext.TRANS_URL, mockHttpServer.getServerUrl());
    messageContext.setProperty(HTTPConstants.MC_GZIP_REQUEST, true);
    MockResponse mockResponse = new MockResponse("Something went wrong", 500);
    mockResponse.setContentType("text/html");
    mockHttpServer.setMockResponse(mockResponse);

    // Expect an AxisFault based on the status code and content type.
    thrown.expect(AxisFault.class);
    httpHandler.invoke(messageContext);
  }

  /** Tests that a request with null content type will fail as expected. */
  @Test
  public void testInvokeWithoutContentType() throws AxisFault {
    MessageContext messageContext = new MessageContext(axisEngine);
    messageContext.setRequestMessage(requestMessage);
    messageContext.setProperty(MessageContext.TRANS_URL, mockHttpServer.getServerUrl());
    messageContext.setProperty(HTTPConstants.MC_GZIP_REQUEST, true);
    MockResponse mockResponse = new MockResponse("Something went wrong", 500);
    mockResponse.setContentType(null);
    mockHttpServer.setMockResponse(mockResponse);

    // Expect an AxisFault based on the status code and content type.
    thrown.expect(AxisFault.class);
    httpHandler.invoke(messageContext);
  }

  /** Tests that a request with null message context will fail as expected. */
  @Test
  public void testInvokeWithoutMessageContext() throws AxisFault {
    thrown.expect(AxisFault.class);
    thrown.expectCause(Matchers.<Exception>instanceOf(NullPointerException.class));
    thrown.expectMessage("context");

    httpHandler.invoke(null);
  }

  /** Tests that a request with null request on the message context will fail as expected. */
  @Test
  public void testInvokeWithoutRequestMessage() throws AxisFault {
    MessageContext messageContext = new MessageContext(axisEngine);

    thrown.expect(AxisFault.class);
    thrown.expectCause(Matchers.<Exception>instanceOf(NullPointerException.class));
    thrown.expectMessage("request");

    httpHandler.invoke(messageContext);
  }

  /** Tests that a request with null request URL will fail as expected. */
  @Test
  public void testInvokeWithoutRequestUrl() throws AxisFault {
    MessageContext messageContext = new MessageContext(axisEngine);
    messageContext.setRequestMessage(requestMessage);

    thrown.expect(AxisFault.class);
    thrown.expectCause(Matchers.<Exception>instanceOf(IllegalArgumentException.class));
    thrown.expectMessage("URL");

    httpHandler.invoke(messageContext);
  }

  /** Tests that the timeout set on the message context is passed to the underlying request. */
  @Test
  public void testInvokeSetsTimeout() {
    MessageContext messageContext = new MessageContext(axisEngine);
    messageContext.setRequestMessage(requestMessage);
    messageContext.setProperty(MessageContext.TRANS_URL, "https://www.example.com");

    // Do not care about XML parsing for this test, so set the response's status code to 302
    // to trigger an AxisFault.
    MockLowLevelHttpResponse lowLevelHttpResponse = new MockLowLevelHttpResponse();
    lowLevelHttpResponse.setContent("Intentional failure");
    lowLevelHttpResponse.setStatusCode(302);

    /*
     * Set timeout on the message context, then create a custom mock transport that will capture
     * invocations of LowLevelHttpRequest.setTimeout(int, int) and record the arguments passed.
     */
    int timeout = 1234567;
    messageContext.setTimeout(timeout);
    final int[] actualTimeouts = new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE};
    MockLowLevelHttpRequest lowLevelHttpRequest =
        new MockLowLevelHttpRequest() {
          @Override
          public void setTimeout(int connectTimeout, int readTimeout) throws IOException {
            actualTimeouts[0] = connectTimeout;
            actualTimeouts[1] = readTimeout;
            super.setTimeout(connectTimeout, readTimeout);
          }
        };
    lowLevelHttpRequest.setResponse(lowLevelHttpResponse);
    MockHttpTransport mockTransport =
        new MockHttpTransport.Builder().setLowLevelHttpRequest(lowLevelHttpRequest).build();
    httpHandler = new HttpHandler(mockTransport, streamListener);

    try {
      httpHandler.invoke(messageContext);
      fail("Expected an AxisFault");
    } catch (AxisFault e) {
      assertThat(e.getFaultString(), Matchers.containsString("302"));
    }
    assertArrayEquals(
        "Timeouts not set to expected values", new int[] {timeout, timeout}, actualTimeouts);
  }

  /** InputStreamEventListener implementation that tracks the opened/closed state of a stream. */
  private static class StreamListener implements InputStreamEventListener {

    private boolean wasOpened;
    private boolean wasClosed;

    @Override
    public void afterClose() {
      this.wasClosed = true;
    }

    @Override
    public void afterCreate() {
      this.wasOpened = true;
    }

    /**
     * Asserts that the underlying input stream was closed if opened, and not closed if not opened.
     */
    void assertStateIsValid() {
      if (!wasOpened) {
        assertFalse("Input stream was closed but not opened", wasClosed);
      } else {
        assertTrue("Input stream was opened but not closed", wasClosed);
      }
    }

    @Override
    public String toString() {
      return MoreObjects.toStringHelper(this)
          .add("wasOpened", wasOpened)
          .add("wasClosed", wasClosed)
          .toString();
    }
  }
}
