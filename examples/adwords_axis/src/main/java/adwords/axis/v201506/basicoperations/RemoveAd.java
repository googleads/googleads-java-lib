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

package adwords.axis.v201506.basicoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201506.cm.Ad;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201506.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example removes an ad using the 'REMOVE' operator. To get ads, run
 * GetTextAds.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class RemoveAd {

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
    long adId = Long.parseLong("INSERT_AD_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId, adId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, long adGroupId, long adId)
      throws Exception {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    // Create base class ad to avoid setting type specific fields.
    Ad ad = new Ad();
    ad.setId(adId);

    // Create ad group ad.
    AdGroupAd adGroupAd = new AdGroupAd();
    adGroupAd.setAdGroupId(adGroupId);
    adGroupAd.setAd(ad);

    // Create operations.
    AdGroupAdOperation operation = new AdGroupAdOperation();
    operation.setOperand(adGroupAd);
    operation.setOperator(Operator.REMOVE);

    AdGroupAdOperation[] operations = new AdGroupAdOperation[] {operation};

    // Remove ad.
    AdGroupAdReturnValue result = adGroupAdService.mutate(operations);

    // Display ads.
    for (AdGroupAd adGroupAdResult : result.getValue()) {
      System.out.println("Ad with id \"" + adGroupAdResult.getAd().getId() + "\" and type \""
          + adGroupAdResult.getAd().getAdType() + "\" was removed.");
    }
  }
}
