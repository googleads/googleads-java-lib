// Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.google.api.ads.common.lib.utils.Streams;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.common.collect.Lists;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.IOException;
import java.net.ConnectException;
import java.util.List;

/**
 * Tests for {@link MockHttpServer}.
 */
@RunWith(JUnit4.class)
public class MockHttpServerTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  private MockHttpServer mockHttpServer = new MockHttpServer();

  @Test
  public void testNoResponseBodySet_fails() throws IOException {
    HttpRequest request =
        mockHttpServer
            .getHttpTransport()
            .createRequestFactory()
            .buildGetRequest(new GenericUrl(mockHttpServer.getServerUrl()));
    request.setContent(new ByteArrayContent("text", "test content".getBytes()));
    thrown.expect(HttpResponseException.class);
    thrown.expectMessage("No mock response");
    request.execute();
  }

  /**
   * Tests behavior when URL validation is enabled and the URL of the request does not match the
   * server's URL.
   */
  @Test
  public void testUrlMismatch_fails() throws IOException {
    HttpRequest request =
        mockHttpServer
            .getHttpTransport()
            .createRequestFactory()
            .buildGetRequest(
                new GenericUrl("http://www.example.com/does_not_match_mock_http_server_url"));
    request.setContent(new ByteArrayContent("text", "test content".getBytes()));
    mockHttpServer.setMockResponseBodies(Lists.newArrayList("test response"));
    thrown.expect(ConnectException.class);
    request.execute();
  }

  /**
   * Tests behavior when URL validation is disabled.
   */
  @Test
  public void testUrlMismatch_verifyDisabled() throws IOException {
    mockHttpServer.setValidateUrlMatches(false);
    HttpRequest request =
        mockHttpServer
            .getHttpTransport()
            .createRequestFactory()
            .buildGetRequest(
                new GenericUrl("http://www.example.com/does_not_match_mock_http_server_url"));
    request.setContent(new ByteArrayContent("text", "test content".getBytes()));
    HttpHeaders headers = new HttpHeaders();
    headers.set("one", "1");
    headers.set("two", "2");
    request.setHeaders(headers);
    mockHttpServer.setMockResponseBodies(Lists.newArrayList("test response"));
    HttpResponse response = request.execute();
    assertEquals("Incorrect response code", 200, response.getStatusCode());
    assertEquals(
        "Request header 'one' incorrect",
        "1",
        mockHttpServer.getLastRequestHeaders().get("one").get(0));
    assertEquals(
        "Request header 'two' incorrect",
        "2",
        mockHttpServer.getLastRequestHeaders().get("two").get(0));
  }

  /**
   * Tests behavior when response body is set for multiple requests.
   */
  @Test
  public void testMultipleResponseBodiesSet() throws IOException {
    HttpRequest request =
        mockHttpServer
            .getHttpTransport()
            .createRequestFactory()
            .buildGetRequest(new GenericUrl(mockHttpServer.getServerUrl()));
    String requestContent = "test request";
    request.setContent(new ByteArrayContent("text", requestContent.getBytes()));

    List<String> expectedResponses = Lists.newArrayList("test response 1", "test response 2");
    mockHttpServer.setMockResponseBodies(expectedResponses);

    for (int i = 0; i < expectedResponses.size(); i++) {
      HttpResponse response = request.execute();
      assertEquals(200, response.getStatusCode());
      assertEquals(
          "Response contents incorrect",
          expectedResponses.get(i),
          Streams.readAll(response.getContent(), response.getContentCharset()));
      assertEquals(
          "Location header incorrect on response",
          mockHttpServer.getServerUrl(),
          response.getHeaders().getLocation());
      assertFalse(
          "No gzip header passed, but request was compressed",
          mockHttpServer.wasLastRequestBodyCompressed());
      assertEquals(
          "Incorrect request contents", requestContent, mockHttpServer.getLastRequestBody());
      assertEquals(
          "Incorrect response contents", i + 1, mockHttpServer.getAllRequestBodies().size());
    }
  }
}
