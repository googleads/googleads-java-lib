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

package dfp.axis.v201711.userservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201711.StatementBuilder;
import com.google.api.ads.dfp.axis.v201711.User;
import com.google.api.ads.dfp.axis.v201711.UserPage;
import com.google.api.ads.dfp.axis.v201711.UserServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets users by email.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetUserByEmailAddress {

  private static class GetUserByEmailAddressParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.EMAIL_ADDRESS, required = true)
    private String emailAddress;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, String emailAddress)
      throws Exception {
    UserServiceInterface userService =
        dfpServices.get(session, UserServiceInterface.class);

    // Create a statement to select users.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("email = :email")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("email", emailAddress);

    // Retrieve a small amount of users at a time, paging through
    // until all users have been retrieved.
    int totalResultSetSize = 0;
    do {
      UserPage page =
          userService.getUsersByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        // Print out some information for each user.
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (User user : page.getResults()) {
          System.out.printf(
              "%d) User with ID %d and name '%s' was found.%n",
              i++,
              user.getId(),
              user.getName()
          );
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d%n", totalResultSetSize);
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

    GetUserByEmailAddressParams params = new GetUserByEmailAddressParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.emailAddress = "INSERT_EMAIL_ADDRESS_HERE";
    }

    runExample(dfpServices, session, params.emailAddress);
  }
}
