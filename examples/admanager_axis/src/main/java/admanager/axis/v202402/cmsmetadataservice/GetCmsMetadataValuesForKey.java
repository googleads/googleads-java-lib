// Copyright 2019 Google Inc. All Rights Reserved.
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

package admanager.axis.v202402.cmsmetadataservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202402.StatementBuilder;
import com.google.api.ads.admanager.axis.v202402.ApiError;
import com.google.api.ads.admanager.axis.v202402.ApiException;
import com.google.api.ads.admanager.axis.v202402.CmsMetadataServiceInterface;
import com.google.api.ads.admanager.axis.v202402.CmsMetadataValue;
import com.google.api.ads.admanager.axis.v202402.CmsMetadataValuePage;
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
 * This example gets CMS metadata values associated with a CmsMetadataKey for a publisher's CMS.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class GetCmsMetadataValuesForKey {

  private static class GetCmsMetadataValuesForKeyParams extends CodeSampleParams {

    @Parameter(
        names = ArgumentNames.CMS_METADATA_KEY_NAME,
        required = true,
        description = "The ID of the CMS metadata key to retrieve values for")
    private String cmsMetadataKeyName;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdManagerServices adManagerServices, AdManagerSession session, String cmsMetadataKeyName)
      throws RemoteException {
    // Get the CmsMetadataService.
    CmsMetadataServiceInterface cmsMetadataService =
        adManagerServices.get(session, CmsMetadataServiceInterface.class);

    // Create a statement to select all CMS metadata values.
    StatementBuilder statementBuilder =
        new StatementBuilder()
            .where("cmsKey = :cmsMetadataKeyName")
            .orderBy("id ASC")
            .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
            .withBindVariableValue("cmsMetadataKeyName", cmsMetadataKeyName);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get CMS metadata values by statement.
      CmsMetadataValuePage page =
          cmsMetadataService.getCmsMetadataValuesByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (CmsMetadataValue cmsMetadataValue : page.getResults()) {
          System.out.printf(
              "%d) CMS metadata value with ID %d and name '%s' associated with the "
                  + "CmsMetadataKey with ID %d and name '%s' was found.%n",
              i++,
              cmsMetadataValue.getCmsMetadataValueId(),
              cmsMetadataValue.getValueName(),
              cmsMetadataValue.getKey().getId(),
              cmsMetadataValue.getKey().getName());
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
    GetCmsMetadataValuesForKey.GetCmsMetadataValuesForKeyParams params =
        new GetCmsMetadataValuesForKeyParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.cmsMetadataKeyName = "INSERT_CMS_METADATA_KEY_ID_HERE";
    }

    try {
      runExample(adManagerServices, session, params.cmsMetadataKeyName);
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
