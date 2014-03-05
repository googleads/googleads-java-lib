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

package adwords.axis.v201306.basicoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroupOperation;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroupReturnValue;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroupStatus;
import com.google.api.ads.adwords.axis.v201306.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201306.cm.Bids;
import com.google.api.ads.adwords.axis.v201306.cm.CpmBid;
import com.google.api.ads.adwords.axis.v201306.cm.Money;
import com.google.api.ads.adwords.axis.v201306.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.ClientLoginTokens;

/**
 * This example adds ad groups to a campaign. To get campaigns, run
 * GetCampaigns.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: AdGroupService.mutate
 *
 * @author Kevin Winter
 */
public class AddCPMAdGroups {

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

    long campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, campaignId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, long campaignId) throws Exception {
    // Get the AdGroupService.
    AdGroupServiceInterface adGroupService =
        adWordsServices.get(session, AdGroupServiceInterface.class);

    // Create ad group.
    AdGroup adGroup = new AdGroup();
    adGroup.setName("Earth to Mars Cruises #" + System.currentTimeMillis());
    adGroup.setStatus(AdGroupStatus.ENABLED);
    adGroup.setCampaignId(campaignId);

    // Create ad group bid.
    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    CpmBid bid = new CpmBid();
    bid.setBid(new Money(null, 10000000L));
    biddingStrategyConfiguration.setBids(new Bids[] {bid});
    adGroup.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    // Add as many additional ad groups as you need.
    AdGroup adGroup2 = new AdGroup();
    adGroup2.setName("Earth to Venus Cruises #" + System.currentTimeMillis());
    adGroup2.setStatus(AdGroupStatus.ENABLED);
    adGroup2.setCampaignId(campaignId);

    BiddingStrategyConfiguration biddingStrategyConfiguration2 = new BiddingStrategyConfiguration();
    CpmBid bid2 = new CpmBid();
    bid2.setBid(new Money(null, 10000000L));
    biddingStrategyConfiguration2.setBids(new Bids[] {bid2});
    adGroup2.setBiddingStrategyConfiguration(biddingStrategyConfiguration2);

    // Create operations.
    AdGroupOperation operation = new AdGroupOperation();
    operation.setOperand(adGroup);
    operation.setOperator(Operator.ADD);
    AdGroupOperation operation2 = new AdGroupOperation();
    operation2.setOperand(adGroup2);
    operation2.setOperator(Operator.ADD);

    AdGroupOperation[] operations = new AdGroupOperation[] {operation, operation2};

    // Add ad groups.
    AdGroupReturnValue result = adGroupService.mutate(operations);

    // Display new ad groups.
    for (AdGroup adGroupResult : result.getValue()) {
      System.out.println("Ad group with name \"" + adGroupResult.getName() + "\" and id \""
          + adGroupResult.getId() + "\" was added.");
    }
  }
}
