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

package adwords.axis.v201406.adwordsforvideo;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201406.cm.Operator;
import com.google.api.ads.adwords.axis.v201406.video.LanguageVideoCriterion;
import com.google.api.ads.adwords.axis.v201406.video.VideoCampaignCriterion;
import com.google.api.ads.adwords.axis.v201406.video.VideoCampaignCriterionOperation;
import com.google.api.ads.adwords.axis.v201406.video.VideoCampaignCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201406.video.VideoCampaignCriterionServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example illustrates how to create a video campaign criterion.
 * 
 * Note: AdWords for Video API is a Beta feature.
 * 
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 * 
 * Tags: VideoCampaignCriterionService.mutate
 * 
 * Category: adx-exclude
 * 
 * @author Ray Tsang
 */
public class AddCampaignCriterion {

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
    
    Long campaignId = Long.valueOf("INSERT_CAMPAIGN_ID_HERE");

    runExample(adWordsServices, session, campaignId);
  }

  public static void runExample(AdWordsServices adWordsServices,
      AdWordsSession session, Long campaignId) throws Exception {
    // Get the VideoCampaignCriterionService. 
    VideoCampaignCriterionServiceInterface videoCampaignCriterionService =
        adWordsServices.get(session, VideoCampaignCriterionServiceInterface.class);
    
    VideoCampaignCriterion criterion = new VideoCampaignCriterion();
    criterion.setCampaignId(campaignId);
    
    // This creates an English language criterion
    // For a list of languages, see ConstantDataService
    LanguageVideoCriterion englishCriterion = new LanguageVideoCriterion();
    englishCriterion.setId(1001L);
    criterion.setCriterion(englishCriterion);
    
    VideoCampaignCriterionOperation operation =
        new VideoCampaignCriterionOperation();
    operation.setOperand(criterion);
    operation.setOperator(Operator.ADD);
    
    VideoCampaignCriterionReturnValue result = videoCampaignCriterionService.mutate(
        new VideoCampaignCriterionOperation[] {operation});
    
    for (VideoCampaignCriterion videoCampaignCriterionResult : result.getValue()) {
      System.out.printf("Video campaign criterion with campaign id %d, "
          + "criterion id %d, and type '%s' was added.%n",
          videoCampaignCriterionResult.getCampaignId(),
          videoCampaignCriterionResult.getCriterion().getId(),
          videoCampaignCriterionResult.getCriterion().getBaseCriterionType());
    }
  }
}
