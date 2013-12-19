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

package dfa.axis.v1_19;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_19.Placement;
import com.google.api.ads.dfa.axis.v1_19.PlacementRecordSet;
import com.google.api.ads.dfa.axis.v1_19.PlacementRemote;
import com.google.api.ads.dfa.axis.v1_19.PlacementSearchCriteria;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example displays available placements for a given search string. Results
 * are limited to 10.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: placement.getPlacementsByCriteria
 *
 * @author Joseph DiLallo
 */
public class GetPlacements {

  // Specify the search criteria.
  private static final String SEARCH_STRING = "INSERT_SEARCH_CRITERIA_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String searchString) throws Exception {
    // Request the placement service from the service client factory.
    PlacementRemote placementService = dfaServices.get(session, PlacementRemote.class);

    // Set placement search criteria.
    PlacementSearchCriteria searchCriteria = new PlacementSearchCriteria();
    searchCriteria.setPageSize(10);
    searchCriteria.setSearchString(searchString);

    // Get placement types.
    PlacementRecordSet placements = placementService.getPlacementsByCriteria(searchCriteria);

    // Display placment names and IDs.
    if (placements.getRecords() != null) {
      for (Placement result : placements.getRecords()) {
        System.out.printf("Placment with name \"%s\" and ID \"%s\" was found.%n",
            result.getName(), result.getId());
      }
    } else {
      System.out.println("No placements found for your criteria.");
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
