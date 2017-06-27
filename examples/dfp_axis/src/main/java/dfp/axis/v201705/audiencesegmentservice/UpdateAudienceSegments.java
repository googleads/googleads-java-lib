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

package dfp.axis.v201705.audiencesegmentservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201705.StatementBuilder;
import com.google.api.ads.dfp.axis.v201705.AudienceSegment;
import com.google.api.ads.dfp.axis.v201705.AudienceSegmentServiceInterface;
import com.google.api.ads.dfp.axis.v201705.FirstPartyAudienceSegment;
import com.google.api.ads.dfp.axis.v201705.RuleBasedFirstPartyAudienceSegment;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example updates a first party audience segment's member expiration days.
 * To determine which first party audience segments exist, run
 * GetFirstPartyAudienceSegments.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateAudienceSegments {

  private static class UpdateAudienceSegmentsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AUDIENCE_SEGMENT_ID, required = true,
        description = "The ID of the first party audience segment to update.")
    private Long audienceSegmentId;
  }

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

    // Get the audience segment.
    RuleBasedFirstPartyAudienceSegment audienceSegment =
        (RuleBasedFirstPartyAudienceSegment) audienceSegmentService
            .getAudienceSegmentsByStatement(statementBuilder.toStatement()).getResults()[0];

    // Update the member expiration days.
    audienceSegment.setMembershipExpirationDays(180);

    // Update the audience segment on the server.
    AudienceSegment[] audienceSegments = audienceSegmentService.updateAudienceSegments(
        new FirstPartyAudienceSegment[] {audienceSegment});

    for (AudienceSegment updatedAudienceSegment : audienceSegments) {
      System.out.printf(
          "Audience segment with ID %d and name '%s' was updated.%n",
          updatedAudienceSegment.getId(), updatedAudienceSegment.getName());
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

    UpdateAudienceSegmentsParams params = new UpdateAudienceSegmentsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.audienceSegmentId = Long.parseLong("INSERT_AUDIENCE_SEGMENT_ID_HERE");
    }

    runExample(dfpServices, session, params.audienceSegmentId);
  }
}
