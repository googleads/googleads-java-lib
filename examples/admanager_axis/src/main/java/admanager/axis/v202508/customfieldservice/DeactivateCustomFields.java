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

package admanager.axis.v202508.customfieldservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202508.StatementBuilder;
import com.google.api.ads.admanager.axis.v202508.ApiError;
import com.google.api.ads.admanager.axis.v202508.ApiException;
import com.google.api.ads.admanager.axis.v202508.CustomField;
import com.google.api.ads.admanager.axis.v202508.CustomFieldPage;
import com.google.api.ads.admanager.axis.v202508.CustomFieldServiceInterface;
import com.google.api.ads.admanager.axis.v202508.UpdateResult;
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
 * This example deactivates a custom field. To determine which custom fields exist, run
 * GetAllCustomFields.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class DeactivateCustomFields {

  private static class DeactivateCustomFieldsParams extends CodeSampleParams {
    @Parameter(
        names = ArgumentNames.CUSTOM_FIELD_ID,
        required = true,
        description = "The ID of the custom field to deactivate.")
    private Long customFieldId;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param customFieldId the ID of the custom field to deactivate.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdManagerServices adManagerServices, AdManagerSession session, long customFieldId)
      throws RemoteException {
    // Get the CustomFieldService.
    CustomFieldServiceInterface customFieldService =
        adManagerServices.get(session, CustomFieldServiceInterface.class);

    // Create a statement to select a custom field.
    StatementBuilder statementBuilder =
        new StatementBuilder()
            .where("WHERE id = :id")
            .orderBy("id ASC")
            .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
            .withBindVariableValue("id", customFieldId);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get custom fields by statement.
      CustomFieldPage page =
          customFieldService.getCustomFieldsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (CustomField customField : page.getResults()) {
          System.out.printf(
              "%d) Custom field with ID %d will be deactivated.%n", i++, customField.getId());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of custom fields to be deactivated: %d%n", totalResultSetSize);

    if (totalResultSetSize > 0) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      com.google.api.ads.admanager.axis.v202508.DeactivateCustomFields action =
          new com.google.api.ads.admanager.axis.v202508.DeactivateCustomFields();

      // Perform action.
      UpdateResult result =
          customFieldService.performCustomFieldAction(action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.printf("Number of custom fields deactivated: %d%n", result.getNumChanges());
      } else {
        System.out.println("No custom fields were deactivated.");
      }
    }
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

    DeactivateCustomFieldsParams params = new DeactivateCustomFieldsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customFieldId = Long.parseLong("INSERT_CUSTOM_FIELD_ID_HERE");
    }

    try {
      runExample(adManagerServices, session, params.customFieldId);
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
