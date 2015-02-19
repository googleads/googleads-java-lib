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

package dfp.axis.v201502.creativeservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201502.StatementBuilder;
import com.google.api.ads.dfp.axis.v201502.Creative;
import com.google.api.ads.dfp.axis.v201502.CreativePage;
import com.google.api.ads.dfp.axis.v201502.CreativeServiceInterface;
import com.google.api.ads.dfp.axis.v201502.HasDestinationUrlCreative;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;

import java.util.Arrays;

/**
 * This example updates the creative destination URL. To determine which
 * creatives exist, run GetAllCreatives.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CreativeService.getCreativesByStatement
 * Tags: CreativeService.updateCreatives
 *
 * @author Adam Rogal
 */
public class UpdateCreatives {

  // Set the ID of the creative to update.
  private static final String CREATIVE_ID = "INSERT_CREATIVE_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long creativeId)
      throws Exception {
    // Get the CreativeService.
    CreativeServiceInterface creativeService =
        dfpServices.get(session, CreativeServiceInterface.class);

    // Create a statement to only select a single creative by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", creativeId);
      
    // Get the creative.
    CreativePage page =
        creativeService.getCreativesByStatement(statementBuilder.toStatement());
      
    Creative creative = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Only update the destination URL if it has one.
    if (creative instanceof HasDestinationUrlCreative) {
      HasDestinationUrlCreative hasDestinationUrlCreative = (HasDestinationUrlCreative) creative;

      // Update the destination URL of the creative.
      hasDestinationUrlCreative.setDestinationUrl("http://news.google.com");

      // Update the creative on the server.
      Creative[] creatives = creativeService.updateCreatives(new Creative[] {creative});

      for (Creative updatedCreative : creatives) {
        System.out.printf(
            "Creative with ID \"%d\" and name \"%s\" was updated.\n",
            updatedCreative.getId(), updatedCreative.getName());
      }
    } else {
      System.out.println("No creatives were updated.");
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

    runExample(dfpServices, session, Long.parseLong(CREATIVE_ID));
  }
}
