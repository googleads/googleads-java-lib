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
 * This example illustrates how to update video ad status by video ad format.
 * 
 * Note: AdWords for Video API is a Beta feature.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: VideoAdService.mutate
 *
 * Category: adx-exclude
 *
 * @author Ray Tsang
 */
public class UpdateStatusByFormat {
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

    Long videoAdId = Long.valueOf("INSERT_VIDEO_AD_ID");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, videoAdId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long videoAdId)
          throws Exception {
    // Get the VideoCampaignService.
    VideoAdServiceInterface videoAdService =
        adWordsServices.get(session, VideoAdServiceInterface.class);

    VideoAdDisplayFormat_VideoAdStatusMapEntry trueViewStatus =
        new VideoAdDisplayFormat_VideoAdStatusMapEntry();
    
    trueViewStatus.setKey(VideoAdDisplayFormat.TRUE_VIEW_IN_DISPLAY);
    trueViewStatus.setValue(VideoAdStatus.PAUSED);

    VideoAd ad = new VideoAd();
    ad.setId(videoAdId);
    ad.setStatusByFormat(new VideoAdDisplayFormat_VideoAdStatusMapEntry[] {trueViewStatus});

    VideoAdOperation operation = new VideoAdOperation();
    operation.setOperand(ad);
    operation.setOperator(Operator.SET);

    VideoAdReturnValue result = videoAdService.mutate(new VideoAdOperation[] {operation});
    
    for (VideoAd videoAdResult : result.getValue()) {
      System.out.printf("Video ad with id %d was updated.%n",
          videoAdResult.getId());
    }
  }
}
