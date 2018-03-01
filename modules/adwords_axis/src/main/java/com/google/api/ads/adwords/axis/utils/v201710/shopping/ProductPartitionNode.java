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

package com.google.api.ads.adwords.axis.utils.v201710.shopping;

import com.google.api.ads.adwords.axis.v201710.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201710.cm.ProductDimension;
import com.google.api.ads.adwords.axis.v201710.cm.ProductPartition;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import javax.annotation.Nullable;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.SerializationUtils;
import org.apache.commons.lang.SystemUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * A node in a tree of {@link ProductPartition}s. Used to construct {@link AdGroupCriterion} objects
 * for shopping campaigns.
 */
public class ProductPartitionNode {

  @Nullable private final ProductPartitionNode parentNode;
  @Nullable private final ProductDimension dimension;
  @Nullable private Long partitionId;
  private NodeState nodeState;
  
  /**
   * A map from ProductDimension to child ProductPartitionNode.
   *
   * <p>NOTE: This map uses a custom comparator that is <em>not</em> consistent with equals.
   * Therefore, this map does <em>not</em> obey the general contract of the {@link Map} interface.
   */
  private final SortedMap<ProductDimension, ProductPartitionNode> children;
  
  /**
   * Union of relevant attributes from all subclasses of ProductDimension. Used by
   * {@link #toString(ProductDimension)} to construct a String representation of a ProductDimension
   * instance.
   */
  private static final ImmutableList<String> DIMENSION_PROPERTY_NAMES =
      ImmutableList.of("type", "condition", "value", "channel", "channelExclusivity");

  /**
   * Constructor that sets the parent node, dimension, and partitionId. This constructor does
   * <em>not</em> call {@code parentNode.addChild(this)}.
   */
  ProductPartitionNode(@Nullable ProductPartitionNode parentNode,
      @Nullable ProductDimension dimension, @Nullable Long partitionId,
      Comparator<? super ProductDimension> comparator) {
    this.parentNode = parentNode;
    this.dimension = dimension;
    this.children = Maps.newTreeMap(comparator);
    this.partitionId = partitionId;
    this.nodeState = new BiddableUnitState();
  }

  /**
   * Performs a <em>shallow</em> copy of properties from {@code fromNode} to {@code toNode}. Does
   * <em>not</em> change the parent node of {@code toNode}.
   *
   * @param fromNode the node to copy from.
   * @param toNode the node to copy to.
   * @return {@code toNode}, with its properties updated.
   */
  static ProductPartitionNode copyProperties(ProductPartitionNode fromNode,
      ProductPartitionNode toNode) {
    switch (fromNode.nodeState.getNodeType()) {
      case BIDDABLE_UNIT:
        toNode = toNode.asBiddableUnit();
        toNode.setBid(fromNode.getBid());
        toNode.setTrackingUrlTemplate(fromNode.getTrackingUrlTemplate());
        // Clone the CustomParameters from fromNode so that changes on the toNode won't be
        // reflected in the fromNode.
        for (Entry<String, String> customParamEntry :
            fromNode.nodeState.getCustomParams().entrySet()) {
          toNode.putCustomParameter(customParamEntry.getKey(), customParamEntry.getValue());
        }
        break;
      case EXCLUDED_UNIT:
        toNode = toNode.asExcludedUnit();
        break;
      case SUBDIVISION:
        toNode = toNode.asSubdivision();
        break;
      default:
        throw new IllegalStateException(
            "Unrecognized node state: " + fromNode.nodeState.getNodeType());
    }

    return toNode.setProductPartitionId(fromNode.getProductPartitionId());
  }

  /**
   * Returns a <em>copy</em> of this node's {@link ProductDimension}.
   */
  public ProductDimension getDimension() {
    return (ProductDimension) SerializationUtils.clone(dimension);
  }

  /**
   * Returns the product partition ID of this node.
   */
  @Nullable
  public Long getProductPartitionId() {
    return partitionId;
  }

  /**
   * Sets the product partition ID of this node.
   *
   * @param partitionId required - the ID to set
   * @return this node
   */
  ProductPartitionNode setProductPartitionId(Long partitionId) {
    this.partitionId = partitionId;
    return this;
  }

  /**
   * Returns true if this node's partition type is SUBDIVISION.
   */
  public boolean isSubdivision() {
    return nodeState.getNodeType() == NodeType.SUBDIVISION;
  }

  /**
   * Returns true if this node's partition type is UNIT.
   */
  public boolean isUnit() {
    return nodeState.getNodeType() == NodeType.BIDDABLE_UNIT
        || nodeState.getNodeType() == NodeType.EXCLUDED_UNIT;
  }

  /**
   * Modifies this node to be a SUBDIVISION node.
   *
   * @return this node, updated to a subdivision node
   */
  public ProductPartitionNode asSubdivision() {
    nodeState = nodeState.transitionTo(NodeType.SUBDIVISION);
    return this;
  }


  /**
   * Returns an Iterable of a shallow copy of all children of this node. 
   */
  public Iterable<ProductPartitionNode> getChildren() {
    return ImmutableList.<ProductPartitionNode>copyOf(children.values());
  }

  /**
   * Returns the child node with the specified ProductDimension.
   *
   * @throws IllegalArgumentException if no such direct child node exists.
   */
  public ProductPartitionNode getChild(ProductDimension dimension) {
    Preconditions.checkArgument(hasChild(dimension), "No child exists with dimension: %s",
        toString(dimension));
    return children.get(dimension);
  }

  /**
   * Returns true if this node has a child with the specified dimension.
   *
   * @param dimension required - the child dimension
   */
  public boolean hasChild(ProductDimension dimension) {
    return children.containsKey(dimension);
  }

  private boolean hasChildren() {
    return !children.isEmpty();
  }

  /**
   * Returns the bid (in micros) for this node, or null if {@link #isExcludedUnit()}.
   */
  @Nullable
  public Long getBid() {
    return nodeState.getBidInMicros();
  }

  /**
   * Returns true if this node's partition type is UNIT and is biddable (not excluded).
   */
  public boolean isBiddableUnit() {
    return nodeState.getNodeType() == NodeType.BIDDABLE_UNIT;
  }

  /**
   * Returns true if this node's partition type is UNIT and is excluded (not biddable).
   */
  public boolean isExcludedUnit() {
    return nodeState.getNodeType() == NodeType.EXCLUDED_UNIT;
  }

  /**
   * Returns a simple String representation of this node. Does <em>not</em> include details from
   * this node's children.
   */
  @Override
  public String toString() {
    Long parentPartitionId = getParent() != null ? getParent().getProductPartitionId() : null;
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("dimension", toString(dimension))
        .append("partitionId", partitionId)
        .append("parentPartitionId", parentPartitionId)
        .append("nodeType", nodeState.getNodeType())
        .append("bidMicros", getBid())
        .append("hasChildren", hasChildren())
        .append("trackingUrlTemplate", getTrackingUrlTemplate())
        .append("customParameters", nodeState.getCustomParams())
        .toString();
  }

  /**
   * Returns a String representation of this node and all of its children.
   */
  public String toDetailedString() {
    StringBuilder stringBuilder = new StringBuilder();
    appendDetailedString(0, stringBuilder);
    return stringBuilder.toString();
  }

  /**
   * Appends to {@code stringBuidler} a String representation of this node and all of its children.
   *
   * @param level the level of this node
   * @param stringBuilder the StringBuilder to append to
   */
  private void appendDetailedString(int level, StringBuilder stringBuilder) {
    String pad = Strings.repeat("--", level);
    stringBuilder.append(pad).append(this).append(SystemUtils.LINE_SEPARATOR);
    for (ProductPartitionNode childNode : getChildren()) {
      childNode.appendDetailedString(level + 1, stringBuilder);
    }
  }

  /**
   * Convenience method for producing a meaningful String representation of a
   * {@link ProductDimension}.
   */
  public static String toString(ProductDimension dimension) {
    if (dimension == null) {
      return String.valueOf(dimension);
    }
    List<String> attributeToStrings = Lists.newArrayList();
    try {
      @SuppressWarnings("unchecked")
      Map<String, String> propertiesMap = BeanUtils.describe(dimension);
      for (String propertyName : DIMENSION_PROPERTY_NAMES) {
        if (propertiesMap.containsKey(propertyName)) {
          attributeToStrings.add(
              String.format("%s=%s", propertyName, BeanUtils.getProperty(dimension, propertyName)));
        }
      }
    } catch (Exception e) {
      attributeToStrings.add("--UNKNOWN--");
    }
    return String.format("%s[%s]", dimension.getClass().getSimpleName(),
        Joiner.on(',').join(attributeToStrings));
  }

  /**
   * Returns the parent node of this node. The returned node will be {@code null} if this is the
   * root node.
   */
  public ProductPartitionNode getParent() {
    return parentNode;
  }

  /**
   * Adds a NEW child for {@code childDimension} under this node.
   *
   * @param childDimension required - the {@link ProductDimension} for the new child
   * @return the newly created child node
   */
  public ProductPartitionNode addChild(ProductDimension childDimension) {
    ProductPartitionNode newChild = new ProductPartitionNode(this, childDimension, null,
        children.comparator());
    Preconditions.checkArgument(isSubdivision(),
        "Parent node is not a SUBDIVISION. Call asSubdivision before adding children to a node.");
    if (children.containsKey(childDimension)) {
      throw new IllegalArgumentException(
          String.format("A child with dimension %s already exists", toString(childDimension)));
    }
    children.put(childDimension, newChild);
    return newChild;
  }

  /**
   * Removes the child with the specified dimension.
   *
   * @param childDimension required - the child dimension
   * @return this node
   * @throws IllegalArgumentException if no such child exists
   */
  public ProductPartitionNode removeChild(ProductDimension childDimension) {
    if (!children.containsKey(childDimension)) {
      throw new IllegalArgumentException(String.format(
          "Attempted to remove child %s but no such child exists", toString(childDimension)));
    }
    children.remove(childDimension);
    return this;
  }
  
  /**
   * Removes all children of this node.
   *
   * @return this node
   */
  public ProductPartitionNode removeAllChildren() {
    children.clear();
    return this;
  }

  /**
   * Removes all children from this node and modifies this node to be a UNIT node excluded from
   * bidding.
   *
   * @return this node, updated to an excluded node
   * @throws IllegalStateException if this node is the root node
   */
  public ProductPartitionNode asExcludedUnit() {
    if (getParent() == null) {
      throw new IllegalStateException("The root node cannot be an excluded unit");
    }
    nodeState = nodeState.transitionTo(NodeType.EXCLUDED_UNIT);
    removeAllChildren();
    return this;
  }

  /**
   * Removes all children from this node and modifies this node to be a UNIT node that is biddable.
   *
   * @return this node, updated to a biddable node
   */
  public ProductPartitionNode asBiddableUnit() {
    nodeState = nodeState.transitionTo(NodeType.BIDDABLE_UNIT);
    removeAllChildren();
    return this;
  }

  /**
   * Sets the bid for this node.
   *
   * @param bidInMicros a null or positive long
   * @throws IllegalArgumentException if {@code bidInMicros < 0L}
   * @throws IllegalStateException if this node is not a biddable UNIT node
   */
  public ProductPartitionNode setBid(@Nullable Long bidInMicros) {
    this.nodeState.setBidInMicros(bidInMicros);
    return this;
  }

  /** Returns the tracking URL template for this node. */
  @Nullable
  public String getTrackingUrlTemplate() {
    return nodeState.getTrackingUrlTemplate();
  }

  /**
   * Sets the tracking URL template for this node.
   *
   * @param trackingUrlTemplate the tracking URL template
   * @throws IllegalStateException if this node is not a biddable UNIT node
   */
  public ProductPartitionNode setTrackingUrlTemplate(String trackingUrlTemplate) {
    this.nodeState.setTrackingUrlTemplate(trackingUrlTemplate);
    return this;
  }

  /**
   * Puts the specified key/value pair in the map of custom parameters.
   * @throws IllegalStateException if this node is not a biddable UNIT node
   */
  public ProductPartitionNode putCustomParameter(String key, String value) {
    if (!nodeState.supportsCustomParameters()) {
      throw new IllegalStateException(
          String.format("Cannot set custom parameters on a %s node", nodeState.getNodeType()));
    }
    this.nodeState.getCustomParams().put(key, value);
    return this;
  }

  /**
   * Returns the custom parameter for the specified {@code key}, or null if no such entry exists.
   */
  @Nullable
  public String getCustomParameter(String key) {
    return this.nodeState.getCustomParams().get(key);
  }

  /**
   * Returns an immutable map of the node's custom parameters to support users who want to
   * inspect the entire map. To modify the map, use {@link #putCustomParameter(String, String)}
   * and {@link #removeCustomParameter(String)}.
   */
  public ImmutableMap<String, String> getCustomParameters() {
    return ImmutableMap.copyOf(this.nodeState.getCustomParams());
  }

  /**
   * Removes the specified key from the custom parameters map. The key <em>must</em> be present in
   * the map.
   *
   * <p>Since this method follows the standard builder pattern and returns {@code this}, there is no
   * way to indicate if the remove operation failed besides throwing an exception.
   *
   * @param key the key to remove. This must not be {@code null}.
   * @throws IllegalStateException if this node is not a biddable UNIT node
   * @throws IllegalArgumentException if there is no entry for {@code key} in the map
   */
  public ProductPartitionNode removeCustomParameter(String key) {
    if (!nodeState.supportsCustomParameters()) {
      throw new IllegalStateException(
          String.format("Cannot remove custom parameters on a %s node", nodeState.getNodeType()));
    }
    Preconditions.checkNotNull(key, "Null key");
    if (!nodeState.getCustomParams().containsKey(key)) {
      throw new IllegalArgumentException("No custom parameter exists for key: " + key);
    }
    this.nodeState.getCustomParams().remove(key);
    return this;
  }

  /**
   * Enumeration of valid node types.
   */
  private enum NodeType {
    BIDDABLE_UNIT, EXCLUDED_UNIT, SUBDIVISION;
  }

  /**
   * The state of a node. This encapsulates the node type and behavior for setting/getting bids,
   * tracking templates, and custom parameters, as well as transitions from one node type to
   * another.
   */
  private abstract static class NodeState {

    private final Map<String, String> customParams = new HashMap<>();

    /**
     * Returns the NodeType for this state.
     */
    abstract NodeType getNodeType();

    /** Indicates if this state supports mutating custom parameters. */
    boolean supportsCustomParameters() {
      return false;
    }

    /**
     * Returns the bid in micros for this state.
     */
    @Nullable
    Long getBidInMicros() {
      return null;
    }

    /**
     * Sets the bid for this state.
     *
     * @param bidInMicros the new bid for the state
     * @throws IllegalStateException by default. Biddable subclasses should override this behavior.
     */
    void setBidInMicros(@Nullable Long bidInMicros) {
      throw new IllegalStateException(String.format("Cannot set bid on a %s node", getNodeType()));
    }

    /**
     * Returns the tracking URL template for this state.
     */
    @Nullable
    String getTrackingUrlTemplate() {
      return null;
    }

    /**
     * Sets the tracking URL template for this state.
     * @param trackingUrlTemplate the new tracking URL template.
     * @throws IllegalStateException by default. Biddable subclasses should override this behavior.
     */
    void setTrackingUrlTemplate(@Nullable String trackingUrlTemplate) {
      throw new IllegalStateException(String.format("Cannot set tracking URL template on a %s node",
          getNodeType()));
    }

    /**
     * Returns the map representing custom URL parameters for this state.
     */
    Map<String, String> getCustomParams() {
      return customParams;
    }

    /**
     * Transitions this NodeState to a NodeState for the specified NodeType.
     *
     * @param nodeType required
     * @return a NodeState for the specified NodeType. Will be {@code this} if the NodeType matches
     *         this state's NodeType.
     */
    NodeState transitionTo(NodeType nodeType) {
      Preconditions.checkNotNull(nodeType, "Null node type");
      if (nodeType == getNodeType()) {
        return this;
      }
      switch (nodeType) {
        case BIDDABLE_UNIT:
          return new BiddableUnitState();
        case EXCLUDED_UNIT:
          return new ExcludedUnitState();
        case SUBDIVISION:
          return new SubdivisionState();
        default:
          throw new IllegalArgumentException("Unrecognized node type: " + nodeType);
      }
    }
  }
  
  /**
   * NodeState implementation for {@link NodeType#SUBDIVISION}.
   */
  private static class SubdivisionState extends NodeState {
    @Override
    NodeType getNodeType() {
      return NodeType.SUBDIVISION;
    }
  }
  
  /**
   * NodeState implementation for {@link NodeType#EXCLUDED_UNIT}.
   */
  private static class ExcludedUnitState extends NodeState {
    @Override
    NodeType getNodeType() {
      return NodeType.EXCLUDED_UNIT;
    }
  }
  
  /**
   * NodeState implementation for {@link NodeType#BIDDABLE_UNIT}.
   */
  private static class BiddableUnitState extends NodeState {

    private Long bidInMicros;
    private String trackingUrlTemplate;

    @Override
    Long getBidInMicros() {
      return bidInMicros;
    }

    @Override
    void setBidInMicros(Long bidInMicros) {
      Preconditions.checkArgument(bidInMicros == null || bidInMicros > 0L,
          "Invalid bid: %s. Bid must be null or > 0.", bidInMicros);
      this.bidInMicros = bidInMicros;
    }

    @Override
    NodeType getNodeType() {
      return NodeType.BIDDABLE_UNIT;
    }

    @Override
    String getTrackingUrlTemplate() {
      return trackingUrlTemplate;
    }

    @Override
    void setTrackingUrlTemplate(@Nullable String trackingUrlTemplate) {
      this.trackingUrlTemplate = trackingUrlTemplate;
    }

    @Override
    boolean supportsCustomParameters() {
      return true;
    }
  }
}

