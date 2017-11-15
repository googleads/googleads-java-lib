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

package dfp.axis.v201711.productpackageservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201711.StatementBuilder;
import com.google.api.ads.dfp.axis.v201711.ProductPackage;
import com.google.api.ads.dfp.axis.v201711.ProductPackagePage;
import com.google.api.ads.dfp.axis.v201711.ProductPackageServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example updates the notes of a single product package.
 * 
 * To create product packages, run CreateProductPackages.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateProductPackages {

  private static class UpdateProductPackagesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.PRODUCT_PACKAGE_ID, required = true,
        description = "The ID of the product package to update.")
    private Long productPackageId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long productPackageId) throws Exception {
    // Get the ProductPackageService.
    ProductPackageServiceInterface productPackageService =
        dfpServices.get(session, ProductPackageServiceInterface.class);

    // Create a statement to select a single product package.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", productPackageId);
    
    // Get the product package.
    ProductPackagePage page =
        productPackageService.getProductPackagesByStatement(
            statementBuilder.toStatement());

    ProductPackage productPackage = Iterables.getOnlyElement(
        Arrays.asList(page.getResults()));

    // Update the notes of the product package.
    productPackage.setNotes("This product package is not to be sold before "
        + "the end of the month");
    
    // Update the product package on the server.
    ProductPackage[] productPackages =
        productPackageService.updateProductPackages(
            new ProductPackage[] {productPackage});

    for (ProductPackage updatedProductPackage : productPackages) {
      System.out.printf(
          "Product package with ID %d and name '%s' was updated.%n",
          updatedProductPackage.getId(),
          updatedProductPackage.getName());
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

    UpdateProductPackagesParams params = new UpdateProductPackagesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.productPackageId = Long.parseLong("INSERT_PRODUCT_PACKAGE_ID_HERE");
    }

    runExample(dfpServices, session, params.productPackageId);
  }
}
