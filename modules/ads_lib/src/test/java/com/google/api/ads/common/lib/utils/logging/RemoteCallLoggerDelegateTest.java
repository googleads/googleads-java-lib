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

package com.google.api.ads.common.lib.utils.logging;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.client.RemoteCallReturn;
import com.google.api.ads.common.lib.client.RequestInfo;
import com.google.api.ads.common.lib.client.ResponseInfo;
import com.google.api.ads.common.lib.utils.logging.RemoteCallLoggerDelegate.RemoteCallType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

@RunWith(JUnit4.class)
public class RemoteCallLoggerDelegateTest {

  @Mock private Logger soapXmlLogger;
  @Mock private Logger requestInfoLogger;
  @Mock private PrettyPrinterInterface prettyPrinter;

  private RemoteCallReturn remoteCallReturn;
  private String requestXml = "<request>xml</request>";
  private String responseXml = "<response>xml</response>";
  private String prettyRequest = "<request>\n  xml\n</request>";
  private String prettyResponse = "<response>\n  xml\n</response>";
  private RemoteCallLoggerDelegate loggerDelegate;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    loggerDelegate =
        new RemoteCallLoggerDelegate(
            requestInfoLogger, soapXmlLogger, prettyPrinter, RemoteCallType.SOAP);
    RequestInfo requestInfo =
        new RequestInfo.Builder()
            .withContext("clientCustomerId", "555-555-0000")
            .withServiceName("test service")
            .withMethodName("test method")
            .withUrl("http://www.example.com")
            .withPayload(requestXml)
            .build();
    ResponseInfo responseInfo =
        new ResponseInfo.Builder()
            .withRequestId("abc123def456")
            .withOperationsCount(1_234L)
            .withResponseTimeMillis(543_210L)
            .withPayload(responseXml)
            .build();
    remoteCallReturn =
        new RemoteCallReturn.Builder()
            .withException(null)
            .withRequestInfo(requestInfo)
            .withResponseInfo(responseInfo)
            .withReturnValue("some object")
            .build();

    when(prettyPrinter.prettyPrint(requestXml)).thenReturn(prettyRequest);
    when(prettyPrinter.prettyPrint(responseXml)).thenReturn(prettyResponse);
  }

  @Test
  public void testLogRequestSummary_success() {
    // Set up the request info mock.
    when(requestInfoLogger.isInfoEnabled()).thenReturn(true);

    loggerDelegate.logRequestSummary(remoteCallReturn);

    RequestInfo requestInfo = remoteCallReturn.getRequestInfo();
    ResponseInfo responseInfo = remoteCallReturn.getResponseInfo();

    verify(requestInfoLogger)
        .info(
            RemoteCallLoggerDelegate.SUMMARY_TEMPLATE,
            requestInfo.getServiceName(),
            requestInfo.getMethodName(),
            requestInfo.getContextName(),
            requestInfo.getContextValue(),
            requestInfo.getUrl(),
            responseInfo.getRequestId(),
            responseInfo.getResponseTime(),
            responseInfo.getOperationsCount(),
            false,
            null);
  }

  @Test
  public void testLogRequestSummary_failure() {
    Throwable returnedException = new Throwable();

    remoteCallReturn =
        new RemoteCallReturn.Builder()
            .withRequestInfo(remoteCallReturn.getRequestInfo())
            .withResponseInfo(remoteCallReturn.getResponseInfo())
            .withException(returnedException)
            .build();

    when(requestInfoLogger.isWarnEnabled()).thenReturn(true);

    loggerDelegate.logRequestSummary(remoteCallReturn);

    RequestInfo requestInfo = remoteCallReturn.getRequestInfo();
    ResponseInfo responseInfo = remoteCallReturn.getResponseInfo();

    verify(requestInfoLogger)
        .warn(
            RemoteCallLoggerDelegate.SUMMARY_TEMPLATE,
            requestInfo.getServiceName(),
            requestInfo.getMethodName(),
            requestInfo.getContextName(),
            requestInfo.getContextValue(),
            requestInfo.getUrl(),
            responseInfo.getRequestId(),
            responseInfo.getResponseTime(),
            responseInfo.getOperationsCount(),
            true,
            returnedException.toString());
  }

  @Test
  public void testLogRequestDetails_success_debugLevelEnabled() {
    when(soapXmlLogger.isDebugEnabled()).thenReturn(true);

    loggerDelegate.logRequestDetails(remoteCallReturn);

    verify(soapXmlLogger)
        .debug(
            RemoteCallLoggerDelegate.DETAILS_REQUEST_TEMPLATE, RemoteCallType.SOAP, prettyRequest);
    verify(soapXmlLogger)
        .debug(
            RemoteCallLoggerDelegate.DETAILS_RESPONSE_TEMPLATE,
            RemoteCallType.SOAP,
            prettyResponse);
  }

  @Test
  public void testLogRequestDetails_success_infoLevelDisabled() {
    when(soapXmlLogger.isInfoEnabled()).thenReturn(false);
    when(soapXmlLogger.isWarnEnabled()).thenReturn(false);

    loggerDelegate.logRequestDetails(remoteCallReturn);

    verify(soapXmlLogger, times(0)).info(any(String.class));
    verify(soapXmlLogger, times(0)).warn(any(String.class));
  }

  @Test
  public void testLogRequestDetails_failure_infoLevelEnabled() {
    Throwable returnedException = new Throwable();

    remoteCallReturn =
        new RemoteCallReturn.Builder()
            .withRequestInfo(remoteCallReturn.getRequestInfo())
            .withResponseInfo(remoteCallReturn.getResponseInfo())
            .withException(returnedException)
            .build();
    when(soapXmlLogger.isInfoEnabled()).thenReturn(true);
    when(soapXmlLogger.isWarnEnabled()).thenReturn(true);

    loggerDelegate.logRequestDetails(remoteCallReturn);

    verify(soapXmlLogger)
        .info(
            RemoteCallLoggerDelegate.DETAILS_REQUEST_TEMPLATE, RemoteCallType.SOAP, prettyRequest);
    verify(soapXmlLogger)
        .info(
            RemoteCallLoggerDelegate.DETAILS_RESPONSE_TEMPLATE,
            RemoteCallType.SOAP,
            prettyResponse);
  }

  @Test
  public void testTruncateThrowable_lessThanMaxLength() {
    Throwable t = Mockito.mock(Throwable.class);
    String toString = "1234567890";
    when(t.toString()).thenReturn(toString);
    assertEquals(
        "truncateThrowable should not truncate when length < maxLength",
        toString,
        // Use maxLength > length of toString
        loggerDelegate.truncateThrowable(t, 11));
  }

  @Test
  public void testTruncateThrowable_equalsMaxLength() {
    Throwable t = Mockito.mock(Throwable.class);
    String toString = "1234567890";
    when(t.toString()).thenReturn(toString);
    assertEquals(
        "truncateThrowable should not truncate when length == maxLength",
        toString,
        // Use maxLength == length of toString
        loggerDelegate.truncateThrowable(t, 10));
  }

  @Test
  public void testTruncateThrowable_exceedsMaxLength() {
    Throwable t = Mockito.mock(Throwable.class);
    String toString = "1234567890";
    when(t.toString()).thenReturn(toString);
    assertEquals(
        "truncateThrowable should truncate when length > maxLength",
        "123456...",
        // Use maxLength < length of toString
        loggerDelegate.truncateThrowable(t, 9));
  }
  
  @Test
  public void testTruncateThrowable_trimsNewLines() {
    Throwable t = Mockito.mock(Throwable.class);
    String toString = String.format("lineA%nlineB%nlineC%n");
    when(t.toString()).thenReturn(toString);
    assertEquals(
        "truncateThrowable should remove all new lines",
        "lineAlineBlineC",
        loggerDelegate.truncateThrowable(t, 15));
  }
  
  @Test
  public void testTruncateThrowable_ignoresNewLinesWhenTrimming() {
    Throwable t = Mockito.mock(Throwable.class);
    String toString = String.format("123%n456%n789%n0");
    when(t.toString()).thenReturn(toString);
    assertEquals(
        "truncateThrowable should ignore new lines when trimming",
        "123456...",
        loggerDelegate.truncateThrowable(t, 9));
  }
}
