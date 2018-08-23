// Copyright 2015 Google Inc. All Rights Reserved.
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

package admanager.axis.v201805.exchangerateservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.v201805.ApiError;
import com.google.api.ads.admanager.axis.v201805.ApiException;
import com.google.api.ads.admanager.axis.v201805.ExchangeRate;
import com.google.api.ads.admanager.axis.v201805.ExchangeRateDirection;
import com.google.api.ads.admanager.axis.v201805.ExchangeRateRefreshRate;
import com.google.api.ads.admanager.axis.v201805.ExchangeRateServiceInterface;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example creates an exchange rate. To determine which exchange rates exist,
 * run GetAllExchangeRates.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateExchangeRates {

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(AdManagerServices adManagerServices, AdManagerSession session)
      throws RemoteException {
    // Get the ExchangeRateService.
    ExchangeRateServiceInterface exchangeRateService =
        adManagerServices.get(session, ExchangeRateServiceInterface.class);

    // Create an exchange rate.
    ExchangeRate exchangeRate = new ExchangeRate();
    
    // Set the currency code.
    exchangeRate.setCurrencyCode("AUD");
    
    // Set the direction of the conversion (from the network currency).
    exchangeRate.setDirection(ExchangeRateDirection.FROM_NETWORK);

    // Set the conversion value as 1.5 (this value is multiplied by 10,000,000,000)
    exchangeRate.setExchangeRate(15000000000L);
    
    // Do not refresh exchange rate from Google data. Update manually only.
    exchangeRate.setRefreshRate(ExchangeRateRefreshRate.FIXED);

    // Create the exchange rate on the server.
    ExchangeRate[] exchangeRates = exchangeRateService.createExchangeRates(
        new ExchangeRate[] {exchangeRate});
    
    for (ExchangeRate createdExchangeRate : exchangeRates) {
      System.out.printf("An exchange rate with ID %d, currency code '%s',"
          + " direction '%s', and exchange rate %.2f was created.%n",
          createdExchangeRate.getId(), createdExchangeRate.getCurrencyCode(),
          createdExchangeRate.getDirection().getValue(),
          (createdExchangeRate.getExchangeRate() / 10000000000f));
    }
  }

  public static void main(String[] args) {
    AdManagerSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.AD_MANAGER)
              .fromFile()
              .build()
              .generateCredential();

      // Construct a AdManagerSession.
      session =
          new AdManagerSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    AdManagerServices adManagerServices = new AdManagerServices();

    try {
      runExample(adManagerServices, session);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the admanager.axis
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
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }
}
