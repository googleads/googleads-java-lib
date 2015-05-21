// Copyright 2015 Google Inc. All Rights Reserved.
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

package adwords.axis.v201502.advancedoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201502.cm.CampaignSharedSet;
import com.google.api.ads.adwords.axis.v201502.cm.CampaignSharedSetOperation;
import com.google.api.ads.adwords.axis.v201502.cm.CampaignSharedSetServiceInterface;
import com.google.api.ads.adwords.axis.v201502.cm.Keyword;
import com.google.api.ads.adwords.axis.v201502.cm.KeywordMatchType;
import com.google.api.ads.adwords.axis.v201502.cm.Operator;
import com.google.api.ads.adwords.axis.v201502.cm.SharedCriterion;
import com.google.api.ads.adwords.axis.v201502.cm.SharedCriterionOperation;
import com.google.api.ads.adwords.axis.v201502.cm.SharedCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201502.cm.SharedCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201502.cm.SharedSet;
import com.google.api.ads.adwords.axis.v201502.cm.SharedSetOperation;
import com.google.api.ads.adwords.axis.v201502.cm.SharedSetServiceInterface;
import com.google.api.ads.adwords.axis.v201502.cm.SharedSetType;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * This example creates a shared list of negative broad match keywords, then attaches them to a
 * campaign.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file. See
 * README for more info.
 *
 * Tags: SharedSetService.mutate, SharedSetCriterionService.mutate, CampaignSharedSetService.mutate
 *
 * @author Josh Radcliff
 */
public class CreateAndAttachSharedKeywordSet {

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

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session,
      Long campaignId) throws Exception {
    // Get the SharedSetService.
    SharedSetServiceInterface sharedSetService =
        adWordsServices.get(session, SharedSetServiceInterface.class);

    // Keywords to include in the shared set.
    List<String> keywords = Arrays.asList("mars cruise", "mars hotels");

    // Create the shared negative keyword set.
    SharedSet sharedSet = new SharedSet();
    sharedSet.setName("Negative keyword list #" + System.currentTimeMillis());
    sharedSet.setType(SharedSetType.NEGATIVE_KEYWORDS);

    SharedSetOperation sharedSetOperation = new SharedSetOperation();
    sharedSetOperation.setOperator(Operator.ADD);
    sharedSetOperation.setOperand(sharedSet);

    // Add the shared set.
    sharedSet = sharedSetService.mutate(new SharedSetOperation[] {sharedSetOperation}).getValue(0);

    System.out.printf("Shared set with ID %d and name '%s' was successfully added.%n",
        sharedSet.getSharedSetId(), sharedSet.getName());

    // Add negative keywords to the shared set.
    List<SharedCriterionOperation> sharedCriterionOperations = Lists.newArrayList();
    for (String keyword : keywords) {
      Keyword keywordCriterion = new Keyword();
      keywordCriterion.setText(keyword);
      keywordCriterion.setMatchType(KeywordMatchType.BROAD);

      SharedCriterion sharedCriterion = new SharedCriterion();
      sharedCriterion.setCriterion(keywordCriterion);
      sharedCriterion.setNegative(true);
      sharedCriterion.setSharedSetId(sharedSet.getSharedSetId());

      SharedCriterionOperation sharedCriterionOperation = new SharedCriterionOperation();
      sharedCriterionOperation.setOperator(Operator.ADD);
      sharedCriterionOperation.setOperand(sharedCriterion);

      sharedCriterionOperations.add(sharedCriterionOperation);
    }

    // Get the SharedCriterionService.
    SharedCriterionServiceInterface sharedCriterionService =
        adWordsServices.get(session, SharedCriterionServiceInterface.class);

    SharedCriterionReturnValue sharedCriterionReturnValue =
        sharedCriterionService.mutate(sharedCriterionOperations.toArray(
            new SharedCriterionOperation[sharedCriterionOperations.size()]));

    for (SharedCriterion addedCriterion : sharedCriterionReturnValue.getValue()) {
      System.out.printf("Added shared criterion ID %d '%s' to shared set with ID %d.%n",
          addedCriterion.getCriterion().getId(),
          ((Keyword) addedCriterion.getCriterion()).getText(), addedCriterion.getSharedSetId());
    }

    // Attach the negative keyword shared set to the campaign.
    CampaignSharedSetServiceInterface campaignSharedSetService =
        adWordsServices.get(session, CampaignSharedSetServiceInterface.class);

    CampaignSharedSet campaignSharedSet = new CampaignSharedSet();
    campaignSharedSet.setCampaignId(campaignId);
    campaignSharedSet.setSharedSetId(sharedSet.getSharedSetId());

    CampaignSharedSetOperation campaignSharedSetOperation = new CampaignSharedSetOperation();
    campaignSharedSetOperation.setOperator(Operator.ADD);
    campaignSharedSetOperation.setOperand(campaignSharedSet);

    campaignSharedSet = campaignSharedSetService.mutate(
        new CampaignSharedSetOperation[] {campaignSharedSetOperation}).getValue(0);

    System.out.printf("Shared set ID %d was attached to campaign ID %d.%n",
        campaignSharedSet.getSharedSetId(), campaignSharedSet.getCampaignId());
  }
}
