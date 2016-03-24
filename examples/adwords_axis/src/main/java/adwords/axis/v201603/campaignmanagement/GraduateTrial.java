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

package adwords.axis.v201603.campaignmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201603.cm.Budget;
import com.google.api.ads.adwords.axis.v201603.cm.BudgetBudgetDeliveryMethod;
import com.google.api.ads.adwords.axis.v201603.cm.BudgetOperation;
import com.google.api.ads.adwords.axis.v201603.cm.BudgetServiceInterface;
import com.google.api.ads.adwords.axis.v201603.cm.Money;
import com.google.api.ads.adwords.axis.v201603.cm.Operator;
import com.google.api.ads.adwords.axis.v201603.cm.Trial;
import com.google.api.ads.adwords.axis.v201603.cm.TrialOperation;
import com.google.api.ads.adwords.axis.v201603.cm.TrialServiceInterface;
import com.google.api.ads.adwords.axis.v201603.cm.TrialStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example illustrates how to graduate a trial.
 * 
 * <p>See the Campaign Drafts and Experiments guide for more information:
 * https://developers.google.com/adwords/api/docs/guides/campaign-drafts-experiments
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GraduateTrial {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
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
    long trialId = Long.parseLong("INSERT_TRIAL_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, trialId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, long trialId) throws Exception {
    // Get the TrialService and BudgetService.
    TrialServiceInterface trialService = adWordsServices.get(session, TrialServiceInterface.class);
    BudgetServiceInterface budgetService =
        adWordsServices.get(session, BudgetServiceInterface.class);

    // To graduate a trial, you must specify a different budget from the base campaign. The base
    // campaign (in order to have had a trial based on it) must have a non-shared budget, so it
    // cannot be shared with the new independent campaign created by graduation.
    Budget budget = new Budget();
    budget.setName("Budget #" + System.currentTimeMillis());
    Money budgetAmount = new Money();
    budgetAmount.setMicroAmount(50000000L);
    budget.setAmount(budgetAmount);
    budget.setDeliveryMethod(BudgetBudgetDeliveryMethod.STANDARD);

    BudgetOperation budgetOperation = new BudgetOperation();
    budgetOperation.setOperator(Operator.ADD);
    budgetOperation.setOperand(budget);

    // Add budget.
    long budgetId =
        budgetService.mutate(new BudgetOperation[] {budgetOperation}).getValue(0).getBudgetId();

    Trial trial = new Trial();
    trial.setId(trialId);
    trial.setBudgetId(budgetId);
    trial.setStatus(TrialStatus.GRADUATED);

    TrialOperation trialOperation = new TrialOperation();
    trialOperation.setOperator(Operator.SET);
    trialOperation.setOperand(trial);

    // Update the trial.
    trial = trialService.mutate(new TrialOperation[] {trialOperation}).getValue(0);

    // Graduation is a synchronous operation, so the campaign is already ready. If you promote
    // instead, make sure to see the polling scheme demonstrated in AddTrial.java to wait for the
    // asynchronous operation to finish.
    System.out.printf(
        "Trial ID %d graduated. Campaign ID %d was given a new budget ID %d and "
            + "is no longer dependent on this trial.%n",
        trial.getId(),
        trial.getTrialCampaignId(),
        budgetId);
  }
}
