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
import com.google.api.ads.dfa.axis.v1_20.CreativeGroup;
import com.google.api.ads.dfa.axis.v1_20.CreativeGroupRecordSet;
import com.google.api.ads.dfa.axis.v1_20.CreativeGroupRemote;
import com.google.api.ads.dfa.axis.v1_20.CreativeGroupSearchCriteria;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example retrieves available creative groups for a given advertiser and
 * displays the name, ID, advertiser ID, and group number. To get an advertiser
 * ID, run GetAdvertisers.java. Results are limited to the first 10.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: creativegroup.getCreativeGroups
 *
 * @author Joseph DiLallo
 */
public class GetCreativeGroups {

  // Provide the ID of the advertiser whose creative groups will be displayed.
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, long advertiserId) throws Exception {
    // Request the service.
    CreativeGroupRemote service = dfaServices.get(session, CreativeGroupRemote.class);

    // Set up creative group search criteria structure.
    CreativeGroupSearchCriteria creativeGroupSearchCriteria = new CreativeGroupSearchCriteria();
    long[] advertiserIds = new long[] {advertiserId};
    creativeGroupSearchCriteria.setAdvertiserIds(advertiserIds);

    // Get creatives groups for the selected criteria.
    CreativeGroupRecordSet creativeGroups =
        service.getCreativeGroups(creativeGroupSearchCriteria);

    // Display creative group names, IDs, advertiser IDs, and group numbers.
    if (creativeGroups.getRecords() != null) {
      for (CreativeGroup result : creativeGroups.getRecords()){
        System.out.println("Creative group with name \"" + result.getName()
            + "\" , ID \"" + result.getId()
            + "\", advertiser ID \"" + result.getAdvertiserId()
            + "\", and group number \"" + result.getGroupNumber()
            + "\" was found.");
      }
    } else {
      System.out.print("No creative groups found for your criteria");
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

    long advertiserId = Long.parseLong(ADVERTISER_ID);

    runExample(dfaServices, session, advertiserId);
  }
}
