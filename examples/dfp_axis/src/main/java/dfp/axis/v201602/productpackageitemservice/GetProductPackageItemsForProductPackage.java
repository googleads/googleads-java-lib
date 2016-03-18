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

package dfp.axis.v201602.productpackageitemservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201602.StatementBuilder;
import com.google.api.ads.dfp.axis.v201602.ProductPackageItem;
import com.google.api.ads.dfp.axis.v201602.ProductPackageItemPage;
import com.google.api.ads.dfp.axis.v201602.ProductPackageItemServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all product package items belonging to a product package.
 * 
 * To see what product packages exist, run GetAllProductPackages.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetProductPackageItemsForProductPackage {
  
  // Set the ID of the product package to get product package items for.
  private static final String PRODUCT_PACKAGE_ID =
      "INSERT_PRODUCT_PACKAGE_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long productPackageId)
      throws Exception {
    // Get the ProductPackageItemService.
    ProductPackageItemServiceInterface productPackageItemService =
        dfpServices.get(session, ProductPackageItemServiceInterface.class);

    // Create a statement to select all product package items.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("productPackageId = :productPackageId")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("productPackageId", productPackageId);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get product package items by statement.
      ProductPackageItemPage page =
          productPackageItemService.getProductPackageItemsByStatement(
              statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (ProductPackageItem productPackageItem : page.getResults()) {
          System.out.printf(
              "%d) Product package item with ID %d and product ID %d "
              + "belonging to product package ID %d was found.%n", i++,
              productPackageItem.getId(),
              productPackageItem.getProductId(),
              productPackageItem.getProductPackageId());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d%n", totalResultSetSize);
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

    runExample(dfpServices, session, Long.parseLong(PRODUCT_PACKAGE_ID));
  }
}
