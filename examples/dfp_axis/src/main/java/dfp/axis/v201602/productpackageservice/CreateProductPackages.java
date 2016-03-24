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

package dfp.axis.v201602.productpackageservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201602.ProductPackage;
import com.google.api.ads.dfp.axis.v201602.ProductPackageServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Random;

/**
 * This example creates a product package.
 *
 * To determine which product packages exist, run GetAllProductPackages.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateProductPackages {

  // Set the ID of the rate card to associate the product package with.
  private static final String RATE_CARD_ID = "INSERT_RATE_CARD_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long rateCardId)
      throws Exception {
    ProductPackageServiceInterface productPackageService =
        dfpServices.get(session, ProductPackageServiceInterface.class);

    // Create a local product package.
    ProductPackage productPackage = new ProductPackage();
    productPackage.setName(
        "Product package #" + new Random().nextInt(Integer.MAX_VALUE));
    productPackage.setRateCardIds(new long[] {rateCardId});

    // Create the product package on the server.
    ProductPackage[] productPackages =
        productPackageService.createProductPackages(
            new ProductPackage[] {productPackage});

    for (ProductPackage createdProductPackage : productPackages) {
      System.out.printf("A product package with ID %d and name '%s' was created.%n",
          createdProductPackage.getId(), createdProductPackage.getName());
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

    runExample(dfpServices, session, Long.parseLong(RATE_CARD_ID));
  }
}
