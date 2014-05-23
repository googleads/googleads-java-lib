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
import com.google.api.ads.adwords.axis.v201402.video.VideoCampaign;
import com.google.api.ads.adwords.axis.v201402.video.VideoCampaignPage;
import com.google.api.ads.adwords.axis.v201402.video.VideoCampaignSelector;
import com.google.api.ads.adwords.axis.v201402.video.VideoCampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201402.video.VideoCampaignStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example illustrates how to retrieve all non-deleted video campaigns for
 * an account.
 * 
 * Note: AdWords for Video API is a Beta feature.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: VideoCampaignService.get
 *
 * Category: adx-exclude
 *
 * @author Kevin Winter
 * @author Ray Tsang
 */
public class GetVideoCampaigns {

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

    runExample(adWordsServices, session);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session)
          throws Exception {
    // Get the VideoCampaignService.
    VideoCampaignServiceInterface videoCampaignService =
        adWordsServices.get(session, VideoCampaignServiceInterface.class);

    int offset = 0;

    // Create selector.
    VideoCampaignSelector selector = new VideoCampaignSelector();
    // Select non-deleted campaigns.
    selector.setCampaignStatuses(new VideoCampaignStatus[] {
        VideoCampaignStatus.ACTIVE,
        VideoCampaignStatus.PAUSED
    });
    selector.setPaging(new Paging(offset, PAGE_SIZE));

    VideoCampaignPage page;
    do {
      // Get all non-deleted video campaigns for this account.
      page = videoCampaignService.get(selector);

      // Display video campaigns.
      if (page.getEntries() != null) {
        for (VideoCampaign videoCampaign : page.getEntries()) {
          System.out.printf("Campaign id %d, name '%s' and status '%s' found.%n",
              videoCampaign.getId(),
              videoCampaign.getName(),
              videoCampaign.getStatus());
        }
      } else {
        System.out.println("No video campaigns were found.");
      }

      offset += PAGE_SIZE;
      selector.getPaging().setStartIndex(offset);
    } while (offset < page.getTotalNumEntries());
  }
}
