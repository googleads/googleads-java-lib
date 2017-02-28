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

package adwords.axis.v201702.advancedoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201702.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201702.cm.AdGroupBidModifier;
import com.google.api.ads.adwords.axis.v201702.cm.AdGroupBidModifierPage;
import com.google.api.ads.adwords.axis.v201702.cm.AdGroupBidModifierServiceInterface;
import com.google.api.ads.adwords.axis.v201702.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201702.cm.AdGroupBidModifierField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example illustrates how to retrieve the first 10 ad group level bid modifiers.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetAdGroupBidModifier {

  private static final int PAGE_SIZE = 10;

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

    runExample(adWordsServices, session);
  }

  public static void runExample(AdWordsServicesInterface adWordsServices,
      AdWordsSession session) throws Exception {
    // Get the AdGroupBidModifierService.
    AdGroupBidModifierServiceInterface adGroupBidModifierService =
        adWordsServices.get(session, AdGroupBidModifierServiceInterface.class);

    // Create selector.
    Selector selector = new SelectorBuilder()
        .fields(
            AdGroupBidModifierField.CampaignId,
            AdGroupBidModifierField.AdGroupId,
            AdGroupBidModifierField.BidModifier,
            AdGroupBidModifierField.Id)
        .offset(0)
        .limit(PAGE_SIZE)
        .build();

    AdGroupBidModifierPage page = adGroupBidModifierService.get(selector);
    if (page.getEntries() != null) {
      for (AdGroupBidModifier bidModifierResult : page.getEntries()) {
        String bidModifierValue =
            bidModifierResult.getBidModifier() != null
                ? bidModifierResult.getBidModifier().toString()
                : "unset";
        System.out.printf("Campaign ID %d, AdGroup ID %d, Criterion ID %d, "
            + "has ad group level modifier: %s%n",
            bidModifierResult.getCampaignId(),
            bidModifierResult.getAdGroupId(),
            bidModifierResult.getCriterion().getId(),
            bidModifierValue);
      }
    } else {
      System.out.println("No ad group level bid modifiers were found.");
    }
  }
}
