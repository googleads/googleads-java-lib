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

package adwords.axis.v201609.basicoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201609.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201609.cm.AdGroupOperation;
import com.google.api.ads.adwords.axis.v201609.cm.AdGroupReturnValue;
import com.google.api.ads.adwords.axis.v201609.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201609.cm.AdGroupStatus;
import com.google.api.ads.adwords.axis.v201609.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201609.cm.Bids;
import com.google.api.ads.adwords.axis.v201609.cm.CpcBid;
import com.google.api.ads.adwords.axis.v201609.cm.CriterionTypeGroup;
import com.google.api.ads.adwords.axis.v201609.cm.Money;
import com.google.api.ads.adwords.axis.v201609.cm.Operator;
import com.google.api.ads.adwords.axis.v201609.cm.Setting;
import com.google.api.ads.adwords.axis.v201609.cm.TargetingSetting;
import com.google.api.ads.adwords.axis.v201609.cm.TargetingSettingDetail;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example adds ad groups to a campaign. To get campaigns, run
 * GetCampaigns.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddAdGroups {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

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

    // Optional settings.

    // Targeting restriction settings. Depending on the criterionTypeGroup
    // value, most TargetingSettingDetail only affect Display campaigns.
    // However, the USER_INTEREST_AND_LIST value works for RLSA campaigns -
    // Search campaigns targeting using a remarketing list.
    TargetingSetting targeting = new TargetingSetting();

    // Restricting to serve ads that match your ad group placements.
    // This is equivalent to choosing "Target and bid" in the UI.
    TargetingSettingDetail placements = new TargetingSettingDetail();
    placements.setCriterionTypeGroup(CriterionTypeGroup.PLACEMENT);
    placements.setTargetAll(Boolean.FALSE);

    // Using your ad group verticals only for bidding. This is equivalent
    // to choosing "Bid only" in the UI.
    TargetingSettingDetail verticals = new TargetingSettingDetail();
    verticals.setCriterionTypeGroup(CriterionTypeGroup.VERTICAL);
    verticals.setTargetAll(Boolean.TRUE);

    targeting.setDetails(new TargetingSettingDetail[] {placements, verticals});
    adGroup.setSettings(new Setting[] {targeting});

    // Create ad group bid.
    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    CpcBid bid = new CpcBid();
    bid.setBid(new Money(null, 10000000L));
    biddingStrategyConfiguration.setBids(new Bids[] {bid});
    adGroup.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    // Add as many additional ad groups as you need.
    AdGroup adGroup2 = new AdGroup();
    adGroup2.setName("Earth to Venus Cruises #" + System.currentTimeMillis());
    adGroup2.setStatus(AdGroupStatus.ENABLED);
    adGroup2.setCampaignId(campaignId);

    BiddingStrategyConfiguration biddingStrategyConfiguration2 = new BiddingStrategyConfiguration();
    CpcBid bid2 = new CpcBid();
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
      System.out.printf("Ad group with name '%s' and ID %d was added.%n",
          adGroupResult.getName(), adGroupResult.getId());
    }
  }
}
