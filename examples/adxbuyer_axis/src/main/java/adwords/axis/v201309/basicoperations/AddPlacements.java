// Copyright 2012 Google Inc. All Rights Reserved.
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

package adwords.axis.v201309.basicoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroupCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201309.cm.BidSource;
import com.google.api.ads.adwords.axis.v201309.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201309.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201309.cm.Bids;
import com.google.api.ads.adwords.axis.v201309.cm.CpmBid;
import com.google.api.ads.adwords.axis.v201309.cm.Money;
import com.google.api.ads.adwords.axis.v201309.cm.NegativeAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201309.cm.Operator;
import com.google.api.ads.adwords.axis.v201309.cm.Placement;
import com.google.api.ads.adwords.axis.v201309.cm.UserStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.ClientLoginTokens;

/**
 * This example adds placements to an ad group. To get ad groups, run
 * AddCPMAdGroup.java
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: AdGroupCriterionService.mutate
 *
 * @author Kevin Winter
 */
public class AddPlacements {

  public static void main(String[] args) throws Exception {

    // Get a ClientLogin AuthToken.
    String clientLoginToken = new ClientLoginTokens.Builder()
        .forApi(ClientLoginTokens.Api.ADWORDS)
        .fromFile()
        .build()
        .requestToken();

    // Construct an AdWordsSession.
    AdWordsSession session =
        new AdWordsSession.Builder().fromFile().withClientLoginToken(clientLoginToken).build();

    long adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, long adGroupId) throws Exception {
    // Get the AdGroupCriterionService.
    AdGroupCriterionServiceInterface adGroupCriterionService =
        adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

    // Create placements.
    Placement placement1 = new Placement();
    placement1.setUrl("http://mars.google.com");
    Placement placement2 = new Placement();
    placement2.setUrl("http://example.com/pluto");

    // Create biddable ad group criterion.
    BiddableAdGroupCriterion placementBiddableAdGroupCriterion1 = new BiddableAdGroupCriterion();
    placementBiddableAdGroupCriterion1.setAdGroupId(adGroupId);
    placementBiddableAdGroupCriterion1.setCriterion(placement1);

    // You can optionally provide these field(s).
    placementBiddableAdGroupCriterion1.setUserStatus(UserStatus.PAUSED);
    placementBiddableAdGroupCriterion1.setDestinationUrl("http://example.com/mars");
    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    CpmBid bid = new CpmBid();
    bid.setBid(new Money(null, 10000000L));
    bid.setCpmBidSource(BidSource.CRITERION);
    biddingStrategyConfiguration.setBids(new Bids[] {bid});
    placementBiddableAdGroupCriterion1.setBiddingStrategyConfiguration(
        biddingStrategyConfiguration);

    NegativeAdGroupCriterion placementNegativeAdGroupCriterion2 = new NegativeAdGroupCriterion();
    placementNegativeAdGroupCriterion2.setAdGroupId(adGroupId);
    placementNegativeAdGroupCriterion2.setCriterion(placement2);

    // Create operations.
    AdGroupCriterionOperation placementAdGroupCriterionOperation1 = new AdGroupCriterionOperation();
    placementAdGroupCriterionOperation1.setOperand(placementBiddableAdGroupCriterion1);
    placementAdGroupCriterionOperation1.setOperator(Operator.ADD);
    AdGroupCriterionOperation placementAdGroupCriterionOperation2 = new AdGroupCriterionOperation();
    placementAdGroupCriterionOperation2.setOperand(placementNegativeAdGroupCriterion2);
    placementAdGroupCriterionOperation2.setOperator(Operator.ADD);

    AdGroupCriterionOperation[] operations =
        new AdGroupCriterionOperation[] {placementAdGroupCriterionOperation1,
            placementAdGroupCriterionOperation2};

    // Add placements.
    AdGroupCriterionReturnValue result = adGroupCriterionService.mutate(operations);

    // Display results.
    for (AdGroupCriterion adGroupCriterionResult : result.getValue()) {
      System.out.printf(
          "Placement ad group criterion with ad group id \"%d\", criterion id \"%d\" "
              + "and url \"%s\" was added.", adGroupCriterionResult.getAdGroupId(),
          adGroupCriterionResult.getCriterion().getId(),
          ((Placement) adGroupCriterionResult.getCriterion()).getUrl());
    }
  }
}
