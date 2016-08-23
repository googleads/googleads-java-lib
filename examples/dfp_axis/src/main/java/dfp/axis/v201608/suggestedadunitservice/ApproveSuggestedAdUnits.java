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

package dfp.axis.v201608.suggestedadunitservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201608.StatementBuilder;
import com.google.api.ads.dfp.axis.v201608.SuggestedAdUnit;
import com.google.api.ads.dfp.axis.v201608.SuggestedAdUnitPage;
import com.google.api.ads.dfp.axis.v201608.SuggestedAdUnitServiceInterface;
import com.google.api.ads.dfp.axis.v201608.SuggestedAdUnitUpdateResult;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example approves highly requested suggested ad units. To
 * determine which suggested ad units exist, run GetAllSuggestedAdUnits.java.
 * This feature is only available to DFP premium solution networks.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class ApproveSuggestedAdUnits {

  // Set the number of requests for suggested ad units greater than which to
  // approve.
  private static final String NUM_REQUESTS = "INSERT_NUMBER_OF_REQUESTS_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long numRequests)
      throws Exception {
    // Get the SuggestedAdUnitService.
    SuggestedAdUnitServiceInterface suggestedAdUnitService =
        dfpServices.get(session, SuggestedAdUnitServiceInterface.class);

    // Create a statement to only select suggested ad units that are highly
    // requested.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("numRequests >= :numRequests")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("numRequests", numRequests);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get suggested ad units by statement.
      SuggestedAdUnitPage page =
          suggestedAdUnitService.getSuggestedAdUnitsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (SuggestedAdUnit suggestedAdUnit : page.getResults()) {
          System.out.printf("%d) Suggested ad unit with ID '%s' will be approved.%n", i++,
              suggestedAdUnit.getId());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of suggested ad units to be approved: %d%n", totalResultSetSize);

    if (totalResultSetSize > 0) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      com.google.api.ads.dfp.axis.v201608.ApproveSuggestedAdUnits action =
          new com.google.api.ads.dfp.axis.v201608.ApproveSuggestedAdUnits();

      // Perform action.
      SuggestedAdUnitUpdateResult result = suggestedAdUnitService.performSuggestedAdUnitAction(
          action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.printf(
            "Number of new ad units created: %d%n", result.getNewAdUnitIds().length);
      } else {
        System.out.println("No suggested ad units were approved.");
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

    runExample(dfpServices, session, Long.parseLong(NUM_REQUESTS));
  }
}
