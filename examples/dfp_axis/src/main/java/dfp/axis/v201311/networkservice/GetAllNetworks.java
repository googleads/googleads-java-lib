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

package dfp.axis.v201311.networkservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201311.Network;
import com.google.api.ads.dfp.axis.v201311.NetworkServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all networks that you have access to with the current
 * authentication credentials. A networkCode should be left out for this request.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: NetworkService.getAllNetworks
 *
 * @author Adam Rogal
 */
public class GetAllNetworks {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(session, NetworkServiceInterface.class);

    // Get all networks that you have access to with the current authentication
    // credentials.
    Network[] networks = networkService.getAllNetworks();

    int i = 0;
    for (Network network : networks) {
      System.out.printf(
          "%d) Network with network code \"%s\" and display name \"%s\" was found.\n",
          i++, network.getNetworkCode(), network.getDisplayName());
    }

    System.out.printf("Number of networks found: %d\n", networks.length);
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    // Remove any network code set from the ads.properties file.
    session.setNetworkCode(null);

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session);
  }
}
