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
import com.google.api.ads.dfa.axis.v1_19.PlacementStrategy;
import com.google.api.ads.dfa.axis.v1_19.PlacementStrategyRemote;
import com.google.api.ads.dfa.axis.v1_19.PlacementStrategySaveResult;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a placement strategy with the given name.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: strategy.savePlacementStrategy
 *
 * @author Joseph DiLallo
 */
public class CreatePlacementStrategy {

  // Set the name of the new placement strategy.
  private static final String PLACEMENT_STRATEGY_NAME = "INSERT_PLACEMENT_STRATEGY_NAME_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String placementStrategyName) throws Exception {
    // Request the service.
    PlacementStrategyRemote service = dfaServices.get(session, PlacementStrategyRemote.class);

    // Create the placement strategy.
    PlacementStrategy placementStrategy = new PlacementStrategy();
    placementStrategy.setId(0);
    placementStrategy.setName(placementStrategyName);

    // Save the placement strategy.
    PlacementStrategySaveResult placementStrategySaveResult =
        service.savePlacementStrategy(placementStrategy);

    // Display the new placement strategy ID.
    System.out.printf("Placement Strategy with ID \"%s\" was created.%n",
        placementStrategySaveResult.getId());
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

    runExample(dfaServices, session, PLACEMENT_STRATEGY_NAME);
  }
}
