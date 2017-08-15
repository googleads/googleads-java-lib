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

package dfp.axis.v201708.producttemplateservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201708.AdExchangeEnvironment;
import com.google.api.ads.dfp.axis.v201708.AdUnitTargeting;
import com.google.api.ads.dfp.axis.v201708.CreativePlaceholder;
import com.google.api.ads.dfp.axis.v201708.GeoTargeting;
import com.google.api.ads.dfp.axis.v201708.LineItemType;
import com.google.api.ads.dfp.axis.v201708.Location;
import com.google.api.ads.dfp.axis.v201708.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201708.ProductSegmentation;
import com.google.api.ads.dfp.axis.v201708.ProductTemplate;
import com.google.api.ads.dfp.axis.v201708.ProductTemplateMarketplaceInfo;
import com.google.api.ads.dfp.axis.v201708.ProductTemplateServiceInterface;
import com.google.api.ads.dfp.axis.v201708.ProductType;
import com.google.api.ads.dfp.axis.v201708.RateType;
import com.google.api.ads.dfp.axis.v201708.Size;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import java.util.Random;

/**
 * This example creates a programmatic product template. Your network must
 * have sales management enabled to run this example.
 *
 * <p>To publish the created product template to Marketplace, you must create a
 * ProductTemplateBaseRate with a Marketplace rate card.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateProgrammaticProductTemplates {
  
  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    ProductTemplateServiceInterface productTemplateService =
        dfpServices.get(session, ProductTemplateServiceInterface.class);

    NetworkServiceInterface networkService =
        dfpServices.get(session, NetworkServiceInterface.class);
    
    // Create a programmatic product template.
    ProductTemplate productTemplate = new ProductTemplate();
    productTemplate.setName("Programmatic product template #"
        + new Random().nextInt(Integer.MAX_VALUE));
    productTemplate.setDescription("This product template creates programmatic proposal line items "
        + "targeting all ad units with product segmentation on geo targeting.");

    // Set the name macro which will be used to generate the names of the products.
    // This will create a segmentation based on the line item type, ad unit, and location.
    productTemplate.setNameMacro("<line-item-type> - <ad-unit> - <template-name> - <location>");

    // Set the product type so the created proposal line items will be trafficked in DFP.
    productTemplate.setProductType(ProductType.DFP);

    // Set required Marketplace information.
    ProductTemplateMarketplaceInfo marketplaceInfo = new ProductTemplateMarketplaceInfo();
    marketplaceInfo.setAdExchangeEnvironment(AdExchangeEnvironment.DISPLAY);
    productTemplate.setProductTemplateMarketplaceInfo(marketplaceInfo);
    
    productTemplate.setRateType(RateType.CPM);

    CreativePlaceholder creativePlaceholder = new CreativePlaceholder();
    creativePlaceholder.setSize(new Size(300, 250, false));

    // Set the size of creatives that can be associated with the product template.
    productTemplate.setCreativePlaceholders(
        new CreativePlaceholder[] {creativePlaceholder});
    
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

    // Add targeting as product segmentation.
    ProductSegmentation productSegmentation = new ProductSegmentation();
    productSegmentation.setAdUnitSegments(new AdUnitTargeting[] {adUnitTargeting});
    productSegmentation.setGeoSegment(geoTargeting);
    
    productTemplate.setProductSegmentation(productSegmentation);

    // Create the product template on the server.
    ProductTemplate[] productTemplates =
        productTemplateService.createProductTemplates(new ProductTemplate[] {productTemplate});

    for (ProductTemplate createdProductTemplate : productTemplates) {
      System.out.printf("A programmatic product template with ID %d and name '%s' was created.%n",
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
