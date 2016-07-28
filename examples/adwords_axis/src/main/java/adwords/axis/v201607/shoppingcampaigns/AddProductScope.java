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

package adwords.axis.v201607.shoppingcampaigns;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201607.cm.CampaignCriterion;
import com.google.api.ads.adwords.axis.v201607.cm.CampaignCriterionOperation;
import com.google.api.ads.adwords.axis.v201607.cm.CampaignCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201607.cm.CampaignCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201607.cm.Operator;
import com.google.api.ads.adwords.axis.v201607.cm.ProductBiddingCategory;
import com.google.api.ads.adwords.axis.v201607.cm.ProductBrand;
import com.google.api.ads.adwords.axis.v201607.cm.ProductCanonicalCondition;
import com.google.api.ads.adwords.axis.v201607.cm.ProductCanonicalConditionCondition;
import com.google.api.ads.adwords.axis.v201607.cm.ProductCustomAttribute;
import com.google.api.ads.adwords.axis.v201607.cm.ProductDimension;
import com.google.api.ads.adwords.axis.v201607.cm.ProductDimensionType;
import com.google.api.ads.adwords.axis.v201607.cm.ProductOfferId;
import com.google.api.ads.adwords.axis.v201607.cm.ProductScope;
import com.google.api.ads.adwords.axis.v201607.cm.ProductType;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example restricts the products that will be included in the
 * campaign by setting a ProductScope.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddProductScope {
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

    Long campaignId = Long.valueOf("INSERT_CAMPAIGN_ID_HERE");
    
    runExample(adWordsServices, session, campaignId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long campaignId) throws Exception {
    // Get the campaign criterion service.
    CampaignCriterionServiceInterface campaignCriterionService = adWordsServices.get(session,
        CampaignCriterionServiceInterface.class);
    
    ProductScope productScope = new ProductScope();

    // This set of dimensions is for demonstration purposes only. It would be
    // extremely unlikely that you want to include so many dimensions in your
    // product scope.
    ProductBrand productBrand = new ProductBrand();
    productBrand.setValue("Nexus");

    ProductCanonicalCondition productCanonicalCondition = new ProductCanonicalCondition();
    productCanonicalCondition.setCondition(ProductCanonicalConditionCondition.NEW);

    ProductCustomAttribute productCustomAttribute = new ProductCustomAttribute();
    productCustomAttribute.setType(ProductDimensionType.CUSTOM_ATTRIBUTE_0);
    productCustomAttribute.setValue("my attribute value");

    ProductOfferId productOfferId = new ProductOfferId();
    productOfferId.setValue("book1");

    ProductType productTypeLevel1Media = new ProductType();
    productTypeLevel1Media.setType(ProductDimensionType.PRODUCT_TYPE_L1);
    productTypeLevel1Media.setValue("Media");

    ProductType productTypeLevel2Books = new ProductType();
    productTypeLevel2Books.setType(ProductDimensionType.PRODUCT_TYPE_L2);
    productTypeLevel2Books.setValue("Books");

    // The value for the bidding category is a fixed ID for the 'Luggage & Bags'
    // category. You can retrieve IDs for categories from the ConstantDataService.
    // See the 'GetProductCategoryTaxonomy' example for more details.
    ProductBiddingCategory productBiddingCategory = new ProductBiddingCategory();
    productBiddingCategory.setType(ProductDimensionType.BIDDING_CATEGORY_L1);
    productBiddingCategory.setValue(-5914235892932915235L);
    
    productScope.setDimensions(new ProductDimension[]{ productBrand, productCanonicalCondition,
        productCustomAttribute, productOfferId, productTypeLevel1Media, productTypeLevel2Books,
        productBiddingCategory});

    CampaignCriterion campaignCriterion = new CampaignCriterion();
    campaignCriterion.setCampaignId(campaignId);
    campaignCriterion.setCriterion(productScope);
    
    // Create operation.
    CampaignCriterionOperation criterionOperation = new CampaignCriterionOperation();
    criterionOperation.setOperand(campaignCriterion);
    criterionOperation.setOperator(Operator.ADD);
    
    // Make the mutate request.
    CampaignCriterionReturnValue result =
        campaignCriterionService.mutate(new CampaignCriterionOperation[] {criterionOperation});

    // Display the result.
    System.out.printf("Created a ProductScope criterion with ID %d.%n",
        result.getValue(0).getCriterion().getId());
  }
}
