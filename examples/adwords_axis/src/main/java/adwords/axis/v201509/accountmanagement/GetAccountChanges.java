// Copyright 2015 Google Inc. All Rights Reserved.
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

package adwords.axis.v201509.accountmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201509.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201509.ch.AdGroupChangeData;
import com.google.api.ads.adwords.axis.v201509.ch.CampaignChangeData;
import com.google.api.ads.adwords.axis.v201509.ch.ChangeStatus;
import com.google.api.ads.adwords.axis.v201509.ch.CustomerChangeData;
import com.google.api.ads.adwords.axis.v201509.ch.CustomerSyncSelector;
import com.google.api.ads.adwords.axis.v201509.ch.CustomerSyncServiceInterface;
import com.google.api.ads.adwords.axis.v201509.cm.Campaign;
import com.google.api.ads.adwords.axis.v201509.cm.CampaignPage;
import com.google.api.ads.adwords.axis.v201509.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201509.cm.DateTimeRange;
import com.google.api.ads.adwords.axis.v201509.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.selectorfields.v201509.cm.CampaignField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This example gets the changes in the account during the last 24 hours.
 */
public class GetAccountChanges {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session)
      throws Exception {
    // Get the CampaignService.
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    // Get the CustomerSyncService.
    CustomerSyncServiceInterface customerSyncService =
        adWordsServices.get(session, CustomerSyncServiceInterface.class);

    // Get a list of all campaign IDs.
    List<Long> campaignIds = new ArrayList<Long>();
    Selector selector = new SelectorBuilder()
        .fields(CampaignField.Id)
        .build();
    CampaignPage campaigns = campaignService.get(selector);
    if (campaigns.getEntries() != null) {
      for (Campaign campaign : campaigns.getEntries()) {
        campaignIds.add(campaign.getId());
      }
    }

    // Create date time range for the past 24 hours.
    DateTimeRange dateTimeRange = new DateTimeRange();
    dateTimeRange.setMin(new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date(System
        .currentTimeMillis() - 1000L * 60 * 60 * 24)));
    dateTimeRange.setMax(new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date()));

    // Create selector.
    CustomerSyncSelector customerSyncSelector = new CustomerSyncSelector();
    customerSyncSelector.setDateTimeRange(dateTimeRange);
    customerSyncSelector
        .setCampaignIds(ArrayUtils.toPrimitive(campaignIds.toArray(new Long[] {})));

    // Get all account changes for campaign.
    CustomerChangeData accountChanges = customerSyncService.get(customerSyncSelector);

    // Display changes.
    if (accountChanges != null && accountChanges.getChangedCampaigns() != null) {
      System.out.println("Most recent change: "
          + accountChanges.getLastChangeTimestamp() + "\n");
      for (CampaignChangeData campaignChanges : accountChanges.getChangedCampaigns()) {
        System.out.println("Campaign with id \"" + campaignChanges.getCampaignId()
            + "\" was changed: ");
        System.out.println("\tCampaign changed status: "
            + campaignChanges.getCampaignChangeStatus());
        if (campaignChanges.getCampaignChangeStatus() != ChangeStatus.NEW) {
          System.out.println("\tAdded ad extensions: "
              + getFormattedList(campaignChanges.getAddedAdExtensions()));
          System.out.println("\tAdded campaign criteria: "
              + getFormattedList(campaignChanges.getAddedCampaignCriteria()));
          System.out.println("\tRemoved ad extensions: "
              + getFormattedList(campaignChanges.getRemovedAdExtensions()));
          System.out.println("\tRemoved campaign criteria: "
              + getFormattedList(campaignChanges.getRemovedCampaignCriteria()));

          if (campaignChanges.getChangedAdGroups() != null) {
            for (AdGroupChangeData adGroupChanges : campaignChanges.getChangedAdGroups()) {
              System.out.println("\tAd goup with id \"" + adGroupChanges.getAdGroupId()
                  + "\" was changed: ");
              System.out.println("\t\tAd goup changed status: "
                  + adGroupChanges.getAdGroupChangeStatus());
              if (adGroupChanges.getAdGroupChangeStatus() != ChangeStatus.NEW) {
                System.out.println("\t\tAds changed: "
                    + getFormattedList(adGroupChanges.getChangedAds()));
                System.out.println("\t\tCriteria changed: "
                    + getFormattedList(adGroupChanges.getChangedCriteria()));
                System.out.println("\t\tCriteria removed: "
                    + getFormattedList(adGroupChanges.getRemovedCriteria()));
              }
            }
          }
        }
        System.out.println("");
      }
    } else {
      System.out.println("No account changes were found.");
    }
  }

  /**
   * Gets a formatted list of a long array in the form {1,2,3}.
   * @param idList the long array
   * @return the formatted list
   */
  private static String getFormattedList(long[] idList) {
    if (idList == null) {
      idList = new long[]{};
    }
    return new StringBuilder().append("{")
        .append(StringUtils.join(ArrayUtils.toObject(idList), ','))
        .append("}").toString();
  }
}
