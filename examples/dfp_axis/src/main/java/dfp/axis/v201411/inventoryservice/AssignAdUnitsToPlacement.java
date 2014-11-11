// Copyright 2014 Google Inc. All Rights Reserved.
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

package dfp.axis.v201411.inventoryservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201411.StatementBuilder;
import com.google.api.ads.dfp.axis.v201411.AdUnit;
import com.google.api.ads.dfp.axis.v201411.AdUnitPage;
import com.google.api.ads.dfp.axis.v201411.InventoryServiceInterface;
import com.google.api.ads.dfp.axis.v201411.UpdateResult;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example adds an ad unit to a placement without fetching the entire
 * placement. To determine which ad units exist, run GetAllAdUnits.java. To
 * determine which placements exist, run GetAllPlacements.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: InventoryService.getAdUnitsByStatement
 * Tags: InventoryService.performAdUnitAction
 *
 * @author Adam Rogal
 */
public class AssignAdUnitsToPlacement {

  // Set the ad unit ID to add to the placement.
  private static final String AD_UNIT_ID = "INSERT_AD_UNIT_ID_HERE";

  // Set the placement ID to add the ad unit to.
  private static final String PLACEMENT_ID = "INSERT_PLACEMENT_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      String adUnitId, long placementId) throws Exception {
    // Get the InventoryService.
    InventoryServiceInterface inventoryService =
        dfpServices.get(session, InventoryServiceInterface.class);

    // Create a statement to select ad units.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("id", adUnitId);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get ad units by statement.
      AdUnitPage page = inventoryService.getAdUnitsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (AdUnit adUnit : page.getResults()) {
          System.out.printf(
              "%d) Ad unit with ID \"%s\" and name \"%s\" will be added to placement.\n", i++,
              adUnit.getId(), adUnit.getName());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of ad units to be added to placement: %d\n", totalResultSetSize);

    if (totalResultSetSize > 0) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      com.google.api.ads.dfp.axis.v201411.AssignAdUnitsToPlacement action =
          new com.google.api.ads.dfp.axis.v201411.AssignAdUnitsToPlacement();
      action.setPlacementId(placementId);

      // Perform action.
      UpdateResult result =
          inventoryService.performAdUnitAction(action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.printf(
            "Number of ad units to be added to placement: %d\n", result.getNumChanges());
      } else {
        System.out.println("No ad units were added to placement.");
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

    runExample(dfpServices, session, AD_UNIT_ID, Long.parseLong(PLACEMENT_ID));
  }
}
