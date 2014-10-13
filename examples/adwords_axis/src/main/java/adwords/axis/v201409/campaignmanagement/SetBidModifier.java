// Copyright 2014 Google Inc. All Rights Reserved.
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

package adwords.axis.v201409.campaignmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201409.cm.CampaignCriterion;
import com.google.api.ads.adwords.axis.v201409.cm.CampaignCriterionOperation;
import com.google.api.ads.adwords.axis.v201409.cm.CampaignCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201409.cm.CampaignCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201409.cm.Operator;
import com.google.api.ads.adwords.axis.v201409.cm.Platform;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example sets a bid modifier for the mobile platform on given campaign.
 * To get campaigns, run basicoperations/GetCampaigns.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CampaignCriterionService.mutate
 *
 * @author Kevin Winter
 */
public class SetBidModifier {

  private static final double BID_MODIFIER = 1.5;

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

    Long campaignId = Long.valueOf("INSERT_CAMPAIGN_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, campaignId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long campaignId) throws Exception {
    // Get the CampaignCriterionService.
    CampaignCriterionServiceInterface campaignCriterionService =
        adWordsServices.get(session, CampaignCriterionServiceInterface.class);

    // Create mobile platform. The ID can be found in the documentation.
    // https://developers.google.com/adwords/api/docs/appendix/platforms
    Platform mobile = new Platform();
    mobile.setId(30001L);

    // Create criterion with modified bid.
    CampaignCriterion campaignCriterion = new CampaignCriterion();
    campaignCriterion.setCampaignId(campaignId);
    campaignCriterion.setCriterion(mobile);
    campaignCriterion.setBidModifier(BID_MODIFIER);

    // Create SET operation.
    CampaignCriterionOperation operation = new CampaignCriterionOperation();
    operation.setOperand(campaignCriterion);
    operation.setOperator(Operator.SET);

    // Update campaign criterion.
    CampaignCriterionReturnValue result =
        campaignCriterionService.mutate(new CampaignCriterionOperation[] {operation});
    for (CampaignCriterion campaignCriterionResult : result.getValue()) {
      System.out.printf("Campaign criterion with campaign id '%s', criterion id '%s', "
          + "and type '%s' was modified with bid %.2f.\n",
          campaignCriterionResult.getCampaignId(),
          campaignCriterionResult.getCriterion().getId(),
          campaignCriterionResult.getCriterion().getType(),
          campaignCriterionResult.getBidModifier());
    }
  }
}
