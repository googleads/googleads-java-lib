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
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignCriterion;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignCriterionOperation;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.Draft;
import com.google.api.ads.adwords.axis.v201710.cm.DraftOperation;
import com.google.api.ads.adwords.axis.v201710.cm.DraftServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.Language;
import com.google.api.ads.adwords.axis.v201710.cm.Operator;
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

/**
 * This example illustrates how to create a draft and access its associated draft campaign.
 *
 * <p>See the Campaign Drafts and Experiments guide for more information:
 * https://developers.google.com/adwords/api/docs/guides/campaign-drafts-experiments
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddDraft {

  private static class AddDraftParams extends CodeSampleParams {
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

    AddDraftParams params = new AddDraftParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.baseCampaignId = Long.parseLong("INSERT_BASE_CAMPAIGN_ID_HERE");
    }

    try {
      runExample(adWordsServices, session, params.baseCampaignId);
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
   * @param baseCampaignId the base campaign ID for the draft.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, long baseCampaignId)
      throws RemoteException {

    // Get the DraftService.
    DraftServiceInterface draftService = adWordsServices.get(session, DraftServiceInterface.class);
    Draft draft = new Draft();
    draft.setBaseCampaignId(baseCampaignId);
    draft.setDraftName("Test Draft #" + System.currentTimeMillis());

    DraftOperation draftOperation = new DraftOperation();
    draftOperation.setOperator(Operator.ADD);
    draftOperation.setOperand(draft);

    draft = draftService.mutate(new DraftOperation[] {draftOperation}).getValue(0);

    System.out.printf(
        "Draft with ID %d and base campaign ID %d and draft campaign ID %d created.%n",
        draft.getDraftId(), draft.getBaseCampaignId(), draft.getDraftCampaignId());

    // Once the draft is created, you can modify the draft campaign as if it
    // were a real campaign. For example, you may add criteria, adjust bids,
    // or even include additional ads. Adding a criterion is shown here.
    CampaignCriterionServiceInterface campaignCriterionService =
        adWordsServices.get(session, CampaignCriterionServiceInterface.class);

    Language language = new Language();
    language.setId(1003L); // Spanish

    // Make sure to use the draftCampaignId when modifying the virtual draft campaign.
    CampaignCriterion campaignCriterion = new CampaignCriterion();
    campaignCriterion.setCampaignId(draft.getDraftCampaignId());
    campaignCriterion.setCriterion(language);

    CampaignCriterionOperation criterionOperation = new CampaignCriterionOperation();
    criterionOperation.setOperator(Operator.ADD);
    criterionOperation.setOperand(campaignCriterion);

    campaignCriterion =
        campaignCriterionService
            .mutate(new CampaignCriterionOperation[] {criterionOperation})
            .getValue(0);

    System.out.printf(
        "Draft updated to include criteria in draft campaign ID %d.%n", draft.getDraftCampaignId());
  }
}
