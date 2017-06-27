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

package adwords.axis.v201705.basicoperations;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201705.cm.Ad;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201705.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example updates status for a given ad. To get ads, run GetExpandedTextAds.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class PauseAd {

  private static class PauseAdParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    @Parameter(names = ArgumentNames.AD_ID, required = true)
    private Long adId;
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

    PauseAdParams params = new PauseAdParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      params.adId = Long.parseLong("INSERT_AD_ID_HERE");
    }

    runExample(adWordsServices, session, params.adGroupId, params.adId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Long adGroupId, Long adId)
      throws Exception {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    // Create ad with updated status.
    Ad ad = new Ad();
    ad.setId(adId);

    AdGroupAd adGroupAd = new AdGroupAd();
    adGroupAd.setAdGroupId(adGroupId);
    adGroupAd.setAd(ad);
    adGroupAd.setStatus(AdGroupAdStatus.PAUSED);

    // Create operations.
    AdGroupAdOperation operation = new AdGroupAdOperation();
    operation.setOperand(adGroupAd);
    operation.setOperator(Operator.SET);

    AdGroupAdOperation[] operations = new AdGroupAdOperation[] {operation};

    // Update ad.
    AdGroupAdReturnValue result = adGroupAdService.mutate(operations);

    // Display ads.
    for (AdGroupAd adGroupAdResult : result.getValue()) {
      System.out.printf("Ad with ID %d, type '%s', and status '%s' was updated.%n",
          adGroupAdResult.getAd().getId(), adGroupAdResult.getAd().getAdType(), 
          adGroupAdResult.getStatus());
    }
  }
}
