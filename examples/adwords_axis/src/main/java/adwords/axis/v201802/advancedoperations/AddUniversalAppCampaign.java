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
import com.google.api.ads.adwords.axis.v201802.cm.AdvertisingChannelSubType;
import com.google.api.ads.adwords.axis.v201802.cm.AdvertisingChannelType;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
import com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyType;
import com.google.api.ads.adwords.axis.v201802.cm.Budget;
import com.google.api.ads.adwords.axis.v201802.cm.BudgetBudgetDeliveryMethod;
import com.google.api.ads.adwords.axis.v201802.cm.BudgetOperation;
import com.google.api.ads.adwords.axis.v201802.cm.BudgetServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.Campaign;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignCriterion;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignCriterionOperation;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignReturnValue;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignStatus;
import com.google.api.ads.adwords.axis.v201802.cm.Criterion;
import com.google.api.ads.adwords.axis.v201802.cm.GeoTargetTypeSetting;
import com.google.api.ads.adwords.axis.v201802.cm.GeoTargetTypeSettingNegativeGeoTargetType;
import com.google.api.ads.adwords.axis.v201802.cm.GeoTargetTypeSettingPositiveGeoTargetType;
import com.google.api.ads.adwords.axis.v201802.cm.Language;
import com.google.api.ads.adwords.axis.v201802.cm.Location;
import com.google.api.ads.adwords.axis.v201802.cm.MobileApplicationVendor;
import com.google.api.ads.adwords.axis.v201802.cm.Money;
import com.google.api.ads.adwords.axis.v201802.cm.Operator;
import com.google.api.ads.adwords.axis.v201802.cm.Setting;
import com.google.api.ads.adwords.axis.v201802.cm.TargetCpaBiddingScheme;
import com.google.api.ads.adwords.axis.v201802.cm.UniversalAppBiddingStrategyGoalType;
import com.google.api.ads.adwords.axis.v201802.cm.UniversalAppCampaignSetting;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;

/**
 * This example adds a universal app campaign. To get campaigns, run GetCampaigns.java. To upload
 * image assets for this campaign, run UploadImage.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class AddUniversalAppCampaign {

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

    // Get the CampaignService.
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    // Create the campaign.
    Campaign campaign = new Campaign();
    campaign.setName("Interplanetary Cruise App #" + System.currentTimeMillis());

    // Recommendation: Set the campaign to PAUSED when creating it to prevent
    // the ads from immediately serving. Set to ENABLED once you've added
    // targeting and the ads are ready to serve.
    campaign.setStatus(CampaignStatus.PAUSED);

    // Set the advertising channel and subchannel types for universal app campaigns.
    campaign.setAdvertisingChannelType(AdvertisingChannelType.MULTI_CHANNEL);
    campaign.setAdvertisingChannelSubType(AdvertisingChannelSubType.UNIVERSAL_APP_CAMPAIGN);

    // Set the campaign's bidding strategy. universal app campaigns
    // only support TARGET_CPA bidding strategy.
    BiddingStrategyConfiguration biddingConfig = new BiddingStrategyConfiguration();
    biddingConfig.setBiddingStrategyType(BiddingStrategyType.TARGET_CPA);

    // Set the target CPA to $1 / app install.
    TargetCpaBiddingScheme biddingScheme = new TargetCpaBiddingScheme();
    biddingScheme.setTargetCpa(new Money());
    biddingScheme.getTargetCpa().setMicroAmount(1000000L);

    biddingConfig.setBiddingScheme(biddingScheme);
    campaign.setBiddingStrategyConfiguration(biddingConfig);

    // Set the campaign's budget.
    campaign.setBudget(new Budget());
    campaign.getBudget().setBudgetId(createBudget(adWordsServices, session));

    // Optional: Set the start date.
    campaign.setStartDate(new DateTime().plusDays(1).toString("yyyyMMdd"));

    // Optional: Set the end date.
    campaign.setEndDate(new DateTime().plusYears(1).toString("yyyyMMdd"));

    // Set the campaign's assets and ad text ideas. These values will be used to
    // generate ads.
    UniversalAppCampaignSetting universalAppSetting = new UniversalAppCampaignSetting();
    universalAppSetting.setAppId("com.labpixies.colordrips");
    universalAppSetting.setAppVendor(MobileApplicationVendor.VENDOR_GOOGLE_MARKET);
    universalAppSetting.setDescription1("A cool puzzle game");
    universalAppSetting.setDescription2("Remove connected blocks");
    universalAppSetting.setDescription3("3 difficulty levels");
    universalAppSetting.setDescription4("4 colorful fun skins");

    // Optional: You can set up to 20 image assets for your campaign.
    // See UploadImage.java for an example on how to upload images.
    //
    // universalAppSetting.setImageMediaIds(new long[] { INSERT_IMAGE_MEDIA_ID_HERE });

    // Optimize this campaign for getting new users for your app.
    universalAppSetting.setUniversalAppBiddingStrategyGoalType(
        UniversalAppBiddingStrategyGoalType.OPTIMIZE_FOR_INSTALL_CONVERSION_VOLUME);

    // If you select the OPTIMIZE_FOR_IN_APP_CONVERSION_VOLUME goal type, then also specify
    // your in-app conversion types so AdWords can focus your campaign on people who are
    // most likely to complete the corresponding in-app actions.
    // Conversion type IDs can be retrieved using ConversionTrackerService.get.
    //
    // campaign.selectiveOptimization = new SelectiveOptimization();
    // campaign.selectiveOptimization.conversionTypeIds =
    //    new long[] { INSERT_CONVERSION_TYPE_ID_1_HERE, INSERT_CONVERSION_TYPE_ID_2_HERE };

    // Optional: Set the campaign settings for Advanced location options.
    GeoTargetTypeSetting geoSetting = new GeoTargetTypeSetting();
    geoSetting.setPositiveGeoTargetType(
        GeoTargetTypeSettingPositiveGeoTargetType.LOCATION_OF_PRESENCE);
    geoSetting.setNegativeGeoTargetType(GeoTargetTypeSettingNegativeGeoTargetType.DONT_CARE);

    campaign.setSettings(new Setting[] {universalAppSetting, geoSetting});

    // Create the operation.
    CampaignOperation operation = new CampaignOperation();
    operation.setOperand(campaign);
    operation.setOperator(Operator.ADD);

    CampaignOperation[] operations = new CampaignOperation[] {operation};

    // Add the campaign.
    CampaignReturnValue result = campaignService.mutate(operations);

    // Display the results.
    for (Campaign newCampaign : result.getValue()) {
      System.out.printf(
          "Universal app campaign with name '%s' and ID %d was added.%n",
          newCampaign.getName(), newCampaign.getId());

      // Optional: Set the campaign's location and language targeting. No other targeting
      // criteria can be used for universal app campaigns.
      setCampaignTargetingCriteria(newCampaign, adWordsServices, session);
    }
  }

  /**
   * Creates the budget for the campaign.
   *
   * @return the new budget.
   */
  private static Long createBudget(AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws RemoteException, ApiException {
    // Get the BudgetService.
    BudgetServiceInterface budgetService =
        adWordsServices.get(session, BudgetServiceInterface.class);

    // Create the campaign budget.
    Budget budget = new Budget();
    budget.setName("Interplanetary Cruise App Budget #" + System.currentTimeMillis());
    Money budgetAmount = new Money();
    budgetAmount.setMicroAmount(50000000L);
    budget.setAmount(budgetAmount);
    budget.setDeliveryMethod(BudgetBudgetDeliveryMethod.STANDARD);

    // Universal app campaigns don't support shared budgets.
    budget.setIsExplicitlyShared(false);
    BudgetOperation budgetOperation = new BudgetOperation();
    budgetOperation.setOperand(budget);
    budgetOperation.setOperator(Operator.ADD);

    // Add the budget
    Budget addedBudget = budgetService.mutate(new BudgetOperation[] {budgetOperation}).getValue(0);
    System.out.printf(
        "Budget with name '%s' and ID %d was created.%n",
        addedBudget.getName(), addedBudget.getBudgetId());
    return addedBudget.getBudgetId();
  }

  /** Sets the campaign's targeting criteria. */
  private static void setCampaignTargetingCriteria(
      Campaign campaign, AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws ApiException, RemoteException {
    // Get the CampaignCriterionService.
    CampaignCriterionServiceInterface campaignCriterionService =
        adWordsServices.get(session, CampaignCriterionServiceInterface.class);

    // Create locations. The IDs can be found in the documentation or
    // retrieved with the LocationCriterionService.
    Location california = new Location();
    california.setId(21137L);

    Location mexico = new Location();
    mexico.setId(2484L);

    // Create languages. The IDs can be found in the documentation or
    // retrieved with the ConstantDataService.
    Language english = new Language();
    english.setId(1000L);

    Language spanish = new Language();
    spanish.setId(1003L);

    List<Criterion> criteria = new ArrayList<>(Arrays.asList(california, mexico, english, spanish));

    // Create operations to add each of the criteria above.
    List<CampaignCriterionOperation> operations = new ArrayList<>();
    for (Criterion criterion : criteria) {
      CampaignCriterionOperation operation = new CampaignCriterionOperation();

      CampaignCriterion campaignCriterion = new CampaignCriterion();
      campaignCriterion.setCampaignId(campaign.getId());
      campaignCriterion.setCriterion(criterion);
      operation.setOperand(campaignCriterion);

      operation.setOperator(Operator.ADD);

      operations.add(operation);
    }

    // Set the campaign targets.
    CampaignCriterionReturnValue returnValue =
        campaignCriterionService.mutate(
            operations.toArray(new CampaignCriterionOperation[operations.size()]));

    if (returnValue != null && returnValue.getValue() != null) {
      // Display added campaign targets.
      for (CampaignCriterion campaignCriterion : returnValue.getValue()) {
        System.out.printf(
            "Campaign criteria of type '%s' and ID %d was added.%n",
            campaignCriterion.getCriterion().getCriterionType(),
            campaignCriterion.getCriterion().getId());
      }
    }
  }
}
