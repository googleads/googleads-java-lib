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

package adwords.axis.v201406.adwordsforvideo;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201406.cm.Operator;
import com.google.api.ads.adwords.axis.v201406.video.VideoAd;
import com.google.api.ads.adwords.axis.v201406.video.VideoAdDisplayFormat;
import com.google.api.ads.adwords.axis.v201406.video.VideoAdDisplayFormat_VideoAdStatusMapEntry;
import com.google.api.ads.adwords.axis.v201406.video.VideoAdOperation;
import com.google.api.ads.adwords.axis.v201406.video.VideoAdReturnValue;
import com.google.api.ads.adwords.axis.v201406.video.VideoAdServiceInterface;
import com.google.api.ads.adwords.axis.v201406.video.VideoAdStatus;
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
 * @author Ray Tsang
 */
public class AddVideoAd {

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

    Long campaignId = Long.valueOf("INSERT_CAMPAIGN_ID_HERE");

    String videoId = "INSERT_VIDEO_ID_HERE";

    runExample(adWordsServices, session, campaignId, videoId);
  }

  public static void runExample(AdWordsServices adWordsServices,
      AdWordsSession session, Long campaignId, String videoId)
          throws Exception {
    // Get the VideoAdService
    VideoAdServiceInterface videoAdService =
        adWordsServices.get(session, VideoAdServiceInterface.class);
    
    // Create a new VideoAd.
    VideoAd videoAd = new VideoAd();
    videoAd.setCampaignId(campaignId);
    videoAd.setName("Video ad #" + System.currentTimeMillis());
    videoAd.setStatus(VideoAdStatus.PAUSED);

    VideoAdDisplayFormat_VideoAdStatusMapEntry trueViewStatus =
        new VideoAdDisplayFormat_VideoAdStatusMapEntry(
          VideoAdDisplayFormat.TRUE_VIEW_IN_STREAM,
          VideoAdStatus.ENABLED);
    videoAd.setStatusByFormat(
      new VideoAdDisplayFormat_VideoAdStatusMapEntry[] {trueViewStatus});

    videoAd.setHeadline("Best headline");
    videoAd.setDestinationUrl("http://www.example.com");
    videoAd.setDisplayUrl("www.example.com");
    videoAd.setDescription1("My favorite line 1");
    videoAd.setDescription2("My favorite line 2");
    videoAd.setVideoId(videoId);
    
    VideoAdOperation operation = new VideoAdOperation();
    operation.setOperand(videoAd);
    operation.setOperator(Operator.ADD);

    VideoAdOperation[] operations = new VideoAdOperation[] {operation};
    
    VideoAdReturnValue result = videoAdService.mutate(operations);

    for (VideoAd videoAdResult : result.getValue()) {
      System.out.printf("Video ad with campaign id %d, "
          + "video ad id %d, and name '%s' was added.%n",
          videoAdResult.getCampaignId(),
          videoAdResult.getId(),
          videoAdResult.getName());
    }
  }
}
