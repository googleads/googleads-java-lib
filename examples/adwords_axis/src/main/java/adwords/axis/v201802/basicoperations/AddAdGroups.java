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

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdRotationMode;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupOperation;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupReturnValue;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupStatus;
import com.google.api.ads.adwords.axis.v201802.cm.AdRotationMode;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
import com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201802.cm.Bids;
import com.google.api.ads.adwords.axis.v201802.cm.CpcBid;
import com.google.api.ads.adwords.axis.v201802.cm.CriterionTypeGroup;
import com.google.api.ads.adwords.axis.v201802.cm.Money;
import com.google.api.ads.adwords.axis.v201802.cm.Operator;
import com.google.api.ads.adwords.axis.v201802.cm.Setting;
import com.google.api.ads.adwords.axis.v201802.cm.TargetingSetting;
import com.google.api.ads.adwords.axis.v201802.cm.TargetingSettingDetail;
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

/**
 * This example adds ad groups to a campaign. To get campaigns, run
 * GetCampaigns.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddAdGroups {

  private static class AddAdGroupsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
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

    AddAdGroupsParams params = new AddAdGroupsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
    }

    try {
      runExample(adWordsServices, session, params.campaignId);
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
   * @param campaignId the ID of the campaign where the ad groups will be created.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, long campaignId)
      throws RemoteException {
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

    // Set the rotation mode.
    AdGroupAdRotationMode rotationMode = new AdGroupAdRotationMode(AdRotationMode.OPTIMIZE);
    adGroup.setAdGroupAdRotationMode(rotationMode);

    // Create ad group bid.
    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    Money cpcBidMoney = new Money();
    cpcBidMoney.setMicroAmount(10_000_000L);
    CpcBid bid = new CpcBid();
    bid.setBid(cpcBidMoney);
    biddingStrategyConfiguration.setBids(new Bids[] {bid});
    adGroup.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    // Add as many additional ad groups as you need.
    AdGroup adGroup2 = new AdGroup();
    adGroup2.setName("Earth to Venus Cruises #" + System.currentTimeMillis());
    adGroup2.setStatus(AdGroupStatus.ENABLED);
    adGroup2.setCampaignId(campaignId);

    BiddingStrategyConfiguration biddingStrategyConfiguration2 = new BiddingStrategyConfiguration();
    Money cpcBidMoney2 = new Money();
    cpcBidMoney2.setMicroAmount(10_000_000L);
    CpcBid bid2 = new CpcBid();
    bid2.setBid(cpcBidMoney2);
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
