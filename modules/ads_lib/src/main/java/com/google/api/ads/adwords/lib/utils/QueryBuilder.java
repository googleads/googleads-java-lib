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

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.primitives.Booleans;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.util.Arrays;
import java.util.List;

/**
 * A builder for query objects.
 *
 * <p>This builder is not thread safe.
 */
public abstract class QueryBuilder<
        QueryBuilderT extends QueryBuilder<QueryBuilderT, QueryT>, QueryT>
    implements QueryBuilderInterface<QueryT> {

  protected final List<WhereBuilderInterface> whereBuilders = Lists.newArrayList();

  public QueryBuilder() {}

  /**
   * Constructs a new query builder by copying all properties from the passed query builder.
   *
   * @param queryBuilder the query builder whose properties will be copied to.
   */
  public QueryBuilder(QueryBuilderT queryBuilder) {
    checkNotNull(queryBuilder, "The query builder cannot be null.");
    this.whereBuilders.addAll(Lists.newArrayList(queryBuilder.whereBuilders));
  }

  /** Builds the WHERE clause of a query. */
  public class WhereBuilder implements WhereBuilderInterface<QueryT> {

    private final String field;
    private String awqlClause;

    /**
     * Construct the WHERE builder with the specified field.
     *
     * @param field the field to create the predicate for
     */
    public WhereBuilder(String field) {
      this.field = checkNotNull(field, "The field cannot be null.");
    }

    @Override
    public String toString() {
      return awqlClause;
    }

    @Override
    public final QueryBuilderInterface<QueryT> equalTo(String propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "=");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> equalTo(int propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "=");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> equalTo(long propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "=");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> equalTo(boolean propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "=");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> notEqualTo(String propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "!=");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> notEqualTo(int propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "!=");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> notEqualTo(long propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "!=");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> notEqualTo(boolean propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "!=");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> contains(String propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "CONTAINS");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> containsIgnoreCase(String propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "CONTAINS_IGNORE_CASE");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> doesNotContain(String propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "DOES_NOT_CONTAIN");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> doesNotContainIgnoreCase(String propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "DOES_NOT_CONTAIN_IGNORE_CASE");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> greaterThan(long propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, ">");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> greaterThan(int propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, ">");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> greaterThan(double propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, ">");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> greaterThanOrEqualTo(long propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, ">=");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> greaterThanOrEqualTo(int propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, ">=");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> greaterThanOrEqualTo(double propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, ">=");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> lessThan(long propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "<");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> lessThan(int propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "<");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> lessThan(double propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "<");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> lessThanOrEqualTo(long propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "<=");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> lessThanOrEqualTo(int propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "<=");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> lessThanOrEqualTo(double propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "<=");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> startsWith(String propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "STARTS_WITH");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> startsWithIgnoreCase(String propertyValue) {
      awqlClause = createSingleValuePredicate(propertyValue, "STARTS_WITH_IGNORE_CASE");
      return QueryBuilder.this;
    }

    /** Adds a predicate for the specified String property value and operator. */
    private String createSingleValuePredicate(String propertyValue, String operator) {
      return String.format("%s %s %s", field, operator, String.format("\"%s\"", propertyValue));
    }

    /** Adds a predicate for the specified long property value and operator. */
    private String createSingleValuePredicate(long propertyValue, String operator) {
      return String.format("%s %s %d", field, operator, propertyValue);
    }

    /** Adds a predicate for the specified double property value and operator. */
    private String createSingleValuePredicate(double propertyValue, String operator) {
      return String.format("%s %s %f", field, operator, propertyValue);
    }

    /** Adds a predicate for the specified boolean property value and operator. */
    private String createSingleValuePredicate(boolean propertyValue, String operator) {
      return String.format("%s %s %s", field, operator, propertyValue);
    }

    @Override
    public final QueryBuilderInterface<QueryT> in(String... values) {
      awqlClause = createMultipleValuesPredicate(values, "IN");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> in(int... values) {
      awqlClause = createMultipleValuesPredicate(values, "IN");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> in(long... values) {
      awqlClause = createMultipleValuesPredicate(values, "IN");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> in(double... values) {
      awqlClause = createMultipleValuesPredicate(values, "IN");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> in(boolean... values) {
      awqlClause = createMultipleValuesPredicate(values, "IN");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> notIn(String... values) {
      awqlClause = createMultipleValuesPredicate(values, "NOT_IN");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> notIn(int... values) {
      awqlClause = createMultipleValuesPredicate(values, "NOT_IN");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> notIn(long... values) {
      awqlClause = createMultipleValuesPredicate(values, "NOT_IN");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> notIn(double... values) {
      awqlClause = createMultipleValuesPredicate(values, "NOT_IN");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> notIn(boolean... values) {
      awqlClause = createMultipleValuesPredicate(values, "NOT_IN");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> containsAny(String... values) {
      awqlClause = createMultipleValuesPredicate(values, "CONTAINS_ANY");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> containsAny(int... values) {
      awqlClause = createMultipleValuesPredicate(values, "CONTAINS_ANY");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> containsAny(long... values) {
      awqlClause = createMultipleValuesPredicate(values, "CONTAINS_ANY");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> containsAny(double... values) {
      awqlClause = createMultipleValuesPredicate(values, "CONTAINS_ANY");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> containsAll(String... values) {
      awqlClause = createMultipleValuesPredicate(values, "CONTAINS_ALL");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> containsAll(int... values) {
      awqlClause = createMultipleValuesPredicate(values, "CONTAINS_ALL");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> containsAll(long... values) {
      awqlClause = createMultipleValuesPredicate(values, "CONTAINS_ALL");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> containsAll(double... values) {
      awqlClause = createMultipleValuesPredicate(values, "CONTAINS_ALL");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> containsNone(String... values) {
      awqlClause = createMultipleValuesPredicate(values, "CONTAINS_NONE");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> containsNone(int... values) {
      awqlClause = createMultipleValuesPredicate(values, "CONTAINS_NONE");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> containsNone(long... values) {
      awqlClause = createMultipleValuesPredicate(values, "CONTAINS_NONE");
      return QueryBuilder.this;
    }

    @Override
    public final QueryBuilderInterface<QueryT> containsNone(double... values) {
      awqlClause = createMultipleValuesPredicate(values, "CONTAINS_NONE");
      return QueryBuilder.this;
    }

    /** Adds a predicate for the specified String property values and operator. */
    private String createMultipleValuesPredicate(String[] values, String operator) {
      Function<String, String> normalize =
          new Function<String, String>() {
            @Override
            public String apply(String s) {
              return String.format("\"%s\"", s);
            }
          };

      return String.format(
          "%s %s [%s]",
          field, operator, Joiner.on(", ").join(Lists.transform(Arrays.asList(values), normalize)));
    }

    /** Adds a predicate for the specified double property values and operator. */
    private String createMultipleValuesPredicate(double[] values, String operator) {
      return String.format(
          "%s %s [%s]",
          field,
          operator,
          Joiner.on(", ")
              .join(Lists.transform(Doubles.asList(values), Functions.toStringFunction())));
    }

    /** Adds a predicate for the specified integer property values and operator. */
    private String createMultipleValuesPredicate(int[] values, String operator) {
      return String.format(
          "%s %s [%s]",
          field,
          operator,
          Joiner.on(", ").join(Lists.transform(Ints.asList(values), Functions.toStringFunction())));
    }

    /** Adds a predicate for the specified long property values and operator. */
    private String createMultipleValuesPredicate(long[] values, String operator) {
      return String.format(
          "%s %s [%s]",
          field,
          operator,
          Joiner.on(", ")
              .join(Lists.transform(Longs.asList(values), Functions.toStringFunction())));
    }

    /** Adds a predicate for the specified boolean property values and operator. */
    private String createMultipleValuesPredicate(boolean[] values, String operator) {
      return String.format(
          "%s %s [%s]",
          field,
          operator,
          Joiner.on(", ")
              .join(Lists.transform(Booleans.asList(values), Functions.toStringFunction())));
    }
  }
}
