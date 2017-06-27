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

package dfp.axis.v201705.productservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201705.StatementBuilder;
import com.google.api.ads.dfp.axis.v201705.Product;
import com.google.api.ads.dfp.axis.v201705.ProductPage;
import com.google.api.ads.dfp.axis.v201705.ProductServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example updates a product's notes. To determine which products exist, run
 * GetAllProducts.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateProducts {

  private static class UpdateProductsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.PRODUCT_ID, required = true,
        description = "The ID of the product to update.")
    private Long productId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long productId)
      throws Exception {
    // Get the ProductService.
    ProductServiceInterface productService =
        dfpServices.get(session, ProductServiceInterface.class);

    // Create a statement to only select a single product by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", productId);

    // Get the product.
    ProductPage page =
        productService.getProductsByStatement(statementBuilder.toStatement());

    Product product = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update the product's notes.
    product.setNotes("Product needs further review before approval.");

    // Update the product on the server.
    Product[] products = productService.updateProducts(new Product[] {product});

    for (Product updatedProduct : products) {
      System.out.printf("Product with ID %d and name '%s' was updated.%n",
          updatedProduct.getId(),
          updatedProduct.getName());
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

    UpdateProductsParams params = new UpdateProductsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.productId = Long.parseLong("INSERT_PRODUCT_ID_HERE");
    }

    runExample(dfpServices, session, params.productId);
  }
}
