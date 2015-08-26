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

package dfp.axis.v201502.forecastservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201502.DateTimes;
import com.google.api.ads.dfp.axis.v201502.AdUnitTargeting;
import com.google.api.ads.dfp.axis.v201502.AvailabilityForecast;
import com.google.api.ads.dfp.axis.v201502.AvailabilityForecastOptions;
import com.google.api.ads.dfp.axis.v201502.CostType;
import com.google.api.ads.dfp.axis.v201502.CreativePlaceholder;
import com.google.api.ads.dfp.axis.v201502.CreativeRotationType;
import com.google.api.ads.dfp.axis.v201502.ForecastServiceInterface;
import com.google.api.ads.dfp.axis.v201502.Goal;
import com.google.api.ads.dfp.axis.v201502.GoalType;
import com.google.api.ads.dfp.axis.v201502.InventoryTargeting;
import com.google.api.ads.dfp.axis.v201502.LineItem;
import com.google.api.ads.dfp.axis.v201502.LineItemType;
import com.google.api.ads.dfp.axis.v201502.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201502.ProspectiveLineItem;
import com.google.api.ads.dfp.axis.v201502.RoadblockingType;
import com.google.api.ads.dfp.axis.v201502.Size;
import com.google.api.ads.dfp.axis.v201502.StartDateTimeType;
import com.google.api.ads.dfp.axis.v201502.Targeting;
import com.google.api.ads.dfp.axis.v201502.UnitType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import org.joda.time.Duration;
import org.joda.time.Instant;

/**
 * This example gets a forecast for a prospective line item that targets the
 * entire network. The targeting can be modified to determine forecasts for
 * other criteria such as custom criteria targeting (in addition to targeting
 * the whole network). See CreateLineItems.java and
 * CreateLineItemsWithCustomCriteria.java for examples of how to create more
 * complex targeting.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetAvailabilityForecast {

  public static void runExample(DfpServices dfpServices, DfpSession session)
      throws Exception {
    // Get the ForecastService.
    ForecastServiceInterface forecastService =
        dfpServices.get(session, ForecastServiceInterface.class);

    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(session, NetworkServiceInterface.class);

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
    prospectiveLineItem.setLineItem(lineItem);
    AvailabilityForecastOptions options  = new AvailabilityForecastOptions();
    options.setIncludeContendingLineItems(true);
    options.setIncludeTargetingCriteriaBreakdown(true);

    AvailabilityForecast forecast = 
        forecastService.getAvailabilityForecast(prospectiveLineItem, options);

    long matched = forecast.getMatchedUnits();
    double availablePercent = (forecast.getAvailableUnits() / (matched * 1.0)) * 100;
    String unitType = forecast.getUnitType().toString().toLowerCase();

    System.out.printf("%d %s matched.\n", matched, unitType);
    System.out.printf("%.2f%% %s available.\n", availablePercent, unitType); 

    if (forecast.getPossibleUnits() != null) {
      double possiblePercent = (forecast.getPossibleUnits() / (matched * 1.0)) * 100;
      System.out.printf("%.2f%% %s possible.\n", possiblePercent, unitType);
    }

    System.out.printf("%d contending line items.\n",
        forecast.getContendingLineItems() == null ? 0 : forecast.getContendingLineItems().length);
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session);
  }
}
