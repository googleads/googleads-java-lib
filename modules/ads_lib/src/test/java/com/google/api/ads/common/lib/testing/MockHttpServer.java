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

import static org.apache.commons.lang.CharEncoding.UTF_8;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.testing.http.HttpTesting;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.testing.http.MockLowLevelHttpRequest;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.ByteSource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.nio.charset.Charset;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/**
 * HTTP server used to verify requests and send mocked responses. Unlike {@link TestHttpServer},
 * this server does not actually open a port and listen for requests. Instead, it uses a mock
 * {@link HttpTransport}.
 */
public class MockHttpServer {

  private boolean isValidateUrlMatches;
  private final HttpTransport httpTransport;
  private int numInteractions = 0;
  private long delay = 0;
  private final Deque<String> requestBodies = Lists.newLinkedList();
  private final Deque<Boolean> requestBodiesCompressionStates = Lists.newLinkedList();
  private final Deque<Map<String, List<String>>> requestHeaders = Lists.newLinkedList();
  private final List<String> mockResponseBodies = Lists.newArrayList();

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
    this.isValidateUrlMatches = true;
  }

  private LowLevelHttpResponse execute(MockLowLevelHttpRequest request) throws IOException {
  
    this.requestHeaders.add(Maps.newHashMap(request.getHeaders()));
  
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
    this.requestBodies.add(
        ByteSource.wrap(requestBytes).asCharSource(Charset.forName(UTF_8)).read());
    this.requestBodiesCompressionStates.add(isGzipFormat);
  
    // Simulate a delay in processing.
    try {
      Thread.sleep(this.delay);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException("Thread interrupted while simulating a delay", e);
    }
  
    if (isValidateUrlMatches && !getServerUrl().equals(request.getUrl())) {
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
  
    numInteractions++;
    if (mockResponseBodies.size() < numInteractions) {
      response.setStatusCode(500);
      response.setContent("No mock response body set");
    } else {
      response.setStatusCode(200);
      response.setContent(mockResponseBodies.get(numInteractions - 1));
    }
    return response;
  }

  /**
   * Sets the response bodies that this server will return for requests. The order of responses in
   * {@code mockResponseBodies} will be preserved.
   */
  public void setMockResponseBodies(List<String> mockResponseBodies) {
    this.mockResponseBodies.clear();
    this.mockResponseBodies.addAll(mockResponseBodies);
  }

  /**
   * Sets whether this server validates that each request's URL matches {@link #getServerUrl()}.
   * Default is {@code true}.
   */
  public void setValidateUrlMatches(boolean isValidateUrlMatches) {
    this.isValidateUrlMatches = isValidateUrlMatches;
  }

  /**
   * Gets the server URL with port.
   */
  public String getServerUrl() {
    return HttpTesting.SIMPLE_URL;
  }

  /**
   * Gets the body of the last request made to the server. This will be the inflated body if the
   * last request was compressed.
   */
  public String getLastRequestBody() {
    return requestBodies.getLast();
  }

  /**
   * Returns if the last request body was compressed.
   */
  public boolean wasLastRequestBodyCompressed() {
    return requestBodiesCompressionStates.getLast();
  }

  /**
   * Gets the headers of the last request made to the server or {@code null} if none.
   */
  public Map<String, List<String>> getLastRequestHeaders() {
    return requestHeaders.getLast();
  }

  /**
   * Gets the (mock) {@link HttpTransport}.
   */
  public HttpTransport getHttpTransport() {
    return httpTransport;
  }

  /**
   * Gets the body of the all requests made to the server, in order from oldest to newest.
   */
  public List<String> getAllRequestBodies() {
    return Lists.newArrayList(this.requestBodies);
  }

  /**
   * Gets the map of request headers from each request.
   */
  public List<Map<String, List<String>>> getAllRequestHeaders() {
    return Lists.newArrayList(requestHeaders);
  }
}
