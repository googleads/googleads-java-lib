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

package adwords.axis.v201705.basicoperations;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201705.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupAdPage;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.ExpandedTextAd;
import com.google.api.ads.adwords.axis.v201705.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201705.cm.AdGroupAdField;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets non-removed expanded text ads in an ad group. To add
 * expanded text ads, run AddExpandedTextAds.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetExpandedTextAds {

  private static final int PAGE_SIZE = 100;

  private static class GetExpandedTextAdsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
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

    GetExpandedTextAdsParams params = new GetExpandedTextAdsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
    }

    runExample(adWordsServices, session, params.adGroupId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Long adGroupId)
      throws Exception {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    int offset = 0;
    boolean morePages = true;

    // Create selector.
    SelectorBuilder builder = new SelectorBuilder();
    Selector selector =
        builder
            .fields(
                AdGroupAdField.Id,
                AdGroupAdField.Status,
                AdGroupAdField.HeadlinePart1,
                AdGroupAdField.HeadlinePart2,
                AdGroupAdField.Description)
            .orderAscBy(AdGroupAdField.Id)
            .offset(offset)
            .limit(PAGE_SIZE)
            .equals(AdGroupAdField.AdGroupId, adGroupId.toString())
            .in(AdGroupAdField.Status, "ENABLED", "PAUSED")
            .equals("AdType", "EXPANDED_TEXT_AD")
            .build();

    while (morePages) {
      // Get all ads.
      AdGroupAdPage page = adGroupAdService.get(selector);

      // Display ads.
      if (page.getEntries() != null && page.getEntries().length > 0) {
        for (AdGroupAd adGroupAd : page.getEntries()) {
          ExpandedTextAd expandedTextAd = (ExpandedTextAd) adGroupAd.getAd();
          System.out.printf(
              "Expanded text ad with ID %d, status '%s', and headline '%s - %s' was found.%n",
              adGroupAd.getAd().getId(),
              adGroupAd.getStatus(),
              expandedTextAd.getHeadlinePart1(),
              expandedTextAd.getHeadlinePart2());
        }
      } else {
        System.out.println("No expanded text ads were found.");
      }

      offset += PAGE_SIZE;
      selector = builder.increaseOffsetBy(PAGE_SIZE).build();
      morePages = offset < page.getTotalNumEntries();
    }
  }
}
