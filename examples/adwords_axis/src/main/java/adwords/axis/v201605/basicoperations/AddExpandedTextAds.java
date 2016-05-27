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

package adwords.axis.v201605.basicoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201605.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201605.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201605.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201605.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201605.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201605.cm.ExpandedTextAd;
import com.google.api.ads.adwords.axis.v201605.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * This example adds several expanded text ads to a given ad group. To get ad groups, run
 * GetAdGroups.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddExpandedTextAds {

  private static final int NUMBER_OF_ADS = 5;

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

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, long adGroupId) throws Exception {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    List<AdGroupAdOperation> operations = Lists.newArrayList();

    for (int i = 0; i < NUMBER_OF_ADS; i++) {
      // Create expanded text ad.
      ExpandedTextAd expandedTextAd = new ExpandedTextAd();
      expandedTextAd.setHeadlinePart1(String.format("Cruise #%d to Mars", i));
      expandedTextAd.setHeadlinePart2("Best Space Cruise Line");
      expandedTextAd.setDescription("Buy your tickets now!");
      expandedTextAd.setFinalUrls(new String[] {"http://www.example.com/" + i});

      // Create ad group ad.
      AdGroupAd expandedTextAdGroupAd = new AdGroupAd();
      expandedTextAdGroupAd.setAdGroupId(adGroupId);
      expandedTextAdGroupAd.setAd(expandedTextAd);

      // Optional: set the status.
      expandedTextAdGroupAd.setStatus(AdGroupAdStatus.PAUSED);

      // Create the operation.
      AdGroupAdOperation adGroupAdOperation = new AdGroupAdOperation();
      adGroupAdOperation.setOperand(expandedTextAdGroupAd);
      adGroupAdOperation.setOperator(Operator.ADD);

      operations.add(adGroupAdOperation);
    }

    // Add ads.
    AdGroupAdReturnValue result =
        adGroupAdService.mutate(operations.toArray(new AdGroupAdOperation[operations.size()]));

    // Display ads.
    for (AdGroupAd adGroupAdResult : result.getValue()) {
      ExpandedTextAd newAd = (ExpandedTextAd) adGroupAdResult.getAd();
      System.out.printf("Expanded text ad with ID %d and headline '%s - %s' was added.%n",
          newAd.getId(), newAd.getHeadlinePart1(), newAd.getHeadlinePart2());
    }
  }
}
