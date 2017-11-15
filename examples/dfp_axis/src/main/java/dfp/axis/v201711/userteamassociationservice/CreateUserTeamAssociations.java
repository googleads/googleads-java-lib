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

package dfp.axis.v201711.userteamassociationservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201711.UserTeamAssociation;
import com.google.api.ads.dfp.axis.v201711.UserTeamAssociationServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a new user team association to add a user to that team.
 * To determine which user team associations exist, run
 * GetAllUserTeamAssociations.java. To determine which users exist,
 * run GetAllUsers.java. To determine which teams exist, run GetAllTeams.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateUserTeamAssociations {

  private static class CreateUserTeamAssociationsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.USER_ID, required = true,
        description = "The user ID of the user team association.")
    private Long userId;

    @Parameter(names = ArgumentNames.TEAM_ID, required = true,
        description = "The team ID of the user team association (i.e. what team the user will"
            + " be added to).")
    private Long teamId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long userId,
      long teamId) throws Exception {
    // Get the UserTeamAssociationService.
    UserTeamAssociationServiceInterface userTeamAssociationService =
        dfpServices.get(session, UserTeamAssociationServiceInterface.class);

    // Create a user team association.
    UserTeamAssociation userTeamAssociation = new UserTeamAssociation();
    userTeamAssociation.setUserId(userId);
    userTeamAssociation.setTeamId(teamId);

    // Create the user team association on the server.
    UserTeamAssociation[] userTeamAssociations =
        userTeamAssociationService.createUserTeamAssociations(
            new UserTeamAssociation[] {userTeamAssociation});

    for (UserTeamAssociation createdUserTeamAssociation : userTeamAssociations) {
      System.out.printf(
          "A user team association with user ID %d and team ID %d was created.%n",
          createdUserTeamAssociation.getUserId(), createdUserTeamAssociation.getTeamId());
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

    CreateUserTeamAssociationsParams params = new CreateUserTeamAssociationsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.userId = Long.parseLong("INSERT_USER_ID_HERE");
      params.teamId = Long.parseLong("INSERT_TEAM_ID_HERE");
    }

    runExample(dfpServices, session, params.userId, params.teamId);
  }
}
