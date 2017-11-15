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

package dfp.axis.v201711.exchangerateservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201711.StatementBuilder;
import com.google.api.ads.dfp.axis.v201711.ExchangeRate;
import com.google.api.ads.dfp.axis.v201711.ExchangeRatePage;
import com.google.api.ads.dfp.axis.v201711.ExchangeRateRefreshRate;
import com.google.api.ads.dfp.axis.v201711.ExchangeRateServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example updates an exchange rate's refresh rate. To determine which exchange rates
 * exist, run GetAllExchangeRates.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateExchangeRates {

  private static class UpdateExchangeRatesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.EXCHANGE_RATE_ID, required = true,
        description = "The ID of the exchange rate to update.")
    private Long exchangeRateId;
  }

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
      System.out.printf("Exchange rate with ID %d, currency code '%s',"
          + " direction '%s', and exchange rate %.2f was updated.%n",
          updatedExchangeRate.getId(), updatedExchangeRate.getCurrencyCode(),
          updatedExchangeRate.getDirection().getValue(),
          (updatedExchangeRate.getExchangeRate() / 10000000000f));
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

    UpdateExchangeRatesParams params = new UpdateExchangeRatesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.exchangeRateId = Long.parseLong("INSERT_EXCHANGE_RATE_ID_HERE");
    }

    runExample(dfpServices, session, params.exchangeRateId);
  }
}
