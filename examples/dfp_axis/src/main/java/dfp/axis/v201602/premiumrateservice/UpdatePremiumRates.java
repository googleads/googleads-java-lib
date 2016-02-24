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

package dfp.axis.v201602.premiumrateservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201602.StatementBuilder;
import com.google.api.ads.dfp.axis.v201602.PremiumAdjustmentType;
import com.google.api.ads.dfp.axis.v201602.PremiumRate;
import com.google.api.ads.dfp.axis.v201602.PremiumRatePage;
import com.google.api.ads.dfp.axis.v201602.PremiumRateServiceInterface;
import com.google.api.ads.dfp.axis.v201602.PremiumRateValue;
import com.google.api.ads.dfp.axis.v201602.RateType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * This example updates a premium rate to add a flat fee to an existing feature premium.
 * To determine which premium rates exist, run GetAllPremiumRates.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdatePremiumRates {
  
  // Set the ID of the premium rate to update.
  private static final String PREMIUM_RATE_ID = "INSERT_PREMIUM_RATE_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long premiumRateId)
      throws Exception {
    // Get the PremiumRateService.
    PremiumRateServiceInterface premiumRateService =
        dfpServices.get(session, PremiumRateServiceInterface.class);

    // Create a statement to get a single premium rate.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", premiumRateId);

    // Get the premium rate.
    PremiumRatePage page =
        premiumRateService.getPremiumRatesByStatement(statementBuilder.toStatement());

    PremiumRate premiumRate = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Create a flat fee based premium rate value with a 10% increase.
    PremiumRateValue flatFeePremiumRateValue = new PremiumRateValue();
    flatFeePremiumRateValue.setPremiumFeature(premiumRate.getPremiumFeature());
    flatFeePremiumRateValue.setRateType(RateType.CPM);
    flatFeePremiumRateValue.setAdjustmentSize(10000L);
    flatFeePremiumRateValue.setAdjustmentType(PremiumAdjustmentType.PERCENTAGE);
    
    // Update the premium rate's premiumRateValues to include a flat fee premium rate.
    List<PremiumRateValue> existingPremiumRateValues = ((premiumRate.getPremiumRateValues() != null)
        ? Lists.<PremiumRateValue>newArrayList(premiumRate.getPremiumRateValues())
        : Lists.<PremiumRateValue>newArrayList());
    
    existingPremiumRateValues.add(flatFeePremiumRateValue);
    premiumRate.setPremiumRateValues(
        existingPremiumRateValues.toArray(new PremiumRateValue[]{}));

    // Update the premium rate on the server.
    PremiumRate[] premiumRates = premiumRateService.updatePremiumRates(
        new PremiumRate[] {premiumRate});

    for (PremiumRate updatedPremiumRate : premiumRates) {
      System.out.printf("Premium rate with ID %d associated with rate card id %d was updated.%n",
          updatedPremiumRate.getId(), updatedPremiumRate.getRateCardId());
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

    runExample(dfpServices, session, Long.parseLong(PREMIUM_RATE_ID));
  }
}
