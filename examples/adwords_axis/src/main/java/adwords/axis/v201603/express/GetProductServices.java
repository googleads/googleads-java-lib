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
import com.google.api.ads.adwords.axis.v201603.express.ProductService;
import com.google.api.ads.adwords.axis.v201603.express.ProductServicePage;
import com.google.api.ads.adwords.axis.v201603.express.ProductServiceServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * This example shows how to retrieve AdWords Express product/service objects related
 * to specific criteria.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetProductServices {

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

    String productServiceSuggestion = "INSERT_PRODUCT_SERVICE_SUGGESTION_HERE";

    String localeText = "INSERT_LOCALE_TEXT_HERE";

    runExample(adWordsServices, session, productServiceSuggestion, localeText);
  }

  public static List<ProductService> runExample(AdWordsServices adWordsServices,
      AdWordsSession session, String productServiceSuggestion, String localeText) throws Exception {
    ProductServiceServiceInterface service =
        adWordsServices.get(session, ProductServiceServiceInterface.class);

    int offset = 0;
    Selector selector = new SelectorBuilder()
        .fields("ProductServiceText")
        .equals("ProductServiceText", productServiceSuggestion)
        .equals("Locale", localeText)
        .offset(offset)
        .limit(PAGE_SIZE)
        .build();

    ProductServicePage page;
    List<ProductService> productServices = Lists.newArrayList();
    do {
      page = service.get(selector);

      if (page.getTotalNumEntries() > 0) {
        for (ProductService productService : page.getEntries()) {
          System.out.printf("Product/service with text '%s' found%n", productService.getText());
          productServices.add(productService);
        }
      } else {
        System.out.println("No products/services found");
      }

      offset += PAGE_SIZE;
      selector.getPaging().setStartIndex(offset);
    } while (offset < page.getTotalNumEntries());

    System.out.printf(
        "Found %d products/services for product/service suggestion '%s' and locale '%s'%n",
        productServices.size(), productServiceSuggestion, localeText);

    return productServices;
  }
}
