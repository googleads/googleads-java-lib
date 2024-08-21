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

package admanager.axis.v202408.suggestedadunitservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202408.StatementBuilder;
import com.google.api.ads.admanager.axis.v202408.ApiError;
import com.google.api.ads.admanager.axis.v202408.ApiException;
import com.google.api.ads.admanager.axis.v202408.SuggestedAdUnit;
import com.google.api.ads.admanager.axis.v202408.SuggestedAdUnitPage;
import com.google.api.ads.admanager.axis.v202408.SuggestedAdUnitServiceInterface;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.admanager.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example gets all highly requested suggested ad units.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class GetHighlyRequestedSuggestedAdUnits {

  private static class GetHighlyRequestedSuggestedAdUnitsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.NUM_REQUESTS, required = true)
    private Long numRequests;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param numRequests the number of requests.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdManagerServices adManagerServices, AdManagerSession session, long numRequests)
      throws RemoteException {
    SuggestedAdUnitServiceInterface suggestedAdUnitService =
        adManagerServices.get(session, SuggestedAdUnitServiceInterface.class);

    // Create a statement to select suggested ad units.
    StatementBuilder statementBuilder =
        new StatementBuilder()
            .where("numRequests >= :numRequests")
            .orderBy("id ASC")
            .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
            .withBindVariableValue("numRequests", numRequests);

    // Retrieve a small amount of suggested ad units at a time, paging through
    // until all suggested ad units have been retrieved.
    int totalResultSetSize = 0;
    do {
      SuggestedAdUnitPage page =
          suggestedAdUnitService.getSuggestedAdUnitsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        // Print out some information for each suggested ad unit.
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (SuggestedAdUnit suggestedAdUnit : page.getResults()) {
          System.out.printf(
              "%d) Suggested ad unit with ID '%s' and num requests %d was found.%n",
              i++, suggestedAdUnit.getId(), suggestedAdUnit.getNumRequests());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d%n", totalResultSetSize);
  }

  public static void main(String[] args) {
    AdManagerSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.AD_MANAGER)
              .fromFile()
              .build()
              .generateCredential();

      // Construct a AdManagerSession.
      session =
          new AdManagerSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
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

    AdManagerServices adManagerServices = new AdManagerServices();

    GetHighlyRequestedSuggestedAdUnitsParams params =
        new GetHighlyRequestedSuggestedAdUnitsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.numRequests = Long.parseLong("INSERT_NUM_REQUESTS_HERE");
    }

    try {
      runExample(adManagerServices, session, params.numRequests);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the admanager.axis
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
