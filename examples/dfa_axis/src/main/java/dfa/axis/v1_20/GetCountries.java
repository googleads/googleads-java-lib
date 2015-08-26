// Copyright 2013 Google Inc. All Rights Reserved.
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

package dfa.axis.v1_20;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_20.Country;
import com.google.api.ads.dfa.axis.v1_20.CountrySearchCriteria;
import com.google.api.ads.dfa.axis.v1_20.SpotlightRemote;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example displays country type names, codes, and whether the country
 * supports a secure server.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetCountries {

  public static void runExample(DfaServices dfaServices, DfaSession session) throws Exception {
    // Request the service.
    SpotlightRemote service = dfaServices.get(session, SpotlightRemote.class);

    // Set search criteria.
    CountrySearchCriteria countrySearchCriteria = new CountrySearchCriteria ();
    countrySearchCriteria.setSecure(false);

    // Get countries.
    Country[] countries = service.getCountriesByCriteria(countrySearchCriteria);

    // Display country names, codes and secure server support information.
    for (Country result : countries) {
      System.out.println("Country name \"" + result.getName()
          + "\", country code \"" + result.getCountryCode() + "\", supports a secure server? \""
          + result.isSecure() + "\".");
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential, which replaces legacy passwords
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFA)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfaSession.
    DfaSession session = new DfaSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfaServices dfaServices = new DfaServices();

    runExample(dfaServices, session);
  }
}
