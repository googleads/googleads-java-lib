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

package dfp.axis.v201602.proposallineitemservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201602.StatementBuilder;
import com.google.api.ads.dfp.axis.v201602.ProposalLineItem;
import com.google.api.ads.dfp.axis.v201602.ProposalLineItemPage;
import com.google.api.ads.dfp.axis.v201602.ProposalLineItemServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;

import java.util.Arrays;

/**
 * This example updates a proposal line item's notes. To determine
 * which proposal line items exist, run GetAllProposalLineItems.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateProposalLineItems {

  // Set the ID of the proposal line item to update.
  private static final String PROPOSAL_LINE_ITEM_ID = "INSERT_PROPOSAL_LINE_ITEM_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long proposalLineItemId) throws Exception {
    // Get the ProposalLineItemService.
    ProposalLineItemServiceInterface proposalLineItemService =
        dfpServices.get(session, ProposalLineItemServiceInterface.class);

    // Create a statement to select a proposal line item.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE id = :id")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("id", proposalLineItemId);

    // Get the proposal line item.
    ProposalLineItemPage page =
        proposalLineItemService.getProposalLineItemsByStatement(statementBuilder.toStatement());

    ProposalLineItem proposalLineItem = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update the proposal line item's note field.
    proposalLineItem.setNotes("Proposal line item ready for submission.");

    // Update the proposal line item on the server.
    ProposalLineItem[] proposalLineItems = proposalLineItemService.updateProposalLineItems(
        new ProposalLineItem[] {proposalLineItem});

    for (ProposalLineItem updatedProposalLineItem : proposalLineItems) {
      System.out.printf(
          "Proposal line item with ID %d and name '%s' was updated.%n",
          updatedProposalLineItem.getId(), updatedProposalLineItem.getName());
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

    runExample(dfpServices, session, Long.parseLong(PROPOSAL_LINE_ITEM_ID));
  }
}
