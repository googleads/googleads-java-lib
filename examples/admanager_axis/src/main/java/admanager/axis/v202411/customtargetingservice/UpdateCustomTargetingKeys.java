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

package admanager.axis.v202411.customtargetingservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202411.StatementBuilder;
import com.google.api.ads.admanager.axis.v202411.ApiError;
import com.google.api.ads.admanager.axis.v202411.ApiException;
import com.google.api.ads.admanager.axis.v202411.CustomTargetingKey;
import com.google.api.ads.admanager.axis.v202411.CustomTargetingKeyPage;
import com.google.api.ads.admanager.axis.v202411.CustomTargetingServiceInterface;
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
 * This example updates a custom targeting key's display name. To determine which custom targeting
 * keys and values exist, run GetAllCustomTargetingKeysAndValue.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class UpdateCustomTargetingKeys {

  private static class UpdateCustomTargetingKeysParams extends CodeSampleParams {
    @Parameter(
        names = ArgumentNames.TARGETING_KEY_ID,
        required = true,
        description = "The ID of the custom targeting key to update.")
    private Long customTargetingKeyId;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param customTargetingKeyId the ID of the custom targeting key to update.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdManagerServices adManagerServices, AdManagerSession session, long customTargetingKeyId)
      throws RemoteException {
    // Get the CustomTargetingService.
    CustomTargetingServiceInterface customTargetingService =
        adManagerServices.get(session, CustomTargetingServiceInterface.class);

    // Create a statement to get custom targeting keys.
    StatementBuilder statementBuilder =
        new StatementBuilder()
            .where("WHERE id = :id")
            .orderBy("id ASC")
            .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
            .withBindVariableValue("id", customTargetingKeyId);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get custom targeting keys by statement.
      CustomTargetingKeyPage page =
          customTargetingService.getCustomTargetingKeysByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        CustomTargetingKey[] customTargetingKeys = page.getResults();
        totalResultSetSize = page.getTotalResultSetSize();

        // Update each local custom targeting key object by changing its display
        // name.
        for (CustomTargetingKey customTargetingKey : customTargetingKeys) {
          if (customTargetingKey.getDisplayName() == null) {
            customTargetingKey.setDisplayName(customTargetingKey.getName());
          }
          customTargetingKey.setDisplayName(customTargetingKey.getDisplayName() + " (Deprecated)");
        }

        // Update the custom targeting keys on the server.
        customTargetingKeys = customTargetingService.updateCustomTargetingKeys(customTargetingKeys);

        for (CustomTargetingKey updatedCustomTargetingKey : customTargetingKeys) {
          System.out.printf(
              "Custom targeting key with ID %d, name '%s', and display name "
                  + "'%s' was updated.%n",
              updatedCustomTargetingKey.getId(),
              updatedCustomTargetingKey.getName(),
              updatedCustomTargetingKey.getDisplayName());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);
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

    UpdateCustomTargetingKeysParams params = new UpdateCustomTargetingKeysParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customTargetingKeyId = Long.parseLong("INSERT_CUSTOM_TARGETING_KEY_ID_HERE");
    }

    try {
      runExample(adManagerServices, session, params.customTargetingKeyId);
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
