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

package dfp.axis.v201711.proposalservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201711.ApiError;
import com.google.api.ads.dfp.axis.v201711.ApiException;
import com.google.api.ads.dfp.axis.v201711.BillingCap;
import com.google.api.ads.dfp.axis.v201711.BillingSource;
import com.google.api.ads.dfp.axis.v201711.Money;
import com.google.api.ads.dfp.axis.v201711.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201711.Proposal;
import com.google.api.ads.dfp.axis.v201711.ProposalCompanyAssociation;
import com.google.api.ads.dfp.axis.v201711.ProposalCompanyAssociationType;
import com.google.api.ads.dfp.axis.v201711.ProposalServiceInterface;
import com.google.api.ads.dfp.axis.v201711.SalespersonSplit;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.Random;

/**
 * This example creates a proposal.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateProposals {

  private static class CreateProposalsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.ADVERTISER_ID, required = true,
        description = "The ID of the advertiser that the proposal will belong to.")
    private Long advertiserId;

    @Parameter(names = ArgumentNames.PRIMARY_SALESPERSON_ID, required = true,
        description = "The ID of the primary salesperson.")
    private Long primarySalespersonId;

    @Parameter(names = ArgumentNames.SECONDARY_SALESPERSON_ID, required = true,
        description = "The ID of the secondary salesperson.")
    private Long secondarySalespersonId;

    @Parameter(names = ArgumentNames.PRIMARY_TRAFFICKER_ID, required = true,
        description = "The ID of the primary trafficker.")
    private Long primaryTraffickerId;
  }

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @param advertiserId the ID of the advertiser that the proposal will belong to.
   * @param primarySalespersonId the ID of the primary salesperson.
   * @param secondarySalespersonId the ID of the secondary salesperson.
   * @param primaryTraffickerId the ID of the primary trafficker.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      DfpServices dfpServices,
      DfpSession session,
      long advertiserId,
      long primarySalespersonId,
      long secondarySalespersonId,
      long primaryTraffickerId)
      throws RemoteException {
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
      System.out.printf("A proposal with ID %d and name '%s' was created.%n",
          createdProposal.getId(), createdProposal.getName());
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

    CreateProposalsParams params = new CreateProposalsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.advertiserId = Long.parseLong("INSERT_ADVERTISER_ID_HERE");
      params.primarySalespersonId = Long.parseLong("INSERT_PRIMARY_SALESPERSON_ID_HERE");
      params.secondarySalespersonId = Long.parseLong("INSERT_SECONDARY_SALESPERSON_ID_HERE");
      params.primaryTraffickerId = Long.parseLong("INSERT_PRIMARY_TRAFFICKER_ID_HERE");
    }

    try {
      runExample(dfpServices, session, params.advertiserId, params.primarySalespersonId,
          params.secondarySalespersonId, params.primaryTraffickerId);
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
