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

package adwords.axis.v201702.targeting;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201702.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201702.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201702.cm.AdGroupCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201702.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201702.cm.AgeRange;
import com.google.api.ads.adwords.axis.v201702.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201702.cm.Gender;
import com.google.api.ads.adwords.axis.v201702.cm.NegativeAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201702.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example adds demographic criteria to an ad group. To get ad groups, run
 * GetAdGroups.java
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddDemographicTargetingCriteria {

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

    long adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    runExample(adWordsServices, session, adGroupId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Long adGroupId)
      throws Exception {
    // Get the AdGroupCriterionService.
    AdGroupCriterionServiceInterface adGroupCriterionService =
        adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

    // https://developers.google.com/adwords/api/docs/appendix/genders
    Gender male = new Gender();
    male.setId(10L);
    BiddableAdGroupCriterion genderBiddableAdGroupCriterion = new BiddableAdGroupCriterion();
    genderBiddableAdGroupCriterion.setAdGroupId(adGroupId);
    genderBiddableAdGroupCriterion.setCriterion(male);

    // https://developers.google.com/adwords/api/docs/appendix/ages
    AgeRange undetermined = new AgeRange();
    undetermined.setId(503999L);
    NegativeAdGroupCriterion ageRangeNegativeAdGroupCriterion = new NegativeAdGroupCriterion();
    ageRangeNegativeAdGroupCriterion.setAdGroupId(adGroupId);
    ageRangeNegativeAdGroupCriterion.setCriterion(undetermined);

    AdGroupCriterionOperation genderAdGroupCriterionOperation = new AdGroupCriterionOperation();
    genderAdGroupCriterionOperation.setOperand(genderBiddableAdGroupCriterion);
    genderAdGroupCriterionOperation.setOperator(Operator.ADD);
    AdGroupCriterionOperation ageRangeNegativeAdGroupCriterionOperation =
        new AdGroupCriterionOperation();
    ageRangeNegativeAdGroupCriterionOperation.setOperand(ageRangeNegativeAdGroupCriterion);
    ageRangeNegativeAdGroupCriterionOperation.setOperator(Operator.ADD);

    AdGroupCriterionReturnValue result =
        adGroupCriterionService.mutate(new AdGroupCriterionOperation[] {
            genderAdGroupCriterionOperation, ageRangeNegativeAdGroupCriterionOperation});

    // Display campaigns.
    for (AdGroupCriterion adGroupCriterion : result.getValue()) {
      System.out.printf("AdGroup criterion with adGroup ID %d, criterion ID %d, "
          + "and type '%s' was added.%n", adGroupCriterion.getAdGroupId(),
          adGroupCriterion.getCriterion().getId(),
          adGroupCriterion.getCriterion().getCriterionType());
    }
  }
}
