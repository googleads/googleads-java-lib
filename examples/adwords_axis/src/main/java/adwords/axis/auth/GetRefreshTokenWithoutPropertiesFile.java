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

package adwords.axis.auth;

import com.google.api.ads.common.lib.auth.GoogleClientSecretsBuilder;
import com.google.api.ads.common.lib.auth.GoogleClientSecretsBuilder.Api;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeTokenRequest;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.auth.oauth2.GoogleTokenResponse;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.common.base.Strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * This example will create an OAuth2 refresh token that can be used with the
 * OfflineCredentials utility.
 *
 * <p>This example is meant to be run from the command line and requires user
 * input. This example does not use a properties file.
 */
public class GetRefreshTokenWithoutPropertiesFile {

  private static final String SCOPE = "https://www.googleapis.com/auth/adwords";

  // This callback URL will allow you to copy the token from the success screen.
  private static final String CALLBACK_URL = "urn:ietf:wg:oauth:2.0:oob";

  private static Credential getOAuth2Credential(GoogleClientSecrets clientSecrets)
      throws IOException {
    GoogleAuthorizationCodeFlow authorizationFlow = new GoogleAuthorizationCodeFlow.Builder(
        new NetHttpTransport(),
        new JacksonFactory(),
        clientSecrets,
        Arrays.asList(SCOPE))
        // Set the access type to offline so that the token can be refreshed.
        // By default, the library will automatically refresh tokens when it
        // can, but this can be turned off by setting
        // api.adwords.refreshOAuth2Token=false in your ads.properties file.
        .setAccessType("offline").build();

    String authorizeUrl =
        authorizationFlow.newAuthorizationUrl().setRedirectUri(CALLBACK_URL).build();
    System.out.printf("Paste this url in your browser:%n%s%n", authorizeUrl);

    // Wait for the authorization code.
    System.out.println("Type the code you received here: ");
    @SuppressWarnings("DefaultCharset") // Reading from stdin, so default charset is appropriate.
    String authorizationCode = new BufferedReader(new InputStreamReader(System.in)).readLine();

    // Authorize the OAuth2 token.
    GoogleAuthorizationCodeTokenRequest tokenRequest =
        authorizationFlow.newTokenRequest(authorizationCode);
    tokenRequest.setRedirectUri(CALLBACK_URL);
    GoogleTokenResponse tokenResponse = tokenRequest.execute();

    // Create the OAuth2 credential.
    GoogleCredential credential = new GoogleCredential.Builder()
        .setTransport(new NetHttpTransport())
        .setJsonFactory(new JacksonFactory())
        .setClientSecrets(clientSecrets)
        .build();

    // Set authorized credentials.
    credential.setFromTokenResponse(tokenResponse);

    return credential;
  }

  public static void main(String[] args) {
    String clientId;
    String clientSecret;
    @SuppressWarnings("DefaultCharset") // Reading from stdin, so default charset is appropriate.
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please input your client ID and secret. "
          + "If you do not have a client ID or secret, please create one in "
          + "the API console: https://console.developers.google.com");
    try {
      System.out.println("Enter your client ID: ");
      clientId = reader.readLine();
      if (Strings.isNullOrEmpty(clientId)) {
        System.err.println("Invalid client ID.");
        return;
      }
      System.out.println("Enter your client secret: ");
      clientSecret = reader.readLine();
      if (Strings.isNullOrEmpty(clientSecret)) {
        System.err.println("Invalid client secret.");
        return;
      }
    } catch (IOException ioe) {
      System.err.printf("Failed to read client ID and secret: %s%n", ioe);
      return;
    }

    GoogleClientSecrets clientSecrets = null;
    try {
      clientSecrets = new GoogleClientSecretsBuilder()
          .forApi(Api.ADWORDS)
          .withClientSecrets(clientId, clientSecret)
          .build();
    } catch (ValidationException e) {
      System.err.println(
          "Please input your client ID and secret. If you do not have a "
          + "client ID or secret, please create one in "
          + "the API console: https://console.developers.google.com");
      return;
    }

    // Get the OAuth2 credential.
    Credential credential = null;
    try {
      credential = getOAuth2Credential(clientSecrets);
    } catch (IOException ioe) {
      System.err.printf("Failed to generate credentials. Exception: %s%n", ioe);
      return;
    }

    System.out.printf("Your refresh token is: %s%n", credential.getRefreshToken());
  }
}
