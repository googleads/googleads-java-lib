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

/**
 * A builder for query objects.
 *
 * <p>This builder is not thread safe.
 */
public interface QueryBuilderInterface<QueryT> {

  /**
   * Set the condition of this query as the WHERE clause.
   *
   * @param field the field of the given entity to be filtered on
   * @return the WHERE builder to create a predicate
   */
  WhereBuilderInterface where(String field);

  /**
   * Selects the provided fields for building as a query.
   *
   * @param fields the provided fields to be selected
   * @return this query builder itself for method chaining
   */
  QueryBuilderInterface<QueryT> fields(String... fields);

  /**
   * Selects the provided fields for building a report query.
   *
   * @param fields the fields to be selected
   * @return this builder itself for method chaining
   */
  QueryBuilderInterface<QueryT> fields(Iterable<String> fields);

  /**
   * Builds the query from the attributes of this builder.
   *
   * @return the built query object
   */
  QueryT build();

  /**
   * A builder for the WHERE clause of queries.
   *
   * <p>This builder is not thread safe.
   */
  interface WhereBuilderInterface<QueryT> {
    /**
     * Adds the predicate <b>EQUAL_TO</b> to the query for the given value.
     *
     * @param propertyValue the property value as a String independently of the field type. The
     *     caller should take care of the formatting if it is necessary
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> equalTo(String propertyValue);

    /**
     * Adds the predicate <b>EQUAL_TO</b> to the query for the given value.
     *
     * @param propertyValue the property value as a integer independently of the field type
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> equalTo(int propertyValue);

    /**
     * Adds the predicate <b>EQUAL_TO</b> to the query for the given value.
     *
     * @param propertyValue the property value as a long independently of the field type
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> equalTo(long propertyValue);

    /**
     * Adds the predicate <b>EQUAL_TO</b> to the query for the given value.
     *
     * @param propertyValue the property value as a boolean independently of the field type
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> equalTo(boolean propertyValue);

    /**
     * Adds the predicate <b>NOT_EQUAL_TO</b> to the query for the given value.
     *
     * @param propertyValue the property value as a String independently of the field type. The
     *     caller should take care of the formatting if it is necessary
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> notEqualTo(String propertyValue);

    /**
     * Adds the predicate <b>NOT_EQUAL_TO</b> to the query for the given value.
     *
     * @param propertyValue the property value as a integer independently of the field type
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> notEqualTo(int propertyValue);

    /**
     * Adds the predicate <b>NOT_EQUAL_TO</b> to the query for the given value.
     *
     * @param propertyValue the property value as a long independently of the field type
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> notEqualTo(long propertyValue);

    /**
     * Adds the predicate <b>NOT_EQUAL_TO</b> to the query for the given value.
     *
     * @param propertyValue the property value as a boolean independently of the field type
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> notEqualTo(boolean propertyValue);

    /**
     * Adds the predicate <b>CONTAINS</b> to the query for the given value.
     *
     * @param propertyValue the property value as a String independently of the field type. The
     *     caller should take care of the formatting if it is necessary
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> contains(String propertyValue);

    /**
     * Adds the predicate <b>CONTAINS_IGNORE_CASE</b> to the query for the given value.
     *
     * @param propertyValue the property value as a String independently of the field type. The
     *     caller should take care of the formatting if it is necessary
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> containsIgnoreCase(String propertyValue);

    /**
     * Adds the predicate <b>DOES_NOT_CONTAIN</b> to the query for the given value.
     *
     * @param propertyValue the property value as a String independently of the field type. The
     *     caller should take care of the formatting if it is necessary
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> doesNotContain(String propertyValue);

    /**
     * Adds the predicate <b>DOES_NOT_CONTAIN_IGNORE_CASE</b> to the query for the given value.
     *
     * @param propertyValue the property value as a String independently of the field type. The
     *     caller should take care of the formatting if it is necessary
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> doesNotContainIgnoreCase(String propertyValue);

    /**
     * Adds the predicate <b>GREATER_THAN</b> to the query for the given value.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> greaterThan(long propertyValue);

    /**
     * Adds the predicate <b>GREATER_THAN</b> to the query for the given value.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> greaterThan(int propertyValue);

    /**
     * Adds the predicate <b>GREATER_THAN</b> to the query for the given value.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> greaterThan(double propertyValue);

    /**
     * Adds the predicate <b>GREATER_THAN_OR_EQUAL_TO</b> to the query for the given value.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> greaterThanOrEqualTo(long propertyValue);

    /**
     * Adds the predicate <b>GREATER_THAN_OR_EQUAL_TO</b> to the query for the given value.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> greaterThanOrEqualTo(int propertyValue);

    /**
     * Adds the predicate <b>GREATER_THAN_OR_EQUAL_TO</b> to the query for the given value.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> greaterThanOrEqualTo(double propertyValue);

    /**
     * Adds the predicate <b>LESS_THAN</b> to the query for the given value.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> lessThan(long propertyValue);

    /**
     * Adds the predicate <b>LESS_THAN</b> to the query for the given value.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> lessThan(int propertyValue);

    /**
     * Adds the predicate <b>LESS_THAN</b> to the query for the given value.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> lessThan(double propertyValue);

    /**
     * Adds the predicate <b>LESS_THAN_OR_EQUAL_TO</b> to the query for the given value.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> lessThanOrEqualTo(long propertyValue);

    /**
     * Adds the predicate <b>LESS_THAN_OR_EQUAL_TO</b> to the query for the given value.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> lessThanOrEqualTo(int propertyValue);

    /**
     * Adds the predicate <b>LESS_THAN_OR_EQUAL_TO</b> to the query for the given value.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> lessThanOrEqualTo(double propertyValue);

    /**
     * Adds the predicate <b>STARTS_WITH</b> to the query for the given value.
     *
     * @param propertyValue the property value as a String independently of the field type. The
     *     caller should take care of the formatting if it is necessary
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> startsWith(String propertyValue);

    /**
     * Adds the predicate <b>STARTS_WITH_IGNORE_CASE</b> to the query for the given value.
     *
     * @param propertyValue the property value as a String independently of the field type. The
     *     caller should take care of the formatting if it is necessary
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> startsWithIgnoreCase(String propertyValue);

    /**
     * Adds the predicate <b>IN</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> in(String... values);

    /**
     * Adds the predicate <b>IN</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> in(int... values);

    /**
     * Adds the predicate <b>IN</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> in(long... values);

    /**
     * Adds the predicate <b>IN</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> in(double... values);

    /**
     * Adds the predicate <b>IN</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> in(boolean... values);

    /**
     * Adds the predicate <b>NOT_IN</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> notIn(String... values);

    /**
     * Adds the predicate <b>NOT_IN</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> notIn(int... values);

    /**
     * Adds the predicate <b>NOT_IN</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> notIn(long... values);

    /**
     * Adds the predicate <b>NOT_IN</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> notIn(double... values);

    /**
     * Adds the predicate <b>NOT_IN</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> notIn(boolean... values);

    /**
     * Adds the predicate <b>CONTAINS_ANY</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> containsAny(String... values);

    /**
     * Adds the predicate <b>CONTAINS_ANY</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> containsAny(int... values);

    /**
     * Adds the predicate <b>CONTAINS_ANY</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> containsAny(long... values);

    /**
     * Adds the predicate <b>CONTAINS_ANY</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> containsAny(double... values);

    /**
     * Adds the predicate <b>CONTAINS_ALL</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> containsAll(String... values);

    /**
     * Adds the predicate <b>CONTAINS_ALL</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> containsAll(int... values);

    /**
     * Adds the predicate <b>CONTAINS_ALL</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> containsAll(long... values);

    /**
     * Adds the predicate <b>CONTAINS_ALL</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> containsAll(double... values);

    /**
     * Adds the predicate <b>CONTAINS_NONE</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> containsNone(String... values);

    /**
     * Adds the predicate <b>CONTAINS_NONE</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> containsNone(int... values);

    /**
     * Adds the predicate <b>CONTAINS_NONE</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> containsNone(long... values);

    /**
     * Adds the predicate <b>CONTAINS_NONE</b> to the query for the given set of values.
     *
     * @return the containing query builder
     */
    QueryBuilderInterface<QueryT> containsNone(double... values);
  }
}
