// Copyright 2013 Google Inc. All Rights Reserved.
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

package adwords.axis.v201309.advancedoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroupBidModifier;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroupBidModifierPage;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroupBidModifierServiceInterface;
import com.google.api.ads.adwords.axis.v201309.cm.Paging;
import com.google.api.ads.adwords.axis.v201309.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example illustrates how to retrieve the first 10 ad group level bid modifiers.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file. See
 * README for more info.
 *
 * Tags: AdGroupBidModifierService.get
 *
 * @author Takeshi Hagikura
 */
public class GetAdGroupBidModifier {

  private static final int PAGE_SIZE = 10;

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

  public static void runExample(AdWordsServices adWordsServices,
      AdWordsSession session) throws Exception {
    // Get the AdGroupBidModifierService.
    AdGroupBidModifierServiceInterface adGroupBidModifierService =
        adWordsServices.get(session, AdGroupBidModifierServiceInterface.class);

    int offset = 0;

    // Create selector.
    Selector selector = new Selector();
    selector.setFields(new String[] {"CampaignId",
        "AdGroupId",
        "BidModifier",
        "Id"});
    selector.setPaging(new Paging(offset, PAGE_SIZE));

    AdGroupBidModifierPage page = adGroupBidModifierService.get(selector);
    if (page.getEntries() != null) {
      for (AdGroupBidModifier bidModifierResult : page.getEntries()) {
        String bidModifierValue =
            bidModifierResult.getBidModifier() != null
                ? bidModifierResult.getBidModifier().toString()
                : "unset";
        System.out.printf("Campaign ID '%d', AdGroup ID '%d', Criterion ID '%d', "
            + "has ad group level modifier: '%s'\n",
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
