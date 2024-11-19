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

package admanager.axis.v202411.audiencesegmentservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202411.StatementBuilder;
import com.google.api.ads.admanager.axis.v202411.ApiError;
import com.google.api.ads.admanager.axis.v202411.ApiException;
import com.google.api.ads.admanager.axis.v202411.AudienceSegment;
import com.google.api.ads.admanager.axis.v202411.AudienceSegmentServiceInterface;
import com.google.api.ads.admanager.axis.v202411.FirstPartyAudienceSegment;
import com.google.api.ads.admanager.axis.v202411.RuleBasedFirstPartyAudienceSegment;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.admanager.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example updates a first party audience segment's member expiration days. To determine which
 * first party audience segments exist, run GetFirstPartyAudienceSegments.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class UpdateAudienceSegments {

  private static class UpdateAudienceSegmentsParams extends CodeSampleParams {
    @Parameter(
        names = ArgumentNames.AUDIENCE_SEGMENT_ID,
        required = true,
        description = "The ID of the first party audience segment to update.")
    private Long audienceSegmentId;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param audienceSegmentId the ID of the first party audience segment to update.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdManagerServices adManagerServices, AdManagerSession session, long audienceSegmentId)
      throws RemoteException {
    // Get the AudienceSegmentService.
    AudienceSegmentServiceInterface audienceSegmentService =
        adManagerServices.get(session, AudienceSegmentServiceInterface.class);

    // Create a statement to only select a specified first party audience
    // segment.
    StatementBuilder statementBuilder =
        new StatementBuilder()
            .where("WHERE id = :audienceSegmentId and type = :type")
            .orderBy("id ASC")
            .limit(1)
            .withBindVariableValue("audienceSegmentId", audienceSegmentId)
            .withBindVariableValue("type", "FIRST_PARTY");

    // Get the audience segment.
    RuleBasedFirstPartyAudienceSegment audienceSegment =
        (RuleBasedFirstPartyAudienceSegment)
            audienceSegmentService.getAudienceSegmentsByStatement(statementBuilder.toStatement())
                .getResults()[0];

    // Update the member expiration days.
    audienceSegment.setMembershipExpirationDays(180);

    // Update the audience segment on the server.
    AudienceSegment[] audienceSegments =
        audienceSegmentService.updateAudienceSegments(
            new FirstPartyAudienceSegment[] {audienceSegment});

    for (AudienceSegment updatedAudienceSegment : audienceSegments) {
      System.out.printf(
          "Audience segment with ID %d and name '%s' was updated.%n",
          updatedAudienceSegment.getId(), updatedAudienceSegment.getName());
    }
  }

  public static void main(String[] args) {
    AdManagerSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.AD_MANAGER)
              .fromFile()
              .build()
              .generateCredential();

      // Construct a AdManagerSession.
      session =
          new AdManagerSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    AdManagerServices adManagerServices = new AdManagerServices();

    UpdateAudienceSegmentsParams params = new UpdateAudienceSegmentsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.audienceSegmentId = Long.parseLong("INSERT_AUDIENCE_SEGMENT_ID_HERE");
    }

    try {
      runExample(adManagerServices, session, params.audienceSegmentId);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the admanager.axis
      // packages will return a meaningful value from toString
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }
}
