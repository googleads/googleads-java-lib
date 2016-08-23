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

package dfp.axis.v201608.proposalservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201608.StatementBuilder;
import com.google.api.ads.dfp.axis.v201608.Proposal;
import com.google.api.ads.dfp.axis.v201608.ProposalPage;
import com.google.api.ads.dfp.axis.v201608.ProposalServiceInterface;
import com.google.api.ads.dfp.axis.v201608.UpdateResult;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example sends programmatic proposals to Marketplace to request buyer
 * acceptance.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class RequestBuyerAcceptance {

  private static final String PROPOSAL_ID = "INSERT_PROPOSAL_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long proposalId)
      throws Exception {
    // Get the ProposalService.
    ProposalServiceInterface proposalService =
        dfpServices.get(session, ProposalServiceInterface.class);

    // Create a statement to only select a single proposal by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE id = :id")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("id", proposalId);

    // Retrieve a small amount of proposals at a time, paging through until all
    // proposals have been retrieved.
    int totalResultSetSize = 0;
    do {
      ProposalPage page = proposalService.getProposalsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        // Print out some information for each proposal.
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (Proposal proposal : page.getResults()) {
          System.out.printf(
              "%d) Proposal with ID %d and name '%s' will be sent to Marketplace for buyer "
                  + "acceptance.%n",
              i++,
              proposal.getId(),
              proposal.getName()
          );
        }
      }
      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of proposals to be sent to Marketplace for buyer acceptance: %d%n",
        totalResultSetSize);

    if (totalResultSetSize > 0) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      com.google.api.ads.dfp.axis.v201608.RequestBuyerAcceptance action =
          new com.google.api.ads.dfp.axis.v201608.RequestBuyerAcceptance();

      // Perform action.
      UpdateResult result =
          proposalService.performProposalAction(action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.printf(
            "Number of proposals that were sent to Marketplace for buyer acceptance: %d%n",
            result.getNumChanges()
        );
      } else {
        System.out.println("No proposals were sent to Marketplace for buyer acceptance.");
      }
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
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
