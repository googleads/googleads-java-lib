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

package adwords.axis.v201710.advancedoperations;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.AdvertisingChannelType;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201710.cm.BiddingStrategyOperation;
import com.google.api.ads.adwords.axis.v201710.cm.BiddingStrategyReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.BiddingStrategyServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.Budget;
import com.google.api.ads.adwords.axis.v201710.cm.BudgetBudgetDeliveryMethod;
import com.google.api.ads.adwords.axis.v201710.cm.BudgetOperation;
import com.google.api.ads.adwords.axis.v201710.cm.BudgetReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.BudgetServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.Campaign;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignStatus;
import com.google.api.ads.adwords.axis.v201710.cm.Money;
import com.google.api.ads.adwords.axis.v201710.cm.NetworkSetting;
import com.google.api.ads.adwords.axis.v201710.cm.Operator;
import com.google.api.ads.adwords.axis.v201710.cm.SharedBiddingStrategy;
import com.google.api.ads.adwords.axis.v201710.cm.TargetSpendBiddingScheme;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import javax.annotation.Nullable;

/**
 * This example adds a portfolio bidding strategy and uses it to construct a campaign.
 */
public class UsePortfolioBiddingStrategy {

  // Optional: If you'd like to use an existing shared budget, assign a
  //           shared budget ID here.
  private static final Long SHARED_BUDGET_ID = null; 
  
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
      runExample(adWordsServices, session, SHARED_BUDGET_ID);
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
   * @param sharedBudgetId the ID of the shared budget to use. If null, this example will create a
   *     new shared budget.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      @Nullable Long sharedBudgetId)
      throws RemoteException {
    SharedBiddingStrategy portfolioBiddingStrategy =
        createBiddingStrategy(adWordsServices, session);
    if (sharedBudgetId == null) {
      Budget budget = createSharedBudget(adWordsServices, session);
      sharedBudgetId = budget.getBudgetId();
    }
    createCampaignWithBiddingStrategy(adWordsServices, session, portfolioBiddingStrategy.getId(), 
        sharedBudgetId);
  }

  /**
   * Creates the bidding strategy object.
   *
   * @param adWordsServices the user to run the example with
   * @param session the AdWordsSession
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  private static SharedBiddingStrategy createBiddingStrategy(
      AdWordsServicesInterface adWordsServices, AdWordsSession session) throws RemoteException {
    // Get the BiddingStrategyService, which loads the required classes.
    BiddingStrategyServiceInterface biddingStrategyService =
        adWordsServices.get(session, BiddingStrategyServiceInterface.class);

    // Create a portfolio bidding strategy.
    SharedBiddingStrategy portfolioBiddingStrategy = new SharedBiddingStrategy();
    portfolioBiddingStrategy.setName("Maximize Clicks" + System.currentTimeMillis());

    TargetSpendBiddingScheme biddingScheme = new TargetSpendBiddingScheme();
    // Optionally set additional bidding scheme parameters.
    biddingScheme.setBidCeiling(new Money(null, 2000000L));
    biddingScheme.setSpendTarget(new Money(null, 20000000L));

    portfolioBiddingStrategy.setBiddingScheme(biddingScheme);

    // Create operation.
    BiddingStrategyOperation operation = new BiddingStrategyOperation();
    operation.setOperand(portfolioBiddingStrategy);
    operation.setOperator(Operator.ADD);

    BiddingStrategyOperation[] operations = new BiddingStrategyOperation[] {operation};
    BiddingStrategyReturnValue result = biddingStrategyService.mutate(operations);

    SharedBiddingStrategy newBiddingStrategy = result.getValue(0);

    System.out.printf(
        "Portfolio bidding strategy with name '%s' and ID %d of type '%s' was created.%n",
        newBiddingStrategy.getName(), newBiddingStrategy.getId(),
        newBiddingStrategy.getBiddingScheme().getBiddingSchemeType());

    return newBiddingStrategy;
  }

  /**
   * Creates an explicit budget to be used only to create the Campaign.
   *
   * @param adWordsServices the user to run the example with
   * @param session the AdWordsSession
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  private static Budget createSharedBudget(
      AdWordsServicesInterface adWordsServices, AdWordsSession session) throws RemoteException {
    // Get the BudgetService, which loads the required classes.
    BudgetServiceInterface budgetService =
        adWordsServices.get(session, BudgetServiceInterface.class);

    // Create a shared budget.
    Budget budget = new Budget();
    budget.setName("Shared Interplanetary Budget #" + System.currentTimeMillis());
    budget.setAmount(new Money(null, 50000000L));
    budget.setDeliveryMethod(BudgetBudgetDeliveryMethod.STANDARD);
    budget.setIsExplicitlyShared(true);

    BudgetOperation operation = new BudgetOperation();
    operation.setOperand(budget);
    operation.setOperator(Operator.ADD);

    BudgetOperation[] operations = new BudgetOperation[] {operation};

    // Make the mutate request.
    BudgetReturnValue result = budgetService.mutate(operations);
    Budget newBudget = result.getValue(0);

    System.out.printf("Budget with name '%s', ID %d was created.%n", newBudget.getName(),
        newBudget.getBudgetId());

    return newBudget;
  }

  /**
   * Create a Campaign with a portfolio bidding strategy.
   *
   * @param adWordsServices the user to run the example with
   * @param session the AdWordsSession
   * @param biddingStrategyId the bidding strategy id to use
   * @param sharedBudgetId the shared budget id to use
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  private static Campaign createCampaignWithBiddingStrategy(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      Long biddingStrategyId,
      Long sharedBudgetId)
      throws RemoteException {
    // Get the CampaignService, which loads the required classes.
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    // Create campaign.
    Campaign campaign = new Campaign();
    campaign.setName("Interplanetary Cruise #" + System.currentTimeMillis());

    // Recommendation: Set the campaign to PAUSED when creating it to prevent
    // the ads from immediately serving. Set to ENABLED once you've added
    // targeting and the ads are ready to serve.
    campaign.setStatus(CampaignStatus.PAUSED);

    // Set the budget.
    Budget budget = new Budget();
    budget.setBudgetId(sharedBudgetId);
    campaign.setBudget(budget);

    // Set bidding strategy (required).
    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    biddingStrategyConfiguration.setBiddingStrategyId(biddingStrategyId);

    campaign.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    // Set advertising channel type (required).
    campaign.setAdvertisingChannelType(AdvertisingChannelType.SEARCH);

    // Set network targeting (recommended).
    NetworkSetting networkSetting = new NetworkSetting();
    networkSetting.setTargetGoogleSearch(true);
    networkSetting.setTargetSearchNetwork(true);
    networkSetting.setTargetContentNetwork(true);
    campaign.setNetworkSetting(networkSetting);

    // Create operation.
    CampaignOperation operation = new CampaignOperation();
    operation.setOperand(campaign);
    operation.setOperator(Operator.ADD);

    CampaignReturnValue result = campaignService.mutate(new CampaignOperation[] {operation});
    Campaign newCampaign = result.getValue(0);

    System.out.printf("Campaign with name '%s', ID %d and bidding scheme ID %d was created.%n",
        newCampaign.getName(), newCampaign.getId(),
        newCampaign.getBiddingStrategyConfiguration().getBiddingStrategyId());

    return newCampaign;
  }
}
