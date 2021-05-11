// Copyright 2019 Google Inc. All Rights Reserved.
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

package admanager.axis.v202105.adjustmentservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.v202105.AdUnitTargeting;
import com.google.api.ads.admanager.axis.v202105.AdjustmentServiceInterface;
import com.google.api.ads.admanager.axis.v202105.ApiError;
import com.google.api.ads.admanager.axis.v202105.ApiException;
import com.google.api.ads.admanager.axis.v202105.GeoTargeting;
import com.google.api.ads.admanager.axis.v202105.InventoryTargeting;
import com.google.api.ads.admanager.axis.v202105.Location;
import com.google.api.ads.admanager.axis.v202105.NetworkServiceInterface;
import com.google.api.ads.admanager.axis.v202105.Targeting;
import com.google.api.ads.admanager.axis.v202105.TrafficForecastSegment;
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
 * This example creates a traffic forecast segment for all ad units in the United States.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class CreateTrafficForecastSegments {

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
    // Get the adjustment service and the network service.
    AdjustmentServiceInterface adjustmentService =
        adManagerServices.get(session, AdjustmentServiceInterface.class);
    NetworkServiceInterface networkService =
        adManagerServices.get(session, NetworkServiceInterface.class);

    // Get the root ad unit ID used to target the whole site.
    String rootAdUnitId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();

    // Create inventory targeting.
    InventoryTargeting inventoryTargeting = new InventoryTargeting();

    // Create ad unit targeting for the root ad unit (i.e. the whole network).
    AdUnitTargeting adUnitTargeting = new AdUnitTargeting();
    adUnitTargeting.setAdUnitId(rootAdUnitId);
    adUnitTargeting.setIncludeDescendants(true);

    inventoryTargeting.setTargetedAdUnits(new AdUnitTargeting[] {adUnitTargeting});

    // Create targeting for United States traffic.
    GeoTargeting geoTargeting = new GeoTargeting();
    Location countryLocation = new Location();
    countryLocation.setId(2840L);
    geoTargeting.setTargetedLocations(new Location[] {countryLocation});

    Targeting targeting = new Targeting();
    targeting.setInventoryTargeting(inventoryTargeting);
    targeting.setGeoTargeting(geoTargeting);

    TrafficForecastSegment segment = new TrafficForecastSegment();
    segment.setTargeting(targeting);
    segment.setName("Forecast segment #" + new Random().nextInt(Integer.MAX_VALUE));

    // Create the traffic forecst segment on the server.
    TrafficForecastSegment[] segments =
        adjustmentService.createTrafficForecastSegments(new TrafficForecastSegment[] {segment});

    for (TrafficForecastSegment createdSegment : segments) {
      System.out.printf(
          "Traffic forecast segment with ID %d and %d forecast adjustments was created.%n",
          createdSegment.getId(), createdSegment.getActiveForecastAdjustmentCount());
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
