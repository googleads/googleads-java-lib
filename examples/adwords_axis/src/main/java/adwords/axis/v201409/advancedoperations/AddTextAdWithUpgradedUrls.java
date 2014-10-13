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

package adwords.axis.v201409.advancedoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201409.cm.CustomParameter;
import com.google.api.ads.adwords.axis.v201409.cm.CustomParameters;
import com.google.api.ads.adwords.axis.v201409.cm.Operator;
import com.google.api.ads.adwords.axis.v201409.cm.TextAd;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example adds a text ad that uses upgraded URLs. This example
 * will only work if your account is a test account or is whitelisted for
 * this feature.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: AdGroupAdService.mutate
 *
 * Category: adx-exclude
 *
 * @author Josh Radcliff
 */
public class AddTextAdWithUpgradedUrls {

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
    TextAd textAd = new TextAd();
    textAd.setHeadline("Luxury Cruise to Mars");
    textAd.setDescription1("Visit the Red Planet in style.");
    textAd.setDescription2("Low-gravity fun for everyone!");
    textAd.setDisplayUrl("www.example.com");
    
    // Specify a tracking url for 3rd party tracking provider. You may
    // specify one at customer, campaign, ad group, ad, criterion or
    // feed item levels.
    textAd.setTrackingUrlTemplate(
        "http://tracker.example.com/?cid={_season}&promocode={_promocode}&u={lpurl}");
    
    // Since your tracking url has two custom parameters, provide their
    // values too. This can be provided at campaign, ad group, ad, criterion
    // or feed item levels.
    CustomParameter seasonParameter = new CustomParameter();
    seasonParameter.setKey("season");
    seasonParameter.setValue("christmas");

    CustomParameter promoCodeParameter = new CustomParameter();
    promoCodeParameter.setKey("promocode");
    promoCodeParameter.setValue("NYC123");

    CustomParameters trackingUrlParameters = new CustomParameters();
    trackingUrlParameters.setParameters(
        new CustomParameter[] {seasonParameter, promoCodeParameter});
    textAd.setUrlCustomParameters(trackingUrlParameters);
    
    // Specify a list of final urls. This field cannot be set if url field is
    // set. This may be specified at ad, criterion, and feed item levels.
    textAd.setFinalUrls(new String[] {"http://www.example.com/cruise/space/",
        "http://www.example.com/locations/mars/"});
    
    // Specify a list of final mobile urls. This field cannot be set if url field is
    // set or finalUrls is not set. This may be specified at ad, criterion, and feed
    // item levels.
    textAd.setFinalMobileUrls(new String[] {"http://mobile.example.com/cruise/space/",
        "http://mobile.example.com/locations/mars/"});

    // Create ad group ad.
    AdGroupAd textAdGroupAd = new AdGroupAd();
    textAdGroupAd.setAdGroupId(adGroupId);
    textAdGroupAd.setAd(textAd);

    // Optional: Set status.
    textAdGroupAd.setStatus(AdGroupAdStatus.PAUSED);

    // Create operation.
    AdGroupAdOperation textAdGroupAdOperation = new AdGroupAdOperation();
    textAdGroupAdOperation.setOperand(textAdGroupAd);
    textAdGroupAdOperation.setOperator(Operator.ADD);

    AdGroupAdOperation[] operations =
        new AdGroupAdOperation[] {textAdGroupAdOperation};

    // Add ad.
    AdGroupAd adGroupAdResult = adGroupAdService.mutate(operations).getValue(0);

    // Display ad.
    System.out.printf("Ad with ID %d and displayUrl '%s' was added.",
        adGroupAdResult.getAd().getId(), adGroupAdResult.getAd().getDisplayUrl());
  }
}
