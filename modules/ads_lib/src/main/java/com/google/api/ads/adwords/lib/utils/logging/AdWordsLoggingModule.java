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
 */
public class AdWordsLoggingModule extends LoggingModule {

  private final String reportLoggerPrefix;
  private final String batchJobLoggerPrefix;
  
  /**
   * Name of the report logger to use for Guice bindings. 
   */
  static final String REPORT_LOGGER_NAME = "report_download";
  
  /**
   * Name of the batch job upload/download logger (for Guice bindings).
   */
  static final String BATCH_JOB_LOGGER_NAME = "batch_job";
  
  /**
   * @param loggerPrefix Logger name prefix for general logging.
   * @param reportLoggerPrefix Logger name prefix for report-specific logging.
   * @param batchJobLoggerPrefix Logger name prefix for batch job-specific logging.  
   */
  public AdWordsLoggingModule(String loggerPrefix, String reportLoggerPrefix,
      String batchJobLoggerPrefix) {
    super(loggerPrefix);
    this.reportLoggerPrefix = reportLoggerPrefix;
    this.batchJobLoggerPrefix = batchJobLoggerPrefix;
  }

  @Override
  protected void configure() {
    super.configure();
    bind(AdWordsServiceLoggers.class);
    configureLogger(reportLoggerPrefix, REPORT_LOGGER_NAME);
    configureLogger(batchJobLoggerPrefix, BATCH_JOB_LOGGER_NAME);
    bind(ReportServiceLogger.class);
  }
}
