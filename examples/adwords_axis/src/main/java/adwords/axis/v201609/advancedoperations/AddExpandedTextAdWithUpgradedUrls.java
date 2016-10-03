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

package adwords.axis.v201609.advancedoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201609.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201609.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201609.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201609.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201609.cm.CustomParameter;
import com.google.api.ads.adwords.axis.v201609.cm.CustomParameters;
import com.google.api.ads.adwords.axis.v201609.cm.ExpandedTextAd;
import com.google.api.ads.adwords.axis.v201609.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example adds an expanded text ad that uses advanced features of upgraded URLs.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddExpandedTextAdWithUpgradedUrls {

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

    // Create expanded text ad with a tracking template and custom parameters.
    ExpandedTextAd expandedTextAd = new ExpandedTextAd();
    expandedTextAd.setHeadlinePart1("Luxury Cruise to Mars");
    expandedTextAd.setHeadlinePart2("Visit the Red Planet in style.");
    expandedTextAd.setDescription("Low-gravity fun for everyone!");
    
    // Specify a tracking url for 3rd party tracking provider. You may
    // specify one at customer, campaign, ad group, ad, criterion or
    // feed item levels.
    expandedTextAd.setTrackingUrlTemplate(
        "http://tracker.example.com/?season={_season}&promocode={_promocode}&u={lpurl}");
    
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
    expandedTextAd.setUrlCustomParameters(trackingUrlParameters);
    
    // Specify a list of final urls. This field cannot be set if url field is
    // set. This may be specified at ad, criterion, and feed item levels.
    expandedTextAd.setFinalUrls(new String[] {"http://www.example.com/cruise/space/",
        "http://www.example.com/locations/mars/"});
    
    // Specify a list of final mobile urls. This field cannot be set if url field is
    // set or finalUrls is not set. This may be specified at ad, criterion, and feed
    // item levels.
    expandedTextAd.setFinalMobileUrls(new String[] {"http://mobile.example.com/cruise/space/",
        "http://mobile.example.com/locations/mars/"});

    // Create ad group ad.
    AdGroupAd textAdGroupAd = new AdGroupAd();
    textAdGroupAd.setAdGroupId(adGroupId);
    textAdGroupAd.setAd(expandedTextAd);

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
    System.out.printf("Ad with ID %d and tracking URL template '%s' was added.",
        adGroupAdResult.getAd().getId(), adGroupAdResult.getAd().getTrackingUrlTemplate());
  }
}
