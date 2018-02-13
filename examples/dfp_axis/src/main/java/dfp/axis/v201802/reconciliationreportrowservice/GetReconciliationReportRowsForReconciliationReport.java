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

package dfp.axis.v201802.reconciliationreportrowservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201802.StatementBuilder;
import com.google.api.ads.dfp.axis.v201802.ApiError;
import com.google.api.ads.dfp.axis.v201802.ApiException;
import com.google.api.ads.dfp.axis.v201802.ReconciliationReportRow;
import com.google.api.ads.dfp.axis.v201802.ReconciliationReportRowPage;
import com.google.api.ads.dfp.axis.v201802.ReconciliationReportRowServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example gets a reconciliation report's rows for line items that served through DFP.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetReconciliationReportRowsForReconciliationReport {

  private static class GetReconciliationReportRowsForReconciliationReportParams
      extends CodeSampleParams {
    @Parameter(names = ArgumentNames.RECONCILIATION_REPORT_ID, required = true)
    private Long reconciliationReportId;
  }

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @param reconciliationReportId the ID of the reconciliation report.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(DfpServices dfpServices, DfpSession session,
      long reconciliationReportId) throws RemoteException {
    ReconciliationReportRowServiceInterface reconciliationReportRowService =
        dfpServices.get(session, ReconciliationReportRowServiceInterface.class);

    // Create a statement to select reconciliation report rows.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("reconciliationReportId = :reconciliationReportId AND lineItemId != :lineItemId")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("reconciliationReportId", reconciliationReportId)
        .withBindVariableValue("lineItemId", 0);

    // Retrieve a small amount of reconciliation report rows at a time, paging through
    // until all reconciliation report rows have been retrieved.
    int totalResultSetSize = 0;
    do {
      ReconciliationReportRowPage page =
          reconciliationReportRowService.getReconciliationReportRowsByStatement(
              statementBuilder.toStatement());

      if (page.getResults() != null) {
        // Print out some information for each reconciliation report row.
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (ReconciliationReportRow reconciliationReportRow : page.getResults()) {
          System.out.printf(
              "%d) Reconciliation report row with ID %d, reconciliation source '%s', "
              + "and reconciled volume %d was found.%n",
              i++,
              reconciliationReportRow.getId(),
              reconciliationReportRow.getReconciliationSource(),
              reconciliationReportRow.getReconciledVolume()
          );
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d%n", totalResultSetSize);
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

    GetReconciliationReportRowsForReconciliationReportParams params =
        new GetReconciliationReportRowsForReconciliationReportParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.reconciliationReportId = Long.parseLong("INSERT_RECONCILIATION_REPORT_ID_HERE");
    }

    try {
      runExample(dfpServices, session, params.reconciliationReportId);
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
