// Copyright 2014 Google Inc. All Rights Reserved.
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

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201311.Network;
import com.google.api.ads.dfp.axis.v201311.NetworkServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example demonstrates how to create a Credential and an DfpSession
 * object without using an ads.properties file.
 *
 * @author Ray Tsang
 */
public class CreateDfpSessionWithoutPropertiesFile {

  private static final String CLIENT_ID = "INSERT_CLIENT_ID_HERE";
  private static final String CLIENT_SECRET = "INSERT_CLIENT_SECRET_HERE";
  private static final String REFRESH_TOKEN = "INSERT_REFRESH_TOKEN_HERE";

  private static DfpSession createDfpSession(String clientId, String clientSecret,
      String refreshToken) throws OAuthException,
      ValidationException {
    // Create a valid OAuth 2.0 credential without using a properties file.
    Credential credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .withClientSecrets(clientId, clientSecret)
        .withRefreshToken(refreshToken)
        .build()
        .generateCredential();

    // Create a new DfpSession without using a properties file.
    return new DfpSession.Builder()
        .withOAuth2Credential(credential)
        .build();
  }

  public static void runExample(DfpServices dfpServices, DfpSession dfpSession)
      throws Exception {
    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(dfpSession, NetworkServiceInterface.class);

    // Gets the current network.
    Network network = networkService.getCurrentNetwork();

    System.out.printf("Current network has network code \"%s\" and display name \"%s\".\n",
        network.getNetworkCode(), network.getDisplayName());
  }

  public static void main(String[] args) throws Exception {
    if (CLIENT_ID.equals("INSERT_CLIENT_ID_HERE")
        || CLIENT_SECRET.equals("INSERT_CLIENT_SECRET_HERE")) {
      throw new IllegalArgumentException("Please input your client IDs or secret. "
          + "See https://console.developers.google.com/project");
    }

    if (REFRESH_TOKEN.equals("INSERT_REFRESH_TOKEN_HERE")) {
      throw new IllegalArgumentException(
          "Please input your refresh token. See GetRefreshTokenWithoutPropertiesFile.java.");
    }

    // Create an DfpSession without using a properties file.
    DfpSession dfpSession = createDfpSession(CLIENT_ID, CLIENT_SECRET, REFRESH_TOKEN);
    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, dfpSession);
  }
}
