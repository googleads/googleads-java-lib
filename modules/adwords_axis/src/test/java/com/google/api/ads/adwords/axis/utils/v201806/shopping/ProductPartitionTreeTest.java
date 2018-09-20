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

package com.google.api.ads.adwords.axis.utils.v201806.shopping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.AxisSerializer;
import com.google.api.ads.adwords.axis.v201806.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201806.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201806.cm.AdGroupCriterionPage;
import com.google.api.ads.adwords.axis.v201806.cm.BidSource;
import com.google.api.ads.adwords.axis.v201806.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201806.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201806.cm.Bids;
import com.google.api.ads.adwords.axis.v201806.cm.CpcBid;
import com.google.api.ads.adwords.axis.v201806.cm.CustomParameter;
import com.google.api.ads.adwords.axis.v201806.cm.CustomParameters;
import com.google.api.ads.adwords.axis.v201806.cm.Money;
import com.google.api.ads.adwords.axis.v201806.cm.NegativeAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201806.cm.Operator;
import com.google.api.ads.adwords.axis.v201806.cm.ProductBrand;
import com.google.api.ads.adwords.axis.v201806.cm.ProductDimension;
import com.google.api.ads.adwords.axis.v201806.cm.ProductPartition;
import com.google.api.ads.adwords.axis.v201806.cm.ProductPartitionType;
import com.google.api.ads.adwords.axis.v201806.cm.UserStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.AdWordsInternals;
import com.google.api.ads.common.lib.testing.MockHttpIntegrationTest;
import com.google.api.ads.common.lib.utils.AdsUtility;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.xml.namespace.QName;
import org.apache.axis.encoding.SerializationContext;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.xml.sax.Attributes;

/**
 * Tests for {@link ProductPartitionTree}.
 */
@RunWith(JUnit4.class)
public class ProductPartitionTreeTest extends MockHttpIntegrationTest {

  private final BiddingStrategyConfiguration biddingStrategyConfig =
      new BiddingStrategyConfiguration();

  @Before
  public void setUp() {
    AdWordsInternals.getInstance().getAdsUtilityRegistry().popRegisteredUtilities();
  }

  /**
   * Tests creating an empty ad group tree. In this case, all operations generated should be ADD
   * operations.
   */
  @Test
  public void testCreateEmptyTree() {
    ProductPartitionTree tree = ProductPartitionTree.createAdGroupTree(-1L, biddingStrategyConfig,
        Collections.<AdGroupCriterion>emptyList());
    assertNotNull("Even an empty tree should automatically have a root node", tree.getRoot());
    assertTrue("The root node for an empty tree should have a negative (temporary) ID",
        tree.getRoot().getProductPartitionId().longValue() < 0L);
    assertTrue("The root node for an empty tree should be a UNIT", tree.getRoot().isUnit());

    List<AdGroupCriterionOperation> mutateOperations = tree.getMutateOperations();

    assertEquals("Number of operations is incorrect", 1, mutateOperations.size());
    AdGroupCriterionOperation operation = mutateOperations.iterator().next();
    assertEquals("Should have a single operation to ADD the root node", Operator.ADD,
        operation.getOperator());
    BiddableAdGroupCriterion adGroupCriterion = (BiddableAdGroupCriterion) operation.getOperand();
    assertNull("Product dimension of operation's operand should be null",
        ((ProductPartition) adGroupCriterion.getCriterion()).getCaseValue());
    assertTrue("Partition ID of the operand should be negative",
        adGroupCriterion.getCriterion().getId().longValue() < 0L);
  }

  /**
   * Tests usage of utilities is reflected in the registry.
   */
  @Test
  public void testPartitionUtilityRegistered() {
    ProductPartitionTree tree = ProductPartitionTree.createAdGroupTree(
        -1L, biddingStrategyConfig, new ArrayList<AdGroupCriterion>());
    tree.getMutateOperations();

    Set<AdsUtility> expectedUtilities = new HashSet<>();
    expectedUtilities.add(AdsUtility.PRODUCT_PARTITION_TREE);
    assertEquals(
        expectedUtilities,
        AdWordsInternals.getInstance().getAdsUtilityRegistry().popRegisteredUtilities());
  }

  /**
   * Tests creating a tree that in its <em>final</em> state is just an empty tree.
   */
  @Test
  public void testCreateUltimatelyEmptyTree() {
    ProductPartitionTree tree = ProductPartitionTree.createAdGroupTree(-1L, biddingStrategyConfig,
        Collections.<AdGroupCriterion>emptyList());

    ProductPartitionNode rootNode = tree.getRoot().asSubdivision();
    ProductPartitionNode brand1 =
        rootNode.addChild(ProductDimensions.createBrand("google")).asSubdivision();
    brand1.addChild(ProductDimensions.createOfferId("A")).asBiddableUnit().setBid(1000000L);
    brand1.addChild(ProductDimensions.createOfferId(null)).asExcludedUnit();
    ProductPartitionNode brand2 =
        rootNode.addChild(ProductDimensions.createBrand(null)).asExcludedUnit();

    // Now remove the two child nodes under the root and set the root back to a UNIT. This should
    // result in operations that simply create the root node.
    rootNode.removeChild(brand1.getDimension());
    rootNode.removeChild(brand2.getDimension());
    rootNode = rootNode.asBiddableUnit();

    List<AdGroupCriterionOperation> mutateOperations = tree.getMutateOperations();

    assertEquals("Number of operations is incorrect", 1, mutateOperations.size());
    AdGroupCriterionOperation operation = mutateOperations.iterator().next();
    assertEquals("Should have a single operation to ADD the root node", Operator.ADD,
        operation.getOperator());
    BiddableAdGroupCriterion adGroupCriterion = (BiddableAdGroupCriterion) operation.getOperand();
    assertNull("Product dimension of operation's operand should be null",
        ((ProductPartition) adGroupCriterion.getCriterion()).getCaseValue());
    assertTrue("Partition ID of the operand should be negative",
        adGroupCriterion.getCriterion().getId().longValue() < 0L);
  }

  /**
   * Tests mutating an existing tree with multiple nodes.
   */
  @Test
  public void testMutateMultiNodeTree() {
    List<AdGroupCriterion> adGroupCriteria = Lists.newArrayList();

    List<CriterionDescriptor> descriptors = Lists.newArrayList();
    descriptors.add(new CriterionDescriptor(false, false, null, null, 1L, null));
    ProductBrand brandGoogle = ProductDimensions.createBrand("google");
    descriptors.add(new CriterionDescriptor(false, false, brandGoogle, null, 2L, 1L));

    descriptors.add(new CriterionDescriptor(true,
        false,
        ProductDimensions.createOfferId("A"),
        1000000L,
        3L,
        2L));
    Long offerBOriginalPartitionId = 4L;
    descriptors.add(new CriterionDescriptor(true,
        true,
        ProductDimensions.createOfferId("B"),
        null,
        offerBOriginalPartitionId,
        2L));

    Long brandOtherOriginalPartitionId = 5L;
    descriptors.add(new CriterionDescriptor(true,
        true,
        ProductDimensions.createBrand(null),
        null,
        brandOtherOriginalPartitionId,
        1L));

    ProductBrand brandMotorola = ProductDimensions.createBrand("motorola");
    Long brandMotorolaOriginalPartitionId = 6L;
    descriptors.add(new CriterionDescriptor(true,
        true,
        brandMotorola,
        null,
        brandMotorolaOriginalPartitionId,
        1L));

    descriptors.forEach(descriptor -> adGroupCriteria.add(descriptor.createCriterion()));
    Map<Long, Map<Long, CriterionDescriptor>> descriptorMap = buildDescriptorMap(descriptors);

    ProductPartitionTree tree =
        ProductPartitionTree.createAdGroupTree(-1L, biddingStrategyConfig, adGroupCriteria);
    assertEquals("ad group ID is incorrect", -1L, tree.getAdGroupId().longValue());

    Queue<ProductPartitionNode> nodes = Lists.newLinkedList();
    nodes.add(tree.getRoot());

    int nodesFound = 0;
    while (!nodes.isEmpty()) {
      ProductPartitionNode node = nodes.remove();
      Long parentId = node.getParent() == null ? null : node.getParent().getProductPartitionId();
      CriterionDescriptor expectedDescriptor =
          descriptorMap.get(parentId).get(node.getProductPartitionId());
      CriterionDescriptor actualDescriptor = new CriterionDescriptor(node);
      expectedDescriptor.assertDescriptorEquals(actualDescriptor);

      // Add children to process.
      Iterables.addAll(nodes, node.getChildren());
      nodesFound++;
    }
    assertEquals("Tree does not contain the expected # of nodes", adGroupCriteria.size(),
        nodesFound);

    // Change the bids on leaf nodes.
    ProductPartitionNode brandGoogleNode = tree.getRoot().getChild(brandGoogle);
    ProductPartitionNode offerANode =
        brandGoogleNode.getChild(ProductDimensions.createOfferId("A"));
    // This should produce 1 SET operation.
    offerANode.setBid(offerANode.getBid() * 10);

    // This should produce 1 REMOVE operation + 1 ADD operation.
    ProductPartitionNode offerBNode =
        brandGoogleNode.getChild(ProductDimensions.createOfferId("B"));
    offerBNode.asBiddableUnit().setBid(5000000L);

    // This should produce 1 REMOVE operation + 1 ADD operation.
    ProductPartitionNode brandOtherNode =
        tree.getRoot().getChild(ProductDimensions.createBrand(null));
    brandOtherNode = brandOtherNode.asBiddableUnit();

    // Add an offer C node. This should produce 1 ADD operation.
    ProductPartitionNode offerCNode = brandGoogleNode.addChild(ProductDimensions.createOfferId("C"))
        .asBiddableUnit().setBid(1500000L).putCustomParameter("param1", "value1");

    // Remove the brand Motorola node. This should produce 1 REMOVE operation.
    tree.getRoot().removeChild(brandMotorola);

    // Get the mutate operations generated by the modifications made to the tree.
    List<AdGroupCriterionOperation> mutateOperations = tree.getMutateOperations();
    assertEquals(7, mutateOperations.size());

    // Put the mutate operations in a map keyed by partition ID.
    Map<Long, CriterionDescriptor> opsDescriptorMap = Maps.newHashMap();
    int i = 0;
    for (AdGroupCriterionOperation mutateOperation : mutateOperations) {
      CriterionDescriptor descriptor = new CriterionDescriptor(mutateOperation.getOperand(), i++);
      opsDescriptorMap.put(descriptor.partitionId, descriptor);
    }

    // Check the node that simply had a bid update.
    int setOpNumber = opsDescriptorMap.get(offerANode.getProductPartitionId()).operationNumber;
    assertEquals("Offer A node with a bid update should have a SET operation", Operator.SET,
        mutateOperations.get(setOpNumber).getOperator());

    // Check the offer B node that went from excluded to biddable.
    int addOfferBOpNumber =
        opsDescriptorMap.get(offerBNode.getProductPartitionId()).operationNumber;
    assertEquals("Offer B node with a biddable change should have an ADD operation for the new ID",
        Operator.ADD, mutateOperations.get(addOfferBOpNumber).getOperator());
    int removeOfferBOpNumber = opsDescriptorMap.get(offerBOriginalPartitionId).operationNumber;
    assertEquals(
        "Offer B node with a biddable change should have a REMOVE operation for the original ID",
        Operator.REMOVE, mutateOperations.get(removeOfferBOpNumber).getOperator());

    // Check the offer C node that was added.
    int addOfferCOpNumber =
        opsDescriptorMap.get(offerCNode.getProductPartitionId()).operationNumber;
    assertEquals("New offer C node should have an ADD operation for the new ID", Operator.ADD,
        mutateOperations.get(addOfferCOpNumber).getOperator());

    // Check the brand null node that went from excluded to biddable.
    int addBrandOtherOpNumber =
        opsDescriptorMap.get(brandOtherNode.getProductPartitionId()).operationNumber;
    assertEquals(
        "Brand null node with a biddable change should have an ADD operation for the new ID",
        Operator.ADD, mutateOperations.get(addBrandOtherOpNumber).getOperator());
    int brandOtherOpNumber = opsDescriptorMap.get(offerBOriginalPartitionId).operationNumber;
    assertEquals(
        "Brand null node with a biddable change should have a REMOVE operation for the original ID",
        Operator.REMOVE, mutateOperations.get(brandOtherOpNumber).getOperator());

    // Check the brand Motorola node that was removed.
    int brandMotorolaOpNumber =
        opsDescriptorMap.get(brandMotorolaOriginalPartitionId).operationNumber;
    assertEquals("Removed node should have a REMOVE operation", Operator.REMOVE,
        mutateOperations.get(brandMotorolaOpNumber).getOperator());
  }

  /**
   * Tests creating an empty tree and then adding several levels of nodes.
   */
  @Test
  public void testCreateMultiNodeTreeFromScratch() {
    ProductPartitionTree tree = ProductPartitionTree.createAdGroupTree(-1L, biddingStrategyConfig,
        Collections.<AdGroupCriterion>emptyList());

    ProductPartitionNode rootNode = tree.getRoot().asSubdivision();
    ProductPartitionNode brand1 =
        rootNode.addChild(ProductDimensions.createBrand("google")).asSubdivision();
    ProductPartitionNode brand1Offer1 =
        brand1
            .addChild(ProductDimensions.createOfferId("A"))
            .asBiddableUnit()
            .setBid(1000000L)
            .putCustomParameter("param1", "value1")
            .putCustomParameter("param2", "value2");
    ProductPartitionNode brand1Offer2 =
        brand1.addChild(ProductDimensions.createOfferId(null)).asExcludedUnit();
    ProductPartitionNode brand2 =
        rootNode.addChild(ProductDimensions.createBrand(null)).asExcludedUnit();

    int expectedOpCount = 5;

    List<AdGroupCriterionOperation> mutateOperations = tree.getMutateOperations();

    assertEquals("Number of operations is incorrect", expectedOpCount, mutateOperations.size());

    List<CriterionDescriptor> nodeDescriptors =
        Stream.of(rootNode, brand1, brand1Offer1, brand1Offer2, brand2)
            .map(CriterionDescriptor::new)
            .collect(Collectors.toList());

    int opNum = 0;
    List<CriterionDescriptor> opDescriptors = Lists.newArrayList();
    Map<Long, CriterionDescriptor> opDescriptorsById = Maps.newHashMap();
    for (AdGroupCriterionOperation op : mutateOperations) {
      CriterionDescriptor opDescriptor = new CriterionDescriptor(op.getOperand(), opNum++);
      opDescriptors.add(opDescriptor);
      opDescriptorsById.put(opDescriptor.partitionId, opDescriptor);
    }
    Map<Long, Map<Long, CriterionDescriptor>> opDescriptorMap = buildDescriptorMap(opDescriptors);

    for (CriterionDescriptor nodeDescriptor : nodeDescriptors) {
      CriterionDescriptor opDescriptor =
          opDescriptorMap.get(nodeDescriptor.parentPartitionId).get(nodeDescriptor.partitionId);
      nodeDescriptor.assertDescriptorEquals(opDescriptor);
      AdGroupCriterionOperation op = mutateOperations.get(opDescriptor.operationNumber);
      assertEquals("operator is incorrect", Operator.ADD, op.getOperator());
      if (nodeDescriptor.parentPartitionId != null) {
        CriterionDescriptor parentOpDescriptor =
            opDescriptorsById.get(nodeDescriptor.parentPartitionId);
        assertNotNull("no operation found for parent", parentOpDescriptor);
        assertThat("operation # for parent is > operation # for child",
            opDescriptor.operationNumber, Matchers.greaterThan(parentOpDescriptor.operationNumber));
      }
    }

    assertThat("Tree toString does not contain the root's detailed toString", tree.toString(),
        Matchers.containsString(tree.getRoot().toDetailedString()));
    assertThat("Tree toString does not contain the ad group ID", tree.toString(),
        Matchers.containsString(tree.getAdGroupId().toString()));
  }

  /**
   * Tests that the factory method ignores removed criteria.
   */
  @Test
  public void testRemovedCriteriaIgnored() {
    CriterionDescriptor rootDescriptor =
        new CriterionDescriptor(true, false, null, 1000000L, 1L, null);
    List<AdGroupCriterion> criteria = Lists.newArrayList();
    criteria.add(rootDescriptor.createCriterion());

    // Create a criteria for a child node and set its UserStatus to REMOVED.
    ProductBrand brandGoogle = ProductDimensions.createBrand("google");
    CriterionDescriptor removedDescriptor =
        new CriterionDescriptor(true, false, brandGoogle, null, 2L, 1L);
    AdGroupCriterion removedCriterion = removedDescriptor.createCriterion();
    ((BiddableAdGroupCriterion) removedCriterion).setUserStatus(UserStatus.REMOVED);
    criteria.add(removedCriterion);

    ProductPartitionTree tree =
        ProductPartitionTree.createAdGroupTree(-1L, biddingStrategyConfig, criteria);
    assertFalse("Brand = google criteria had status removed, but it is in the tree",
        tree.getRoot().hasChild(brandGoogle));
  }

  /**
   * Tests that the factory method that retrieves the tree using API services builds
   * the correct tree and passes the correct paging arguments.
   */
  @Test
  public void testCreateTreeUsingService() throws Exception {
    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();
    AdWordsSession session =
        new AdWordsSession.Builder()
            .withClientCustomerId("123-456-7890")
            .withOAuth2Credential(new Credential(BearerToken.authorizationHeaderAccessMethod()))
            .withDeveloperToken("devtoken")
            .withUserAgent("test")
            // Use the test server's endpoint
            .withEndpoint(testHttpServer.getServerUrl())
            .build();

    // Extract the API version from this test's package.
    List<String> packageComponents =
        Lists.newArrayList(Splitter.on('.').split(getClass().getPackage().getName()));
    final String apiVersion = packageComponents.get(packageComponents.size() - 2);

    final int pageSize = 100;
    final int numberOfCriteria = (pageSize * 5) + 1;

    // Construct a list of CriterionDescriptors that will build a tree of the form:
    // root
    //  OfferId = null EXCLUDED
    //  OfferId = 1 BIDDABLE
    //  OfferId = 2 BIDDABLE
    //  ...
    //  OfferId = numberOfCriteria BIDDABLE
    List<CriterionDescriptor> descriptors = Lists.newArrayList();
    long partitionId = 1L;
    final long rootPartitionId = partitionId;
    descriptors.add(new CriterionDescriptor(false, false, null, null, partitionId++, null));

    descriptors.add(new CriterionDescriptor(
        true, true, ProductDimensions.createOfferId(null), null, partitionId++, rootPartitionId));

    for (int i = 1; i <= (numberOfCriteria - 2); i++) {
      CriterionDescriptor descriptor =
          new CriterionDescriptor(
              true,
              false,
              ProductDimensions.createOfferId(Integer.toString(i)),
              10000000L,
              partitionId++,
              rootPartitionId,
              i == 2 ? "http://wwww.example.com/tracking?{lpurl}" : null);
      descriptor.customParams.put("param1", "value1");
      descriptor.customParams.put("param2", "value2");
      descriptors.add(descriptor);
    }

    // Split the descriptor list into batches of size pageSize.
    List<List<CriterionDescriptor>> descriptorBatches = Lists.partition(descriptors, pageSize);

    List<String> responseBodies = Lists.newArrayList();
    for (List<CriterionDescriptor> descriptorBatch : descriptorBatches) {
      // For this batch of descriptors, manually construct the AdGroupCriterionPage
      // to return. This is required because AdWordsServices is a final class, so this test
      // cannot mock its behavior.
      AdGroupCriterionPage mockPage = new AdGroupCriterionPage();
      mockPage.setTotalNumEntries(numberOfCriteria);
      mockPage.setEntries(new AdGroupCriterion[descriptorBatch.size()]);

      int i = 0;
      for (CriterionDescriptor descriptor : descriptorBatch) {
        mockPage.setEntries(i++, descriptor.createCriterion());
      }

      // Serialize the page.
      StringWriter writer = new StringWriter();
      SerializationContext serializationContext = new SerializationContext(writer) {
        /**
         * Override the serialize method called by the Axis serializer and force it to
         * pass {@code includeNull = false}.
         */
        @SuppressWarnings("rawtypes")
        @Override
        public void serialize(QName elemQName, Attributes attributes, Object value, QName xmlType,
            Class javaType) throws IOException {
          super.serialize(elemQName, attributes, value, xmlType, javaType, false, null);
        }
      };
      serializationContext.setSendDecl(false);
      new AxisSerializer().serialize(mockPage, serializationContext);

      // Wrap the serialized page in a SOAP envelope.
      StringBuilder response = new StringBuilder();
      response.append("<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
          + "<soap:Header/><soap:Body>");
      response.append(String.format(
          "<getResponse xmlns=\"https://adwords.google.com/api/adwords/cm/%s\">", apiVersion));

      // Replace the element name AdGroupCriterionPage with the expected name rval in the
      // serialized page.
      response.append(writer.toString().replaceAll("AdGroupCriterionPage", "rval"));

      response.append("</getResponse></soap:Body></soap:Envelope>");

      responseBodies.add(response.toString());
    }

    // Set the test server to return the response bodies constructed above.
    testHttpServer.setMockResponseBodies(responseBodies);

    // Build the tree.
    ProductPartitionTree tree = ProductPartitionTree.createAdGroupTree(
        adWordsServices, session, 9999L/* dummy ad group ID */);

    // First, confirm that the paging elements were correct in each request's selector.
    int requestNumber = 0;
    for (String requestBody : testHttpServer.getAllRequestBodies()) {
      int expectedOffset = requestNumber * pageSize;
      assertThat("numberResults paging element is missing or incorrect in request", requestBody,
          Matchers.containsString("numberResults>" + pageSize + "</"));
      if (requestNumber == 0) {
        assertThat("startIndex paging element unexpectedly found in the first request", requestBody,
            Matchers.not(Matchers.containsString("startIndex>")));
      } else {
        assertThat("startIndex paging element is missing or incorrect in request", requestBody,
            Matchers.containsString("startIndex>" + expectedOffset + "</"));
      }
      requestNumber++;
    }

    // Confirm that the tree returned by the factory method matches the expected tree.
    descriptors.get(0).assertDescriptorEquals(new CriterionDescriptor(tree.getRoot()));

    // Get a map of all of the child descriptors for the root node.
    Map<Long, CriterionDescriptor> descriptorMap =
        buildDescriptorMap(descriptors).get(rootPartitionId);

    // Confirm each ProductPartitionNode under the root node has a matching entry in the descriptor
    // map.
    int childrenFound = 0;
    for (ProductPartitionNode childNode : tree.getRoot().getChildren()) {
      CriterionDescriptor nodeDescriptor = new CriterionDescriptor(childNode);
      nodeDescriptor.assertDescriptorEquals(descriptorMap.get(nodeDescriptor.partitionId));
      childrenFound++;
    }
    assertEquals("Did not find an entry in the response for every expected child node",
        descriptorMap.size(), childrenFound);
  }

  /**
   * Returns a map from parentPartitionId to map of partitionId to CriterionDescriptor.
   */
  private Map<Long, Map<Long, CriterionDescriptor>> buildDescriptorMap(
      Iterable<CriterionDescriptor> descriptors) {
    Map<Long, Map<Long, CriterionDescriptor>> descriptorMap = Maps.newHashMap();
    for (CriterionDescriptor descriptor : descriptors) {
      Map<Long, CriterionDescriptor> mapForParent = descriptorMap.get(descriptor.parentPartitionId);
      if (mapForParent == null) {
        mapForParent = Maps.newHashMap();
        descriptorMap.put(descriptor.parentPartitionId, mapForParent);
      }
      CriterionDescriptor existingDescriptor = mapForParent.put(descriptor.partitionId, descriptor);
      assertNull("Multiple descriptors found for parent ID " + descriptor.parentPartitionId
          + " and partition ID " + descriptor.partitionId, existingDescriptor);
    }
    return descriptorMap;
  }

  /**
   * Helper class that describes an {@link AdGroupCriterion}.
   */
  private static class CriterionDescriptor {
    private final boolean isUnit;
    private final ProductDimension dimension;
    private final boolean isExcluded;
    private final Long bid;
    private final Long partitionId;
    private final Long parentPartitionId;
    private final Integer operationNumber;
    private final String trackingUrlTemplate;
    private final Map<String, String> customParams;

    CriterionDescriptor(
        boolean isUnit,
        boolean isExcluded,
        ProductDimension dimension,
        Long bid,
        Long partitionId,
        Long parentPartitionId) {
      this(isUnit, isExcluded, dimension, bid, partitionId, parentPartitionId, null);
    }

    /** Creates a new instance based on explicitly provided attribute values. */
    CriterionDescriptor(
        boolean isUnit,
        boolean isExcluded,
        ProductDimension dimension,
        Long bid,
        Long partitionId,
        Long parentPartitionId,
        String trackingUrlTemplate) {
      // Add a few sanity checks to catch coding errors in tests as early as possible.
      if (isExcluded) {
        Preconditions.checkArgument(isUnit, "Cannot exclude a non-unit");
        Preconditions.checkArgument(bid == null,
            "Cannot specify a non-null bid for an excluded criterion");
      }
      Preconditions.checkNotNull(partitionId, "Null partition ID");
      if (dimension == null) {
        Preconditions.checkArgument(parentPartitionId == null,
            "Dimension is null (root node) but parent ID specified");
      } else {
        Preconditions.checkNotNull(parentPartitionId,
            "Dimension is not null but parent ID is null");
      }
      this.isUnit = isUnit;
      this.dimension = dimension;
      this.isExcluded = isExcluded;
      this.bid = bid;
      this.partitionId = partitionId;
      this.parentPartitionId = parentPartitionId;
      this.operationNumber = null;
      this.trackingUrlTemplate = trackingUrlTemplate;
      this.customParams = new HashMap<>();
    }

    /**
     * Creates a new instance based on a ProductPartitionNode.
     */
    CriterionDescriptor(ProductPartitionNode node) {
      Preconditions.checkNotNull(node, "node is null");
      this.isUnit = node.isUnit();
      this.dimension = node.getDimension();
      this.isExcluded = node.isExcludedUnit();
      this.bid = node.getBid();
      this.partitionId = node.getProductPartitionId();
      if (node.getParent() != null) {
        this.parentPartitionId = node.getParent().getProductPartitionId();
      } else {
        this.parentPartitionId = null;
      }
      this.operationNumber = null;
      this.trackingUrlTemplate = node.getTrackingUrlTemplate();
      this.customParams = new HashMap<>();
      this.customParams.putAll(node.getCustomParameters());
    }

    CriterionDescriptor(AdGroupCriterion adGroupCriterion, int operationNumber) {
      Preconditions.checkNotNull(adGroupCriterion, "Null ad group criterion");

      ProductPartition partition = (ProductPartition) adGroupCriterion.getCriterion();
      this.isUnit = ProductPartitionType.UNIT.equals(partition.getPartitionType());
      this.dimension = partition.getCaseValue();
      this.partitionId = partition.getId();
      this.parentPartitionId = partition.getParentCriterionId();
      this.customParams = new HashMap<>();
      if (adGroupCriterion instanceof BiddableAdGroupCriterion) {
        BiddableAdGroupCriterion biddableCriterion = (BiddableAdGroupCriterion) adGroupCriterion;
        this.isExcluded = false;
        BiddingStrategyConfiguration biddingConfig =
            biddableCriterion.getBiddingStrategyConfiguration();
        Long bidAmount = null;
        this.trackingUrlTemplate = biddableCriterion.getTrackingUrlTemplate();
        if (biddableCriterion.getUrlCustomParameters() != null) {
          Stream.of(biddableCriterion.getUrlCustomParameters().getParameters())
              .forEach(
                  customParam ->
                      this.customParams.put(customParam.getKey(), customParam.getValue()));
        }
        if (biddingConfig != null) {
          Bids[] bids = biddingConfig.getBids();
          if (bids != null) {
            for (Bids bid : bids) {
              CpcBid cpcBid = (CpcBid) bid;
              if (BidSource.CRITERION.equals(cpcBid.getCpcBidSource())) {
                bidAmount = cpcBid.getBid().getMicroAmount();
                break;
              }
            }
          }
        }
        this.bid = bidAmount;
      } else {
        this.isExcluded = true;
        this.bid = null;
        this.trackingUrlTemplate = null;
      }
      this.operationNumber = operationNumber;
    }

    /**
     * Asserts that this object matches {@code other} on each attribute.
     */
    void assertDescriptorEquals(CriterionDescriptor other) {
      assertNotNull("Null descriptor compared to: " + this, other);
      assertEquals("dimension does not match", 0,
          new ProductDimensionComparator().compare(this.dimension, other.dimension));
      assertEquals("bid is incorrect", this.bid, other.bid);
      assertEquals("isUnit is incorrect", this.isUnit, other.isUnit);
      assertEquals("isExcludedUnit is incorrect", this.isExcluded, other.isExcluded);
      assertEquals(
          "trackingUrlTemplate is incorrect", this.trackingUrlTemplate, other.trackingUrlTemplate);
      assertEquals("custom parameters is incorrect", this.customParams, other.customParams);
    }

    /**
     * Returns a new AdGroupCriterion based on this descriptor.
     */
    AdGroupCriterion createCriterion() {
      AdGroupCriterion adGroupCriterion;
      ProductPartition partition = new ProductPartition();
      partition.setId(partitionId);
      partition.setParentCriterionId(parentPartitionId);
      partition.setCaseValue(dimension);
      partition.setPartitionType(
          isUnit ? ProductPartitionType.UNIT : ProductPartitionType.SUBDIVISION);
      if (isExcluded) {
        NegativeAdGroupCriterion negative = new NegativeAdGroupCriterion();
        adGroupCriterion = negative;
      } else {
        BiddableAdGroupCriterion biddable = new BiddableAdGroupCriterion();
        biddable.setUserStatus(UserStatus.ENABLED);
        biddable.setTrackingUrlTemplate(trackingUrlTemplate);
        if (!customParams.isEmpty()) {
          CustomParameters customParameters = new CustomParameters();
          List<CustomParameter> customParameterList = new ArrayList<>();
          for (Entry<String, String> paramEntry : customParams.entrySet()) {
            CustomParameter customParameter = new CustomParameter();
            customParameter.setKey(paramEntry.getKey());
            customParameter.setValue(paramEntry.getValue());
            customParameterList.add(customParameter);
          }
          customParameters.setParameters(customParameterList.toArray(new CustomParameter[0]));
          biddable.setUrlCustomParameters(customParameters);
        }

        BiddingStrategyConfiguration biddingConfig = new BiddingStrategyConfiguration();
        if (isUnit && bid != null) {
          CpcBid cpcBid = new CpcBid();
          Money bidMoney = new Money();
          bidMoney.setMicroAmount(bid);
          cpcBid.setBid(bidMoney);
          cpcBid.setCpcBidSource(BidSource.CRITERION);
          biddingConfig.setBids(new Bids[] {cpcBid});
        }
        biddable.setBiddingStrategyConfiguration(biddingConfig);

        adGroupCriterion = biddable;
      }
      adGroupCriterion.setCriterion(partition);
      return adGroupCriterion;
    }
  }
}
