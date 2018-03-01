// Copyright 2018 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.axis.utils.v201802;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.api.ads.adwords.axis.v201802.cm.Page;
import com.google.api.ads.adwords.axis.v201802.cm.SortOrder;
import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.utils.QueryBuilder;
import com.google.api.ads.adwords.lib.utils.ServiceQueryInterface;
import com.google.api.ads.adwords.lib.utils.ServiceQueryInterface.BuilderInterface;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;

/**
 * Builds a {@link ServiceQuery} object.
 *
 * <p>This builder is not thread-safe.
 */
public class ServiceQueryBuilderImpl
    extends QueryBuilder<ServiceQueryBuilderImpl, ServiceQueryInterface<Page>>
    implements BuilderInterface<Page, SortOrder> {

  private final ServiceQuery.Builder builder;
  private NavigableSet<String> fields = ImmutableSortedSet.of();
  private Map<String, String> orderByMultiMap = Maps.newLinkedHashMap();
  private int startIndex;
  private int pageSize;
  private boolean limitCalled = false;

  /**
   * Constructs a new service query builder with the specified service query builder.
   *
   * @param builder the service query builder that this object is linked to
   */
  ServiceQueryBuilderImpl(ServiceQuery.Builder builder) {
    super();
    checkNotNull(builder, "The passed builder cannot be null.");
    this.builder = builder;
  }

  /**
   * Constructs a new service query builder by copying all properties from the passed service query
   * builder.
   *
   * @param builderImpl the service query builder whose properties will be copied to.
   */
  ServiceQueryBuilderImpl(ServiceQueryBuilderImpl builderImpl) {
    super(builderImpl);
    checkNotNull(builderImpl, "The query builder cannot be null.");
    this.builder = builderImpl.builder;
    this.fields = ImmutableSortedSet.copyOf(builderImpl.fields);
    this.orderByMultiMap = Maps.newLinkedHashMap(builderImpl.orderByMultiMap);
    this.startIndex = builderImpl.startIndex;
    this.pageSize = builderImpl.pageSize;
    this.limitCalled = builderImpl.limitCalled;
  }

  @Override
  public ServiceWhereBuilder where(EntityField field) {
    checkNotNull(field, "The passed field cannot be null.");
    WhereBuilder whereBuilderDelegate = this.new WhereBuilder(field.name());
    whereBuilders.add(whereBuilderDelegate);
    return new ServiceWhereBuilder(whereBuilderDelegate);
  }

  @Override
  public ServiceWhereBuilder where(String field) {
    WhereBuilder whereBuilderDelegate = this.new WhereBuilder(field);
    whereBuilders.add(whereBuilderDelegate);
    return new ServiceWhereBuilder(whereBuilderDelegate);
  }

  @Override
  public ServiceQuery.Builder fields(EntityField... fields) {
    checkNotNull(fields, "Fields to be selected cannot be null.");
    this.fields =
        ImmutableSortedSet.copyOf(
            Lists.transform(
                Lists.newArrayList(fields),
                new Function<EntityField, String>() {
                  @Override
                  public String apply(EntityField input) {
                    return input.name();
                  }
                }));
    return builder;
  }

  @Override
  public ServiceQuery.Builder fields(String... fields) {
    checkNotNull(fields, "Fields to be selected cannot be null.");
    this.fields = ImmutableSortedSet.copyOf(fields);
    return builder;
  }

  @Override
  public ServiceQuery.Builder fields(Iterable<String> fields) {
    checkNotNull(fields, "Fields to be selected cannot be null.");
    this.fields = ImmutableSortedSet.copyOf(fields);
    return builder;
  }

  @Override
  public ServiceQuery.Builder orderBy(EntityField field) {
    orderBy(field, SortOrder.ASCENDING);
    return builder;
  }

  @Override
  public ServiceQuery.Builder orderBy(EntityField field, SortOrder order) {
    checkNotNull(field, "Field must not be null.");
    checkNotNull(order, "Order must not be null.");
    orderByMultiMap.put(field.name(), (order.equals(SortOrder.ASCENDING) ? "ASC" : "DESC"));
    return builder;
  }

  @Override
  public ServiceQuery.Builder orderBy(String field) {
    orderBy(field, SortOrder.ASCENDING);
    return builder;
  }

  @Override
  public ServiceQuery.Builder orderBy(String field, SortOrder order) {
    checkNotNull(field, "Field must not be null.");
    checkNotNull(order, "Order must not be null.");
    orderByMultiMap.put(field, (order.equals(SortOrder.ASCENDING) ? "ASC" : "DESC"));
    return builder;
  }

  @Override
  public ServiceQuery.Builder limit(int startIndex, int pageSize) {
    if (pageSize == 0) {
      throw new IllegalArgumentException("Page size must not be zero, as you'll get no results.");
    }
    limitCalled = true;
    this.startIndex = startIndex;
    this.pageSize = pageSize;
    return builder;
  }

  @Override
  public ServiceQuery build() {
    validate();
    StringBuilder stringBuilder = new StringBuilder();

    // Creates SELECT.
    stringBuilder.append("SELECT ");
    Joiner.on(", ").skipNulls().appendTo(stringBuilder, fields);

    // Creates WHERE.
    if (!whereBuilders.isEmpty()) {
      stringBuilder.append(
          String.format(" WHERE %s", Joiner.on(" AND ").skipNulls().join(whereBuilders)));
    }

    if (!orderByMultiMap.isEmpty()) {
      List<String> orderByList =
          Lists.newArrayList(
              Iterables.transform(
                  orderByMultiMap.entrySet(),
                  new Function<Entry<String, String>, String>() {
                    @Override
                    public String apply(Entry<String, String> orderByPair) {
                      return String.format("%s %s", orderByPair.getKey(), orderByPair.getValue());
                    }
                  }));
      stringBuilder.append(
          String.format(" ORDER BY %s", Joiner.on(", ").skipNulls().join(orderByList)));
    }

    return new ServiceQuery(stringBuilder.toString(), startIndex, pageSize);
  }

  private void validate() {
    if (fields.isEmpty()) {
      throw new IllegalStateException("Must use fields() to specify the SELECT clause first.");
    }
    if (!limitCalled) {
      throw new IllegalStateException("Must use limit() to specify the LIMIT clause first.");
    }
  }

  /** Implementation of the service where builder interface. */
  class ServiceWhereBuilder
      implements ServiceWhereBuilderInterface<Page, SortOrder, ServiceQuery.Builder> {

    private final QueryBuilder<ServiceQueryBuilderImpl, ServiceQueryInterface<Page>>.WhereBuilder
        whereBuilderDelegate;

    /**
     * Construct the WHERE builder with the specified field.
     *
     * @param whereBuilderDelegate the where builder delegate
     */
    ServiceWhereBuilder(
        QueryBuilder<ServiceQueryBuilderImpl, ServiceQueryInterface<Page>>.WhereBuilder
            whereBuilderDelegate) {
      this.whereBuilderDelegate = whereBuilderDelegate;
    }

    @Override
    public String toString() {
      return whereBuilderDelegate.toString();
    }

    @Override
    public ServiceQuery.Builder equalTo(String propertyValue) {
      whereBuilderDelegate.equalTo(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder equalTo(int propertyValue) {
      whereBuilderDelegate.equalTo(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder equalTo(long propertyValue) {
      whereBuilderDelegate.equalTo(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder equalTo(boolean propertyValue) {
      whereBuilderDelegate.equalTo(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder notEqualTo(String propertyValue) {
      whereBuilderDelegate.notEqualTo(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder notEqualTo(int propertyValue) {
      whereBuilderDelegate.notEqualTo(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder notEqualTo(long propertyValue) {
      whereBuilderDelegate.notEqualTo(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder notEqualTo(boolean propertyValue) {
      whereBuilderDelegate.notEqualTo(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder contains(String propertyValue) {
      whereBuilderDelegate.contains(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder containsIgnoreCase(String propertyValue) {
      whereBuilderDelegate.containsIgnoreCase(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder doesNotContain(String propertyValue) {
      whereBuilderDelegate.doesNotContain(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder doesNotContainIgnoreCase(String propertyValue) {
      whereBuilderDelegate.doesNotContainIgnoreCase(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder greaterThan(long propertyValue) {
      whereBuilderDelegate.greaterThan(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder greaterThan(int propertyValue) {
      whereBuilderDelegate.greaterThan(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder greaterThan(double propertyValue) {
      whereBuilderDelegate.greaterThan(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder greaterThanOrEqualTo(long propertyValue) {
      whereBuilderDelegate.greaterThanOrEqualTo(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder greaterThanOrEqualTo(int propertyValue) {
      whereBuilderDelegate.greaterThanOrEqualTo(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder greaterThanOrEqualTo(double propertyValue) {
      whereBuilderDelegate.greaterThanOrEqualTo(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder lessThan(long propertyValue) {
      whereBuilderDelegate.lessThan(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder lessThan(int propertyValue) {
      whereBuilderDelegate.lessThan(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder lessThan(double propertyValue) {
      whereBuilderDelegate.lessThan(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder lessThanOrEqualTo(long propertyValue) {
      whereBuilderDelegate.lessThanOrEqualTo(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder lessThanOrEqualTo(int propertyValue) {
      whereBuilderDelegate.lessThanOrEqualTo(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder lessThanOrEqualTo(double propertyValue) {
      whereBuilderDelegate.lessThanOrEqualTo(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder startsWith(String propertyValue) {
      whereBuilderDelegate.startsWith(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder startsWithIgnoreCase(String propertyValue) {
      whereBuilderDelegate.startsWithIgnoreCase(propertyValue);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder in(String... values) {
      whereBuilderDelegate.in(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder in(int... values) {
      whereBuilderDelegate.in(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder in(long... values) {
      whereBuilderDelegate.in(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder in(double... values) {
      whereBuilderDelegate.in(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder in(boolean... values) {
      whereBuilderDelegate.in(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder notIn(String... values) {
      whereBuilderDelegate.notIn(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder notIn(int... values) {
      whereBuilderDelegate.notIn(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder notIn(long... values) {
      whereBuilderDelegate.notIn(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder notIn(double... values) {
      whereBuilderDelegate.notIn(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder notIn(boolean... values) {
      whereBuilderDelegate.notIn(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder containsAny(String... values) {
      whereBuilderDelegate.containsAny(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder containsAny(int... values) {
      whereBuilderDelegate.containsAny(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder containsAny(long... values) {
      whereBuilderDelegate.containsAny(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder containsAny(double... values) {
      whereBuilderDelegate.containsAny(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder containsAll(String... values) {
      whereBuilderDelegate.containsAll(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder containsAll(int... values) {
      whereBuilderDelegate.containsAll(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder containsAll(long... values) {
      whereBuilderDelegate.containsAll(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder containsAll(double... values) {
      whereBuilderDelegate.containsAll(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder containsNone(String... values) {
      whereBuilderDelegate.containsNone(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder containsNone(int... values) {
      whereBuilderDelegate.containsNone(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder containsNone(long... values) {
      whereBuilderDelegate.containsNone(values);
      return ServiceQueryBuilderImpl.this.builder;
    }

    @Override
    public ServiceQuery.Builder containsNone(double... values) {
      whereBuilderDelegate.containsNone(values);
      return ServiceQueryBuilderImpl.this.builder;
    }
  }
}
