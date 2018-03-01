// Copyright 2017 Google Inc. All Rights Reserved.
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

package adwords.axis.v201802.advancedoperations;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupOperation;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupStatus;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupType;
import com.google.api.ads.adwords.axis.v201802.cm.AdvertisingChannelType;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
import com.google.api.ads.adwords.axis.v201802.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyType;
import com.google.api.ads.adwords.axis.v201802.cm.Bids;
import com.google.api.ads.adwords.axis.v201802.cm.Budget;
import com.google.api.ads.adwords.axis.v201802.cm.BudgetBudgetDeliveryMethod;
import com.google.api.ads.adwords.axis.v201802.cm.BudgetOperation;
import com.google.api.ads.adwords.axis.v201802.cm.BudgetServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.Campaign;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignStatus;
import com.google.api.ads.adwords.axis.v201802.cm.CpcBid;
import com.google.api.ads.adwords.axis.v201802.cm.DynamicSearchAdsSetting;
import com.google.api.ads.adwords.axis.v201802.cm.ExpandedDynamicSearchAd;
import com.google.api.ads.adwords.axis.v201802.cm.Money;
import com.google.api.ads.adwords.axis.v201802.cm.Operator;
import com.google.api.ads.adwords.axis.v201802.cm.Setting;
import com.google.api.ads.adwords.axis.v201802.cm.UserStatus;
import com.google.api.ads.adwords.axis.v201802.cm.Webpage;
import com.google.api.ads.adwords.axis.v201802.cm.WebpageCondition;
import com.google.api.ads.adwords.axis.v201802.cm.WebpageConditionOperand;
import com.google.api.ads.adwords.axis.v201802.cm.WebpageParameter;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import org.joda.time.DateTime;

/**
 * This code example adds a Dynamic Search Ads campaign. To get campaigns, run GetCampaigns.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class AddDynamicSearchAdsCampaign {

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

    try {
      runExample(adWordsServices, session);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the adwords.axis
      // packages will return a meaningful value from toString
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
      System.err.printf(
          "Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws RemoteException {
    Budget budget = createBudget(adWordsServices, session);

    Campaign campaign = createCampaign(adWordsServices, session, budget);
    AdGroup adGroup = createAdGroup(adWordsServices, session, campaign);
    createExpandedDSA(adWordsServices, session, adGroup);
    addWebPageCriteria(adWordsServices, session, adGroup);
  }

  /** Creates the campaign. */
  private static Campaign createCampaign(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Budget budget)
      throws RemoteException, ApiException {
    // Get the CampaignService.
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    // Create campaign.
    Campaign campaign = new Campaign();
    campaign.setName("Interplanetary Cruise #" + System.currentTimeMillis());
    campaign.setAdvertisingChannelType(AdvertisingChannelType.SEARCH);

    // Recommendation: Set the campaign to PAUSED when creating it to prevent
    // the ads from immediately serving. Set to ENABLED once you've added
    // targeting and the ads are ready to serve.
    campaign.setStatus(CampaignStatus.PAUSED);

    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    biddingStrategyConfiguration.setBiddingStrategyType(BiddingStrategyType.MANUAL_CPC);
    campaign.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    // Only the budgetId should be sent, all other fields will be ignored by CampaignService.
    Budget campaignBudget = new Budget();
    campaignBudget.setBudgetId(budget.getBudgetId());
    campaign.setBudget(campaignBudget);

    // Required: Set the campaign's Dynamic Search Ads settings.
    DynamicSearchAdsSetting dynamicSearchAdsSetting = new DynamicSearchAdsSetting();
    // Required: Set the domain name and language.
    dynamicSearchAdsSetting.setDomainName("example.com");
    dynamicSearchAdsSetting.setLanguageCode("en");

    // Set the campaign settings.
    campaign.setSettings(new Setting[] {dynamicSearchAdsSetting});

    // Optional: Set the start date.
    campaign.setStartDate(new DateTime().plusDays(1).toString("yyyyMMdd"));
    // Optional: Set the end date.
    campaign.setEndDate(new DateTime().plusYears(1).toString("yyyyMMdd"));

    // Create the operation.
    CampaignOperation operation = new CampaignOperation();
    operation.setOperand(campaign);
    operation.setOperator(Operator.ADD);

    // Add the campaign.
    Campaign newCampaign = campaignService.mutate(new CampaignOperation[] {operation}).getValue(0);

    // Display the results.
    System.out.printf(
        "Campaign with name '%s' and ID %d was added.%n",
        newCampaign.getName(), newCampaign.getId());

    return newCampaign;
  }

  /** Creates the budget. */
  private static Budget createBudget(
      AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws RemoteException, ApiException {
    // Get the BudgetService.
    BudgetServiceInterface budgetService =
        adWordsServices.get(session, BudgetServiceInterface.class);

    // Create a budget, which can be shared by multiple campaigns.
    Budget sharedBudget = new Budget();
    sharedBudget.setName("Interplanetary Cruise #" + System.currentTimeMillis());
    Money budgetAmount = new Money();
    budgetAmount.setMicroAmount(50000000L);
    sharedBudget.setAmount(budgetAmount);
    sharedBudget.setDeliveryMethod(BudgetBudgetDeliveryMethod.STANDARD);

    BudgetOperation budgetOperation = new BudgetOperation();
    budgetOperation.setOperand(sharedBudget);
    budgetOperation.setOperator(Operator.ADD);

    // Add the budget
    Budget budget = budgetService.mutate(new BudgetOperation[] {budgetOperation}).getValue(0);
    return budget;
  }

  /** Creates the ad group. */
  private static AdGroup createAdGroup(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Campaign campaign)
      throws ApiException, RemoteException {
    // Get the AdGroupService.
    AdGroupServiceInterface adGroupService =
        adWordsServices.get(session, AdGroupServiceInterface.class);

    // Create the ad group.
    AdGroup adGroup = new AdGroup();

    // Required: Set the ad group's type to Dynamic Search Ads.
    adGroup.setAdGroupType(AdGroupType.SEARCH_DYNAMIC_ADS);

    adGroup.setName("Earth to Mars Cruises #" + System.currentTimeMillis());
    adGroup.setCampaignId(campaign.getId());
    adGroup.setStatus(AdGroupStatus.PAUSED);

    // Recommended: Set a tracking URL template for your ad group if you want to use URL
    // tracking software.
    adGroup.setTrackingUrlTemplate("http://tracker.example.com/traveltracker/{escapedlpurl}");
    
    // Set the ad group bids.
    BiddingStrategyConfiguration biddingConfig = new BiddingStrategyConfiguration();

    CpcBid cpcBid = new CpcBid();
    cpcBid.setBid(new Money());
    cpcBid.getBid().setMicroAmount(3000000L);

    biddingConfig.setBids(new Bids[] {cpcBid});

    adGroup.setBiddingStrategyConfiguration(biddingConfig);

    // Create the operation.
    AdGroupOperation operation = new AdGroupOperation();
    operation.setOperand(adGroup);
    operation.setOperator(Operator.ADD);

    AdGroup newAdGroup = adGroupService.mutate(new AdGroupOperation[] {operation}).getValue(0);
    System.out.printf(
        "Ad group with name '%s' and ID %d was added.%n", newAdGroup.getName(), newAdGroup.getId());
    return newAdGroup;
  }

  /** Creates the expanded Dynamic Search Ad. */
  private static void createExpandedDSA(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, AdGroup adGroup)
      throws ApiException, RemoteException {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    // Create the expanded Dynamic Search Ad. This ad will have its headline and final URL
    // auto-generated at serving time according to domain name specific information provided
    // by DynamicSearchAdsSetting at the campaign level.
    ExpandedDynamicSearchAd expandedDSA = new ExpandedDynamicSearchAd();
    // Set the ad description.
    expandedDSA.setDescription("Buy your tickets now!");

    // Create the ad group ad.
    AdGroupAd adGroupAd = new AdGroupAd();
    adGroupAd.setAdGroupId(adGroup.getId());
    adGroupAd.setAd(expandedDSA);

    // Optional: Set the status.
    adGroupAd.setStatus(AdGroupAdStatus.PAUSED);

    // Create the operation.
    AdGroupAdOperation operation = new AdGroupAdOperation();
    operation.setOperator(Operator.ADD);
    operation.setOperand(adGroupAd);

    // Create the ad.
    AdGroupAd newAdGroupAd =
        adGroupAdService.mutate(new AdGroupAdOperation[] {operation}).getValue(0);
    ExpandedDynamicSearchAd newExpandedDSA = (ExpandedDynamicSearchAd) newAdGroupAd.getAd();
    System.out.printf(
        "Expanded Dynamic Search Ad with ID %d and description '%s' was added.%n",
        newExpandedDSA.getId(), newExpandedDSA.getDescription());
  }

  /** Adds a web page criteria to target Dynamic Search Ads. */
  private static void addWebPageCriteria(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, AdGroup adGroup)
      throws ApiException, RemoteException {
    // Get the AdGroupCriterionService.
    AdGroupCriterionServiceInterface adGroupCriterionService =
        adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

    // Create a webpage criterion for special offers.
    WebpageParameter param = new WebpageParameter();
    param.setCriterionName("Special offers");

    WebpageCondition urlCondition = new WebpageCondition();
    urlCondition.setOperand(WebpageConditionOperand.URL);
    urlCondition.setArgument("/specialoffers");

    WebpageCondition titleCondition = new WebpageCondition();
    titleCondition.setOperand(WebpageConditionOperand.PAGE_TITLE);
    titleCondition.setArgument("Special Offer");

    param.setConditions(new WebpageCondition[] {urlCondition, titleCondition});

    Webpage webpage = new Webpage();
    webpage.setParameter(param);

    // Create biddable ad group criterion.
    BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
    biddableAdGroupCriterion.setAdGroupId(adGroup.getId());
    biddableAdGroupCriterion.setCriterion(webpage);
    biddableAdGroupCriterion.setUserStatus(UserStatus.PAUSED);

    // Optional: set a custom bid.
    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    CpcBid bid = new CpcBid();
    bid.setBid(new Money());
    bid.getBid().setMicroAmount(10000000L);
    biddingStrategyConfiguration.setBids(new Bids[] {bid});
    biddableAdGroupCriterion.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    // Create operations.
    AdGroupCriterionOperation operation = new AdGroupCriterionOperation();
    operation.setOperator(Operator.ADD);
    operation.setOperand(biddableAdGroupCriterion);

    // Create the criterion.
    AdGroupCriterion newAdGroupCriterion =
        adGroupCriterionService.mutate(new AdGroupCriterionOperation[] {operation}).getValue(0);

    System.out.printf(
        "Webpage criterion with ID %d was added to ad group ID %d.%n",
        newAdGroupCriterion.getCriterion().getId(), newAdGroupCriterion.getAdGroupId());
  }
}
