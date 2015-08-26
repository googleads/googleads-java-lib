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

package dfa.axis.auth;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_20.Advertiser;
import com.google.api.ads.dfa.axis.v1_20.AdvertiserRecordSet;
import com.google.api.ads.dfa.axis.v1_20.AdvertiserRemote;
import com.google.api.ads.dfa.axis.v1_20.AdvertiserSearchCriteria;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example demonstrates how to create a Credential and an DfaSession
 * object without using an ads.properties file.
 */
public class CreateDfaSessionWithoutPropertiesFile {

  private static final String CLIENT_ID = "INSERT_CLIENT_ID_HERE";
  private static final String CLIENT_SECRET = "INSERT_CLIENT_SECRET_HERE";
  private static final String REFRESH_TOKEN = "INSERT_REFRESH_TOKEN_HERE";

  // Select which DFA User Profile linked to your Google Account will be used
  // for these requests.
  private static final String DFA_USER_PROFILE_NAME = "INSERT_DFA_USER_PROFILE_NAME_HERE";

  private static DfaSession createDfaSession(String clientId, String clientSecret,
      String refreshToken, String username) throws OAuthException,
      ValidationException {
    // Create a valid OAuth 2.0 credential without using a properties file.
    Credential credential = new OfflineCredentials.Builder()
        .forApi(Api.DFA)
        .withClientSecrets(clientId, clientSecret)
        .withRefreshToken(refreshToken)
        .build()
        .generateCredential();

    // Create a new DfaSession without using a properties file.
    return new DfaSession.Builder()
        .withUsernameAndOAuth2Credential(username, credential)
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
        System.out.printf("%s) Advertiser with name \"%s\", ID \"%s\", and spotlight "
            + "configuration ID \"%s\" was found.%n", i++, result.getName(), result.getId(),
            result.getSpotId());
      }

      advSearchCriteria.setPageNumber(advSearchCriteria.getPageNumber() + 1);
    } while (advSearchCriteria.getPageNumber() <= advertiserRecordSet.getTotalNumberOfPages());

    System.out.printf("Number of results found: %s%n",
        advertiserRecordSet.getTotalNumberOfRecords());
  }

  public static void main(String[] args) throws Exception {
    if (DFA_USER_PROFILE_NAME.equals("INSERT_DFA_USER_PROFILE_NAME_HERE")) {
      throw new IllegalArgumentException("Please input your user profile name.");
    }

    if (CLIENT_ID.equals("INSERT_CLIENT_ID_HERE")
        || CLIENT_SECRET.equals("INSERT_CLIENT_SECRET_HERE")) {
      throw new IllegalArgumentException("Please input your client IDs or secret. "
          + "See https://console.developers.google.com/project");
    }

    if (REFRESH_TOKEN.equals("INSERT_REFRESH_TOKEN_HERE")) {
      throw new IllegalArgumentException(
          "Please input your refresh token. See GetRefreshTokenWithoutPropertiesFile.java.");
    }

    // Create an DfaSession without using a properties file.
    DfaSession dfaSession = createDfaSession(CLIENT_ID,
        CLIENT_SECRET, REFRESH_TOKEN, DFA_USER_PROFILE_NAME);
    DfaServices dfaServices = new DfaServices();

    runExample(dfaServices, dfaSession);
  }
}
