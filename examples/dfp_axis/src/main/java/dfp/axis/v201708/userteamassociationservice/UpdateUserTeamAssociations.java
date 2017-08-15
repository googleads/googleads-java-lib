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

package dfp.axis.v201708.userteamassociationservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.TeamAccessType;
import com.google.api.ads.dfp.axis.v201708.UserTeamAssociation;
import com.google.api.ads.dfp.axis.v201708.UserTeamAssociationPage;
import com.google.api.ads.dfp.axis.v201708.UserTeamAssociationServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
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
 */
public class UpdateUserTeamAssociations {

  private static class UpdateUserTeamAssociationsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.USER_ID, required = true,
        description = "The user ID of the user team association to update.")
    private Long userId;

    @Parameter(names = ArgumentNames.TEAM_ID, required = true,
        description = "The team ID of the user team association to update.")
    private Long teamId;
  }

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
          "User team association with user ID %d and team ID %d was updated.%n",
          updatedUserTeamAssociation.getUserId(), updatedUserTeamAssociation.getTeamId());
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

    UpdateUserTeamAssociationsParams params = new UpdateUserTeamAssociationsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.userId = Long.parseLong("INSERT_USER_ID_HERE");
      params.teamId = Long.parseLong("INSERT_TEAM_ID_HERE");
    }

    runExample(dfpServices, session, params.userId, params.teamId);
  }
}
