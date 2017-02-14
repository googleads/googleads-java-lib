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

package dfp.axis.v201702.userservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201702.User;
import com.google.api.ads.dfp.axis.v201702.UserServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a new user with a trafficker role. To determine which
 * users exist, run GetAllUsers.java. To determine which roles exist, run
 * GetAllRoles.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateUsers {

  // Set the email address of the user.
  private static final String EMAIL_ADDRESS = "INSERT_EMAIL_ADDRESS_HERE";

  // Set the name of the user.
  private static final String NAME = "INSERT_NAME_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, String emailAddress,
      String name) throws Exception {
    // Get the UserService.
    UserServiceInterface userService = dfpServices.get(session, UserServiceInterface.class);

    // Create a user.
    User traffickerUser = new User();
    traffickerUser.setEmail(emailAddress);
    traffickerUser.setName(name);

    // Set the system defined ID of the trafficker role.
    // To determine what other roles exist, run GetAllRoles.java.
    traffickerUser.setRoleId(-7L);

    // Create the user on the server.
    User[] users = userService.createUsers(new User[] {traffickerUser});

    for (User createdUser : users) {
      System.out.printf("A user with ID %d and name '%s' was created.%n",
          createdUser.getId(), createdUser.getName());
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

    runExample(dfpServices, session, EMAIL_ADDRESS, NAME);
  }
}
