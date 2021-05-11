// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils.logging;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.utils.BatchJobMutateResponseInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobMutateResultInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadResponse;
import com.google.api.ads.common.lib.client.RemoteCallReturn;
import com.google.api.ads.common.lib.client.RequestInfo;
import com.google.api.ads.common.lib.client.ResponseInfo;
import com.google.api.ads.common.lib.utils.logging.RemoteCallLoggerDelegate;
import com.google.api.client.http.HttpStatusCodes;
import com.google.common.io.CharSource;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/** Tests for {@link BatchJobLogger}. Parameterized based on the request's success or failure. */
@RunWith(Parameterized.class)
public class BatchJobLoggerTest {
  private BatchJobLogger batchJobLogger;
  private String url;
  private Exception exception;
  private int statusCode;
  private String statusMessage;

  @Mock private RemoteCallLoggerDelegate loggerDelegate;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    batchJobLogger = new BatchJobLogger(loggerDelegate);
    url = "http://www.example.com/batchinteraction";
  }

  public BatchJobLoggerTest(int statusCode, String statusMessage, @Nullable Exception exception) {
    this.statusCode = statusCode;
    this.statusMessage = statusMessage;
    this.exception = exception;
  }

  @Parameters(name = "statusCode={0}, statusMessage={1}, exception={2}")
  public static List<Object[]> parameters() {
    return Arrays.<Object[]>asList(
        new Object[] {HttpStatusCodes.STATUS_CODE_OK, "OK", null},
        new Object[] {
          HttpStatusCodes.STATUS_CODE_FORBIDDEN, "forbidden", new IOException("Failed request")
        });
  }

  /** Confirms an upload is logged as expected. */
  @Test
  public void testLogUpload() throws IOException {
    String contentsString = "some contents";
    InputStream responseContent = CharSource.wrap(contentsString).asByteSource(UTF_8).openStream();
    BatchJobUploadResponse response =
        new BatchJobUploadResponse(
            responseContent, statusCode, statusMessage, contentsString.length(), URI.create(url));
    ArgumentCaptor<RemoteCallReturn> returnCaptor = ArgumentCaptor.forClass(RemoteCallReturn.class);
    batchJobLogger.logUpload(contentsString, URI.create(url), response, exception);
    verify(loggerDelegate).logRequestSummary(returnCaptor.capture());
    RemoteCallReturn capturedReturn = returnCaptor.getValue();
    assertEquals(exception, capturedReturn.getException());

    RequestInfo requestInfo = capturedReturn.getRequestInfo();
    assertEquals(url, requestInfo.getUrl());
    assertEquals("clientCustomerId", requestInfo.getContextName());
    assertNull(requestInfo.getContextValue());
    assertThat(requestInfo.getPayload(), containsString(contentsString));
    assertThat(requestInfo.getServiceName(), containsString("upload"));

    ResponseInfo responseInfo = capturedReturn.getResponseInfo();
    assertNull(responseInfo.getRequestId());
    assertThat(responseInfo.getPayload(), startsWith(String.valueOf(response.getHttpStatus())));
    assertThat(responseInfo.getPayload(), containsString(response.getHttpResponseMessage()));

    verify(loggerDelegate).logRequestDetails(returnCaptor.capture());
    assertSame(
        "The same RemoteCallReturn object was not passed to request details and request summary",
        capturedReturn,
        returnCaptor.getValue());
  }

  /**
   * Confirms that passing {@code null} to {@code logUpload} for parameters marked {@code Nullable}
   * does not result in any exceptions.
   */
  @Test
  public void testLogUpload_nullablesNull() {
    String contentsString = "success contents";

    ArgumentCaptor<RemoteCallReturn> returnCaptor = ArgumentCaptor.forClass(RemoteCallReturn.class);
    batchJobLogger.logUpload(contentsString, URI.create(url), null, null);
    verify(loggerDelegate).logRequestSummary(returnCaptor.capture());
    RemoteCallReturn capturedReturn = returnCaptor.getValue();
    assertNull(capturedReturn.getException());
    verify(loggerDelegate).logRequestDetails(returnCaptor.capture());
    assertSame(
        "The same RemoteCallReturn object was not passed to request details and request summary",
        capturedReturn,
        returnCaptor.getValue());
  }

  /** Confirms a download is logged as expected. */
  @SuppressWarnings("unchecked")
  @Test
  public void testLogDownload() {
    BatchJobMutateResponseInterface<
            String, IllegalArgumentException,
            BatchJobMutateResultInterface<String, IllegalArgumentException>>
        response = Mockito.mock(BatchJobMutateResponseInterface.class);
    @SuppressWarnings("rawtypes") // Cannot specify generic args for mocks
    BatchJobMutateResultInterface[] mutateResults =
        new BatchJobMutateResultInterface[] {
          Mockito.mock(BatchJobMutateResultInterface.class),
          Mockito.mock(BatchJobMutateResultInterface.class)
        };
    when(response.getMutateResults()).thenReturn(mutateResults);
    batchJobLogger.logDownload(url, response, exception);
    ArgumentCaptor<RemoteCallReturn> returnCaptor = ArgumentCaptor.forClass(RemoteCallReturn.class);
    verify(loggerDelegate).logRequestSummary(returnCaptor.capture());
    RemoteCallReturn capturedReturn = returnCaptor.getValue();
    assertEquals(exception, capturedReturn.getException());

    RequestInfo requestInfo = capturedReturn.getRequestInfo();
    assertEquals(url, requestInfo.getUrl());
    assertEquals("clientCustomerId", requestInfo.getContextName());
    assertNull(requestInfo.getContextValue());
    assertNull(requestInfo.getPayload());
    assertThat(requestInfo.getServiceName(), containsString("download"));

    ResponseInfo responseInfo = capturedReturn.getResponseInfo();
    assertNull(responseInfo.getRequestId());
    assertEquals("Results count: 2", responseInfo.getPayload());

    verify(loggerDelegate).logRequestDetails(returnCaptor.capture());
    assertSame(
        "The same RemoteCallReturn object was not passed to request details and request summary",
        capturedReturn,
        returnCaptor.getValue());
  }

  /**
   * Confirms that passing {@code null} to {@code logUpload} for parameters marked {@code Nullable}
   * does not result in any exceptions.
   */
  @Test
  public void testLogDownload_nullablesNull() {
    batchJobLogger.logDownload(url, null, null);
    ArgumentCaptor<RemoteCallReturn> returnCaptor = ArgumentCaptor.forClass(RemoteCallReturn.class);
    verify(loggerDelegate).logRequestSummary(returnCaptor.capture());
    RemoteCallReturn capturedReturn = returnCaptor.getValue();

    assertNull(capturedReturn.getException());
    ResponseInfo responseInfo = capturedReturn.getResponseInfo();
    assertEquals("Results count: 0", responseInfo.getPayload());

    verify(loggerDelegate).logRequestDetails(returnCaptor.capture());
    assertSame(
        "The same RemoteCallReturn object was not passed to request details and request summary",
        capturedReturn,
        returnCaptor.getValue());
  }
}
