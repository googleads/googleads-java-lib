// Copyright 2017 Google Inc. All Rights Reserved.
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

package adwords.axis.v201702.accountmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201702.cm.Operator;
import com.google.api.ads.adwords.axis.v201702.mcm.ManagedCustomer;
import com.google.api.ads.adwords.axis.v201702.mcm.ManagedCustomerOperation;
import com.google.api.ads.adwords.axis.v201702.mcm.ManagedCustomerReturnValue;
import com.google.api.ads.adwords.axis.v201702.mcm.ManagedCustomerServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import org.joda.time.DateTime;

/**
 * This example creates a new account under an AdWords manager account.
 *
 * <p>Note: this example must be run using the credentials of an AdWords manager account, and
 * by default the new account will only be accessible via the parent AdWords manager
 * account.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateAccount {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    runExample(adWordsServices, session);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session) throws Exception {
    // Get the CampaignService.
    ManagedCustomerServiceInterface managedCustomerService =
        adWordsServices.get(session, ManagedCustomerServiceInterface.class);

    // Create account.
    ManagedCustomer customer = new ManagedCustomer();
    customer.setName("Customer created with ManagedCustomerService on " + new DateTime());
    customer.setCurrencyCode("EUR");
    customer.setDateTimeZone("Europe/London");

    // Create operations.
    ManagedCustomerOperation operation = new ManagedCustomerOperation();
    operation.setOperand(customer);
    operation.setOperator(Operator.ADD);

    ManagedCustomerOperation[] operations = new ManagedCustomerOperation[] {operation};

    // Add account.
    ManagedCustomerReturnValue result = managedCustomerService.mutate(operations);

    // Display accounts.
    for (ManagedCustomer customerResult : result.getValue()) {
      System.out.printf("Account with customer ID %d was created.%n",
          customerResult.getCustomerId());
    }
  }
}
