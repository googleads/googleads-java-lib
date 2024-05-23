// Copyright 2020 Google LLC. All Rights Reserved.
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

package admanager.axis.v202405.forecastservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202405.DateTimes;
import com.google.api.ads.admanager.axis.v202405.AdUnitTargeting;
import com.google.api.ads.admanager.axis.v202405.ApiError;
import com.google.api.ads.admanager.axis.v202405.ApiException;
import com.google.api.ads.admanager.axis.v202405.Date;
import com.google.api.ads.admanager.axis.v202405.DateRange;
import com.google.api.ads.admanager.axis.v202405.ForecastServiceInterface;
import com.google.api.ads.admanager.axis.v202405.InventoryTargeting;
import com.google.api.ads.admanager.axis.v202405.NetworkServiceInterface;
import com.google.api.ads.admanager.axis.v202405.Targeting;
import com.google.api.ads.admanager.axis.v202405.TimeSeries;
import com.google.api.ads.admanager.axis.v202405.TrafficDataRequest;
import com.google.api.ads.admanager.axis.v202405.TrafficDataResponse;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.format.DateTimeFormat;

/**
 * This example gets the forecasted run-of-network traffic data for the next 7 days.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class GetTrafficData {

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param advertiserId the ID of the advertiser (company) to forecast for. Setting an advertiser
   *     will cause the forecast to apply the appropriate unified blocking rules.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(AdManagerServices adManagerServices, AdManagerSession session)
      throws RemoteException {
    // Get the ForecastService.
    ForecastServiceInterface forecastService =
        adManagerServices.get(session, ForecastServiceInterface.class);

    // Get the NetworkService.
    NetworkServiceInterface networkService =
        adManagerServices.get(session, NetworkServiceInterface.class);

    // Get the root ad unit ID used to target the whole site.
    String rootAdUnitId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();

    // Create inventory targeting.
    InventoryTargeting inventoryTargeting = new InventoryTargeting();

    // Create ad unit targeting for the root ad unit.
    AdUnitTargeting adUnitTargeting = new AdUnitTargeting();
    adUnitTargeting.setAdUnitId(rootAdUnitId);
    adUnitTargeting.setIncludeDescendants(true);

    inventoryTargeting.setTargetedAdUnits(new AdUnitTargeting[] {adUnitTargeting});

    // Create targeting.
    Targeting targeting = new Targeting();
    targeting.setInventoryTargeting(inventoryTargeting);

    // Create the date range. Include the previous and next 7 days.
    Interval interval =
        new Interval(
            Instant.now().plus(Duration.standardDays(-7)),
            Instant.now().plus(Duration.standardDays(7)));
    DateRange dateRange = new DateRange();
    dateRange.setStartDate(DateTimes.toDateTime(interval.getStart()).getDate());
    dateRange.setEndDate(DateTimes.toDateTime(interval.getEnd()).getDate());

    // Request the traffic data.
    TrafficDataRequest trafficDataRequest = new TrafficDataRequest();
    trafficDataRequest.setRequestedDateRange(dateRange);
    trafficDataRequest.setTargeting(targeting);
    TrafficDataResponse trafficData = forecastService.getTrafficData(trafficDataRequest);

    // Read the historical traffic data.
    TimeSeries historicalTimeSeries = trafficData.getHistoricalTimeSeries();
    if (historicalTimeSeries != null) {
      Date historicalStartDate = historicalTimeSeries.getTimeSeriesDateRange().getStartDate();
      DateTime historicalStart =
          new DateTime(
              historicalStartDate.getYear(),
              historicalStartDate.getMonth(),
              historicalStartDate.getDay(),
              0,
              0,
              0);
      for (int i = 0; i < historicalTimeSeries.getValues().length; i++) {
        System.out.printf(
            "%s: %d historical ad opportunities%n",
            historicalStart.plus(Duration.standardDays(i)).toString(DateTimeFormat.longDate()),
            historicalTimeSeries.getValues()[i]);
      }
    }

    // Read the forecasted traffic data.
    TimeSeries forecastedTimeSeries = trafficData.getForecastedTimeSeries();
    if (forecastedTimeSeries != null) {
      Date forecastedStartDate = forecastedTimeSeries.getTimeSeriesDateRange().getStartDate();
      DateTime forecastedStart =
          new DateTime(
              forecastedStartDate.getYear(),
              forecastedStartDate.getMonth(),
              forecastedStartDate.getDay(),
              0,
              0,
              0);
      for (int i = 0; i < forecastedTimeSeries.getValues().length; i++) {
        System.out.printf(
            "%s: %d forecasted ad opportunities%n",
            forecastedStart.plus(Duration.standardDays(i)).toString(DateTimeFormat.longDate()),
            forecastedTimeSeries.getValues()[i]);
      }
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
