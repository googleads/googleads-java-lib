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

package adwords.axis.v201402.adwordsforvideo;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201402.cm.Operator;
import com.google.api.ads.adwords.axis.v201402.video.AudienceAge;
import com.google.api.ads.adwords.axis.v201402.video.AudienceAgeAgeRange;
import com.google.api.ads.adwords.axis.v201402.video.AudienceGender;
import com.google.api.ads.adwords.axis.v201402.video.AudienceGenderGenderType;
import com.google.api.ads.adwords.axis.v201402.video.AudienceInterest;
import com.google.api.ads.adwords.axis.v201402.video.NegativeTargetingGroupCriterion;
import com.google.api.ads.adwords.axis.v201402.video.TargetingGroupCriterion;
import com.google.api.ads.adwords.axis.v201402.video.TargetingGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201402.video.TargetingGroupCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201402.video.Topic;
import com.google.api.ads.adwords.axis.v201402.video.VideoTargetingGroupCriterionServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example illustrates how to create a video targeting group criterion.
 * 
 * Note: AdWords for Video API is a Beta feature.
 * 
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 * 
 * Tags: VideoTargetingGroupCriterionService.mutate
 * 
 * Category: adx-exclude
 * 
 * @author Kevin Winter
 * @author Ray Tsang
 */
public class AddTargetingGroupCriterion {

  public static void main(String[] args) throws Exception {
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
    Long targetingGroupId = Long.valueOf("INSERT_TARGETING_GROUP_ID_HERE");
    
    runExample(adWordsServices, session, campaignId, targetingGroupId);
  }

  public static void runExample(AdWordsServices adWordsServices,
      AdWordsSession session, Long campaignId, Long targetingGroupId)
      throws Exception {
    // Get the VideoTargetingGroupCriterionService 
    VideoTargetingGroupCriterionServiceInterface videoTargetingGroupCriterionService = 
        adWordsServices.get(session, VideoTargetingGroupCriterionServiceInterface.class);

    // Create an age criterion for age range 18 to 24.
    TargetingGroupCriterion ageCriterion = new TargetingGroupCriterion();
    ageCriterion.setCampaignId(campaignId);
    ageCriterion.setTargetingGroupId(targetingGroupId);
    AudienceAge age = new AudienceAge();
    age.setAgeRange(AudienceAgeAgeRange.AGE_RANGE_18_24);
    ageCriterion.setCriterion(age);

    TargetingGroupCriterionOperation addAgeCriterionOp =
        new TargetingGroupCriterionOperation();
    addAgeCriterionOp.setOperand(ageCriterion);
    addAgeCriterionOp.setOperator(Operator.ADD);
    
    // Create a negative age criterion for age 65+.
    NegativeTargetingGroupCriterion negativeAgeCriterion =
        new NegativeTargetingGroupCriterion();
    negativeAgeCriterion.setCampaignId(campaignId);
    negativeAgeCriterion.setTargetingGroupId(targetingGroupId);
    AudienceAge negativeAge = new AudienceAge();
    negativeAge.setAgeRange(AudienceAgeAgeRange.AGE_RANGE_65_UP);
    negativeAgeCriterion.setCriterion(negativeAge);

    TargetingGroupCriterionOperation addNegativeAgeCriterionOp =
        new TargetingGroupCriterionOperation();
    addNegativeAgeCriterionOp.setOperand(negativeAgeCriterion);
    addNegativeAgeCriterionOp.setOperator(Operator.ADD);

    // Create a gender criterion for male.
    TargetingGroupCriterion genderCriterion = new TargetingGroupCriterion();
    AudienceGender gender = new AudienceGender();
    gender.setGenderType(AudienceGenderGenderType.GENDER_MALE);
    genderCriterion.setCampaignId(campaignId);
    genderCriterion.setTargetingGroupId(targetingGroupId);
    genderCriterion.setCriterion(gender);

    TargetingGroupCriterionOperation addGenderCriterionOp =
        new TargetingGroupCriterionOperation();
    addGenderCriterionOp.setOperand(genderCriterion);
    addGenderCriterionOp.setOperator(Operator.ADD);

    // Create a topic criterion for the Autos & Vehicles topic.
    // See ConstantDataService for a list of verticals.
    TargetingGroupCriterion topicCriterion = new TargetingGroupCriterion();
    Topic topic = new Topic();
    topic.setVerticalId(47L);
    topicCriterion.setCampaignId(campaignId);
    topicCriterion.setTargetingGroupId(targetingGroupId);
    topicCriterion.setCriterion(topic);

    TargetingGroupCriterionOperation addTopicCriterionOp =
        new TargetingGroupCriterionOperation();
    addTopicCriterionOp.setOperand(topicCriterion);
    addTopicCriterionOp.setOperator(Operator.ADD);

    // Create an interest criterion for the Tablet PC interest.
    // See ConstantDataService for a list of verticals.
    TargetingGroupCriterion interestCriterion = new TargetingGroupCriterion();
    AudienceInterest interest = new AudienceInterest();
    interest.setInterestId(1277L);

    interestCriterion.setCampaignId(campaignId);
    interestCriterion.setTargetingGroupId(targetingGroupId);
    interestCriterion.setCriterion(interest);

    TargetingGroupCriterionOperation addUserInterestCriteriaOp =
        new TargetingGroupCriterionOperation();
    addUserInterestCriteriaOp.setOperand(interestCriterion);
    addUserInterestCriteriaOp.setOperator(Operator.ADD);

    TargetingGroupCriterionReturnValue result = videoTargetingGroupCriterionService.mutate(
        new TargetingGroupCriterionOperation[] {
          addAgeCriterionOp, addGenderCriterionOp, 
          addNegativeAgeCriterionOp, addTopicCriterionOp,
          addUserInterestCriteriaOp});
    
    for (TargetingGroupCriterion targetingGroupCriterionResult : result.getValue()) {
      System.out.printf("Targeting group criterion with campaign id %d, "
          + "targeting group id %d, criterion id %d, "
          + "and type '%s' was added.%n",
          targetingGroupCriterionResult.getCampaignId(),
          targetingGroupCriterionResult.getTargetingGroupId(),
          targetingGroupCriterionResult.getCriterion().getId(),
          targetingGroupCriterionResult.getCriterion().getBaseCriterionType());
    }
  }
}
