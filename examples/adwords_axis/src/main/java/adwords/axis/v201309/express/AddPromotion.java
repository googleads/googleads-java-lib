// Copyright 2013 Google Inc. All Rights Reserved.
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

package adwords.axis.v201309.express;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201309.cm.Criterion;
import com.google.api.ads.adwords.axis.v201309.cm.Language;
import com.google.api.ads.adwords.axis.v201309.cm.Money;
import com.google.api.ads.adwords.axis.v201309.cm.Operator;
import com.google.api.ads.adwords.axis.v201309.cm.Predicate;
import com.google.api.ads.adwords.axis.v201309.cm.PredicateOperator;
import com.google.api.ads.adwords.axis.v201309.cm.Proximity;
import com.google.api.ads.adwords.axis.v201309.cm.ProximityDistanceUnits;
import com.google.api.ads.adwords.axis.v201309.cm.Selector;
import com.google.api.ads.adwords.axis.v201309.express.Creative;
import com.google.api.ads.adwords.axis.v201309.express.ExpressBusiness;
import com.google.api.ads.adwords.axis.v201309.express.ExpressBusinessServiceInterface;
import com.google.api.ads.adwords.axis.v201309.express.ProductService;
import com.google.api.ads.adwords.axis.v201309.express.Promotion;
import com.google.api.ads.adwords.axis.v201309.express.PromotionOperation;
import com.google.api.ads.adwords.axis.v201309.express.PromotionServiceInterface;
import com.google.api.ads.adwords.axis.v201309.express.PromotionStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * This example adds a new promotion to an express business. To get promotions, run
 * GetPromotions.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file. See
 * README for more info.
 *
 * Tags: PromotionService.mutate
 *
 * @author Josh Radcliff
 */
public class AddPromotion {

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

    Long businessId = Long.valueOf("INSERT_BUSINESS_ID_HERE");

    runExample(adWordsServices, session, businessId);
  }

  public static List<Promotion> runExample(AdWordsServices adWordsServices, AdWordsSession session,
      Long businessId) throws Exception {
    ExpressBusinessServiceInterface businessService =
        adWordsServices.get(session, ExpressBusinessServiceInterface.class);

    // Get the business for the businessId. We will need its geo point to create
    // a Proximity criterion for the new Promotion.
    Selector businessSelector = new Selector();
    businessSelector.setPredicates(new Predicate[] {
        new Predicate("Id", PredicateOperator.EQUALS, new String[] {String.valueOf(businessId)})});
    businessSelector.setFields(new String[] {"Id", "GeoPoint"});

    ExpressBusiness business = businessService.get(businessSelector).getEntries(0);

    // Get the PromotionService
    PromotionServiceInterface promotionService =
        adWordsServices.get(session, PromotionServiceInterface.class);

    // PromotionService requires the businessId on the session
    session.setExpressBusinessId(businessId);

    // Set up the new Promotion
    Promotion marsTourPromotion = new Promotion();
    Money budget = new Money();
    budget.setMicroAmount(1000000L);
    marsTourPromotion.setName("Mars Tour Promotion " + System.currentTimeMillis());
    marsTourPromotion.setStatus(PromotionStatus.PAUSED);
    marsTourPromotion.setDestinationUrl("http://www.example.com");
    marsTourPromotion.setBudget(budget);
    marsTourPromotion.setCallTrackingEnabled(true);

    // Criteria
    List<Criterion> criteria = Lists.newArrayList();

    // Criterion - Travel Agency product service
    ProductService productService = new ProductService();
    productService.setText("Travel Agency");
    criteria.add(productService);

    // Criterion - English language
    // The ID can be found in the documentation:
    // https://developers.google.com/adwords/api/docs/appendix/languagecodes
    Language language = new Language();
    language.setId(1000L);
    criteria.add(language);

    // Criterion - Within 15 miles
    Proximity proximity = new Proximity();
    proximity.setGeoPoint(business.getGeoPoint());
    proximity.setRadiusDistanceUnits(ProximityDistanceUnits.MILES);
    proximity.setRadiusInUnits(15d);
    criteria.add(proximity);

    marsTourPromotion.setCriteria(criteria.toArray(new Criterion[criteria.size()]));

    // Creatives
    List<Creative> creatives = Lists.newArrayList();
    Creative creative1 =
        new Creative("Standard Mars Trip", "Fly coach to Mars", "Free in-flight pretzels");
    creatives.add(creative1);

    Creative creative2 = new Creative("Deluxe Mars Trip", "Fly first class to Mars",
        "Unlimited powdered orange drink");
    creatives.add(creative2);

    marsTourPromotion.setCreatives(creatives.toArray(new Creative[creatives.size()]));

    Promotion[] addedPromotions = promotionService.mutate(
        new PromotionOperation[] {new PromotionOperation(Operator.ADD, null, marsTourPromotion)});

    System.out.printf("Added promotion ID %d with name '%s' to business ID %d%n",
        addedPromotions[0].getId(), addedPromotions[0].getName(), businessId);

    return Arrays.asList(addedPromotions);
  }
}
