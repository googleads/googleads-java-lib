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

package adwords.axis.v201506.campaignmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201506.cm.ApiException;
import com.google.api.ads.adwords.axis.v201506.cm.Operator;
import com.google.api.ads.adwords.axis.v201506.cm.TextAd;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example shows how to use the validate only header through the
 * {@link AdWordsSession#setValidateOnly(Boolean)} method. No objects will be
 * created, but exceptions will still be thrown.
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
public class ValidateTextAd {

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
      AdWordsServices adWordsServices, AdWordsSession session, Long adGroupId) throws Exception {
    // Enable validation.
    session.setValidateOnly(true);

    // Get the validation AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdValidationService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    // Create text ad.
    TextAd textAd1 = new TextAd();
    textAd1.setHeadline("Luxury Cruise to Mars");
    textAd1.setDescription1("Visit the Red Planet in style.");
    textAd1.setDescription2("Low-gravity fun for everyone!");
    textAd1.setDisplayUrl("www.example.com");
    textAd1.setFinalUrls(new String[] {"http://www.example.com"});

    // Create ad group ad.
    AdGroupAd textAdGroupAd1 = new AdGroupAd();
    textAdGroupAd1.setAdGroupId(adGroupId);
    textAdGroupAd1.setAd(textAd1);

    // Create operations.
    AdGroupAdOperation textAdGroupAdOperation1 = new AdGroupAdOperation();
    textAdGroupAdOperation1.setOperand(textAdGroupAd1);
    textAdGroupAdOperation1.setOperator(Operator.ADD);

    AdGroupAdOperation[] operations = new AdGroupAdOperation[] {textAdGroupAdOperation1};

    // Add ads.
    adGroupAdValidationService.mutate(operations);
    
    // No error means the request is valid.

    // Now let's check an invalid ad using a very long line to trigger an error.
    textAd1.setDescription2("Low-gravity fun for all astronauts in orbit.");

    try {
      adGroupAdValidationService.mutate(operations);
    } catch (ApiException e) {
      System.err.println("Validation failed for reason \"" + e.getMessage1() + "\".");
    }
  }
}
