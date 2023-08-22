// Copyright 2016 Google Inc. All Rights Reserved.
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

package admanager.axis.v202308.proposallineitemservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202308.DateTimes;
import com.google.api.ads.admanager.axis.v202308.AdUnitTargeting;
import com.google.api.ads.admanager.axis.v202308.ApiError;
import com.google.api.ads.admanager.axis.v202308.ApiException;
import com.google.api.ads.admanager.axis.v202308.CreativePlaceholder;
import com.google.api.ads.admanager.axis.v202308.DeliveryRateType;
import com.google.api.ads.admanager.axis.v202308.DeviceCapability;
import com.google.api.ads.admanager.axis.v202308.DeviceCapabilityTargeting;
import com.google.api.ads.admanager.axis.v202308.Goal;
import com.google.api.ads.admanager.axis.v202308.InventoryTargeting;
import com.google.api.ads.admanager.axis.v202308.LineItemType;
import com.google.api.ads.admanager.axis.v202308.Money;
import com.google.api.ads.admanager.axis.v202308.NetworkServiceInterface;
import com.google.api.ads.admanager.axis.v202308.ProposalLineItem;
import com.google.api.ads.admanager.axis.v202308.ProposalLineItemServiceInterface;
import com.google.api.ads.admanager.axis.v202308.RateType;
import com.google.api.ads.admanager.axis.v202308.RequestPlatform;
import com.google.api.ads.admanager.axis.v202308.RequestPlatformTargeting;
import com.google.api.ads.admanager.axis.v202308.Size;
import com.google.api.ads.admanager.axis.v202308.Targeting;
import com.google.api.ads.admanager.axis.v202308.TechnologyTargeting;
import com.google.api.ads.admanager.axis.v202308.UnitType;
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
 * This example creates a new proposal line item.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class CreateProposalLineItems {

  private static class CreateProposalLineItemsParams extends CodeSampleParams {
    @Parameter(
        names = ArgumentNames.PROPOSAL_ID,
        required = true,
        description = "The ID of the proposal that the proposal line items will belong to.")
    private Long proposalId;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param proposalId the ID of the proposal that the proposal line items will belong to.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdManagerServices adManagerServices, AdManagerSession session, long proposalId)
      throws RemoteException {
    ProposalLineItemServiceInterface proposalLineItemService =
        adManagerServices.get(session, ProposalLineItemServiceInterface.class);

    NetworkServiceInterface networkService =
        adManagerServices.get(session, NetworkServiceInterface.class);

    ProposalLineItem proposalLineItem = new ProposalLineItem();

    // Set common required fields for a proposal line item.
    proposalLineItem.setName("Proposal line item #" + new Random().nextInt(Integer.MAX_VALUE));
    proposalLineItem.setProposalId(proposalId);
    proposalLineItem.setLineItemType(LineItemType.STANDARD);

    // Get the root ad unit ID used to target the whole site.
    String rootAdUnitId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();

    // Create inventory targeting.
    InventoryTargeting inventoryTargeting = new InventoryTargeting();

    // Create ad unit targeting for the root ad unit (i.e. the whole network).
    AdUnitTargeting adUnitTargeting = new AdUnitTargeting();
    adUnitTargeting.setAdUnitId(rootAdUnitId);
    adUnitTargeting.setIncludeDescendants(true);

    inventoryTargeting.setTargetedAdUnits(new AdUnitTargeting[] {adUnitTargeting});

    // Target display environment
    RequestPlatformTargeting requestPlatformTargeting = new RequestPlatformTargeting();
    requestPlatformTargeting.setTargetedRequestPlatforms(
        new RequestPlatform[] {RequestPlatform.BROWSER});

    // Target Display environment by excluding Mobile Apps.
    // DeviceCapabilities can be obtained though the Device_Capability PQL table:
    // https://developers.google.com/ad-manager/api/reference/latest/PublisherQueryLanguageService
    DeviceCapability mobileApps = new DeviceCapability();
    mobileApps.setId(5005L);
    DeviceCapabilityTargeting deviceCapabilityTargeting = new DeviceCapabilityTargeting();
    deviceCapabilityTargeting.setExcludedDeviceCapabilities(new DeviceCapability[] {mobileApps});
    TechnologyTargeting technologyTargeting = new TechnologyTargeting();
    technologyTargeting.setDeviceCapabilityTargeting(deviceCapabilityTargeting);

    // Create targeting.
    Targeting targeting = new Targeting();
    targeting.setInventoryTargeting(inventoryTargeting);
    targeting.setRequestPlatformTargeting(requestPlatformTargeting);
    targeting.setTechnologyTargeting(technologyTargeting);

    proposalLineItem.setTargeting(targeting);

    // Create creative placeholder size.
    Size size = new Size();
    size.setWidth(300);
    size.setHeight(250);
    size.setIsAspectRatio(false);

    // Create the creative placeholder.
    CreativePlaceholder creativePlaceholder = new CreativePlaceholder();
    creativePlaceholder.setSize(size);

    // Set the size of creatives that can be associated with this proposal line item.
    proposalLineItem.setCreativePlaceholders(new CreativePlaceholder[] {creativePlaceholder});

    // Set the length of the proposal line item to run.
    proposalLineItem.setStartDateTime(DateTimes.toDateTime(Instant.now(), "America/New_York"));
    proposalLineItem.setEndDateTime(
        DateTimes.toDateTime(Instant.now().plus(Duration.standardDays(30L)), "America/New_York"));

    // Set delivery specifications for the proposal line item.
    proposalLineItem.setDeliveryRateType(DeliveryRateType.EVENLY);

    // Set pricing for the proposal line item for 1000 impressions at a CPM of $2
    // for a total value of $2.
    Goal goal = new Goal();
    goal.setUnits(1000L);
    goal.setUnitType(UnitType.IMPRESSIONS);
    proposalLineItem.setGoal(goal);

    proposalLineItem.setNetRate(new Money("USD", 2000000L));
    proposalLineItem.setRateType(RateType.CPM);

    ProposalLineItem[] proposalLineItems =
        proposalLineItemService.createProposalLineItems(new ProposalLineItem[] {proposalLineItem});

    for (ProposalLineItem createdProposalLineItem : proposalLineItems) {
      System.out.printf(
          "A proposal line item with ID %d and name '%s' was created.%n",
          createdProposalLineItem.getId(), createdProposalLineItem.getName());
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

    CreateProposalLineItemsParams params = new CreateProposalLineItemsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.proposalId = Long.parseLong("INSERT_PROPOSAL_ID_HERE");
    }

    try {
      runExample(adManagerServices, session, params.proposalId);
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
