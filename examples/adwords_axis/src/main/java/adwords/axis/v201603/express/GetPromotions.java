// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.v201603.express;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201603.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201603.cm.Selector;
import com.google.api.ads.adwords.axis.v201603.express.Promotion;
import com.google.api.ads.adwords.axis.v201603.express.PromotionPage;
import com.google.api.ads.adwords.axis.v201603.express.PromotionServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * This example gets all promotions for an express businesses. To add a promotion, run
 * AddPromotion.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetPromotions {

  private static final int PAGE_SIZE = 100;

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

    AdWordsServices adWordsServices = new AdWordsServices();

    Long businessId = Long.valueOf("INSERT_BUSINESS_ID_HERE");

    runExample(adWordsServices, session, businessId);
  }

  public static List<Promotion> runExample(AdWordsServices adWordsServices, AdWordsSession session,
      Long businessId) throws Exception {

    session.setExpressBusinessId(businessId);

    // Get the PromotionService
    PromotionServiceInterface promotionService =
        adWordsServices.get(session, PromotionServiceInterface.class);

    int offset = 0;

    Selector selector = new SelectorBuilder()
        .fields("PromotionId",
            "Name",
            "Status",
            "DestinationUrl",
            "CallTrackingEnabled",
            "Budget",
            "PromotionCriteria",
            "RemainingBudget",
            "Creatives",
            "CampaignIds")
        .offset(offset)
        .limit(PAGE_SIZE)
        .build();

    List<Promotion> promotions = Lists.newArrayList();
    PromotionPage page;
    do {
      // Get all promotions for the business
      page = promotionService.get(selector);

      // Display promotions
      if (page.getTotalNumEntries() > 0) {
        for (Promotion promotion : page.getEntries()) {
          System.out.printf("Express promotion found with ID %d and name '%s'%n", promotion.getId(),
              promotion.getName());
          promotions.add(promotion);
        }
      } else {
        System.out.println("No promotions were found.");
      }

      offset += PAGE_SIZE;
      selector.getPaging().setStartIndex(offset);
    } while (offset < page.getTotalNumEntries());

    return promotions;
  }
}
