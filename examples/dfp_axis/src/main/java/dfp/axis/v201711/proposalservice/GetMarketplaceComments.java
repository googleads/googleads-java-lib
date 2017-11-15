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

package dfp.axis.v201711.proposalservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201711.DateTimes;
import com.google.api.ads.dfp.axis.utils.v201711.StatementBuilder;
import com.google.api.ads.dfp.axis.v201711.MarketplaceComment;
import com.google.api.ads.dfp.axis.v201711.MarketplaceCommentPage;
import com.google.api.ads.dfp.axis.v201711.ProposalServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets the Marketplace comments for a programmatic proposal.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetMarketplaceComments {

  private static class GetMarketplaceCommentsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.PROPOSAL_ID, required = true)
    private Long proposalId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long proposalId)
      throws Exception {
    ProposalServiceInterface proposalService =
        dfpServices.get(session, ProposalServiceInterface.class);

    // Create a statement to select marketplace comments.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("proposalId = :proposalId")
        .withBindVariableValue("proposalId", proposalId);

    MarketplaceCommentPage page =
        proposalService.getMarketplaceCommentsByStatement(statementBuilder.toStatement());

    if (page.getResults() != null) {
      // Print out some information for each marketplace comment.
      int i = page.getStartIndex();
      for (MarketplaceComment marketplaceComment : page.getResults()) {
        System.out.printf(
            "%d) Marketplace comment with creation time '%s' and comment '%s' was found.%n",
            i++,
            DateTimes.toString(marketplaceComment.getCreationTime()),
            marketplaceComment.getComment()
        );
      }
    } else {
      System.out.println("No marketplace comments found.");
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential for authentication.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an API session configured from a properties file and the OAuth2
    // credentials above.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    GetMarketplaceCommentsParams params = new GetMarketplaceCommentsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.proposalId = Long.parseLong("INSERT_PROPOSAL_ID_HERE");
    }

    runExample(dfpServices, session, params.proposalId);
  }
}
