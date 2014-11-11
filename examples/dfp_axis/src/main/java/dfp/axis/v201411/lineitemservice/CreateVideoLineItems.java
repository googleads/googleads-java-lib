// Copyright 2014 Google Inc. All Rights Reserved.
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

package dfp.axis.v201411.lineitemservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201411.DateTimes;
import com.google.api.ads.dfp.axis.v201411.AdUnitTargeting;
import com.google.api.ads.dfp.axis.v201411.CompanionDeliveryOption;
import com.google.api.ads.dfp.axis.v201411.ContentMetadataKeyHierarchyTargeting;
import com.google.api.ads.dfp.axis.v201411.ContentTargeting;
import com.google.api.ads.dfp.axis.v201411.CostType;
import com.google.api.ads.dfp.axis.v201411.CreativePlaceholder;
import com.google.api.ads.dfp.axis.v201411.CreativeRotationType;
import com.google.api.ads.dfp.axis.v201411.EnvironmentType;
import com.google.api.ads.dfp.axis.v201411.Goal;
import com.google.api.ads.dfp.axis.v201411.GoalType;
import com.google.api.ads.dfp.axis.v201411.InventoryTargeting;
import com.google.api.ads.dfp.axis.v201411.LineItem;
import com.google.api.ads.dfp.axis.v201411.LineItemServiceInterface;
import com.google.api.ads.dfp.axis.v201411.LineItemType;
import com.google.api.ads.dfp.axis.v201411.Money;
import com.google.api.ads.dfp.axis.v201411.Size;
import com.google.api.ads.dfp.axis.v201411.StartDateTimeType;
import com.google.api.ads.dfp.axis.v201411.Targeting;
import com.google.api.ads.dfp.axis.v201411.VideoPosition;
import com.google.api.ads.dfp.axis.v201411.VideoPositionTarget;
import com.google.api.ads.dfp.axis.v201411.VideoPositionTargeting;
import com.google.api.ads.dfp.axis.v201411.VideoPositionType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import org.joda.time.Duration;
import org.joda.time.Instant;

import java.util.Random;

/**
 * This example creates a new line item for a video environment. To determine
 * which line items exist, run GetAllLineItems.java. To determine which orders
 * exist, run GetAllOrders.java. To determine which content metadata key
 * hierarchies exist, run GetAllContentMetadataKeyHierarchies.java. To determine
 * which ad units exist, run GetAllAdUnits.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: LineItemService.createLineItems
 *
 * @author Adam Rogal
 */
public class CreateVideoLineItems {

  // Set the ID of the order that the line item will belong to.
  private static final String ORDER_ID = "INSERT_ORDER_ID_HERE";

  // Set the ID of the ad unit that the line item will target.
  private static final String TARGETED_VIDEO_AD_UNIT_ID = "INSERT_VIDEO_AD_UNIT_ID_HERE";

  // Set the custom targeting value ID representing the metadata
  // on the content to target. This would typically be from a key representing
  // a "genre" and the value representing something like "comedy". The value
  // must be from a key in a content metadata key hierarchy.
  private static final String CONTENT_CUSTOM_TARGETING_VALUE_ID =
      "INSERT_CUSTOM_TARGETING_VALUE_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long orderId,
      String targetedVideoAdUnitId, long contentCustomTargetingValueId) throws Exception {
    // Get the LineItemService.
    LineItemServiceInterface lineItemService =
        dfpServices.get(session, LineItemServiceInterface.class);

    // Create content targeting.
    ContentMetadataKeyHierarchyTargeting contentMetadataTargeting = 
        new ContentMetadataKeyHierarchyTargeting();
    contentMetadataTargeting.setCustomTargetingValueIds(
        new long[] {contentCustomTargetingValueId});
    
    ContentTargeting contentTargeting = new ContentTargeting();
    contentTargeting.setTargetedContentMetadata(
        new ContentMetadataKeyHierarchyTargeting[] {contentMetadataTargeting});
    
    // Create inventory targeting.
    InventoryTargeting inventoryTargeting = new InventoryTargeting();
    inventoryTargeting.setTargetedAdUnits(
        new AdUnitTargeting[] {new AdUnitTargeting(targetedVideoAdUnitId, true)});

    // Create video position targeting.
    VideoPosition videoPosition = new VideoPosition();
    videoPosition.setPositionType(VideoPositionType.PREROLL);
    VideoPositionTarget videoPositionTarget = new VideoPositionTarget();
    videoPositionTarget.setVideoPosition(videoPosition);
    VideoPositionTargeting videoPositionTargeting = new VideoPositionTargeting();
    videoPositionTargeting.setTargetedPositions(
        new VideoPositionTarget[] {videoPositionTarget});

    // Create targeting.
    Targeting targeting = new Targeting();
    targeting.setContentTargeting(contentTargeting);
    targeting.setInventoryTargeting(inventoryTargeting);
    targeting.setVideoPositionTargeting(videoPositionTargeting);

    // Create local line item object.
    LineItem lineItem = new LineItem();
    lineItem.setName("Video line item #" + new Random().nextInt(Integer.MAX_VALUE));
    lineItem.setOrderId(orderId);
    lineItem.setTargeting(targeting);

    // Allow the line item to be booked even if there is not enough inventory.
    lineItem.setAllowOverbook(true);

    // Set the line item type to SPONSORSHIP.
    lineItem.setLineItemType(LineItemType.SPONSORSHIP);

    // Set the environment type to video.
    lineItem.setEnvironmentType(EnvironmentType.VIDEO_PLAYER);

    // Set the creative rotation type to optimized.
    lineItem.setCreativeRotationType(CreativeRotationType.OPTIMIZED);

    // Create the master creative placeholder.
    CreativePlaceholder creativeMasterPlaceholder = new CreativePlaceholder();
    creativeMasterPlaceholder.setSize(new Size(640, 360, false));

    // Create companion creative placeholders.
    CreativePlaceholder companionCreativePlaceholder = new CreativePlaceholder();
    companionCreativePlaceholder.setSize(new Size(300, 250, false));

    // Set companion creative placeholders.
    creativeMasterPlaceholder.setCompanions(
        new CreativePlaceholder[] {companionCreativePlaceholder});

    // Set the size of creatives that can be associated with this line item.
    lineItem.setCreativePlaceholders(new CreativePlaceholder[] {creativeMasterPlaceholder});

    // Set delivery of video companions to optional.
    lineItem.setCompanionDeliveryOption(CompanionDeliveryOption.OPTIONAL);

    // Set the length of the line item to run.
    lineItem.setStartDateTimeType(StartDateTimeType.IMMEDIATELY);
    lineItem.setEndDateTime(
        DateTimes.toDateTime(Instant.now().plus(Duration.standardDays(30L)), "America/New_York"));

    // Set the cost per day to $1.
    lineItem.setCostType(CostType.CPD);
    lineItem.setCostPerUnit(new Money("USD", 1000000L));

    // Set the percentage to be 100%.
    Goal goal = new Goal();
    goal.setGoalType(GoalType.DAILY);
    goal.setUnits(100L);
    lineItem.setPrimaryGoal(goal);

    // Create the line item on the server.
    LineItem[] lineItems = lineItemService.createLineItems(new LineItem[] {lineItem});

    for (LineItem createdLineItem : lineItems) {
      System.out.printf("A video line item with ID \"%d\" and name \"%s\" was created.\n",
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
        TARGETED_VIDEO_AD_UNIT_ID,
        Long.parseLong(CONTENT_CUSTOM_TARGETING_VALUE_ID));
  }
}
