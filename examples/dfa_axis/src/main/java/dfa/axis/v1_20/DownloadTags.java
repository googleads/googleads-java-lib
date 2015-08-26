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
import com.google.api.ads.dfa.axis.v1_20.PlacementRemote;
import com.google.api.ads.dfa.axis.v1_20.PlacementTagCriteria;
import com.google.api.ads.dfa.axis.v1_20.PlacementTagData;
import com.google.api.ads.dfa.axis.v1_20.PlacementTagOption;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example downloads HTML Tags for a given campaign and placement ID.
 * To create campaigns, run CreateCampaigns.java. To create placements, run
 * GetPlacements.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class DownloadTags {

  private static final String CAMPAIGN_ID = "INSERT_CAMPAIGN_ID_HERE";
  private static final String PLACEMENT_ID = "INSERT_PLACEMENT_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, long campaignId, long placementId)
          throws Exception {
    // Request the service.
    PlacementRemote service = dfaServices.get(session, PlacementRemote.class);

    // Set placement tag search criteria.
    PlacementTagCriteria placementTagCriteria = new PlacementTagCriteria();
    placementTagCriteria.setId(placementId);

    // Get placement tag options.
    PlacementTagOption[] placementTagOptions = service.getRegularPlacementTagOptions();

    long[] tagOptionIds = new long[placementTagOptions.length];

    // Add all types of tags to the tag option structure.
    for (int i = 0; i < placementTagOptions.length; i++) {
      tagOptionIds[i] = placementTagOptions[i].getId();
    }

    placementTagCriteria.setTagOptionIds(tagOptionIds);
    PlacementTagCriteria[] placementTagCriterias =
        new PlacementTagCriteria[]{placementTagCriteria};

    // Get HTML tags for the placements.
    PlacementTagData placementTagData =
        service.getPlacementTagData(campaignId, placementTagCriterias);

    // Display tags for the placement ID used as criteria.
    System.out.println("Iframe/JavaScript tag for placement \""
        + placementTagData.getPlacementTagInfos()[0].getPlacement().getName() + "\" is \n"
        + placementTagData.getPlacementTagInfos()[0].getIframeJavaScriptTag() + "\n");

    System.out.println("JavaScript tag for placement \""
        + placementTagData.getPlacementTagInfos()[0].getPlacement().getName() + "\" is \n"
        + placementTagData.getPlacementTagInfos()[0].getJavaScriptTag() + "\n");

    System.out.println("Standard tag for placement \""
        + placementTagData.getPlacementTagInfos()[0].getPlacement().getName() + "\" is \n"
        + placementTagData.getPlacementTagInfos()[0].getStandardTag() + "\n");

    System.out.println("Internal Redirect tag for placement \""
        + placementTagData.getPlacementTagInfos()[0].getPlacement().getName() + "\" is \n"
        + placementTagData.getPlacementTagInfos()[0].getInternalRedirectTag() + "");
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
    long placementId = Long.parseLong(PLACEMENT_ID);

    runExample(dfaServices, session, campaignId, placementId);
  }
}
