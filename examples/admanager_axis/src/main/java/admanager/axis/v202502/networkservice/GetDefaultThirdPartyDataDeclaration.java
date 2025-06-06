// Copyright 2020 Google LLC.
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

package admanager.axis.v202502.networkservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202502.Pql;
import com.google.api.ads.admanager.axis.utils.v202502.StatementBuilder;
import com.google.api.ads.admanager.axis.v202502.ApiError;
import com.google.api.ads.admanager.axis.v202502.ApiException;
import com.google.api.ads.admanager.axis.v202502.DeclarationType;
import com.google.api.ads.admanager.axis.v202502.NetworkServiceInterface;
import com.google.api.ads.admanager.axis.v202502.PublisherQueryLanguageServiceInterface;
import com.google.api.ads.admanager.axis.v202502.ResultSet;
import com.google.api.ads.admanager.axis.v202502.ThirdPartyDataDeclaration;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Longs;
import java.rmi.RemoteException;

/**
 * This example gets the current network's default third party data declaration.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class GetDefaultThirdPartyDataDeclaration {

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(AdManagerServices adManagerServices, AdManagerSession session)
      throws Exception {
    // Get the NetworkService.
    NetworkServiceInterface networkService =
        adManagerServices.get(session, NetworkServiceInterface.class);
    // Get the PublisherQueryLanguageService.
    PublisherQueryLanguageServiceInterface pqlService =
        adManagerServices.get(session, PublisherQueryLanguageServiceInterface.class);
    // Get the current network's default third party data declaration.
    ThirdPartyDataDeclaration declaration = networkService.getDefaultThirdPartyDataDeclaration();

    if (declaration == null) {
      System.out.println("No default ad technology partners have been set on this network.");
    } else if (DeclarationType.NONE.equals(declaration.getDeclarationType())
        || declaration.getThirdPartyCompanyIds().length == 0) {
      System.out.println(
          "This network has specified that there are no ad technology providers "
              + " associated with its reservation creatives by default.");
    } else {
      System.out.printf(
          "This network has specified %d ad technology provider(s) associated with its reservation"
              + " creatives by default:%n",
          declaration.getThirdPartyCompanyIds().length);
      ResultSet companies =
          pqlService.select(
              new StatementBuilder()
                  .select("name, id")
                  .from("rich_media_ad_company")
                  .where("id in (:ids)")
                  .withBindVariableValue(
                      "ids",
                      ImmutableSet.copyOf(Longs.asList(declaration.getThirdPartyCompanyIds())))
                  .toStatement());
      System.out.println(Pql.resultSetToString(companies));

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
    } catch (Exception e) {
      System.err.printf("Request failed unexpectedly due to Exception: %s%n", e);
    }
  }
}
