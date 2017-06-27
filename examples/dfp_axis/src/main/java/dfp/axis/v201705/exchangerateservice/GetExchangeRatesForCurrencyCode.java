// Copyright 2016 Google Inc. All Rights Reserved.
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

package dfp.axis.v201705.exchangerateservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201705.StatementBuilder;
import com.google.api.ads.dfp.axis.v201705.ExchangeRate;
import com.google.api.ads.dfp.axis.v201705.ExchangeRatePage;
import com.google.api.ads.dfp.axis.v201705.ExchangeRateServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets the exchange rate for a specific currency code.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetExchangeRatesForCurrencyCode {

  private static class GetExchangeRatesForCurrencyCodeParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CURRENCY_CODE, required = true)
    private String currencyCode;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, String currencyCode)
      throws Exception {
    ExchangeRateServiceInterface exchangeRateService =
        dfpServices.get(session, ExchangeRateServiceInterface.class);

    // Create a statement to select exchange rates.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("currencyCode = :currencyCode")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("currencyCode", currencyCode);

    // Retrieve a small amount of exchange rates at a time, paging through
    // until all exchange rates have been retrieved.
    int totalResultSetSize = 0;
    do {
      ExchangeRatePage page =
          exchangeRateService.getExchangeRatesByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        // Print out some information for each exchange rate.
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (ExchangeRate exchangeRate : page.getResults()) {
          System.out.printf(
              "%d) Exchange rate with ID %d, currency code '%s', "
              + "and exchange rate %.2f was found.%n",
              i++,
              exchangeRate.getId(),
              exchangeRate.getCurrencyCode(),
              exchangeRate.getExchangeRate() / 10000000000f
          );
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d%n", totalResultSetSize);
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential for authentication.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an API session configured from a properties file and the OAuth2
    // credentials above.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    GetExchangeRatesForCurrencyCodeParams params = new GetExchangeRatesForCurrencyCodeParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.currencyCode = "INSERT_CURRENCY_CODE_HERE";
    }

    runExample(dfpServices, session, params.currencyCode);
  }
}
