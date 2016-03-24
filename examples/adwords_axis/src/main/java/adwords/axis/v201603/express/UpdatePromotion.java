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
import com.google.api.ads.adwords.axis.v201603.cm.Money;
import com.google.api.ads.adwords.axis.v201603.cm.Operator;
import com.google.api.ads.adwords.axis.v201603.express.Promotion;
import com.google.api.ads.adwords.axis.v201603.express.PromotionOperation;
import com.google.api.ads.adwords.axis.v201603.express.PromotionServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example updates a promotion for an express businesses. To add a promotion, run
 * AddPromotion.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdatePromotion {

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
    Long promotionId = Long.valueOf("INSERT_PROMOTION_ID_HERE");

    runExample(adWordsServices, session, businessId, promotionId);
  }

  public static Promotion runExample(AdWordsServices adWordsServices, AdWordsSession session,
      Long businessId, Long promotionId) throws Exception {
    // Get the PromotionService
    PromotionServiceInterface promotionService =
        adWordsServices.get(session, PromotionServiceInterface.class);

    // PromotionService requires an Express business ID
    session.setExpressBusinessId(businessId);

    // Update the budget for the promotion
    Promotion promotion = new Promotion();
    promotion.setId(promotionId);
    Money newBudget = new Money();
    newBudget.setMicroAmount(2000000L);
    promotion.setBudget(newBudget);

    Promotion[] mutatedPromotions = promotionService.mutate(
        new PromotionOperation[] {new PromotionOperation(Operator.SET, null, promotion)});

    System.out.printf("Promotion ID %d for business ID %d now has budget micro amount %,d%n",
        promotionId, businessId, mutatedPromotions[0].getBudget().getMicroAmount());

    return mutatedPromotions[0];
  }
}
