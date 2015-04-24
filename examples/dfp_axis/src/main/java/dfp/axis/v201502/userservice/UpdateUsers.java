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

package dfp.axis.v201502.userservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201502.StatementBuilder;
import com.google.api.ads.dfp.axis.v201502.User;
import com.google.api.ads.dfp.axis.v201502.UserPage;
import com.google.api.ads.dfp.axis.v201502.UserServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;

import java.util.Arrays;

/**
 * This example updates the role of a user to a salesperson. To determine which
 * users exist, run GetAllUsers.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: UserService.getUsersByStatement
 * Tags: UserService.updateUsers
 *
 * @author Adam Rogal
 */
public class UpdateUsers {

  // Set the ID of the user to update.
  private static final String USER_ID = "INSERT_USER_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long userId)
      throws Exception {
    // Get the UserService.
    UserServiceInterface userService = dfpServices.get(session, UserServiceInterface.class);

    // Create a statement to only select a single user by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", userId);

    // Get the user.
    UserPage page =
        userService.getUsersByStatement(statementBuilder.toStatement());

    User user = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Set the role of the user to a salesperson.
    // To determine what other roles exist, run GetAllRoles.java.
    user.setRoleId(-5L);

    // Update the user on the server.
    User[] users = userService.updateUsers(new User[] {user});

    for (User updatedUser : users) {
      System.out.printf("User with ID \"%d\" and name \"%s\" was updated.\n",
          updatedUser.getId(), updatedUser.getName());
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
