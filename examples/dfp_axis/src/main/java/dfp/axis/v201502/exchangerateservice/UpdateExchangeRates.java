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

package dfp.axis.v201502.exchangerateservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201502.StatementBuilder;
import com.google.api.ads.dfp.axis.v201502.ExchangeRate;
import com.google.api.ads.dfp.axis.v201502.ExchangeRatePage;
import com.google.api.ads.dfp.axis.v201502.ExchangeRateRefreshRate;
import com.google.api.ads.dfp.axis.v201502.ExchangeRateServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;

import java.util.Arrays;

/**
 * This example updates an exchange rate's refresh rate. To determine which exchange rates
 * exist, run GetAllExchangeRates.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: ExchangeRateService.getExchangeRatesByStatement
 * Tags: ExchangeRateService.updateExchangeRates
 *
 * @author Nicholas Chen
 */
public class UpdateExchangeRates {
  
  // Set the ID of the exchange rate to update.
  private static final String EXCHANGE_RATE_ID = "INSERT_EXCHANGE_RATE_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long exchangeRateId)
      throws Exception {
    // Get the ExchangeRateService.
    ExchangeRateServiceInterface exchangeRateService =
        dfpServices.get(session, ExchangeRateServiceInterface.class);

    // Create a statement to only select a single exchange rate by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id and refreshRate = :refreshRate")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", exchangeRateId)
        .withBindVariableValue("refreshRate", ExchangeRateRefreshRate.FIXED);

    // Get the exchange rate.
    ExchangeRatePage page =
        exchangeRateService.getExchangeRatesByStatement(statementBuilder.toStatement());

    ExchangeRate exchangeRate = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update the exchange rate value to 1.5.
    exchangeRate.setExchangeRate(15000000000L);

    // Update the exchange rate on the server.
    ExchangeRate[] exchangeRates = exchangeRateService.updateExchangeRates(
        new ExchangeRate[] {exchangeRate});

    for (ExchangeRate updatedExchangeRate : exchangeRates) {
      System.out.printf("Exchange rate with ID \"%d,\" currency code \"%s,\""
          + " direction \"%s,\" and exchange rate \"%.2f\" was updated.%n",
          updatedExchangeRate.getId(), updatedExchangeRate.getCurrencyCode(),
          updatedExchangeRate.getDirection().getValue(),
          (updatedExchangeRate.getExchangeRate() / 10000000000f));
    }
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

    runExample(dfpServices, session, Long.parseLong(EXCHANGE_RATE_ID));
  }
}
