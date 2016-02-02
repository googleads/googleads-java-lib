// Copyright 2013 Google Inc. All Rights Reserved.
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

package adwords.axis.utility.extension.accountmanagement;

import com.google.api.ads.adwords.axis.utility.extension.ExtendedManagedCustomer;
import com.google.api.ads.adwords.axis.v201506.ch.AdGroupChangeData;
import com.google.api.ads.adwords.axis.v201506.ch.CampaignChangeData;
import com.google.api.ads.adwords.axis.v201506.ch.ChangeStatus;
import com.google.api.ads.adwords.axis.v201506.cm.Campaign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * This example gets the changes in the account during the last 24 hours.
 */
public class GetAccountChanges {

  public static void main(String[] args) throws Exception {
    // Creating ExtendedManagedCustomer using OAuth2 credentials form file,
    // for extendedCustomer the properties file needs an accound id.
    ExtendedManagedCustomer extendedManagedCustomer = ExtendedManagedCustomer.withOAuth2FromFile();
    runExample(extendedManagedCustomer);
  }

  public static void runExample(ExtendedManagedCustomer extendedManagedCustomer)
      throws Exception {

    // Get a list of all campaigns for the account
    List<Long> campaignIds = new ArrayList<Long>();
    List<Campaign> campaigns = extendedManagedCustomer.getCampaigns();
    for (Campaign campaign : campaigns) {
      campaignIds.add(campaign.getId());
    }

    // Get all account changes for campaigns for the last 24 hours.
    Calendar yesterday = Calendar.getInstance();
    yesterday.add(Calendar.DATE, -1);
    List<CampaignChangeData> changedCampaigns = extendedManagedCustomer.getDelegateLocator()
        .getCustomerSyncDelegate().getCampaignChangeData(
            campaignIds,  yesterday.getTime(), Calendar.getInstance().getTime());

    // Display changes.
    for (CampaignChangeData campaignChanges : changedCampaigns) {
      System.out.printf("Campaign with ID %d was changed.%n",
          campaignChanges.getCampaignId());
      System.out.printf("\tCampaign changed status to '%s'.%n",
          campaignChanges.getCampaignChangeStatus().getValue());

      if (campaignChanges.getCampaignChangeStatus() != ChangeStatus.NEW) {        
        System.out.printf("\tAdded Ad Extensions: '%s'.%n",
            Arrays.toString(campaignChanges.getAddedAdExtensions()));
        System.out.printf("\tAdded Campaign Criteria: '%s'.%n",
            Arrays.toString(campaignChanges.getAddedCampaignCriteria()));
        System.out.printf("\tDeleted Ad Extensions: '%s'.%n",
            Arrays.toString(campaignChanges.getRemovedAdExtensions()));
        System.out.printf("\tDeleted Campaign Criteria: '%s'.%n",
            Arrays.toString(campaignChanges.getRemovedCampaignCriteria()));

        if (campaignChanges.getChangedAdGroups() != null) {
          for (AdGroupChangeData adGroupChanges : campaignChanges.getChangedAdGroups()) {
            System.out.printf("tAdGroup with ID %d was changed.%n",
                adGroupChanges.getAdGroupId());
            System.out.printf("\tAdGroup changed status to '%s'.%n",
                adGroupChanges.getAdGroupChangeStatus().getValue());

            if (adGroupChanges.getAdGroupChangeStatus() != ChangeStatus.NEW) {
              System.out.printf("\t\tAds changed: '%s'.%n",
                  Arrays.toString(adGroupChanges.getChangedAds()));
              System.out.printf("\t\tCriteria changed: '%s'.%n",
                  Arrays.toString(adGroupChanges.getChangedCriteria()));
              System.out.printf("\t\tCriteria deleted: '%s'.%n",
                  Arrays.toString(adGroupChanges.getRemovedCriteria()));
            }
          }
        }
      }
      System.out.println();
    }
  }
}
