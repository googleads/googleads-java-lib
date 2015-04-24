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

package com.google.api.ads.adwords.lib.client.reporting;

import javax.annotation.Nullable;

/**
 * Additional AdWords report configuration options.
 * 
 * @author Josh Radcliff
 */
public class ReportingConfiguration {

  private Boolean isSkipReportHeader;
  private Boolean isSkipColumnHeader;
  private Boolean isSkipReportSummary;
  
  private ReportingConfiguration(){
    // Used by builder.
  }
  
  /**
   * Copy constructor.
   */
  private ReportingConfiguration(ReportingConfiguration configToClone) {
    this.isSkipReportHeader = configToClone.isSkipReportHeader;
    this.isSkipColumnHeader = configToClone.isSkipColumnHeader;
    this.isSkipReportSummary = configToClone.isSkipReportSummary;
  }
  
  /**
   * Return if report responses should skip the header row containing the
   * report name and date range.
   */
  @Nullable
  public Boolean isSkipReportHeader() {
    return isSkipReportHeader;
  }

  /**
   * Return if report responses should skip the header row containing the
   * column names.
   */
  @Nullable
  public Boolean isSkipColumnHeader() {
    return isSkipColumnHeader;
  }
  
  /**
   * Return if report responses should skip the summary row containing totals.
   */
  @Nullable
  public Boolean isSkipReportSummary() {
    return isSkipReportSummary;
  }
  
  /**
   * Validates this object for the specified version of the AdWords API.
   * @param version the version of the API to validate against, e.g., {@code v201409}.
   * 
   * @throws IllegalArgumentException if validation fails
   */
  public void validate(@Nullable String version) {
    // Currently there are no validations needed.
  }

  /**
   * Builder for {@link ReportingConfiguration} objects.
   * 
   * @author Josh Radcliff
   */
  public static class Builder {
    private ReportingConfiguration reportingConfiguration = new ReportingConfiguration();
    
    /**
     * Sets if report responses should skip the header row containing the report name and date
     * range.
     */
    public Builder skipReportHeader(Boolean isSkipReportHeader) {
      reportingConfiguration.isSkipReportHeader = isSkipReportHeader;
      return this;
    }

    /**
     * Sets if report responses should skip the header row containing the report column names.
     */
    public Builder skipColumnHeader(Boolean isSkipColumnHeader) {
      reportingConfiguration.isSkipColumnHeader = isSkipColumnHeader;
      return this;
    }
    
    /**
     * Sets if report responses should skip the summary row containing totals.
     */
    public Builder skipReportSummary(Boolean isSkipReportSummary) {
      reportingConfiguration.isSkipReportSummary = isSkipReportSummary;
      return this;
    }
    
    /**
     * Returns a new instance of {@link ReportingConfiguration} based on the attributes
     * of this builder.
     */
    public ReportingConfiguration build() {
      // Clone the configuration so that subsequent changes to this builder will not
      // affect the returned configuration.
      ReportingConfiguration configToReturn = reportingConfiguration;
      this.reportingConfiguration = new ReportingConfiguration(configToReturn);
      return configToReturn;
    }
  }
}
