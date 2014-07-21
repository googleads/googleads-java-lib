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
import com.google.api.ads.adwords.axis.v201406.cm.Paging;
import com.google.api.ads.adwords.axis.v201406.video.CriteriaDimension;
import com.google.api.ads.adwords.axis.v201406.video.NegativeTargetingGroupCriterion;
import com.google.api.ads.adwords.axis.v201406.video.TargetingGroupCriterion;
import com.google.api.ads.adwords.axis.v201406.video.TargetingGroupCriterionPage;
import com.google.api.ads.adwords.axis.v201406.video.TargetingGroupCriterionSelector;
import com.google.api.ads.adwords.axis.v201406.video.VideoTargetingGroupCriterionServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example demonstrates how to retrieve all criteria in a
 * video targeting group.
 *
 * Note: AdWords for Video API is a Beta feature.
 * 
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: VideoCampaignCriterionService.get
 *
 * Category: adx-exclude
 *
 * @author Ray Tsang
 */
public class GetTargetingGroupCriteria {

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
    
    Long targetingGroupId = Long.valueOf("INSERT_TARGETING_GROUP_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, targetingGroupId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session,
      Long targetingGroupId) throws Exception {
    // Get the VideoCampaignCriterionService.
    VideoTargetingGroupCriterionServiceInterface videoTargetingGroupCriterionService =
        adWordsServices.get(session, VideoTargetingGroupCriterionServiceInterface.class);

    int offset = 0;

    // Create selector.
    TargetingGroupCriterionSelector selector = new TargetingGroupCriterionSelector();
    selector.setTargetingGroupIds(new long[] {targetingGroupId});
    selector.setCriteriaDimension(CriteriaDimension.KEYWORD);
    selector.setPaging(new Paging(offset, PAGE_SIZE));

    TargetingGroupCriterionPage page;
    do {
      // Get all criteria for the campaign.
      page = videoTargetingGroupCriterionService.get(selector);

      // Display criteria.
      if (page.getEntries() != null) {
        for (TargetingGroupCriterion targetingGroupCampaignCriterion : page.getEntries()) {
          String negative =
              (targetingGroupCampaignCriterion instanceof NegativeTargetingGroupCriterion)
                  ? " (negative)"
                  : "";
          System.out.printf("Video%s criterion id %d of type '%s' was found.%n",
              negative,
              targetingGroupCampaignCriterion.getCriterion().getId(),
              targetingGroupCampaignCriterion.getCriterion().getBaseCriterionType());
        }
      } else {
        System.out.println("No criteria were found.");
      }

      offset += PAGE_SIZE;
      selector.getPaging().setStartIndex(offset);
    } while (offset < page.getTotalNumEntries());
  }
}
