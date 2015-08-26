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

package dfp.axis.v201505.ratecardservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201505.RateCard;
import com.google.api.ads.dfp.axis.v201505.RateCardServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Random;

/**
 * This example creates a new rate card. To determine which rate cards exist,
 * run GetAllRateCards.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateRateCards {

  // Set the IDs of the teams this rate card should be visible to. This is optional.
  private static final long[] TEAM_IDS = new long[] {
      Long.valueOf("INSERT_TEAM_ID_1_HERE"), Long.valueOf("INSERT_TEAM_ID_2_HERE")};

  // Set the currency code to create the rate card with.
  private static final String CURRENCY_CODE = "INSERT_CURRENCY_CODE_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, String currencyCode,
      long[] teamIds) throws Exception {
    // Get the RateCardService.
    RateCardServiceInterface rateCardService =
        dfpServices.get(session, RateCardServiceInterface.class);

    // Create a rate card.
    RateCard rateCard = new RateCard();
    rateCard.setName("RateCard #" + new Random().nextInt(Integer.MAX_VALUE));
    rateCard.setCurrencyCode(currencyCode);

    if (teamIds.length != 0) {
      rateCard.setAppliedTeamIds(teamIds);
    }

    // Create the rate card on the server.
    RateCard[] rateCards = rateCardService.createRateCards(new RateCard[] {rateCard});

    for (RateCard createdRateCard : rateCards) {
      System.out.printf("A rate card with ID \"%d,\" name \"%s,\" and currency code "
          + "\"%s\" was created.\n", createdRateCard.getId(), createdRateCard.getName(),
          createdRateCard.getCurrencyCode());
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

    runExample(dfpServices, session, CURRENCY_CODE, TEAM_IDS);
  }
}
