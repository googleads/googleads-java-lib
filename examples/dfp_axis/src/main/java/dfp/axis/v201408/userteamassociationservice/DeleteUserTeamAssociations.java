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

package dfp.axis.v201408.userteamassociationservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201408.StatementBuilder;
import com.google.api.ads.dfp.axis.v201408.UpdateResult;
import com.google.api.ads.dfp.axis.v201408.UserTeamAssociation;
import com.google.api.ads.dfp.axis.v201408.UserTeamAssociationPage;
import com.google.api.ads.dfp.axis.v201408.UserTeamAssociationServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example deletes all user team associations for a given user (i.e.
 * removes the user from all teams). To determine which
 * user team associations exist, run GetAllUserTeamAssociations.java. To
 * determine which users exist, run GetAllUsers.java
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: UserTeamAssociationService.getUserTeamAssociationsByStatement
 * Tags: UserTeamAssociationService.performUserTeamAssociationAction
 *
 * @author Adam Rogal
 */
public class DeleteUserTeamAssociations {

  // Set the ID of the user to delete user team associations for.
  private static final String USER_ID = "INSERT_USER_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long userId)
      throws Exception {
    // Get the UserTeamAssociationService.
    UserTeamAssociationServiceInterface userTeamAssociationService =
        dfpServices.get(session, UserTeamAssociationServiceInterface.class);

    // Create a statement to get all user team associations for a user.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE userId = :userId ")
        .orderBy("userId ASC, teamid ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("userId", userId);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get user team associations by statement.
      UserTeamAssociationPage page = userTeamAssociationService.getUserTeamAssociationsByStatement(
          statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (UserTeamAssociation userTeamAssociation : page.getResults()) {
          System.out.printf("%d) User team association with user ID \"%d\" and "
              + "team ID \"%d\" will be deleted.\n", i++, userTeamAssociation.getUserId(),
              userTeamAssociation.getTeamId());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of user team associations to be deleted: %d\n", totalResultSetSize);

    if (totalResultSetSize > 0) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      com.google.api.ads.dfp.axis.v201408.DeleteUserTeamAssociations action =
          new com.google.api.ads.dfp.axis.v201408.DeleteUserTeamAssociations();

      // Perform action.
      UpdateResult result = userTeamAssociationService.performUserTeamAssociationAction(
          action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.printf("Number of user team associations deleted: %d\n",
            result.getNumChanges());
      } else {
        System.out.println("No user team associations were deleted.");
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

    runExample(dfpServices, session, Long.parseLong(USER_ID));
  }
}
