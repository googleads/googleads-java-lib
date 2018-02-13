// Copyright 2013 Google Inc. All Rights Reserved.
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

package adwords.axis.auth;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.mcm.Customer;
import com.google.api.ads.adwords.axis.v201710.mcm.CustomerServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example demonstrates how to create a Credential and an AdWordsSession
 * object without using an ads.properties file.
 */
public class CreateAdWordsSessionWithoutPropertiesFile {

  private static final String CLIENT_ID = "INSERT_CLIENT_ID_HERE";
  private static final String CLIENT_SECRET = "INSERT_CLIENT_SECRET_HERE";
  private static final String REFRESH_TOKEN = "INSERT_REFRESH_TOKEN_HERE";
  private static final String DEVELOPER_TOKEN = "INSERT_DEVELOPER_TOKEN_HERE";
  private static final String USER_AGENT = "INSERT_USER_AGENT_HERE";

  private static AdWordsSession createAdWordsSession(String clientId, String clientSecret,
      String refreshToken, String developerToken, String userAgent) throws OAuthException,
      ValidationException {
    // Create a valid OAuth2 credential without using a properties file.
    Credential credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .withClientSecrets(clientId, clientSecret)
        .withRefreshToken(refreshToken)
        .build()
        .generateCredential();

    // Create a new AdWordsSession without using a properties file.
    return new AdWordsSession.Builder()
        .withDeveloperToken(developerToken)
        .withUserAgent(userAgent)
        .withOAuth2Credential(credential)
        .build();
  }

  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws RemoteException {
    CustomerServiceInterface customerService =
        adWordsServices.get(session, CustomerServiceInterface.class);
    System.out.println("You are logged in as a user with access to the following customers:");
    for (Customer customer : customerService.getCustomers()) {
      System.out.printf("  %s%n", customer.getCustomerId());
    }
  }

  public static void main(String[] args) {
    if (DEVELOPER_TOKEN.equals("INSERT_DEVELOPER_TOKEN_HERE")) {
      throw new IllegalArgumentException("Please input your developer token.");
    }

    if (USER_AGENT.equals("INSERT_USER_AGENT_HERE")) {
      throw new IllegalArgumentException("Please input your user agent.");
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

    // Create an AdWordsSession without using a properties file.
    AdWordsSession adWordsSession;
    try {
      adWordsSession =
          createAdWordsSession(
              CLIENT_ID, CLIENT_SECRET, REFRESH_TOKEN, DEVELOPER_TOKEN, USER_AGENT);
    } catch (ValidationException ve) {
      System.err.printf("Invalid configuration settings for the session. Exception: %s%n", ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf("Failed to create OAuth credentials. Exception: %s%n", oe);
      return;
    }
    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    try {
      runExample(adWordsServices, adWordsSession);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the adwords.axis
      // packages will return a meaningful value from toString
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf(
          "Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }
}
