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

package dfp.axis.v201802.workflowrequestservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201802.StatementBuilder;
import com.google.api.ads.dfp.axis.v201802.ApiError;
import com.google.api.ads.dfp.axis.v201802.ApiException;
import com.google.api.ads.dfp.axis.v201802.UpdateResult;
import com.google.api.ads.dfp.axis.v201802.WorkflowEntityType;
import com.google.api.ads.dfp.axis.v201802.WorkflowEvaluationStatus;
import com.google.api.ads.dfp.axis.v201802.WorkflowRequest;
import com.google.api.ads.dfp.axis.v201802.WorkflowRequestPage;
import com.google.api.ads.dfp.axis.v201802.WorkflowRequestServiceInterface;
import com.google.api.ads.dfp.axis.v201802.WorkflowRequestType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example triggers all workflow external condition requests belonging to a
 * specific proposal. Workflow external condition requests must be triggered or skipped
 * for a workflow to finish. To determine which proposals exist, run GetAllProposals.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class TriggerWorkflowExternalConditionRequests {

  private static class TriggerWorkflowExternalConditionRequestsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.PROPOSAL_ID, required = true,
        description = "The ID of the proposal to trigger workflow external conditions for.")
    private Long proposalId;
  }

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @param proposalId the ID of the proposal to trigger workflow external conditions for.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(DfpServices dfpServices, DfpSession session, long proposalId)
      throws RemoteException {
    // Get the WorkflowRequestService.
    WorkflowRequestServiceInterface workflowRequestService =
        dfpServices.get(session, WorkflowRequestServiceInterface.class);

    // Create a statement to select workflow external condition requests for a proposal.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE entityId = :entityId and entityType = :entityType "
            + "and type = :type and conditionStatus = :conditionStatus")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("entityId", proposalId)
        .withBindVariableValue("entityType", WorkflowEntityType.PROPOSAL.toString())
        .withBindVariableValue("conditionStatus",
            WorkflowEvaluationStatus.PENDING.toString())
        .withBindVariableValue("type",
            WorkflowRequestType.WORKFLOW_EXTERNAL_CONDITION_REQUEST.toString());

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get workflow requests by statement.
      WorkflowRequestPage page = workflowRequestService.getWorkflowRequestsByStatement(
          statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (WorkflowRequest workflowRequest : page.getResults()) {
          System.out.printf("%d) Workflow external condition request with ID %d "
              + "for '%s' with ID %d will be triggered.%n",
              i++, workflowRequest.getId(), workflowRequest.getEntityType(),
              workflowRequest.getEntityId());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of workflow external condition requests to be triggered: %d%n",
        totalResultSetSize);

    if (totalResultSetSize > 0) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      com.google.api.ads.dfp.axis.v201802.TriggerWorkflowExternalConditionRequests action =
          new com.google.api.ads.dfp.axis.v201802.TriggerWorkflowExternalConditionRequests();

      // Perform action.
      UpdateResult result =
          workflowRequestService.performWorkflowRequestAction(
              action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.printf("Number of workflow external condition requests triggered: %d%n",
            result.getNumChanges());
      } else {
        System.out.println("No workflow external condition requests were triggered.");
      }
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

    TriggerWorkflowExternalConditionRequestsParams params =
        new TriggerWorkflowExternalConditionRequestsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.proposalId = Long.parseLong("INSERT_PROPOSAL_ID_HERE");
    }

    try {
      runExample(dfpServices, session, params.proposalId);
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
