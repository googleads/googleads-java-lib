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

package dfp.axis.v201502.baserateservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201502.BaseRate;
import com.google.api.ads.dfp.axis.v201502.BaseRateServiceInterface;
import com.google.api.ads.dfp.axis.v201502.Money;
import com.google.api.ads.dfp.axis.v201502.ProductPackageItemBaseRate;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a product package item base rate. To determine which base rates exist,
 * run GetAllBaseRates.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateProductPackageItemBaseRates {
  
  // Set the rate card ID to add the base rate to.
  private static final String RATE_CARD_ID = "INSERT_RATE_CARD_ID_HERE";
  
  // Set the product package item to apply this base rate to.
  private static final String PRODUCT_PACKAGE_ITEM_ID = "INSERT_PRODUCT_PACKAGE_ITEM_ID_HERE";
  
  public static void runExample(DfpServices dfpServices, DfpSession session, long rateCardId,
      long productPackageItemId) throws Exception {
    // Get the BaseRateService.
    BaseRateServiceInterface baseRateService =
        dfpServices.get(session, BaseRateServiceInterface.class);
    
    // Create a base rate for a product package item.
    ProductPackageItemBaseRate productPackageItemBaseRate = new ProductPackageItemBaseRate();
    
    // Set the rate card ID that the product package item base rate belongs to.
    productPackageItemBaseRate.setRateCardId(rateCardId);

    // Set the product package item the base rate will be applied to.
    productPackageItemBaseRate.setProductPackageItemId(productPackageItemId);
    
    // Create a rate worth $2 USD and set that on the product package item base rate.
    Money rate = new Money();
    rate.setCurrencyCode("USD");
    rate.setMicroAmount(2000000L);
    productPackageItemBaseRate.setRate(rate);

    // Create the product package item base rate on the server.
    BaseRate[] baseRates = baseRateService.createBaseRates(new BaseRate[] {
        productPackageItemBaseRate});
    
    for (BaseRate createdBaseRate : baseRates) {
      System.out.printf("A product package item base rate with ID \"%d\" and rate \"%.2f\" %s was"
          + " created.%n", createdBaseRate.getId(),
          (((ProductPackageItemBaseRate) createdBaseRate).getRate().getMicroAmount() / 1000000f),
          ((ProductPackageItemBaseRate) createdBaseRate).getRate().getCurrencyCode());
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

    runExample(dfpServices, session, Long.parseLong(RATE_CARD_ID),
        Long.parseLong(PRODUCT_PACKAGE_ITEM_ID));
  }
}
