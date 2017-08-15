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

package dfp.axis.v201708.creativewrapperservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.CreativeWrapper;
import com.google.api.ads.dfp.axis.v201708.CreativeWrapperOrdering;
import com.google.api.ads.dfp.axis.v201708.CreativeWrapperPage;
import com.google.api.ads.dfp.axis.v201708.CreativeWrapperServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example updates a creative wrapper to the 'OUTER' wrapping order.
 * To determine which creative wrappers exist, run
 * GetAllCreativeWrappers.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateCreativeWrappers {

  private static class UpdateCreativeWrappersParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CREATIVE_WRAPPER_ID, required = true,
        description = "The ID of the creative wrapper to update.")
    private Long creativeWrapperId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long creativeWrapperId)
      throws Exception {
    // Get the CreativeWrapperService.
    CreativeWrapperServiceInterface creativeWrapperService =
        dfpServices.get(session, CreativeWrapperServiceInterface.class);

    // Create a statement to only select a single creative wrapper by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", creativeWrapperId);
    
    // Get the creative wrapper.
    CreativeWrapperPage page =
        creativeWrapperService.getCreativeWrappersByStatement(statementBuilder.toStatement());
    
    CreativeWrapper creativeWrapper = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update the creative wrapper ordering.
    creativeWrapper.setOrdering(CreativeWrapperOrdering.OUTER);

    // Update the creative wrapper on the server.
    CreativeWrapper[] creativeWrappers =
        creativeWrapperService.updateCreativeWrappers(new CreativeWrapper[] {creativeWrapper});

    for (CreativeWrapper updatedCreativeWrapper : creativeWrappers) {
      System.out.printf(
          "Creative wrapper with ID %d and wrapping order '%s' was updated.%n",
          updatedCreativeWrapper.getId(), updatedCreativeWrapper.getOrdering());
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

    UpdateCreativeWrappersParams params = new UpdateCreativeWrappersParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.creativeWrapperId = Long.parseLong("INSERT_CREATIVE_WRAPPER_ID_HERE");
    }

    runExample(dfpServices, session, params.creativeWrapperId);
  }
}
