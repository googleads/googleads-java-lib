// Copyright 2016 Google Inc. All Rights Reserved.
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

package dfp.axis.v201611.reconciliationreportservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201611.StatementBuilder;
import com.google.api.ads.dfp.axis.v201611.Network;
import com.google.api.ads.dfp.axis.v201611.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201611.ReconciliationReport;
import com.google.api.ads.dfp.axis.v201611.ReconciliationReportPage;
import com.google.api.ads.dfp.axis.v201611.ReconciliationReportServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * This example gets the previous billing period's reconciliation report.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetReconciliationReportForLastBillingPeriod {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    ReconciliationReportServiceInterface reconciliationReportService =
        dfpServices.get(session, ReconciliationReportServiceInterface.class);

    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(session, NetworkServiceInterface.class);

    // Get the first day of last month in your network's time zone.
    Network network = networkService.getCurrentNetwork();
    DateTime lastMonth = new DateTime(DateTimeZone.forID(network.getTimeZone()))
        .minusMonths(1).dayOfMonth().withMinimumValue();

    // Create a statement to select reconciliation reports.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("startDate = :startDate")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("startDate", lastMonth.toString("YYYY-MM-dd"));

    // Get the reconciliation report.
    ReconciliationReportPage page =
        reconciliationReportService.getReconciliationReportsByStatement(
            statementBuilder.toStatement());

    int totalResultSetSize = 0;
    if (page.getResults() != null) {
      // Print out some information for each reconciliation report.
      totalResultSetSize = page.getTotalResultSetSize();
      int i = page.getStartIndex();
      for (ReconciliationReport reconciliationReport : page.getResults()) {
        System.out.printf(
            "%d) Reconciliation report with ID %d and start date '%s' was found.%n",
            i++,
            reconciliationReport.getId(),
            reconciliationReport.getStartDate()
        );
      }
    }

    System.out.printf("Number of results found: %d%n", totalResultSetSize);
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential for authentication.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an API session configured from a properties file and the OAuth2
    // credentials above.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session);
  }
}
