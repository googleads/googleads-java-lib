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

package adwords.axis.v201710.advancedoperations;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignSharedSet;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignSharedSetOperation;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignSharedSetServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.Keyword;
import com.google.api.ads.adwords.axis.v201710.cm.KeywordMatchType;
import com.google.api.ads.adwords.axis.v201710.cm.Operator;
import com.google.api.ads.adwords.axis.v201710.cm.SharedCriterion;
import com.google.api.ads.adwords.axis.v201710.cm.SharedCriterionOperation;
import com.google.api.ads.adwords.axis.v201710.cm.SharedCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.SharedCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.SharedSet;
import com.google.api.ads.adwords.axis.v201710.cm.SharedSetOperation;
import com.google.api.ads.adwords.axis.v201710.cm.SharedSetServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.SharedSetType;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This example creates a shared list of negative broad match keywords, then attaches them to a
 * campaign.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateAndAttachSharedKeywordSet {

  private static class CreateAndAttachSharedKeywordSetParams extends CodeSampleParams {
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

    CreateAndAttachSharedKeywordSetParams params = new CreateAndAttachSharedKeywordSetParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
    }

    runExample(adWordsServices, session, params.campaignId);
  }

  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session,
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
    List<SharedCriterionOperation> sharedCriterionOperations = new ArrayList<>();
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
      System.out.printf("Added shared criterion ID %d with text '%s' to shared set with ID %d.%n",
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
