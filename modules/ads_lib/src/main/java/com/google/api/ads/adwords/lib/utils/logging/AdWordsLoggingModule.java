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

import com.google.api.ads.common.lib.utils.logging.LoggingModule;

/**
 * AdWords-specific logging module.
 *
 * @author Josh Radcliff
 */
public class AdWordsLoggingModule extends LoggingModule {

  private final String reportLoggerPrefix;
  
  /**
   * Name of the report logger to use for Guice bindings. 
   */
  static final String REPORT_LOGGER_NAME = "report_download";
  
  /**
   * @param loggerPrefix Logger name prefix for general logging.
   * @param reportLoggerPrefix Logger name prefix for report-specific logging. 
   */
  public AdWordsLoggingModule(String loggerPrefix, String reportLoggerPrefix) {
    super(loggerPrefix);
    this.reportLoggerPrefix = reportLoggerPrefix;
  }

  @Override
  protected void configure() {
    super.configure();
    bind(AdWordsServiceLoggers.class);
    configureLogger(reportLoggerPrefix, REPORT_LOGGER_NAME);
    bind(ReportServiceLogger.class);
  }
}
