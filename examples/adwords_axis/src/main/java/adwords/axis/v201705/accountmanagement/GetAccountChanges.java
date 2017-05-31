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

package adwords.axis.v201705.accountmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201705.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201705.ch.AdGroupChangeData;
import com.google.api.ads.adwords.axis.v201705.ch.CampaignChangeData;
import com.google.api.ads.adwords.axis.v201705.ch.ChangeStatus;
import com.google.api.ads.adwords.axis.v201705.ch.CustomerChangeData;
import com.google.api.ads.adwords.axis.v201705.ch.CustomerSyncSelector;
import com.google.api.ads.adwords.axis.v201705.ch.CustomerSyncServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.Campaign;
import com.google.api.ads.adwords.axis.v201705.cm.CampaignPage;
import com.google.api.ads.adwords.axis.v201705.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.DateTimeRange;
import com.google.api.ads.adwords.axis.v201705.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201705.cm.CampaignField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

/**
 * This example gets the changes in the account during the last 24 hours.
 */
public class GetAccountChanges {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
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

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    runExample(adWordsServices, session);
  }

  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session)
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
      System.out.printf("Most recent change: %s%n", accountChanges.getLastChangeTimestamp());
      for (CampaignChangeData campaignChanges : accountChanges.getChangedCampaigns()) {
        System.out.printf("Campaign with ID %d was changed:%n", campaignChanges.getCampaignId());
        System.out.printf("\tCampaign changed status: '%s'%n", 
            campaignChanges.getCampaignChangeStatus());
        if (!ChangeStatus.NEW.equals(campaignChanges.getCampaignChangeStatus())) {
          System.out.printf("\tAdded campaign criteria: %s%n",
              getFormattedList(campaignChanges.getAddedCampaignCriteria()));
          System.out.printf("\tRemoved campaign criteria: %s%n",
              getFormattedList(campaignChanges.getRemovedCampaignCriteria()));

          if (campaignChanges.getChangedAdGroups() != null) {
            for (AdGroupChangeData adGroupChanges : campaignChanges.getChangedAdGroups()) {
              System.out.printf("\tAd goup with ID %d was changed:%n",
                  adGroupChanges.getAdGroupId());
              System.out.printf("\t\tAd goup changed status: %s%n",
                  adGroupChanges.getAdGroupChangeStatus());
              if (!ChangeStatus.NEW.equals(adGroupChanges.getAdGroupChangeStatus())) {
                System.out.printf("\t\tAds changed: %s%n",
                    getFormattedList(adGroupChanges.getChangedAds()));
                System.out.printf("\t\tCriteria changed: %s%n",
                    getFormattedList(adGroupChanges.getChangedCriteria()));
                System.out.printf("\t\tCriteria removed: %s%n",
                    getFormattedList(adGroupChanges.getRemovedCriteria()));
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
