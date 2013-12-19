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
import com.google.api.ads.dfa.axis.v1_19.AdvertiserGroupRemote;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example assigns a list of advertisers to an advertiser group.
 *
 * CAUTION: An advertiser that has campaigns associated with it cannot be
 * removed from an advertiser group once assigned.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: advertisergroup.assignAdvertisersToAdvertiserGroup
 *
 * @author Joseph DiLallo
 */
public class AssignAdvertisersToAdvertiserGroup {

  // Set the IDs of two advertisers to place in an advertiser group.
  private static final String ADVERTISER_ID_ONE = "INSERT_FIRST_ADVERTISER_ID_HERE";
  private static final String ADVERTISER_ID_TWO = "INSERT_SECOND_ADVERTISER_ID_HERE";
  // Set the ID of the advertiser group to add the advertisers to.
  private static final String ADVERTISER_GROUP_ID = "INSERT_ADVERTISER_GROUP_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, long[] advertiserIds, long advertiserGroupId)
          throws Exception {
    // Request the service.
    AdvertiserGroupRemote service = dfaServices.get(session, AdvertiserGroupRemote.class);

    // Assign the advertisers to the advertiser group.
    service.assignAdvertisersToAdvertiserGroup(advertiserGroupId, advertiserIds);

    // If we get to this line with no errors, the assignment succeeded.
    System.out.printf("The advertisers were successfully assigned to the advertiser group%n");
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

    long[] advertiserIds =
        new long[] {Long.parseLong(ADVERTISER_ID_ONE),
        Long.parseLong(ADVERTISER_ID_TWO)};
    long advertiserGroupId = Long.parseLong(ADVERTISER_GROUP_ID);

    runExample(dfaServices, session, advertiserIds, advertiserGroupId);
  }
}
