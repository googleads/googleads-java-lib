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
import com.google.api.ads.adwords.axis.v201402.cm.DateRange;
import com.google.api.ads.adwords.axis.v201402.cm.Money;
import com.google.api.ads.adwords.axis.v201402.cm.Paging;
import com.google.api.ads.adwords.axis.v201402.video.Metric;
import com.google.api.ads.adwords.axis.v201402.video.SegmentationDimension;
import com.google.api.ads.adwords.axis.v201402.video.StatsSelector;
import com.google.api.ads.adwords.axis.v201402.video.VideoCampaign;
import com.google.api.ads.adwords.axis.v201402.video.VideoCampaignPage;
import com.google.api.ads.adwords.axis.v201402.video.VideoCampaignSelector;
import com.google.api.ads.adwords.axis.v201402.video.VideoCampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats;
import com.google.api.ads.adwords.axis.v201402.video.VideoEntityStatsSummaryType;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import org.joda.time.DateTime;

/**
 * This example illustrates how to retrieve stats for a video campaign.
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
public class GetVideoCampaignStats {

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
      AdWordsServices adWordsServices, AdWordsSession session, Long campaignId) throws Exception {
    // Get the VideoCampaignService.
    VideoCampaignServiceInterface videoCampaignService =
        adWordsServices.get(session, VideoCampaignServiceInterface.class);

    // Set min date time to be January 1st of the current year.
    String minDateTime = new DateTime().toString("yyyy0101");
    // Set max date time to the current date.
    String maxDateTime = new DateTime().toString("yyyyMMdd");

    // Create selector.
    StatsSelector statsSelector = new StatsSelector();
    statsSelector.setDateRange(new DateRange(minDateTime, maxDateTime));
    statsSelector.setSegmentationDimensions(
        new SegmentationDimension[] {SegmentationDimension.DATE_MONTH});
    statsSelector.setMetrics(
        new Metric[] {Metric.VIEWS, Metric.COST, Metric.AVERAGE_CPV});
    statsSelector.setSummaryTypes(
        new VideoEntityStatsSummaryType[] {VideoEntityStatsSummaryType.ALL});
    statsSelector.setSegmentedSummaryType(VideoEntityStatsSummaryType.ALL);

    int offset = 0;

    VideoCampaignSelector selector = new VideoCampaignSelector();
    selector.setStatsSelector(statsSelector);
    selector.setIds(new long[] {campaignId});
    selector.setPaging(new Paging(offset, PAGE_SIZE));

    VideoCampaignPage page;
    do {
      // Get all campaigns.
      page = videoCampaignService.get(selector);

      // Display campaigns.
      if (page.getEntries() != null) {
        for (VideoCampaign videoCampaign : page.getEntries()) {
          System.out.printf("Campaign id %d, name '%s' and status '%s'%n",
              videoCampaign.getId(),
              videoCampaign.getName(),
              videoCampaign.getStatus());
          if (videoCampaign.getStats() != null) {
            System.out.println("\tCampaign stats:");
            System.out.println("\t\t" + format(videoCampaign.getStats()));
          }
          if (videoCampaign.getSegmentedStats() != null) {
            for (VideoEntityStats segment : videoCampaign.getSegmentedStats()) {
              System.out.println("\tCampaign segmented stats for month of "
                  + segment.getSegmentKey().getDateKey().getDate());
              System.out.println("\t\t" + format(segment));
            }
          }
        }
        if (page.getSummaryStats() != null) {
          for (VideoEntityStats summary : page.getSummaryStats()) {
            System.out.println("\tSummary of type "
                + summary.getSummaryType());
            System.out.println("\t\t" + format(summary));
          }
        }
      } else {
        System.out.println("No matching campaigns were found.");
      }

      offset += PAGE_SIZE;
      selector.getPaging().setStartIndex(offset);
    } while (offset < page.getTotalNumEntries());
  }

  private static String format(VideoEntityStats stats) {
    return String.format("Views: %s, Cost: %s, Avg. CPC: %s, Avg. CPV: %s, "
        + "Avg. CPM: %s, 25%%: %s, 50%%: %s, 75%%: %s, 100%%: %s",
        dashify(stats.getViews()),
        dashify(stats.getCost()),
        dashify(stats.getAverageCpc()),
        dashify(stats.getAverageCpv()),
        dashify(stats.getAverageCpm()),
        dashify(stats.getQuartile25Percents()),
        dashify(stats.getQuartile50Percents()),
        dashify(stats.getQuartile75Percents()),
        dashify(stats.getQuartile100Percents()));
  }

  private static String dashify(Money m) {
    return m == null ? "--" : String.valueOf(m.getMicroAmount());
  }

  private static String dashify(Number n) {
    return n == null ? "--" : String.valueOf(n);
  }
}
