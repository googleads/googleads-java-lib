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

package adwords.axis.v201708.optimization;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201708.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201708.cm.BidLandscapeLandscapePoint;
import com.google.api.ads.adwords.axis.v201708.cm.CriterionBidLandscape;
import com.google.api.ads.adwords.axis.v201708.cm.CriterionBidLandscapePage;
import com.google.api.ads.adwords.axis.v201708.cm.DataServiceInterface;
import com.google.api.ads.adwords.axis.v201708.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201708.cm.DataField;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all available campaign mobile bid modifier landscapes
 * for a given campaign. To get campaigns, run basicoperations.GetCampaigns.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetCampaignCriterionBidModifierSimulations {

  private static final int PAGE_SIZE = 100;

  private static class GetCampaignCriterionBidModifierSimulationsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
  }

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

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    GetCampaignCriterionBidModifierSimulationsParams params =
        new GetCampaignCriterionBidModifierSimulationsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
    }

    runExample(adWordsServices, session, params.campaignId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Long campaignId)
      throws Exception {
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
            .limit(PAGE_SIZE)
            .build();

    // Display bid landscapes.
    int landscapePointsInPreviousPage = 0;
    int startIndex = 0;
    do {
      // Offset the start index by the number of landscape points in the last retrieved page,
      // NOT the number of entries (bid landscapes) in the page.
      startIndex += landscapePointsInPreviousPage;
      selector.getPaging().setStartIndex(startIndex);

      // Reset the count of landscape points in preparation for processing the next page.
      landscapePointsInPreviousPage = 0;

      // Request the next page of bid landscapes.
      CriterionBidLandscapePage page = dataService.getCampaignCriterionBidLandscape(selector);

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
            landscapePointsInPreviousPage++;
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
      }
    } while (landscapePointsInPreviousPage >= PAGE_SIZE);
  }
}
