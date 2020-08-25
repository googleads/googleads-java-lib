// Copyright 2020 Google Inc. All Rights Reserved.
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

package admanager.axis.v202008.siteservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.v202008.ApiError;
import com.google.api.ads.admanager.axis.v202008.ApiException;
import com.google.api.ads.admanager.axis.v202008.ChildPublisher;
import com.google.api.ads.admanager.axis.v202008.DelegationType;
import com.google.api.ads.admanager.axis.v202008.Network;
import com.google.api.ads.admanager.axis.v202008.NetworkServiceInterface;
import com.google.api.ads.admanager.axis.v202008.Site;
import com.google.api.ads.admanager.axis.v202008.SiteServiceInterface;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.admanager.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example creates a new site.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class CreateSites {

  private static class CreateSitesParams extends CodeSampleParams {
    @Parameter(
        names = ArgumentNames.CHILD_NETWORK_CODE,
        required = true,
        description = "The child network code of the site.")
    private String childNetworkCode;

    @Parameter(names = ArgumentNames.URL, required = true, description = "The URL of the site.")
    private String url;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param childNetworkCode the child network code of the site.
   * @param url the URL of the site.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdManagerServices adManagerServices,
      AdManagerSession session,
      String childNetworkCode,
      String url)
      throws RemoteException {
    // Get the SiteService.
    SiteServiceInterface siteService = adManagerServices.get(session, SiteServiceInterface.class);
    // Get the NetworkService.
    NetworkServiceInterface networkService =
        adManagerServices.get(session, NetworkServiceInterface.class);


    // Validate that the site can be created.
    Network currentNetwork = networkService.getCurrentNetwork();
    ChildPublisher childNetwork = null;
    for (ChildPublisher child : currentNetwork.getChildPublishers()) {
      if (childNetworkCode.equals(child.getChildNetworkCode())) {
        childNetwork = child;
        break;
       }
    }
    if (childNetwork == null) {
      throw new IllegalStateException(
          String.format(
              "Child network %s not found on the current network (%s). Cannot create site.",
              childNetworkCode, currentNetwork.getNetworkCode()));
    }
    if (!DelegationType.MANAGE_INVENTORY.equals(childNetwork.getApprovedDelegationType())) {
      throw new IllegalStateException(
          String.format(
              "Child network %s has not approved the current network (%s) to manage its inventory."
                  + " Cannot create site.",
              childNetworkCode, currentNetwork.getNetworkCode()));
    }

    // Create a site.
    Site site = new Site();
    site.setChildNetworkCode(childNetworkCode);
    site.setUrl(url);

    // Create the site on the server.
    Site[] sites = siteService.createSites(new Site[] {site});

    for (Site createdSite : sites) {
      System.out.printf(
          "A site with ID %d and URL '%s' was created.%n",
          createdSite.getId(), createdSite.getUrl());
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

    CreateSitesParams params = new CreateSitesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.childNetworkCode = "INSERT_CHILD_NETWORK_CODE_HERE";
      params.url = "INSERT_URL_HERE";
    }

    try {
      runExample(adManagerServices, session, params.childNetworkCode, params.url);
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
