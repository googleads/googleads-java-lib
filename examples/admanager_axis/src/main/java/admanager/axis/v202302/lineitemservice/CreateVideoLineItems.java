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

package admanager.axis.v202302.lineitemservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202302.DateTimes;
import com.google.api.ads.admanager.axis.v202302.AdUnitTargeting;
import com.google.api.ads.admanager.axis.v202302.ApiError;
import com.google.api.ads.admanager.axis.v202302.ApiException;
import com.google.api.ads.admanager.axis.v202302.CmsMetadataCriteria;
import com.google.api.ads.admanager.axis.v202302.CmsMetadataCriteriaComparisonOperator;
import com.google.api.ads.admanager.axis.v202302.CompanionDeliveryOption;
import com.google.api.ads.admanager.axis.v202302.ContentTargeting;
import com.google.api.ads.admanager.axis.v202302.CostType;
import com.google.api.ads.admanager.axis.v202302.CreativePlaceholder;
import com.google.api.ads.admanager.axis.v202302.CreativeRotationType;
import com.google.api.ads.admanager.axis.v202302.CustomCriteriaNode;
import com.google.api.ads.admanager.axis.v202302.CustomCriteriaSet;
import com.google.api.ads.admanager.axis.v202302.CustomCriteriaSetLogicalOperator;
import com.google.api.ads.admanager.axis.v202302.EnvironmentType;
import com.google.api.ads.admanager.axis.v202302.Goal;
import com.google.api.ads.admanager.axis.v202302.GoalType;
import com.google.api.ads.admanager.axis.v202302.InventoryTargeting;
import com.google.api.ads.admanager.axis.v202302.LineItem;
import com.google.api.ads.admanager.axis.v202302.LineItemServiceInterface;
import com.google.api.ads.admanager.axis.v202302.LineItemType;
import com.google.api.ads.admanager.axis.v202302.Money;
import com.google.api.ads.admanager.axis.v202302.RequestPlatform;
import com.google.api.ads.admanager.axis.v202302.RequestPlatformTargeting;
import com.google.api.ads.admanager.axis.v202302.Size;
import com.google.api.ads.admanager.axis.v202302.StartDateTimeType;
import com.google.api.ads.admanager.axis.v202302.Targeting;
import com.google.api.ads.admanager.axis.v202302.VideoPosition;
import com.google.api.ads.admanager.axis.v202302.VideoPositionTarget;
import com.google.api.ads.admanager.axis.v202302.VideoPositionTargeting;
import com.google.api.ads.admanager.axis.v202302.VideoPositionType;
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
import org.joda.time.Duration;
import org.joda.time.Instant;

/**
 * This example creates a new line item for a video environment.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class CreateVideoLineItems {

  private static class CreateVideoLineItemsParams extends CodeSampleParams {
    @Parameter(
        names = ArgumentNames.ORDER_ID,
        required = true,
        description = "The ID of the order that the line item will belong to.")
    private Long orderId;

    @Parameter(
        names = ArgumentNames.TARGETED_VIDEO_AD_UNIT_ID,
        required = true,
        description = "The ID of the ad unit that the line item will target.")
    private String targetedVideoAdUnitId;

    @Parameter(
        names = ArgumentNames.CONTENT_ID,
        required = true,
        description = "The ID of the video Content that the line item will target")
    private Long contentId;

    @Parameter(
        names = ArgumentNames.CONTENT_BUNDLE_ID,
        required = true,
        description = "The ID of the video ContentBundle that the line item will target")
    private Long contentBundleId;

    @Parameter(
        names = ArgumentNames.CMS_METADATA_VALUE_ID,
        required = true,
        description = "The ID of the CMS metadata value that the line item will target")
    private Long cmsMetadataValueId;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param orderId the ID of the order that the line item will belong to.
   * @param targetedVideoAdUnitId the ID of the d unit that the line item will target.
   * @param contentId the ID of the video content that the line item will target.
   * @param contentBundleId the ID of the video content bundle that the line item will target.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdManagerServices adManagerServices,
      AdManagerSession session,
      long orderId,
      String targetedVideoAdUnitId,
      long contentId,
      long contentBundleId,
      long cmsMetadataValueId)
      throws RemoteException {
    // Get the LineItemService.
    LineItemServiceInterface lineItemService =
        adManagerServices.get(session, LineItemServiceInterface.class);

    // Create content targeting.
    ContentTargeting contentTargeting = new ContentTargeting();
    contentTargeting.setTargetedContentIds(new long[] {contentId});
    contentTargeting.setTargetedVideoContentBundleIds(new long[] {contentBundleId});

    // Target only video players
    RequestPlatformTargeting requestPlatformTargeting = new RequestPlatformTargeting();
    requestPlatformTargeting.setTargetedRequestPlatforms(
        new RequestPlatform[] {RequestPlatform.VIDEO_PLAYER});

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
    videoPositionTargeting.setTargetedPositions(new VideoPositionTarget[] {videoPositionTarget});

    // Create custom targeting for CmsMetadataValues.
    CmsMetadataCriteria contentCustomCriteria = new CmsMetadataCriteria();
    contentCustomCriteria.setCmsMetadataValueIds(new long[] {cmsMetadataValueId});
    contentCustomCriteria.setOperator(CmsMetadataCriteriaComparisonOperator.EQUALS);

    CustomCriteriaSet customCriteriaSet = new CustomCriteriaSet();
    customCriteriaSet.setChildren(new CustomCriteriaNode[] {contentCustomCriteria});
    customCriteriaSet.setLogicalOperator(CustomCriteriaSetLogicalOperator.AND);

    // Create targeting.
    Targeting targeting = new Targeting();
    targeting.setContentTargeting(contentTargeting);
    targeting.setInventoryTargeting(inventoryTargeting);
    targeting.setVideoPositionTargeting(videoPositionTargeting);
    targeting.setRequestPlatformTargeting(requestPlatformTargeting);
    targeting.setCustomTargeting(customCriteriaSet);

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

    // Set the maximum video creative length for this line item to 15 seconds.
    lineItem.setVideoMaxDuration(15000L);

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
      System.out.printf(
          "A video line item with ID %d and name '%s' was created.%n",
          createdLineItem.getId(), createdLineItem.getName());
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

    CreateVideoLineItemsParams params = new CreateVideoLineItemsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.orderId = Long.parseLong("INSERT_ORDER_ID_HERE");
      params.targetedVideoAdUnitId = "INSERT_TARGETED_VIDEO_AD_UNIT_ID_HERE";
      params.contentId = Long.parseLong("INSERT_CONTENT_ID_HERE");
      params.contentBundleId = Long.parseLong("INSERT_CONTENT_BUNDLE_ID_HERE");
      params.cmsMetadataValueId = Long.parseLong("INSERT_CMS_METADATA_VALUE_ID_HERE");
    }

    try {
      runExample(
          adManagerServices,
          session,
          params.orderId,
          params.targetedVideoAdUnitId,
          params.contentId,
          params.contentBundleId,
          params.cmsMetadataValueId);
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
