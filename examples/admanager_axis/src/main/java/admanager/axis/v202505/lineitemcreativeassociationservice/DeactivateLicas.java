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

package admanager.axis.v202505.lineitemcreativeassociationservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202505.StatementBuilder;
import com.google.api.ads.admanager.axis.v202505.ApiError;
import com.google.api.ads.admanager.axis.v202505.ApiException;
import com.google.api.ads.admanager.axis.v202505.DeactivateLineItemCreativeAssociations;
import com.google.api.ads.admanager.axis.v202505.LineItemCreativeAssociation;
import com.google.api.ads.admanager.axis.v202505.LineItemCreativeAssociationPage;
import com.google.api.ads.admanager.axis.v202505.LineItemCreativeAssociationServiceInterface;
import com.google.api.ads.admanager.axis.v202505.UpdateResult;
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
 * This example deactivates all LICAs for a given line item. To determine which LICAs exist, run
 * GetAllLicas.java. To determine which line items exist, run GetAllLineItems.java
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class DeactivateLicas {

  private static class DeactivateLicasParams extends CodeSampleParams {
    @Parameter(
        names = ArgumentNames.LINE_ITEM_ID,
        required = true,
        description = "The ID of the line item to deactivate LICAs for.")
    private Long lineItemId;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param lineItemId the ID of the line item to deactivate LICAs for.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdManagerServices adManagerServices, AdManagerSession session, long lineItemId)
      throws RemoteException {
    // Get the LineItemCreativeAssociationService.
    LineItemCreativeAssociationServiceInterface licaService =
        adManagerServices.get(session, LineItemCreativeAssociationServiceInterface.class);

    // Create a statement to select all LICAs for a line item.
    StatementBuilder statementBuilder =
        new StatementBuilder()
            .where("WHERE lineItemId = :lineItemId")
            .orderBy("lineItemId ASC, creativeId ASC")
            .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
            .withBindVariableValue("lineItemId", lineItemId);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get LICAs by statement.
      LineItemCreativeAssociationPage page =
          licaService.getLineItemCreativeAssociationsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (LineItemCreativeAssociation lica : page.getResults()) {
          if (lica.getCreativeSetId() != null) {
            System.out.printf(
                "%d) LICA with line item ID %d and creative " + "set ID %d will be deactivated.%n",
                i++, lica.getLineItemId(), lica.getCreativeSetId());
          } else {
            System.out.printf(
                "%d) LICA with line item ID %d and creative ID %d will be deactivated.%n",
                i++, lica.getLineItemId(), lica.getCreativeId());
          }
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of LICAs to be deactivated: %d%n", totalResultSetSize);

    if (totalResultSetSize > 0) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      DeactivateLineItemCreativeAssociations action = new DeactivateLineItemCreativeAssociations();

      // Perform action.
      UpdateResult result =
          licaService.performLineItemCreativeAssociationAction(
              action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.printf("Number of LICAs deactivated: %d%n", result.getNumChanges());
      } else {
        System.out.println("No LICAs were deactivated.");
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

    DeactivateLicasParams params = new DeactivateLicasParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");
    }

    try {
      runExample(adManagerServices, session, params.lineItemId);
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
