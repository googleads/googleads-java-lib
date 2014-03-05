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

package dfp.axis.v201403.userteamassociationservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201403.UserTeamAssociation;
import com.google.api.ads.dfp.axis.v201403.UserTeamAssociationServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a new user team association to add a user to that team.
 * To determine which user team associations exist, run
 * GetAllUserTeamAssociations.java. To determine which users exist,
 * run GetAllUsers.java. To determine which teams exist, run GetAllTeams.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: UserTeamService.createUserTeamAssociations
 *
 * @author Adam Rogal
 */
public class CreateUserTeamAssociations {

  // Set the user ID of the user team association.
  private static final String USER_ID = "INSERT_USER_ID_HERE";

  // Set the team ID of the user team association (i.e. what team the user
  // will be added to).
  private static final String TEAM_ID = "INSERT_TEAM_ID_HERE";

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
          "A user team association with user ID \"%d\" and team ID \"%d\" was created.\n",
          createdUserTeamAssociation.getUserId(), createdUserTeamAssociation.getTeamId());
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
