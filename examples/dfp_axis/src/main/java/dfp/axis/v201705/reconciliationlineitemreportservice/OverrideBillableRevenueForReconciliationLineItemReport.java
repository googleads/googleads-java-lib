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

package dfp.axis.v201705.reconciliationlineitemreportservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201705.StatementBuilder;
import com.google.api.ads.dfp.axis.v201705.BillableRevenueOverrides;
import com.google.api.ads.dfp.axis.v201705.Money;
import com.google.api.ads.dfp.axis.v201705.PricingModel;
import com.google.api.ads.dfp.axis.v201705.ReconciliationLineItemReport;
import com.google.api.ads.dfp.axis.v201705.ReconciliationLineItemReportPage;
import com.google.api.ads.dfp.axis.v201705.ReconciliationLineItemReportServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example updates a reconciliation line item report's billable revenue overrides.
 *
 * To get reconciliation line item reports for a reconciliation report, run
 * GetReconciliationLineItemReportsForReconciliationReport.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class OverrideBillableRevenueForReconciliationLineItemReport {

  private static class OverrideBillableRevenueForReconciliationLineItemReportParams
      extends CodeSampleParams {
    @Parameter(names = ArgumentNames.RECONCILIATION_REPORT_ID, required = true,
        description = "The IDs of the reconciliation report and line item to retrieve.")
    private Long reconciliationReportId;

    @Parameter(names = ArgumentNames.LINE_ITEM_ID, required = true)
    private Long lineItemId;
  }

  public static void runExample(
      DfpServices dfpServices, DfpSession session, long reconciliationReportId, long lineItemId)
      throws Exception {
    // Get the ReconciliationLineItemReportService.
    ReconciliationLineItemReportServiceInterface reconciliationLineItemReportService =
        dfpServices.get(session, ReconciliationLineItemReportServiceInterface.class);

    // Create a statement to select a reconciliation line item report.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("reconciliationReportId = :reconciliationReportId AND lineItemId = :lineItemId")
        .orderBy("lineItemId ASC")
        .limit(1)
        .withBindVariableValue("reconciliationReportId", reconciliationReportId)
        .withBindVariableValue("lineItemId", lineItemId);

    // Get reconciliation line item reports by statement.
    ReconciliationLineItemReportPage page =
        reconciliationLineItemReportService.getReconciliationLineItemReportsByStatement(
            statementBuilder.toStatement());

    ReconciliationLineItemReport lineItemReport =
        Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Add $10 to the computed billable revenue as an override.
    Money billableRevenue;
    if (PricingModel.NET.equals(lineItemReport.getPricingModel())) {
      billableRevenue = lineItemReport.getNetBillableRevenue();
    } else {
      billableRevenue = lineItemReport.getGrossBillableRevenue();
    }
    billableRevenue.setMicroAmount(billableRevenue.getMicroAmount() + 10000000L);

    BillableRevenueOverrides billableRevenueOverrides = new BillableRevenueOverrides();
    billableRevenueOverrides.setBillableRevenueOverride(billableRevenue);

    lineItemReport.setBillableRevenueOverrides(billableRevenueOverrides);

    ReconciliationLineItemReport[] updatedLineItemReports =
        reconciliationLineItemReportService.updateReconciliationLineItemReports(
            new ReconciliationLineItemReport[] {lineItemReport});

    for (ReconciliationLineItemReport updatedLineItemReport : updatedLineItemReports) {
      System.out.printf(
          "Reconciliation line item report for line item ID %d was "
              + "updated, with net billable revenue %.2f and reconciled volume %d.%n",
          updatedLineItemReport.getLineItemId(),
          updatedLineItemReport.getNetBillableRevenue().getMicroAmount() / 1000000f,
          updatedLineItemReport.getReconciledVolume());
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

    OverrideBillableRevenueForReconciliationLineItemReportParams params =
        new OverrideBillableRevenueForReconciliationLineItemReportParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.reconciliationReportId = Long.parseLong("INSERT_RECONCILIATION_REPORT_ID_HERE");
      params.lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");
    }

    runExample(dfpServices, session, params.reconciliationReportId, params.lineItemId);
  }
}
