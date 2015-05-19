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

package dfp.axis.v201505.producttemplateservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201505.AdUnitTargeting;
import com.google.api.ads.dfp.axis.v201505.Browser;
import com.google.api.ads.dfp.axis.v201505.BrowserTargeting;
import com.google.api.ads.dfp.axis.v201505.CreativePlaceholder;
import com.google.api.ads.dfp.axis.v201505.GeoTargeting;
import com.google.api.ads.dfp.axis.v201505.LineItemType;
import com.google.api.ads.dfp.axis.v201505.Location;
import com.google.api.ads.dfp.axis.v201505.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201505.ProductSegmentation;
import com.google.api.ads.dfp.axis.v201505.ProductTemplate;
import com.google.api.ads.dfp.axis.v201505.ProductTemplateServiceInterface;
import com.google.api.ads.dfp.axis.v201505.ProductTemplateTargeting;
import com.google.api.ads.dfp.axis.v201505.ProductType;
import com.google.api.ads.dfp.axis.v201505.RateType;
import com.google.api.ads.dfp.axis.v201505.RoadblockingType;
import com.google.api.ads.dfp.axis.v201505.Size;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Random;

/**
 * This example creates a product template.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: ProductTemplateService.createProductTemplates
 * Tags: NetworkService.getCurrentNetwork
 *
 * @author Nicholas Chen
 */
public class CreateProductTemplates {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
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

    ProductTemplateTargeting productTemplateTargeting = new ProductTemplateTargeting();
    productTemplateTargeting.setBrowserTargeting(browserTargeting);

    productTemplate.setTargeting(productTemplateTargeting);

    // Add inventory and geo targeting as product segmentation.
    ProductSegmentation productSegmentation = new ProductSegmentation();
    productSegmentation.setAdUnitSegments(new AdUnitTargeting[] {adUnitTargeting});
    productSegmentation.setGeoSegment(geoTargeting);

    productTemplate.setProductSegmentation(productSegmentation);

    // Create the product template on the server.
    ProductTemplate[] productTemplates =
        productTemplateService.createProductTemplates(new ProductTemplate[] {productTemplate});

    for (ProductTemplate createdProductTemplate : productTemplates) {
      System.out.printf("A product template with ID \"%d\" and name \"%s\" was created.%n",
          createdProductTemplate.getId(), createdProductTemplate.getName());
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session);
  }
}
