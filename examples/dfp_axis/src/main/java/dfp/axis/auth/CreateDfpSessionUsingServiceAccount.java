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
import com.google.api.ads.dfp.axis.v201502.Network;
import com.google.api.ads.dfp.axis.v201502.NetworkServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.common.collect.ImmutableList;

import java.io.File;

/**
 * This example demonstrates how to create a Credential and a DfpSession object using a service
 * account.
 * 
 * <p>For more information on using service accounts with the DFP API, please see <a
 * href="https://developers.google.com/doubleclick-publishers/docs/service_accounts">using service
 * accounts with DFP</a>.
 */
public class CreateDfpSessionUsingServiceAccount {

  private static final String SERVICE_ACCOUNT_ID = "INSERT_SERVICE_ACCOUNT_ID_HERE";
  private static final String P12_FILE_PATH = "/path/to/key/.p12";
  private static final String SCOPE = "https://www.googleapis.com/auth/dfp";

  public static void runExample(DfpServices dfpServices, DfpSession dfpSession) throws Exception {
    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(dfpSession, NetworkServiceInterface.class);

    // Gets the current network.
    Network network = networkService.getCurrentNetwork();

    System.out.printf("Current network has network code \"%s\" and display name \"%s\".%n",
        network.getNetworkCode(), network.getDisplayName());
  }

  public static void main(String[] args) throws Exception {
    // Create service account credential.
    GoogleCredential credential = new GoogleCredential.Builder()
        .setTransport(new NetHttpTransport())
        .setJsonFactory(new GsonFactory())
        .setServiceAccountId(SERVICE_ACCOUNT_ID)
        .setServiceAccountScopes(ImmutableList.of(SCOPE))
        .setServiceAccountPrivateKeyFromP12File(new File(P12_FILE_PATH))
        .build();
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
