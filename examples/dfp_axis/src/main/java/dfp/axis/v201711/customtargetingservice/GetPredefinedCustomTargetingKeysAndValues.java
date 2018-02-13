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

package dfp.axis.v201711.customtargetingservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201711.StatementBuilder;
import com.google.api.ads.dfp.axis.v201711.ApiError;
import com.google.api.ads.dfp.axis.v201711.ApiException;
import com.google.api.ads.dfp.axis.v201711.CustomTargetingKey;
import com.google.api.ads.dfp.axis.v201711.CustomTargetingKeyPage;
import com.google.api.ads.dfp.axis.v201711.CustomTargetingKeyType;
import com.google.api.ads.dfp.axis.v201711.CustomTargetingServiceInterface;
import com.google.api.ads.dfp.axis.v201711.CustomTargetingValue;
import com.google.api.ads.dfp.axis.v201711.CustomTargetingValuePage;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * This example gets predefined custom targeting keys and values.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetPredefinedCustomTargetingKeysAndValues {

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
    CustomTargetingServiceInterface customTargetingService =
        dfpServices.get(session, CustomTargetingServiceInterface.class);

    // Get all predefined custom targeting keys.
    List<Long> customTargetingKeyIds = getPredefinedCustomTargetingKeyIds(dfpServices, session);

    // Create a statement to select custom targeting values.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("customTargetingKeyId = :customTargetingKeyId")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT);

    int totalResultsCounter = 0;

    for (Long customTargetingKeyId : customTargetingKeyIds) {
      // Set the custom targeting key ID to select from.
      statementBuilder.withBindVariableValue("customTargetingKeyId", customTargetingKeyId);

      // Retrieve a small amount of custom targeting values at a time, paging through
      // until all custom targeting values have been retrieved.
      int totalResultSetSize = 0;
      statementBuilder.offset(0);
      do {
        CustomTargetingValuePage page =
            customTargetingService
                .getCustomTargetingValuesByStatement(statementBuilder.toStatement());

        if (page.getResults() != null) {
          // Print out some information for each custom targeting value.
          totalResultSetSize = page.getTotalResultSetSize();
          for (CustomTargetingValue customTargetingValue : page.getResults()) {
            System.out.printf(
                "%d) Custom targeting value with ID %d, name '%s', display name '%s', "
                + "and custom targeting key ID %d was found.%n",
                totalResultsCounter++,
                customTargetingValue.getId(),
                customTargetingValue.getName(),
                customTargetingValue.getDisplayName(),
                customTargetingValue.getCustomTargetingKeyId()
            );
          }
        }

        statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
      } while (statementBuilder.getOffset() < totalResultSetSize);
    }

    System.out.printf("Number of results found: %d%n", totalResultsCounter);
  }

  public static List<Long> getPredefinedCustomTargetingKeyIds(DfpServices dfpServices,
      DfpSession session) throws RemoteException {
    List<Long> customTargetingKeyIds = new ArrayList<>();

    CustomTargetingServiceInterface customTargetingService =
        dfpServices.get(session, CustomTargetingServiceInterface.class);

    // Create a statement to get predefined custom targeting keys.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("type = :type")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("type", CustomTargetingKeyType.PREDEFINED.toString());

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get custom targeting keys by statement.
      CustomTargetingKeyPage page =
          customTargetingService.getCustomTargetingKeysByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (CustomTargetingKey customTargetingKey : page.getResults()) {
          System.out.printf("%d) Custom targeting key with ID %d, name '%s', and "
                  + "display name '%s' was found.%n", i++, customTargetingKey.getId(),
              customTargetingKey.getName(), customTargetingKey.getDisplayName());
          customTargetingKeyIds.add(customTargetingKey.getId());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    return customTargetingKeyIds;
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
