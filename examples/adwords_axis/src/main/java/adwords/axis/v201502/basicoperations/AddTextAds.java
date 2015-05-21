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

package adwords.axis.v201502.basicoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201502.cm.Operator;
import com.google.api.ads.adwords.axis.v201502.cm.TextAd;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example adds several text ads to a given ad group. To get ad groups, run
 * GetAdGroups.java. To learn how to handle policy violations and add
 * exemption requests, see HandlePolicyViolationError.java. This code example
 * uses only the final URL field when creating the Ad. To see more options,
 * see AddTextAdWithUpgradedUrls.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: AdGroupAdService.mutate
 *
 * Category: adx-exclude
 *
 * @author Kevin Winter
 */
public class AddTextAds {

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

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, long adGroupId) throws Exception {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    // Create text ads.
    TextAd textAd1 = new TextAd();
    textAd1.setHeadline("Luxury Cruise to Mars");
    textAd1.setDescription1("Visit the Red Planet in style.");
    textAd1.setDescription2("Low-gravity fun for everyone!");
    textAd1.setDisplayUrl("www.example.com");
    textAd1.setFinalUrls(new String[] {"http://www.example.com/1"});
    
    TextAd textAd2 = new TextAd();
    textAd2.setHeadline("Luxury Cruise to Mars");
    textAd2.setDescription1("Enjoy your stay at Red Planet.");
    textAd2.setDescription2("Buy your tickets now!");
    textAd2.setDisplayUrl("www.example.com");
    textAd2.setFinalUrls(new String[] {"http://www.example.com/2"});

    // Create ad group ad.
    AdGroupAd textAdGroupAd1 = new AdGroupAd();
    textAdGroupAd1.setAdGroupId(adGroupId);
    textAdGroupAd1.setAd(textAd1);

    // You can optionally provide these field(s).
    textAdGroupAd1.setStatus(AdGroupAdStatus.PAUSED);

    AdGroupAd textAdGroupAd2 = new AdGroupAd();
    textAdGroupAd2.setAdGroupId(adGroupId);
    textAdGroupAd2.setAd(textAd2);


    // Create operations.
    AdGroupAdOperation textAdGroupAdOperation1 = new AdGroupAdOperation();
    textAdGroupAdOperation1.setOperand(textAdGroupAd1);
    textAdGroupAdOperation1.setOperator(Operator.ADD);
    AdGroupAdOperation textAdGroupAdOperation2 = new AdGroupAdOperation();
    textAdGroupAdOperation2.setOperand(textAdGroupAd2);
    textAdGroupAdOperation2.setOperator(Operator.ADD);

    AdGroupAdOperation[] operations =
        new AdGroupAdOperation[] {textAdGroupAdOperation1, textAdGroupAdOperation2};

    // Add ads.
    AdGroupAdReturnValue result = adGroupAdService.mutate(operations);

    // Display ads.
    for (AdGroupAd adGroupAdResult : result.getValue()) {
      System.out.println("Ad with id  \"" + adGroupAdResult.getAd().getId() + "\"" + " and type \""
          + adGroupAdResult.getAd().getAdType() + "\" was added.");
    }
  }
}
