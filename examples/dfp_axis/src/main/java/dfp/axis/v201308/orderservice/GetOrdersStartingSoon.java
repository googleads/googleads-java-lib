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
import com.google.api.ads.dfp.axis.utils.v201308.DateTimes;
import com.google.api.ads.dfp.axis.utils.v201308.StatementBuilder;
import com.google.api.ads.dfp.axis.v201308.Order;
import com.google.api.ads.dfp.axis.v201308.OrderPage;
import com.google.api.ads.dfp.axis.v201308.OrderServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import org.joda.time.Duration;
import org.joda.time.Instant;

/**
 * This example gets all orders that are starting soon. To create orders, run
 * CreateOrders.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: OrderService.getOrdersByStatement
 *
 * @author Adam Rogal
 */
public class GetOrdersStartingSoon {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the OrderService.
    OrderServiceInterface orderService =
        dfpServices.get(session, OrderServiceInterface.class);

    // Create a statement to only select orders that are starting soon.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("status = 'APPROVED' and startDateTime >= :now and startDateTime <= :soon")
        .orderBy("name ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("now", DateTimes.toDateTime(Instant.now(), "America/New_York"))
        .withBindVariableValue("soon",
            DateTimes.toDateTime(Instant.now().plus(Duration.standardDays(5L)),
                "America/New_York"));

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get orders by statement.
      OrderPage page = orderService.getOrdersByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (Order order : page.getResults()) {
          System.out.printf("%d) Order with ID \"%d\" and name \"%s\" was found.\n", i++,
              order.getId(), order.getName());
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

    runExample(dfpServices, session);
  }
}
