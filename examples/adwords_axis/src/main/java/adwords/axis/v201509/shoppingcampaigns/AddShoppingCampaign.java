// Copyright 2015 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.v201509.shoppingcampaigns;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201509.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201509.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201509.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201509.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201509.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201509.cm.AdGroupOperation;
import com.google.api.ads.adwords.axis.v201509.cm.AdGroupReturnValue;
import com.google.api.ads.adwords.axis.v201509.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201509.cm.AdvertisingChannelType;
import com.google.api.ads.adwords.axis.v201509.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201509.cm.BiddingStrategyType;
import com.google.api.ads.adwords.axis.v201509.cm.Budget;
import com.google.api.ads.adwords.axis.v201509.cm.Campaign;
import com.google.api.ads.adwords.axis.v201509.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201509.cm.CampaignReturnValue;
import com.google.api.ads.adwords.axis.v201509.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201509.cm.Operator;
import com.google.api.ads.adwords.axis.v201509.cm.ProductAd;
import com.google.api.ads.adwords.axis.v201509.cm.Setting;
import com.google.api.ads.adwords.axis.v201509.cm.ShoppingSetting;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example adds a shopping campaign.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddShoppingCampaign {
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

    AdWordsServices adWordsServices = new AdWordsServices();

    Long budgetId = Long.valueOf("INSERT_BUDGET_ID_HERE");
    Long merchantId = Long.valueOf("INSERT_MERCHANT_CENTER_ID_HERE");
    
    runExample(adWordsServices, session, budgetId, merchantId);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session,
      Long budgetId, Long merchantId) throws Exception {
    // Get the CampaignService
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    // Create campaign.
    Campaign campaign = new Campaign();
    campaign.setName("Shopping campaign #" + System.currentTimeMillis());
    // The advertisingChannelType is what makes this a Shopping campaign
    campaign.setAdvertisingChannelType(AdvertisingChannelType.SHOPPING);

    // Set shared budget (required).
    Budget budget = new Budget();
    budget.setBudgetId(budgetId);
    campaign.setBudget(budget);

    // Set bidding strategy (required).
    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    biddingStrategyConfiguration.setBiddingStrategyType(BiddingStrategyType.MANUAL_CPC);
    campaign.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    // All Shopping campaigns need a ShoppingSetting.
    ShoppingSetting shoppingSetting = new ShoppingSetting();
    shoppingSetting.setSalesCountry("US");
    shoppingSetting.setCampaignPriority(0);
    shoppingSetting.setMerchantId(merchantId);
    
    // Set to 'true' to enable Local Inventory Ads in your campaign.
    shoppingSetting.setEnableLocal(true);
    
    campaign.setSettings(new Setting[] {shoppingSetting});

    // Create operation.
    CampaignOperation campaignOperation = new CampaignOperation();
    campaignOperation.setOperand(campaign);
    campaignOperation.setOperator(Operator.ADD);

    // Make the mutate request.
    CampaignReturnValue campaignAddResult =
        campaignService.mutate(new CampaignOperation[] {campaignOperation});

    // Display result.
    campaign = campaignAddResult.getValue(0);

    System.out.printf("Campaign with name '%s' and ID %d was added.%n", campaign.getName(),
        campaign.getId());

    // Get the AdGroupService.
    AdGroupServiceInterface adGroupService =
        adWordsServices.get(session, AdGroupServiceInterface.class);

    // Create ad group.
    AdGroup adGroup = new AdGroup();
    adGroup.setCampaignId(campaign.getId());
    adGroup.setName("Ad Group #" + System.currentTimeMillis());

    // Create operation.
    AdGroupOperation adGroupOperation = new AdGroupOperation();
    adGroupOperation.setOperand(adGroup);
    adGroupOperation.setOperator(Operator.ADD);

    // Make the mutate request.
    AdGroupReturnValue adGroupAddResult =
        adGroupService.mutate(new AdGroupOperation[] {adGroupOperation});

    // Display result.
    adGroup = adGroupAddResult.getValue(0);
    System.out.printf("Ad group with name '%s' and ID %d was added.%n", adGroup.getName(),
        adGroup.getId());

    // Create product ad.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);
    ProductAd productAd = new ProductAd();

    // Create ad group ad.
    AdGroupAd adGroupAd = new AdGroupAd();
    adGroupAd.setAdGroupId(adGroup.getId());
    adGroupAd.setAd(productAd);

    // Create operation.
    AdGroupAdOperation adGroupAdOperation = new AdGroupAdOperation();
    adGroupAdOperation.setOperand(adGroupAd);
    adGroupAdOperation.setOperator(Operator.ADD);

    // Make the mutate request.
    AdGroupAdReturnValue adGroupAdAddResult =
        adGroupAdService.mutate(new AdGroupAdOperation[] {adGroupAdOperation});

    // Display result.
    adGroupAd = adGroupAdAddResult.getValue(0);

    System.out.printf("Product ad with ID %d was added.%n", adGroupAd.getAd().getId());
  }
}
