// Copyright 2012 Google Inc. All Rights Reserved.
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

package dfa.axis.v1_19;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_19.ReportInfo;
import com.google.api.ads.dfa.axis.v1_19.ReportRemote;
import com.google.api.ads.dfa.axis.v1_19.ReportRequest;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example requests the generation of a report. Once the report has been
 * requested, you can continually get updates on the status of the report until
 * it is completed. There is currently no way to get a query ID through the DFA
 * API; you must use the website interface or the Java DART API instead. To
 * request an update on a report's status, run GetReport.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: report.runDeferredReport
 *
 * @author Joseph DiLallo
 */
public class RunDeferredReport {

  // Set the ID of the query to generate a new report from.
  private static final String QUERY_ID = "INSERT_QUERY_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, long queryId) throws Exception {

    // Request the report service from the service client factory.
    ReportRemote reportService = dfaServices.get(session, ReportRemote.class);

    // Create report request object.
    ReportRequest reportRequest = new ReportRequest();
    reportRequest.setQueryId(queryId);

    // Request generation of a report for your query.
    ReportInfo reportInfo = reportService.runDeferredReport(reportRequest);

    // Display success message.
    System.out.printf("Report with ID \"%s\" has been scheduled.%n", reportInfo.getReportId());
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

    long queryId = Long.parseLong(QUERY_ID);

    runExample(dfaServices, session, queryId);
  }
}
