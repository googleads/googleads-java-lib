// Copyright 2015 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package dfp.axis.auth;

import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201602.Network;
import com.google.api.ads.dfp.axis.v201602.NetworkServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.common.collect.Lists;

import java.io.FileInputStream;

/**
 * This example demonstrates how to create a Credential and a DfpSession object using a service
 * account.
 * 
 * <p>For more information on using service accounts with the DFP API, please see <a
 * href="https://developers.google.com/doubleclick-publishers/docs/service_accounts">using service
 * accounts with DFP</a>.
 */
public class CreateDfpSessionUsingServiceAccount {

  private static final String JSON_FILE_PATH = "INSERT_PATH_TO_JSON_KEYPAIR_FILE_HERE";
  private static final String SCOPE = "https://www.googleapis.com/auth/dfp";

  public static void runExample(DfpServices dfpServices, DfpSession dfpSession) throws Exception {
    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(dfpSession, NetworkServiceInterface.class);

    // Gets the current network.
    Network network = networkService.getCurrentNetwork();

    System.out.printf("Current network has network code '%s' and display name '%s'.%n",
        network.getNetworkCode(), network.getDisplayName());
  }

  public static void main(String[] args) throws Exception {
    // Create service account credential.
    GoogleCredential credential = GoogleCredential
        .fromStream(new FileInputStream(JSON_FILE_PATH))
        .createScoped(Lists.newArrayList(SCOPE));
        
    credential.refreshToken();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session);
  }
}
