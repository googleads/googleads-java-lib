// Copyright 2013 Google Inc. All Rights Reserved.
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

package dfp.axis.v201311.lineitemservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201311.DateTimes;
import com.google.api.ads.dfp.axis.v201311.AdUnitTargeting;
import com.google.api.ads.dfp.axis.v201311.CostType;
import com.google.api.ads.dfp.axis.v201311.CreativePlaceholder;
import com.google.api.ads.dfp.axis.v201311.CreativeRotationType;
import com.google.api.ads.dfp.axis.v201311.CustomCriteria;
import com.google.api.ads.dfp.axis.v201311.CustomCriteriaComparisonOperator;
import com.google.api.ads.dfp.axis.v201311.CustomCriteriaNode;
import com.google.api.ads.dfp.axis.v201311.CustomCriteriaSet;
import com.google.api.ads.dfp.axis.v201311.CustomCriteriaSetLogicalOperator;
import com.google.api.ads.dfp.axis.v201311.InventoryTargeting;
import com.google.api.ads.dfp.axis.v201311.LineItem;
import com.google.api.ads.dfp.axis.v201311.LineItemServiceInterface;
import com.google.api.ads.dfp.axis.v201311.LineItemType;
import com.google.api.ads.dfp.axis.v201311.Money;
import com.google.api.ads.dfp.axis.v201311.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201311.Size;
import com.google.api.ads.dfp.axis.v201311.StartDateTimeType;
import com.google.api.ads.dfp.axis.v201311.Targeting;
import com.google.api.ads.dfp.axis.v201311.UnitType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import org.joda.time.Duration;
import org.joda.time.Instant;

import java.util.Random;

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
 *
 * Tags: LineItemService.createLineItems
 * Tags: NetworkService.getCurrentNetwork
 *
 * @author Adam Rogal
 */
public class CreateLineItemsWithCustomCriteria {

  // Set the ID of the order that the line items will belong to.
  private static final String ORDER_ID = "INSERT_ORDER_ID_HERE";

  /**
   * Set the key and value IDs that will form the following custom criteria
   * expression:
   *
   * (CUSTOM_TARGETING_KEY_ID_1 == CUSTOM_TARGETING_VALUE_ID_1 AND
   * (CUSTOM_TARGETING_KEY_ID_2 !=
   *    (CUSTOM_TARGETING_VALUE_ID_2 OR CUSTOM_TARGETING_VALUE_ID_3))
   * OR
   * (CUSTOM_TARGETING_KEY_ID_3 = CUSTOM_TARGETING_VALUE_ID_4))
   *
   * To perform broad (i.e. ~) matching, set a custom targeting value with a
   * broad match type.
   */
  // Set the key ID and value ID belonging to it for the first expression.
  private static final String CUSTOM_TARGETING_KEY_ID_1 =
      "INSERT_CUSTOM_TARGETING_KEY_ID_HERE";
  private static final String CUSTOM_TARGETING_VALUE_ID_1 =
      "INSERT_CUSTOM_TARGETING_VALUE_ID_HERE";

  // Set the key ID and value IDs belonging to it for the second expression.
  private static final String CUSTOM_TARGETING_KEY_ID_2 =
      "INSERT_CUSTOM_TARGETING_KEY_ID_HERE";
  private static final String CUSTOM_TARGETING_VALUE_ID_2 =
      "INSERT_CUSTOM_TARGETING_VALUE_ID_HERE";
  private static final String CUSTOM_TARGETING_VALUE_ID_3 =
      "INSERT_CUSTOM_TARGETING_VALUE_ID_HERE";

  // Set the key ID and value IDs belonging to it for the final expression.
  private static final String CUSTOM_TARGETING_KEY_ID_3 =
      "INSERT_CUSTOM_TARGETING_KEY_ID_HERE";
  private static final String CUSTOM_TARGETING_VALUE_ID_4 =
      "INSERT_CUSTOM_TARGETING_VALUE_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long orderId,
      long customTargetingKeyId1, long customTargetingKeyId2, long customTargetingKeyId3,
      long customTargetingValueId1, long customTargetingValueId2,  long customTargetingValueId3,
      long customTargetingValueId4) throws Exception {
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
    // CUSTOM_TARGETING_KEY_ID_1 == CUSTOM_TARGETING_VALUE_ID_1
    CustomCriteria customCriteria1 = new CustomCriteria();
    customCriteria1.setKeyId(customTargetingKeyId1);
    customCriteria1.setOperator(CustomCriteriaComparisonOperator.IS);
    customCriteria1.setValueIds(new long[] {customTargetingValueId1});

    // Create the expression:
    //
    // CUSTOM_TARGETING_KEY_ID_2 !=
    //     (CUSTOM_TARGETING_VALUE_ID_2 OR CUSTOM_TARGETING_VALUE_ID_3)
    CustomCriteria customCriteria2 = new CustomCriteria();
    customCriteria2.setKeyId(customTargetingKeyId2);
    customCriteria2.setOperator(CustomCriteriaComparisonOperator.IS_NOT);
    customCriteria2.setValueIds(new long[] {customTargetingValueId2, customTargetingValueId3});

    // Create the expression:
    //
    // CUSTOM_TARGETING_KEY_ID_3 = CUSTOM_TARGETING_VALUE_ID_4
    CustomCriteria customCriteria3 = new CustomCriteria();
    customCriteria3.setKeyId(customTargetingKeyId3);
    customCriteria3.setOperator(CustomCriteriaComparisonOperator.IS);
    customCriteria3.setValueIds(new long[] {customTargetingValueId4});

    // Create the custom criteria set that will resemble:
    //
    // (CUSTOM_TARGETING_KEY_ID_1 == CUSTOM_TARGETING_VALUE_ID_1 AND
    // (CUSTOM_TARGETING_KEY_ID_2 !=
    //     (CUSTOM_TARGETING_VALUE_ID_2 OR CUSTOM_TARGETING_VALUE_ID_3))
    // OR
    // (CUSTOM_TARGETING_KEY_ID_3 = CUSTOM_TARGETING_VALUE_ID_4)
    CustomCriteriaSet topCustomCriteriaSet = new CustomCriteriaSet();
    topCustomCriteriaSet.setLogicalOperator(CustomCriteriaSetLogicalOperator.OR);

    // Create the sub expression:
    //
    // (CUSTOM_TARGETING_KEY_ID_1 == CUSTOM_TARGETING_VALUE_ID_1 AND
    // (CUSTOM_TARGETING_KEY_ID_2 !=
    //     (CUSTOM_TARGETING_VALUE_ID_2 OR CUSTOM_TARGETING_VALUE_ID_3))
    CustomCriteriaSet subCustomCriteriaSet = new CustomCriteriaSet();
    subCustomCriteriaSet.setLogicalOperator(CustomCriteriaSetLogicalOperator.AND);
    subCustomCriteriaSet.setChildren(
        new CustomCriteriaNode[] {customCriteria1, customCriteria2});

    // Combine the expression
    // (CUSTOM_TARGETING_KEY_ID_3 = CUSTOM_TARGETING_VALUE_ID_4) with
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
    lineItem.setUnitsBought(500000L);
    lineItem.setUnitType(UnitType.IMPRESSIONS);

    // Create the line item on the server.
    LineItem[] lineItems = lineItemService.createLineItems(new LineItem[] {lineItem});

    for (LineItem createdLineItem : lineItems) {
      System.out.printf("A line item with ID \"%d\" and name \"%s\" was created.\n",
          createdLineItem.getId(), createdLineItem.getName());
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
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

    runExample(dfpServices,
        session,
        Long.parseLong(ORDER_ID),
        Long.parseLong(CUSTOM_TARGETING_KEY_ID_1),
        Long.parseLong(CUSTOM_TARGETING_KEY_ID_2),
        Long.parseLong(CUSTOM_TARGETING_KEY_ID_3),
        Long.parseLong(CUSTOM_TARGETING_VALUE_ID_1),
        Long.parseLong(CUSTOM_TARGETING_VALUE_ID_2),
        Long.parseLong(CUSTOM_TARGETING_VALUE_ID_3),
        Long.parseLong(CUSTOM_TARGETING_VALUE_ID_4));
  }
}
