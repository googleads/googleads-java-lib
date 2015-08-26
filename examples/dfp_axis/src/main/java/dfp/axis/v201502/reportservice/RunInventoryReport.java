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

package dfp.axis.v201502.reportservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201502.ReportDownloader;
import com.google.api.ads.dfp.axis.utils.v201502.StatementBuilder;
import com.google.api.ads.dfp.axis.v201502.Column;
import com.google.api.ads.dfp.axis.v201502.DateRangeType;
import com.google.api.ads.dfp.axis.v201502.Dimension;
import com.google.api.ads.dfp.axis.v201502.ExportFormat;
import com.google.api.ads.dfp.axis.v201502.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201502.ReportDownloadOptions;
import com.google.api.ads.dfp.axis.v201502.ReportJob;
import com.google.api.ads.dfp.axis.v201502.ReportQuery;
import com.google.api.ads.dfp.axis.v201502.ReportQueryAdUnitView;
import com.google.api.ads.dfp.axis.v201502.ReportServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.io.Files;
import com.google.common.io.Resources;

import java.io.File;
import java.net.URL;

/**
 * This example runs a typical daily inventory report.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class RunInventoryReport {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the ReportService.
    ReportServiceInterface reportService = dfpServices.get(session, ReportServiceInterface.class);

    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(session, NetworkServiceInterface.class);

    // Get the root ad unit ID to filter on.
    String rootAdUnitId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();

    // Create statement to filter on a parent ad unit with the root ad unit ID to include all
    // ad units in the network.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("PARENT_AD_UNIT_ID = :parentAdUnitId")
        .withBindVariableValue("parentAdUnitId", Long.parseLong(rootAdUnitId));

    // Create report query.
    ReportQuery reportQuery = new ReportQuery();
    reportQuery.setDimensions(
        new Dimension[] {Dimension.AD_UNIT_ID, Dimension.AD_UNIT_NAME});
    reportQuery.setColumns(new Column[] {Column.AD_SERVER_IMPRESSIONS,
        Column.AD_SERVER_CLICKS, Column.DYNAMIC_ALLOCATION_INVENTORY_LEVEL_IMPRESSIONS,
        Column.DYNAMIC_ALLOCATION_INVENTORY_LEVEL_CLICKS,
        Column.TOTAL_INVENTORY_LEVEL_IMPRESSIONS,
        Column.TOTAL_INVENTORY_LEVEL_CPM_AND_CPC_REVENUE});

    // Set the filter statement.
    reportQuery.setStatement(statementBuilder.toStatement());

    // Set the ad unit view to hierarchical.
    reportQuery.setAdUnitView(ReportQueryAdUnitView.HIERARCHICAL);

    // Set the dynamic date range type or a custom start and end date.
    reportQuery.setDateRangeType(DateRangeType.YESTERDAY);

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
    File file = File.createTempFile("inventory-report-", ".csv.gz");

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

    runExample(dfpServices, session);
  }
}
