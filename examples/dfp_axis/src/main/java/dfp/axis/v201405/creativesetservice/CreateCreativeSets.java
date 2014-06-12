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

package dfp.axis.v201405.creativesetservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201405.CreativeSet;
import com.google.api.ads.dfp.axis.v201405.CreativeSetServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.primitives.Longs;

import java.util.Random;

/**
 * This example creates new creative sets. To determine which creative sets
 * exist, run GetAllCreativeSets.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CreativeSetService.createCreativeSet
 *
 * @author Adam Rogal
 */
public class CreateCreativeSets {

  // Set the ID of the master creative in the creative set.
  private static final String MASTER_CREATIVE_ID = "INSERT_MASTER_CREATIVE_ID_HERE";

  // Set the ID of the companion creative in the creative set.
  private static final String COMPANION_CREATIVE_ID = "INSERT_COMPANION_CREATIVE_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long masterCreativeId, long companionCreativeId) throws Exception {
    // Get the CreativeSetService.
    CreativeSetServiceInterface creativeSetService =
        dfpServices.get(session, CreativeSetServiceInterface.class);

    CreativeSet creativeSet = new CreativeSet();
    creativeSet.setName("Creative set #" + new Random().nextInt(Integer.MAX_VALUE));
    creativeSet.setMasterCreativeId(masterCreativeId);
    creativeSet.setCompanionCreativeIds(new long[] {companionCreativeId});

    // Create the creative set on the server.
    CreativeSet createdCreativeSet = creativeSetService.createCreativeSet(creativeSet);

    System.out.printf("A creative set with ID \"%d\", master creative ID \"%d\", "
        + "and companion creative IDs [%s] was created.\n", createdCreativeSet.getId(),
        createdCreativeSet.getMasterCreativeId(),
        Longs.join(",", createdCreativeSet.getCompanionCreativeIds()));
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

    runExample(dfpServices, session, Long.parseLong(MASTER_CREATIVE_ID),
        Long.parseLong(COMPANION_CREATIVE_ID));
  }
}
