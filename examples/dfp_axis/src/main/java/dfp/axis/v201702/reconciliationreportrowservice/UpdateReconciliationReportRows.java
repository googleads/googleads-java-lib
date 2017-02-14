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

package dfp.axis.v201702.reconciliationreportrowservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201702.StatementBuilder;
import com.google.api.ads.dfp.axis.v201702.BillFrom;
import com.google.api.ads.dfp.axis.v201702.ReconciliationReportRow;
import com.google.api.ads.dfp.axis.v201702.ReconciliationReportRowPage;
import com.google.api.ads.dfp.axis.v201702.ReconciliationReportRowServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example updates a reconciliation report row.
 *
 * To get reconciliation report rows for a reconciliation report, run
 * GetReconciliationReportRowsForReconciliationReport.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateReconciliationReportRows {

  // Set the IDs of the reconciliation report, line item, and creative to retrieve rows for.
  private static final String RECONCILIATION_REPORT_ROW_ID =
      "INSERT_RECONCILIATION_REPORT_ROW_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long reconciliationReportRowId) throws Exception {
    // Get the ReconciliationReportRowService.
    ReconciliationReportRowServiceInterface reconciliationReportRowService =
        dfpServices.get(session, ReconciliationReportRowServiceInterface.class);

    // Create a statement to select reconciliation report rows.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :reconciliationReportRowId")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("reconciliationReportRowId", reconciliationReportRowId);

    // Get reconciliation report rows by statement.
    ReconciliationReportRowPage page =
        reconciliationReportRowService.getReconciliationReportRowsByStatement(
            statementBuilder.toStatement());

    ReconciliationReportRow row = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Set a comment on the reconciliation report row.
    row.setComments("Third party volume didn't match DFP - we agreed to split the difference");

    // Set and use a manual volume for billing.
    row.setManualVolume((row.getDfpVolume() + row.getThirdPartyVolume()) / 2);
    row.setReconciliationSource(BillFrom.MANUAL);

    ReconciliationReportRow[] updatedRows =
        reconciliationReportRowService.updateReconciliationReportRows(
            new ReconciliationReportRow[] {row});

    for (ReconciliationReportRow updatedRow : updatedRows) {
      System.out.printf(
          "Reconciliation report row for line item ID %d and creative ID %d was "
              + "updated, with manual volume %d.%n",
          updatedRow.getLineItemId(),
          updatedRow.getCreativeId(),
          updatedRow.getManualVolume());
    }
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

    runExample(dfpServices, session, Long.parseLong(RECONCILIATION_REPORT_ROW_ID));
  }
}
