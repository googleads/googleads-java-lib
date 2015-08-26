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

import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_20.PlacementRemote;
import com.google.api.ads.dfa.axis.v1_20.PlacementType;
import com.google.api.ads.dfa.lib.client.DfaSession;

/**
 * This example displays placement type names and IDs.
 *
 * It also shows how to specify the username, token, and application name for
 * the client library to use, rather than having it read it in from a
 * configuration file.
 */
public class GetPlacementTypesWithGivenUsernameToken {

  // Specify credentials in code instead of using a properties file.
  private static final String USERNAME = "INSERT_USERNAME_HERE";
  private static final String TOKEN = "INSERT_TOKEN_HERE";
  private static final String APPLICATION_NAME = "INSERT_APPLICATION_NAME_HERE";

  public static void runExample(DfaServices dfaServices, DfaSession session) throws Exception {
    // Request the placement service from the service client factory.
    PlacementRemote placementService = dfaServices.get(session, PlacementRemote.class);

    // Get placement types.
    PlacementType[] placements = placementService.getPlacementTypes();

    // Display placement type names and IDs.
    for (PlacementType result : placements) {
      System.out.printf("Placement type with name \"%s\" and ID \"%s\" was found.%n",
          result.getName(), result.getId());
    }
  }

  public static void main(String[] args) throws Exception {
    // Construct a DfaSession.
    DfaSession session = new DfaSession.Builder()
        .withUsernameAndToken(USERNAME, TOKEN)
        .withApplicationName(APPLICATION_NAME)
        .withEnvironment(DfaSession.Environment.TEST)
        .build();

    DfaServices dfaServices = new DfaServices();

    runExample(dfaServices, session);
  }
}
