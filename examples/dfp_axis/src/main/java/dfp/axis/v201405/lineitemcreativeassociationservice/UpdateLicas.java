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

package dfp.axis.v201405.lineitemcreativeassociationservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201405.StatementBuilder;
import com.google.api.ads.dfp.axis.v201405.LineItemCreativeAssociation;
import com.google.api.ads.dfp.axis.v201405.LineItemCreativeAssociationPage;
import com.google.api.ads.dfp.axis.v201405.LineItemCreativeAssociationServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;

import java.util.Arrays;

/**
 * This example updates a LICA's destination URL. To determine which LICAs
 * exist, run GetAllLineItemCreativeAssociations.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: LineItemCreativeAssociationService.getLineItemCreativeAssociationsByStatement
 * Tags: LineItemCreativeAssociationService.updateLineItemCreativeAssociations
 *
 * @author Adam Rogal
 */
public class UpdateLicas {

  // Set the line item ID of the LICA.
  private static final String LINE_ITEM_ID = "INSERT_LINE_ITEM_ID_HERE";

  // Set the master or creative set ID of the LICA. For creative sets, set the
  // master creative ID.
  private static final String CREATIVE_ID = "INSERT_CREATIVE_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long lineItemId,
      long creativeId) throws Exception {
    // Get the LineItemCreativeAssociationService.
    LineItemCreativeAssociationServiceInterface licaService =
        dfpServices.get(session, LineItemCreativeAssociationServiceInterface.class);

    // Create a statement to select a single LICA for a line item.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("lineItemId = :lineItemId AND creativeId = :creativeId")
        .orderBy("lineItemId ASC, creativeId ASC")
        .limit(1)
        .withBindVariableValue("lineItemId", lineItemId)
        .withBindVariableValue("creativeId", creativeId);

    // Get the LICA.
    LineItemCreativeAssociationPage page =
        licaService.getLineItemCreativeAssociationsByStatement(statementBuilder.toStatement());

    LineItemCreativeAssociation lica = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update the destination URL.
    lica.setDestinationUrl("http://news.google.com?newTrackingParameter");

    // Update the LICA on the server.
    LineItemCreativeAssociation[] licas =
        licaService.updateLineItemCreativeAssociations(new LineItemCreativeAssociation[] {lica});

    for (LineItemCreativeAssociation updatedLica : licas) {
      System.out.printf("LICA with line item ID \"%d\" and creative ID \"%d\" was updated.\n",
          updatedLica.getLineItemId(), updatedLica.getCreativeId());
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

    runExample(dfpServices, session, Long.parseLong(LINE_ITEM_ID), Long.parseLong(CREATIVE_ID));
  }
}
