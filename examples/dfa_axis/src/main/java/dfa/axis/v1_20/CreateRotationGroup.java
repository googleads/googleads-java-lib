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

package dfa.axis.v1_20;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_20.AdRemote;
import com.google.api.ads.dfa.axis.v1_20.AdSaveResult;
import com.google.api.ads.dfa.axis.v1_20.ClickThroughUrl;
import com.google.api.ads.dfa.axis.v1_20.CreativeAssignment;
import com.google.api.ads.dfa.axis.v1_20.PlacementAssignment;
import com.google.api.ads.dfa.axis.v1_20.RotationGroup;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Calendar;

/**
 * This example creates a rotation group ad in a given campaign. To get ad types
 * run GetAdTypes.java. Start and end date for the ad must be within campaign
 * start and end dates. To create creatives, run CreateCreatives.java. To get
 * available placements, run GetPlacement.java. To get a size ID, run
 * GetSize.java example.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateRotationGroup {

  // Set the parameters for the new ad rotation group.
  private static final String AD_NAME = "INSERT_AD_NAME_HERE";
  private static final String CAMPAIGN_ID = "INSERT_CAMPAIGN_ID_HERE";
  private static final String SIZE_ID = "INSERT_SIZE_ID_HERE";
  private static final String CREATIVE_ID = "INSERT_CREATIVE_ID_HERE";
  private static final String PLACEMENT_ID = "INSERT_PLACEMENT_ID_HERE";

  public static void runExample(DfaServices dfaServices, DfaSession session, String adName,
      long campaignId, long sizeId, long creativeId, long placementId) throws Exception {
    // Request the service.
    AdRemote service = dfaServices.get(session, AdRemote.class);

    // Create a rotation group.
    RotationGroup rotationGroup = new RotationGroup();
    rotationGroup.setId(0);
    rotationGroup.setName(adName);
    rotationGroup.setActive(true);
    rotationGroup.setArchived(false);
    rotationGroup.setCampaignId(campaignId);
    rotationGroup.setSizeId(sizeId);
    rotationGroup.setTypeId(1);
    rotationGroup.setPriority(12);
    rotationGroup.setRatio(1);

    // Set the ad start date. This example uses tomorrow's date.
    Calendar startTime = Calendar.getInstance();
    startTime.add(Calendar.DATE, 1);
    rotationGroup.setStartTime(startTime);

    // Set the ad end date. This example uses one month from today's date.
    Calendar endTime = Calendar.getInstance();
    endTime.add(Calendar.MONTH, 1);
    rotationGroup.setEndTime(endTime);

    // Add creatives to the ad.
    CreativeAssignment creativeAssignment = new CreativeAssignment();
    creativeAssignment.setActive(true);
    creativeAssignment.setCreativeId(creativeId);

    // Create the click through URL.
    ClickThroughUrl clickThroughUrl = new ClickThroughUrl();
    clickThroughUrl.setDefaultLandingPageUsed(true);
    clickThroughUrl.setLandingPageId(0);
    creativeAssignment.setClickThroughUrl(clickThroughUrl);

    // Create the creative assignments.
    CreativeAssignment[] creativeAssignments = new CreativeAssignment[]{creativeAssignment};
    rotationGroup.setCreativeAssignments(creativeAssignments);
    rotationGroup.setRotationType(1);

    // Assign an ad to the placement.
    PlacementAssignment placementAssignment = new PlacementAssignment();
    placementAssignment.setActive(true);
    placementAssignment.setPlacementId(placementId);
    PlacementAssignment[] placementAssignments = new PlacementAssignment[]{placementAssignment};
    rotationGroup.setPlacementAssignments(placementAssignments);

    // Save the rotation group.
    AdSaveResult adSaveResult = service.saveAd(rotationGroup);

    // Display the new ad ID.
    System.out.printf("Ad with ID \"%s\" was created.%n", adSaveResult.getId());
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

    long campaignId = Long.parseLong(CAMPAIGN_ID);
    long sizeId = Long.parseLong(SIZE_ID);
    long creativeId = Long.parseLong(CREATIVE_ID);
    long placementId = Long.parseLong(PLACEMENT_ID);

    runExample(dfaServices, session, AD_NAME, campaignId, sizeId, creativeId, placementId);
  }
}
