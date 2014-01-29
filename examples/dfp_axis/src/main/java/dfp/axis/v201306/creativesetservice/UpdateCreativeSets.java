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

package dfp.axis.v201306.creativesetservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201306.CreativeSet;
import com.google.api.ads.dfp.axis.v201306.CreativeSetServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.primitives.Longs;

/**
 * This example adds a companion creative to a creative set. To determine which
 * creative sets exist, run GetAllCreativeSets.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CreativeSetService.getCreativeSet
 * Tags: CreativeSetService.updateCreativeSet
 *
 * @author Adam Rogal
 */
public class UpdateCreativeSets {

  // Set the ID of the creative set to update.
  private static final String CREATIVE_SET_ID = "INSERT_CREATIVE_SET_ID";

  // Set the ID of the companion creative to add to the creative set.
  private static final String COMPANION_CREATIVE_ID = "INSERT_COMPANION_CREATIVE_ID";

  public static void runExample(
      DfpServices dfpServices, DfpSession session, long creativeSetId, long companionCreativeId)
      throws Exception {
    // Get the CreativeSetService.
    CreativeSetServiceInterface creativeSetService =
        dfpServices.get(session, CreativeSetServiceInterface.class);

    // Get the creative set.
    CreativeSet creativeSet = creativeSetService.getCreativeSet(creativeSetId);

    // Add the companion creative to the creative set.
    creativeSet.setCompanionCreativeIds(
        Longs.concat(creativeSet.getCompanionCreativeIds(), new long[] {companionCreativeId}));

    // Update the creative set on the server.
    CreativeSet updatedCreativeSet = creativeSetService.updateCreativeSet(creativeSet);

    System.out.printf("A creative set with ID \"%d\", master creative ID \"%d\", "
        + "and companion creative IDs [%s] was updated.", updatedCreativeSet.getId(),
        updatedCreativeSet.getMasterCreativeId(),
        Longs.join(",", updatedCreativeSet.getCompanionCreativeIds()));
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

    runExample(dfpServices, session, Long.parseLong(CREATIVE_SET_ID),
        Long.parseLong(COMPANION_CREATIVE_ID));
  }
}
