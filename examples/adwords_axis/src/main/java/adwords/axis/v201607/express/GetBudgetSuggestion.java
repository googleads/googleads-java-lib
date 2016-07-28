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

package adwords.axis.v201607.express;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201607.cm.Criterion;
import com.google.api.ads.adwords.axis.v201607.cm.Language;
import com.google.api.ads.adwords.axis.v201607.cm.Location;
import com.google.api.ads.adwords.axis.v201607.cm.Money;
import com.google.api.ads.adwords.axis.v201607.express.BudgetSuggestion;
import com.google.api.ads.adwords.axis.v201607.express.BudgetSuggestionSelector;
import com.google.api.ads.adwords.axis.v201607.express.BudgetSuggestionServiceInterface;
import com.google.api.ads.adwords.axis.v201607.express.ProductService;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * This example shows how to retrieve an AdWords Express budget suggestion.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetBudgetSuggestion {

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

    runExample(adWordsServices, session);
  }

  public static BudgetSuggestion runExample(AdWordsServices adWordsServices, AdWordsSession session)
      throws Exception {
    BudgetSuggestionServiceInterface service =
        adWordsServices.get(session, BudgetSuggestionServiceInterface.class);

    BudgetSuggestionSelector selector = new BudgetSuggestionSelector();

    List<Criterion> criteria = Lists.newArrayList();

    // Criterion - Travel Agency product/service. See GetProductServices.java for an example
    // of how to get valid product/service settings.
    ProductService productService = new ProductService();
    productService.setText("Travel Agency");
    productService.setLocale("en_US");
    criteria.add(productService);

    // Criterion - English language.
    // The ID can be found in the documentation:
    // https://developers.google.com/adwords/api/docs/appendix/languagecodes
    Language language = new Language();
    language.setId(1000L);
    criteria.add(language);

    // Criterion - Mountain View, California location.
    // The ID can be found in the documentation:
    // https://developers.google.com/adwords/api/docs/appendix/geotargeting
    // https://developers.google.com/adwords/api/docs/appendix/cities-DMAregions
    Location location = new Location();
    location.setId(1014044L);
    criteria.add(location);

    selector.setCriteria(criteria.toArray(new Criterion[criteria.size()]));

    BudgetSuggestion budgetSuggestion = service.get(selector);
    
    System.out.printf("Budget suggestion for criteria is:%n"
        + "\tSuggestedBudget=%s%n"
        + "\tMin/MaxBudget=%s/%s%n"
        + "\tMin/MaxCpc=%s/%s%n"
        + "\tCPM=%s%n"
        + "\tCPC=%s%n"
        + "\tImpressions=%s%n",
        toString(budgetSuggestion.getSuggestedBudget()),
        toString(budgetSuggestion.getMinBudget()),
        toString(budgetSuggestion.getMaxBudget()),
        toString(budgetSuggestion.getMinCpc()),
        toString(budgetSuggestion.getMaxCpc()),
        toString(budgetSuggestion.getCpm()),
        toString(budgetSuggestion.getCpc()),
        budgetSuggestion.getImpressions());

    return budgetSuggestion;
  }

  /**
   * Returns a String representation of the provided Money object, or null if the object is null.
   */
  private static String toString(Money money) {
    return money == null ? null : String.valueOf(money.getMicroAmount());
  }
}
