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

package dfp.axis.v201605.productpackageservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201605.StatementBuilder;
import com.google.api.ads.dfp.axis.v201605.ProductPackage;
import com.google.api.ads.dfp.axis.v201605.ProductPackagePage;
import com.google.api.ads.dfp.axis.v201605.ProductPackageServiceInterface;
import com.google.api.ads.dfp.axis.v201605.UpdateResult;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;

import java.util.Arrays;

/**
 * This example activates a product package. To determine which product packages exist,
 * run GetAllProductPackages.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class ActivateProductPackages {
  
  // Set the ID of the product package to activate.
  private static final String PRODUCT_PACKAGE_ID =
      "INSERT_PRODUCT_PACKAGE_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long productPackageId)
      throws Exception {
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

    System.out.printf("Product package with ID %d will be activated.%n",
        productPackage.getId());
    
    // Remove limit and offset from statement.
    statementBuilder.removeLimitAndOffset();
    
    // Create action to activate product packages.
    com.google.api.ads.dfp.axis.v201605.ActivateProductPackages action = 
        new com.google.api.ads.dfp.axis.v201605.ActivateProductPackages();
    
    // Perform action.
    UpdateResult result =
        productPackageService.performProductPackageAction(
            action, statementBuilder.toStatement());

    if (result != null && result.getNumChanges() > 0) {
      System.out.printf("Number of product packages activated: %d%n", result.getNumChanges());
    } else {
      System.out.println("No product packages were deactivated.");
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

    runExample(dfpServices, session, Long.parseLong(PRODUCT_PACKAGE_ID));
  }
}