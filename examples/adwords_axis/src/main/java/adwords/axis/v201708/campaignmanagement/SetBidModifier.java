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

package adwords.axis.v201708.campaignmanagement;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201708.cm.CampaignCriterion;
import com.google.api.ads.adwords.axis.v201708.cm.CampaignCriterionOperation;
import com.google.api.ads.adwords.axis.v201708.cm.CampaignCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201708.cm.CampaignCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201708.cm.Operator;
import com.google.api.ads.adwords.axis.v201708.cm.Platform;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example sets a bid modifier for the mobile platform on given campaign.
 * To get campaigns, run basicoperations/GetCampaigns.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class SetBidModifier {

  private static final double BID_MODIFIER = 1.5;

  private static class SetBidModifierParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
  }

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

    SetBidModifierParams params = new SetBidModifierParams();
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
      System.out.printf("Campaign criterion with campaign ID %d, criterion ID %d, "
          + "and type '%s' was modified with bid %.4f.%n",
          campaignCriterionResult.getCampaignId(),
          campaignCriterionResult.getCriterion().getId(),
          campaignCriterionResult.getCriterion().getType(),
          campaignCriterionResult.getBidModifier());
    }
  }
}
