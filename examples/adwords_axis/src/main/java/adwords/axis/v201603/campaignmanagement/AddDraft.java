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

package adwords.axis.v201603.campaignmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201603.cm.CampaignCriterion;
import com.google.api.ads.adwords.axis.v201603.cm.CampaignCriterionOperation;
import com.google.api.ads.adwords.axis.v201603.cm.CampaignCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201603.cm.Draft;
import com.google.api.ads.adwords.axis.v201603.cm.DraftOperation;
import com.google.api.ads.adwords.axis.v201603.cm.DraftServiceInterface;
import com.google.api.ads.adwords.axis.v201603.cm.Language;
import com.google.api.ads.adwords.axis.v201603.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example illustrates how to create a draft and access its associated draft campaign.
 *
 * <p>See the Campaign Drafts and Experiments guide for more information:
 * https://developers.google.com/adwords/api/docs/guides/campaign-drafts-experiments
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddDraft {

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

    // Replace with valid values of your account.
    long baseCampaignId = Long.parseLong("INSERT_BASE_CAMPAIGN_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, baseCampaignId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, long baseCampaignId)
      throws Exception {
    // Get the DraftService.
    DraftServiceInterface draftService = adWordsServices.get(session, DraftServiceInterface.class);
    Draft draft = new Draft();
    draft.setBaseCampaignId(baseCampaignId);
    draft.setDraftName("Test Draft #" + System.currentTimeMillis());

    DraftOperation draftOperation = new DraftOperation();
    draftOperation.setOperator(Operator.ADD);
    draftOperation.setOperand(draft);

    draft = draftService.mutate(new DraftOperation[] {draftOperation}).getValue(0);

    System.out.printf(
        "Draft with ID %d and base campaign ID %d and draft campaign ID %d created.%n",
        draft.getDraftId(),
        draft.getBaseCampaignId(),
        draft.getDraftCampaignId());

    // Once the draft is created, you can modify the draft campaign as if it
    // were a real campaign. For example, you may add criteria, adjust bids,
    // or even include additional ads. Adding a criterion is shown here.
    CampaignCriterionServiceInterface campaignCriterionService =
        adWordsServices.get(session, CampaignCriterionServiceInterface.class);

    Language language = new Language();
    language.setId(1003L); // Spanish

    // Make sure to use the draftCampaignId when modifying the virtual draft campaign.
    CampaignCriterion campaignCriterion = new CampaignCriterion();
    campaignCriterion.setCampaignId(draft.getDraftCampaignId());
    campaignCriterion.setCriterion(language);

    CampaignCriterionOperation criterionOperation = new CampaignCriterionOperation();
    criterionOperation.setOperator(Operator.ADD);
    criterionOperation.setOperand(campaignCriterion);

    campaignCriterion =
        campaignCriterionService
            .mutate(new CampaignCriterionOperation[] {criterionOperation})
            .getValue(0);

    System.out.printf("Draft updated to include criteria in draft campaign ID %d.%n",
        draft.getDraftCampaignId());
  }
}
