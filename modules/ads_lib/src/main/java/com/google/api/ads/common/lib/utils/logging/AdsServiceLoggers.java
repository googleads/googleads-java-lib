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

import com.google.api.ads.common.lib.client.RemoteCallReturn;
import com.google.api.ads.common.lib.utils.logging.RemoteCallLoggerDelegate.RemoteCallType;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Allows logging of outgoing and incoming SOAP XML messages as API calls are executed. */
public class AdsServiceLoggers {

  /** The client library logger. */
  public static final Logger ADS_API_LIB_LOG =
      LoggerFactory.getLogger(AdsServiceLoggers.class.getName() + ".ads_api_lib");

  private final RemoteCallLoggerDelegate loggerDelegate;

  /**
   * Constructor.
   *
   * @param prettyPrinter an object capable of pretty printing XML messages
   * @param soapXmlLogger the SOAP XML logger
   * @param requestInfoLogger the request info logger
   */
  @Inject
  private AdsServiceLoggers(
      PrettyPrinterInterface prettyPrinter,
      @Named("soapXmlLogger") Logger soapXmlLogger,
      @Named("requestInfoLogger") Logger requestInfoLogger) {
    this(
        new RemoteCallLoggerDelegate(
            requestInfoLogger, soapXmlLogger, prettyPrinter, RemoteCallType.SOAP));
  }

  AdsServiceLoggers(RemoteCallLoggerDelegate loggerDelegate) {
    this.loggerDelegate = loggerDelegate;
  }

  /**
   * Logs basic information on a SOAP request.
   *
   * @param remoteCallReturn information on the SOAP call to be logged
   */
  public void logRequest(RemoteCallReturn remoteCallReturn) {
    loggerDelegate.logRequestSummary(remoteCallReturn);
    loggerDelegate.logRequestDetails(remoteCallReturn);
  }
}
