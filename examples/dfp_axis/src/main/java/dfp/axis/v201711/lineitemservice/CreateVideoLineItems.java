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
import com.google.api.ads.dfp.axis.v201711.CompanionDeliveryOption;
import com.google.api.ads.dfp.axis.v201711.ContentMetadataKeyHierarchyTargeting;
import com.google.api.ads.dfp.axis.v201711.ContentTargeting;
import com.google.api.ads.dfp.axis.v201711.CostType;
import com.google.api.ads.dfp.axis.v201711.CreativePlaceholder;
import com.google.api.ads.dfp.axis.v201711.CreativeRotationType;
import com.google.api.ads.dfp.axis.v201711.EnvironmentType;
import com.google.api.ads.dfp.axis.v201711.Goal;
import com.google.api.ads.dfp.axis.v201711.GoalType;
import com.google.api.ads.dfp.axis.v201711.InventoryTargeting;
import com.google.api.ads.dfp.axis.v201711.LineItem;
import com.google.api.ads.dfp.axis.v201711.LineItemServiceInterface;
import com.google.api.ads.dfp.axis.v201711.LineItemType;
import com.google.api.ads.dfp.axis.v201711.Money;
import com.google.api.ads.dfp.axis.v201711.Size;
import com.google.api.ads.dfp.axis.v201711.StartDateTimeType;
import com.google.api.ads.dfp.axis.v201711.Targeting;
import com.google.api.ads.dfp.axis.v201711.VideoPosition;
import com.google.api.ads.dfp.axis.v201711.VideoPositionTarget;
import com.google.api.ads.dfp.axis.v201711.VideoPositionTargeting;
import com.google.api.ads.dfp.axis.v201711.VideoPositionType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.Random;
import org.joda.time.Duration;
import org.joda.time.Instant;

/**
 * This example creates a new line item for a video environment. To determine
 * which line items exist, run GetAllLineItems.java. To determine which orders
 * exist, run GetAllOrders.java. To determine which content metadata key
 * hierarchies exist, run GetAllContentMetadataKeyHierarchies.java. To determine
 * which ad units exist, run GetAllAdUnits.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateVideoLineItems {

  private static class CreateVideoLineItemsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.ORDER_ID, required = true,
        description = "The ID of the order that the line item will belong to.")
    private Long orderId;

    @Parameter(names = ArgumentNames.TARGETED_VIDEO_AD_UNIT_ID, required = true,
        description = "The ID of the ad unit that the line item will target.")
    private String targetedVideoAdUnitId;

    @Parameter(names = ArgumentNames.CONTENT_CUSTOM_TARGETING_VALUE_ID, required = true,
        description = "The custom targeting value ID representing the metadata on the content"
            + " to target. This would typically be from a key representing a \"genre\" and the"
            + " value representing something like \"comedy\". The value must be from a key in a"
            + " content metadata key hierarchy.")
    private Long contentCustomTargetingValueId;
  }

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @param orderId the ID of the order that the line item will belong to.
   * @param targetedVideoAdUnitId the ID of the d unit that the line item will target.
   * @param contentCustomTargetingValueId The custom targeting value ID representing the metadata on
   *     the content to target. This would typically be from a key representing a "genre" and the
   *     value representing something like "comedy". The value must be from a key in a content
   *     metadata key hierarchy.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      DfpServices dfpServices,
      DfpSession session,
      long orderId,
      String targetedVideoAdUnitId,
      long contentCustomTargetingValueId)
      throws RemoteException {
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
      System.out.printf("A video line item with ID %d and name '%s' was created.%n",
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

    CreateVideoLineItemsParams params = new CreateVideoLineItemsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.orderId = Long.parseLong("INSERT_ORDER_ID_HERE");
      params.targetedVideoAdUnitId = "INSERT_TARGETED_VIDEO_AD_UNIT_ID_HERE";
      params.contentCustomTargetingValueId =
          Long.parseLong("INSERT_CONTENT_CUSTOM_TARGETING_VALUE_ID_HERE");
    }

    try {
      runExample(dfpServices, session, params.orderId, params.targetedVideoAdUnitId,
          params.contentCustomTargetingValueId);
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
