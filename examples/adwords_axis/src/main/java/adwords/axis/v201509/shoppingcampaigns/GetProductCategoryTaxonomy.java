// Copyright 2015 Google Inc. All Rights Reserved.
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

package adwords.axis.v201509.shoppingcampaigns;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201509.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201509.cm.ConstantDataServiceInterface;
import com.google.api.ads.adwords.axis.v201509.cm.ProductBiddingCategoryData;
import com.google.api.ads.adwords.axis.v201509.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.selectorfields.v201509.cm.ConstantDataField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * This example fetches the set of valid ProductBiddingCategories.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetProductCategoryTaxonomy {

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

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session)
      throws Exception {
    // Get the constant data service.
    ConstantDataServiceInterface constantDataService =
        adWordsServices.get(session, ConstantDataServiceInterface.class);
    
    Selector selector = new SelectorBuilder()
      .equals(ConstantDataField.Country, "US")
      .build();
    
    ProductBiddingCategoryData[] results =
        constantDataService.getProductBiddingCategoryData(selector);
    
    // List of top level category nodes.
    List<CategoryNode> rootCategories = Lists.newArrayList();
    // Map of category ID to category node for all categories found in the results.
    Map<Long, CategoryNode> biddingCategories = Maps.newHashMap();
    
    for (ProductBiddingCategoryData productBiddingCategoryData : results) {
      Long id = productBiddingCategoryData.getDimensionValue().getValue();
      String name = productBiddingCategoryData.getDisplayValue(0).getValue();
      CategoryNode node = biddingCategories.get(id);
      if (node == null) {
        node = new CategoryNode(id, name);
        biddingCategories.put(id, node);
      } else if (node.name == null) {
        // Ensure that the name attribute for the node is set. Name will be null for nodes added
        // to biddingCategories as a result of being a parentNode below.
        node.name = name;
      }

      if (productBiddingCategoryData.getParentDimensionValue() != null
          && productBiddingCategoryData.getParentDimensionValue().getValue() != null) {
        Long parentId = productBiddingCategoryData.getParentDimensionValue().getValue();
        CategoryNode parentNode = biddingCategories.get(parentId);
        if (parentNode == null) {
          parentNode = new CategoryNode(parentId);
          biddingCategories.put(parentId, parentNode);
        }
        parentNode.children.add(node);
      } else {
        rootCategories.add(node);
      }
    }
    displayCategories(rootCategories, "");
  }

  /**
   * Recursively prints out each category node and its children.
   *
   * @param categories the categories to print.
   * @param prefix the string to print at the beginning of each line of output.
   */
  private static void displayCategories(List<CategoryNode> categories, String prefix) {
    for (CategoryNode category : categories) {
      System.out.printf("%s%s [%s]%n", prefix, category.name, category.id);
      displayCategories(category.children, String.format("%s%s > ", prefix, category.name));
    }
  }

  /**
   * Node that tracks a product bidding category's id, name, and child nodes.
   */
  private static class CategoryNode {
    final Long id;
    String name;
    final List<CategoryNode> children;

    /**
     * Constructor for categories first encountered as non-parent elements in the results.
     *
     * @param id the ID of the category
     * @param name the name of the category
     */
    CategoryNode(Long id, String name) {
      this.children = Lists.newArrayList();
      this.id = Preconditions.checkNotNull(id);
      this.name = name;
    }

    /**
     * Constructor for categories first encountered as a parent category, in which case only the ID
     * is available.
     *
     * @param id the ID of the category
     */
    CategoryNode(Long id) {
      this(id, null);
    }
  }
}
