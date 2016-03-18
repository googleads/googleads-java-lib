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

package dfp.axis.v201505.lineitemservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201505.DateTimes;
import com.google.api.ads.dfp.axis.v201505.AdUnitTargeting;
import com.google.api.ads.dfp.axis.v201505.BrowserTargeting;
import com.google.api.ads.dfp.axis.v201505.CostType;
import com.google.api.ads.dfp.axis.v201505.CreativePlaceholder;
import com.google.api.ads.dfp.axis.v201505.CreativeRotationType;
import com.google.api.ads.dfp.axis.v201505.DayOfWeek;
import com.google.api.ads.dfp.axis.v201505.DayPart;
import com.google.api.ads.dfp.axis.v201505.DayPartTargeting;
import com.google.api.ads.dfp.axis.v201505.DeliveryTimeZone;
import com.google.api.ads.dfp.axis.v201505.GeoTargeting;
import com.google.api.ads.dfp.axis.v201505.Goal;
import com.google.api.ads.dfp.axis.v201505.GoalType;
import com.google.api.ads.dfp.axis.v201505.InventoryTargeting;
import com.google.api.ads.dfp.axis.v201505.LineItem;
import com.google.api.ads.dfp.axis.v201505.LineItemServiceInterface;
import com.google.api.ads.dfp.axis.v201505.LineItemType;
import com.google.api.ads.dfp.axis.v201505.Location;
import com.google.api.ads.dfp.axis.v201505.MinuteOfHour;
import com.google.api.ads.dfp.axis.v201505.Money;
import com.google.api.ads.dfp.axis.v201505.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201505.Size;
import com.google.api.ads.dfp.axis.v201505.StartDateTimeType;
import com.google.api.ads.dfp.axis.v201505.Targeting;
import com.google.api.ads.dfp.axis.v201505.Technology;
import com.google.api.ads.dfp.axis.v201505.TechnologyTargeting;
import com.google.api.ads.dfp.axis.v201505.TimeOfDay;
import com.google.api.ads.dfp.axis.v201505.UnitType;
import com.google.api.ads.dfp.axis.v201505.UserDomainTargeting;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import org.joda.time.Duration;
import org.joda.time.Instant;

import java.util.Random;

/**
 * This example creates a new line item that targets the whole network, in
 * addition to other targeting criteria. To determine which line items exist,
 * run GetAllLineItems.java. To determine which orders exist, run
 * GetAllOrders.java. To determine criteria IDs, run GetGeoTargets.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateLineItems {

  // Set the ID of the order that the line items will belong to.
  private static final String ORDER_ID = "INSERT_ORDER_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long orderId)
      throws Exception {
    // Get the LineItemService.
    LineItemServiceInterface lineItemService =
        dfpServices.get(session, LineItemServiceInterface.class);

    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(session, NetworkServiceInterface.class);

    // Get the root ad unit ID used to target the whole site.
    String rootAdUnitId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();

    // Create inventory targeting.
    InventoryTargeting inventoryTargeting = new InventoryTargeting();

    // Create ad unit targeting for the root ad unit (i.e. the whole network).
    AdUnitTargeting adUnitTargeting = new AdUnitTargeting();
    adUnitTargeting.setAdUnitId(rootAdUnitId);
    adUnitTargeting.setIncludeDescendants(true);

    inventoryTargeting.setTargetedAdUnits(new AdUnitTargeting[] {adUnitTargeting});

    // Create geographical targeting.
    GeoTargeting geoTargeting = new GeoTargeting();

    // Include the US, Quebec, Canada, and the B3P Canada postal code.
    // To determine what other geographic criteria exists,
    // run GetGeoTargets.java.
    Location countryLocation = new Location();
    countryLocation.setId(2840L);

    Location regionLocation = new Location();
    regionLocation.setId(20133L);

    Location postalCodeLocation = new Location();
    postalCodeLocation.setId(9000093L);

    geoTargeting.setTargetedLocations(new Location[] {countryLocation, regionLocation,
        postalCodeLocation});

    // Exclude Chicago and the New York metro area.
    // To determine what other geographic criteria exists, run
    // GetGeoTargets.java.
    Location cityLocation = new Location();
    cityLocation.setId(1016367L);

    Location metroLocation = new Location();
    metroLocation.setId(200501L);
    geoTargeting.setExcludedLocations(new Location[] {cityLocation, metroLocation});

    // Exclude domains that are not under the network's control.
    UserDomainTargeting userDomainTargeting = new UserDomainTargeting();
    userDomainTargeting.setDomains(new String[] {"usa.gov"});
    userDomainTargeting.setTargeted(false);

    // Create day-part targeting.
    DayPartTargeting dayPartTargeting = new DayPartTargeting();
    dayPartTargeting.setTimeZone(DeliveryTimeZone.BROWSER);

    // Target only the weekend in the browser's timezone.
    DayPart saturdayDayPart = new DayPart();
    saturdayDayPart.setDayOfWeek(DayOfWeek.SATURDAY);
    saturdayDayPart.setStartTime(new TimeOfDay(0, MinuteOfHour.ZERO));
    saturdayDayPart.setEndTime(new TimeOfDay(24, MinuteOfHour.ZERO));

    DayPart sundayDayPart = new DayPart();
    sundayDayPart.setDayOfWeek(DayOfWeek.SUNDAY);
    sundayDayPart.setStartTime(new TimeOfDay(0, MinuteOfHour.ZERO));
    sundayDayPart.setEndTime(new TimeOfDay(24, MinuteOfHour.ZERO));
    dayPartTargeting.setDayParts(new DayPart[] {saturdayDayPart, sundayDayPart});

    // Create technology targeting.
    TechnologyTargeting technologyTargeting = new TechnologyTargeting();

    // Create browser targeting.
    BrowserTargeting browserTargeting = new BrowserTargeting();
    browserTargeting.setIsTargeted(true);

    // Target just the Chrome browser.
    // To determine what other technology criteria exists, run
    // GetAllBrowsers.java.
    Technology browserTechnology = new Technology();
    browserTechnology.setId(500072L);
    browserTargeting.setBrowsers(new Technology[] {browserTechnology});
    technologyTargeting.setBrowserTargeting(browserTargeting);

    // Create targeting.
    Targeting targeting = new Targeting();
    targeting.setGeoTargeting(geoTargeting);
    targeting.setInventoryTargeting(inventoryTargeting);
    targeting.setUserDomainTargeting(userDomainTargeting);
    targeting.setDayPartTargeting(dayPartTargeting);
    targeting.setTechnologyTargeting(technologyTargeting);

    // Create a line item.
    LineItem lineItem = new LineItem();
    lineItem.setName("Line item #" + new Random().nextInt(Integer.MAX_VALUE));
    lineItem.setOrderId(orderId);
    lineItem.setTargeting(targeting);

    // Allow the line item to be booked even if there is not enough inventory.
    lineItem.setAllowOverbook(true);

    // Set the line item type to STANDARD and priority to Normal. In this case,
    // 6 would be High, and 10 would be Low.
    lineItem.setLineItemType(LineItemType.STANDARD);
    lineItem.setPriority(8);

    // Set the creative rotation type to even.
    lineItem.setCreativeRotationType(CreativeRotationType.EVEN);

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

    // Set the cost per unit to $2.
    lineItem.setCostType(CostType.CPM);
    lineItem.setCostPerUnit(new Money("USD", 2000000L));

    // Set the number of units bought to 500,000 so that the budget is
    // $1,000.
    Goal goal = new Goal();
    goal.setGoalType(GoalType.LIFETIME);
    goal.setUnits(500000L);
    goal.setUnitType(UnitType.IMPRESSIONS);
    lineItem.setPrimaryGoal(goal);

    // Create the line item on the server.
    LineItem[] lineItems = lineItemService.createLineItems(new LineItem[] {lineItem});

    for (LineItem createdLineItem : lineItems) {
      System.out.printf("A line item with ID %d and name '%s' was created.%n",
          createdLineItem.getId(), createdLineItem.getName());
    }
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

    runExample(dfpServices, session, Long.parseLong(ORDER_ID));
  }
}
