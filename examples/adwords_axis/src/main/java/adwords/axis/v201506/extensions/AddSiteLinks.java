// Copyright 2014 Google Inc. All Rights Reserved.
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

package adwords.axis.v201506.extensions;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201506.cm.ApiException;
import com.google.api.ads.adwords.axis.v201506.cm.CampaignExtensionSetting;
import com.google.api.ads.adwords.axis.v201506.cm.CampaignExtensionSettingOperation;
import com.google.api.ads.adwords.axis.v201506.cm.CampaignExtensionSettingReturnValue;
import com.google.api.ads.adwords.axis.v201506.cm.CampaignExtensionSettingServiceInterface;
import com.google.api.ads.adwords.axis.v201506.cm.DayOfWeek;
import com.google.api.ads.adwords.axis.v201506.cm.ExtensionFeedItem;
import com.google.api.ads.adwords.axis.v201506.cm.ExtensionSetting;
import com.google.api.ads.adwords.axis.v201506.cm.FeedItemDevicePreference;
import com.google.api.ads.adwords.axis.v201506.cm.FeedItemSchedule;
import com.google.api.ads.adwords.axis.v201506.cm.FeedItemScheduling;
import com.google.api.ads.adwords.axis.v201506.cm.FeedType;
import com.google.api.ads.adwords.axis.v201506.cm.MinuteOfHour;
import com.google.api.ads.adwords.axis.v201506.cm.Operator;
import com.google.api.ads.adwords.axis.v201506.cm.SitelinkFeedItem;
import com.google.api.ads.adwords.axis.v201506.cm.UrlList;
import com.google.api.ads.adwords.axis.v201506.mcm.Customer;
import com.google.api.ads.adwords.axis.v201506.mcm.CustomerServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import adwords.axis.v201506.basicoperations.AddCampaigns;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.rmi.RemoteException;

/**
 * This example adds sitelinks to a campaign. To create a campaign, run {@link AddCampaigns}.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file. See
 * README for more info.
 *
 * Tags: CampaignExtensionSettingService.mutate
 *
 * Category: adx-exclude
 *
 * @author Josh Radcliff
 */
public class AddSiteLinks {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // that can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder().forApi(Api.ADWORDS).fromFile()
        .build().generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session =
        new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();

    AdWordsServices adWordsServices = new AdWordsServices();

    Long campaignId = Long.valueOf("INSERT_CAMPAIGN_ID_HERE");

    runExample(adWordsServices, session, campaignId);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session,
      Long campaignId) throws ApiException, RemoteException {
    // Get the CustomerService.
    CustomerServiceInterface customerService =
        adWordsServices.get(session, CustomerServiceInterface.class);
    Customer customer = customerService.get();
    DateTimeZone customerTimeZone = DateTimeZone.forID(customer.getDateTimeZone());

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
    sitelink2.setStartTime(startTime.toString("yyyyMMdd HHmmss ZZZ"));
    DateTime endTime = new DateTime(DateTime.now().getYear(), 11, 27, 23, 59, 59, customerTimeZone);
    sitelink2.setEndTime(endTime.toString("yyyyMMdd HHmmss ZZZ"));

    // Show the wifi details primarily for high end mobile users.
    SitelinkFeedItem sitelink3 =
        createSiteLinkFeedItem("Wifi available", "http://www.example.com/mobile/wifi");
    // See https://developers.google.com/adwords/api/docs/appendix/platforms for device criteria
    // IDs.
    FeedItemDevicePreference devicePreference = new FeedItemDevicePreference(30001L);
    sitelink3.setDevicePreference(devicePreference);

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
      System.out.printf("Extension setting with type = %s was added to campaign ID %d.%n",
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
