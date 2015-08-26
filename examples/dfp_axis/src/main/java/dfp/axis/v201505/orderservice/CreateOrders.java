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

package dfp.axis.v201505.orderservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201505.Order;
import com.google.api.ads.dfp.axis.v201505.OrderServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Random;

/**
 * This example creates a new order. To determine which orders exist,
 * run GetAllOrders.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateOrders {

  // Set the ID of the advertiser (company) that all creatives will be
  // assigned to.
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_COMPANY_ID_HERE";

  // Set the ID of the trafficker (user) associated with this order.
  private static final String TRAFFICKER_ID = "INSERT_TRAFFICKER_USER_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long advertiserId,
      long traffickerId) throws Exception {
    // Get the OrderService.
    OrderServiceInterface orderService =
        dfpServices.get(session, OrderServiceInterface.class);

    // Create an order.
    Order order = new Order();
    order.setName("Order #" + new Random().nextInt(Integer.MAX_VALUE));
    order.setAdvertiserId(advertiserId);
    order.setTraffickerId(traffickerId);

    // Create the order on the server.
    Order[] orders = orderService.createOrders(new Order[] {order});

    for (Order createdOrder : orders) {
      System.out.printf("An order with ID \"%d\" and name \"%s\" was created.\n",
          createdOrder.getId(), createdOrder.getName());
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

    runExample(dfpServices, session, Long.parseLong(ADVERTISER_ID), Long.parseLong(TRAFFICKER_ID));
  }
}
