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

package dfa.axis.auth;

import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_20.Advertiser;
import com.google.api.ads.dfa.axis.v1_20.AdvertiserRecordSet;
import com.google.api.ads.dfa.axis.v1_20.AdvertiserRemote;
import com.google.api.ads.dfa.axis.v1_20.AdvertiserSearchCriteria;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeTokenRequest;
import com.google.api.client.googleapis.auth.oauth2.GoogleTokenResponse;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.DataStoreFactory;
import com.google.api.client.util.store.MemoryDataStoreFactory;
import com.google.common.collect.Lists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This example demonstrates how to create a Credential object from scratch.<br>
 * This example is *not* meant to be used with our other examples, but shows
 * how you might use the general OAuth2 libraries to add OAuth2 to your
 * existing application.<br>
 * <br>
 * For an alternative to service accounts, installed applications, or a web
 * application that will not need to have multiple users log in, using
 * OfflineCredentials to generate a refreshable OAuth2
 * credential instead will be much easier.
 *
 * @author Adam Rogal
 */
public class AdvancedCreateCredentialFromScratch {

  private static final String SCOPE = "https://www.googleapis.com/auth/dfatrafficking";

  // This callback URL will allow you to copy the token from the success screen.
  // This must match the one associated with your client ID.
  private static final String CALLBACK_URL = "urn:ietf:wg:oauth:2.0:oob";

  // If you do not have a client ID or secret, please create one in the
  // API console: https://code.google.com/apis/console#access
  private static final String CLIENT_ID = "INSERT_CLIENT_ID_HERE";
  private static final String CLIENT_SECRET = "INSERT_CLIENT_SECRET_HERE";

  // Select which DFA User Profile linked to your Google Account will be used
  // for these requests.
  private static final String DFA_USER_PROFILE_NAME = "INSERT_DFA_USER_PROFILE_NAME_HERE";

  private static void authorize(DataStoreFactory storeFactory, String userName) throws Exception {
    // Depending on your application, there may be more appropriate ways of
    // performing the authorization flow (such as on a servlet), see
    // https://code.google.com/p/google-api-java-client/wiki/OAuth2#Authorization_Code_Flow
    // for more information.
    GoogleAuthorizationCodeFlow authorizationFlow = new GoogleAuthorizationCodeFlow.Builder(
        new NetHttpTransport(),
        new JacksonFactory(),
        CLIENT_ID,
        CLIENT_SECRET,
        Lists.newArrayList(SCOPE))
        .setDataStoreFactory(storeFactory)
        // Set the access type to offline so that the token can be refreshed.
        // By default, the library will automatically refresh tokens when it
        // can, but this can be turned off by setting
        // api.dfa.refreshOAuth2Token=false in your ads.properties file.
        .setAccessType("offline").build();

    String authorizeUrl =
        authorizationFlow.newAuthorizationUrl().setRedirectUri(CALLBACK_URL).build();
    System.out.println("Paste this url in your browser: \n" + authorizeUrl + '\n');

    // Wait for the authorization code.
    System.out.println("Type the code you received here: ");
    String authorizationCode = new BufferedReader(new InputStreamReader(System.in)).readLine();

    // Authorize the OAuth2 token.
    GoogleAuthorizationCodeTokenRequest tokenRequest =
        authorizationFlow.newTokenRequest(authorizationCode);
    tokenRequest.setRedirectUri(CALLBACK_URL);
    GoogleTokenResponse tokenResponse = tokenRequest.execute();

    // Store the credential for the user.
    authorizationFlow.createAndStoreCredential(tokenResponse, userName);
  }

  private static DfaSession createDfaSession(DataStoreFactory storeFactory, String userId)
      throws IOException, ValidationException, ConfigurationLoadException {
    // Create a GoogleCredential with minimal information.
    GoogleAuthorizationCodeFlow authorizationFlow = new GoogleAuthorizationCodeFlow.Builder(
        new NetHttpTransport(),
        new JacksonFactory(),
        CLIENT_ID,
        CLIENT_SECRET,
        Lists.newArrayList(SCOPE))
        .setDataStoreFactory(storeFactory).build();

    // Load the credential.
    Credential credential = authorizationFlow.loadCredential(userId);

    // Construct a DfaSession.
    return new DfaSession.Builder()
        .fromFile()
        .withUsernameAndOAuth2Credential(userId, credential)
        .build();
  }

  public static void runExample(DfaServices dfaServices, DfaSession session) throws Exception {
    // Request the advertiser service from the service client factory.
    AdvertiserRemote advertiserService = dfaServices.get(session, AdvertiserRemote.class);

    // Create advertiser search criteria structure.
    AdvertiserSearchCriteria advSearchCriteria = new AdvertiserSearchCriteria();
    advSearchCriteria.setPageSize(100);
    // When paging, start counting page numbers from 1 rather than 0.
    advSearchCriteria.setPageNumber(1);

    AdvertiserRecordSet advertiserRecordSet;
    int i = 1;

    do {
      // Get advertisers by criteria.
      advertiserRecordSet = advertiserService.getAdvertisers(
          advSearchCriteria);

      for (Advertiser result : advertiserRecordSet.getRecords()) {
        System.out.printf("%s) Advertiser with name \"%s\", ID \"%s\", and spotlight " +
            "configuration ID \"%s\" was found.%n", i++, result.getName(), result.getId(),
            result.getSpotId());
      }

      advSearchCriteria.setPageNumber(advSearchCriteria.getPageNumber() + 1);
    } while (advSearchCriteria.getPageNumber() <= advertiserRecordSet.getTotalNumberOfPages());

    System.out.printf("Number of results found: %s%n",
        advertiserRecordSet.getTotalNumberOfRecords());
  }

  public static void main(String[] args) throws Exception {
    if (CLIENT_ID.equals("INSERT_CLIENT_ID_HERE")
        || CLIENT_SECRET.equals("INSERT_CLIENT_SECRET_HERE")) {
      throw new IllegalArgumentException("Please input your client IDs or secret. "
          + "See https://code.google.com/apis/console#access");
    }

    // It is highly recommended that you use a credential store in your
    // application to store a per-user Credential.
    // See: https://code.google.com/p/google-oauth-java-client/wiki/OAuth2
    DataStoreFactory store = MemoryDataStoreFactory.getDefaultInstance();

    // Authorize and store your credential.
    authorize(store, DFA_USER_PROFILE_NAME);

    // Create a DfaSession from the credential store. You will typically do this
    // in a servlet interceptor for a web application or per separate thread
    // of your offline application.
    DfaSession dfaSession = createDfaSession(store, DFA_USER_PROFILE_NAME);

    DfaServices dfaServices = new DfaServices();

    runExample(dfaServices, dfaSession);
  }
}
