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
import com.google.api.ads.dfa.axis.v1_20.SpotlightActivityGroup;
import com.google.api.ads.dfa.axis.v1_20.SpotlightActivityGroupSaveResult;
import com.google.api.ads.dfa.axis.v1_20.SpotlightRemote;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a new activity group for a given spotlight
 * configuration. To get a spotlight tag configuration ID, run
 * GetAdvertisers.java. To get activity types, run GetActivityTypes.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateSpotlightActivityGroup {

  // Set the parameters for the new spotlight activity group.
  private static final String GROUP_NAME = "INSERT_GROUP_NAME_HERE";
  private static final String SPOTLIGHT_CONFIGURATION_ID = "INSERT_SPOTLIGHT_CONFIGURATION_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String groupName, long spotlightConfigurationId)
          throws Exception {
    // Request the service.
    SpotlightRemote service = dfaServices.get(session, SpotlightRemote.class);

    // Create the spotlight activity group.
    SpotlightActivityGroup spotlightActivityGroup = new SpotlightActivityGroup();
    spotlightActivityGroup.setId(0);
    spotlightActivityGroup.setName(groupName);
    spotlightActivityGroup.setSpotlightConfigurationId(spotlightConfigurationId);
    // The type ID for for a counter group is 1. See GetActivityTypes.java
    spotlightActivityGroup.setGroupType(1);

    // Save the activity group.
    SpotlightActivityGroupSaveResult activityGroupSaveResult =
        service.saveSpotlightActivityGroup(spotlightActivityGroup);

    // Display the new activity group ID.
    if (activityGroupSaveResult != null) {
      System.out.printf("Activity group with ID \"%s\" was created.%n",
          activityGroupSaveResult.getId());
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

    long spotlightConfigurationId = Long.parseLong(SPOTLIGHT_CONFIGURATION_ID);

    runExample(dfaServices, session, GROUP_NAME, spotlightConfigurationId);
  }
}
