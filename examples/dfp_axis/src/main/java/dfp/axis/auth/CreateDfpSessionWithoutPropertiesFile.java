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

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201711.Network;
import com.google.api.ads.dfp.axis.v201711.NetworkServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example demonstrates how to create a {@link Credential} and an {@link DfpSession}
 * object without using an {@code ads.properties} file.
 */
public class CreateDfpSessionWithoutPropertiesFile {

  private static final String JSON_KEY_FILE_PATH = "INSERT_KEY_FILE_PATH_HERE";
  private static final String APPLICATION_NAME = "INSERT_APPLICATION_NAME_HERE";
  private static final String NETWORK_CODE = "INSERT_NETWORK_CODE_HERE";


  private static DfpSession createDfpSession(String jsonKeyFilePath, String applicationName,
      String networkCode) throws OAuthException, ValidationException {
    // Create a valid OAuth2 credential without using a properties file.
    Credential credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .withJsonKeyFilePath(jsonKeyFilePath)
        .build()
        .generateCredential();

    // Create a new DfpSession without using a properties file.
    return new DfpSession.Builder()
        .withOAuth2Credential(credential)
        .withApplicationName(applicationName)
        .withNetworkCode(networkCode)
        .build();
  }

  public static void runExample(DfpServices dfpServices, DfpSession dfpSession)
      throws Exception {
    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(dfpSession, NetworkServiceInterface.class);

    // Gets the current network.
    Network network = networkService.getCurrentNetwork();

    System.out.printf("Current network has network code '%s' and display name '%s'.%n",
        network.getNetworkCode(), network.getDisplayName());
  }

  public static void main(String[] args) throws Exception {
    // Create an DfpSession without using a properties file.
    DfpSession dfpSession = createDfpSession(JSON_KEY_FILE_PATH, APPLICATION_NAME, NETWORK_CODE);
    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, dfpSession);
  }
}
