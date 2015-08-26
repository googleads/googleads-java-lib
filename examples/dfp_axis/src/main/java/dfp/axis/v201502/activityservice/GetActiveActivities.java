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

package dfp.axis.v201502.activityservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201502.StatementBuilder;
import com.google.api.ads.dfp.axis.v201502.Activity;
import com.google.api.ads.dfp.axis.v201502.ActivityPage;
import com.google.api.ads.dfp.axis.v201502.ActivityServiceInterface;
import com.google.api.ads.dfp.axis.v201502.ActivityStatus;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all active activities. To create activities,
 * run CreateActivities.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetActiveActivities {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the ActivityService.
    ActivityServiceInterface activityService =
        dfpServices.get(session, ActivityServiceInterface.class);

    // Create a statement to only select active activities.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("status = :status")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("status", ActivityStatus.ACTIVE.toString());

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get activities by statement.
      ActivityPage page = activityService.getActivitiesByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (Activity activity : page.getResults()) {
          System.out.printf(
              "%d) Activity with ID \"%d\", name \"%s\", and type \"%s\" was found.\n", i++,
              activity.getId(), activity.getName(), activity.getType());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d\n", totalResultSetSize);
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
