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

package dfp.axis.v201511.inventoryservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201511.StatementBuilder;
import com.google.api.ads.dfp.axis.v201511.AdUnit;
import com.google.api.ads.dfp.axis.v201511.AdUnitPage;
import com.google.api.ads.dfp.axis.v201511.InventoryServiceInterface;
import com.google.api.ads.dfp.axis.v201511.NetworkServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This example gets the ad unit hierarchy and displays it as a tree. To create
 * ad units, run CreateAdUnits.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetAdUnitHierarchy {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the InventoryService.
    InventoryServiceInterface inventoryService =
        dfpServices.get(session, InventoryServiceInterface.class);

    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(session, NetworkServiceInterface.class);

    // Get the effective root ad unit.
    String rootAdUnitId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();
      
    // Create a statement to select only the root ad unit by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", rootAdUnitId);

    AdUnitPage page = inventoryService
        .getAdUnitsByStatement(statementBuilder.toStatement());

    AdUnit effectiveRootAdUnit = Iterables
        .getOnlyElement(Arrays.asList(page.getResults()));

    // Get all ad units.
    List<AdUnit> adUnits = getAllAdUnits(dfpServices, session);

    buildAndDisplayAdUnitTree(effectiveRootAdUnit, adUnits);
  }

  /**
   * Get all ad units.
   */
  private static List<AdUnit> getAllAdUnits(DfpServices dfpServices, DfpSession session)
      throws RemoteException {
    List<AdUnit> adUnits = Lists.newArrayList();

    // Get the InventoryService.
    InventoryServiceInterface inventoryService =
        dfpServices.get(session, InventoryServiceInterface.class);

    // Create a statement to select all ad units.
    StatementBuilder statementBuilder = new StatementBuilder()
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get ad units by statement.
      AdUnitPage page = inventoryService.getAdUnitsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        Collections.addAll(adUnits, page.getResults());
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    return adUnits;
  }

  /**
   * Builds and displays an ad unit tree from ad units underneath
   * the root ad unit.
   *
   * @param root the root ad unit to build the tree under
   * @param adUnits the ad units.
   */
  private static void buildAndDisplayAdUnitTree(AdUnit root, List<AdUnit> adUnits) {
    Map<String, List<AdUnit>> treeMap = new HashMap<String, List<AdUnit>>();

    for (AdUnit adUnit : adUnits) {
      if (adUnit.getParentId() != null) {
        if (treeMap.get(adUnit.getParentId()) == null) {
          treeMap.put(adUnit.getParentId(), new ArrayList<AdUnit>());
        }

        treeMap.get(adUnit.getParentId()).add(adUnit);
      }
    }

    if (root != null) {
      displayInventoryTree(root, treeMap);
    } else {
      System.out.println("No root unit found.");
    }
  }

  /**
   * Displays the ad unit tree beginning at the root ad unit.
   *
   * @param root the root ad unit
   * @param treeMap the map of id to {@code List} of ad units
   */
  private static void displayInventoryTree(AdUnit root, Map<String, List<AdUnit>> treeMap) {
    displayInventoryTreeHelper(root, treeMap, 0);
  }

  /**
   * Helper for displaying inventory units.
   *
   * @param root the root inventory unit
   * @param treeMap the map of id to {@code List} of inventory units
   * @param depth the depth the tree has reached
   */
  private static void displayInventoryTreeHelper(AdUnit root,
      Map<String, List<AdUnit>> treeMap, int depth) {
    System.out.println(generateTab(depth) + root.getName() + " (" + root.getId() + ")");

    if (treeMap.get(root.getId()) != null) {
      for (AdUnit child : treeMap.get(root.getId())) {
        displayInventoryTreeHelper(child, treeMap, depth + 1);
      }
    }
  }

  /**
   * Generates a {@code String} of tabs to represent branching to children.
   *
   * @param depth a depth from 0 to max(depth)
   * @return a {@code String} to insert in front of the root unit
   */
  private static String generateTab(int depth) {
    StringBuilder builder = new StringBuilder();
    if (depth != 0) {
      builder.append("  ");
    }

    for (int i = 1; i < depth; i++) {
      builder.append("|  ");
    }

    return builder.append("+--").toString();
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

    runExample(dfpServices, session);
  }
}
