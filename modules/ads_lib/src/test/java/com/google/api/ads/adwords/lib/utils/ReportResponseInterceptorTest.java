// Copyright 2014 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.utils.logging.ReportServiceLogger;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpStatusCodes;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Test for {@link ReportResponseInterceptor}.
 */
@RunWith(JUnit4.class)
public class ReportResponseInterceptorTest {

  @Mock
  private ReportServiceLogger reportServiceLogger;
  @Mock
  private LowLevelHttpRequest lowLevelRequest;
  @Mock
  private LowLevelHttpResponse lowLevelResponse;
  @Mock
  private InputStream responseContentStream;

  private final GenericUrl genericUrl = new GenericUrl("http://www.example.com");

  /**
   * The interceptor instance being tested.
   */
  private ReportResponseInterceptor interceptor;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    interceptor = new ReportResponseInterceptor(reportServiceLogger);
    when(lowLevelRequest.execute()).thenReturn(lowLevelResponse);
    when(lowLevelResponse.getContent()).thenReturn(responseContentStream);
  }

  /**
   * Asserts that no report service logger calls are made for a null response.
   */
  @Test
  public void testIntercept_nullResponse() throws IOException {
    interceptor.interceptResponse(null);
    verify(reportServiceLogger, never()).logRequest(any(HttpRequest.class), anyInt(), anyString());
  }

  /**
   * Asserts that the proper report service logger calls are made for a successful response.
   */
  @Test
  public void testIntercept_successfulResponse() throws IOException {
    testInterceptNonNullResponse(HttpStatusCodes.STATUS_CODE_OK);
  }

  /**
   * Asserts that the proper report service logger calls are made for a failed response.
   */
  @Test
  public void testIntercept_failedResponse() throws IOException {
    testInterceptNonNullResponse(HttpStatusCodes.STATUS_CODE_BAD_GATEWAY);
  }

  /**
   * Helper method that asserts that the proper report service logger calls are made for a response
   * with the specified status code and success status.
   */
  private void testInterceptNonNullResponse(int statusCode)
      throws IOException {
    when(lowLevelResponse.getStatusCode()).thenReturn(statusCode);
    FakeHttpTransport httpTransport = new FakeHttpTransport();
    HttpRequest request = httpTransport.createFakeRequestFactory().buildGetRequest(genericUrl);
    request.setThrowExceptionOnExecuteError(false);
    HttpResponse response = request.execute();
    assertNotNull("Fake transport should have returned a non-null response", response);

    // Verifies that the expected report service logger call is made.
    verify(reportServiceLogger).logRequest(request, response.getStatusCode(),
        response.getStatusMessage());

    // Verifies that the interceptor does not try to consume or mutate the response's
    // input stream, as this would be a violation of the HttpResponseInterceptor contract.
    verifyZeroInteractions(responseContentStream);
  }

  /**
   * HttpTransport subclass that:
   * <ul>
   * <li>Always returns lowLevelRequest from buildRequest</li>
   * <li>Has a method for creating a fake HttpRequestFactory that will set the response interceptor
   * to the interceptor of the enclosing test instance</li>
   * </ul>
   */
  private class FakeHttpTransport extends HttpTransport {

    @Override
    protected LowLevelHttpRequest buildRequest(String method, String url) throws IOException {
      return ReportResponseInterceptorTest.this.lowLevelRequest;
    }

    /**
     * Returns a request factory suitable for testing. Use this instead of createRequestFactory.
     */
    public HttpRequestFactory createFakeRequestFactory() {
      return this.createRequestFactory(new HttpRequestInitializer() {
        @Override
        public void initialize(HttpRequest request) throws IOException {
          request.setResponseInterceptor(ReportResponseInterceptorTest.this.interceptor);
        }
      });
    }
  }
}
