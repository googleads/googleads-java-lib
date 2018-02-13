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

package com.google.api.ads.adwords.lib.utils;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.common.lib.utils.AdsUtility;
import com.google.api.ads.common.lib.utils.UsesAdsUtilities;
import javax.annotation.Nullable;

/** An AWQL query for querying with AdWords API services. */
public interface ServiceQueryInterface<PageT> {

  /**
   * Sets the LIMIT clause of the AWQL to the next page. If {@code page} is null, it will set not
   * change the index and stay at the current LIMIT clause.
   *
   * <p>This method is meant to be used with {@link ServiceQueryInterface#hasNext(Object)}. The
   * {@code page} is necessary when using DataService, as its paging mechanism is different from
   * other services. For details, see
   * https://developers.google.com/adwords/api/docs/guides/bid-landscapes#paging_through_results.
   *
   * @param page the page whose size will be used to increment the index in the LIMIT clause
   * @return this service query object
   */
  ServiceQueryInterface<PageT> nextPage(@Nullable PageT page);

  /**
   * Checks if there is still a page left to query. This method is meant to be used with {@link
   * ServiceQueryInterface#nextPage(Object)}.
   *
   * @return true if there is still a page left
   */
  boolean hasNext(@Nullable PageT page);

  @UsesAdsUtilities({AdsUtility.SERVICE_QUERY_BUILDER})
  @Override
  String toString();

  /** Builds an AWQL query. */
  interface BuilderInterface<PageT, SortOrderT>
      extends QueryBuilderInterface<ServiceQueryInterface<PageT>> {

    /**
     * Selects the provided fields for building as a query.
     *
     * @param fields the provided fields to be selected
     * @return this query builder itself for method chaining
     */
    BuilderInterface<PageT, SortOrderT> fields(EntityField... fields);

    @Override
    BuilderInterface<PageT, SortOrderT> fields(String... fields);

    @Override
    BuilderInterface<PageT, SortOrderT> fields(Iterable<String> fields);

    /**
     * Set the condition of this query as the WHERE clause.
     *
     * @param field the field of the given entity to be filtered on
     * @return the WHERE builder to create a predicate
     */
    ServiceWhereBuilderInterface<PageT, SortOrderT, ? extends BuilderInterface<PageT, SortOrderT>>
        where(EntityField field);

    @Override
    ServiceWhereBuilderInterface<PageT, SortOrderT, ? extends BuilderInterface<PageT, SortOrderT>>
        where(String field);

    @UsesAdsUtilities({AdsUtility.SERVICE_QUERY_BUILDER})
    @Override
    ServiceQueryInterface<PageT> build();

    /**
     * Adds the provided field to the order-by list.
     *
     * @param field the field to be added to the ORDER BY list
     * @return this builder itself for method chaining
     */
    BuilderInterface<PageT, SortOrderT> orderBy(EntityField field);

    /**
     * Adds the provided field to the order-by list with the provided order direction.
     *
     * @param field the field to be added to the ORDER BY list
     * @return this builder itself for method chaining
     */
    BuilderInterface<PageT, SortOrderT> orderBy(EntityField field, SortOrderT order);

    /**
     * Adds the provided field to the order-by list.
     *
     * @param field the field to be added to the ORDER BY list
     * @return this builder itself for method chaining
     */
    BuilderInterface<PageT, SortOrderT> orderBy(String field);

    /**
     * Adds the provided field to the order-by list with the provided order direction.
     *
     * @param field the field to be added to the ORDER BY list
     * @return this builder itself for method chaining
     */
    BuilderInterface<PageT, SortOrderT> orderBy(String field, SortOrderT order);

    /**
     * Specifies the LIMIT clause using the provided start index and page size.
     *
     * @param startIndex the specified start index for the LIMIT clause
     * @param pageSize the specified page size for the LIMIT clause
     * @return this builder itself for method chaining
     */
    BuilderInterface<PageT, SortOrderT> limit(int startIndex, int pageSize);

    /**
     * A builder for the WHERE clause of queries.
     *
     * <p>This builder is not thread safe.
     *
     * <p>The {@code BuilderT} type parameter lets the methods here return the same type of {@code
     * BuilderInterface} that's returned from its associated {@code BuilderInterface}. For example,
     * we want the same return type from {@code builder.fields("X")} and {@code
     * builder.fields("X").where("Y").equalTo(99)}.
     *
     * @param <PageT> the page type for the API version and SOAP toolkit.
     * @param <SortOrderT> the sort order type for the API version and SOAP toolkit.
     * @param <BuilderT> the specific type of {@code BuilderInterface} associated with this builder.
     */
    interface ServiceWhereBuilderInterface<
            PageT, SortOrderT, BuilderT extends BuilderInterface<PageT, SortOrderT>>
        extends QueryBuilderInterface.WhereBuilderInterface<ServiceQueryInterface<PageT>> {

      @Override
      BuilderT equalTo(String propertyValue);

      @Override
      BuilderT equalTo(int propertyValue);

      @Override
      BuilderT equalTo(long propertyValue);

      @Override
      BuilderT equalTo(boolean propertyValue);

      @Override
      BuilderT notEqualTo(String propertyValue);

      @Override
      BuilderT notEqualTo(int propertyValue);

      @Override
      BuilderT notEqualTo(long propertyValue);

      @Override
      BuilderT notEqualTo(boolean propertyValue);

      @Override
      BuilderT contains(String propertyValue);

      @Override
      BuilderT containsIgnoreCase(String propertyValue);

      @Override
      BuilderT doesNotContain(String propertyValue);

      @Override
      BuilderT doesNotContainIgnoreCase(String propertyValue);

      @Override
      BuilderT greaterThan(long propertyValue);

      @Override
      BuilderT greaterThan(int propertyValue);

      @Override
      BuilderT greaterThan(double propertyValue);

      @Override
      BuilderT greaterThanOrEqualTo(long propertyValue);

      @Override
      BuilderT greaterThanOrEqualTo(int propertyValue);

      @Override
      BuilderT greaterThanOrEqualTo(double propertyValue);

      @Override
      BuilderT lessThan(long propertyValue);

      @Override
      BuilderT lessThan(int propertyValue);

      @Override
      BuilderT lessThan(double propertyValue);

      @Override
      BuilderT lessThanOrEqualTo(long propertyValue);

      @Override
      BuilderT lessThanOrEqualTo(int propertyValue);

      @Override
      BuilderT lessThanOrEqualTo(double propertyValue);

      @Override
      BuilderT startsWith(String propertyValue);

      @Override
      BuilderT startsWithIgnoreCase(String propertyValue);

      @Override
      BuilderT in(String... values);

      @Override
      BuilderT in(int... values);

      @Override
      BuilderT in(long... values);

      @Override
      BuilderT in(double... values);

      @Override
      BuilderT in(boolean... values);

      @Override
      BuilderT notIn(String... values);

      @Override
      BuilderT notIn(int... values);

      @Override
      BuilderT notIn(long... values);

      @Override
      BuilderT notIn(double... values);

      @Override
      BuilderT notIn(boolean... values);

      @Override
      BuilderT containsAny(String... values);

      @Override
      BuilderT containsAny(int... values);

      @Override
      BuilderT containsAny(long... values);

      @Override
      BuilderT containsAny(double... values);

      @Override
      BuilderT containsAll(String... values);

      @Override
      BuilderT containsAll(int... values);

      @Override
      BuilderT containsAll(long... values);

      @Override
      BuilderT containsAll(double... values);

      @Override
      BuilderT containsNone(String... values);

      @Override
      BuilderT containsNone(int... values);

      @Override
      BuilderT containsNone(long... values);

      @Override
      BuilderT containsNone(double... values);
    }
  }
}
