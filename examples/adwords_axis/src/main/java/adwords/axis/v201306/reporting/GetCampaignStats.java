// Copyright 2012 Google Inc. All Rights Reserved.
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

package adwords.axis.v201306.reporting;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201306.cm.Campaign;
import com.google.api.ads.adwords.axis.v201306.cm.CampaignPage;
import com.google.api.ads.adwords.axis.v201306.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201306.cm.DateRange;
import com.google.api.ads.adwords.axis.v201306.cm.Paging;
import com.google.api.ads.adwords.axis.v201306.cm.Predicate;
import com.google.api.ads.adwords.axis.v201306.cm.PredicateOperator;
import com.google.api.ads.adwords.axis.v201306.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import org.joda.time.DateTime;

/**
 * This example gets stats for all campaigns with an impression in the last
 * week. To add a campaign, run AddCampaigns.java.
 *
 * @author Kevin Winter
 */
public class GetCampaignStats {
  private static final int PAGE_SIZE = 100;

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

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session) throws Exception {
    // Get the CampaignService.
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    int offset = 0;

    // Create selector.
    Selector selector = new Selector();
    selector.setFields(new String[] {"Id", "Name", "Impressions", "Clicks", "Cost", "Ctr"});
    selector.setPredicates(new Predicate[] {new Predicate("Impressions",
        PredicateOperator.GREATER_THAN, new String[] {"0"})});
    String oneWeekAgo = new DateTime().minusDays(7).toString("yyyyMMdd");
    String yesterday = new DateTime().minusDays(1).toString("yyyyMMdd");
    selector.setDateRange(new DateRange(oneWeekAgo, yesterday));
    selector.setPaging(new Paging(offset, PAGE_SIZE));

    CampaignPage page = null;
    do {
      // Get all campaigns.
      page = campaignService.get(selector);

      // Display campaigns.
      if (page.getEntries() != null) {
        for (Campaign campaign : page.getEntries()) {
          System.out.printf("Campaign with id \"%d\" and name \"%s\" had the following stats "
              + "during the last week.\n", campaign.getId(), campaign.getName());
          System.out.printf("  Impressions: %d\n", campaign.getCampaignStats().getImpressions());
          System.out.printf("  Clicks: %d\n", campaign.getCampaignStats().getClicks());
          System.out.printf("  Cost: %.02f\n", campaign.getCampaignStats().getCost()
              .getMicroAmount() / 1000000.0);
          System.out.printf("  CTR: %.02f %%\n", campaign.getCampaignStats().getCtr() * 100.0);
        }
      } else {
        System.out.println("No matching campaigns were found.");
      }

      offset += PAGE_SIZE;
      selector.getPaging().setStartIndex(offset);
    } while (offset < page.getTotalNumEntries());
  }
}
