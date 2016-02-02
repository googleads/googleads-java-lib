// Copyright 2016 Google Inc. All Rights Reserved.
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

package adwords.axis.v201601.optimization;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201601.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201601.cm.BidLandscapeLandscapePoint;
import com.google.api.ads.adwords.axis.v201601.cm.CriterionBidLandscape;
import com.google.api.ads.adwords.axis.v201601.cm.CriterionBidLandscapePage;
import com.google.api.ads.adwords.axis.v201601.cm.DataServiceInterface;
import com.google.api.ads.adwords.axis.v201601.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.selectorfields.v201601.cm.DataField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets a bid landscape for an ad group and a criterion. To get ad
 * groups, run GetAdGroups.java. To get criteria, run GetKeywords.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetKeywordBidSimulations {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
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
            DataField.AdGroupId,
            DataField.CriterionId,
            DataField.StartDate,
            DataField.EndDate,
            DataField.Bid,
            DataField.LocalClicks,
            DataField.LocalCost,
            DataField.LocalImpressions)
        .equals(DataField.AdGroupId, adGroupId.toString())
        .equals(DataField.CriterionId, criterionId.toString())
        .build();

    // Get bid landscape for ad group criteria.
    CriterionBidLandscapePage page = dataService.getCriterionBidLandscape(selector);

    // Display bid landscapes.
    if (page.getEntries() != null) {
      for (CriterionBidLandscape criterionBidLandscape : page.getEntries()) {
        System.out.printf("Criterion bid landscape with ad group ID %d, criterion ID %d, "
            + "start date %s, end date %s, with landscape points:%n",
            criterionBidLandscape.getAdGroupId(), criterionBidLandscape.getCriterionId(), 
            criterionBidLandscape.getStartDate(), criterionBidLandscape.getEndDate());

        for (BidLandscapeLandscapePoint bidLanscapePoint : criterionBidLandscape
            .getLandscapePoints()) {
          System.out.printf("\t{bid: %d clicks: %d cost: %d impressions: %d}%n",
              bidLanscapePoint.getBid().getMicroAmount(), bidLanscapePoint.getClicks(),
              bidLanscapePoint.getCost().getMicroAmount(), bidLanscapePoint.getImpressions());
        }
        System.out.println(" was found.");
      }
    } else {
      System.out.println("No criterion bid landscapes were found.");
    }
  }
}
