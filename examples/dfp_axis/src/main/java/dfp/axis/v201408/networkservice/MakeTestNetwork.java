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

package dfp.axis.v201408.networkservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201408.Network;
import com.google.api.ads.dfp.axis.v201408.NetworkServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a test network. You do not need to have a DFP account to
 * run this example, but you do need to have a Google account (created at
 * https://www.google.com/accounts/newaccount if you currently don't have one)
 * that is not associated with any other DFP test networks. Once this network is
 * created, you can supply the network code in your ads.properties file to make
 * calls to other services.
 *
 * Alternatively, if you do not wish to run this example, you can create a test
 * network at: https://dfp-playground.appspot.com
 *
 * Please see the following URL for more information:
 * https://developers.google.com/doubleclick-publishers/docs/environments
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: NetworkService.makeTestNetwork
 *
 * @author Adam Rogal
 */
public class MakeTestNetwork {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(session, NetworkServiceInterface.class);

    // Make the test network.
    Network network = networkService.makeTestNetwork();

    System.out.printf(
        "Test network with network code \"%s\" and display name \"%s\" created.\n"
        + "You may now sign in at https://www.google.com/dfp/main?networkCode=%s\n",
        network.getNetworkCode(), network.getDisplayName(), network.getNetworkCode());
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

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session);
  }
}
