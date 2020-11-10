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

package admanager.axis.v202002.adjustmentservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202002.StatementBuilder;
import com.google.api.ads.admanager.axis.v202002.AdjustmentServiceInterface;
import com.google.api.ads.admanager.axis.v202002.ApiError;
import com.google.api.ads.admanager.axis.v202002.ApiException;
import com.google.api.ads.admanager.axis.v202002.BasisType;
import com.google.api.ads.admanager.axis.v202002.Date;
import com.google.api.ads.admanager.axis.v202002.DateRange;
import com.google.api.ads.admanager.axis.v202002.HistoricalAdjustment;
import com.google.api.ads.admanager.axis.v202002.TrafficForecastAdjustment;
import com.google.api.ads.admanager.axis.v202002.TrafficForecastAdjustmentPage;
import com.google.api.ads.admanager.axis.v202002.TrafficForecastAdjustmentSegment;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.admanager.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * This example adds a historical adjustment of 110% for New Years Day traffic.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class UpdateTrafficAdjustments {

  private static class UpdateTrafficAdjustmentsParams extends CodeSampleParams {
    @Parameter(
        names = ArgumentNames.ADJUSTMENT_ID,
        required = true,
        description = "The ID of the forecast adjustment to update.")
    private Long adjustmentId;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param adjustmentId the ID of the adjustment to update.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdManagerServices adManagerServices, AdManagerSession session, long adjustmentId)
      throws RemoteException {
    // Get the adjustment service.
    AdjustmentServiceInterface adjustmentService =
        adManagerServices.get(session, AdjustmentServiceInterface.class);

    // Create a statement to only select a single traffic forecast adjustment by ID.
    StatementBuilder statementBuilder =
        new StatementBuilder()
            .where("id = :id")
            .orderBy("id ASC")
            .limit(1)
            .withBindVariableValue("id", adjustmentId);

    // Get the forecast adjustment.
    TrafficForecastAdjustmentPage page =
        adjustmentService.getTrafficAdjustmentsByStatement(statementBuilder.toStatement());

    TrafficForecastAdjustment adjustment =
        Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Create a new historical adjustment segment for New Years Day.
    HistoricalAdjustment newYearsAdjustment = new HistoricalAdjustment();

    Date lastNewYearsDay = new Date(org.joda.time.DateTime.now().getYear(), 1, 1);
    DateRange referenceDateRange = new DateRange();
    referenceDateRange.setStartDate(lastNewYearsDay);
    referenceDateRange.setEndDate(lastNewYearsDay);
    newYearsAdjustment.setReferenceDateRange(referenceDateRange);

    Date nextNewYearsDay = new Date(org.joda.time.DateTime.now().plusYears(1).getYear(), 1, 1);
    DateRange targetDateRange = new DateRange();
    targetDateRange.setStartDate(nextNewYearsDay);
    targetDateRange.setEndDate(nextNewYearsDay);
    newYearsAdjustment.setTargetDateRange(targetDateRange);

    newYearsAdjustment.setMilliPercentMultiplier(110000L);

    TrafficForecastAdjustmentSegment segment = new TrafficForecastAdjustmentSegment();
    segment.setBasisType(BasisType.HISTORICAL);
    segment.setHistoricalAdjustment(newYearsAdjustment);

    // Add the historical segment to the adjustment
    List<TrafficForecastAdjustmentSegment> segments =
        Arrays.asList(adjustment.getForecastAdjustmentSegments());
    segments.add(segment);
    adjustment.setForecastAdjustmentSegments(
        segments.toArray(new TrafficForecastAdjustmentSegment[] {}));

    // Update the traffic adjustment on the server.
    TrafficForecastAdjustment[] adjustments =
        adjustmentService.updateTrafficAdjustments(new TrafficForecastAdjustment[] {adjustment});

    for (TrafficForecastAdjustment updatedAdjustment : adjustments) {
      System.out.printf(
          "Traffic forecast adjustment with ID %d and %d segments was updated.%n",
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

    UpdateTrafficAdjustmentsParams params = new UpdateTrafficAdjustmentsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adjustmentId = Long.parseLong("INSERT_ADJUSTMENT_ID_HERE");
    }

    try {
      runExample(adManagerServices, session, params.adjustmentId);
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
