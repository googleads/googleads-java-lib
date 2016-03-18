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

package dfp.axis.v201508.lineitemservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201508.StatementBuilder;
import com.google.api.ads.dfp.axis.v201508.LineItem;
import com.google.api.ads.dfp.axis.v201508.LineItemPage;
import com.google.api.ads.dfp.axis.v201508.LineItemServiceInterface;
import com.google.api.ads.dfp.axis.v201508.LineItemType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;

import java.util.Arrays;

/**
 * This example updates a standard line item's priority to high. To determine
 * which line items exist, run GetAllLineItems.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateLineItems {

  // Set the ID of the line item to update.
  private static final String LINE_ITEM_ID = "INSERT_LINE_ITEM_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long lineItemId)
      throws Exception {
    // Get the LineItemService.
    LineItemServiceInterface lineItemService =
        dfpServices.get(session, LineItemServiceInterface.class);

    // Create a statement to only select a single line item by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", lineItemId);

    // Get the line item.
    LineItemPage page =
        lineItemService.getLineItemsByStatement(statementBuilder.toStatement());

    LineItem lineItem = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update the line item's priority to High if possible.
    if (lineItem.getLineItemType() == LineItemType.STANDARD) {
      lineItem.setPriority(6);

      // Update the line item on the server.
      LineItem[] lineItems = lineItemService.updateLineItems(new LineItem[] {lineItem});

      for (LineItem updatedLineItem : lineItems) {
        System.out.printf(
            "Line item with ID %d and name '%s' was updated.%n",
            updatedLineItem.getId(), updatedLineItem.getName());
      }
    } else {
      System.out.println("No line items were updated.");
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

    runExample(dfpServices, session, Long.parseLong(LINE_ITEM_ID));
  }
}
