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

package dfp.axis.v201708.productservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201708.AdExchangeEnvironment;
import com.google.api.ads.dfp.axis.v201708.AdUnitTargeting;
import com.google.api.ads.dfp.axis.v201708.CreativePlaceholder;
import com.google.api.ads.dfp.axis.v201708.EnvironmentType;
import com.google.api.ads.dfp.axis.v201708.InventoryTargeting;
import com.google.api.ads.dfp.axis.v201708.LineItemType;
import com.google.api.ads.dfp.axis.v201708.Money;
import com.google.api.ads.dfp.axis.v201708.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201708.Product;
import com.google.api.ads.dfp.axis.v201708.ProductMarketplaceInfo;
import com.google.api.ads.dfp.axis.v201708.ProductServiceInterface;
import com.google.api.ads.dfp.axis.v201708.ProductType;
import com.google.api.ads.dfp.axis.v201708.RateType;
import com.google.api.ads.dfp.axis.v201708.Size;
import com.google.api.ads.dfp.axis.v201708.Targeting;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import java.util.Random;

/**
 * This example creates a programmatic product for those not using sales management.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateProgrammaticProductsForNonSalesManagement { 
  
  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    ProductServiceInterface productService =
        dfpServices.get(session, ProductServiceInterface.class);
    
    NetworkServiceInterface networkService =
        dfpServices.get(session, NetworkServiceInterface.class);
    
    Product product = new Product();
    
    // Setting required Marketplace information.
    ProductMarketplaceInfo productMarketplaceInfo = new ProductMarketplaceInfo();
    productMarketplaceInfo.setAdditionalTerms("Additional terms for the product");
    productMarketplaceInfo.setAdExchangeEnvironment(AdExchangeEnvironment.DISPLAY);
    
    product.setProductMarketplaceInfo(productMarketplaceInfo);

    // Set common required fields for a programmatic product.
    product.setName("Non-Sales Programmatic Product #" + new Random().nextInt(Integer.MAX_VALUE));
    product.setProductType(ProductType.DFP);
    product.setRateType(RateType.CPM);
    product.setLineItemType(LineItemType.STANDARD);
    product.setPriority(8);
    product.setEnvironmentType(EnvironmentType.BROWSER);
    product.setRate(new Money("USD", 6000000L));
    
    CreativePlaceholder placeholder = new CreativePlaceholder();
    placeholder.setSize(new Size(300, 250, false));
    
    product.setCreativePlaceholders(new CreativePlaceholder[] {placeholder});

    // Create inventory targeting to serve to run of network.
    String rootAdUnitId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();

    AdUnitTargeting adUnitTargeting = new AdUnitTargeting();
    adUnitTargeting.setAdUnitId(rootAdUnitId);
    adUnitTargeting.setIncludeDescendants(true);
    
    Targeting productTargeting = new Targeting();
    InventoryTargeting inventoryTargeting = new InventoryTargeting();
    inventoryTargeting.setTargetedAdUnits(new AdUnitTargeting[] {adUnitTargeting});
    productTargeting.setInventoryTargeting(inventoryTargeting);
    
    product.setBuiltInTargeting(productTargeting);
   
    Product[] products = productService.createProducts(new Product[] {product});

    for (Product createdProduct : products) {
      System.out.printf("A programmatic product for non-sales management with ID %d and name '%s' "
          + "was created.%n", createdProduct.getId(), createdProduct.getName());
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
