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

package dfp.axis.v201702.exchangerateservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201702.ExchangeRate;
import com.google.api.ads.dfp.axis.v201702.ExchangeRateDirection;
import com.google.api.ads.dfp.axis.v201702.ExchangeRateRefreshRate;
import com.google.api.ads.dfp.axis.v201702.ExchangeRateServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates an exchange rate. To determine which exchange rates exist,
 * run GetAllExchangeRates.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateExchangeRates {
  
  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the ExchangeRateService.
    ExchangeRateServiceInterface exchangeRateService =
        dfpServices.get(session, ExchangeRateServiceInterface.class);
    
    // Create an exchange rate.
    ExchangeRate exchangeRate = new ExchangeRate();
    
    // Set the currency code.
    exchangeRate.setCurrencyCode("AUD");
    
    // Set the direction of the conversion (from the network currency).
    exchangeRate.setDirection(ExchangeRateDirection.FROM_NETWORK);

    // Set the conversion value as 1.5 (this value is multiplied by 10,000,000,000)
    exchangeRate.setExchangeRate(15000000000L);
    
    // Do not refresh exchange rate from Google data. Update manually only.
    exchangeRate.setRefreshRate(ExchangeRateRefreshRate.FIXED);

    // Create the exchange rate on the server.
    ExchangeRate[] exchangeRates = exchangeRateService.createExchangeRates(
        new ExchangeRate[] {exchangeRate});
    
    for (ExchangeRate createdExchangeRate : exchangeRates) {
      System.out.printf("An exchange rate with ID %d, currency code '%s',"
          + " direction '%s', and exchange rate %.2f was created.%n",
          createdExchangeRate.getId(), createdExchangeRate.getCurrencyCode(),
          createdExchangeRate.getDirection().getValue(),
          (createdExchangeRate.getExchangeRate() / 10000000000f));
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
