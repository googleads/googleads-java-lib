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

package dfp.axis.v201608.productpackageitemservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201608.ProductPackageItem;
import com.google.api.ads.dfp.axis.v201608.ProductPackageItemServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a product package item.
 *
 * To determine which product package items exist, run GetAllProductPackageItems.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateProductPackageItems {

  // Set the ID of the product package to add product package items to.
  private static final String PRODUCT_PACKAGE_ID =
      "INSERT_PRODUCT_PACKAGE_ID_HERE";

  // Set the ID of the product to generate a product package item from.
  private static final String PRODUCT_ID = "INSERT_PRODUCT_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long productPackageId, long productId) throws Exception {
    ProductPackageItemServiceInterface productPackageItemService =
        dfpServices.get(session, ProductPackageItemServiceInterface.class);

    // Create a local product package item.
    ProductPackageItem productPackageItem = new ProductPackageItem();

    // Set the product from which the product package item is created.
    productPackageItem.setProductId(productId);

    // Set the product package that the product package item belongs to.
    productPackageItem.setProductPackageId(productPackageId);

    // Specify if the product package item is required for this product package.
    productPackageItem.setIsMandatory(true);

    // Create the product package item on the server.
    ProductPackageItem[] productPackageItems =
        productPackageItemService.createProductPackageItems(
            new ProductPackageItem[] {productPackageItem});

    for (ProductPackageItem createdProductPackageItem : productPackageItems) {
      System.out.printf("A product package item with ID %d created from "
          + "product ID %d belonging to "
          + "product package with ID %d was created.%n",
          createdProductPackageItem.getId(),
          createdProductPackageItem.getProductId(),
          createdProductPackageItem.getProductPackageId());
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

    runExample(dfpServices, session, Long.parseLong(PRODUCT_PACKAGE_ID),
        Long.parseLong(PRODUCT_ID));
  }
}
