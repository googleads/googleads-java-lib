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

package dfp.axis.v201308.activityservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201308.Activity;
import com.google.api.ads.dfp.axis.v201308.ActivityServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example updates activity expected URLs. To determine which activities
 * exist, run GetAllActivities.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: ActivityService.updateActivities
 *
 * @author Adam Rogal
 */
public class UpdateActivities {

  // Set the ID of the activity to update.
  private static final String ACTIVITY_ID = "INSERT_ACTIVITY_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      int activityId) throws Exception {
    // Get the ActivityService.
    ActivityServiceInterface activityService =
        dfpServices.get(session, ActivityServiceInterface.class);

    // Get the activity.
    Activity activity = activityService.getActivity(activityId);

    // Update the expected URL.
    activity.setExpectedURL("http://google.com");

    // Update the activity on the server.
    Activity[] activities = activityService.updateActivities(new Activity[] {activity});

    for (Activity updatedActivity : activities) {
      System.out.printf(
          "Activity with ID \"%d\" and name \"%s\" was updated.\n",
          updatedActivity.getId(), updatedActivity.getName());
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

    runExample(dfpServices, session, Integer.parseInt(ACTIVITY_ID));
  }
}
