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

package dfp.axis.v201311.userservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201311.StatementBuilder;
import com.google.api.ads.dfp.axis.v201311.User;
import com.google.api.ads.dfp.axis.v201311.UserPage;
import com.google.api.ads.dfp.axis.v201311.UserServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets users by email. To create users, run CreateUsers.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: UserService.getUsersByStatement
 *
 * @author Adam Rogal
 */
public class GetUserByEmailAddress {

  // Set the email address of the user to select.
  private static final String EMAIL_ADDRESS = "INSERT_EMAIL_ADDRESS_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, String emailAddress)
      throws Exception {
    // Get the UserService.
    UserServiceInterface userService = dfpServices.get(session, UserServiceInterface.class);

    // Create a statement to select users by email address.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("email = :email")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("email", emailAddress);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get users by statement.
      UserPage page = userService.getUsersByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (User user : page.getResults()) {
          System.out.printf("%d) User with ID \"%d\" and name \"%s\" was found.\n", i++,
              user.getId(), user.getName());
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

    runExample(dfpServices, session, EMAIL_ADDRESS);
  }
}
