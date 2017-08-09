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

package adwords.axis.v201708.targeting;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201708.cm.CampaignCriterion;
import com.google.api.ads.adwords.axis.v201708.cm.CampaignCriterionOperation;
import com.google.api.ads.adwords.axis.v201708.cm.CampaignCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201708.cm.CampaignCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201708.cm.ConstantOperand;
import com.google.api.ads.adwords.axis.v201708.cm.ConstantOperandConstantType;
import com.google.api.ads.adwords.axis.v201708.cm.ConstantOperandUnit;
import com.google.api.ads.adwords.axis.v201708.cm.Criterion;
import com.google.api.ads.adwords.axis.v201708.cm.Function;
import com.google.api.ads.adwords.axis.v201708.cm.FunctionArgumentOperand;
import com.google.api.ads.adwords.axis.v201708.cm.FunctionOperator;
import com.google.api.ads.adwords.axis.v201708.cm.Keyword;
import com.google.api.ads.adwords.axis.v201708.cm.KeywordMatchType;
import com.google.api.ads.adwords.axis.v201708.cm.Language;
import com.google.api.ads.adwords.axis.v201708.cm.Location;
import com.google.api.ads.adwords.axis.v201708.cm.LocationExtensionOperand;
import com.google.api.ads.adwords.axis.v201708.cm.LocationGroups;
import com.google.api.ads.adwords.axis.v201708.cm.NegativeCampaignCriterion;
import com.google.api.ads.adwords.axis.v201708.cm.Operator;
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
import javax.annotation.Nullable;

/**
 * This example adds various types of targeting criteria to a campaign. To get
 * campaigns, run GetCampaigns.java
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddCampaignTargetingCriteria {

  private static class AddCampaignTargetingCriteriaParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;

    @Parameter(names = ArgumentNames.LOCATION_FEED_ID,
        description = "The ID of a feed that has been configured for location targeting, meaning it"
            + " has an ENABLED FeedMapping with criterionType of 77. Feeds linked to a GMB account"
            + " automatically have this FeedMapping. If you don't have such a feed, this argument"
            + " is unnecessary.")
    private Long locationFeedId;
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

    AddCampaignTargetingCriteriaParams params = new AddCampaignTargetingCriteriaParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
      params.locationFeedId = Long.parseLong("INSERT_LOCATION_FEED_ID_HERE");
    }

    runExample(adWordsServices, session, params.campaignId, params.locationFeedId);
  }

  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session,
      Long campaignId, @Nullable Long locationFeedId) throws Exception {
    // Get the CampaignService.
    CampaignCriterionServiceInterface campaignCriterionService =
        adWordsServices.get(session, CampaignCriterionServiceInterface.class);

    // Create locations. The IDs can be found in the documentation or
    // retrieved with the LocationCriterionService.
    Location california = new Location();
    california.setId(21137L);
    Location mexico = new Location();
    mexico.setId(2484L);

    // Create languages. The IDs can be found in the documentation or
    // retrieved with the ConstantDataService.
    Language english = new Language();
    english.setId(1000L);
    Language spanish = new Language();
    spanish.setId(1003L);

    List<Criterion> criteria = new ArrayList<>(Arrays.asList(california, mexico, english, spanish));
    
    // Distance targeting. Area of 10 miles around the locations in the location feed.
    if (locationFeedId != null) {
      LocationGroups radiusLocationGroup = new LocationGroups();
      radiusLocationGroup.setFeedId(locationFeedId);
      ConstantOperand radius = new ConstantOperand();
      radius.setType(ConstantOperandConstantType.DOUBLE);
      radius.setUnit(ConstantOperandUnit.MILES);
      radius.setDoubleValue(10d);
      LocationExtensionOperand distance = new LocationExtensionOperand();
      distance.setRadius(radius);

      Function radiusMatchingFunction = new Function();
      radiusMatchingFunction.setOperator(FunctionOperator.IDENTITY);
      radiusMatchingFunction.setLhsOperand(new FunctionArgumentOperand[] {distance});
      radiusLocationGroup.setMatchingFunction(radiusMatchingFunction);
      
      criteria.add(radiusLocationGroup);
    }

    // Create operations to add each of the criteria above.
    List<CampaignCriterionOperation> operations = new ArrayList<CampaignCriterionOperation>();
    for (Criterion criterion : criteria) {
      CampaignCriterionOperation operation = new CampaignCriterionOperation();
      CampaignCriterion campaignCriterion = new CampaignCriterion();
      campaignCriterion.setCampaignId(campaignId);
      campaignCriterion.setCriterion(criterion);
      operation.setOperand(campaignCriterion);
      operation.setOperator(Operator.ADD);
      operations.add(operation);
    }
    
    // Add a negative campaign criterion.
    Keyword negativeKeyword = new Keyword();
    negativeKeyword.setText("jupiter cruise");
    negativeKeyword.setMatchType(KeywordMatchType.BROAD);
    CampaignCriterion negativeCriterion = new NegativeCampaignCriterion();
    negativeCriterion.setCampaignId(campaignId);
    negativeCriterion.setCriterion(negativeKeyword);

    CampaignCriterionOperation operation = new CampaignCriterionOperation();
    operation.setOperand(negativeCriterion);
    operation.setOperator(Operator.ADD);
    operations.add(operation);

    CampaignCriterionReturnValue result =
        campaignCriterionService.mutate(operations
            .toArray(new CampaignCriterionOperation[operations.size()]));

    // Display campaigns.
    for (CampaignCriterion campaignCriterion : result.getValue()) {
      System.out.printf("Campaign criterion with campaign ID %d, criterion ID %d, "
          + "and type '%s' was added.%n", campaignCriterion.getCampaignId(), campaignCriterion
          .getCriterion().getId(), campaignCriterion.getCriterion().getCriterionType());
    }
  }
}
