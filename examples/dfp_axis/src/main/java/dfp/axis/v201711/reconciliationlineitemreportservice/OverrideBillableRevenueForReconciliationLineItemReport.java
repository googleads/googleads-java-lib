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

package dfp.axis.v201711.reconciliationlineitemreportservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201711.StatementBuilder;
import com.google.api.ads.dfp.axis.v201711.ApiError;
import com.google.api.ads.dfp.axis.v201711.ApiException;
import com.google.api.ads.dfp.axis.v201711.BillableRevenueOverrides;
import com.google.api.ads.dfp.axis.v201711.Money;
import com.google.api.ads.dfp.axis.v201711.PricingModel;
import com.google.api.ads.dfp.axis.v201711.ReconciliationLineItemReport;
import com.google.api.ads.dfp.axis.v201711.ReconciliationLineItemReportPage;
import com.google.api.ads.dfp.axis.v201711.ReconciliationLineItemReportServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.rmi.RemoteException;
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
        description = "The ID of the reconciliation report.")
    private Long reconciliationReportId;

    @Parameter(names = ArgumentNames.LINE_ITEM_ID, required = true,
        description = "The ID of the line item to retrieve.")
    private Long lineItemId;
  }

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @param reconciliationReportId the ID of the reconciliation report.
   * @param lineItemId the ID of the line item to retrieve.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      DfpServices dfpServices, DfpSession session, long reconciliationReportId, long lineItemId)
      throws RemoteException {
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

  public static void main(String[] args) {
    DfpSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.DFP)
              .fromFile()
              .build()
              .generateCredential();

      // Construct a DfpSession.
      session =
          new DfpSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    DfpServices dfpServices = new DfpServices();

    OverrideBillableRevenueForReconciliationLineItemReportParams params =
        new OverrideBillableRevenueForReconciliationLineItemReportParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.reconciliationReportId = Long.parseLong("INSERT_RECONCILIATION_REPORT_ID_HERE");
      params.lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");
    }

    try {
      runExample(dfpServices, session, params.reconciliationReportId, params.lineItemId);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the dfp.axis
      // packages will return a meaningful value from toString
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }
}
