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

package dfp.axis.v201405.orderservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201405.StatementBuilder;
import com.google.api.ads.dfp.axis.v201405.Order;
import com.google.api.ads.dfp.axis.v201405.OrderPage;
import com.google.api.ads.dfp.axis.v201405.OrderServiceInterface;
import com.google.api.ads.dfp.axis.v201405.UpdateResult;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example approves an order, and all line items belonging to that order.
 * To determine which orders exist, run GetAllOrders.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: OrderService.getOrdersByStatement
 * Tags: OrderService.performOrderAction
 *
 * @author Adam Rogal
 */
public class ApproveOrders {

  // Set the ID of the order to approve.
  private static final String ORDER_ID = "INSERT_ORDER_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long orderId)
      throws Exception {
    // Get the OrderService.
    OrderServiceInterface orderService =
        dfpServices.get(session, OrderServiceInterface.class);

    // Create a statement to select an order.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE id = :id")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("id", orderId);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get orders by statement.
      OrderPage page = orderService.getOrdersByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (Order order : page.getResults()) {
          System.out.printf("%d) Order with ID \"%d\" will be approved.\n", i++, order.getId());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of orders to be approved: %d\n", totalResultSetSize);

    if (totalResultSetSize > 0) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      com.google.api.ads.dfp.axis.v201405.ApproveOrders action =
          new com.google.api.ads.dfp.axis.v201405.ApproveOrders();

      // Perform action.
      UpdateResult result =
          orderService.performOrderAction(action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.printf("Number of orders approved: %d\n", result.getNumChanges());
      } else {
        System.out.println("No orders were approved.");
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

    runExample(dfpServices, session, Long.parseLong(ORDER_ID));
  }
}
