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

import com.google.api.ads.adwords.axis.utility.extension.ExtendedMcc;
import com.google.api.ads.adwords.axis.v201306.billing.BillingAccount;

import java.util.List;

/**
 * This example gets all BillingAccount for an MCC account.
 *
 * Tags: BudgetOrderService.getBillingAccounts()
 *
 * @author Julian Toledo
 */
public class GetBillingAccounts {

  public static void main(String[] args) throws Exception {
    // Creating ExtendedMcc using OAuth2 credentials form file
    ExtendedMcc extendedMcc = ExtendedMcc.withOAuth2FromFile();
    runExample(extendedMcc);
  }

  public static void runExample(ExtendedMcc extendedMcc)
      throws Exception {
    // Get BillingAccounts at the MCC level.
    List<BillingAccount> billingAccounts = extendedMcc.getBillingAccounts();
    for (BillingAccount billingAccount : billingAccounts) {
      System.out.printf(
          "BillingAccount with Id '%s' and Name  '%s' was found.\n",
          billingAccount.getId(),
          billingAccount.getName());
    }
  }
}