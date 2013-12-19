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

package dfa.axis.v1_20;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_20.ReportInfo;
import com.google.api.ads.dfa.axis.v1_20.ReportRemote;
import com.google.api.ads.dfa.axis.v1_20.ReportRequest;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example fetches information about a report, including its status
 * (pending, running, complete, etc.) and a URL where it can be downloaded if
 * completed. To get a report ID, run RunDeferredReport.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: report.getReport
 *
 * @author Joseph DiLallo
 */
public class GetReport {

  // Provide the ID of the report to fetch.
  private static final String REPORT_ID = "INSERT_REPORT_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, long reportId) throws Exception {
    // Request the report service from the service client factory.
    ReportRemote reportService = dfaServices.get(session, ReportRemote.class);

    // Create report request object.
    ReportRequest reportRequest = new ReportRequest();
    reportRequest.setReportId(reportId);

    // Get report information.
    ReportInfo reportInfo = reportService.getReport(reportRequest);

    // Display information on the report.
    System.out.printf("Report with ID \"%s\", status of \"%s\", and URL of \"%s\" was found.%n",
        reportInfo.getReportId(), reportInfo.getStatus().getName(), reportInfo.getUrl());
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential, which replaces legacy passwords
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFA)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfaSession.
    DfaSession session = new DfaSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfaServices dfaServices = new DfaServices();

    long reportId = Long.parseLong(REPORT_ID);

    runExample(dfaServices, session, reportId);
  }
}
