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

package dfp.axis.v201508.audiencesegmentservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201508.StatementBuilder;
import com.google.api.ads.dfp.axis.v201508.AudienceSegment;
import com.google.api.ads.dfp.axis.v201508.AudienceSegmentPage;
import com.google.api.ads.dfp.axis.v201508.AudienceSegmentServiceInterface;
import com.google.api.ads.dfp.axis.v201508.PopulateAudienceSegments;
import com.google.api.ads.dfp.axis.v201508.UpdateResult;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example populates a specific rule base first party audience segment.
 * To determine which audience segments exist, run GetAllAudienceSegments.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class PopulateFirstPartyAudienceSegments {

  // Set the ID of the first party audience segment to populate.
  private static final String AUDIENCE_SEGMENT_ID = "INSERT_AUDIENCE_SEGMENT_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long audienceSegmentId) throws Exception {
    // Get the AudienceSegmentService.
    AudienceSegmentServiceInterface audienceSegmentService =
        dfpServices.get(session, AudienceSegmentServiceInterface.class);

    // Create a statement to only select a specified first party audience
    // segment.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE id = :audienceSegmentId and type = :type")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("audienceSegmentId", audienceSegmentId)
        .withBindVariableValue("type", "FIRST_PARTY");

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get audience segments by statement.
      AudienceSegmentPage page =
          audienceSegmentService.getAudienceSegmentsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (AudienceSegment audienceSegment : page.getResults()) {
          System.out.printf(
              "%d) Audience segment with ID %d and name '%s' will be populated.%n", i++,
              audienceSegment.getId(), audienceSegment.getName());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of audience segments to be populated: %d%n", totalResultSetSize);

    if (totalResultSetSize > 0) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      PopulateAudienceSegments action = new PopulateAudienceSegments();

      // Perform action.
      UpdateResult result = audienceSegmentService.performAudienceSegmentAction(
          action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.printf("Number of audience segments populated: %d%n", result.getNumChanges());
      } else {
        System.out.println("No audience segments were populated.");
      }
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

    runExample(dfpServices, session, Long.parseLong(AUDIENCE_SEGMENT_ID));
  }
}
