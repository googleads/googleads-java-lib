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
import com.google.api.ads.dfa.axis.v1_20.CreativePlacementAssignment;
import com.google.api.ads.dfa.axis.v1_20.CreativePlacementAssignmentResult;
import com.google.api.ads.dfa.axis.v1_20.CreativeRemote;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example assigns creatives to placements and creates a unique ad for each
 * assignment. To get creatives, run GetCreatives.java example. To get
 * placements, run GetPlacements.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AssignCreativesToPlacements {

  // Provide the IDs of the creatives and placements to create associations
  // between.
  private static final String CREATIVE_ID_ONE = "INSERT_FIRST_CREATIVE_ID";
  private static final String CREATIVE_ID_TWO = "INSERT_SECOND_CREATIVE_ID";
  private static final String PLACEMENT_ID_ONE = "INSERT_FIRST_PLACEMENT_ID";
  private static final String PLACEMENT_ID_TWO = "INSERT_SECOND_PLACEMENT_ID";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, long[] creativeIds, long[] placementIds)
          throws Exception {
    // Request the creative service from the service client factory.
    CreativeRemote creativeService = dfaServices.get(session, CreativeRemote.class);

    // Create creative placement assignment structure.
    CreativePlacementAssignment[] creativePlacementAssignment =
        new CreativePlacementAssignment[creativeIds.length];

    for (int i = 0; i < creativeIds.length; i++){
      creativePlacementAssignment[i] = new CreativePlacementAssignment();
      creativePlacementAssignment[i].setCreativeId(creativeIds[i]);
      creativePlacementAssignment[i].setPlacementId(placementIds[0]);
      creativePlacementAssignment[i].setPlacementIds(placementIds);
    }

    // Assign creatives to placements.
    CreativePlacementAssignmentResult[] creativeAssigmentResult =
      creativeService.assignCreativesToPlacements(creativePlacementAssignment);

    // Display new ads that resulted from the assignment.
    for (CreativePlacementAssignmentResult result : creativeAssigmentResult) {
      System.out.printf("Ad with name \"%s\" and ID \"%s\" was created.%n",
          result.getAdName(), result.getAdId());
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

    long[] creativeIds =
        new long[] {Long.parseLong(CREATIVE_ID_ONE), Long.parseLong(CREATIVE_ID_TWO)};
    long[] placementIds =
        new long[] {Long.parseLong(PLACEMENT_ID_ONE), Long.parseLong(PLACEMENT_ID_TWO)};

    runExample(dfaServices, session, creativeIds, placementIds);
  }
}
