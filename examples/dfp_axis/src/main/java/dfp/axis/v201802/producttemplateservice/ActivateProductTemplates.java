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

package dfp.axis.v201802.producttemplateservice;

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
import com.google.api.ads.dfp.axis.v201802.ProductTemplate;
import com.google.api.ads.dfp.axis.v201802.ProductTemplatePage;
import com.google.api.ads.dfp.axis.v201802.ProductTemplateServiceInterface;
import com.google.api.ads.dfp.axis.v201802.UpdateResult;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example activates a product template. To determine which product templates exist,
 * run GetAllProductTemplates.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class ActivateProductTemplates {

  private static class ActivateProductTemplatesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.PRODUCT_TEMPLATE_ID, required = true,
        description = "The ID of the product template to activate.")
    private Long productTemplateId;
  }

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @param productTemplateId the ID of the product template to activate.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(DfpServices dfpServices, DfpSession session,
      long productTemplateId) throws RemoteException {
    // Get the ProductTemplateService.
    ProductTemplateServiceInterface productTemplateService =
        dfpServices.get(session, ProductTemplateServiceInterface.class);

    // Create a statement to select a product template.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE id = :id")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("id", productTemplateId);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get product templates by statement.
      ProductTemplatePage page =
          productTemplateService.getProductTemplatesByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (ProductTemplate productTemplate : page.getResults()) {
          System.out.printf(
              "%d) Product template with ID %d will be activated.%n", i++,
              productTemplate.getId());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of product templates to be activated: %d%n", totalResultSetSize);

    if (totalResultSetSize > 0) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      com.google.api.ads.dfp.axis.v201802.ActivateProductTemplates action =
          new com.google.api.ads.dfp.axis.v201802.ActivateProductTemplates();

      // Perform action.
      UpdateResult result =
          productTemplateService.performProductTemplateAction(
              action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.printf("Number of product templates activated: %d%n", result.getNumChanges());
      } else {
        System.out.println("No product templates were activated.");
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

    ActivateProductTemplatesParams params = new ActivateProductTemplatesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.productTemplateId = Long.parseLong("INSERT_PRODUCT_TEMPLATE_ID_HERE");
    }

    try {
      runExample(dfpServices, session, params.productTemplateId);
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
