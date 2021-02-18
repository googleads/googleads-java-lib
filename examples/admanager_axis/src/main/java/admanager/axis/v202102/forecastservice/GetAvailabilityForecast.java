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

package admanager.axis.v202102.forecastservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202102.DateTimes;
import com.google.api.ads.admanager.axis.v202102.AdUnitTargeting;
import com.google.api.ads.admanager.axis.v202102.ApiError;
import com.google.api.ads.admanager.axis.v202102.ApiException;
import com.google.api.ads.admanager.axis.v202102.AvailabilityForecast;
import com.google.api.ads.admanager.axis.v202102.AvailabilityForecastOptions;
import com.google.api.ads.admanager.axis.v202102.CostType;
import com.google.api.ads.admanager.axis.v202102.CreativePlaceholder;
import com.google.api.ads.admanager.axis.v202102.CreativeRotationType;
import com.google.api.ads.admanager.axis.v202102.ForecastServiceInterface;
import com.google.api.ads.admanager.axis.v202102.Goal;
import com.google.api.ads.admanager.axis.v202102.GoalType;
import com.google.api.ads.admanager.axis.v202102.InventoryTargeting;
import com.google.api.ads.admanager.axis.v202102.LineItem;
import com.google.api.ads.admanager.axis.v202102.LineItemType;
import com.google.api.ads.admanager.axis.v202102.NetworkServiceInterface;
import com.google.api.ads.admanager.axis.v202102.ProspectiveLineItem;
import com.google.api.ads.admanager.axis.v202102.RoadblockingType;
import com.google.api.ads.admanager.axis.v202102.Size;
import com.google.api.ads.admanager.axis.v202102.StartDateTimeType;
import com.google.api.ads.admanager.axis.v202102.Targeting;
import com.google.api.ads.admanager.axis.v202102.UnitType;
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
import org.joda.time.Duration;
import org.joda.time.Instant;

/**
 * This example gets a forecast for a prospective line item that targets the entire network. The
 * targeting can be modified to determine forecasts for other criteria such as custom criteria
 * targeting (in addition to targeting the whole network). See CreateLineItems.java and
 * CreateLineItemsWithCustomCriteria.java for examples of how to create more complex targeting.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class GetAvailabilityForecast {

  private static class GetAvailabilityForecastParams extends CodeSampleParams {
    @Parameter(
        names = ArgumentNames.ADVERTISER_ID,
        required = true,
        description =
            "The ID of the advertiser (company) to forecast for. Setting an"
                + " advertiser will cause the forecast to apply the appropriate unified blocking"
                + " rules.")
    private Long advertiserId;
  }

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
  public static void runExample(
      AdManagerServices adManagerServices, AdManagerSession session, long advertiserId)
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

    // Create a line item.
    LineItem lineItem = new LineItem();
    lineItem.setTargeting(targeting);
    lineItem.setLineItemType(LineItemType.SPONSORSHIP);

    // Set the roadblocking type.
    lineItem.setRoadblockingType(RoadblockingType.ONE_OR_MORE);

    // Set the creative rotation type.
    lineItem.setCreativeRotationType(CreativeRotationType.OPTIMIZED);

    // Create creative placeholder size.
    Size size = new Size();
    size.setWidth(300);
    size.setHeight(250);
    size.setIsAspectRatio(false);

    // Create the creative placeholder.
    CreativePlaceholder creativePlaceholder = new CreativePlaceholder();
    creativePlaceholder.setSize(size);

    // Set the size of creatives that can be associated with this line item.
    lineItem.setCreativePlaceholders(new CreativePlaceholder[] {creativePlaceholder});

    // Set the length of the line item to run.
    lineItem.setStartDateTimeType(StartDateTimeType.IMMEDIATELY);
    lineItem.setEndDateTime(
        DateTimes.toDateTime(Instant.now().plus(Duration.standardDays(30L)), "America/New_York"));

    // Set the cost type.
    lineItem.setCostType(CostType.CPM);

    // Set the line item to use 50% of the impressions.
    Goal goal = new Goal();
    goal.setGoalType(GoalType.DAILY);
    goal.setUnitType(UnitType.IMPRESSIONS);
    goal.setUnits(50L);
    lineItem.setPrimaryGoal(goal);

    // Get forecast for prospective line item.
    ProspectiveLineItem prospectiveLineItem = new ProspectiveLineItem();
    prospectiveLineItem.setAdvertiserId(advertiserId);
    prospectiveLineItem.setLineItem(lineItem);
    AvailabilityForecastOptions options = new AvailabilityForecastOptions();
    options.setIncludeContendingLineItems(true);
    options.setIncludeTargetingCriteriaBreakdown(true);

    AvailabilityForecast forecast =
        forecastService.getAvailabilityForecast(prospectiveLineItem, options);

    long matched = forecast.getMatchedUnits();
    double availablePercent = (forecast.getAvailableUnits() / (matched * 1.0)) * 100;
    String unitType = forecast.getUnitType().toString().toLowerCase();

    System.out.printf("%d %s matched.%n", matched, unitType);
    System.out.printf("%.2f%% %s available.%n", availablePercent, unitType);

    if (forecast.getPossibleUnits() != null) {
      double possiblePercent = (forecast.getPossibleUnits() / (matched * 1.0)) * 100;
      System.out.printf("%.2f%% %s possible.%n", possiblePercent, unitType);
    }

    System.out.printf(
        "%d contending line items.%n",
        forecast.getContendingLineItems() == null ? 0 : forecast.getContendingLineItems().length);
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

    GetAvailabilityForecastParams params = new GetAvailabilityForecastParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.advertiserId = Long.parseLong("INSERT_ADVERTISER_ID_HERE");
    }

    try {
      runExample(adManagerServices, session, params.advertiserId);
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
