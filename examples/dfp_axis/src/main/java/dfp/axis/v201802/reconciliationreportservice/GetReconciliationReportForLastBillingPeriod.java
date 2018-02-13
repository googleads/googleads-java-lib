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

package dfp.axis.v201802.reconciliationreportservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201802.StatementBuilder;
import com.google.api.ads.dfp.axis.v201802.ApiError;
import com.google.api.ads.dfp.axis.v201802.ApiException;
import com.google.api.ads.dfp.axis.v201802.Network;
import com.google.api.ads.dfp.axis.v201802.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201802.ReconciliationReport;
import com.google.api.ads.dfp.axis.v201802.ReconciliationReportPage;
import com.google.api.ads.dfp.axis.v201802.ReconciliationReportServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * This example gets the previous billing period's reconciliation report.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetReconciliationReportForLastBillingPeriod {

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(DfpServices dfpServices, DfpSession session)
      throws RemoteException {
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

  public static void main(String[] args) {
    DfpSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder().forApi(Api.DFP).fromFile().build().generateCredential();

      // Construct a DfpSession.
      session = new DfpSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
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

    try {
      runExample(dfpServices, session);
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
