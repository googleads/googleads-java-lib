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

package adwords.axis.v201603.shoppingcampaigns;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201603.shopping.ProductDimensions;
import com.google.api.ads.adwords.axis.utils.v201603.shopping.ProductPartitionNode;
import com.google.api.ads.adwords.axis.utils.v201603.shopping.ProductPartitionTree;
import com.google.api.ads.adwords.axis.v201603.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201603.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201603.cm.ProductCanonicalConditionCondition;
import com.google.api.ads.adwords.axis.v201603.cm.ProductDimensionType;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import java.util.List;

/**
 * This example clears out any existing ProductPartition criteria on the ad group and rebuilds the
 * tree to contain:
 *
 * <pre>
 *ROOT
 *ProductCanonicalCondition NEW $0.20
 *ProductCanonicalCondition USED $0.10
 *ProductCanonicalCondition null (everything else)
 *  ProductBrand CoolBrand $0.90
 *  ProductBrand CheapBrand $0.01
 *  ProductBrand null (everything else)
 *    ProductType Level1 Luggage & Bags $0.75
 *    ProductType Level1 null (everything else) $0.11
 *</pre>
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddProductPartitionTree {
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

    Long adGroupId = Long.valueOf("INSERT_AD_GROUP_ID_HERE");
    
    runExample(adWordsServices, session, adGroupId);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session,
      Long adGroupId) throws Exception {
    // Build a new ProductPartitionTree using the ad group's current set of criteria.
    ProductPartitionTree partitionTree =
        ProductPartitionTree.createAdGroupTree(adWordsServices, session, adGroupId);

    System.out.printf("Original tree:%n%s%n", partitionTree);

    // Clear out any existing criteria.
    ProductPartitionNode rootNode = partitionTree.getRoot().removeAllChildren();

    // Make the root node a subdivision.
    rootNode = rootNode.asSubdivision();

    // Add a unit node for condition = NEW.
    rootNode.addChild(
        ProductDimensions.createCanonicalCondition(ProductCanonicalConditionCondition.NEW))
        .asBiddableUnit().setBid(200000L);

    // Add a unit node for condition = USED.
    rootNode.addChild(
        ProductDimensions.createCanonicalCondition(ProductCanonicalConditionCondition.USED))
        .asBiddableUnit().setBid(100000L);

    // Add a subdivision node for condition = null (everything else).
    ProductPartitionNode otherConditionNode =
        rootNode.addChild(ProductDimensions.createCanonicalCondition(null)).asSubdivision();

    // Add a unit node under condition = null for brand = "CoolBrand".
    otherConditionNode.addChild(ProductDimensions.createBrand("CoolBrand")).asBiddableUnit()
        .setBid(900000L);

    // Add a unit node under condition = null for brand = "CheapBrand".
    otherConditionNode.addChild(ProductDimensions.createBrand("CheapBrand")).asBiddableUnit()
        .setBid(10000L);

    // Add a subdivision node under condition = null for brand = null (everything else).
    ProductPartitionNode otherBrandNode =
        otherConditionNode.addChild(ProductDimensions.createBrand(null)).asSubdivision();

    // Add unit nodes under condition = null/brand = null.
    // The value for each bidding category is a fixed ID for a specific
    // category. You can retrieve IDs for categories from the ConstantDataService.
    // See the 'GetProductCategoryTaxonomy' example for more details.

    // Add a unit node under condition = null/brand = null for product type
    // level 1 = 'Luggage & Bags'.
    otherBrandNode.addChild(ProductDimensions.createBiddingCategory(
        ProductDimensionType.BIDDING_CATEGORY_L1, -5914235892932915235L)).asBiddableUnit()
        .setBid(750000L);

    // Add a unit node under condition = null/brand = null for product type
    // level 1 = null (everything else).
    otherBrandNode.addChild(
        ProductDimensions.createBiddingCategory(ProductDimensionType.BIDDING_CATEGORY_L1, null))
        .asBiddableUnit().setBid(110000L);

    // Get the ad group criterion service.
    AdGroupCriterionServiceInterface adGroupCriterionService =
        adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

    // Make the mutate request, using the operations returned by the ProductPartitionTree.
    List<AdGroupCriterionOperation> mutateOperations = partitionTree.getMutateOperations();

    if (mutateOperations.isEmpty()) {
      System.out.println("Skipping the mutate call because the original tree and the current tree "
          + "are logically identical.");
    } else {
      adGroupCriterionService.mutate(mutateOperations.toArray(new AdGroupCriterionOperation[0]));
    }

    // The request was successful, so create a new ProductPartitionTree based on the updated state
    // of the ad group.
    partitionTree = ProductPartitionTree.createAdGroupTree(adWordsServices, session, adGroupId);

    // Show the tree
    System.out.printf("Updated tree:%n%s%n", partitionTree);
  }
}
