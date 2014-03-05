// Copyright 2012 Google Inc. All Rights Reserved.
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

package dfp.axis.v201208.inventoryservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201208.StatementBuilder;
import com.google.api.ads.dfp.axis.v201208.AdUnit;
import com.google.api.ads.dfp.axis.v201208.AdUnitPage;
import com.google.api.ads.dfp.axis.v201208.InventoryServiceInterface;
import com.google.api.ads.dfp.axis.v201208.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201208.UpdateResult;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.ArrayList;
import java.util.List;

/**
 * This example archives ad units underneath a parent ad unit, as well as the
 * parent ad unit. To create ad units, run CreateAdUnits.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: InventoryService.getAdUnitsByStatement
 *
 * @author Adam Rogal
 */
public class ArchiveAdUnits {

  public static void runExample(DfpServices dfpServices, DfpSession session, String parentAdUnitId)
      throws Exception {
    // Get the InventoryService.
    InventoryServiceInterface inventoryService =
        dfpServices.get(session, InventoryServiceInterface.class);

    // Create a statement to select ad units under the parent ad unit and the
    // parent ad unit.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("parentId = :parentId or id = :parentId")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("parentId", parentAdUnitId);

    // Default for total result set size.
    int totalResultSetSize = 0;
    List<String> adUnitIds = new ArrayList<String>();

    do {
      // Get ad units by statement.
      AdUnitPage page = inventoryService.getAdUnitsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (AdUnit adUnit : page.getResults()) {
          System.out.printf(
              "%s) Ad unit with ID \"%s\" and name \"%s\" will be archived.\n", i,
              adUnit.getId(), adUnit.getName());
          adUnitIds.add(adUnit.getId());
          i++;
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of ad units to be archived: %s\n", totalResultSetSize);

    if (!adUnitIds.isEmpty()) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      com.google.api.ads.dfp.axis.v201208.ArchiveAdUnits action =
          new com.google.api.ads.dfp.axis.v201208.ArchiveAdUnits();

      // Perform action.
      UpdateResult result =
          inventoryService.performAdUnitAction(action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.println("Number of ad units archived: " + result.getNumChanges());
      } else {
        System.out.println("No ad units were archived.");
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

    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(session, NetworkServiceInterface.class);

    // Set the parent ad unit's ID for all children ad units to be fetched from.
    String parentAdUnitId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();

    runExample(dfpServices, session, parentAdUnitId);
  }
}
