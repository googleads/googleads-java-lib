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

package adwords.axis.v201603.targeting;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201603.cm.Carrier;
import com.google.api.ads.adwords.axis.v201603.cm.ConstantDataServiceInterface;
import com.google.api.ads.adwords.axis.v201603.cm.Language;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example illustrates how to retrieve all languages and carriers available
 * for targeting.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetTargetableLanguagesAndCarriers {

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

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session) throws Exception {
    // Get the ConstantDataService.
    ConstantDataServiceInterface constantDataService =
        adWordsServices.get(session, ConstantDataServiceInterface.class);

    // Get all carriers.
    Carrier[] carriers = constantDataService.getCarrierCriterion();

    // Display results.
    for (Carrier carrier : carriers) {
      System.out.printf("Carrier with name '%s', ID %d, and country code '%s' was found.%n",
          carrier.getName(), carrier.getId(), carrier.getCountryCode());
    }

    // Get all languages.
    Language[] languages = constantDataService.getLanguageCriterion();

    // Display results.
    for (Language language : languages) {
      System.out.printf("Language with name '%s' and ID %d was found.%n", language.getName(),
          language.getId());
    }
  }
}
