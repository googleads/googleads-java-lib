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

package dfp.axis.v201705.proposalservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201705.Proposal;
import com.google.api.ads.dfp.axis.v201705.ProposalMarketplaceInfo;
import com.google.api.ads.dfp.axis.v201705.ProposalServiceInterface;
import com.google.api.ads.dfp.axis.v201705.SalespersonSplit;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import java.util.Random;

/**
 * This example creates a programmatic proposal for networks not using Sales Management.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateProgrammaticProposalsForNonSalesManagement {
 
  // Set the ID of the primary salesperson.
  private static final String PRIMARY_SALESPERSON_ID = "INSERT_PRIMARY_SALESPERSON_ID_HERE";
  
  // Set the ID of the primary trafficker.
  private static final String PRIMARY_TRAFFICKER_ID = "INSERT_PRIMARY_TRAFFICKER_ID_HERE";
  
  // Set the ID of the programmatic buyer. This can be obtained through the Programmatic_Buyer PQL
  // table.
  private static final String PROGRAMMATIC_BUYER_ID = "INSERT_PROGRAMMATIC_BUYER_ID_HERE";
  
  public static void runExample(DfpServices dfpServices, DfpSession session,
      long primarySalespersonId, long primaryTraffickerId, long programmaticBuyerId)
          throws Exception {
    ProposalServiceInterface proposalService =
        dfpServices.get(session, ProposalServiceInterface.class);
    
    Proposal proposal = new Proposal();
    
    // Setting required Marketplace information.
    ProposalMarketplaceInfo proposalMarketplaceInfo = new ProposalMarketplaceInfo();
    proposalMarketplaceInfo.setBuyerAccountId(programmaticBuyerId);
    
    // Set common required fields for a programmatic proposal.
    proposal.setName("Proposal #" + new Random().nextInt(Integer.MAX_VALUE));
    proposal.setIsProgrammatic(true);
    proposal.setPrimaryTraffickerId(primaryTraffickerId);
    proposal.setMarketplaceInfo(proposalMarketplaceInfo);
    SalespersonSplit primarySalesperson = new SalespersonSplit();
    primarySalesperson.setUserId(primarySalespersonId);
    primarySalesperson.setSplit(100000);
    proposal.setPrimarySalesperson(primarySalesperson);

    // Create the proposal on the server.
    Proposal[] proposals = proposalService.createProposals(new Proposal[] {proposal});
    
    for (Proposal createdProposal : proposals) {
      System.out.printf("A programmatic proposal for non-sales management with ID %d and name '%s' "
          + "was created.%n", createdProposal.getId(), createdProposal.getName());
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

    runExample(dfpServices, session, Long.parseLong(PRIMARY_SALESPERSON_ID),
        Long.parseLong(PRIMARY_TRAFFICKER_ID), Long.parseLong(PROGRAMMATIC_BUYER_ID));
  }
}
