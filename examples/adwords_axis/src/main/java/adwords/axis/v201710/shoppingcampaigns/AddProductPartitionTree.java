// Copyright 2017 Google Inc. All Rights Reserved.
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

package adwords.axis.v201710.shoppingcampaigns;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201710.shopping.ProductDimensions;
import com.google.api.ads.adwords.axis.utils.v201710.shopping.ProductPartitionNode;
import com.google.api.ads.adwords.axis.utils.v201710.shopping.ProductPartitionTree;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.ProductCanonicalConditionCondition;
import com.google.api.ads.adwords.axis.v201710.cm.ProductDimensionType;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
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
  private static class AddProductPartitionTreeParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

  public static void main(String[] args) {
    AdWordsSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.ADWORDS)
              .fromFile()
              .build()
              .generateCredential();

      // Construct an AdWordsSession.
      session =
          new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    
    AddProductPartitionTreeParams params = new AddProductPartitionTreeParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
    }

    try {
      runExample(adWordsServices, session, params.adGroupId);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the adwords.axis
      // packages will return a meaningful value from toString
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf(
          "Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @param adGroupId the ID of the ad group.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session,
      Long adGroupId) throws RemoteException {
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
