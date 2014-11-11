// Copyright 2014 Google Inc. All Rights Reserved.
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

package dfp.axis.v201411.productservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201411.StatementBuilder;
import com.google.api.ads.dfp.axis.v201411.Product;
import com.google.api.ads.dfp.axis.v201411.ProductPage;
import com.google.api.ads.dfp.axis.v201411.ProductServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all products created from a product template.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: ProductService.getProductsByStatement
 *
 * @author Nicholas Chen
 */
public class GetProductsForProductTemplate {

  // Set the ID of the product template to filter products by.
  private static final String PRODUCT_TEMPLATE_ID = "INSERT_PRODUCT_TEMPLATE_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long productTemplateId) throws Exception {
    // Get the ProductService.
    ProductServiceInterface productService =
        dfpServices.get(session, ProductServiceInterface.class);

    // Create a statement to only select products that were created from a specific
    // product template.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE productTemplateId = :productTemplateId")
        .orderBy("name ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("productTemplateId", productTemplateId);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get products by statement.
      ProductPage page =
          productService.getProductsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (Product product : page.getResults()) {
          System.out.printf(
              "%d) Product with ID \"%d\" and name \"%s\" was found.%n", i++,
              product.getId(), product.getName());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d%n", totalResultSetSize);
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
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

    runExample(dfpServices, session, Long.parseLong(PRODUCT_TEMPLATE_ID));
  }
}
