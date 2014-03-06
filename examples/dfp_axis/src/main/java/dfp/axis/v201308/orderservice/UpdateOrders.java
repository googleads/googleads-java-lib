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

package dfp.axis.v201308.orderservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201308.Order;
import com.google.api.ads.dfp.axis.v201308.OrderServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example updates an order's notes. To determine which orders exist, run
 * GetAllOrders.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: OrderService.getOrder
 * Tags: OrderService.updateOrders
 *
 * @author Adam Rogal
 */
public class UpdateOrders {

  // Set the ID of the order to update.
  private static final String ORDER_ID = "INSERT_ORDER_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long orderId)
      throws Exception {
    // Get the OrderService.
    OrderServiceInterface orderService =
        dfpServices.get(session, OrderServiceInterface.class);

    // Get the order.
    Order order = orderService.getOrder(orderId);

    // Update the order's notes.
    order.setNotes("Spoke to advertiser. All is well.");

    // Update the order on the server.
    Order[] orders = orderService.updateOrders(new Order[] {order});

    for (Order updatedOrder : orders) {
      System.out.printf("Order with ID \"%d\" and name \"%s\" was updated.\n", updatedOrder.getId(),
          updatedOrder.getName());
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
