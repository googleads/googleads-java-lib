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

package dfp.axis.v201302.creativewrapperservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201302.CreativeWrapper;
import com.google.api.ads.dfp.axis.v201302.CreativeWrapperOrdering;
import com.google.api.ads.dfp.axis.v201302.CreativeWrapperServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example updates a creative wrapper to the 'OUTER' wrapping order.
 * To determine which creative wrappers exist, run
 * GetAllCreativeWrappers.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CreativeWrapperService.getCreativeWrapper
 * Tags: CreativeWrapperService.updateCreativeWrappers
 *
 * @author Adam Rogal
 */
public class UpdateCreativeWrappers {

  // Set the ID of the creative wrapper to update.
  private static final String CREATIVE_WRAPPER_ID = "INSERT_CREATIVE_WRAPPER_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long creativeWrapperId)
      throws Exception {
    // Get the CreativeWrapperService.
    CreativeWrapperServiceInterface creativeWrapperService =
        dfpServices.get(session, CreativeWrapperServiceInterface.class);

    // Get the creative wrapper.
    CreativeWrapper creativeWrapper = creativeWrapperService.getCreativeWrapper(creativeWrapperId);

    // Update the creative wrapper ordering.
    creativeWrapper.setOrdering(CreativeWrapperOrdering.OUTER);

    // Update the creative wrapper on the server.
    CreativeWrapper[] creativeWrappers =
        creativeWrapperService.updateCreativeWrappers(new CreativeWrapper[] {creativeWrapper});

    for (CreativeWrapper updatedCreativeWrapper : creativeWrappers) {
      System.out.printf(
          "Creative wrapper with ID \"%d\" and wrapping order \"%s\" was updated.\n",
          updatedCreativeWrapper.getId(), updatedCreativeWrapper.getOrdering());
    }
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

    runExample(dfpServices, session, Long.parseLong(CREATIVE_WRAPPER_ID));
  }
}
