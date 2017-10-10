// Copyright 2017 Google Inc. All Rights Reserved.
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

package adwords.axis.v201710.shoppingcampaigns;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201710.shopping.ProductPartitionTree;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupOperation;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.AdvertisingChannelType;
import com.google.api.ads.adwords.axis.v201710.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201710.cm.BiddingStrategyType;
import com.google.api.ads.adwords.axis.v201710.cm.Budget;
import com.google.api.ads.adwords.axis.v201710.cm.Campaign;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignStatus;
import com.google.api.ads.adwords.axis.v201710.cm.Operator;
import com.google.api.ads.adwords.axis.v201710.cm.ProductAd;
import com.google.api.ads.adwords.axis.v201710.cm.Setting;
import com.google.api.ads.adwords.axis.v201710.cm.ShoppingSetting;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.util.List;

/**
 * This example adds a shopping campaign.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddShoppingCampaign {
  private static class AddShoppingCampaignParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.BUDGET_ID, required = true)
    private Long budgetId;

    @Parameter(names = ArgumentNames.MERCHANT_ID, required = true)
    private Long merchantId;

    @Parameter(names = ArgumentNames.CREATE_DEFAULT_PARTITION, required = true, arity = 1,
        description = "If set to true, a default partition will be created. If running the"
            + " AddProductPartitionTree.java example right after this example, make sure this stays"
            + " set to false.")
    private boolean createDefaultPartition;
  }

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

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    AddShoppingCampaignParams params = new AddShoppingCampaignParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.budgetId = Long.parseLong("INSERT_BUDGET_ID_HERE");
      params.merchantId = Long.parseLong("INSERT_MERCHANT_ID_HERE");
      params.createDefaultPartition = false;
    }

    runExample(adWordsServices, session, params.budgetId, params.merchantId,
        params.createDefaultPartition);
  }

  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session,
      Long budgetId, Long merchantId, boolean createDefaultPartition) throws Exception {
    // Get the CampaignService
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    // Create campaign.
    Campaign campaign = new Campaign();
    campaign.setName("Shopping campaign #" + System.currentTimeMillis());
    // The advertisingChannelType is what makes this a Shopping campaign
    campaign.setAdvertisingChannelType(AdvertisingChannelType.SHOPPING);

    // Recommendation: Set the campaign to PAUSED when creating it to prevent
    // the ads from immediately serving. Set to ENABLED once you've added
    // targeting and the ads are ready to serve.
    campaign.setStatus(CampaignStatus.PAUSED);

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

    if (createDefaultPartition) {
      // Create an ad group criterion for 'All products' using the ProductPartitionTree utility.
      ProductPartitionTree productPartitionTree =
          ProductPartitionTree.createAdGroupTree(adWordsServices, session, adGroup.getId());
      productPartitionTree
          .getRoot()
          .asBiddableUnit()
          .setBid(500000L);
      List<AdGroupCriterionOperation> mutateOperations = productPartitionTree.getMutateOperations();

      // Make the mutate request.
      AdGroupCriterionServiceInterface adGroupCriterionService =
          adWordsServices.get(session, AdGroupCriterionServiceInterface.class);
      AdGroupCriterionReturnValue adGroupCriterionResult =
          adGroupCriterionService.mutate(
              mutateOperations.toArray(new AdGroupCriterionOperation[0]));

      // Display result.
      for (AdGroupCriterion adGroupCriterion : adGroupCriterionResult.getValue()) {
        System.out.printf(
            "Ad group criterion with ID %d in ad group with ID %d was added.%n",
            adGroupCriterion.getCriterion().getId(), adGroupCriterion.getAdGroupId());
      }
    }
  }
}
