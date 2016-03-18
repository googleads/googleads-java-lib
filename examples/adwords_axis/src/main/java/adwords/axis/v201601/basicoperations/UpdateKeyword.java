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

package adwords.axis.v201601.basicoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201601.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201601.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201601.cm.AdGroupCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201601.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201601.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201601.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201601.cm.Bids;
import com.google.api.ads.adwords.axis.v201601.cm.CpcBid;
import com.google.api.ads.adwords.axis.v201601.cm.Criterion;
import com.google.api.ads.adwords.axis.v201601.cm.Money;
import com.google.api.ads.adwords.axis.v201601.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example updates the bid of a keyword. To add a keyword, run
 * AddKeywords.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateKeyword {

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
    long keywordId = Long.parseLong("INSERT_KEYWORD_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId, keywordId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long adGroupId, Long keywordId)
      throws Exception {
    // Get the AdGroupCriterionService.
    AdGroupCriterionServiceInterface adGroupCriterionService =
        adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

    // Create ad group criterion with updated bid.
    Criterion criterion = new Criterion();
    criterion.setId(keywordId);

    BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
    biddableAdGroupCriterion.setAdGroupId(adGroupId);
    biddableAdGroupCriterion.setCriterion(criterion);

    // Create bids.
    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    CpcBid bid = new CpcBid();
    bid.setBid(new Money(null, 10000000L));
    biddingStrategyConfiguration.setBids(new Bids[] {bid});
    biddableAdGroupCriterion.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    // Create operations.
    AdGroupCriterionOperation operation = new AdGroupCriterionOperation();
    operation.setOperand(biddableAdGroupCriterion);
    operation.setOperator(Operator.SET);

    AdGroupCriterionOperation[] operations = new AdGroupCriterionOperation[] {operation};

    // Update ad group criteria.
    AdGroupCriterionReturnValue result = adGroupCriterionService.mutate(operations);

    // Display ad group criteria.
    for (AdGroupCriterion adGroupCriterionResult : result.getValue()) {
      if (adGroupCriterionResult instanceof BiddableAdGroupCriterion) {
        biddableAdGroupCriterion = (BiddableAdGroupCriterion) adGroupCriterionResult;
        System.out.printf("Ad group criterion with ad group ID %d, criterion ID %d, type "
                + "'%s', and bid %d was updated.%n", biddableAdGroupCriterion.getAdGroupId(),
                biddableAdGroupCriterion.getCriterion().getId(),
                biddableAdGroupCriterion.getCriterion().getCriterionType(),
                ((CpcBid) biddableAdGroupCriterion.getBiddingStrategyConfiguration()
                    .getBids()[0]).getBid().getMicroAmount());
      }
    }
  }
}
