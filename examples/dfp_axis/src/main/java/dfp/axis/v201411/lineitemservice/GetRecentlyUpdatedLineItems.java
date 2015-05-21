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

package dfp.axis.v201411.lineitemservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201411.DateTimes;
import com.google.api.ads.dfp.axis.utils.v201411.StatementBuilder;
import com.google.api.ads.dfp.axis.v201411.LineItem;
import com.google.api.ads.dfp.axis.v201411.LineItemPage;
import com.google.api.ads.dfp.axis.v201411.LineItemServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import org.joda.time.Duration;
import org.joda.time.Instant;

/**
 * This example gets only recently updated line items instead of fetching all
 * line items. This is the suggested way to daily sync any line items in
 * your network. To create line items, run CreateLineItems.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: LineItemService.getLineItemsByStatement
 *
 * @author Adam Rogal
 */
public class GetRecentlyUpdatedLineItems {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the LineItemService.
    LineItemServiceInterface lineItemService =
        dfpServices.get(session, LineItemServiceInterface.class);

    // Create a statement to only select line items updated or created since
    // yesterday.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("lastModifiedDateTime >= :lastModifiedDateTime")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("lastModifiedDateTime",
            DateTimes.toDateTime(Instant.now().minus(Duration.standardDays(1L)),
                "America/New_York"));

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get line items by statement.
      LineItemPage page =
          lineItemService.getLineItemsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (LineItem lineItem : page.getResults()) {
          System.out.printf(
              "%d) Line item with ID \"%d\" and name \"%s\" was found.\n", i++,
              lineItem.getId(), lineItem.getName());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d\n", totalResultSetSize);
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

    runExample(dfpServices, session);
  }
}
