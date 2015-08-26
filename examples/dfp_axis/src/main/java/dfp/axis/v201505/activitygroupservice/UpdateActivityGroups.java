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

package dfp.axis.v201505.activitygroupservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201505.StatementBuilder;
import com.google.api.ads.dfp.axis.v201505.ActivityGroup;
import com.google.api.ads.dfp.axis.v201505.ActivityGroupPage;
import com.google.api.ads.dfp.axis.v201505.ActivityGroupServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import com.google.common.primitives.Longs;

import java.util.Arrays;

/**
 * This example updates activity groups by adding a company. To determine which
 * activity groups exist, run GetAllActivityGroups.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateActivityGroups {

  // Set the ID of the activity group to update.
  private static final String ACTIVITY_GROUP_ID = "INSERT_ACTIVITY_GROUP_ID_HERE";

  //Set the ID of the company to associate with the activity group.
  private static final String ADVERTISER_COMPANY_ID = "INSERT_ADVERTISER_COMPANY_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      int activityGroupId, long advertiserCompanyId) throws Exception {
    // Get the ActivityGroupService.
    ActivityGroupServiceInterface activityGroupService =
        dfpServices.get(session, ActivityGroupServiceInterface.class);

    // Create a statement to only select a single activity group by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", activityGroupId);

    // Get the activity group.
    ActivityGroupPage page =
        activityGroupService.getActivityGroupsByStatement(statementBuilder.toStatement());

    ActivityGroup activityGroup = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update the companies.
    activityGroup.setCompanyIds(
        Longs.concat(activityGroup.getCompanyIds(), new long[] {advertiserCompanyId}));

    // Update the activity group on the server.
    ActivityGroup[] activityGroups =
        activityGroupService.updateActivityGroups(new ActivityGroup[] {activityGroup});

    for (ActivityGroup updatedActivityGroup : activityGroups) {
      System.out.printf(
          "Activity group with ID \"%d\" and name \"%s\" was updated.\n",
          updatedActivityGroup.getId(), updatedActivityGroup.getName());
    }
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

    runExample(dfpServices, session, Integer.parseInt(ACTIVITY_GROUP_ID),
        Long.parseLong(ADVERTISER_COMPANY_ID));
  }
}
