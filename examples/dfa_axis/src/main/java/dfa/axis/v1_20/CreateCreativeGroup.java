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
import com.google.api.ads.dfa.axis.v1_20.CreativeGroupRemote;
import com.google.api.ads.dfa.axis.v1_20.CreativeGroupSaveResult;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a creative group associated with a given advertiser. To
 * get an advertiser ID, run getAdvertisers.java. Valid group numbers are
 * limited to 1 or 2.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateCreativeGroup {

  // Set the parameters for the new creative group.
  private static final String CREATIVE_GROUP_NAME = "INSERT_CREATIVE_GROUP_NAME_HERE";
  private static final String GROUP_NUMBER = "INSERT_GROUP_NUMBER_HERE";
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String creativeGroupName, int groupNumber,
      long advertiserId) throws Exception {
    // Request the service.
    CreativeGroupRemote service = dfaServices.get(session, CreativeGroupRemote.class);

    // Create the creative group.
    CreativeGroup creativeGroup = new CreativeGroup();
    creativeGroup.setId(-1);
    creativeGroup.setName(creativeGroupName);
    creativeGroup.setGroupNumber(groupNumber);
    creativeGroup.setAdvertiserId(advertiserId);

    // Save the creative group.
    CreativeGroupSaveResult creativeGroupSaveResult = service.saveCreativeGroup(creativeGroup);

    // Display the new creative group ID.
    System.out.printf("Creative group with ID \"%s\" was created.%n",
        creativeGroupSaveResult.getId());
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

    int groupNumber = Integer.parseInt(GROUP_NUMBER);
    long advertiserId = Long.parseLong(ADVERTISER_ID);

    runExample(dfaServices, session, CREATIVE_GROUP_NAME, groupNumber, advertiserId);
  }
}
