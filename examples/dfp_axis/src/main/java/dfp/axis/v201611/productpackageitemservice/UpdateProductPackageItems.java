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

package dfp.axis.v201611.productpackageitemservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201611.StatementBuilder;
import com.google.api.ads.dfp.axis.v201611.ProductPackageItem;
import com.google.api.ads.dfp.axis.v201611.ProductPackageItemPage;
import com.google.api.ads.dfp.axis.v201611.ProductPackageItemServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example updates whether or not a product package item is mandatory.
 * 
 * To create product package items, run CreateProductPackageItems.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateProductPackageItems {
  
  // Set the ID of the product package item to update.
  private static final String PRODUCT_PACKAGE_ITEM_ID =
      "INSERT_PRODUCT_PACKAGE_ITEM_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long productPackageItemId) throws Exception {
    // Get the ProductPackageItemService.
    ProductPackageItemServiceInterface productPackageItemService =
        dfpServices.get(session, ProductPackageItemServiceInterface.class);

    // Create a statement to select a single product package item.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", productPackageItemId);
    
    // Get the product package item.
    ProductPackageItemPage page =
        productPackageItemService.getProductPackageItemsByStatement(
            statementBuilder.toStatement());

    ProductPackageItem productPackageItem = Iterables.getOnlyElement(
        Arrays.asList(page.getResults()));

    // Make the product package item mandatory if it isn't already.
    if (!productPackageItem.getIsMandatory()) {
      productPackageItem.setIsMandatory(true);

      // Update the product package item on the server.
      ProductPackageItem[] productPackageItems =
          productPackageItemService.updateProductPackageItems(
              new ProductPackageItem[] {productPackageItem});

      for (ProductPackageItem updatedProductPackageItem : productPackageItems) {
        System.out.printf(
            "Product package item with ID %d was updated.%n",
            updatedProductPackageItem.getId());
      }
    } else {
      System.out.println("No product package items were updated.");
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

    runExample(dfpServices, session, Long.parseLong(PRODUCT_PACKAGE_ITEM_ID));
  }
}
