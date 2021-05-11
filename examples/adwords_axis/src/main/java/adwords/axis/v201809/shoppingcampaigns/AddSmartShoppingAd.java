// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package adwords.axis.v201809.shoppingcampaigns;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201809.shopping.ProductPartitionTree;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupOperation;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupReturnValue;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupType;
import com.google.api.ads.adwords.axis.v201809.cm.AdvertisingChannelSubType;
import com.google.api.ads.adwords.axis.v201809.cm.AdvertisingChannelType;
import com.google.api.ads.adwords.axis.v201809.cm.ApiError;
import com.google.api.ads.adwords.axis.v201809.cm.ApiException;
import com.google.api.ads.adwords.axis.v201809.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201809.cm.BiddingStrategyType;
import com.google.api.ads.adwords.axis.v201809.cm.Budget;
import com.google.api.ads.adwords.axis.v201809.cm.BudgetBudgetDeliveryMethod;
import com.google.api.ads.adwords.axis.v201809.cm.BudgetOperation;
import com.google.api.ads.adwords.axis.v201809.cm.BudgetServiceInterface;
import com.google.api.ads.adwords.axis.v201809.cm.Campaign;
import com.google.api.ads.adwords.axis.v201809.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201809.cm.CampaignReturnValue;
import com.google.api.ads.adwords.axis.v201809.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201809.cm.CampaignStatus;
import com.google.api.ads.adwords.axis.v201809.cm.GoalOptimizedShoppingAd;
import com.google.api.ads.adwords.axis.v201809.cm.Money;
import com.google.api.ads.adwords.axis.v201809.cm.Operator;
import com.google.api.ads.adwords.axis.v201809.cm.Setting;
import com.google.api.ads.adwords.axis.v201809.cm.ShoppingSetting;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.List;

/**
 * This example adds a Smart Shopping campaign with an ad group and ad group ad.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class AddSmartShoppingAd {
  private static class AddSmartShoppingAdParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.MERCHANT_ID, required = true)
    private Long merchantId;

    @Parameter(
        names = ArgumentNames.CREATE_DEFAULT_PARTITION,
        required = true,
        arity = 1,
        description =
            "If set to true, a default partition will be created. If running the"
                + " AddProductPartitionTree.java example right after this example, make sure this"
                + " stays set to false.")
    private boolean createDefaultPartition;
  }

  public static void main(String[] args) {
    AdWordsSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.ADWORDS)
              .fromFile()
              .build()
              .generateCredential();

      // Construct an AdWordsSession.
      session =
          new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    AddSmartShoppingAdParams params = new AddSmartShoppingAdParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.merchantId = Long.parseLong("INSERT_MERCHANT_ID_HERE");
      params.createDefaultPartition = false;
    }

    try {
      runExample(adWordsServices, session, params.merchantId, params.createDefaultPartition);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the adwords.axis
      // packages will return a meaningful value from toString.
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @param merchantId the Merchant Center ID for the new campaign.
   * @param createDefaultPartition if true, a default product partition for all products will be
   *     created.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      long merchantId,
      boolean createDefaultPartition)
      throws RemoteException {
    Budget budget = createBudget(adWordsServices, session);
    Campaign campaign =
        createSmartShoppingCampaign(adWordsServices, session, budget.getBudgetId(), merchantId);
    AdGroup adGroup = createSmartShoppingAdGroup(adWordsServices, session, campaign.getId());
    createSmartShoppingAd(adWordsServices, session, adGroup.getId());
    if (createDefaultPartition) {
      createDefaultPartition(adWordsServices, session, adGroup.getId());
    }
  }

  /**
   * Creates a non-shared budget for a Smart Shopping campaign. Smart Shopping campaigns support
   * only non-shared budgets.
   */
  private static Budget createBudget(
      AdWordsServicesInterface adWordsServices, AdWordsSession session) throws RemoteException {
    BudgetServiceInterface budgetService =
        adWordsServices.get(session, BudgetServiceInterface.class);

    // Create a budget.
    Budget budget = new Budget();
    budget.setName("Interplanetary Cruise #" + System.currentTimeMillis());
    Money budgetAmount = new Money();
    // This budget equals 50.00 units of your account's currency, e.g.,
    // 50 USD if your currency is USD.
    budgetAmount.setMicroAmount(50_000_000L);
    budget.setAmount(budgetAmount);
    budget.setDeliveryMethod(BudgetBudgetDeliveryMethod.STANDARD);
    // Non-shared budgets are required for Smart Shopping campaigns.
    budget.setIsExplicitlyShared(false);

    // Create operation.
    BudgetOperation budgetOperation = new BudgetOperation();
    budgetOperation.setOperand(budget);
    budgetOperation.setOperator(Operator.ADD);

    // Add the budget.
    Budget newBudget = budgetService.mutate(new BudgetOperation[] {budgetOperation}).getValue(0);
    System.out.printf(
        "Budget with name '%s' and ID %d was added.%n",
        newBudget.getName(), newBudget.getBudgetId());
    return newBudget;
  }

  /** Creates a Smart Shopping campaign. */
  private static Campaign createSmartShoppingCampaign(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      Long budgetId,
      long merchantId)
      throws RemoteException {
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);
    // Create a campaign with required and optional settings.
    Campaign campaign = new Campaign();
    campaign.setName("Smart Shopping campaign #" + System.currentTimeMillis());
    // The advertisingChannelType is what makes this a Shopping campaign.
    campaign.setAdvertisingChannelType(AdvertisingChannelType.SHOPPING);
    // Sets the advertisingChannelSubType to SHOPPING_GOAL_OPTIMIZED_ADS to
    // make this a Smart Shopping campaign.
    campaign.setAdvertisingChannelSubType(AdvertisingChannelSubType.SHOPPING_GOAL_OPTIMIZED_ADS);
    // Recommendation: Set the campaign to PAUSED when creating it to stop
    // the ads from immediately serving. Set to ENABLED once you've added
    // targeting and the ads are ready to serve.
    campaign.setStatus(CampaignStatus.PAUSED);

    // Set a budget.
    Budget budget = new Budget();
    budget.setBudgetId(budgetId);
    campaign.setBudget(budget);

    // Set bidding strategy. Only MAXIMIZE_CONVERSION_VALUE is supported.
    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    biddingStrategyConfiguration.setBiddingStrategyType(
        BiddingStrategyType.MAXIMIZE_CONVERSION_VALUE);
    campaign.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    // All Shopping campaigns need a ShoppingSetting.
    ShoppingSetting shoppingSetting = new ShoppingSetting();
    shoppingSetting.setSalesCountry("US");
    shoppingSetting.setMerchantId(merchantId);
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

    System.out.printf(
        "Smart Shopping campaign with name '%s' and ID %d was added.%n",
        campaign.getName(), campaign.getId());
    return campaign;
  }

  /**
   * Creates a Smart Shopping ad group by setting the ad group type to SHOPPING_GOAL_OPTIMIZED_ADS.
   */
  private static AdGroup createSmartShoppingAdGroup(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, long campaignId)
      throws RemoteException {
    // Get the AdGroupService.
    AdGroupServiceInterface adGroupService =
        adWordsServices.get(session, AdGroupServiceInterface.class);

    // Create ad group.
    AdGroup adGroup = new AdGroup();
    adGroup.setCampaignId(campaignId);
    adGroup.setName("Smart Shopping ad group #" + System.currentTimeMillis());

    // Set the ad group type to SHOPPING_GOAL_OPTIMIZED_ADS.
    adGroup.setAdGroupType(AdGroupType.SHOPPING_GOAL_OPTIMIZED_ADS);

    // Create operation.
    AdGroupOperation adGroupOperation = new AdGroupOperation();
    adGroupOperation.setOperand(adGroup);
    adGroupOperation.setOperator(Operator.ADD);

    // Make the mutate request.
    AdGroupReturnValue adGroupAddResult =
        adGroupService.mutate(new AdGroupOperation[] {adGroupOperation});

    // Display result.
    adGroup = adGroupAddResult.getValue(0);
    System.out.printf(
        "Smart Shopping ad group with name '%s' and ID %d was added.%n",
        adGroup.getName(), adGroup.getId());

    return adGroup;
  }

  /** Creates a Smart Shopping ad. */
  private static void createSmartShoppingAd(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, long adGroupId)
      throws RemoteException {
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    // Create a Smart Shopping ad (Goal-optimized Shopping ad).
    GoalOptimizedShoppingAd smartShoppingAd = new GoalOptimizedShoppingAd();

    // Create ad group ad.
    AdGroupAd adGroupAd = new AdGroupAd();
    adGroupAd.setAdGroupId(adGroupId);
    adGroupAd.setAd(smartShoppingAd);

    // Create operation.
    AdGroupAdOperation adGroupAdOperation = new AdGroupAdOperation();
    adGroupAdOperation.setOperand(adGroupAd);
    adGroupAdOperation.setOperator(Operator.ADD);

    // Make the mutate request.
    AdGroupAdReturnValue adGroupAdAddResult =
        adGroupAdService.mutate(new AdGroupAdOperation[] {adGroupAdOperation});

    // Display result.
    adGroupAd = adGroupAdAddResult.getValue(0);

    System.out.printf("Smart Shopping ad with ID %d was added.%n", adGroupAd.getAd().getId());
  }

  /** Creates a default product partition as an ad group criterion. */
  private static void createDefaultPartition(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, long adGroupId)
      throws RemoteException {
    // Create an ad group criterion for 'All products' using the ProductPartitionTree utility.
    ProductPartitionTree productPartitionTree =
        ProductPartitionTree.createAdGroupTree(adWordsServices, session, adGroupId);
    List<AdGroupCriterionOperation> mutateOperations = productPartitionTree.getMutateOperations();

    // Make the mutate request.
    AdGroupCriterionServiceInterface adGroupCriterionService =
        adWordsServices.get(session, AdGroupCriterionServiceInterface.class);
    AdGroupCriterionReturnValue adGroupCriterionResult =
        adGroupCriterionService.mutate(mutateOperations.toArray(new AdGroupCriterionOperation[0]));

    // Display result.
    for (AdGroupCriterion adGroupCriterion : adGroupCriterionResult.getValue()) {
      System.out.printf(
          "Ad group criterion with ID %d in ad group with ID %d was added.%n",
          adGroupCriterion.getCriterion().getId(), adGroupCriterion.getAdGroupId());
    }
  }
}
