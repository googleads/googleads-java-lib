// Copyright 2013 Google Inc. All Rights Reserved.
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

package dfp.axis.v201405.reportservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201405.ReportDownloader;
import com.google.api.ads.dfp.axis.v201405.Column;
import com.google.api.ads.dfp.axis.v201405.DateRangeType;
import com.google.api.ads.dfp.axis.v201405.Dimension;
import com.google.api.ads.dfp.axis.v201405.ExportFormat;
import com.google.api.ads.dfp.axis.v201405.ReportJob;
import com.google.api.ads.dfp.axis.v201405.ReportQuery;
import com.google.api.ads.dfp.axis.v201405.ReportServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.io.File;

/**
 * This example runs a report that includes a custom field. To determine which
 * custom fields exist, run GetAllCustomFields.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: ReportService.runReportJob
 *
 * @author Adam Rogal
 */
public class RunReportWithCustomFields {

  // Set the ID of the custom field to include in the report.
  private static final String CUSTOM_FIELD_ID = "INSERT_CUSTOM_FIELD_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long customFieldId)
      throws Exception {
    // Get the ReportService.
    ReportServiceInterface reportService = dfpServices.get(session, ReportServiceInterface.class);

    // Create report query.
    ReportQuery reportQuery = new ReportQuery();
    reportQuery.setDimensions(new Dimension[] {Dimension.DATE, Dimension.LINE_ITEM_ID});
    reportQuery.setColumns(new Column[] {Column.AD_SERVER_IMPRESSIONS});

    // Set the dynamic date range type or a custom start and end date.
    reportQuery.setDateRangeType(DateRangeType.LAST_MONTH);

    // Set the custom field IDs.
    reportQuery.setCustomFieldIds(new long[] {customFieldId});

    // Create report job.
    ReportJob reportJob = new ReportJob();
    reportJob.setReportQuery(reportQuery);

    // Run report job.
    reportJob = reportService.runReportJob(reportJob);

    // Create report downloader.
    ReportDownloader reportDownloader = new ReportDownloader(reportService, reportJob.getId());

    // Wait for the report to be ready.
    reportDownloader.waitForReportReady();

    // Change to your file location.
    String filePath = File.createTempFile("custom-field-report-", ".csv.gz").toString();

    System.out.printf("Downloading report to %s ...", filePath);

    // Download the report.
    reportDownloader.downloadReport(ExportFormat.CSV_DUMP, filePath);

    System.out.println("done.");
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session, Long.parseLong(CUSTOM_FIELD_ID));
  }
}
