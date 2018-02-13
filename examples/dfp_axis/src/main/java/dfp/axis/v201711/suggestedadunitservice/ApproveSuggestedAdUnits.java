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

package dfp.axis.v201711.suggestedadunitservice;

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
import com.google.api.ads.dfp.axis.v201711.SuggestedAdUnit;
import com.google.api.ads.dfp.axis.v201711.SuggestedAdUnitPage;
import com.google.api.ads.dfp.axis.v201711.SuggestedAdUnitServiceInterface;
import com.google.api.ads.dfp.axis.v201711.SuggestedAdUnitUpdateResult;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example approves highly requested suggested ad units. To
 * determine which suggested ad units exist, run GetAllSuggestedAdUnits.java.
 * This feature is only available to DFP premium solution networks.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class ApproveSuggestedAdUnits {

  private static class ApproveSuggestedAdUnitsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.NUM_REQUESTS, required = true,
        description = "The number of requests for suggested ad units greater than which to"
            + " approve.")
    private Long numRequests;
  }

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @param numRequests the number of requests for suggested ad units greater than which to approve.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(DfpServices dfpServices, DfpSession session, long numRequests)
      throws RemoteException {
    // Get the SuggestedAdUnitService.
    SuggestedAdUnitServiceInterface suggestedAdUnitService =
        dfpServices.get(session, SuggestedAdUnitServiceInterface.class);

    // Create a statement to only select suggested ad units that are highly
    // requested.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("numRequests >= :numRequests")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("numRequests", numRequests);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get suggested ad units by statement.
      SuggestedAdUnitPage page =
          suggestedAdUnitService.getSuggestedAdUnitsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (SuggestedAdUnit suggestedAdUnit : page.getResults()) {
          System.out.printf("%d) Suggested ad unit with ID '%s' will be approved.%n", i++,
              suggestedAdUnit.getId());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of suggested ad units to be approved: %d%n", totalResultSetSize);

    if (totalResultSetSize > 0) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      com.google.api.ads.dfp.axis.v201711.ApproveSuggestedAdUnits action =
          new com.google.api.ads.dfp.axis.v201711.ApproveSuggestedAdUnits();

      // Perform action.
      SuggestedAdUnitUpdateResult result = suggestedAdUnitService.performSuggestedAdUnitAction(
          action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.printf(
            "Number of new ad units created: %d%n", result.getNewAdUnitIds().length);
      } else {
        System.out.println("No suggested ad units were approved.");
      }
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

    ApproveSuggestedAdUnitsParams params = new ApproveSuggestedAdUnitsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.numRequests = Long.parseLong("INSERT_NUM_REQUESTS_HERE");
    }

    try {
      runExample(dfpServices, session, params.numRequests);
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
