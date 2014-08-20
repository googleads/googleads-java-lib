// Copyright 2014 Google Inc. All Rights Reserved.
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

package dfp.axis.v201408.workflowrequestservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201408.StatementBuilder;
import com.google.api.ads.dfp.axis.v201408.UpdateResult;
import com.google.api.ads.dfp.axis.v201408.WorkflowEntityType;
import com.google.api.ads.dfp.axis.v201408.WorkflowRequest;
import com.google.api.ads.dfp.axis.v201408.WorkflowRequestPage;
import com.google.api.ads.dfp.axis.v201408.WorkflowRequestServiceInterface;
import com.google.api.ads.dfp.axis.v201408.WorkflowRequestType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example triggers all workflow external condition requests belonging to a
 * specific proposal. Workflow external condition requests must be triggered or skipped
 * for a workflow to finish. To determine which proposals exist, run GetAllProposals.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: WorkflowRequestService.getWorkflowRequestsByStatement
 * Tags: WorkflowRequestService.performWorkflowRequestAction
 *
 * @author Nicholas Chen
 */
public class TriggerWorkflowExternalConditionRequests {

  // Set the ID of the proposal to trigger workflow external conditions for.
  private static final String PROPOSAL_ID = "INSERT_PROPOSAL_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long proposalId)
      throws Exception {
    // Get the WorkflowRequestService.
    WorkflowRequestServiceInterface workflowRequestService =
        dfpServices.get(session, WorkflowRequestServiceInterface.class);

    // Create a statement to select workflow external condition requests for a proposal.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE entityId = :entityId and entityType = :entityType and type = :type")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("entityId", proposalId)
        .withBindVariableValue("entityType", WorkflowEntityType.PROPOSAL.toString())
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
          System.out.printf("%d) Workflow external condition request with ID \"%d\""
              + " for %s with ID \"%d\" will be triggered.%n",
              i++, workflowRequest.getId(), workflowRequest.getEntityType().toString(),
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
      com.google.api.ads.dfp.axis.v201408.TriggerWorkflowExternalConditionRequests action =
          new com.google.api.ads.dfp.axis.v201408.TriggerWorkflowExternalConditionRequests();

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

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session, Long.parseLong(PROPOSAL_ID));
  }
}
