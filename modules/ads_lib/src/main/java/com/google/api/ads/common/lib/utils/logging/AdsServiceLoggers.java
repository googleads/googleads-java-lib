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

import com.google.api.ads.common.lib.soap.RequestInfo;
import com.google.api.ads.common.lib.soap.ResponseInfo;
import com.google.api.ads.common.lib.soap.SoapCallReturn;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The class {@code AdsServiceLogger} allows logging of outgoing and
 * incoming SOAP XML messages as API calls are executed.
 *
 * @author Adam Rogal
 * @author Joseph DiLallo
 */
public class AdsServiceLoggers {

  /** The client library logger. */
  public static final Logger ADS_API_LIB_LOG =
      LoggerFactory.getLogger(AdsServiceLoggers.class.getName() + ".ads_api_lib");
  private final PrettyPrinterInterface prettyPrinter;

  private final Logger soapXmlLogger;
  private final Logger requestInfoLogger;

  /**
   * Constructor.
   *
   * @param prettyPrinter an object capable of pretty printing XML messages
   * @param soapXmlLogger the SOAP XML logger
   * @param requestInfoLogger the request info logger
   */
  @Inject
  protected AdsServiceLoggers(PrettyPrinterInterface prettyPrinter,
      @Named("soapXmlLogger") Logger soapXmlLogger,
      @Named("requestInfoLogger") Logger requestInfoLogger) {
    this.prettyPrinter = prettyPrinter;
    this.soapXmlLogger = soapXmlLogger;
    this.requestInfoLogger = requestInfoLogger;
  }

  /**
   * Gets the client library info logger.
   *
   * @return the request info logger
   */
  public Logger getLibLogger() {
    return ADS_API_LIB_LOG;
  }

  /**
   * Logs the XML messages from a given SOAP interaction.
   *
   * @param soapCallReturn information on the SOAP call to be logged
   */
  public void logSoapXml(SoapCallReturn soapCallReturn) {
    RequestInfo request = soapCallReturn.getRequestInfo();
    ResponseInfo response = soapCallReturn.getResponseInfo();
    if (soapXmlLogger.isInfoEnabled() ||
        (soapXmlLogger.isWarnEnabled() && soapCallReturn.getException() != null)) {
      String prettyRequest = "SOAP Request:\n" +
          prettyPrinter.prettyPrint(request.getSoapRequestXml());
      String prettyResponse = "SOAP Response:\n" +
          prettyPrinter.prettyPrint(response.getSoapResponseXml());
      if (soapCallReturn.getException() == null) {
        soapXmlLogger.info(prettyRequest);
        soapXmlLogger.info(prettyResponse);
      } else {
        soapXmlLogger.warn(prettyRequest);
        soapXmlLogger.warn(prettyResponse);
      }
    }
  }

  /**
   * Logs basic information on a SOAP request.
   *
   * @param soapCallReturn information on the SOAP call to be logged
   */
  public void logRequest(SoapCallReturn soapCallReturn) {
    RequestInfo request = soapCallReturn.getRequestInfo();
    requestInfoLogger.info("Request made: Service: \"{}\" Method: \"{}\" URL: \"{}\"",
        new Object[] {request.getServiceName(), request.getMethodName(), request.getUrl()});
  }
}
