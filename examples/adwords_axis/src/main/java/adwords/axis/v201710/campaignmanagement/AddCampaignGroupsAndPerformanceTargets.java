// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.v201710.campaignmanagement;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.Campaign;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignGroup;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignGroupOperation;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignGroupPerformanceTarget;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignGroupPerformanceTargetOperation;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignGroupPerformanceTargetServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.EfficiencyTargetType;
import com.google.api.ads.adwords.axis.v201710.cm.Money;
import com.google.api.ads.adwords.axis.v201710.cm.Operator;
import com.google.api.ads.adwords.axis.v201710.cm.PerformanceTarget;
import com.google.api.ads.adwords.axis.v201710.cm.SpendTargetType;
import com.google.api.ads.adwords.axis.v201710.cm.VolumeGoalType;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;

/**
 * This code example adds a campaign group and sets a performance target for that group. To get
 * campaigns, run GetCampaigns.java. To download reports, run DownloadCriteriaReportWithAwql.java.
 */
public class AddCampaignGroupsAndPerformanceTargets {

  private static class AddCampaignGroupsAndPerformanceTargetsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private List<Long> campaignIds;
  }

  public static void main(String[] args) {
    AdWordsSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.ADWORDS)
              .fromFile()
              .build()
              .generateCredential();

      // Construct an AdWordsSession.
      session =
          new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
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

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    AddCampaignGroupsAndPerformanceTargetsParams params =
        new AddCampaignGroupsAndPerformanceTargetsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.campaignIds = Arrays.asList(
          Long.valueOf("INSERT_CAMPAIGN_ID_HERE"),
          Long.valueOf("INSERT_CAMPAIGN_ID_HERE"));
    }

    try {
      runExample(adWordsServices, session, params.campaignIds);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the adwords.axis
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
      System.err.printf(
          "Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @param campaignIds the IDs of the campaigns to add to the campaign group.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, List<Long> campaignIds)
      throws RemoteException {
    CampaignGroup campaignGroup = createCampaignGroup(adWordsServices, session);
    addCampaignsToGroup(adWordsServices, session, campaignGroup, campaignIds);
    createPerformanceTarget(adWordsServices, session, campaignGroup);
  }

  /** Creates a campaign group. */
  private static CampaignGroup createCampaignGroup(
      AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws RemoteException {
    // Get the CampaignGroupService.
    CampaignGroupServiceInterface campaignGroupService =
        adWordsServices.get(session, CampaignGroupServiceInterface.class);

    // Create the campaign group.
    CampaignGroup campaignGroup = new CampaignGroup();
    campaignGroup.setName("Mars campaign group #" + System.currentTimeMillis());

    // Create the operation.
    CampaignGroupOperation operation = new CampaignGroupOperation();
    operation.setOperand(campaignGroup);
    operation.setOperator(Operator.ADD);

    CampaignGroup newCampaignGroup =
        campaignGroupService.mutate(new CampaignGroupOperation[] {operation}).getValue(0);
    System.out.printf(
        "Campaign group with ID %d and name '%s' was created.%n",
        newCampaignGroup.getId(), newCampaignGroup.getName());

    return newCampaignGroup;
  }

  /** Adds multiple campaigns to a campaign group. */
  private static void addCampaignsToGroup(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      CampaignGroup campaignGroup,
      List<Long> campaignIds)
      throws ApiException, RemoteException {
    // Get the CampaignService.
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    List<CampaignOperation> operations = new ArrayList<>();
    for (Long campaignId : campaignIds) {
      Campaign campaign = new Campaign();
      campaign.setId(campaignId);
      campaign.setCampaignGroupId(campaignGroup.getId());

      CampaignOperation operation = new CampaignOperation();
      operation.setOperand(campaign);
      operation.setOperator(Operator.SET);
      operations.add(operation);
    }

    CampaignReturnValue returnValue =
        campaignService.mutate(operations.toArray(new CampaignOperation[operations.size()]));
    System.out.printf(
        "The following campaign IDs were added to the campaign group with ID %d:%n",
        campaignGroup.getId());
    for (Campaign campaign : returnValue.getValue()) {
      System.out.printf("\t%d%n", campaign.getId());
    }
  }

  /** Creates a performance target for the campaign group. */
  private static void createPerformanceTarget(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, CampaignGroup campaignGroup)
      throws ApiException, RemoteException {
    // Get the CampaignGroupPerformanceTargetService.
    CampaignGroupPerformanceTargetServiceInterface campaignGroupPerformanceTargetService =
        adWordsServices.get(session, CampaignGroupPerformanceTargetServiceInterface.class);

    // Create the performance target.
    CampaignGroupPerformanceTarget campaignGroupPerformanceTarget =
        new CampaignGroupPerformanceTarget();
    campaignGroupPerformanceTarget.setCampaignGroupId(campaignGroup.getId());

    PerformanceTarget performanceTarget = new PerformanceTarget();
    // Keep the CPC for the campaigns < $3.
    performanceTarget.setEfficiencyTargetType(EfficiencyTargetType.CPC_LESS_THAN_OR_EQUAL_TO);
    performanceTarget.setEfficiencyTargetValue(3000000d);

    // Keep the maximum spend under $50.
    performanceTarget.setSpendTargetType(SpendTargetType.MAXIMUM);
    Money maxSpend = new Money();
    maxSpend.setMicroAmount(500000000L);
    performanceTarget.setSpendTarget(maxSpend);

    // Aim for at least 3000 clicks.
    performanceTarget.setVolumeTargetValue(3000L);
    performanceTarget.setVolumeGoalType(VolumeGoalType.MAXIMIZE_CLICKS);

    // Start the performance target today, and run it for the next 90 days.
    DateTime startDate = DateTime.now();
    DateTime endDate = DateTime.now().plusDays(90);

    performanceTarget.setStartDate(startDate.toString("yyyyMMdd"));
    performanceTarget.setEndDate(endDate.toString("yyyyMMdd"));

    campaignGroupPerformanceTarget.setPerformanceTarget(performanceTarget);

    // Create the operation.
    CampaignGroupPerformanceTargetOperation operation =
        new CampaignGroupPerformanceTargetOperation();
    operation.setOperand(campaignGroupPerformanceTarget);
    operation.setOperator(Operator.ADD);

    CampaignGroupPerformanceTarget newCampaignGroupPerformanceTarget =
        campaignGroupPerformanceTargetService
            .mutate(new CampaignGroupPerformanceTargetOperation[] {operation})
            .getValue(0);

    // Display the results.
    System.out.printf(
        "Campaign group performance target with ID %d was added for campaign group ID %d.%n",
        newCampaignGroupPerformanceTarget.getId(),
        newCampaignGroupPerformanceTarget.getCampaignGroupId());
  }
}
