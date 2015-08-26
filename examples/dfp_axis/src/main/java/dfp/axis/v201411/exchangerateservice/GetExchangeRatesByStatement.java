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

package dfp.axis.v201411.exchangerateservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201411.StatementBuilder;
import com.google.api.ads.dfp.axis.v201411.ExchangeRate;
import com.google.api.ads.dfp.axis.v201411.ExchangeRatePage;
import com.google.api.ads.dfp.axis.v201411.ExchangeRateServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets the exchange rate for a specific currency code.
 * 
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetExchangeRatesByStatement {
  
  // Set the currency code to filter on here.
  private static final String CURRENCY_CODE = "INSERT_CURRENCY_CODE_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      String currencyCode) throws Exception {
    // Get the ExchangeRateService.
    ExchangeRateServiceInterface exchangeRateService =
        dfpServices.get(session, ExchangeRateServiceInterface.class);

    // Create a statement to select a single exchange rate by currency code.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("currencyCode = :currencyCode")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("currencyCode", currencyCode);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get exchange rates by statement.
      ExchangeRatePage page =
          exchangeRateService.getExchangeRatesByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (ExchangeRate exchangeRate : page.getResults()) {
          System.out.printf("%d) Exchange rate with ID \"%d,\" currency code \"%s,\""
              + " direction \"%s,\" and exchange rate \"%.2f\" was found.%n", i++,
              exchangeRate.getId(), exchangeRate.getCurrencyCode(),
              exchangeRate.getDirection().getValue(),
              (exchangeRate.getExchangeRate() / 10000000000f));
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d%n", totalResultSetSize);
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

    runExample(dfpServices, session, CURRENCY_CODE);
  }
}
