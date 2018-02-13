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

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201802.AdUnitTargeting;
import com.google.api.ads.dfp.axis.v201802.ApiError;
import com.google.api.ads.dfp.axis.v201802.ApiException;
import com.google.api.ads.dfp.axis.v201802.Browser;
import com.google.api.ads.dfp.axis.v201802.BrowserTargeting;
import com.google.api.ads.dfp.axis.v201802.CreativePlaceholder;
import com.google.api.ads.dfp.axis.v201802.CustomizableAttributes;
import com.google.api.ads.dfp.axis.v201802.DeliveryRateType;
import com.google.api.ads.dfp.axis.v201802.GeoTargeting;
import com.google.api.ads.dfp.axis.v201802.LineItemType;
import com.google.api.ads.dfp.axis.v201802.Location;
import com.google.api.ads.dfp.axis.v201802.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201802.ProductSegmentation;
import com.google.api.ads.dfp.axis.v201802.ProductTemplate;
import com.google.api.ads.dfp.axis.v201802.ProductTemplateServiceInterface;
import com.google.api.ads.dfp.axis.v201802.ProductType;
import com.google.api.ads.dfp.axis.v201802.RateType;
import com.google.api.ads.dfp.axis.v201802.RoadblockingType;
import com.google.api.ads.dfp.axis.v201802.Size;
import com.google.api.ads.dfp.axis.v201802.Targeting;
import com.google.api.ads.dfp.axis.v201802.TechnologyTargeting;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.Random;

/**
 * This example creates a product template.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateProductTemplates {

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
    // Get the ProductTemplateService.
    ProductTemplateServiceInterface productTemplateService =
        dfpServices.get(session, ProductTemplateServiceInterface.class);

    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(session, NetworkServiceInterface.class);

    // Create a product template.
    ProductTemplate productTemplate = new ProductTemplate();
    productTemplate.setName("Product template #" + new Random().nextInt(Integer.MAX_VALUE));
    productTemplate.setDescription("This product template creates standard proposal line items "
        + "targeting Chrome browsers with product segmentation on ad units and geo targeting.");

    // Set the name macro which will be used to generate the names of the products.
    // This will create a segmentation based on the line item type, ad unit, and location.
    productTemplate.setNameMacro("<line-item-type> - <ad-unit> - <template-name> - <location>");

    // Set the product type so the created proposal line items will be trafficked in DFP.
    productTemplate.setProductType(ProductType.DFP);

    // Set rate type to create CPM priced proposal line items.
    productTemplate.setRateType(RateType.CPM);
    productTemplate.setDeliveryRateType(DeliveryRateType.AS_FAST_AS_POSSIBLE);

    // Optionally set the creative rotation of the product to serve one or more creatives.
    productTemplate.setRoadblockingType(RoadblockingType.ONE_OR_MORE);

    // Create the master creative placeholder.
    CreativePlaceholder creativeMasterPlaceholder = new CreativePlaceholder();
    creativeMasterPlaceholder.setSize(new Size(728, 90, false));

    // Create companion creative placeholders.
    CreativePlaceholder companionCreativePlaceholder = new CreativePlaceholder();
    companionCreativePlaceholder.setSize(new Size(300, 250, false));

    // Set the size of creatives that can be associated with the product template.
    productTemplate.setCreativePlaceholders(
        new CreativePlaceholder[] {creativeMasterPlaceholder, companionCreativePlaceholder});

    // Set the type of proposal line item to be created from the product template.
    productTemplate.setLineItemType(LineItemType.STANDARD);

    // Get the root ad unit ID used to target the whole site.
    String rootAdUnitId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();

    // Create ad unit targeting for the root ad unit (i.e. the whole network).
    AdUnitTargeting adUnitTargeting = new AdUnitTargeting();
    adUnitTargeting.setAdUnitId(rootAdUnitId);
    adUnitTargeting.setIncludeDescendants(true);

    // Create geo targeting for the US.
    Location countryLocation = new Location();
    countryLocation.setId(2840L);

    // Create geo targeting for Hong Kong.
    Location regionLocation = new Location();
    regionLocation.setId(2344L);

    GeoTargeting geoTargeting = new GeoTargeting();
    geoTargeting.setTargetedLocations(new Location[] {countryLocation, regionLocation});

    // Add browser targeting to Chrome on the product template distinct from product segmentation.
    Browser chromeBrowser = new Browser();
    chromeBrowser.setId(500072L);

    BrowserTargeting browserTargeting = new BrowserTargeting();
    browserTargeting.setBrowsers(new Browser[] {chromeBrowser});

    TechnologyTargeting technologyTargeting = new TechnologyTargeting();
    technologyTargeting.setBrowserTargeting(browserTargeting);

    Targeting productTemplateTargeting = new Targeting();
    productTemplateTargeting.setTechnologyTargeting(technologyTargeting);

    productTemplate.setBuiltInTargeting(productTemplateTargeting);

    // Allow placement targeting to be customized on the proposal line item.
    CustomizableAttributes customizableAttributes = new CustomizableAttributes();
    customizableAttributes.setAllowPlacementTargetingCustomization(true);
    productTemplate.setCustomizableAttributes(customizableAttributes);

    // Add inventory and geo targeting as product segmentation.
    ProductSegmentation productSegmentation = new ProductSegmentation();
    productSegmentation.setAdUnitSegments(new AdUnitTargeting[] {adUnitTargeting});
    productSegmentation.setGeoSegment(geoTargeting);

    productTemplate.setProductSegmentation(productSegmentation);

    // Create the product template on the server.
    ProductTemplate[] productTemplates =
        productTemplateService.createProductTemplates(new ProductTemplate[] {productTemplate});

    for (ProductTemplate createdProductTemplate : productTemplates) {
      System.out.printf("A product template with ID %d and name '%s' was created.%n",
          createdProductTemplate.getId(), createdProductTemplate.getName());
    }
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
