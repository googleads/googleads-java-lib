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

package com.google.api.ads.adwords.lib.utils.logging;

import com.google.api.ads.common.lib.utils.logging.AdsServiceLoggers;
import com.google.api.ads.common.lib.utils.logging.PrettyPrinterInterface;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import org.slf4j.Logger;

/**
 * Service logger that also provides access to additional AdWords-specific loggers.
 */
public class AdWordsServiceLoggers extends AdsServiceLoggers {

  private final ReportServiceLogger reportServiceLogger;
  private final BatchJobLogger batchJobLogger;
  
  @Inject
  public AdWordsServiceLoggers(PrettyPrinterInterface prettyPrinter,
      @Named("soapXmlLogger") Logger soapXmlLogger,
      @Named("requestInfoLogger") Logger requestInfoLogger,
      ReportServiceLogger reportServiceLogger,
      BatchJobLogger batchJobLogger) {
    super(prettyPrinter, soapXmlLogger, requestInfoLogger);
    this.reportServiceLogger = reportServiceLogger;
    this.batchJobLogger = batchJobLogger;
  }

  /**
   * Return the logger for report service interactions.
   */
  public ReportServiceLogger getReportServiceLogger() {
    return reportServiceLogger;
  }
  
  /**
   * Return the logger for {@code BatchJobService} uploads and downloads.
   */
  public BatchJobLogger getBatchJobLogger() {
    return batchJobLogger;
  }
}
