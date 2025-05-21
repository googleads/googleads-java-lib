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

package admanager.axis.v202505.creativesetservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202505.StatementBuilder;
import com.google.api.ads.admanager.axis.v202505.ApiError;
import com.google.api.ads.admanager.axis.v202505.ApiException;
import com.google.api.ads.admanager.axis.v202505.CreativeSet;
import com.google.api.ads.admanager.axis.v202505.CreativeSetPage;
import com.google.api.ads.admanager.axis.v202505.CreativeSetServiceInterface;
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
 * This example gets all creative sets for a master creative.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class GetCreativeSetsForMasterCreative {

  private static class GetCreativeSetsForMasterCreativeParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.MASTER_CREATIVE_ID, required = true)
    private Long masterCreativeId;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param masterCreativeId the ID of the master creative.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdManagerServices adManagerServices, AdManagerSession session, long masterCreativeId)
      throws RemoteException {
    CreativeSetServiceInterface creativeSetService =
        adManagerServices.get(session, CreativeSetServiceInterface.class);

    // Create a statement to select creative sets.
    StatementBuilder statementBuilder =
        new StatementBuilder()
            .where("masterCreativeId = :masterCreativeId")
            .orderBy("id ASC")
            .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
            .withBindVariableValue("masterCreativeId", masterCreativeId);

    // Retrieve a small amount of creative sets at a time, paging through
    // until all creative sets have been retrieved.
    int totalResultSetSize = 0;
    do {
      CreativeSetPage page =
          creativeSetService.getCreativeSetsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        // Print out some information for each creative set.
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (CreativeSet creativeSet : page.getResults()) {
          System.out.printf(
              "%d) Creative set with ID %d and name '%s' was found.%n",
              i++, creativeSet.getId(), creativeSet.getName());
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

    GetCreativeSetsForMasterCreativeParams params = new GetCreativeSetsForMasterCreativeParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.masterCreativeId = Long.parseLong("INSERT_MASTER_CREATIVE_ID_HERE");
    }

    try {
      runExample(adManagerServices, session, params.masterCreativeId);
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
