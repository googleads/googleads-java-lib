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

package adwords.axis.v201509.basicoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201509.cm.Ad;
import com.google.api.ads.adwords.axis.v201509.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201509.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201509.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201509.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201509.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201509.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example updates status for a given ad. To get ads, run GetTextAds.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class PauseAd {

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

    long adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
    long adId = Long.parseLong("INSERT_AD_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId, adId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long adGroupId, Long adId)
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
      System.out.println("Ad with id \"" + adGroupAdResult.getAd().getId() + "\", type \""
          + adGroupAdResult.getAd().getAdType() + "\", and status \"" + adGroupAdResult.getStatus()
          + "\" was updated.");
    }
  }
}
