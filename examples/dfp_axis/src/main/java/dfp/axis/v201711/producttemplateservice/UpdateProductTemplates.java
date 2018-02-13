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

package dfp.axis.v201711.producttemplateservice;

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
import com.google.api.ads.dfp.axis.v201711.GeoTargeting;
import com.google.api.ads.dfp.axis.v201711.Location;
import com.google.api.ads.dfp.axis.v201711.ProductTemplate;
import com.google.api.ads.dfp.axis.v201711.ProductTemplatePage;
import com.google.api.ads.dfp.axis.v201711.ProductTemplateServiceInterface;
import com.google.api.ads.dfp.axis.v201711.Targeting;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This example updates a product template's targeting to include a new GeoTarget.
 * To determine which product templates exist, run GetAllProductTemplates.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateProductTemplates {

  private static class UpdateProductTemplatesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.PRODUCT_TEMPLATE_ID, required = true,
        description = "The ID of the product template to update.")
    private Long productTemplateId;
  }

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @param productTemplateId the ID of the product template to update.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(DfpServices dfpServices, DfpSession session,
      long productTemplateId) throws RemoteException {
    // Get the ProductTemplateService.
    ProductTemplateServiceInterface productTemplateService =
        dfpServices.get(session, ProductTemplateServiceInterface.class);

    // Create a statement to select a product template by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", productTemplateId);

    // Get the product template.
    ProductTemplatePage page =
        productTemplateService.getProductTemplatesByStatement(statementBuilder.toStatement());

    ProductTemplate productTemplate = Iterables.getOnlyElement(Arrays.asList(page.getResults()));
    
    // Add geo targeting for Canada to the product template.
    Location countryLocation = new Location();
    countryLocation.setId(2124L);
    
    Targeting productTemplateTargeting = productTemplate.getBuiltInTargeting();
    GeoTargeting geoTargeting = productTemplateTargeting.getGeoTargeting();
    
    List<Location> existingTargetedLocations = new ArrayList<>();
    
    if (geoTargeting != null) {
      if (geoTargeting.getTargetedLocations() != null) {
        existingTargetedLocations =
            new ArrayList<>(Arrays.asList(geoTargeting.getTargetedLocations()));
      }
    } else {
      geoTargeting = new GeoTargeting();
    }

    existingTargetedLocations.add(countryLocation); 
    geoTargeting.setTargetedLocations(existingTargetedLocations.toArray(new Location[] {}));
    
    productTemplateTargeting.setGeoTargeting(geoTargeting);
    productTemplate.setBuiltInTargeting(productTemplateTargeting);

    // Update the product template on the server.
    ProductTemplate[] productTemplates =
        productTemplateService.updateProductTemplates(new ProductTemplate[] {productTemplate});

    for (ProductTemplate updatedProductTemplate : productTemplates) {
      System.out.printf("Product template with ID %d and name '%s' was updated.%n",
          updatedProductTemplate.getId(),
          updatedProductTemplate.getName());
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

    UpdateProductTemplatesParams params = new UpdateProductTemplatesParams();
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
