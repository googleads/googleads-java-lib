// Copyright 2013 Google Inc. All Rights Reserved.
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

package dfp.axis.v201302.userteamassociationservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201302.StatementBuilder;
import com.google.api.ads.dfp.axis.v201302.UserTeamAssociation;
import com.google.api.ads.dfp.axis.v201302.UserTeamAssociationPage;
import com.google.api.ads.dfp.axis.v201302.UserTeamAssociationServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all user team associations. To create user team
 * associations, run CreateUserTeamAssociations.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: UserTeamAssociationService.getUserTeamAssociationsByStatement
 *
 * @author Adam Rogal
 */
public class GetAllUserTeamAssociations {

  public static void runExample(DfpServices dfpServices, DfpSession session)
      throws Exception {
    // Get the UserTeamAssociationService.
    UserTeamAssociationServiceInterface userTeamAssociationService =
        dfpServices.get(session, UserTeamAssociationServiceInterface.class);

    // Create a statement to select all user team associations.
    StatementBuilder statementBuilder = new StatementBuilder()
        .orderBy("teamId ASC, userId ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get user team associations by statement.
      UserTeamAssociationPage page =
          userTeamAssociationService.getUserTeamAssociationsByStatement(
              statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (UserTeamAssociation userTeamAssociation : page.getResults()) {
          System.out.printf(
              "%d) User team associations with team ID \"%d\" and user ID \"%d\" was found.\n", i++,
              userTeamAssociation.getTeamId(), userTeamAssociation.getUserId());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d\n", totalResultSetSize);
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

    runExample(dfpServices, session);
  }
}
