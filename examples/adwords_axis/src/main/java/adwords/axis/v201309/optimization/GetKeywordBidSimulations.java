// Copyright 2012 Google Inc. All Rights Reserved.
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

package adwords.axis.v201309.optimization;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201309.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201309.cm.BidLandscapeLandscapePoint;
import com.google.api.ads.adwords.axis.v201309.cm.CriterionBidLandscape;
import com.google.api.ads.adwords.axis.v201309.cm.CriterionBidLandscapePage;
import com.google.api.ads.adwords.axis.v201309.cm.DataServiceInterface;
import com.google.api.ads.adwords.axis.v201309.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets a bid landscape for an ad group and a criterion. To get ad
 * groups, run GetAdGroups.java. To get criteria, run GetKeywords.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: DataService.get
 *
 * Category: adx-exclude
 *
 * @author Kevin Winter
 */
public class GetKeywordBidSimulations {

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

    Long adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
    Long criterionId = Long.parseLong("INSERT_CRITERION_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId, criterionId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long adGroupId,
      Long criterionId) throws Exception {
    // Get the DataService.
    DataServiceInterface dataService =
        adWordsServices.get(session, DataServiceInterface.class);

    // Create selector.
    Selector selector = new SelectorBuilder()
        .fields(
            "AdGroupId",
            "CriterionId",
            "StartDate",
            "EndDate",
            "Bid",
            "LocalClicks",
            "LocalCost",
            "MarginalCpc",
            "LocalImpressions")
        .equals("AdGroupId", adGroupId.toString())
        .equals("CriterionId", criterionId.toString())
        .build();

    // Get bid landscape for ad group criteria.
    CriterionBidLandscapePage page = dataService.getCriterionBidLandscape(selector);

    // Display bid landscapes.
    if (page.getEntries() != null) {
      for (CriterionBidLandscape criterionBidLandscape : page.getEntries()) {
        System.out.println("Criterion bid landscape with ad group id \""
            + criterionBidLandscape.getAdGroupId() + "\", criterion id \""
            + criterionBidLandscape.getCriterionId() + "\", start date \""
            + criterionBidLandscape.getStartDate() + "\", end date \""
            + criterionBidLandscape.getEndDate() + "\", with landscape points: ");

        for (BidLandscapeLandscapePoint bidLanscapePoint : criterionBidLandscape
            .getLandscapePoints()) {
          System.out.println("\t{bid: " + bidLanscapePoint.getBid().getMicroAmount() + " clicks: "
              + bidLanscapePoint.getClicks() + " cost: "
              + bidLanscapePoint.getCost().getMicroAmount() + " marginalCpc: "
              + bidLanscapePoint.getMarginalCpc().getMicroAmount() + " impressions: "
              + bidLanscapePoint.getImpressions() + "}");
        }
        System.out.println(" was found.");
      }
    } else {
      System.out.println("No criterion bid landscapes were found.");
    }
  }
}
