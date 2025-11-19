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

import static java.nio.charset.StandardCharsets.UTF_8;

import com.google.common.collect.Lists;
import com.google.common.io.ByteSink;
import com.google.common.io.ByteSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

/** HTTP server used to verify requests and send mocked responses. */
public class TestHttpServer {

  private InternalHttpServer server;

  /** Default constructor. */
  public TestHttpServer() {}

  /**
   * Starts the HTTP server.
   *
   * @throws Exception an arbitrary exception may be thrown
   */
  public void start() throws Exception {
    server = new InternalHttpServer(TestPortFinder.getInstance().checkOutUnusedPort());
    server.start();
  }

  /**
   * Stops the HTTP server.
   *
   * @throws InterruptedException Stopping a lifecycle is rarely atomic and may be interrupted by
   *     another thread. If this happens InterruptedException is throw and the component will be in
   *     an indeterminant state and should probably be discarded.
   */
  public void stop() throws Exception {
    TestPortFinder.getInstance().releaseUnusedPort(server.port);
    server.stop();
  }

  /**
   * Gets the body of the last request made to the server. This will be the inflated body if the
   * last request was compressed.
   */
  public String getLastRequestBody() {
    return server.getLastRequestBody();
  }

  /** Gets if the body of the last request made to the server was compressed. */
  public boolean wasLastRequestBodyCompressed() {
    return server.wasLastRequestBodyCompressed();
  }

  /** Gets the body of the all requests made to the server, in order from oldest to newest. */
  public List<String> getAllRequestBodies() {
    return Lists.newArrayList(server.requestBodies);
  }

  /**
   * Gets the authorization header of the last request made to the server or {@code null} if none.
   */
  public String getLastAuthorizationHttpHeader() {
    return server.getLastAuthorizationHttpHeader();
  }

  /**
   * Gets the authorization headers of the all request made to the server, in order from oldest to
   * newest. If a request did not contain an authorization header, its index contains {@code null}.
   */
  public List<String> getAllAuthorizationHttpHeaders() {
    return Lists.newArrayList(server.authorizationHttpHeaders);
  }

  /** Sets the response body to return on the next request. */
  public void setMockResponseBody(String mockResponseBody) {
    setMockResponseBodies(Lists.newArrayList(mockResponseBody));
  }

  /** Sets the response bodies to return on subsequent requests. */
  public void setMockResponseBodies(List<String> mockResponseBodies) {
    server.mockResponseBodies.clear();
    server.mockResponseBodies.addAll(mockResponseBodies);
  }

  /** Sets the delay in milliseconds before the server responds. */
  public void setDelay(long delay) {
    server.delay = delay;
  }

  /** Gets the server URL with port. */
  public String getServerUrl() {
    return server.getServerUrl();
  }

  /** Jetty implementation of an HTTP server. */
  private class InternalHttpServer extends Server {

    private final int port;
    private int numInteractions = 0;
    private long delay = 0;
    private final Deque<String> requestBodies = Lists.newLinkedList();
    private final Deque<Boolean> requestBodiesCompressionStates = Lists.newLinkedList();
    private final Deque<String> authorizationHttpHeaders = Lists.newLinkedList();
    private final List<String> mockResponseBodies = Lists.newArrayList();

    /**
     * Default constructor.
     *
     * @throws IOException if port could not be set
     */
    public InternalHttpServer(int port) throws IOException {
      super(port);
      this.port = port;

      setHandler(
          new AbstractHandler() {
            @Override
            public void handle(
                String target,
                Request baseRequest,
                HttpServletRequest request,
                HttpServletResponse response)
                throws IOException, ServletException {

              authorizationHttpHeaders.add(request.getHeader("Authorization"));

              // Read the raw bytes from the request.
              final byte[] rawRequestBytes =
                  new ByteSource() {
                    @Override
                    public InputStream openStream() throws IOException {
                      return request.getInputStream();
                    }
                  }.read();

              // Inflate the raw bytes if they are in gzip format.
              boolean isGzipFormat =
                  Objects.equals(request.getHeader(HttpHeader.CONTENT_ENCODING.asString()), "gzip");

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
              requestBodies.add(
                  ByteSource.wrap(requestBytes).asCharSource(UTF_8).read());
              requestBodiesCompressionStates.add(isGzipFormat);

              // Simulate a delay in processing.
              simulateDelay();

              if (numInteractions < mockResponseBodies.size()) {
                String responseContent = mockResponseBodies.get(numInteractions++);
                new ByteSink() {
                  @Override
                  public OutputStream openStream() {
                    try {
                      return response.getOutputStream();
                    } catch (IOException e) {
                      throw new RuntimeException(e);
                    }
                  }
                }.asCharSink(UTF_8).write(responseContent);
              } else {
                response.sendError(500, "error: no mockResponseBodies");
              }

              baseRequest.setHandled(true);
            }
          });
    }

    /** Gets the server URL with port. */
    public String getServerUrl() {
      return String.format("http://localhost:%s", port);
    }

    /** Simulates delays in processing requests. */
    private void simulateDelay() throws IOException {
      try {
        Thread.sleep(this.delay);
      } catch (InterruptedException e) {
        throw new IOException(e.getMessage());
      }
    }

    /**
     * Gets the body of the last request made to the server.
     */
    private String getLastRequestBody() {
      return requestBodies.getLast();
    }

    /**
     * Returns if the last request body was compressed.
     */
    private boolean wasLastRequestBodyCompressed() {
      return requestBodiesCompressionStates.getLast();
    }

    /**
     * Gets the authorization header of the last request made to the server or
     * {@code null} if none.
     */
    private String getLastAuthorizationHttpHeader() {
      return authorizationHttpHeaders.getLast();
    }
  }
}
