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

package adwords.axis.v201607.targeting;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201607.cm.CampaignCriterion;
import com.google.api.ads.adwords.axis.v201607.cm.CampaignCriterionOperation;
import com.google.api.ads.adwords.axis.v201607.cm.CampaignCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201607.cm.CampaignCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201607.cm.ConstantOperand;
import com.google.api.ads.adwords.axis.v201607.cm.ConstantOperandConstantType;
import com.google.api.ads.adwords.axis.v201607.cm.ConstantOperandUnit;
import com.google.api.ads.adwords.axis.v201607.cm.Criterion;
import com.google.api.ads.adwords.axis.v201607.cm.Function;
import com.google.api.ads.adwords.axis.v201607.cm.FunctionArgumentOperand;
import com.google.api.ads.adwords.axis.v201607.cm.FunctionOperator;
import com.google.api.ads.adwords.axis.v201607.cm.GeoTargetOperand;
import com.google.api.ads.adwords.axis.v201607.cm.IncomeOperand;
import com.google.api.ads.adwords.axis.v201607.cm.IncomeTier;
import com.google.api.ads.adwords.axis.v201607.cm.Keyword;
import com.google.api.ads.adwords.axis.v201607.cm.KeywordMatchType;
import com.google.api.ads.adwords.axis.v201607.cm.Language;
import com.google.api.ads.adwords.axis.v201607.cm.Location;
import com.google.api.ads.adwords.axis.v201607.cm.LocationExtensionOperand;
import com.google.api.ads.adwords.axis.v201607.cm.LocationGroups;
import com.google.api.ads.adwords.axis.v201607.cm.NegativeCampaignCriterion;
import com.google.api.ads.adwords.axis.v201607.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
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

    Long campaignId = Long.valueOf("INSERT_CAMPAIGN_ID_HERE");
    // Replace the value below with the ID of a feed that has been configured for location
    // targeting, meaning it has an ENABLED FeedMapping with criterionType of 77. Feeds linked to a
    // GMB account automatically have this FeedMapping.
    // If you don't have such a feed, set this value to null.
    Long locationFeedId = Long.valueOf("INSERT_LOCATION_FEED_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, campaignId, locationFeedId);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session,
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
    
    // Location groups criteria. These represent targeting by household income
    // or places of interest. The IDs can be found in the documentation or
    // retrieved with the LocationCriterionService.
    LocationGroups locationGroupTier3 = new LocationGroups();
    Function tier3MatchingFunction = new Function();
    tier3MatchingFunction.setLhsOperand(new FunctionArgumentOperand[] {
        // Tiers are numbered 1-10, and represent 10% segments of earners.
        // For example, TIER_1 is the top 10%, TIER_2 is the 80-90%, etc.
        // Tiers 6 through 10 are grouped into TIER_6_TO_10.
        new IncomeOperand(null, IncomeTier.TIER_3)
    });
    tier3MatchingFunction.setOperator(FunctionOperator.AND);
    tier3MatchingFunction.setRhsOperand(new FunctionArgumentOperand[] {
        new GeoTargetOperand(null, new long[]{ 1015116L }) // Miami, FL
    });
    locationGroupTier3.setMatchingFunction(tier3MatchingFunction);

    List<Criterion> criteria = new ArrayList<>(Arrays.asList(
        california, mexico, english, spanish, locationGroupTier3));
    
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
