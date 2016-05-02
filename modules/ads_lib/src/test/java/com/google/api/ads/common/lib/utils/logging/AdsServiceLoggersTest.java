// Copyright 2011, Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.utils.logging;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.soap.RequestInfo;
import com.google.api.ads.common.lib.soap.ResponseInfo;
import com.google.api.ads.common.lib.soap.SoapCallReturn;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

/**
 * Test for the {@link AdsServiceLoggers} class.
 */
@RunWith(JUnit4.class)
public class AdsServiceLoggersTest {

  private AdsServiceLoggers adsServiceLoggers;

  @Mock private Logger soapXmlLogger;
  @Mock private Logger requestInfoLogger;
  @Mock private PrettyPrinterInterface prettyPrinter;
  @Mock private SoapCallReturn soapCallReturn;
  @Mock private RequestInfo requestInfo;
  @Mock private ResponseInfo responseInfo;

  public AdsServiceLoggersTest() {}

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    adsServiceLoggers = new AdsServiceLoggers(prettyPrinter, soapXmlLogger, requestInfoLogger);
  }


  @Test
  public void testLogRequest() {
    String service = "test service";
    String method = "test method";
    String url = "http://www.example.com";
    String requestId = "123456";
    
    when(soapCallReturn.getRequestInfo()).thenReturn(requestInfo);
    when(requestInfo.getServiceName()).thenReturn(service);
    when(requestInfo.getMethodName()).thenReturn(method);
    when(requestInfo.getUrl()).thenReturn(url);
    when(soapCallReturn.getResponseInfo()).thenReturn(responseInfo);
    when(responseInfo.getRequestId()).thenReturn(requestId);

    adsServiceLoggers.logRequest(soapCallReturn);

    verify(requestInfoLogger).info(
        eq("Request made: Service: \"{}\" Method: \"{}\" URL: \"{}\" Request ID: \"{}\""),
        eq(service), eq(method), eq(url), eq(requestId));
  }

  @Test
  public void testLogSoapXml_InfoLevel() {
    String requestXml = "<request>xml</request>";
    String responseXml = "<response>xml</response>";
    String prettyRequest = "<request>\n  xml\n</request>";
    String prettyResponse = "<response>\n  xml\n</response>";

    when(soapCallReturn.getRequestInfo()).thenReturn(requestInfo);
    when(soapCallReturn.getResponseInfo()).thenReturn(responseInfo);
    when(soapXmlLogger.isInfoEnabled()).thenReturn(true);
    when(requestInfo.getSoapRequestXml()).thenReturn(requestXml);
    when(prettyPrinter.prettyPrint(requestXml)).thenReturn(prettyRequest);
    when(responseInfo.getSoapResponseXml()).thenReturn(responseXml);
    when(prettyPrinter.prettyPrint(responseXml)).thenReturn(prettyResponse);

    adsServiceLoggers.logSoapXml(soapCallReturn);

    verify(soapXmlLogger).info("SOAP Request:\n" + prettyRequest);
    verify(soapXmlLogger).info("SOAP Response:\n" + prettyResponse);
  }

  @Test
  public void testLogSoapXml_WarnLevelWithException() {
    Throwable returnedException = new Throwable();

    String requestXml = "<request>xml</request>";
    String responseXml = "<response>xml</response>";
    String prettyRequest = "<request>\n  xml\n</request>";
    String prettyResponse = "<response>\n  xml\n</response>";

    when(soapCallReturn.getRequestInfo()).thenReturn(requestInfo);
    when(soapCallReturn.getResponseInfo()).thenReturn(responseInfo);
    when(soapXmlLogger.isInfoEnabled()).thenReturn(false);
    when(soapXmlLogger.isWarnEnabled()).thenReturn(true);
    when(soapCallReturn.getException()).thenReturn(returnedException);
    when(requestInfo.getSoapRequestXml()).thenReturn(requestXml);
    when(prettyPrinter.prettyPrint(requestXml)).thenReturn(prettyRequest);
    when(responseInfo.getSoapResponseXml()).thenReturn(responseXml);
    when(prettyPrinter.prettyPrint(responseXml)).thenReturn(prettyResponse);
    when(soapCallReturn.getException()).thenReturn(returnedException);

    adsServiceLoggers.logSoapXml(soapCallReturn);

    verify(soapXmlLogger).warn("SOAP Request:\n" + prettyRequest);
    verify(soapXmlLogger).warn("SOAP Response:\n" + prettyResponse);
  }

  @Test
  public void testLogSoapXml_WarnLevelNoException() {
    when(soapCallReturn.getRequestInfo()).thenReturn(requestInfo);
    when(soapCallReturn.getResponseInfo()).thenReturn(responseInfo);
    when(soapXmlLogger.isInfoEnabled()).thenReturn(false);
    when(soapXmlLogger.isWarnEnabled()).thenReturn(false);

    adsServiceLoggers.logSoapXml(soapCallReturn);

    verify(soapXmlLogger, times(0)).info(any(String.class));
    verify(soapXmlLogger, times(0)).warn(any(String.class));
  }
}
