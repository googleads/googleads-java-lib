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
import com.google.api.ads.adwords.axis.v201409.mcm.ManagedCustomer;

import org.joda.time.DateTime;

/**
 * This example creates a new account under an MCC account.
 *
 * Note: this example must be run using the credentials of an MCC account, and
 * by default the new account will only be accessible via the parent MCC
 * account.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * @author Adam Rogal
 * @author Julian Toledo
 */
public class CreateAccount {

  public static void main(String[] args) throws Exception {
    // Creating ExtendedMcc using OAuth2 credentials form file
    ExtendedMcc extendedMcc = ExtendedMcc.withOAuth2FromFile();
    runExample(extendedMcc);
  }

  public static void runExample(ExtendedMcc extendedMcc) throws Exception {
    // Create account.
    ManagedCustomer customer = new ManagedCustomer();
    customer.setName("Customer created with ManagedCustomerService on "
        + new DateTime().toString());
    customer.setCurrencyCode("EUR");
    customer.setDateTimeZone("Europe/London");

    // Add account.
    ExtendedManagedCustomer extendedManagedCustomer = extendedMcc.insertManagedCustomer(customer);

    // Display account.
    System.out.printf("Account with customer ID '%d' was created.\n",
        extendedManagedCustomer.getManagedCustomer().getCustomerId());
  }
}
