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

package admanager.axis.v202511.inventoryservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.v202511.AdUnit;
import com.google.api.ads.admanager.axis.v202511.AdUnitSize;
import com.google.api.ads.admanager.axis.v202511.AdUnitTargetWindow;
import com.google.api.ads.admanager.axis.v202511.ApiError;
import com.google.api.ads.admanager.axis.v202511.ApiException;
import com.google.api.ads.admanager.axis.v202511.EnvironmentType;
import com.google.api.ads.admanager.axis.v202511.InventoryServiceInterface;
import com.google.api.ads.admanager.axis.v202511.NetworkServiceInterface;
import com.google.api.ads.admanager.axis.v202511.Size;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.Random;

/**
 * This example creates new ad units. To determine which ad units exist, run GetAllAdUnits.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class CreateAdUnits {

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
    // Get the InventoryService.
    InventoryServiceInterface inventoryService =
        adManagerServices.get(session, InventoryServiceInterface.class);

    // Get the NetworkService.
    NetworkServiceInterface networkService =
        adManagerServices.get(session, NetworkServiceInterface.class);

    // Set the parent ad unit's ID for all ad units to be created under.
    String parentAdUnitId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();

    // Create a 300x250 web ad unit size.
    Size webSize = new Size();
    webSize.setWidth(300);
    webSize.setHeight(250);
    webSize.setIsAspectRatio(false);

    AdUnitSize webAdUnitSize = new AdUnitSize();
    webAdUnitSize.setSize(webSize);
    webAdUnitSize.setEnvironmentType(EnvironmentType.BROWSER);

    // Create a 640x360v video ad unit size with a companion.
    Size videoSize = new Size();
    videoSize.setWidth(640);
    videoSize.setHeight(360);
    videoSize.setIsAspectRatio(false);

    AdUnitSize videoAdUnitSize = new AdUnitSize();
    videoAdUnitSize.setSize(videoSize);
    videoAdUnitSize.setCompanions(new AdUnitSize[] {webAdUnitSize});
    videoAdUnitSize.setEnvironmentType(EnvironmentType.VIDEO_PLAYER);

    // Create a web ad unit.
    AdUnit webAdUnit = new AdUnit();
    webAdUnit.setName("web_ad_unit_" + new Random().nextInt(Integer.MAX_VALUE));
    webAdUnit.setDescription(webAdUnit.getName());
    webAdUnit.setParentId(parentAdUnitId);
    webAdUnit.setTargetWindow(AdUnitTargetWindow.BLANK);
    webAdUnit.setAdUnitSizes(new AdUnitSize[] {webAdUnitSize});

    // Create a video ad unit.
    AdUnit videoAdUnit = new AdUnit();
    videoAdUnit.setName("video_ad_unit_" + new Random().nextInt(Integer.MAX_VALUE));
    videoAdUnit.setDescription(videoAdUnit.getName());
    videoAdUnit.setParentId(parentAdUnitId);
    videoAdUnit.setTargetWindow(AdUnitTargetWindow.BLANK);
    videoAdUnit.setAdUnitSizes(new AdUnitSize[] {videoAdUnitSize});

    // Create the ad units on the server.
    AdUnit[] adUnits = inventoryService.createAdUnits(new AdUnit[] {webAdUnit, videoAdUnit});

    for (AdUnit adUnit : adUnits) {
      System.out.printf(
          "An ad unit with ID '%s', name '%s' was created.%n", adUnit.getId(), adUnit.getName());
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
