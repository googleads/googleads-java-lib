// Copyright 2012 Google Inc. All Rights Reserved.
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

package dfa.axis.v1_19;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_19.Advertiser;
import com.google.api.ads.dfa.axis.v1_19.AdvertiserRemote;
import com.google.api.ads.dfa.axis.v1_19.AdvertiserSaveResult;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates an advertiser in a given DFA network. To get your
 * network ID, run Authenticate.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: advertiser.saveAdvertiser
 *
 * @author Joseph DiLallo
 */
public class CreateAdvertiser {

  // Set the name for the new advertiser.
  private static final String ADVERTISER_NAME = "INSERT_ADVERTISER_NAME_HERE";

  public static void runExample(DfaServices dfaServices, DfaSession session, String advertiserName)
      throws Exception {
    // Request the advertiser service from the service client factory.
    AdvertiserRemote advertiserService = dfaServices.get(session, AdvertiserRemote.class);

    // Create the advertiser structure.
    Advertiser advertiser = new Advertiser();
    advertiser.setId(0);
    advertiser.setName(advertiserName);
    advertiser.setAdvertiserGroupId(0);
    advertiser.setApproved(true);

    // Create the advertiser.
    AdvertiserSaveResult advertiserSaveResult = advertiserService.saveAdvertiser(advertiser);

    // Display the advertiser ID.
    System.out.printf("Advertiser with ID \"%s\" was created.%n", advertiserSaveResult.getId());
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

    runExample(dfaServices, session, ADVERTISER_NAME);
  }
}
