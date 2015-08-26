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
import com.google.api.ads.dfa.axis.v1_20.CreativeRemote;
import com.google.api.ads.dfa.axis.v1_20.CreativeSaveResult;
import com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates an In-Stream video creative associated with a given
 * advertiser. If a campaign is specified, the creative is also associated with
 * that campaign.
 *
 * To associate In-Stream assets with an In-Stream video creative, first create
 * the creative and then run UploadInStreamAsset.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateInStreamVideoCreative {

  // Set the parameters for the new In-Stream video creative.
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_ID_HERE";
  private static final String VIDEO_DURATION = "INSERT_VIDEO_DURATION_HERE";
  private static final String AD_ID = "INSERT_VAST_AD_ID_HERE";
  private static final String SURVEY_URL = "INSERT_VAST_SURVEY_URL_HERE";
  private static final String CLICK_THROUGH_URL = "INSERT_VAST_CLICK_THROUGH_URL_HERE";
  // You may optionally set a campaign ID. If the campaign ID is set to 0, then
  // the creative will be associated only with the advertiser.
  private static final String CAMPAIGN_ID = "0";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, long advertiserId,
      float videoDuration, String adId, String surveyUrl,
      String clickThroughUrl, long campaignId) throws Exception {

    // Request the creative service from the service client factory.
    CreativeRemote creativeService = dfaServices.get(session, CreativeRemote.class);

    // Create the In-Stream video creative.
    InStreamVideoCreative inStreamVideoCreative = new InStreamVideoCreative();
    inStreamVideoCreative.setAdvertiserId(advertiserId);
    inStreamVideoCreative.setName("In-Stream Video Creative #" + System.currentTimeMillis());
    inStreamVideoCreative.setVideoDuration(videoDuration);
    // In-Stream video creatives have to be created inactive. One can only be
    // set active after at least one media file has been added to it or the API
    // will return an error message.
    inStreamVideoCreative.setActive(false);

    // Set the video details based on the Video Ad Serving Template (VAST)
    // specification.
    inStreamVideoCreative.setAdId(adId);
    inStreamVideoCreative.setDescription("You are viewing an In-Stream Video Creative");
    inStreamVideoCreative.setSurveyUrl(surveyUrl);
    inStreamVideoCreative.setClickThroughUrl(clickThroughUrl);

    // Save the In-Stream video creative.
    CreativeSaveResult creativeSaveResult = creativeService.saveCreative(inStreamVideoCreative,
        campaignId);

    // Display the new creative ID.
    System.out.printf("In-Stream video creative with ID \"%s\" was created.%n",
        creativeSaveResult.getId());
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

    long advertiserId = Long.parseLong(ADVERTISER_ID);
    long campaignId = Long.parseLong(CAMPAIGN_ID);
    float videoDuration = Float.parseFloat(VIDEO_DURATION);

    runExample(dfaServices, session, advertiserId, videoDuration, AD_ID, SURVEY_URL,
        CLICK_THROUGH_URL, campaignId);
  }
}
