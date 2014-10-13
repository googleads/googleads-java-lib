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

package dfp.axis.v201408.baserateservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201408.StatementBuilder;
import com.google.api.ads.dfp.axis.v201408.BaseRate;
import com.google.api.ads.dfp.axis.v201408.BaseRatePage;
import com.google.api.ads.dfp.axis.v201408.BaseRateServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all base rates belonging to a rate card. To create product base rates,
 * run CreateProductBaseRates.java. To create product template base rates, run
 * CreateProductTemplateBaseRates.java.
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: BaseRateService.getBaseRatesByStatement
 *
 * @author Nicholas Chen
 */
public class GetBaseRatesByStatement {

  // Set the rate card ID to filter base rates on.
  private static final String RATE_CARD_ID = "INSERT_RATE_CARD_ID_HERE";
  
  public static void runExample(DfpServices dfpServices, DfpSession session, long rateCardId)
      throws Exception {
    // Get the BaseRateService.
    BaseRateServiceInterface baseRateService =
        dfpServices.get(session, BaseRateServiceInterface.class);

    // Create a statement to select base rates belonging to a single rate card.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("rateCardId = :rateCardId")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("rateCardId", rateCardId);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get base rates by statement.
      BaseRatePage page =
          baseRateService.getBaseRatesByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (BaseRate baseRate : page.getResults()) {
          System.out.printf("%d) Base rate with ID \"%d\" and type \"%s,\""
              + " belonging to rate card ID \"%d\" was found.%n", i++,
              baseRate.getId(), baseRate.getBaseRateType(),
              baseRate.getRateCardId());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d%n", totalResultSetSize);
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

    runExample(dfpServices, session, Long.parseLong(RATE_CARD_ID));
  }
}
