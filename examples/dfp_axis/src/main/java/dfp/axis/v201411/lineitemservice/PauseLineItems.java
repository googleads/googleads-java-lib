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
import com.google.api.ads.dfp.axis.utils.v201411.StatementBuilder;
import com.google.api.ads.dfp.axis.v201411.LineItem;
import com.google.api.ads.dfp.axis.v201411.LineItemPage;
import com.google.api.ads.dfp.axis.v201411.LineItemServiceInterface;
import com.google.api.ads.dfp.axis.v201411.UpdateResult;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example pauses a line item. Line items must be paused before they
 * can be updated. To determine which line items exist, run
 * GetAllLineItems.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: LineItemService.getLineItemsByStatement
 * Tags: LineItemService.performLineItemAction
 *
 * @author Adam Rogal
 */
public class PauseLineItems {

  // Set the ID of the line item to pause.
  private static final String LINE_ITEM_ID = "INSERT_LINE_ITEM_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long lineItemId)
      throws Exception {
    // Get the LineItemService.
    LineItemServiceInterface lineItemService =
        dfpServices.get(session, LineItemServiceInterface.class);

    // Create a statement to select a line item.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE id = :id")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("id", lineItemId);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get line items by statement.
      LineItemPage page = lineItemService.getLineItemsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (LineItem lineItem : page.getResults()) {
          System.out.printf(
              "%d) Line item with ID \"%d\" will be paused.\n", i++, lineItem.getId());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of line items to be paused: %d\n", totalResultSetSize);

    if (totalResultSetSize > 0) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      com.google.api.ads.dfp.axis.v201411.PauseLineItems action =
          new com.google.api.ads.dfp.axis.v201411.PauseLineItems();

      // Perform action.
      UpdateResult result =
          lineItemService.performLineItemAction(action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.printf("Number of line items paused: %d\n", result.getNumChanges());
      } else {
        System.out.println("No line items were paused.");
      }
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

    runExample(dfpServices, session, Long.parseLong(LINE_ITEM_ID));
  }
}
