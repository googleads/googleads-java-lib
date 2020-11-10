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

package admanager.axis.v202002.adjustmentservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.v202002.AdUnitSize;
import com.google.api.ads.admanager.axis.v202002.AdUnitTargeting;
import com.google.api.ads.admanager.axis.v202002.AdjustmentServiceInterface;
import com.google.api.ads.admanager.axis.v202002.ApiError;
import com.google.api.ads.admanager.axis.v202002.ApiException;
import com.google.api.ads.admanager.axis.v202002.BasisType;
import com.google.api.ads.admanager.axis.v202002.Date;
import com.google.api.ads.admanager.axis.v202002.DateRange;
import com.google.api.ads.admanager.axis.v202002.EnvironmentType;
import com.google.api.ads.admanager.axis.v202002.GeoTargeting;
import com.google.api.ads.admanager.axis.v202002.HistoricalAdjustment;
import com.google.api.ads.admanager.axis.v202002.InventoryTargeting;
import com.google.api.ads.admanager.axis.v202002.Location;
import com.google.api.ads.admanager.axis.v202002.NetworkServiceInterface;
import com.google.api.ads.admanager.axis.v202002.PeriodType;
import com.google.api.ads.admanager.axis.v202002.Size;
import com.google.api.ads.admanager.axis.v202002.Targeting;
import com.google.api.ads.admanager.axis.v202002.TimeSeries;
import com.google.api.ads.admanager.axis.v202002.TrafficForecastAdjustment;
import com.google.api.ads.admanager.axis.v202002.TrafficForecastAdjustmentSegment;
import com.google.api.ads.admanager.axis.v202002.TrafficTimeSeriesFilterCriteria;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example adds or replaces a forecast adjustment for 1920x1080 video traffic in the United
 * States.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class CreateTrafficAdjustments {

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

    // Create a new adjustment for United States traffic.
    // When using GeoTargeting, only Locations of type COUNTRY are supported.
    GeoTargeting geoTargeting = new GeoTargeting();
    Location countryLocation = new Location();
    countryLocation.setId(2840L);
    geoTargeting.setTargetedLocations(new Location[] {countryLocation});

    Targeting targeting = new Targeting();
    targeting.setInventoryTargeting(inventoryTargeting);
    targeting.setGeoTargeting(geoTargeting);

    // Adjust only 1920x1080 video traffic.
    AdUnitSize adUnitSize = new AdUnitSize();
    Size size = new Size();
    size.setWidth(1920);
    size.setHeight(1080);
    adUnitSize.setSize(size);
    adUnitSize.setEnvironmentType(EnvironmentType.VIDEO_PLAYER);

    TrafficForecastAdjustment adjustment = new TrafficForecastAdjustment();
    TrafficTimeSeriesFilterCriteria criteria = new TrafficTimeSeriesFilterCriteria();
    criteria.setTargeting(targeting);
    criteria.setAdUnitSizes(new AdUnitSize[] {adUnitSize});

    adjustment.setFilterCriteria(criteria);

    // Create a new historical adjustment targeting next year's January with 105% of
    // the traffic of this year's January.
    HistoricalAdjustment januaryAdjustment = new HistoricalAdjustment();

    Date referenceRangeStart = new Date(org.joda.time.DateTime.now().getYear(), 1, 1);
    Date referenceRangeEnd = new Date(org.joda.time.DateTime.now().getYear(), 1, 30);
    DateRange referenceDateRange = new DateRange();
    referenceDateRange.setStartDate(referenceRangeStart);
    referenceDateRange.setEndDate(referenceRangeEnd);
    januaryAdjustment.setReferenceDateRange(referenceDateRange);

    Date targetStartDate = new Date(org.joda.time.DateTime.now().plusYears(1).getYear(), 1, 1);
    Date targetEndDate = new Date(org.joda.time.DateTime.now().plusYears(1).getYear(), 1, 30);
    DateRange targetDateRange = new DateRange();
    targetDateRange.setStartDate(targetStartDate);
    targetDateRange.setEndDate(targetEndDate);
    januaryAdjustment.setTargetDateRange(targetDateRange);

    januaryAdjustment.setMilliPercentMultiplier(105000L);

    TrafficForecastAdjustmentSegment januarySegment = new TrafficForecastAdjustmentSegment();
    januarySegment.setBasisType(BasisType.HISTORICAL);
    januarySegment.setHistoricalAdjustment(januaryAdjustment);

    // Create a new absolute adjustment of 500,000 ad opportunities for Christmas
    // and 1M ad opportunities for Boxing Day.
    TimeSeries holidayTimeSeries = new TimeSeries();
    Date christmas = new Date(org.joda.time.DateTime.now().plusYears(1).getYear(), 12, 25);
    Date boxingDay = new Date(org.joda.time.DateTime.now().plusYears(1).getYear(), 12, 26);
    DateRange holidayRange = new DateRange();
    holidayRange.setStartDate(christmas);
    holidayRange.setEndDate(boxingDay);
    holidayTimeSeries.setTimeSeriesDateRange(holidayRange);
    holidayTimeSeries.setTimeSeriesValues(new long[] {500000L, 1000000L});
    holidayTimeSeries.setValuePeriodType(PeriodType.DAILY);
    TrafficForecastAdjustmentSegment holidaySegment = new TrafficForecastAdjustmentSegment();
    holidaySegment.setBasisType(BasisType.ABSOLUTE);
    holidaySegment.setAdjustmentTimeSeries(holidayTimeSeries);

    // Create a new absolute adjustment of 900,000 ad opportunities for the first week in September.
    TimeSeries septemberTimeSeries = new TimeSeries();
    Date septemberStart = new Date(org.joda.time.DateTime.now().plusYears(1).getYear(), 9, 1);
    Date septemberEnd = new Date(org.joda.time.DateTime.now().plusYears(1).getYear(), 9, 7);
    DateRange septemberRange = new DateRange();
    septemberRange.setStartDate(septemberStart);
    septemberRange.setEndDate(septemberEnd);
    septemberTimeSeries.setTimeSeriesDateRange(septemberRange);
    septemberTimeSeries.setTimeSeriesValues(new long[] {900000L});
    septemberTimeSeries.setValuePeriodType(PeriodType.CUSTOM);
    TrafficForecastAdjustmentSegment septemberSegment = new TrafficForecastAdjustmentSegment();
    septemberSegment.setBasisType(BasisType.ABSOLUTE);
    septemberSegment.setAdjustmentTimeSeries(septemberTimeSeries);

    // Add the segments to the adjustment
    adjustment.setForecastAdjustmentSegments(
        new TrafficForecastAdjustmentSegment[] {januarySegment, holidaySegment, septemberSegment});

    // Update the traffic adjustment on the server.
    TrafficForecastAdjustment[] adjustments =
        adjustmentService.updateTrafficAdjustments(new TrafficForecastAdjustment[] {adjustment});

    for (TrafficForecastAdjustment updatedAdjustment : adjustments) {
      System.out.printf(
          "Traffic forecast adjustment with ID %d and %d segments was created or updated.%n",
          updatedAdjustment.getId(), updatedAdjustment.getForecastAdjustmentSegments().length);
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
