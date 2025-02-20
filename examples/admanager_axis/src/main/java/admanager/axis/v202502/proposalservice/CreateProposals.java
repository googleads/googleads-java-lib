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

package admanager.axis.v202502.proposalservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.v202502.ApiError;
import com.google.api.ads.admanager.axis.v202502.ApiException;
import com.google.api.ads.admanager.axis.v202502.Proposal;
import com.google.api.ads.admanager.axis.v202502.ProposalMarketplaceInfo;
import com.google.api.ads.admanager.axis.v202502.ProposalServiceInterface;
import com.google.api.ads.admanager.axis.v202502.SalespersonSplit;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.admanager.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.Random;

/**
 * This example creates a proposal.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class CreateProposals {

  private static class CreateProposalsParams extends CodeSampleParams {
    @Parameter(
        names = ArgumentNames.PRIMARY_SALESPERSON_ID,
        required = true,
        description = "The ID of the primary salesperson.")
    private Long primarySalespersonId;

    @Parameter(
        names = ArgumentNames.PRIMARY_TRAFFICKER_ID,
        required = true,
        description = "The ID of the primary trafficker.")
    private Long primaryTraffickerId;

    @Parameter(
        names = ArgumentNames.PROGRAMMATIC_BUYER_ID,
        required = true,
        description =
            "The ID of the programmatic buyer. This can be obtained through the"
                + " Programmatic_Buyer PQL table.")
    private Long programmaticBuyerId;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param primarySalespersonId the ID of the primary salesperson.
   * @param primaryTraffickerId the ID of the primary trafficker.
   * @param programmaticBuyerId the ID of the programmatic buyer. This can be obtained through the
   *     Programmatic_Buyer PQL table.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdManagerServices adManagerServices,
      AdManagerSession session,
      long primarySalespersonId,
      long primaryTraffickerId,
      long programmaticBuyerId)
      throws RemoteException {
    ProposalServiceInterface proposalService =
        adManagerServices.get(session, ProposalServiceInterface.class);
    Proposal proposal = new Proposal();

    // Setting required Marketplace information.
    ProposalMarketplaceInfo proposalMarketplaceInfo = new ProposalMarketplaceInfo();
    proposalMarketplaceInfo.setBuyerAccountId(programmaticBuyerId);

    // Set common required fields for a proposal.
    proposal.setName("Proposal #" + new Random().nextInt(Integer.MAX_VALUE));
    proposal.setPrimaryTraffickerId(primaryTraffickerId);
    proposal.setMarketplaceInfo(proposalMarketplaceInfo);

    SalespersonSplit primarySalesperson = new SalespersonSplit();
    primarySalesperson.setUserId(primarySalespersonId);
    proposal.setPrimarySalesperson(primarySalesperson);

    // Create the proposal on the server.
    Proposal[] proposals = proposalService.createProposals(new Proposal[] {proposal});

    for (Proposal createdProposal : proposals) {
      System.out.printf(
          "A proposal with ID %d and name '%s' " + "was created.%n",
          createdProposal.getId(), createdProposal.getName());
    }
  }

  public static void main(String[] args) {
    AdManagerSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.AD_MANAGER)
              .fromFile()
              .build()
              .generateCredential();

      // Construct a AdManagerSession.
      session =
          new AdManagerSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
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

    AdManagerServices adManagerServices = new AdManagerServices();

    CreateProposalsParams params = new CreateProposalsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.primarySalespersonId = Long.parseLong("INSERT_PRIMARY_SALESPERSON_ID_HERE");
      params.primaryTraffickerId = Long.parseLong("INSERT_PRIMARY_TRAFFICKER_ID_HERE");
      params.programmaticBuyerId = Long.parseLong("INSERT_PROGRAMMATIC_BUYER_ID_HERE");
    }

    try {
      runExample(
          adManagerServices,
          session,
          params.primarySalespersonId,
          params.primaryTraffickerId,
          params.programmaticBuyerId);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the admanager.axis
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
