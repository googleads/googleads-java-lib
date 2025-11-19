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

package admanager.axis.v202511.audiencesegmentservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.v202511.AdUnitTargeting;
import com.google.api.ads.admanager.axis.v202511.ApiError;
import com.google.api.ads.admanager.axis.v202511.ApiException;
import com.google.api.ads.admanager.axis.v202511.AudienceSegment;
import com.google.api.ads.admanager.axis.v202511.AudienceSegmentServiceInterface;
import com.google.api.ads.admanager.axis.v202511.CustomCriteria;
import com.google.api.ads.admanager.axis.v202511.CustomCriteriaComparisonOperator;
import com.google.api.ads.admanager.axis.v202511.CustomCriteriaNode;
import com.google.api.ads.admanager.axis.v202511.CustomCriteriaSet;
import com.google.api.ads.admanager.axis.v202511.CustomCriteriaSetLogicalOperator;
import com.google.api.ads.admanager.axis.v202511.FirstPartyAudienceSegment;
import com.google.api.ads.admanager.axis.v202511.FirstPartyAudienceSegmentRule;
import com.google.api.ads.admanager.axis.v202511.InventoryTargeting;
import com.google.api.ads.admanager.axis.v202511.NetworkServiceInterface;
import com.google.api.ads.admanager.axis.v202511.RuleBasedFirstPartyAudienceSegment;
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

/**
 * This example creates new rule based first party audience segments. To determine which audience
 * segments exist, run GetAllAudienceSegments.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class CreateAudienceSegments {

  private static class CreateAudienceSegmentsParams extends CodeSampleParams {
    @Parameter(
        names = ArgumentNames.TARGETING_KEY_ID,
        required = true,
        description = "The ID of the custom criteria to be used in the segment rule.")
    private Long customTargetingKeyId;

    @Parameter(names = ArgumentNames.TARGETING_VALUE_ID, required = true)
    private Long customTargetingValueId;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param customTargetingKeyId the ID of the custom criteria to be used in the segment rule.
   * @param customTargetingValueId the custom targeting value ID.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdManagerServices adManagerServices,
      AdManagerSession session,
      long customTargetingKeyId,
      long customTargetingValueId)
      throws RemoteException {
    // Get the AudienceSegmentService.
    AudienceSegmentServiceInterface audienceSegmentService =
        adManagerServices.get(session, AudienceSegmentServiceInterface.class);

    // Get the NetworkService.
    NetworkServiceInterface networkService =
        adManagerServices.get(session, NetworkServiceInterface.class);

    // Get the root ad unit ID used to target the whole site.
    String rootAdUnitId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();

    // Create inventory targeting.
    InventoryTargeting inventoryTargeting = new InventoryTargeting();

    // Create ad unit targeting for the root ad unit (i.e. the whole network).
    AdUnitTargeting adUnitTargeting = new AdUnitTargeting();
    adUnitTargeting.setAdUnitId(rootAdUnitId);
    adUnitTargeting.setIncludeDescendants(true);

    inventoryTargeting.setTargetedAdUnits(new AdUnitTargeting[] {adUnitTargeting});

    // Create the custom criteria to be used in the segment rule.
    // TARGETING_KEY_ID == TARGETING_VALUE_ID
    CustomCriteria customCriteria = new CustomCriteria();
    customCriteria.setKeyId(customTargetingKeyId);
    customCriteria.setOperator(CustomCriteriaComparisonOperator.IS);
    customCriteria.setValueIds(new long[] {customTargetingValueId});

    // Create the custom criteria expression.
    CustomCriteriaSet topCustomCriteriaSet = new CustomCriteriaSet();
    topCustomCriteriaSet.setLogicalOperator(CustomCriteriaSetLogicalOperator.AND);
    topCustomCriteriaSet.setChildren(new CustomCriteriaNode[] {customCriteria});

    // Create the audience segment rule.
    FirstPartyAudienceSegmentRule rule = new FirstPartyAudienceSegmentRule();
    rule.setInventoryRule(inventoryTargeting);
    rule.setCustomCriteriaRule(topCustomCriteriaSet);

    // Create an audience segment.
    RuleBasedFirstPartyAudienceSegment audienceSegment = new RuleBasedFirstPartyAudienceSegment();
    audienceSegment.setName(
        "Sports enthusiasts audience segment #" + new Random().nextInt(Integer.MAX_VALUE));
    audienceSegment.setDescription("Sports enthusiasts between the ages of 20 and 30.");
    audienceSegment.setPageViews(6);
    audienceSegment.setRecencyDays(6);
    audienceSegment.setMembershipExpirationDays(88);
    audienceSegment.setRule(rule);

    // Create the audience segment on the server.
    AudienceSegment[] audienceSegments =
        audienceSegmentService.createAudienceSegments(
            new FirstPartyAudienceSegment[] {audienceSegment});

    for (AudienceSegment createdAudienceSegment : audienceSegments) {
      System.out.printf(
          "An audience segment with ID %d, name '%s', and type '%s' was created.%n",
          createdAudienceSegment.getId(),
          createdAudienceSegment.getName(),
          createdAudienceSegment.getType());
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

    CreateAudienceSegmentsParams params = new CreateAudienceSegmentsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customTargetingKeyId = Long.parseLong("INSERT_CUSTOM_TARGETING_KEY_ID_HERE");
      params.customTargetingValueId = Long.parseLong("INSERT_CUSTOM_TARGETING_VALUE_ID_HERE");
    }

    try {
      runExample(
          adManagerServices, session, params.customTargetingKeyId, params.customTargetingValueId);
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
