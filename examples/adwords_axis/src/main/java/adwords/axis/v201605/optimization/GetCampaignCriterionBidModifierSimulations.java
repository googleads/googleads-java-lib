// Copyright 2016 Google Inc. All Rights Reserved.
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

package adwords.axis.v201605.optimization;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201605.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201605.cm.BidLandscapeLandscapePoint;
import com.google.api.ads.adwords.axis.v201605.cm.CriterionBidLandscape;
import com.google.api.ads.adwords.axis.v201605.cm.CriterionBidLandscapePage;
import com.google.api.ads.adwords.axis.v201605.cm.DataServiceInterface;
import com.google.api.ads.adwords.axis.v201605.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.selectorfields.v201605.cm.DataField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all available campaign mobile bid modifier landscapes
 * for a given campaign. To get campaigns, run basicoperations.GetCampaigns.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetCampaignCriterionBidModifierSimulations {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential =
        new OfflineCredentials.Builder()
            .forApi(Api.ADWORDS)
            .fromFile()
            .build()
            .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session =
        new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();

    Long campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, campaignId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long campaignId) throws Exception {
    // Get the DataService.
    DataServiceInterface dataService = adWordsServices.get(session, DataServiceInterface.class);

    // Create selector.
    Selector selector =
        new SelectorBuilder()
            .fields(
                DataField.BidModifier,
                DataField.CampaignId,
                DataField.CriterionId,
                DataField.StartDate,
                DataField.EndDate,
                DataField.LocalClicks,
                DataField.LocalCost,
                DataField.LocalImpressions,
                DataField.TotalLocalClicks,
                DataField.TotalLocalCost,
                DataField.TotalLocalImpressions,
                DataField.RequiredBudget)
            .equals(DataField.CampaignId, campaignId.toString())
            .build();

    // Get bid modifier landscapes for campaign criteria.
    CriterionBidLandscapePage page = dataService.getCampaignCriterionBidLandscape(selector);

    // Display bid landscapes.
    if (page.getEntries() != null) {
      for (CriterionBidLandscape criterionBidLandscape : page.getEntries()) {
        System.out.printf(
            "Found campaign-level criterion bid modifier landscape for"
                + " criterion with ID %d, start date '%s', end date '%s', and"
                + " landscape points:%n",
            criterionBidLandscape.getCriterionId(),
            criterionBidLandscape.getStartDate(),
            criterionBidLandscape.getEndDate());

        for (BidLandscapeLandscapePoint bidLandscapePoint :
            criterionBidLandscape.getLandscapePoints()) {
          System.out.printf(
              "  {bid modifier: %.2f => clicks: %d, cost: %d, impressions: %d, "
                  + "total clicks: %d, total cost: %d, total impressions: %d, and "
                  + "required budget: %d%n",
              bidLandscapePoint.getBidModifier(),
              bidLandscapePoint.getClicks(),
              bidLandscapePoint.getCost().getMicroAmount(),
              bidLandscapePoint.getImpressions(),
              bidLandscapePoint.getTotalLocalClicks(),
              bidLandscapePoint.getTotalLocalCost().getMicroAmount(),
              bidLandscapePoint.getTotalLocalImpressions(),
              bidLandscapePoint.getRequiredBudget().getMicroAmount());
        }
      }
    } else {
      System.out.println("No campaign criterion bid modifier landscapes were found");
    }
  }
}
