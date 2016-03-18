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

package dfp.axis.v201602.reconciliationlineitemreportservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201602.StatementBuilder;
import com.google.api.ads.dfp.axis.v201602.ReconciliationLineItemReport;
import com.google.api.ads.dfp.axis.v201602.ReconciliationLineItemReportPage;
import com.google.api.ads.dfp.axis.v201602.ReconciliationLineItemReportServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets a reconciliation report's data for line items that served through DFP.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetReconciliationLineItemReportsForReconciliationReport {

  // Set the ID of the reconciliation report to retrieve line item reports for.
  private static final String RECONCILIATION_REPORT_ID = "INSERT_RECONCILIATION_REPORT_ID_HERE";

  public static void runExample(
      DfpServices dfpServices, DfpSession session, long reconciliationReportId) throws Exception {
    // Get the ReconciliationLineItemReportService.
    ReconciliationLineItemReportServiceInterface reconciliationLineItemReportService =
        dfpServices.get(session, ReconciliationLineItemReportServiceInterface.class);

    // Create a statement to select reconciliation line item reports for DFP line items.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("reconciliationReportId = :reconciliationReportId AND lineItemId != :lineItemId")
        .orderBy("lineItemId ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("reconciliationReportId", reconciliationReportId)
        .withBindVariableValue("lineItemId", 0);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get reconciliation line item reports by statement.
      ReconciliationLineItemReportPage page =
          reconciliationLineItemReportService.getReconciliationLineItemReportsByStatement(
              statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (ReconciliationLineItemReport reconciliationLineItemReport : page.getResults()) {
          System.out.printf(
              "%d) Reconciliation line item report with ID %d was found, with line item ID "
                  + "%d, reconciliation source '%s' and reconciled volume %d.%n",
              i++,
              reconciliationLineItemReport.getId(),
              reconciliationLineItemReport.getLineItemId(),
              reconciliationLineItemReport.getReconciliationSource(),
              reconciliationLineItemReport.getReconciledVolume());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d%n", totalResultSetSize);
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

    runExample(dfpServices, session, Long.parseLong(RECONCILIATION_REPORT_ID));
  }
}
