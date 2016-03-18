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
import com.google.api.ads.dfp.axis.v201505.ActivityGroup;
import com.google.api.ads.dfp.axis.v201505.ActivityGroupServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Random;

/**
 * This example creates new activity groups. To determine which activity groups
 * exist, run GetAllActivityGroups.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateActivityGroups {

  // Set the ID of the company for the activity group.
  private static final String ADVERTISER_COMPANY_ID = "INSERT_ADVERTISER_COMPANY_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long advertiserCompanyId) throws Exception {
    // Get the ActivityGroupService.
    ActivityGroupServiceInterface activityGroupService =
        dfpServices.get(session, ActivityGroupServiceInterface.class);

    // Create a short-term activity group.
    ActivityGroup shortTermActivityGroup = new ActivityGroup();
    shortTermActivityGroup.setName(
        "Short-term activity group #" + new Random().nextInt(Integer.MAX_VALUE));
    shortTermActivityGroup.setCompanyIds(new long[] {advertiserCompanyId});
    shortTermActivityGroup.setClicksLookback(1);
    shortTermActivityGroup.setImpressionsLookback(1);

    // Create a long-term activity group.
    ActivityGroup longTermActivityGroup = new ActivityGroup();
    longTermActivityGroup.setName(
        "Long-term activity group #" + new Random().nextInt(Integer.MAX_VALUE));
    longTermActivityGroup.setCompanyIds(new long[] {advertiserCompanyId});
    longTermActivityGroup.setClicksLookback(30);
    longTermActivityGroup.setImpressionsLookback(30);

    // Create the activity groups on the server.
    ActivityGroup[] activityGroups = activityGroupService.createActivityGroups(
        new ActivityGroup[] {shortTermActivityGroup, longTermActivityGroup});

    for (ActivityGroup createdActivityGroup : activityGroups) {
      System.out.printf("An activity group with ID %d and name '%s' was created.%n",
          createdActivityGroup.getId(), createdActivityGroup.getName());
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

    runExample(dfpServices, session, Long.parseLong(ADVERTISER_COMPANY_ID));
  }
}
