// Copyright 2012 Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.testing;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.testing.http.HttpTesting;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.testing.http.MockLowLevelHttpRequest;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;
import com.google.common.io.ByteSource;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.GZIPInputStream;

/**
 * HTTP server used to verify requests and send mocked responses. Unlike {@link TestHttpServer},
 * this server does not actually open a port and listen for requests. Instead, it uses a mock
 * {@link HttpTransport}.
 */
public class MockHttpServer {

  private final HttpTransport httpTransport;
  
  private final Deque<ActualResponse> actualResponses = new LinkedList<>();
  private final Deque<MockResponse> mockResponses = new LinkedList<>();

  public MockHttpServer() {
    this.httpTransport =
        new MockHttpTransport() {
          @Override
          public LowLevelHttpRequest buildRequest(String method, String url) throws IOException {
            return new MockLowLevelHttpRequest(url) {
              @Override
              public LowLevelHttpResponse execute() throws IOException {
                return MockHttpServer.this.execute(this);
              }
            };
          }
        };
  }

  private LowLevelHttpResponse execute(MockLowLevelHttpRequest request) throws IOException {
  
    ActualResponse actualResponse = new ActualResponse(request.getHeaders());
    actualResponses.add(actualResponse);

    MockResponse mockResponse;
    if (mockResponses.isEmpty()) {
      mockResponse = new MockResponse("No mock response body set", 500);
    } else {
      mockResponse = mockResponses.pop();
    }
    
    // Read the raw bytes from the request.
    ByteArrayOutputStream byteOutStream = new ByteArrayOutputStream();
    request.getStreamingContent().writeTo(byteOutStream);
    final byte[] rawRequestBytes = byteOutStream.toByteArray();
  
    // Inflate the raw bytes if they are in gzip format.
    boolean isGzipFormat = false;
    List<String> contentEncodingValues = request.getHeaders().get("Content-Encoding");
    if (contentEncodingValues != null && !contentEncodingValues.isEmpty()) {
      isGzipFormat = "gzip".equals(contentEncodingValues.get(0));
    }

    byte[] requestBytes;
    if (isGzipFormat) {
      requestBytes =
          new ByteSource() {
            @Override
            public InputStream openStream() throws IOException {
              return new GZIPInputStream(ByteSource.wrap(rawRequestBytes).openStream());
            }
          }.read();
    } else {
      requestBytes = rawRequestBytes;
    }
  
    // Convert the (possibly inflated) request bytes to a string.
    String requestBody = ByteSource.wrap(requestBytes).asCharSource(StandardCharsets.UTF_8).read();
    actualResponse.setRequestBody(requestBody);

    if (mockResponse.isValidateUrlMatches() && !getServerUrl().equals(request.getUrl())) {
      throw new ConnectException(
          String.format(
              "Request URL does not match.%n  Expected: %s%n  Actual: %s%n",
              getServerUrl(),
              request.getUrl()));
    }
  
    MockLowLevelHttpResponse response = new MockLowLevelHttpResponse();
    // Add the Location response header, which is required by some tests such as
    // BatchJobUploaderTest.
    response.addHeader("Location", getServerUrl());
  
    response.setStatusCode(mockResponse.getHttpStatus());
    response.setContentType(mockResponse.getContentType());
    response.setContent(mockResponse.getBody());
    return response;
  }

  public void setMockResponse(MockResponse mockResponse) {
    this.mockResponses.add(mockResponse);
  }
  
  public void setMockResponses(Collection<MockResponse> mockResponses) {
    this.mockResponses.addAll(mockResponses);
  }

  public ActualResponse getLastResponse() {
    return this.actualResponses.getLast();
  }

  public List<ActualResponse> getAllResponses() {
    return new ArrayList<>(this.actualResponses);
  }
  
  /**
   * Gets the server URL with port.
   */
  public String getServerUrl() {
    return HttpTesting.SIMPLE_URL;
  }

  /**
   * Gets the (mock) {@link HttpTransport}.
   */
  public HttpTransport getHttpTransport() {
    return httpTransport;
  }

}
