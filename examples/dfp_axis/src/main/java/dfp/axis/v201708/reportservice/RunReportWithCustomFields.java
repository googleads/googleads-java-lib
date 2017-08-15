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

package dfp.axis.v201708.reportservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.ReportDownloader;
import com.google.api.ads.dfp.axis.v201708.Column;
import com.google.api.ads.dfp.axis.v201708.DateRangeType;
import com.google.api.ads.dfp.axis.v201708.Dimension;
import com.google.api.ads.dfp.axis.v201708.ExportFormat;
import com.google.api.ads.dfp.axis.v201708.ReportDownloadOptions;
import com.google.api.ads.dfp.axis.v201708.ReportJob;
import com.google.api.ads.dfp.axis.v201708.ReportQuery;
import com.google.api.ads.dfp.axis.v201708.ReportServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import java.io.File;
import java.net.URL;

/**
 * This example runs a report that includes a custom field. To determine which
 * custom fields exist, run GetAllCustomFields.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class RunReportWithCustomFields {

  private static class RunReportWithCustomFieldsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CUSTOM_FIELD_ID, required = true,
        description = "The ID of the custom field to include in the report.")
    private Long customFieldId;
  }

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
    File file = File.createTempFile("custom-field-report-", ".csv.gz");

    System.out.printf("Downloading report to %s ...", file.toString());

    // Download the report.
    ReportDownloadOptions options = new ReportDownloadOptions();
    options.setExportFormat(ExportFormat.CSV_DUMP);
    options.setUseGzipCompression(true);
    URL url = reportDownloader.getDownloadUrl(options);
    Resources.asByteSource(url).copyTo(Files.asByteSink(file));

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

    RunReportWithCustomFieldsParams params = new RunReportWithCustomFieldsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customFieldId = Long.parseLong("INSERT_CUSTOM_FIELD_ID_HERE");
    }

    runExample(dfpServices, session, params.customFieldId);
  }
}
