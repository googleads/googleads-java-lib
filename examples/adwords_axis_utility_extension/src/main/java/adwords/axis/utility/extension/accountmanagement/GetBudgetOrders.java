// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.utility.extension.accountmanagement;

import com.google.api.ads.adwords.axis.utility.extension.ExtendedManagedCustomer;
import com.google.api.ads.adwords.axis.utility.extension.ExtendedMcc;
import com.google.api.ads.adwords.axis.v201309.billing.BudgetOrder;

import java.util.List;

/**
 * This example gets all budget orders.
 *
 * Tags: BudgetOrderService.getBillingAccounts()
 *
 * @author Julian Toledo
 */
public class GetBudgetOrders {

  public static void main(String[] args) throws Exception {
    // Creating ExtendedMcc using OAuth2 credentials form file
    ExtendedMcc extendedMcc = ExtendedMcc.withOAuth2FromFile();

    long accountId = Long.parseLong("INSERT_ACCOUNT_ID_HERE");
    ExtendedManagedCustomer extendedManagedCustomer =
        extendedMcc.getExtendedManagedCustomer(accountId);

    runExample(extendedManagedCustomer);
  }

  public static void runExample(ExtendedManagedCustomer extendedManagedCustomer)
      throws Exception {

    List<BudgetOrder> budgetOrders = extendedManagedCustomer.getBudgetOrders();
    for (BudgetOrder budgetOrder : budgetOrders) {
      System.out.printf(
          "BudgetOrder '%s' '%s' '%d' '%d' was found.\n",
          budgetOrder.getStartDateTime(),
          budgetOrder.getEndDateTime(),
          budgetOrder.getSpendingLimit().getMicroAmount() / 1000000,
          budgetOrder.getId());
    }
  }
}
