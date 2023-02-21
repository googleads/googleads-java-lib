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

package admanager.axis.v202302.adjustmentservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.v202302.AdjustmentServiceInterface;
import com.google.api.ads.admanager.axis.v202302.ApiError;
import com.google.api.ads.admanager.axis.v202302.ApiException;
import com.google.api.ads.admanager.axis.v202302.Date;
import com.google.api.ads.admanager.axis.v202302.DateRange;
import com.google.api.ads.admanager.axis.v202302.ForecastAdjustment;
import com.google.api.ads.admanager.axis.v202302.ForecastAdjustmentStatus;
import com.google.api.ads.admanager.axis.v202302.ForecastAdjustmentVolumeType;
import com.google.api.ads.admanager.axis.v202302.HistoricalBasisVolumeSettings;
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
import java.util.Random;

/**
 * This example creates a new ForecastAdjustment of 110% of New Years Day traffic.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class CreateForecastAdjustments {

  private static class CreateForecastAdjustmentsParams extends CodeSampleParams {
    @Parameter(
        names = ArgumentNames.TRAFFIC_FORECAST_SEGMENT_ID,
        required = true,
        description = "The ID of the traffic forecast segment to use.")
    private Long trafficForecastSegmentId;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param trafficForecastSegmentId the ID of the traffic forecast segment to create the adjustment
   *  for.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdManagerServices adManagerServices, AdManagerSession session, long trafficForecastSegmentId)
      throws RemoteException {
    // Get the adjustment service.
    AdjustmentServiceInterface adjustmentService =
        adManagerServices.get(session, AdjustmentServiceInterface.class);

    ForecastAdjustment forecastAdjustment = new ForecastAdjustment();
    forecastAdjustment.setName("Forecast adjustment #" + new Random().nextInt(Integer.MAX_VALUE));
    forecastAdjustment.setTrafficForecastSegmentId(trafficForecastSegmentId);

    // Set the date range that this adjustment will be applied to.
    Date startDate = new Date(org.joda.time.DateTime.now().plusYears(1).getYear(), 1, 1);
    Date endDate = new Date(org.joda.time.DateTime.now().plusYears(1).getYear(), 1, 1);
    DateRange dateRange = new DateRange();
    dateRange.setStartDate(startDate);
    dateRange.setEndDate(endDate);
    forecastAdjustment.setDateRange(dateRange);

    // Set the adjustment type to be a historical basis.
    forecastAdjustment.setVolumeType(ForecastAdjustmentVolumeType.HISTORICAL_BASIS_VOLUME);
    HistoricalBasisVolumeSettings settings = new HistoricalBasisVolumeSettings();
    settings.setUseParentTrafficForecastSegmentTargeting(true);

    Date historicalStartDate = new Date(org.joda.time.DateTime.now().getYear(), 1, 1);
    Date historicalEndDate = new Date(org.joda.time.DateTime.now().getYear(), 1, 1);
    DateRange historicalDateRange = new DateRange();
    historicalDateRange.setStartDate(historicalStartDate);
    historicalDateRange.setEndDate(historicalEndDate);
    settings.setHistoricalDateRange(historicalDateRange);

    settings.setMultiplierMilliPercent(110000L);

    forecastAdjustment.setHistoricalBasisVolumeSettings(settings);
    forecastAdjustment.setStatus(ForecastAdjustmentStatus.ACTIVE);


    // Update the forecast adjustment on the server.
    ForecastAdjustment[] forecastAdjustments =
        adjustmentService.createForecastAdjustments(new ForecastAdjustment[] {forecastAdjustment});

    for (ForecastAdjustment createdForecastAdjustment : forecastAdjustments) {
      System.out.printf(
          "Forecast adjustment with ID %d and name '%s' was created.%n",
          createdForecastAdjustment.getId(), createdForecastAdjustment.getName());
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

    CreateForecastAdjustmentsParams params = new CreateForecastAdjustmentsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.trafficForecastSegmentId = Long.parseLong("INSERT_FORECAST_SEGMENT_ID_HERE");
    }

    try {
      runExample(adManagerServices, session, params.trafficForecastSegmentId);
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
