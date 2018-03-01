// Copyright 2018 Google Inc. All Rights Reserved.
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

package adwords.axis.v201710.advancedoperations;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupOperation;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupStatus;
import com.google.api.ads.adwords.axis.v201710.cm.AdvertisingChannelType;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201710.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201710.cm.BiddingStrategyType;
import com.google.api.ads.adwords.axis.v201710.cm.Budget;
import com.google.api.ads.adwords.axis.v201710.cm.Campaign;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignStatus;
import com.google.api.ads.adwords.axis.v201710.cm.CriterionUserList;
import com.google.api.ads.adwords.axis.v201710.cm.DynamicSettings;
import com.google.api.ads.adwords.axis.v201710.cm.Image;
import com.google.api.ads.adwords.axis.v201710.cm.Media;
import com.google.api.ads.adwords.axis.v201710.cm.MediaMediaType;
import com.google.api.ads.adwords.axis.v201710.cm.MediaServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.Operator;
import com.google.api.ads.adwords.axis.v201710.cm.ResponsiveDisplayAd;
import com.google.api.ads.adwords.axis.v201710.cm.Setting;
import com.google.api.ads.adwords.axis.v201710.cm.ShoppingPurchasePlatform;
import com.google.api.ads.adwords.axis.v201710.cm.ShoppingSetting;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.client.AdWordsSession.Builder;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.io.IOException;
import java.rmi.RemoteException;


/**
 * This example adds a Shopping dynamic remarketing campaign for the Display Network via the
 * following steps:
 *
 * <ul>
 *   <li>Creates a new Display Network campaign.
 *   <li>Links the campaign with Merchant Center.
 *   <li>Links the user list to the ad group.
 *   <li>Creates a responsive display ad to render the dynamic text.
 * </ul>
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class AddShoppingDynamicRemarketingCampaign {

  private static class AddShoppingDynamicRemarketingCampaignParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.MERCHANT_ID, required = true)
    private long merchantId;

    @Parameter(names = ArgumentNames.BUDGET_ID, required = true)
    private long budgetId;

    @Parameter(names = ArgumentNames.USER_LIST_ID, required = true)
    private long userListId;
  }

  public static void main(String[] args) {
    final AdWordsServicesInterface services = AdWordsServices.getInstance();
    AdWordsSession session;

    try {
      Credential oAuth2Credential;
      oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(OfflineCredentials.Api.ADWORDS)
              .fromFile()
              .build()
              .generateCredential();
      session = new Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file%n", DEFAULT_CONFIGURATION_FILENAME);
      return;
    } catch (ValidationException ve) {
      System.err.printf("Invalid configuration in the %s file%n", DEFAULT_CONFIGURATION_FILENAME);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file%n",
          DEFAULT_CONFIGURATION_FILENAME);
      return;
    }

    final AddShoppingDynamicRemarketingCampaignParams params =
        new AddShoppingDynamicRemarketingCampaignParams();
    if (!params.parseArguments(args)) {
      params.merchantId = Long.parseLong("INSERT_MERCHANT_ID");
      params.budgetId = Long.parseLong("INSERT_BUDGET_ID");
      params.userListId = Long.parseLong("INSERT_USER_LIST_ID");
    }

    try {
      runExample(services, session, params.merchantId, params.budgetId, params.userListId);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the adwords.axis
      // packages will return a meaningful value from toString.
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.print("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    } catch (IOException e) {
      System.err.printf("Request failed unexpectedly due to IOException: %s%n", e);
    }
  }

  /**
   * Runs the example.
   *
   * @param services the services factory.
   * @param session the session.
   * @param merchantId the ID of the merchant center account from which to source product feed data.
   * @param budgetId the ID of a shared budget to associate with the campaign.
   * @param userListId the ID of a user list to target.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   * @throws IOException if the ad images failed to load.
   */
  private static void runExample(
      AdWordsServicesInterface services,
      AdWordsSession session,
      long merchantId,
      long budgetId,
      long userListId)
      throws IOException {
    Campaign campaign = createCampaign(services, session, merchantId, budgetId);
    System.out.printf(
        "Campaign with name '%s' and ID %d was added.%n", campaign.getName(), campaign.getId());

    AdGroup adGroup = createAdGroup(services, session, campaign);
    System.out.printf(
        "Ad group with name '%s' and ID %d was added.%n", adGroup.getName(), adGroup.getId());

    AdGroupAd adGroupAd = createAd(services, session, adGroup);
    System.out.printf("Responsive display ad with ID %d was added.%n", adGroupAd.getAd().getId());

    attachUserList(services, session, adGroup, userListId);
    System.out.printf(
        "User list with ID %d was attached to ad group with ID %d.%n", userListId, adGroup.getId());
  }

  /**
   * Creates a Shopping dynamic remarketing campaign object (not including ad group level and
   * below). This creates a Display campaign with the merchant center feed attached. Merchant Center
   * is used for the product information in combination with a user list which contains hits with
   * {@code ecomm_prodid} specified. See <a
   * href="https://developers.google.com/adwords-remarketing-tag/parameters#retail"/>for more
   * detail.
   *
   * @param merchantId the ID of the Merchant Center account.
   * @param budgetId the ID of the budget to use for the campaign.
   * @return the campaign that was created.
   */
  private static Campaign createCampaign(
      AdWordsServicesInterface services, AdWordsSession session, long merchantId, long budgetId)
      throws RemoteException {
    CampaignServiceInterface campaignService =
        services.get(session, CampaignServiceInterface.class);

    Campaign campaign = new Campaign();
    campaign.setName("Shopping campaign #" + System.currentTimeMillis());
    // Dynamic remarketing campaigns are only available on the Google Display Network.
    campaign.setAdvertisingChannelType(AdvertisingChannelType.DISPLAY);
    campaign.setStatus(CampaignStatus.PAUSED);

    Budget budget = new Budget();
    budget.setBudgetId(budgetId);
    campaign.setBudget(budget);

    // This example uses a Manual CPC bidding strategy, but you should select the strategy that best
    // aligns with your sales goals. More details here:
    //   https://support.google.com/adwords/answer/2472725
    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    biddingStrategyConfiguration.setBiddingStrategyType(BiddingStrategyType.MANUAL_CPC);
    campaign.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    ShoppingSetting setting = new ShoppingSetting();
    // Campaigns with numerically higher priorities take precedence over those with lower
    // priorities.
    setting.setCampaignPriority(0);

    // Set the Merchant Center account ID from which to source products.
    setting.setMerchantId(merchantId);

    // Display Network campaigns do not support partition by country. The only supported value is
    // "ZZ". This signals that products from all countries are available in the campaign. The actual
    // products which serve are based on the products tagged in the user list entry.
    setting.setSalesCountry("ZZ");

    // Optional: Enable local inventory ads (items for sale in physical stores.)
    setting.setEnableLocal(true);

    // Optional: Declare whether purchases are only made on the merchant store, or completed on
    // Google.
    setting.setPurchasePlatform(ShoppingPurchasePlatform.MERCHANT);

    campaign.setSettings(new Setting[] {setting});

    CampaignOperation op = new CampaignOperation();
    op.setOperand(campaign);
    op.setOperator(Operator.ADD);

    CampaignReturnValue result = campaignService.mutate(new CampaignOperation[] {op});
    return result.getValue(0);
  }

  /**
   * Creates an ad group in the specified campaign.
   *
   * @param campaign the campaign to which the ad group should be attached.
   * @return the ad group that was created.
   */
  private static AdGroup createAdGroup(
      AdWordsServicesInterface services, AdWordsSession session, Campaign campaign)
      throws RemoteException {
    AdGroupServiceInterface adGroupService = services.get(session, AdGroupServiceInterface.class);

    AdGroup group = new AdGroup();
    group.setName("Dynamic remarketing ad group");
    group.setCampaignId(campaign.getId());
    group.setStatus(AdGroupStatus.ENABLED);

    AdGroupOperation op = new AdGroupOperation();
    op.setOperand(group);
    op.setOperator(Operator.ADD);
    AdGroupReturnValue result = adGroupService.mutate(new AdGroupOperation[] {op});
    return result.getValue(0);
  }

  /**
   * Attach a user list to an ad group. The user list provides positive targeting and feed
   * information to drive the dynamic content of the ad.
   *
   * <p>Note: User lists must be attached at the ad group level for positive targeting in Shopping
   * dynamic remarketing campaigns.
   *
   * @param adGroup the ad group which will have the user list attached.
   * @param userListId the user list to use for targeting and dynamic content.
   */
  private static void attachUserList(
      AdWordsServicesInterface services, AdWordsSession session, AdGroup adGroup, long userListId)
      throws RemoteException {
    AdGroupCriterionServiceInterface adGroupCriterionService =
        services.get(session, AdGroupCriterionServiceInterface.class);

    CriterionUserList userList = new CriterionUserList();
    userList.setUserListId(userListId);
    BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();
    adGroupCriterion.setCriterion(userList);
    adGroupCriterion.setAdGroupId(adGroup.getId());

    AdGroupCriterionOperation op = new AdGroupCriterionOperation();
    op.setOperand(adGroupCriterion);
    op.setOperator(Operator.ADD);

    adGroupCriterionService.mutate(new AdGroupCriterionOperation[] {op});
  }

  /**
   * Creates an ad for serving dynamic content in a remarketing campaign.
   *
   * @param adGroup the ad group under which to create the ad.
   * @return the ad that was created.
   * @throws IOException if an image was not able to be loaded.
   */
  private static AdGroupAd createAd(
      AdWordsServicesInterface services, AdWordsSession session, AdGroup adGroup)
      throws IOException {
    AdGroupAdServiceInterface adService = services.get(session, AdGroupAdServiceInterface.class);

    ResponsiveDisplayAd ad = new ResponsiveDisplayAd();

    // This ad format does not allow the creation of an image using the
    // Image.data field. An image must first be created using the MediaService,
    // and Image.mediaId must be populated when creating the ad.
    ad.setMarketingImage(uploadImage(services, session, "https://goo.gl/3b9Wfh"));

    ad.setShortHeadline("Travel");
    ad.setLongHeadline("Travel the World");
    ad.setDescription("Take to the air!");
    ad.setBusinessName("Interplanetary Cruises");
    ad.setFinalUrls(new String[] {"http://www.example.com/"});

    // Optional: Call to action text.
    // Valid texts: https://support.google.com/adwords/answer/7005917
    ad.setCallToActionText("Apply Now");

    // Optional: Set dynamic display ad settings, composed of landscape logo
    // image, promotion text, and price prefix.
    DynamicSettings dynamicDisplayAdSettings = createDynamicDisplayAdSettings(services, session);
    ad.setDynamicDisplayAdSettings(dynamicDisplayAdSettings);

    Image optionalImage = uploadImage(services, session, "https://goo.gl/mtt54n");

    // Optional: Create a logo image and set it to the ad.
    ad.setLogoImage(optionalImage);

    // Optional: Create a square marketing image and set it to the ad.
    ad.setSquareMarketingImage(optionalImage);

    // Whitelisted accounts only: Set color settings using hexadecimal values.
    // Set allowFlexibleColor to false if you want your ads to render by always
    // using your colors strictly.
    /*
    ad.setMainColor("#0000ff");
    ad.setAccentColor("#ffff00");
    ad.setAllowFlexibleColor(false);
    */

    // Whitelisted accounts only: Set the format setting that the ad will be
    // served in.
    /*
    ad.setFormatSetting(
        com.google.api.ads.adwords.axis.v201710.cm.DisplayAdFormatSetting.NON_NATIVE);
    */

    AdGroupAd adGroupAd = new AdGroupAd();
    adGroupAd.setAd(ad);
    adGroupAd.setAdGroupId(adGroup.getId());

    AdGroupAdOperation op = new AdGroupAdOperation();
    op.setOperand(adGroupAd);
    op.setOperator(Operator.ADD);

    AdGroupAdReturnValue result = adService.mutate(new AdGroupAdOperation[] {op});
    return result.getValue(0);
  }

  /**
   * Creates the additional content (images, promo text, etc.) supported by dynamic ads.
   *
   * @return the DynamicSettings object to be used.
   */
  private static DynamicSettings createDynamicDisplayAdSettings(
      AdWordsServicesInterface services, AdWordsSession session) throws IOException {
    Image logo = uploadImage(services, session, "https://goo.gl/dEvQeF");

    DynamicSettings dynamicSettings = new DynamicSettings();
    dynamicSettings.setLandscapeLogoImage(logo);
    dynamicSettings.setPricePrefix("as low as");
    dynamicSettings.setPromoText("Free shipping!");
    return dynamicSettings;
  }

  /**
   * Uploads the image from the specified {@code url}.
   *
   * @return the {@code Image} that was uploaded.
   * @throws IOException if the image cannot be loaded.
   */
  private static Image uploadImage(
      AdWordsServicesInterface services, AdWordsSession session, String url) throws IOException {
    Image image = new Image();
    image.setType(MediaMediaType.IMAGE);
    image.setData(com.google.api.ads.common.lib.utils.Media.getMediaDataFromUrl(url));
    MediaServiceInterface mediaService = services.get(session, MediaServiceInterface.class);

    return (Image) mediaService.upload(new Media[] {image})[0];
  }
}
