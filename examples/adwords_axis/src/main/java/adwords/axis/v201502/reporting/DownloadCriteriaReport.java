// Copyright 2015 Google Inc. All Rights Reserved.
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

package adwords.axis.v201502.reporting;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.client.reporting.ReportingConfiguration;
import com.google.api.ads.adwords.lib.jaxb.v201502.DownloadFormat;
import com.google.api.ads.adwords.lib.jaxb.v201502.ReportDefinition;
import com.google.api.ads.adwords.lib.jaxb.v201502.ReportDefinitionDateRangeType;
import com.google.api.ads.adwords.lib.jaxb.v201502.ReportDefinitionReportType;
import com.google.api.ads.adwords.lib.jaxb.v201502.Selector;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponse;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponseException;
import com.google.api.ads.adwords.lib.utils.v201502.ReportDownloader;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;

import java.io.File;

/**
 * This example downloads a criteria performance report.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class DownloadCriteriaReport {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    // Location to download report to.
    String reportFile = System.getProperty("user.home") + File.separatorChar + "report.csv";

    runExample(session, reportFile);
  }

  public static void runExample(AdWordsSession session, String reportFile) throws Exception {
    // Create selector.
    Selector selector = new Selector();
    selector.getFields().addAll(Lists.newArrayList("CampaignId",
        "AdGroupId",
        "Id",
        "CriteriaType",
        "Criteria",
        "FinalUrls",
        "Impressions",
        "Clicks",
        "Cost"));

    // Create report definition.
    ReportDefinition reportDefinition = new ReportDefinition();
    reportDefinition.setReportName("Criteria performance report #" + System.currentTimeMillis());
    reportDefinition.setDateRangeType(ReportDefinitionDateRangeType.YESTERDAY);
    reportDefinition.setReportType(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT);
    reportDefinition.setDownloadFormat(DownloadFormat.CSV);
    // Enable to allow rows with zero impressions to show.
    reportDefinition.setIncludeZeroImpressions(false);
    
    // Optional: Set the reporting configuration of the session to suppress header, column name, or
    // summary rows in the report output. You can also configure this via your ads.properties
    // configuration file. See AdWordsSession.Builder.from(Configuration) for details.
    ReportingConfiguration reportingConfiguration = new ReportingConfiguration.Builder()
        .skipReportHeader(false)
        .skipColumnHeader(false)
        .skipReportSummary(false)
        .build();
    session.setReportingConfiguration(reportingConfiguration);
    
    reportDefinition.setSelector(selector);

    try {
      // Set the property api.adwords.reportDownloadTimeout or call
      // ReportDownloader.setReportDownloadTimeout to set a timeout (in milliseconds)
      // for CONNECT and READ in report downloads.
      ReportDownloadResponse response =
          new ReportDownloader(session).downloadReport(reportDefinition);
      response.saveToFile(reportFile);
      
      System.out.printf("Report successfully downloaded to: %s%n", reportFile);
    } catch (ReportDownloadResponseException e) {
      System.out.printf("Report was not downloaded due to: %s%n", e);
    }
  }
}
