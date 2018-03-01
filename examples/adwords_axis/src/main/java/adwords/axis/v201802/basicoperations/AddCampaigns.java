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

package adwords.axis.v201802.basicoperations;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
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
import com.google.api.ads.adwords.axis.v201802.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignReturnValue;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignStatus;
import com.google.api.ads.adwords.axis.v201802.cm.FrequencyCap;
import com.google.api.ads.adwords.axis.v201802.cm.GeoTargetTypeSetting;
import com.google.api.ads.adwords.axis.v201802.cm.GeoTargetTypeSettingPositiveGeoTargetType;
import com.google.api.ads.adwords.axis.v201802.cm.Level;
import com.google.api.ads.adwords.axis.v201802.cm.ManualCpcBiddingScheme;
import com.google.api.ads.adwords.axis.v201802.cm.Money;
import com.google.api.ads.adwords.axis.v201802.cm.NetworkSetting;
import com.google.api.ads.adwords.axis.v201802.cm.Operator;
import com.google.api.ads.adwords.axis.v201802.cm.Setting;
import com.google.api.ads.adwords.axis.v201802.cm.TimeUnit;
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
 * This example adds campaigns.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddCampaigns {

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
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session) throws RemoteException {
    // Get the BudgetService.
    BudgetServiceInterface budgetService =
        adWordsServices.get(session, BudgetServiceInterface.class);

    // Create a budget, which can be shared by multiple campaigns.
    Budget sharedBudget = new Budget();
    sharedBudget.setName("Interplanetary Cruise #" + System.currentTimeMillis());
    Money budgetAmount = new Money();
    budgetAmount.setMicroAmount(50_000_000L);
    sharedBudget.setAmount(budgetAmount);
    sharedBudget.setDeliveryMethod(BudgetBudgetDeliveryMethod.STANDARD);

    BudgetOperation budgetOperation = new BudgetOperation();
    budgetOperation.setOperand(sharedBudget);
    budgetOperation.setOperator(Operator.ADD);

    // Add the budget
    Long budgetId =
        budgetService.mutate(new BudgetOperation[] {budgetOperation}).getValue(0).getBudgetId();

    // Get the CampaignService.
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    // Create campaign.
    Campaign campaign = new Campaign();
    campaign.setName("Interplanetary Cruise #" + System.currentTimeMillis());

    // Recommendation: Set the campaign to PAUSED when creating it to prevent
    // the ads from immediately serving. Set to ENABLED once you've added
    // targeting and the ads are ready to serve.
    campaign.setStatus(CampaignStatus.PAUSED);

    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    biddingStrategyConfiguration.setBiddingStrategyType(BiddingStrategyType.MANUAL_CPC);

    // You can optionally provide a bidding scheme in place of the type.
    ManualCpcBiddingScheme cpcBiddingScheme = new ManualCpcBiddingScheme();
    biddingStrategyConfiguration.setBiddingScheme(cpcBiddingScheme);

    campaign.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    // You can optionally provide these field(s).
    campaign.setStartDate(new DateTime().plusDays(1).toString("yyyyMMdd"));
    campaign.setEndDate(new DateTime().plusDays(30).toString("yyyyMMdd"));
    campaign.setFrequencyCap(new FrequencyCap(5L, TimeUnit.DAY, Level.ADGROUP));

    // Only the budgetId should be sent, all other fields will be ignored by CampaignService.
    Budget budget = new Budget();
    budget.setBudgetId(budgetId);
    campaign.setBudget(budget);

    campaign.setAdvertisingChannelType(AdvertisingChannelType.SEARCH);

    // Set the campaign network options to Search and Search Network.
    NetworkSetting networkSetting = new NetworkSetting();
    networkSetting.setTargetGoogleSearch(true);
    networkSetting.setTargetSearchNetwork(true);
    networkSetting.setTargetContentNetwork(false);
    networkSetting.setTargetPartnerSearchNetwork(false);
    campaign.setNetworkSetting(networkSetting);

    // Set options that are not required.
    GeoTargetTypeSetting geoTarget = new GeoTargetTypeSetting();
    geoTarget.setPositiveGeoTargetType(GeoTargetTypeSettingPositiveGeoTargetType.DONT_CARE);
    campaign.setSettings(new Setting[] {geoTarget});

    // You can create multiple campaigns in a single request.
    Campaign campaign2 = new Campaign();
    campaign2.setName("Interplanetary Cruise banner #" + System.currentTimeMillis());
    campaign2.setStatus(CampaignStatus.PAUSED);
    BiddingStrategyConfiguration biddingStrategyConfiguration2 = new BiddingStrategyConfiguration();
    biddingStrategyConfiguration2.setBiddingStrategyType(BiddingStrategyType.MANUAL_CPC);
    campaign2.setBiddingStrategyConfiguration(biddingStrategyConfiguration2);

    Budget budget2 = new Budget();
    budget2.setBudgetId(budgetId);
    campaign2.setBudget(budget2);

    campaign2.setAdvertisingChannelType(AdvertisingChannelType.DISPLAY);

    // Create operations.
    CampaignOperation operation = new CampaignOperation();
    operation.setOperand(campaign);
    operation.setOperator(Operator.ADD);
    CampaignOperation operation2 = new CampaignOperation();
    operation2.setOperand(campaign2);
    operation2.setOperator(Operator.ADD);

    CampaignOperation[] operations = new CampaignOperation[] {operation, operation2};

    // Add campaigns.
    CampaignReturnValue result = campaignService.mutate(operations);

    // Display campaigns.
    for (Campaign campaignResult : result.getValue()) {
      System.out.printf("Campaign with name '%s' and ID %d was added.%n", campaignResult.getName(),
          campaignResult.getId());
    }
  }
}
