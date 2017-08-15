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

package dfp.axis.v201708.reconciliationlineitemreportservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.BillFrom;
import com.google.api.ads.dfp.axis.v201708.ReconciliationLineItemReport;
import com.google.api.ads.dfp.axis.v201708.ReconciliationLineItemReportPage;
import com.google.api.ads.dfp.axis.v201708.ReconciliationLineItemReportServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example updates a reconciliation line item report.
 *
 * To get reconciliation line item reports for a reconciliation report, run
 * GetReconciliationLineItemReportsForReconciliationReport.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateReconciliationLineItemReports {

  private static class UpdateReconciliationLineItemReportsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.RECONCILIATION_LINE_ITEM_REPORT_ID, required = true,
        description = "The ID of the reconciliation line item report to retrieve.")
    private Long reconciliationLineItemReportId;
  }

  public static void runExample(
      DfpServices dfpServices, DfpSession session, long reconciliationLineItemReportId)
      throws Exception {
    // Get the ReconciliationLineItemReportService.
    ReconciliationLineItemReportServiceInterface reconciliationLineItemReportService =
        dfpServices.get(session, ReconciliationLineItemReportServiceInterface.class);

    // Create a statement to select a reconciliation line item report.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :lineItemReportId")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("lineItemReportId", reconciliationLineItemReportId);

    // Get reconciliation line item reports by statement.
    ReconciliationLineItemReportPage page =
        reconciliationLineItemReportService.getReconciliationLineItemReportsByStatement(
            statementBuilder.toStatement());

    ReconciliationLineItemReport lineItemReport =
        Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Set and use a manual volume for billing. This example splits the difference between DFP
    // and the third party volume.
    lineItemReport.setManualVolume(
        (lineItemReport.getDfpVolume() + lineItemReport.getThirdPartyVolume()) / 2);
    lineItemReport.setReconciliationSource(BillFrom.MANUAL);

    ReconciliationLineItemReport[] updatedLineItemReports =
        reconciliationLineItemReportService.updateReconciliationLineItemReports(
            new ReconciliationLineItemReport[] {lineItemReport});

    for (ReconciliationLineItemReport updatedLineItemReport : updatedLineItemReports) {
      System.out.printf(
          "Reconciliation line item report with ID %d for line item ID %d was "
              + "updated, with manual volume %d.%n",
          updatedLineItemReport.getId(),
          updatedLineItemReport.getLineItemId(),
          updatedLineItemReport.getManualVolume());
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

    UpdateReconciliationLineItemReportsParams params =
        new UpdateReconciliationLineItemReportsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.reconciliationLineItemReportId =
          Long.parseLong("INSERT_RECONCILIATION_LINE_ITEM_REPORT_ID_HERE");
    }

    runExample(dfpServices, session, params.reconciliationLineItemReportId);
  }
}
