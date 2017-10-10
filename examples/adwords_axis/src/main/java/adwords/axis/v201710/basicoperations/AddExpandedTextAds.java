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

package adwords.axis.v201710.basicoperations;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201710.cm.ExpandedTextAd;
import com.google.api.ads.adwords.axis.v201710.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.util.ArrayList;
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

  private static class AddExpandedTextAdsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
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

    AddExpandedTextAdsParams params = new AddExpandedTextAdsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
    }

    runExample(adWordsServices, session, params.adGroupId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, long adGroupId)
      throws Exception {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    List<AdGroupAdOperation> operations = new ArrayList<>();

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
