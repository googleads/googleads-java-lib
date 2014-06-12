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

package dfp.axis.v201405.userteamassociationservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201405.StatementBuilder;
import com.google.api.ads.dfp.axis.v201405.TeamAccessType;
import com.google.api.ads.dfp.axis.v201405.UserTeamAssociation;
import com.google.api.ads.dfp.axis.v201405.UserTeamAssociationPage;
import com.google.api.ads.dfp.axis.v201405.UserTeamAssociationServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;

import java.util.Arrays;

/**
 * This example updates the access of a user on a team. To determine which
 * user team associations exist, run GetAllUserTeamAssociations.java. To
 * determine which users exist, run GetAllUsers.java. To determine which teams
 * exist, run GetAllTeams.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: UserTeamAssociationService.getUserTeamAssociationsByStatement
 * Tags: UserTeamAssociationService.updateUserTeamAssociations
 *
 * @author Adam Rogal
 */
public class UpdateUserTeamAssociations {

  // Set the user ID of the user team association to update.
  private static final String USER_ID = "INSERT_USER_ID_HERE";

  // Set the team ID of the user team association to update.
  private static final String TEAM_ID = "INSERT_TEAM_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long userId,
      long teamId) throws Exception {
    // Get the UserTeamAssociationService.
    UserTeamAssociationServiceInterface userTeamAssociationService =
        dfpServices.get(session, UserTeamAssociationServiceInterface.class);

    // Create a statement to only select a single user team association by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("userId = :userId AND teamId = :teamId")
        .orderBy("userId, teamId ASC")
        .limit(1)
        .withBindVariableValue("userId", userId)
        .withBindVariableValue("teamId", teamId);

    // Get the user team association.
    UserTeamAssociationPage page = userTeamAssociationService
        .getUserTeamAssociationsByStatement(statementBuilder.toStatement());

    UserTeamAssociation userTeamAssociation =
        Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update the user's access type on the team.
    userTeamAssociation.setOverriddenTeamAccessType(TeamAccessType.READ_ONLY);

    // Update the user team associations on the server.
    UserTeamAssociation[] userTeamAssociations = userTeamAssociationService
        .updateUserTeamAssociations(new UserTeamAssociation[] {userTeamAssociation});

    for (UserTeamAssociation updatedUserTeamAssociation : userTeamAssociations) {
      System.out.printf(
          "User team association with user ID \"%d\" and team ID \"%d\" was updated.\n",
          updatedUserTeamAssociation.getUserId(), updatedUserTeamAssociation.getTeamId());
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

    runExample(dfpServices, session, Long.parseLong(USER_ID), Long.parseLong(TEAM_ID));
  }
}
