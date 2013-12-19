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

package dfa.axis.v1_20;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_20.PlacementStrategy;
import com.google.api.ads.dfa.axis.v1_20.PlacementStrategyRecordSet;
import com.google.api.ads.dfa.axis.v1_20.PlacementStrategyRemote;
import com.google.api.ads.dfa.axis.v1_20.PlacementStrategySearchCriteria;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example displays available placement strategies for a given search
 * string. Results are limited to 10.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: strategy.getPlacementStrategiesByCriteria
 *
 * @author Joseph DiLallo
 */
public class GetPlacementStrategies {
  
  // Specify the search criteria.
  private static final String SEARCH_STRING = "INSERT_SEARCH_CRITERIA_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String searchString) throws Exception {
    // Request the service.
    PlacementStrategyRemote service = dfaServices.get(session, PlacementStrategyRemote.class);

    // Create placement strategy search criteria structure.
    PlacementStrategySearchCriteria placementStrategySearchCriteria =
        new PlacementStrategySearchCriteria();
    placementStrategySearchCriteria.setPageSize(10);
    placementStrategySearchCriteria.setSearchString(searchString);

    // Get placement strategy record set.
    PlacementStrategyRecordSet placementStrategyRecordSet =
        service.getPlacementStrategiesByCriteria(placementStrategySearchCriteria);

    // Display placement strategy names, IDs and descriptions.
    if (placementStrategyRecordSet.getRecords() != null) {
      for (PlacementStrategy result : placementStrategyRecordSet.getRecords()) {
        System.out.println("Placement Strategy with name \"" + result.getName()
            + "\" and ID \"" + result.getId() + "\" was found.");
      }
    } else {
      System.out.print("No placement strategies found for your criteria.");
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential, which replaces legacy passwords
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFA)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfaSession.
    DfaSession session = new DfaSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfaServices dfaServices = new DfaServices();

    runExample(dfaServices, session, SEARCH_STRING);
  }
}
