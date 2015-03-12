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

package adwords.axis.v201502.campaignmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupExperimentData;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupOperation;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201502.cm.BidMultiplier;
import com.google.api.ads.adwords.axis.v201502.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201502.cm.BiddableAdGroupCriterionExperimentData;
import com.google.api.ads.adwords.axis.v201502.cm.Criterion;
import com.google.api.ads.adwords.axis.v201502.cm.Experiment;
import com.google.api.ads.adwords.axis.v201502.cm.ExperimentDeltaStatus;
import com.google.api.ads.adwords.axis.v201502.cm.ExperimentOperation;
import com.google.api.ads.adwords.axis.v201502.cm.ExperimentReturnValue;
import com.google.api.ads.adwords.axis.v201502.cm.ExperimentServiceInterface;
import com.google.api.ads.adwords.axis.v201502.cm.ManualCPCAdGroupCriterionExperimentBidMultiplier;
import com.google.api.ads.adwords.axis.v201502.cm.ManualCPCAdGroupExperimentBidMultipliers;
import com.google.api.ads.adwords.axis.v201502.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import org.joda.time.DateTime;

/**
 * This example creates an experiment using a query percentage of 10, which
 * defines what fraction of auctions should go to the control split (90%) vs.
 * the experiment split (10%), then adds experimental bid changes for criteria
 * and ad groups. To get campaigns, run GetAllCampaigns.java. To get ad groups,
 * run GetAllAdGroups.java. To get criteria, run GetAllAdGroupCriteria.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: ExperimentService.mutate
 *
 * Category: adx-exclude
 *
 * @author Kevin Winter
 */
public class AddExperiment {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    // Replace with valid values of your account.
    long campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
    long adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
    long criterionId = Long.parseLong("INSERT_CRITERION_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, campaignId, adGroupId, criterionId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long campaignId, Long adGroupId,
      Long criterionId) throws Exception {
    // Get the ExperimentService.
    ExperimentServiceInterface experimentService =
        adWordsServices.get(session, ExperimentServiceInterface.class);

    // Get the AdGroupService.
    AdGroupServiceInterface adGroupService =
        adWordsServices.get(session, AdGroupServiceInterface.class);

    // Get the AdGroupCriterionService.
    AdGroupCriterionServiceInterface adGroupCriterionService =
        adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

    // Create experiment.
    Experiment experiment = new Experiment();
    experiment.setCampaignId(campaignId);
    experiment.setName("Interplanetary Experiment #" + System.currentTimeMillis());
    experiment.setQueryPercentage(10);
    experiment.setStartDateTime(new DateTime().plusDays(1).toString("yyyyMMdd HHmmss Z"));

    // You can optionally provide these field(s).
    experiment.setEndDateTime(new DateTime().plusDays(30).toString("yyyyMMdd HHmmss Z"));

    // Create operation.
    ExperimentOperation experimentOperation = new ExperimentOperation();
    experimentOperation.setOperand(experiment);
    experimentOperation.setOperator(Operator.ADD);

    // Add experiment.
    ExperimentReturnValue result =
        experimentService.mutate(new ExperimentOperation[] {experimentOperation});

    for (Experiment experimentResult : result.getValue()) {
      System.out.println("Experiment with name \"" + experimentResult.getName() + "\" and id \""
          + experimentResult.getId() + "\" was added.");
    }

    Long experimentId = result.getValue()[0].getId();

    // Set ad group for the experiment.
    AdGroup adGroup = new AdGroup();
    adGroup.setId(adGroupId);

    // Create experiment bid multiplier rule that will modify ad group bid for
    // the experiment.
    ManualCPCAdGroupExperimentBidMultipliers adGroupExperimentBidMultipliers =
        new ManualCPCAdGroupExperimentBidMultipliers();
    adGroupExperimentBidMultipliers.setMaxCpcMultiplier(new BidMultiplier(1.5, null));

    // Set experiment data to the ad group.
    AdGroupExperimentData adGroupExperimentData = new AdGroupExperimentData();
    adGroupExperimentData.setExperimentId(experimentId);
    adGroupExperimentData.setExperimentDeltaStatus(ExperimentDeltaStatus.MODIFIED);
    adGroupExperimentData.setExperimentBidMultipliers(adGroupExperimentBidMultipliers);
    adGroup.setExperimentData(adGroupExperimentData);

    // Create operation.
    AdGroupOperation adGroupOperation = new AdGroupOperation();
    adGroupOperation.setOperand(adGroup);
    adGroupOperation.setOperator(Operator.SET);

    // Update ad group.
    adGroup = adGroupService.mutate(new AdGroupOperation[] {adGroupOperation}).getValue()[0];

    System.out.println("Ad group with name \"" + adGroup.getName() + "\" and id \""
        + adGroup.getId() + "\" was updated for the experiment.");

    // Set ad group criterion for the experiment.
    BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();
    adGroupCriterion.setCriterion(new Criterion(criterionId, null, null));
    adGroupCriterion.setAdGroupId(adGroupId);

    // Create experiment bid multiplier rule that will modify ad group bid for
    // the experiment.
    ManualCPCAdGroupCriterionExperimentBidMultiplier adGroupCriterionExperimentBidMultiplier =
        new ManualCPCAdGroupCriterionExperimentBidMultiplier();
    adGroupCriterionExperimentBidMultiplier.setMaxCpcMultiplier(new BidMultiplier(1.5, null));

    // Set experiment data to the ad group.
    BiddableAdGroupCriterionExperimentData adGroupCriterionExperimentData =
        new BiddableAdGroupCriterionExperimentData();
    adGroupCriterionExperimentData.setExperimentId(experimentId);
    adGroupCriterionExperimentData.setExperimentDeltaStatus(ExperimentDeltaStatus.MODIFIED);
    adGroupCriterionExperimentData
        .setExperimentBidMultiplier(adGroupCriterionExperimentBidMultiplier);
    adGroupCriterion.setExperimentData(adGroupCriterionExperimentData);

    // Create operation.
    AdGroupCriterionOperation adGroupCriterionOperation = new AdGroupCriterionOperation();
    adGroupCriterionOperation.setOperand(adGroupCriterion);
    adGroupCriterionOperation.setOperator(Operator.SET);

    // Update ad group criterion.
    adGroupCriterion =
        (BiddableAdGroupCriterion) adGroupCriterionService.mutate(
            new AdGroupCriterionOperation[] {adGroupCriterionOperation}).getValue()[0];

    System.out.println("Ad group criterion with ad group id \"" + adGroupCriterion.getAdGroupId()
        + "\" and criterion id \"" + adGroupCriterion.getCriterion().getId()
        + "\" was updated for the experiment.");
  }
}
