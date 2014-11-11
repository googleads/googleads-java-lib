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

package dfp.axis.v201411.proposalservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201411.BillingCap;
import com.google.api.ads.dfp.axis.v201411.BillingSource;
import com.google.api.ads.dfp.axis.v201411.Money;
import com.google.api.ads.dfp.axis.v201411.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201411.Proposal;
import com.google.api.ads.dfp.axis.v201411.ProposalCompanyAssociation;
import com.google.api.ads.dfp.axis.v201411.ProposalCompanyAssociationType;
import com.google.api.ads.dfp.axis.v201411.ProposalServiceInterface;
import com.google.api.ads.dfp.axis.v201411.SalespersonSplit;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Random;

/**
 * This example creates a proposal.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: ProposalService.createProposals
 *
 * @author Nicholas Chen
 */
public class CreateProposals {

  // Set the ID of the advertiser that the proposal will belong to.
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_ID_HERE";

  // Set the ID of the primary salesperson.
  private static final String PRIMARY_SALESPERSON_ID = "INSERT_PRIMARY_SALESPERSON_ID_HERE";

  // Set the ID of the secondary salesperson.
  private static final String SECONDARY_SALESPERSON_ID = "INSERT_SECONDARY_SALESPERSON_ID_HERE";

  // Set the ID of the primary trafficker.
  private static final String PRIMARY_TRAFFICKER_ID = "INSERT_PRIMARY_TRAFFICKER_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long advertiserId, long primarySalespersonId, long secondarySalespersonId,
      long primaryTraffickerId) throws Exception {
    // Get the ProposalService.
    ProposalServiceInterface proposalService =
        dfpServices.get(session, ProposalServiceInterface.class);

    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(session, NetworkServiceInterface.class);

    // Create a proposal.
    Proposal proposal = new Proposal();
    proposal.setName("Proposal #" + new Random().nextInt(Integer.MAX_VALUE));

    // Create a proposal company association.
    ProposalCompanyAssociation proposalCompanyAssociation = new ProposalCompanyAssociation();
    proposalCompanyAssociation.setCompanyId(advertiserId);
    proposalCompanyAssociation.setType(ProposalCompanyAssociationType.ADVERTISER);
    proposal.setAdvertiser(proposalCompanyAssociation);

    // Create salesperson splits for the primary salesperson and secondary salespeople.
    SalespersonSplit primarySalesperson = new SalespersonSplit();
    primarySalesperson.setUserId(primarySalespersonId);
    primarySalesperson.setSplit(75000);
    proposal.setPrimarySalesperson(primarySalesperson);

    SalespersonSplit secondarySalesperson = new SalespersonSplit();
    secondarySalesperson.setUserId(secondarySalespersonId);
    secondarySalesperson.setSplit(25000);
    proposal.setSecondarySalespeople(new SalespersonSplit[] {secondarySalesperson});

    // Set the probability to close to 100%.
    proposal.setProbabilityOfClose(100000L);

    // Set the primary trafficker on the proposal for when it becomes an order.
    proposal.setPrimaryTraffickerId(primaryTraffickerId);

    // Create a budget for the proposal worth 100 in the network local currency.
    Money budget = new Money();
    budget.setMicroAmount(100000000L);
    budget.setCurrencyCode(networkService.getCurrentNetwork().getCurrencyCode());
    proposal.setBudget(budget);

    proposal.setBillingCap(BillingCap.CAPPED_CUMULATIVE);
    proposal.setBillingSource(BillingSource.DFP_VOLUME);

    // Create the proposal on the server.
    Proposal[] proposals = proposalService.createProposals(new Proposal[] {proposal});

    for (Proposal createdProposal : proposals) {
      System.out.printf("A proposal with ID \"%d\" and name \"%s\" was created.%n",
          createdProposal.getId(), createdProposal.getName());
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

    runExample(dfpServices, session, Long.parseLong(ADVERTISER_ID),
        Long.parseLong(PRIMARY_SALESPERSON_ID), Long.parseLong(SECONDARY_SALESPERSON_ID),
        Long.parseLong(PRIMARY_TRAFFICKER_ID));
  }
}
