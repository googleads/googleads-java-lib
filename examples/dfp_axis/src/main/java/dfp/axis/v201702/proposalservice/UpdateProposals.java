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

package dfp.axis.v201702.proposalservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201702.StatementBuilder;
import com.google.api.ads.dfp.axis.v201702.Proposal;
import com.google.api.ads.dfp.axis.v201702.ProposalPage;
import com.google.api.ads.dfp.axis.v201702.ProposalServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example updates a proposal's notes. To determine which proposals exist, run
 * GetAllProposals.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateProposals {
  
  // Set the ID of the proposal to update.
  private static final String PROPOSAL_ID = "INSERT_PROPOSAL_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long proposalId)
      throws Exception {
    // Get the ProposalService.
    ProposalServiceInterface proposalService =
        dfpServices.get(session, ProposalServiceInterface.class);

    // Create a statement to only select a single proposal by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", proposalId);

    // Get the proposal.
    ProposalPage page =
        proposalService.getProposalsByStatement(statementBuilder.toStatement());

    Proposal proposal = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update the proposal's notes.
    proposal.setInternalNotes("Proposal needs further review before approval.");

    // Update the proposal on the server.
    Proposal[] proposals = proposalService.updateProposals(new Proposal[] {proposal});

    for (Proposal updatedProposal : proposals) {
      System.out.printf("Proposal with ID %d and name '%s' was updated.%n",
          updatedProposal.getId(),
          updatedProposal.getName());
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
