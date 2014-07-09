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

package adwords.axis.v201406.errorhandling;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201406.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201406.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201406.cm.AdGroupCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201406.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201406.cm.ApiError;
import com.google.api.ads.adwords.axis.v201406.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201406.cm.Operator;
import com.google.api.ads.adwords.axis.v201406.cm.Placement;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This example demonstrates how to handle partial failures.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: AdGroupCriterionService.mutate
 *
 * @author Adam Rogal
 */
public class HandlePartialFailuresWithPlacements {

  private static Pattern operationIndexPattern = Pattern.compile("^.*operations\\[(\\d+)\\].*$");

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

    long adGroupId = Long.parseLong("INSERT_ADGROUP_ID_HERE");
    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long adGroupId) throws Exception {
    // Enable partial failure.
    session.setPartialFailure(true);

    // Get the AdGroupCriterionService.
    AdGroupCriterionServiceInterface adGroupCriterionService =
        adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

    List<AdGroupCriterionOperation> operations = new ArrayList<AdGroupCriterionOperation>();

    // Create placements.
    String[] placements =
        new String[] {"www.example.com/something", "INVALID!!_URL",
            "www.example.com/somethingelse", "BAD!!_URL"};
    for (String url : placements) {
      // Create placement
      Placement placement = new Placement();
      placement.setUrl(url);

      // Create biddable ad group criterion.
      BiddableAdGroupCriterion placementBiddableAdGroupCriterion = new BiddableAdGroupCriterion();
      placementBiddableAdGroupCriterion.setAdGroupId(adGroupId);
      placementBiddableAdGroupCriterion.setCriterion(placement);

      // Create operation.
      AdGroupCriterionOperation placementAdGroupCriterionOperation =
          new AdGroupCriterionOperation();
      placementAdGroupCriterionOperation.setOperand(placementBiddableAdGroupCriterion);
      placementAdGroupCriterionOperation.setOperator(Operator.ADD);
      operations.add(placementAdGroupCriterionOperation);
    }

    // Add ad group criteria.
    AdGroupCriterionReturnValue result =
        adGroupCriterionService.mutate(operations.toArray(new AdGroupCriterionOperation[] {}));

    // Display results.
    for (AdGroupCriterion adGroupCriterionResult : result.getValue()) {
      if (adGroupCriterionResult.getCriterion() != null) {
        System.out.printf("Ad group criterion with ad group id '%d', and criterion id '%d', "
            + "and placement '%s' was added.\n", adGroupCriterionResult.getAdGroupId(),
            adGroupCriterionResult.getCriterion().getId(),
            ((Placement) adGroupCriterionResult.getCriterion()).getUrl());
      }
    }

    for (ApiError apiError : result.getPartialFailureErrors()) {
      Matcher matcher = operationIndexPattern.matcher(apiError.getFieldPath());
      if (matcher.matches()) {
        int operationIndex = Integer.parseInt(matcher.group(1));
        AdGroupCriterion adGroupCriterion = operations.get(operationIndex).getOperand();
        System.out.printf("Ad group criterion with ad group id '%d' and placement '%s' "
            + "triggered a failure for the following reason: '%s'.\n",
            adGroupCriterion.getAdGroupId(),
            ((Placement) adGroupCriterion.getCriterion()).getUrl(), apiError.getErrorString());
      } else {
        System.out.printf("A failure for the following reason: '%s' has occurred.\n",
            apiError.getErrorString());
      }
    }
  }
}
