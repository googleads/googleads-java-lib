// Copyright 2017 Google Inc. All Rights Reserved.
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

package adwords.axis.v201705.optimization;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201705.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201705.cm.BidLandscapeLandscapePoint;
import com.google.api.ads.adwords.axis.v201705.cm.CriterionBidLandscape;
import com.google.api.ads.adwords.axis.v201705.cm.CriterionBidLandscapePage;
import com.google.api.ads.adwords.axis.v201705.cm.DataServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201705.cm.DataField;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets a bid landscape for an ad group and a criterion. To get ad
 * groups, run GetAdGroups.java. To get criteria, run GetKeywords.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetKeywordBidSimulations {

  private static class GetKeywordBidSimulationsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    @Parameter(names = ArgumentNames.CRITERION_ID, required = true)
    private Long criterionId;
  }

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

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    GetKeywordBidSimulationsParams params = new GetKeywordBidSimulationsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      params.criterionId = Long.parseLong("INSERT_CRITERION_ID_HERE");
    }

    runExample(adWordsServices, session, params.adGroupId, params.criterionId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Long adGroupId,
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
