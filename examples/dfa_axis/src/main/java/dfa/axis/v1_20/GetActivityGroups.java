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
import com.google.api.ads.dfa.axis.v1_20.SpotlightActivityGroupRecordSet;
import com.google.api.ads.dfa.axis.v1_20.SpotlightActivityGroupSearchCriteria;
import com.google.api.ads.dfa.axis.v1_20.SpotlightRemote;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example displays activity groups names and IDs for a given advertiser.
 * To create an advertiser, run CreateAdvertiser.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: spotlight.getSpotlightActivityGroups
 *
 * @author Joseph DiLallo
 */
public class GetActivityGroups {

  // Provide the ID of the advertiser whose activity groups will be displayed/
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, long advertiserId) throws Exception {
    // Request the service.
    SpotlightRemote service = dfaServices.get(session, SpotlightRemote.class);

    // Set activity group search criteria structure and
    // use advertiser ID as search criteria.
    SpotlightActivityGroupSearchCriteria activityGroupSearchCriteria =
        new SpotlightActivityGroupSearchCriteria();
    activityGroupSearchCriteria.setAdvertiserId(advertiserId);

    // Get activity group.
    SpotlightActivityGroupRecordSet spotlightActivityGroupRecordSet =
        service.getSpotlightActivityGroups(activityGroupSearchCriteria);

    // Display activity group names and IDs.
    if (spotlightActivityGroupRecordSet.getRecords() != null) {
      for (SpotlightActivityGroup result : spotlightActivityGroupRecordSet.getRecords()) {
        System.out.println("Activity group with name \"" + result.getName()
            + "\" and ID \"" + result.getId() + "\" was found.");
      }
    } else {
      System.out.print("No activity groups found for your criteria.");
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
