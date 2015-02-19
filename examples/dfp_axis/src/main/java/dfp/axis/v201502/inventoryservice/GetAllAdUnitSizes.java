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

package dfp.axis.v201502.inventoryservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201502.StatementBuilder;
import com.google.api.ads.dfp.axis.v201502.AdUnitSize;
import com.google.api.ads.dfp.axis.v201502.InventoryServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all ad unit sizes.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: InventoryService.getAdUnitSizesByStatement
 *
 * @author Adam Rogal
 */
public class GetAllAdUnitSizes {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the InventoryService.
    InventoryServiceInterface inventoryService =
        dfpServices.get(session, InventoryServiceInterface.class);

    // Create a statement to select all ad unit sizes.
    StatementBuilder statementBuilder = new StatementBuilder();

    // Get all ad unit sizes.
    AdUnitSize[] adUnitSizes =
        inventoryService.getAdUnitSizesByStatement(statementBuilder.toStatement());

    if (adUnitSizes != null) {
      for (int i = 0; i < adUnitSizes.length; i++) {
        AdUnitSize adUnitSize = adUnitSizes[i];
        System.out.printf("%d) Ad unit size of dimensions %s was found.\n", i,
            adUnitSize.getFullDisplayString());
      }
    } else {
      System.out.println("No ad unit sizes found.");
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

    runExample(dfpServices, session);
  }
}
