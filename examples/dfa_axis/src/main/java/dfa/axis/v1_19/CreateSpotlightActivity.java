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
import com.google.api.ads.dfa.axis.v1_19.SpotlightActivity;
import com.google.api.ads.dfa.axis.v1_19.SpotlightActivitySaveResult;
import com.google.api.ads.dfa.axis.v1_19.SpotlightRemote;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

import java.net.URL;

/**
 * This example creates a spotlight activity in a given activity group. To
 * create an activity group, run CreateSpotlightActivityGroup.java. To get tag
 * methods types, run GetTagMethodTypes.java. To get activity type IDs, run
 * GetActivityTypes.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: spotlight.saveSpotlightActivity
 *
 * @author Joseph DiLallo
 */
public class CreateSpotlightActivity {

  // Set the parameters for the new spotlight activity.
  private static final String ACTIVITY_NAME = "INSERT_ACTIVITY_NAME_HERE";
  private static final String URL = "INSERT_EXPECTED_URL_HERE";
  private static final String ACTIVITY_GROUP_ID = "INSERT_ACTIVITY_GROUP_ID_HERE";

  public static void runExample(DfaServices dfaServices, DfaSession session, String activityName,
      String url, long activityGroupId) throws Exception {
    // Request the service.
    SpotlightRemote service = dfaServices.get(session, SpotlightRemote.class);

    // Set spotlight activity structure.
    SpotlightActivity spotActivity = new SpotlightActivity();
    spotActivity.setId(0);
    spotActivity.setName(activityName);
    spotActivity.setActivityGroupId(activityGroupId);
    spotActivity.setExpectedUrl(new URL(url).toString());
    // The type ID for for a counter activity is 1. See GetActivityTypes.java
    spotActivity.setActivityTypeId(1);
    // The standard tag method type has an ID of 1. See GetTagMethodTypes.java
    spotActivity.setTagMethodTypeId(1);

    // Create the spotlight tag activity.
    SpotlightActivitySaveResult spotlightActivityResult =
        service.saveSpotlightActivity(spotActivity);

    // Display new spotlight activity ID.
    if (spotlightActivityResult != null) {
      System.out.printf("Spotlight activity with ID \"%s\" was created.%n",
          spotlightActivityResult.getId());
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

    long activityGroupId = Long.parseLong(ACTIVITY_GROUP_ID);

    runExample(dfaServices, session, ACTIVITY_NAME, URL, activityGroupId);
  }
}
