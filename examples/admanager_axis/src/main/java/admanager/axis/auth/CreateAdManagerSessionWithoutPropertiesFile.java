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

package admanager.axis.auth;

import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.v202408.Network;
import com.google.api.ads.admanager.axis.v202408.NetworkServiceInterface;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example demonstrates how to create a {@link Credential} and an {@link AdManagerSession}
 * object without using an {@code ads.properties} file.
 */
public class CreateAdManagerSessionWithoutPropertiesFile {

  private static final String JSON_KEY_FILE_PATH = "INSERT_KEY_FILE_PATH_HERE";
  private static final String APPLICATION_NAME = "INSERT_APPLICATION_NAME_HERE";
  private static final String NETWORK_CODE = "INSERT_NETWORK_CODE_HERE";

  private static AdManagerSession createAdManagerSession(
      String jsonKeyFilePath, String applicationName, String networkCode)
      throws OAuthException, ValidationException {
    // Create a valid OAuth2 credential without using a properties file.
    Credential credential =
        new OfflineCredentials.Builder()
            .forApi(Api.AD_MANAGER)
            .withJsonKeyFilePath(jsonKeyFilePath)
            .build()
            .generateCredential();

    // Create a new AdManagerSession without using a properties file.
    return new AdManagerSession.Builder()
        .withOAuth2Credential(credential)
        .withApplicationName(applicationName)
        .withNetworkCode(networkCode)
        .build();
  }

  public static void runExample(
      AdManagerServices adManagerServices, AdManagerSession adManagerSession) throws Exception {
    // Get the NetworkService.
    NetworkServiceInterface networkService =
        adManagerServices.get(adManagerSession, NetworkServiceInterface.class);

    // Gets the current network.
    Network network = networkService.getCurrentNetwork();

    System.out.printf(
        "Current network has network code '%s' and display name '%s'.%n",
        network.getNetworkCode(), network.getDisplayName());
  }

  public static void main(String[] args) throws Exception {
    // Create an AdManagerSession without using a properties file.
    AdManagerSession adManagerSession =
        createAdManagerSession(JSON_KEY_FILE_PATH, APPLICATION_NAME, NETWORK_CODE);
    AdManagerServices adManagerServices = new AdManagerServices();

    runExample(adManagerServices, adManagerSession);
  }
}
