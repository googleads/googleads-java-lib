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
import com.google.api.ads.dfp.axis.v201711.CostType;
import com.google.api.ads.dfp.axis.v201711.CreativePlaceholder;
import com.google.api.ads.dfp.axis.v201711.CreativeRotationType;
import com.google.api.ads.dfp.axis.v201711.CustomCriteria;
import com.google.api.ads.dfp.axis.v201711.CustomCriteriaComparisonOperator;
import com.google.api.ads.dfp.axis.v201711.CustomCriteriaNode;
import com.google.api.ads.dfp.axis.v201711.CustomCriteriaSet;
import com.google.api.ads.dfp.axis.v201711.CustomCriteriaSetLogicalOperator;
import com.google.api.ads.dfp.axis.v201711.Goal;
import com.google.api.ads.dfp.axis.v201711.GoalType;
import com.google.api.ads.dfp.axis.v201711.InventoryTargeting;
import com.google.api.ads.dfp.axis.v201711.LineItem;
import com.google.api.ads.dfp.axis.v201711.LineItemServiceInterface;
import com.google.api.ads.dfp.axis.v201711.LineItemType;
import com.google.api.ads.dfp.axis.v201711.Money;
import com.google.api.ads.dfp.axis.v201711.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201711.Size;
import com.google.api.ads.dfp.axis.v201711.StartDateTimeType;
import com.google.api.ads.dfp.axis.v201711.Targeting;
import com.google.api.ads.dfp.axis.v201711.UnitType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.primitives.Longs;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.joda.time.Duration;
import org.joda.time.Instant;

/**
 * This example creates a new line item that targets custom criteria in
 * addition to the whole network. To determine which line items exist,
 * run GetAllLineItems.java. To determine which orders exist, run
 * GetAllOrders.java. To determine which custom criteria key and values exist,
 * run GetAllCustomTargetingKeysAndValues.java. To create custom criteria key
 * and values, run CreateCustomTargetingKeysAndValues.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateLineItemsWithCustomCriteria {

  /**
   * Set the key and value IDs that will form the following custom criteria
   * expression:
   *
   * (TARGETING_KEY_ID_1 == TARGETING_VALUE_ID_1 AND
   * (TARGETING_KEY_ID_2 !=
   *    (TARGETING_VALUE_IDS_2[0] OR TARGETING_VALUE_IDS_2[1] ...))
   * OR
   * (TARGETING_KEY_ID_3 = TARGETING_VALUE_ID_3))
   *
   * To perform broad (i.e. ~) matching, set a custom targeting value with a
   * broad match type.
   */
  private static class CreateLineItemsWithCustomCriteriaParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.ORDER_ID, required = true,
        description = "The ID of the order that the line items will belong to.")
    private Long orderId;

    @Parameter(names = ArgumentNames.TARGETING_KEY_ID_1, required = true,
        description = "The key ID for the equality comparison in the first expression group.")
    private Long customTargetingKeyId1;

    @Parameter(names = ArgumentNames.TARGETING_KEY_ID_2, required = true,
        description = "The key ID for the inequality comparison in the first expression group.")
    private Long customTargetingKeyId2;

    @Parameter(names = ArgumentNames.TARGETING_KEY_ID_3, required = true,
        description = "The key ID for the equality comparison in the second expression group.")
    private Long customTargetingKeyId3;

    @Parameter(names = ArgumentNames.TARGETING_VALUE_ID_1, required = true,
        description = "The value ID that must match the first key ID in the first expression"
            + " group.")
    private Long customTargetingValueId1;

    @Parameter(names = ArgumentNames.TARGETING_VALUE_IDS_2, required = true,
        description = "The value IDs that must not match the second key ID in the first expression"
            + " group.")
    private List<Long> customTargetingValueId2;

    @Parameter(names = ArgumentNames.TARGETING_VALUE_ID_3, required = true,
        description = "The value ID that must match the key ID in the second expression group.")
    private Long customTargetingValueId3;
  }

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @param orderId the ID of the order that the line items will belong to.
   * @param customTargetingKeyId1 the key ID for the equality comparison in the first expression
   *     group.
   * @param customTargetingKeyId2 the key ID for the equality comparison in the second expression
   *     group.
   * @param customTargetingKeyId3 the key ID for the equality comparison in the third expression
   *     group.
   * @param customTargetingValueId1 the value ID that must match the first key ID in the first
   *     expression group.
   * @param customTargetingValueIds2 the value ID that must match the second key ID in the first
   *     expression group.
   * @param customTargetingValueId3 he value ID that must match the key ID in the second expression
   *     group.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      DfpServices dfpServices,
      DfpSession session,
      long orderId,
      long customTargetingKeyId1,
      long customTargetingKeyId2,
      long customTargetingKeyId3,
      long customTargetingValueId1,
      List<Long> customTargetingValueIds2,
      long customTargetingValueId3)
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

    // Create targeting.
    Targeting targeting = new Targeting();
    targeting.setInventoryTargeting(inventoryTargeting);

    // Create the expression:
    //
    // TARGETING_KEY_ID_1 == TARGETING_VALUE_ID_1
    CustomCriteria customCriteria1 = new CustomCriteria();
    customCriteria1.setKeyId(customTargetingKeyId1);
    customCriteria1.setOperator(CustomCriteriaComparisonOperator.IS);
    customCriteria1.setValueIds(new long[] {customTargetingValueId1});

    // Create the expression:
    //
    // TARGETING_KEY_ID_2 !=
    //     (TARGETING_VALUE_IDS_2[0] OR TARGETING_VALUE_IDS_2[1] ...))
    CustomCriteria customCriteria2 = new CustomCriteria();
    customCriteria2.setKeyId(customTargetingKeyId2);
    customCriteria2.setOperator(CustomCriteriaComparisonOperator.IS_NOT);
    customCriteria2.setValueIds(Longs.toArray(customTargetingValueIds2));

    // Create the expression:
    //
    // TARGETING_KEY_ID_3 = TARGETING_VALUE_ID_3
    CustomCriteria customCriteria3 = new CustomCriteria();
    customCriteria3.setKeyId(customTargetingKeyId3);
    customCriteria3.setOperator(CustomCriteriaComparisonOperator.IS);
    customCriteria3.setValueIds(new long[] {customTargetingValueId3});

    // Create the custom criteria set that will resemble:
    //
    // (TARGETING_KEY_ID_1 == TARGETING_VALUE_ID_1 AND
    // (TARGETING_KEY_ID_2 !=
    //     (TARGETING_VALUE_IDS_2[0] OR TARGETING_VALUE_IDS_2[1] ...))
    // OR
    // (TARGETING_KEY_ID_3 = TARGETING_VALUE_ID_3)
    CustomCriteriaSet topCustomCriteriaSet = new CustomCriteriaSet();
    topCustomCriteriaSet.setLogicalOperator(CustomCriteriaSetLogicalOperator.OR);

    // Create the sub expression:
    //
    // (TARGETING_KEY_ID_1 == TARGETING_VALUE_ID_1 AND
    // (TARGETING_KEY_ID_2 !=
    //     (TARGETING_VALUE_IDS_2[0] OR TARGETING_VALUE_IDS_2[1] ...))
    CustomCriteriaSet subCustomCriteriaSet = new CustomCriteriaSet();
    subCustomCriteriaSet.setLogicalOperator(CustomCriteriaSetLogicalOperator.AND);
    subCustomCriteriaSet.setChildren(
        new CustomCriteriaNode[] {customCriteria1, customCriteria2});

    // Combine the expression
    // (TARGETING_KEY_ID_3 = TARGETING_VALUE_ID_3) with
    // subCustomCriteriaSet.
    topCustomCriteriaSet.setChildren(
        new CustomCriteriaNode[] {subCustomCriteriaSet, customCriteria3});

    // Set the custom targeting.
    targeting.setCustomTargeting(topCustomCriteriaSet);

    // Create a line item.
    LineItem lineItem = new LineItem();
    lineItem.setName("Line item #" + new Random().nextInt(Integer.MAX_VALUE));
    lineItem.setOrderId(orderId);
    lineItem.setTargeting(targeting);

    // Allow the line item to be booked even if there is not enough inventory.
    lineItem.setAllowOverbook(true);

    // Set the line item type to STANDARD and priority to High. In this case,
    // 8 would be Normal, and 10 would be Low.
    lineItem.setLineItemType(LineItemType.STANDARD);
    lineItem.setPriority(6);

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
    goal.setUnits(500000L);
    goal.setUnitType(UnitType.IMPRESSIONS);
    goal.setGoalType(GoalType.LIFETIME);
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
          new OfflineCredentials.Builder().forApi(Api.DFP).fromFile().build().generateCredential();

      // Construct a DfpSession.
      session = new DfpSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
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

    CreateLineItemsWithCustomCriteriaParams params = new CreateLineItemsWithCustomCriteriaParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.orderId = Long.parseLong("INSERT_ORDER_ID_HERE");
      params.customTargetingKeyId1 = Long.parseLong("INSERT_CUSTOM_TARGETING_KEY_ID_1_HERE");
      params.customTargetingKeyId2 = Long.parseLong("INSERT_CUSTOM_TARGETING_KEY_ID_2_HERE");
      params.customTargetingKeyId3 = Long.parseLong("INSERT_CUSTOM_TARGETING_KEY_ID_3_HERE");
      params.customTargetingValueId1 = Long.parseLong("INSERT_CUSTOM_TARGETING_VALUE_ID_1_HERE");
      params.customTargetingValueId2 = Arrays.asList(
          Long.parseLong("INSERT_CUSTOM_TARGETING_VALUE_ID_2_HERE"),
          Long.parseLong("INSERT_CUSTOM_TARGETING_VALUE_ID_2_HERE")
      );
      params.customTargetingValueId3 = Long.parseLong("INSERT_CUSTOM_TARGETING_VALUE_ID_3_HERE");
    }

    try {
      runExample(
          dfpServices,
          session,
          params.orderId,
          params.customTargetingKeyId1,
          params.customTargetingKeyId2,
          params.customTargetingKeyId3,
          params.customTargetingValueId1,
          params.customTargetingValueId2,
          params.customTargetingValueId3);
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
