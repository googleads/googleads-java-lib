// Copyright 2015 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.dfp.axis.utils.v201711;

import com.google.api.ads.common.lib.utils.Maps;
import com.google.api.ads.dfp.axis.v201711.Statement;
import com.google.api.ads.dfp.axis.v201711.String_ValueMapEntry;
import com.google.api.ads.dfp.axis.v201711.Value;
import com.google.api.ads.dfp.lib.utils.QueryBuilder;
import com.google.api.ads.dfp.lib.utils.QueryBuilderInterface;
import com.google.common.annotations.VisibleForTesting;
import java.util.Map;

/**
 * {@code StatementBuilder} allows for statements to be constructed in parts.
 * <p>
 * Typical usage is:
 * <pre>
 * StatementBuilder statementBuilder = new StatementBuilder()
 *     .where("lastModifiedDateTime > :yesterday AND type = :type")
 *     .orderBy("name DESC")
 *     .limit(200)
 *     .offset(20)
 *     .withBindVariableValue("yesterday",
 *         DateTimes.fromDate(new org.joda.time.DateTime().minusDays(1).toDate()))
 *     .withBindVariableValue("type", "Type")
 *
 * Statement statement = statementBuilder.toStatement();
 * //...
 * statementBuilder.increaseOffsetBy(20);
 * statement = statementBuilder.toStatement();
 * </pre>
 */
public final class StatementBuilder {

  public static final int SUGGESTED_PAGE_LIMIT = 500;

  private final QueryBuilderInterface<Value> queryBuilder;

  /**
   * Constructs a statement builder.
   */
  public StatementBuilder() {
    this(new QueryBuilder<Value>());
  }

  /**
   * Constructor for testing.
   */
  @VisibleForTesting
  StatementBuilder(QueryBuilderInterface<Value> queryBuilder) {
    this.queryBuilder = queryBuilder;
  }

  /**
   * Adds a bind variable value to the statement. The value will converted
   * according to {@link Pql#createValue(Object)}. If the value is of type
   * {@code Value}, no conversion will be done.
   *
   * @param key the value key
   * @param value the bind variable value
   * @return a reference to this object
   */
  public StatementBuilder withBindVariableValue(String key, Object value) {
    return withBindVariableValue(key, Pql.createValue(value));
  }

  /**
   * Adds a bind variable value to the statement.
   *
   * @param key the value key
   * @param value the bind variable value
   * @return a reference to this object
   */
  public StatementBuilder withBindVariableValue(String key, Value value) {
    queryBuilder.withBindVariableValue(key, value);
    return this;
  }

  /**
   * Gets the {@link Statement} representing the state of this statement
   * builder.
   *
   * @return the {@link Statement}
   */
  public Statement toStatement() {
    Statement statement = new Statement();
    statement.setQuery(queryBuilder.buildQuery());
    statement.setValues(Maps.toList(queryBuilder.getBindVariableMap(), String_ValueMapEntry.class)
        .toArray(new String_ValueMapEntry[] {}));
    return statement;
  }

  public StatementBuilder select(String columns) {
    queryBuilder.select(columns);
    return this;
  }

  public StatementBuilder from(String table) {
    queryBuilder.from(table);
    return this;
  }

  public StatementBuilder where(String conditions) {
    queryBuilder.where(conditions);
    return this;
  }

  public StatementBuilder limit(Integer count) {
    queryBuilder.limit(count);
    return this;
  }

  public StatementBuilder offset(Integer count) {
    queryBuilder.offset(count);
    return this;
  }

  public StatementBuilder increaseOffsetBy(Integer amount) {
    queryBuilder.increaseOffsetBy(amount);
    return this;
  }

  public Integer getOffset() {
    return queryBuilder.getOffset();
  }

  public StatementBuilder removeLimitAndOffset() {
    queryBuilder.removeLimitAndOffset();
    return this;
  }

  public StatementBuilder orderBy(String orderBy) {
    queryBuilder.orderBy(orderBy);
    return this;
  }

  public Map<String, Value> getBindVariableMap() {
    return queryBuilder.getBindVariableMap();
  }

  public String buildQuery() {
    return queryBuilder.buildQuery();
  }
}
