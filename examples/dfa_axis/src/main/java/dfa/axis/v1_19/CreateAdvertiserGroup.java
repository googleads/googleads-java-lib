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
import com.google.api.ads.dfa.axis.v1_19.AdvertiserGroup;
import com.google.api.ads.dfa.axis.v1_19.AdvertiserGroupRemote;
import com.google.api.ads.dfa.axis.v1_19.AdvertiserGroupSaveResult;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates an advertiser group.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: advertisergroup.saveAdvertiserGroup
 *
 * @author Joseph DiLallo
 */
public class CreateAdvertiserGroup {

  // Set the name for the new advertiser group.
  private static final String ADVERTISER_GROUP_NAME = "INSERT_ADVERTISER_GROUP_NAME_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String advertiserGroupName) throws Exception {
    // Request the service.
    AdvertiserGroupRemote service = dfaServices.get(session, AdvertiserGroupRemote.class);

    // Create advertiser group structure.
    AdvertiserGroup advertiserGroup = new AdvertiserGroup();
    advertiserGroup.setId(0);
    advertiserGroup.setName(advertiserGroupName);

    // Create advertiser group.
    AdvertiserGroupSaveResult advertiserGroupSaveResult =
        service.saveAdvertiserGroup(advertiserGroup);

    // Display advertiser group ID.
    System.out.printf("Advertiser Group with ID \"%s\" was created.",
        advertiserGroupSaveResult.getId());
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

    runExample(dfaServices, session, ADVERTISER_GROUP_NAME);
  }
}
