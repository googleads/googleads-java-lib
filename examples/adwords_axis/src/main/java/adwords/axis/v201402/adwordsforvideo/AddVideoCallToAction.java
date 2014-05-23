// Copyright 2014 Google Inc. All Rights Reserved.
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

package adwords.axis.v201402.adwordsforvideo;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201402.cm.Operator;
import com.google.api.ads.adwords.axis.v201402.video.CallToAction;
import com.google.api.ads.adwords.axis.v201402.video.CallToActionCreative;
import com.google.api.ads.adwords.axis.v201402.video.VideoCallToAction;
import com.google.api.ads.adwords.axis.v201402.video.VideoCallToActionOperation;
import com.google.api.ads.adwords.axis.v201402.video.VideoReturnValue;
import com.google.api.ads.adwords.axis.v201402.video.VideoServiceInterface;
import com.google.api.ads.adwords.axis.v201402.video.YouTubeVideo;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example illustrates how to create a video call to action overlay.
 * To get video IDs, see FindVideos.java.
 *
 * Note: AdWords for Video API is a Beta feature.
 * 
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: VideoService.mutate
 *
 * Category: adx-exclude
 *
 * @author Takeshi Hagikura
 * @author Ray Tsang
 */
public class AddVideoCallToAction {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    AdWordsServices adWordsServices = new AdWordsServices();

    String videoId = "INSERT_VIDEO_ID_HERE";

    runExample(adWordsServices, session, videoId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, String videoId)
          throws Exception {
    // Get the VideoService.
    VideoServiceInterface videoService =
        adWordsServices.get(session, VideoServiceInterface.class);

    // Create the call to action.
    VideoCallToAction videoCallToAction = new VideoCallToAction();
    videoCallToAction.setId(videoId);
    
    CallToAction callToAction = new CallToAction();
    CallToActionCreative callToActionCreative = new CallToActionCreative();
    callToActionCreative.setHeadline("Mars cruise");
    callToActionCreative.setDescriptionLine1("Astonishing views");
    callToActionCreative.setDescriptionLine2("Mild climate");
    callToActionCreative.setDisplayUrl("www.example.com/mars");
    callToActionCreative.setDestinationUrl("www.example.com/mars");
    callToAction.setCreative(callToActionCreative);
    videoCallToAction.setCallToAction(callToAction);

    VideoCallToActionOperation operation = new VideoCallToActionOperation();
    operation.setOperand(videoCallToAction);
    
    // Use SET to add a new Call to Action, or to overwrite an existing one.
    operation.setOperator(Operator.SET);

    VideoCallToActionOperation[] operations = new VideoCallToActionOperation[] {operation};

    // Add video call to action.
    VideoReturnValue result = videoService.mutateCallToAction(operations);

    for (YouTubeVideo youTubeVideoResult : result.getValue()) {
      System.out.printf("CallToAction overlay was added to video ID %s, "
          + "headline '%s'.%n",
          youTubeVideoResult.getId(),
          youTubeVideoResult.getCallToAction().getCreative().getHeadline());
    }
  }
}
