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

package adwords.axis.v201705.shoppingcampaigns;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201705.shopping.ProductDimensions;
import com.google.api.ads.adwords.axis.utils.v201705.shopping.ProductPartitionNode;
import com.google.api.ads.adwords.axis.utils.v201705.shopping.ProductPartitionTree;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupOperation;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupReturnValue;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupType;
import com.google.api.ads.adwords.axis.v201705.cm.AdvertisingChannelType;
import com.google.api.ads.adwords.axis.v201705.cm.ApiException;
import com.google.api.ads.adwords.axis.v201705.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201705.cm.BiddingStrategyType;
import com.google.api.ads.adwords.axis.v201705.cm.Bids;
import com.google.api.ads.adwords.axis.v201705.cm.Budget;
import com.google.api.ads.adwords.axis.v201705.cm.Campaign;
import com.google.api.ads.adwords.axis.v201705.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201705.cm.CampaignReturnValue;
import com.google.api.ads.adwords.axis.v201705.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.CampaignStatus;
import com.google.api.ads.adwords.axis.v201705.cm.CpcBid;
import com.google.api.ads.adwords.axis.v201705.cm.Image;
import com.google.api.ads.adwords.axis.v201705.cm.Media;
import com.google.api.ads.adwords.axis.v201705.cm.MediaMediaType;
import com.google.api.ads.adwords.axis.v201705.cm.MediaServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.Money;
import com.google.api.ads.adwords.axis.v201705.cm.Operator;
import com.google.api.ads.adwords.axis.v201705.cm.ProductCanonicalConditionCondition;
import com.google.api.ads.adwords.axis.v201705.cm.Setting;
import com.google.api.ads.adwords.axis.v201705.cm.ShoppingSetting;
import com.google.api.ads.adwords.axis.v201705.cm.ShowcaseAd;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.List;

/**
 * This example adds a Shopping campaign for Showcase ads.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class AddShoppingCampaignForShowcaseAds {
  private static class AddShoppingCampaignForShowcaseAdsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.BUDGET_ID, required = true)
    private Long budgetId;

    @Parameter(names = ArgumentNames.MERCHANT_ID, required = true)
    private Long merchantId;
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential =
        new OfflineCredentials.Builder()
            .forApi(Api.ADWORDS)
            .fromFile()
            .build()
            .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session =
        new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    AddShoppingCampaignForShowcaseAdsParams params = new AddShoppingCampaignForShowcaseAdsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.budgetId = Long.parseLong("INSERT_BUDGET_ID_HERE");
      params.merchantId = Long.parseLong("INSERT_MERCHANT_ID_HERE");
    }

    runExample(adWordsServices, session, params.budgetId, params.merchantId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      Long budgetId,
      Long merchantId)
      throws Exception {
    Campaign campaign = createCampaign(adWordsServices, session, budgetId, merchantId);
    System.out.printf(
        "Campaign with name '%s' and ID %d was added.%n", campaign.getName(), campaign.getId());

    AdGroup adGroup = createAdGroup(adWordsServices, session, campaign);
    System.out.printf(
        "Ad group with name '%s' and ID %d was added.%n", adGroup.getName(), adGroup.getId());

    AdGroupAd adGroupAd = createShowcaseAd(adWordsServices, session, adGroup);
    System.out.printf("Showcase ad with ID %d was added.%n", adGroupAd.getAd().getId());

    ProductPartitionTree partitionTree =
        createProductPartitions(adWordsServices, session, adGroup.getId());
    System.out.printf("Final tree: %s%n", partitionTree);
  }

  /** Creates a Shopping campaign. */
  private static Campaign createCampaign(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      Long budgetId,
      Long merchantId)
      throws RemoteException, ApiException {
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

    return campaignAddResult.getValue(0);
  }

  /** Creates an ad group in the Shopping campaign. */
  private static AdGroup createAdGroup(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Campaign campaign)
      throws RemoteException, ApiException {
    // Get the AdGroupService.
    AdGroupServiceInterface adGroupService =
        adWordsServices.get(session, AdGroupServiceInterface.class);

    // Create ad group.
    AdGroup adGroup = new AdGroup();
    adGroup.setCampaignId(campaign.getId());
    adGroup.setName("Ad Group #" + System.currentTimeMillis());

    // Required: Set the ad group type to SHOPPING_SHOWCASE_ADS.
    adGroup.setAdGroupType(AdGroupType.SHOPPING_SHOWCASE_ADS);

    // Required: Set the ad group's bidding strategy configuration.
    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();

    // Optional: Set the bids.
    Money bidAmount = new Money();
    bidAmount.setMicroAmount(100000L);
    CpcBid cpcBid = new CpcBid();
    cpcBid.setBid(bidAmount);
    biddingStrategyConfiguration.setBids(new Bids[] {cpcBid});

    adGroup.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    // Create operation.
    AdGroupOperation adGroupOperation = new AdGroupOperation();
    adGroupOperation.setOperand(adGroup);
    adGroupOperation.setOperator(Operator.ADD);

    // Make the mutate request.
    AdGroupReturnValue adGroupAddResult =
        adGroupService.mutate(new AdGroupOperation[] {adGroupOperation});

    return adGroupAddResult.getValue(0);
  }

  /** Creates a Showcase ad. */
  private static AdGroupAd createShowcaseAd(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, AdGroup adGroup)
      throws IOException, RemoteException, ApiException {
    // Create the Showcase ad.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);
    ShowcaseAd showcaseAd = new ShowcaseAd();
    showcaseAd.setName("Showcase ad #" + System.currentTimeMillis());
    showcaseAd.setFinalUrls(new String[] {"http://example.com/showcase"});
    showcaseAd.setDisplayUrl("example.com");

    // Required: Set the ad's expanded image.
    Image expandedImage = new Image();
    expandedImage.setMediaId(uploadImage(adWordsServices, session, "https://goo.gl/IfVlpF"));
    showcaseAd.setExpandedImage(expandedImage);

    // Optional: Set the collapsed image.
    Image collapsedImage = new Image();
    collapsedImage.setMediaId(uploadImage(adWordsServices, session, "https://goo.gl/NqTxAE"));
    showcaseAd.setCollapsedImage(collapsedImage);

    // Create ad group ad.
    AdGroupAd adGroupAd = new AdGroupAd();
    adGroupAd.setAdGroupId(adGroup.getId());
    adGroupAd.setAd(showcaseAd);

    // Create operation.
    AdGroupAdOperation adGroupAdOperation = new AdGroupAdOperation();
    adGroupAdOperation.setOperand(adGroupAd);
    adGroupAdOperation.setOperator(Operator.ADD);

    // Make the mutate request.
    AdGroupAdReturnValue adGroupAdAddResult =
        adGroupAdService.mutate(new AdGroupAdOperation[] {adGroupAdOperation});

    return adGroupAdAddResult.getValue(0);
  }

  /** Creates the product partition tree for the ad group. */
  private static ProductPartitionTree createProductPartitions(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Long adGroupId)
      throws ApiException, RemoteException {
    AdGroupCriterionServiceInterface adGroupCriterionService =
        adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

    ProductPartitionTree partitionTree =
        ProductPartitionTree.createAdGroupTree(adWordsServices, session, adGroupId);
    System.out.printf("Original tree: %s%n", partitionTree);

    // Clear out any existing criteria.
    ProductPartitionNode rootNode = partitionTree.getRoot().removeAllChildren();

    // Make the root node a subdivision.
    rootNode = rootNode.asSubdivision();

    // Add a unit node for condition = NEW to include it.
    rootNode
        .addChild(
            ProductDimensions.createCanonicalCondition(ProductCanonicalConditionCondition.NEW))
        .asBiddableUnit();

    // Add a unit node for condition = USED to include it.
    rootNode
        .addChild(
            ProductDimensions.createCanonicalCondition(ProductCanonicalConditionCondition.USED))
        .asBiddableUnit();

    // Exclude everything else.
    rootNode.addChild(ProductDimensions.createCanonicalCondition(null)).asExcludedUnit();

    // Make the mutate request, using the operations returned by the ProductPartitionTree.
    List<AdGroupCriterionOperation> mutateOperations = partitionTree.getMutateOperations();
    if (mutateOperations.isEmpty()) {
      System.out.println(
          "Skipping the mutate call because the original tree and the current "
              + "tree are logically identical.");
    } else {
      adGroupCriterionService.mutate(
          mutateOperations.toArray(new AdGroupCriterionOperation[mutateOperations.size()]));
    }

    // The request was successful, so create a new ProductPartitionTree based on the updated
    // state of the ad group.
    return ProductPartitionTree.createAdGroupTree(adWordsServices, session, adGroupId);
  }

  /** Uploads an image. */
  private static long uploadImage(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, String url)
      throws IOException {
    MediaServiceInterface mediaService = adWordsServices.get(session, MediaServiceInterface.class);

    // Create image.
    Image image = new Image();
    image.setData(com.google.api.ads.common.lib.utils.Media.getMediaDataFromUrl(url));
    image.setType(MediaMediaType.IMAGE);

    Media[] media = new Media[] {image};

    // Upload image.
    Media[] result = mediaService.upload(media);

    return result[0].getMediaId();
  }
}
