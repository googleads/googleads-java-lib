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

package adwords.axis.v201802.extensions;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import adwords.axis.v201802.basicoperations.AddCampaigns;
import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignExtensionSetting;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignExtensionSettingOperation;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignExtensionSettingReturnValue;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignExtensionSettingServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.DayOfWeek;
import com.google.api.ads.adwords.axis.v201802.cm.ExtensionFeedItem;
import com.google.api.ads.adwords.axis.v201802.cm.ExtensionSetting;
import com.google.api.ads.adwords.axis.v201802.cm.FeedItemDevicePreference;
import com.google.api.ads.adwords.axis.v201802.cm.FeedItemGeoRestriction;
import com.google.api.ads.adwords.axis.v201802.cm.FeedItemSchedule;
import com.google.api.ads.adwords.axis.v201802.cm.FeedItemScheduling;
import com.google.api.ads.adwords.axis.v201802.cm.FeedType;
import com.google.api.ads.adwords.axis.v201802.cm.GeoRestriction;
import com.google.api.ads.adwords.axis.v201802.cm.Keyword;
import com.google.api.ads.adwords.axis.v201802.cm.KeywordMatchType;
import com.google.api.ads.adwords.axis.v201802.cm.Location;
import com.google.api.ads.adwords.axis.v201802.cm.MinuteOfHour;
import com.google.api.ads.adwords.axis.v201802.cm.Operator;
import com.google.api.ads.adwords.axis.v201802.cm.SitelinkFeedItem;
import com.google.api.ads.adwords.axis.v201802.cm.UrlList;
import com.google.api.ads.adwords.axis.v201802.mcm.Customer;
import com.google.api.ads.adwords.axis.v201802.mcm.CustomerServiceInterface;
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
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * This example adds sitelinks to a campaign. To create a campaign, run {@link AddCampaigns}.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddSiteLinks {

  private static class AddSiteLinksParams extends CodeSampleParams {
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

    AddSiteLinksParams params = new AddSiteLinksParams();
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
   * @param campaignId the ID of the campaign where sitelinks will be added.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session,
      Long campaignId) throws ApiException, RemoteException {
    // Get the CustomerService.
    CustomerServiceInterface customerService =
        adWordsServices.get(session, CustomerServiceInterface.class);

    // Find the matching customer and its time zone. The getCustomers method will return
    // a single Customer object corresponding to the session's clientCustomerId.
    Customer customer = customerService.getCustomers()[0];
    DateTimeZone customerTimeZone = DateTimeZone.forID(customer.getDateTimeZone());
    System.out.printf(
        "Found customer ID %d with time zone '%s'.%n",
        customer.getCustomerId(), customer.getDateTimeZone());

    // Get the CampaignExtensionSettingService.
    CampaignExtensionSettingServiceInterface campaignExtensionSettingService =
        adWordsServices.get(session, CampaignExtensionSettingServiceInterface.class);

    // Create the sitelinks.
    SitelinkFeedItem sitelink1 =
        createSiteLinkFeedItem("Store Hours", "http://www.example.com/storehours");

    // Show the Thanksgiving specials link only from 20 - 27 Nov.
    SitelinkFeedItem sitelink2 =
        createSiteLinkFeedItem("Thanksgiving Specials", "http://www.example.com/thanksgiving");

    // The time zone of the start and end date/times must match the time zone of the customer.
    DateTime startTime = new DateTime(DateTime.now().getYear(), 11, 20, 0, 0, 0, customerTimeZone);
    if (startTime.isBeforeNow()) {
      // Move the startTime to next year if the current date is past November 20th.
      startTime = startTime.plusYears(1);
    }
    sitelink2.setStartTime(startTime.toString("yyyyMMdd HHmmss ZZZ"));
    // Use the same year as startTime when creating endTime.
    DateTime endTime = new DateTime(startTime.getYear(), 11, 27, 23, 59, 59, customerTimeZone);
    sitelink2.setEndTime(endTime.toString("yyyyMMdd HHmmss ZZZ"));

    // Target this sitelink for United States only. See
    // https://developers.google.com/adwords/api/docs/appendix/geotargeting
    // for valid geolocation codes.
    Location unitedStates = new Location();
    unitedStates.setId(2840L);
    sitelink2.setGeoTargeting(unitedStates);

    // Restrict targeting only to people physically within the United States.
    // Otherwise, this could also show to people interested in the United States
    // but not physically located there.
    FeedItemGeoRestriction geoTargetingRestriction = new FeedItemGeoRestriction();
    geoTargetingRestriction.setGeoRestriction(GeoRestriction.LOCATION_OF_PRESENCE);
    sitelink2.setGeoTargetingRestriction(geoTargetingRestriction);

    // Show the wifi details primarily for high end mobile users.
    SitelinkFeedItem sitelink3 =
        createSiteLinkFeedItem("Wifi available", "http://www.example.com/mobile/wifi");
    // See https://developers.google.com/adwords/api/docs/appendix/platforms for device criteria
    // IDs.
    FeedItemDevicePreference devicePreference = new FeedItemDevicePreference(30001L);
    sitelink3.setDevicePreference(devicePreference);

    // Target this sitelink for the keyword "free wifi".
    Keyword wifiKeyword = new Keyword();
    wifiKeyword.setText("free wifi");
    wifiKeyword.setMatchType(KeywordMatchType.BROAD);
    sitelink3.setKeywordTargeting(wifiKeyword);

    // Show the happy hours link only during Mon - Fri 6PM to 9PM.
    SitelinkFeedItem sitelink4 =
        createSiteLinkFeedItem("Happy hours", "http://www.example.com/happyhours");
    sitelink4.setScheduling(new FeedItemScheduling(new FeedItemSchedule[] {
        new FeedItemSchedule(DayOfWeek.MONDAY, 18, MinuteOfHour.ZERO, 21, MinuteOfHour.ZERO),
        new FeedItemSchedule(DayOfWeek.TUESDAY, 18, MinuteOfHour.ZERO, 21, MinuteOfHour.ZERO),
        new FeedItemSchedule(DayOfWeek.WEDNESDAY, 18, MinuteOfHour.ZERO, 21, MinuteOfHour.ZERO),
        new FeedItemSchedule(DayOfWeek.THURSDAY, 18, MinuteOfHour.ZERO, 21, MinuteOfHour.ZERO),
        new FeedItemSchedule(DayOfWeek.FRIDAY, 18, MinuteOfHour.ZERO, 21, MinuteOfHour.ZERO)}));

    // Create your campaign extension settings. This associates the sitelinks
    // to your campaign.
    CampaignExtensionSetting campaignExtensionSetting = new CampaignExtensionSetting();
    campaignExtensionSetting.setCampaignId(campaignId);
    campaignExtensionSetting.setExtensionType(FeedType.SITELINK);
    ExtensionSetting extensionSetting = new ExtensionSetting();
    extensionSetting.setExtensions(
        new ExtensionFeedItem[] {sitelink1, sitelink2, sitelink3, sitelink4});
    campaignExtensionSetting.setExtensionSetting(extensionSetting);

    CampaignExtensionSettingOperation operation = new CampaignExtensionSettingOperation();
    operation.setOperand(campaignExtensionSetting);
    operation.setOperator(Operator.ADD);

    // Add the extensions.
    CampaignExtensionSettingReturnValue returnValue =
        campaignExtensionSettingService.mutate(new CampaignExtensionSettingOperation[] {operation});
    if (returnValue.getValue() != null && returnValue.getValue().length > 0) {
      CampaignExtensionSetting newExtensionSetting = returnValue.getValue(0);
      System.out.printf("Extension setting with type '%s' was added to campaign ID %d.%n",
          newExtensionSetting.getExtensionType().getValue(), newExtensionSetting.getCampaignId());
    } else {
      System.out.println("No extension settings were created.");
    }
  }

  /**
   * Creates a new {@link SitelinkFeedItem} with the specified attributes.
   *
   * @param sitelinkText the text for the sitelink
   * @param sitelinkUrl the URL for the sitelink
   * @return a new SitelinkFeedItem
   */
  private static SitelinkFeedItem createSiteLinkFeedItem(String sitelinkText, String sitelinkUrl) {
    SitelinkFeedItem sitelinkFeedItem = new SitelinkFeedItem();
    sitelinkFeedItem.setSitelinkText(sitelinkText);
    sitelinkFeedItem.setSitelinkFinalUrls(new UrlList(new String[] {sitelinkUrl}));
    return sitelinkFeedItem;
  }

}
