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
import com.google.api.ads.adwords.axis.v201402.cm.Paging;
import com.google.api.ads.adwords.axis.v201402.video.VideoSearchPage;
import com.google.api.ads.adwords.axis.v201402.video.VideoSearchSelector;
import com.google.api.ads.adwords.axis.v201402.video.VideoSearchSelectorSearchType;
import com.google.api.ads.adwords.axis.v201402.video.VideoServiceInterface;
import com.google.api.ads.adwords.axis.v201402.video.YouTubeVideo;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example illustrates how to find YouTube videos by a search string. It
 * retrieves details for the first 100 matching videos.
 *
 * Note: AdWords for Video API is a Beta feature.
 * 
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: VideoService.search
 *
 * Category: adx-exclude
 *
 * @author Kevin Winter
 * @author Ray Tsang
 */
public class FindVideos {

  private static final int PAGE_SIZE = 100;

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
    
    String query = "INSERT_QUERY_STRING_HERE";

    runExample(adWordsServices, session, query);
  }

  public static void runExample(AdWordsServices adWordsServices,
      AdWordsSession session, String query)
      throws Exception {

    // Get the VideoCampaignService.
    VideoServiceInterface videoService = adWordsServices.get(session, VideoServiceInterface.class);

    // Create a selector.
    VideoSearchSelector selector = new VideoSearchSelector();
    selector.setSearchType(VideoSearchSelectorSearchType.VIDEO);
    selector.setQuery(query);
    selector.setPaging(new Paging(0, PAGE_SIZE));

    // Run the query.
    VideoSearchPage page = videoService.search(selector);

    // Display videos.
    if (page.getTotalNumEntries() > 0) {
      for (YouTubeVideo video : page.getEntries()) {
        System.out.printf("YouTube video id %s with title '%s' found.%n",
            video.getId(),
            video.getTitle());
      }
      System.out.printf("Total number of matching videos: %d.%n",
          page.getTotalNumEntries());
    } else {
      System.out.printf("No videos matching '%s' were found.%n", query);
    }
  }
}
