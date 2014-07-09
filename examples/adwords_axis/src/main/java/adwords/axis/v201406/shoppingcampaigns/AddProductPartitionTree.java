// Copyright 2014 Google Inc. All Rights Reserved.
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

package adwords.axis.v201406.shoppingcampaigns;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201406.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201406.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201406.cm.AdGroupCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201406.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201406.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201406.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201406.cm.Bids;
import com.google.api.ads.adwords.axis.v201406.cm.CpcBid;
import com.google.api.ads.adwords.axis.v201406.cm.Money;
import com.google.api.ads.adwords.axis.v201406.cm.NegativeAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201406.cm.Operator;
import com.google.api.ads.adwords.axis.v201406.cm.ProductBiddingCategory;
import com.google.api.ads.adwords.axis.v201406.cm.ProductBrand;
import com.google.api.ads.adwords.axis.v201406.cm.ProductCanonicalCondition;
import com.google.api.ads.adwords.axis.v201406.cm.ProductCanonicalConditionCondition;
import com.google.api.ads.adwords.axis.v201406.cm.ProductDimension;
import com.google.api.ads.adwords.axis.v201406.cm.ProductDimensionType;
import com.google.api.ads.adwords.axis.v201406.cm.ProductPartition;
import com.google.api.ads.adwords.axis.v201406.cm.ProductPartitionType;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * This example creates a ProductPartitionTree.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: AdGroupCriterionService.mutate
 *
 * @author Josh Radcliff
 */
public class AddProductPartitionTree {
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

    Long adGroupId = Long.valueOf("INSERT_AD_GROUP_ID_HERE");
    
    runExample(adWordsServices, session, adGroupId);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session,
      Long adGroupId) throws Exception {
    // Get the ad group criterion service.
    AdGroupCriterionServiceInterface adGroupCriterionService =
        adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

    ProductPartitionHelper helper = new ProductPartitionHelper(adGroupId);

    // The most trivial partition tree has only a unit nodes as the root:
    // helper.createUnit(null, null, 100000L);

    ProductPartition root = helper.createSubdivision(null, null);

    ProductCanonicalCondition newProductCondition = new ProductCanonicalCondition();
    newProductCondition.setCondition(ProductCanonicalConditionCondition.NEW);
    helper.createUnit(root, newProductCondition, 200000L);

    ProductCanonicalCondition usedProductCondition = new ProductCanonicalCondition();
    usedProductCondition.setCondition(ProductCanonicalConditionCondition.USED);
    helper.createUnit(root, usedProductCondition, 100000L);

    ProductPartition otherCondition =
        helper.createSubdivision(root, new ProductCanonicalCondition());

    ProductBrand coolProductBrand = new ProductBrand();
    coolProductBrand.setValue("CoolBrand");
    helper.createUnit(otherCondition, coolProductBrand, 900000L);

    ProductBrand cheapProductBrand = new ProductBrand();
    cheapProductBrand.setValue("CheapBrand");
    helper.createUnit(otherCondition, cheapProductBrand, 10000L);

    ProductPartition otherBrand = helper.createSubdivision(otherCondition, new ProductBrand());

    // The value for the bidding category is a fixed ID for the 'Luggage & Bags'
    // category. You can retrieve IDs for categories from the ConstantDataService.
    // See the 'GetProductCategoryTaxonomy' example for more details.
    ProductBiddingCategory biddingCategory = new ProductBiddingCategory();
    biddingCategory.setType(ProductDimensionType.BIDDING_CATEGORY_L1);
    biddingCategory.setValue(-5914235892932915235L);
    helper.createUnit(otherBrand, biddingCategory, 750000L);

    ProductBiddingCategory otherBiddingCategory = new ProductBiddingCategory();
    otherBiddingCategory.setType(ProductDimensionType.BIDDING_CATEGORY_L1);
    helper.createUnit(otherBrand, otherBiddingCategory, 110000L);

    // Make the mutate request.
    AdGroupCriterionReturnValue result = adGroupCriterionService.mutate(helper.getOperations());

    // For each criterion, make a list containing each of its children.
    // We always create the parent before the child, so we can rely on that here.
    Map<Long, List<ProductPartition>> children = Maps.newHashMap();
    ProductPartition rootNode = null;
    for (AdGroupCriterion adGroupCriterion : result.getValue()) {
      children.put(adGroupCriterion.getCriterion().getId(), Lists.<ProductPartition>newArrayList());

      if (!(adGroupCriterion.getCriterion() instanceof ProductPartition)) {
        throw new IllegalStateException("Expected criterion of ProductPartition but found "
            + adGroupCriterion.getCriterion() + ".");
      }
      ProductPartition criterion = (ProductPartition) adGroupCriterion.getCriterion();
      if (criterion.getParentCriterionId() != null) {
        List<ProductPartition> criterionChildren = children.get(criterion.getParentCriterionId());
        criterionChildren.add(criterion);
      } else {
        rootNode = criterion;
      }
    }

    // Show the tree
    displayTree(rootNode, children, 0);
  }

  /**
   * Recursively display a node and each of its children
   */
  private static void displayTree(ProductPartition node, Map<Long, List<ProductPartition>> children,
      int level) {
    String value = null;
    String type = null;

    if (node.getCaseValue() != null) {
      ProductDimension nodeCaseValue = node.getCaseValue();
      type = nodeCaseValue.getProductDimensionType();
      if (nodeCaseValue instanceof ProductCanonicalCondition) {
        value = String.valueOf(((ProductCanonicalCondition) nodeCaseValue).getCondition());
      } else if (nodeCaseValue instanceof ProductBiddingCategory) {
        ProductBiddingCategory productBiddingCategory = (ProductBiddingCategory) nodeCaseValue;
        value = String.format("%s(%s)", productBiddingCategory.getType(),
            productBiddingCategory.getValue());
      } else if (nodeCaseValue instanceof ProductBrand){
        ProductBrand productBrand = (ProductBrand) nodeCaseValue;
        value = productBrand.getValue();
      } else {
        value = nodeCaseValue.toString();
      }
    }

    System.out.printf("%sid: %d, type: %s, value: %s%n", Strings.repeat("  ", level), node.getId(),
        type, value);
    for (ProductPartition childNode : children.get(node.getId())) {
      displayTree(childNode, children, level + 1);
    }
  }

  private static class ProductPartitionHelper {
    /**
     * The next temporary criterion ID to be used.
     *
     * When creating our tree we need to specify the parent-child relationships
     * between nodes. However, until a criterion has been created on the server
     * we do not have a criterionId with which to refer to it.
     *
     * Instead we can specify temporary IDs that are specific to a single mutate
     * request. Once the criteria have been created they are assigned an ID as
     * normal and the temporary ID will no longer refer to it.
     *
     * A valid temporary ID is any negative long.
     */
    private long nextId = -1;

    /**
     * The set of mutate operations needed to create the current tree.
     */
    private List<AdGroupCriterionOperation> operations = Lists.newArrayList();

    /**
     * The ID of the AdGroup that we wish to attach the partition tree to.
     */
    private Long adGroupId;

    /**
     * Constructor
     * @param adGroupId the ID of the AdGroup that we wish to attach the
     *                       partition tree to.
     */
    public ProductPartitionHelper(Long adGroupId) {
      this.adGroupId = adGroupId;
    }

    public AdGroupCriterionOperation[] getOperations() {
      return operations.toArray(new AdGroupCriterionOperation[operations.size()]);
    }

    /**
     * Creates a subdivision node
     * @param  parent the node that should be this node's parent
     * @param  value the value being partitioned on
     * @return a new subdivision node
     */
    public ProductPartition createSubdivision(ProductPartition parent, ProductDimension value) {
      ProductPartition division = new ProductPartition();
      division.setPartitionType(ProductPartitionType.SUBDIVISION);
      
      division.setId(nextId--);

      // The root node has neither a parent nor a value
      if (parent != null) {
        division.setParentCriterionId(parent.getId());
        division.setCaseValue(value);
      }

      BiddableAdGroupCriterion criterion = new BiddableAdGroupCriterion();
      criterion.setAdGroupId(adGroupId);
      criterion.setCriterion(division);

      operations.add(createAddOperation(criterion));

      return division;
    }
    
    /**
     * Creates a unit node.
     * @param  parent the node that should be this node's parent
     * @param  value the value being partitioned on
     * @param  bidAmount the amount to bid for matching products, in micros
     * @return a new unit node
     */
    public ProductPartition createUnit(ProductPartition parent, ProductDimension value,
        Long bidAmount) {
      ProductPartition unit = new ProductPartition();
      unit.setPartitionType(ProductPartitionType.UNIT);

      // The root node has neither a parent nor a value
      if (parent != null) {
        unit.setParentCriterionId(parent.getId());
        unit.setCaseValue(value);
      }

      AdGroupCriterion criterion;
      if (bidAmount != null && bidAmount > 0) {
        BiddingStrategyConfiguration biddingStrategyConfiguration =
            new BiddingStrategyConfiguration();
        
        Money bidAmountMoney = new Money();
        bidAmountMoney.setMicroAmount(bidAmount);
        CpcBid cpcBid = new CpcBid();
        cpcBid.setBid(bidAmountMoney);
        biddingStrategyConfiguration.setBids(new Bids[] {cpcBid});
        BiddableAdGroupCriterion biddableCriterion = new BiddableAdGroupCriterion();
        biddableCriterion.setBiddingStrategyConfiguration(biddingStrategyConfiguration);
        criterion = biddableCriterion;
      } else {
        criterion = new NegativeAdGroupCriterion();
      }
      
      criterion.setAdGroupId(adGroupId);
      criterion.setCriterion(unit);
      
      operations.add(createAddOperation(criterion));

      return unit;
    }
    
    /**
     * Creates an AdGroupCriterionOperation for the given criterion.
     * 
     * @param criterion the criterion to add
     * @return the new operation
     */
    private AdGroupCriterionOperation createAddOperation(AdGroupCriterion criterion) {
      AdGroupCriterionOperation operation = new AdGroupCriterionOperation();
      operation.setOperand(criterion);
      operation.setOperator(Operator.ADD);
      return operation;
    }
  }
}
