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
import com.google.api.ads.adwords.axis.v201402.video.BaseCriterionType;
import com.google.api.ads.adwords.axis.v201402.video.BaseKeyword;
import com.google.api.ads.adwords.axis.v201402.video.CriteriaDimension;
import com.google.api.ads.adwords.axis.v201402.video.NegativeTargetingGroupCriterion;
import com.google.api.ads.adwords.axis.v201402.video.TargetingGroupCriterion;
import com.google.api.ads.adwords.axis.v201402.video.TargetingGroupCriterionPage;
import com.google.api.ads.adwords.axis.v201402.video.TargetingGroupCriterionSelector;
import com.google.api.ads.adwords.axis.v201402.video.VideoTargetingGroupCriterionServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example shows how to retrieve all keywords for a video campaign. To get
 * a list with all campaigns, run GetVideoCampaigns.java.
 *
 * Note: AdWords for Video API is a Beta feature.
 * 
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: VideoTargetingGroupCriterionService.get
 *
 * Category: adx-exclude
 *
 * @author Kevin Winter
 * @author Ray Tsang
 */
public class GetKeywordCriteria {

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

    Long campaignId = Long.valueOf("INSERT_CAMPAIGN_ID_HERE");
    
    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, campaignId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long campaignId)
          throws Exception {
    // Get the VideoTargetingGroupCriterionService.
    VideoTargetingGroupCriterionServiceInterface videoTargetingGroupCriterionService =
        adWordsServices.get(session, VideoTargetingGroupCriterionServiceInterface.class);

    int offset = 0;

    // Create selector.
    TargetingGroupCriterionSelector selector = new TargetingGroupCriterionSelector();
    selector.setCampaignIds(new long[] {campaignId});
    selector.setCriterionTypes(new BaseCriterionType[] {BaseCriterionType.KEYWORD});
    
    // Display network keywords.
    selector.setCriteriaDimension(CriteriaDimension.KEYWORD);
    selector.setPaging(new Paging(offset, PAGE_SIZE));

    TargetingGroupCriterionPage page;
    do {
      // Get all keywords.
      page = videoTargetingGroupCriterionService.get(selector);

      // Display keywords.
      if (page.getEntries() != null) {
        for (TargetingGroupCriterion targetingGroupCriterion : page.getEntries()) {
          String negative =
              (targetingGroupCriterion instanceof NegativeTargetingGroupCriterion) ?
                  " (negative)" : "";
          BaseKeyword keyword = (BaseKeyword) targetingGroupCriterion.getCriterion();
          System.out.printf("Criterion%s id %d, targeting group id %d, "
              + "and text '%s' was found.%n",
              negative,
              keyword.getId(),
              targetingGroupCriterion.getTargetingGroupId(),
              keyword.getText());
        }
      } else {
        System.out.println("No keywords were found.");
      }
      
      offset += PAGE_SIZE;
      selector.getPaging().setStartIndex(offset);
    } while (offset < page.getTotalNumEntries());
  }
}
