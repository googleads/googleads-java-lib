// Copyright 2017 Google Inc. All Rights Reserved.
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

package adwords.axis.v201710.campaignmanagement;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201710.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.Operator;
import com.google.api.ads.adwords.axis.v201710.cm.Selector;
import com.google.api.ads.adwords.axis.v201710.cm.Trial;
import com.google.api.ads.adwords.axis.v201710.cm.TrialAsyncError;
import com.google.api.ads.adwords.axis.v201710.cm.TrialAsyncErrorPage;
import com.google.api.ads.adwords.axis.v201710.cm.TrialAsyncErrorServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.TrialOperation;
import com.google.api.ads.adwords.axis.v201710.cm.TrialServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.TrialStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201710.cm.TrialAsyncErrorField;
import com.google.api.ads.adwords.lib.selectorfields.v201710.cm.TrialField;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example illustrates how to create a trial and wait for it to complete.
 *
 * <p>See the Campaign Drafts and Experiments guide for more information:
 * https://developers.google.com/adwords/api/docs/guides/campaign-drafts-experiments
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddTrial {

  /**
   * Maximum number of {@code TrialService.get} calls to make to query the progress of trial
   * creation.
   */
  private static final int MAX_POLL_ATTEMPTS = 6;

  private static class AddTrialParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.DRAFT_ID, required = true)
    private Long draftId;

    @Parameter(names = ArgumentNames.BASE_CAMPAIGN_ID, required = true)
    private Long baseCampaignId;
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

    AddTrialParams params = new AddTrialParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.draftId = Long.parseLong("INSERT_DRAFT_ID_HERE");
      params.baseCampaignId = Long.parseLong("INSERT_BASE_CAMPAIGN_ID_HERE");
    }

    try {
      runExample(adWordsServices, session, params.draftId, params.baseCampaignId);
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
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    } catch (InterruptedException ie) {
      System.err.printf("Thread was interrupted: %s%n", ie);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @param draftId the ID of the draft.
   * @param baseCampaignId the ID of the base campaign.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   * @throws InterruptedException
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      long draftId,
      long baseCampaignId)
      throws RemoteException, InterruptedException {
    // Get the TrialService.
    TrialServiceInterface trialService = adWordsServices.get(session, TrialServiceInterface.class);

    Trial trial = new Trial();
    trial.setDraftId(draftId);
    trial.setBaseCampaignId(baseCampaignId);
    trial.setName("Test Trial #" + System.currentTimeMillis());
    trial.setTrafficSplitPercent(50);

    TrialOperation trialOperation = new TrialOperation();
    trialOperation.setOperator(Operator.ADD);
    trialOperation.setOperand(trial);

    long trialId = trialService.mutate(new TrialOperation[] {trialOperation}).getValue(0).getId();

    // Since creating a trial is asynchronous, we have to poll it to wait for it to finish.
    Selector trialSelector =
        new SelectorBuilder()
            .fields(
                TrialField.Id,
                TrialField.Status,
                TrialField.BaseCampaignId,
                TrialField.TrialCampaignId)
            .equalsId(trialId)
            .build();

    trial = null;
    boolean isPending = true;
    int pollAttempts = 0;
    do {
      long sleepSeconds = (long) Math.scalb(30d, pollAttempts);
      System.out.printf("Sleeping for %d seconds.%n", sleepSeconds);
      Thread.sleep(sleepSeconds * 1000);
      trial = trialService.get(trialSelector).getEntries(0);

      System.out.printf("Trial ID %d has status '%s'.%n", trial.getId(), trial.getStatus());
      pollAttempts++;
      isPending = TrialStatus.CREATING.equals(trial.getStatus());
    } while (isPending && pollAttempts < MAX_POLL_ATTEMPTS);

    if (TrialStatus.ACTIVE.equals(trial.getStatus())) {
      // The trial creation was successful.
      System.out.printf(
          "Trial created with ID %d and trial campaign ID %d.%n",
          trial.getId(),
          trial.getTrialCampaignId());
    } else if (TrialStatus.CREATION_FAILED.equals(trial.getStatus())) {
      // The trial creation failed, and errors can be fetched from the TrialAsyncErrorService.
      Selector errorsSelector =
          new SelectorBuilder()
              .fields(TrialAsyncErrorField.TrialId, TrialAsyncErrorField.AsyncError)
              .equals(TrialAsyncErrorField.TrialId, trial.getId().toString())
              .build();

      TrialAsyncErrorServiceInterface trialAsyncErrorService =
          adWordsServices.get(session, TrialAsyncErrorServiceInterface.class);
      TrialAsyncErrorPage trialAsyncErrorPage = trialAsyncErrorService.get(errorsSelector);
      if (trialAsyncErrorPage.getEntries() == null
          || trialAsyncErrorPage.getEntries().length == 0) {
        System.out.printf(
            "Could not retrieve errors for trial ID %d for draft ID %d.%n", trial.getId(), draftId);
      } else {
        System.out.printf(
            "Could not create trial ID %d for draft ID %d due to the following errors:%n",
            trial.getId(),
            draftId);
        int i = 0;
        for (TrialAsyncError error : trialAsyncErrorPage.getEntries()) {
          ApiError asyncError = error.getAsyncError();
          System.out.printf(
              "Error #%d: errorType='%s', errorString='%s', trigger='%s', fieldPath='%s'%n",
              i++,
              asyncError.getApiErrorType(),
              asyncError.getErrorString(),
              asyncError.getTrigger(),
              asyncError.getFieldPath());
        }
      }
    } else {
      // Most likely, the trial is still being created. You can continue polling,
      // but we have limited the number of attempts in the example.
      System.out.printf(
          "Timed out waiting to create trial from draft ID %d with base campaign ID %d.%n",
          draftId,
          baseCampaignId);
    }
  }
}
