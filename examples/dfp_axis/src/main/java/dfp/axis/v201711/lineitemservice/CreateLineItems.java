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

package dfp.axis.v201711.lineitemservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201711.DateTimes;
import com.google.api.ads.dfp.axis.v201711.AdUnitTargeting;
import com.google.api.ads.dfp.axis.v201711.ApiError;
import com.google.api.ads.dfp.axis.v201711.ApiException;
import com.google.api.ads.dfp.axis.v201711.BrowserTargeting;
import com.google.api.ads.dfp.axis.v201711.CostType;
import com.google.api.ads.dfp.axis.v201711.CreativePlaceholder;
import com.google.api.ads.dfp.axis.v201711.CreativeRotationType;
import com.google.api.ads.dfp.axis.v201711.DayOfWeek;
import com.google.api.ads.dfp.axis.v201711.DayPart;
import com.google.api.ads.dfp.axis.v201711.DayPartTargeting;
import com.google.api.ads.dfp.axis.v201711.DeliveryTimeZone;
import com.google.api.ads.dfp.axis.v201711.GeoTargeting;
import com.google.api.ads.dfp.axis.v201711.Goal;
import com.google.api.ads.dfp.axis.v201711.GoalType;
import com.google.api.ads.dfp.axis.v201711.InventoryTargeting;
import com.google.api.ads.dfp.axis.v201711.LineItem;
import com.google.api.ads.dfp.axis.v201711.LineItemServiceInterface;
import com.google.api.ads.dfp.axis.v201711.LineItemType;
import com.google.api.ads.dfp.axis.v201711.Location;
import com.google.api.ads.dfp.axis.v201711.MinuteOfHour;
import com.google.api.ads.dfp.axis.v201711.Money;
import com.google.api.ads.dfp.axis.v201711.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201711.Size;
import com.google.api.ads.dfp.axis.v201711.StartDateTimeType;
import com.google.api.ads.dfp.axis.v201711.Targeting;
import com.google.api.ads.dfp.axis.v201711.Technology;
import com.google.api.ads.dfp.axis.v201711.TechnologyTargeting;
import com.google.api.ads.dfp.axis.v201711.TimeOfDay;
import com.google.api.ads.dfp.axis.v201711.UnitType;
import com.google.api.ads.dfp.axis.v201711.UserDomainTargeting;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.Random;
import org.joda.time.Duration;
import org.joda.time.Instant;

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

  private static class CreateLineItemsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.ORDER_ID, required = true,
        description = "The ID of the order that the line items will belong to.")
    private Long orderId;
  }

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @param orderId the ID of the order that the line items will belong to.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(DfpServices dfpServices, DfpSession session, long orderId)
      throws RemoteException {
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

  public static void main(String[] args) {
    DfpSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.DFP)
              .fromFile()
              .build()
              .generateCredential();

      // Construct a DfpSession.
      session =
          new DfpSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
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

    DfpServices dfpServices = new DfpServices();

    CreateLineItemsParams params = new CreateLineItemsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.orderId = Long.parseLong("INSERT_ORDER_ID_HERE");
    }

    try {
      runExample(dfpServices, session, params.orderId);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the dfp.axis
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
