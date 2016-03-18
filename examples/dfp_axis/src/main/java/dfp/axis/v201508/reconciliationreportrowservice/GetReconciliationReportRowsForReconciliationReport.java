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

package dfp.axis.v201508.reconciliationreportrowservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201508.StatementBuilder;
import com.google.api.ads.dfp.axis.v201508.ReconciliationReportRow;
import com.google.api.ads.dfp.axis.v201508.ReconciliationReportRowPage;
import com.google.api.ads.dfp.axis.v201508.ReconciliationReportRowServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets a reconciliation report's rows for line items that served through DFP.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetReconciliationReportRowsForReconciliationReport {

  // Set the ID of the reconciliation report to retrieve rows for.
  private static final String RECONCILIATION_REPORT_ID = "INSERT_RECONCILIATION_REPORT_ID_HERE";

  public static void runExample(
      DfpServices dfpServices, DfpSession session, long reconciliationReportId) throws Exception {
    // Get the ReconciliationReportRowService.
    ReconciliationReportRowServiceInterface reconciliationReportRowService =
        dfpServices.get(session, ReconciliationReportRowServiceInterface.class);

    // Create a statement to select reconciliation report rows for DFP line items.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("reconciliationReportId = :reconciliationReportId and lineItemId != :lineItemId")
        .orderBy("lineItemId ASC, creativeId ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("reconciliationReportId", reconciliationReportId)
        .withBindVariableValue("lineItemId", 0);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get reconciliation report rows by statement.
      ReconciliationReportRowPage page =
          reconciliationReportRowService.getReconciliationReportRowsByStatement(
              statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (ReconciliationReportRow reconciliationReportRow : page.getResults()) {
          System.out.printf(
              "%d) Reconciliation report row for line item ID %d and creative ID %d was "
                  + "found, with reconciliation source '%s' and reconciled volume %d.%n",
              i++,
              reconciliationReportRow.getLineItemId(),
              reconciliationReportRow.getCreativeId(),
              reconciliationReportRow.getReconciliationSource(),
              reconciliationReportRow.getReconciledVolume());
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
