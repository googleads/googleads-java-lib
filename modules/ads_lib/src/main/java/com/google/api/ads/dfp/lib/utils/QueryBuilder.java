// Copyright 2012 Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfp.lib.utils;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.Map;

/**
 * {@code QueryBuilder} allows for queries to be constructed in parts.
 *
 * @param <V> the type of the API Value
 *
 * @author Adam Rogal
 */
public class QueryBuilder<V> implements QueryBuilderInterface<V> {

  protected static final String SELECT = "SELECT";
  protected static final String FROM = "FROM";
  protected static final String WHERE = "WHERE";
  protected static final String LIMIT = "LIMIT";
  protected static final String OFFSET = "OFFSET";
  protected static final String ORDER_BY = "ORDER BY";

  protected String select;
  protected String from;
  protected String where;
  protected Integer limit = null;
  protected Integer offset = null;
  protected String orderBy;

  protected Map<String, V> valueMap;

  /**
   * Constructs a query builder.
   */
  public QueryBuilder() {
    valueMap = Maps.newHashMap();
  }

  /**
   * Removes the {@code keyword} from the {@code clause} if present. Will
   * remove {@code keyword + " "}.
   * @param clause the clause to remove from
   * @param keyword the keyword to remove
   * @return a new string with the keyword + " " removed
   */
  static String removeKeyword(String clause, String keyword) {
    keyword = keyword + " ";
    if (clause.regionMatches(true, 0, keyword, 0, keyword.length())) {
      return clause.substring(keyword.length());
    }
    return clause;
  }

  /**
   * Sets the statement SELECT clause in the form of "a,b" or "*".
   * Only necessary for statements being sent to the
   * {@code PublisherQueryLanguageService}. The "SELECT " keyword will be
   * ignored.
   *
   * @param columns the statement select clause without "SELECT"
   * @return a reference to this object
   */
  public QueryBuilder<V> select(String columns) {
    Preconditions.checkNotNull(columns, "SELECT clause cannot be null");
    columns = removeKeyword(columns, SELECT);
    this.select = columns;
    return this;
  }

  /**
   * Sets the statement FROM clause in the form of "table".
   * Only necessary for statements being sent to the
   * {@code PublisherQueryLanguageService}. The "FROM " keyword will be
   * ignored.
   *
   * @param table the statement from clause without "FROM"
   * @return a reference to this object
   */
  public QueryBuilder<V> from(String table) {
    Preconditions.checkNotNull(table, "FROM clause cannot be null");
    table = removeKeyword(table, FROM);
    this.from = table;
    return this;
  }

  /**
   * Sets the statement WHERE clause in the form of<br><br>
   * <code>"WHERE &lt;condition&gt; {[AND | OR] &lt;condition&gt; ...}"</code>
   * <br><br>
   * e.g. "a = b OR b = c". The "WHERE " keyword will be ignored.
   * @param conditions the statement query without "WHERE"
   * @return a reference to this object
   */
  public QueryBuilder<V> where(String conditions) {
    Preconditions.checkNotNull(conditions, "WHERE clause cannot be null");
    conditions = removeKeyword(conditions, WHERE);
    this.where = conditions;
    return this;
  }

  /**
   * Sets the statement LIMIT clause in the form of<br><br>
   * <code>"LIMIT &lt;count&gt;"</code>
   * <br><br>
   * e.g. 1000.
   * @param count the statement limit
   * @return a reference to this object
   */
  public QueryBuilder<V> limit(Integer count) {
    this.limit = count;
    return this;
  }

  /**
   * Sets the statement OFFSET clause in the form of<br><br>
   * <code>"OFFSET &lt;count&gt;"</code>
   * <br><br>
   * e.g. 200.
   * @param count the statement offset
   * @return a reference to this object
   */
  public QueryBuilder<V> offset(Integer count) {
    this.offset = count;
    return this;
  }

  /**
   * Increases the offset by the {@code amount}.
   * @param amount the amount to increase the offset
   * @return a reference to this object
   */
  public QueryBuilder<V> increaseOffsetBy(Integer amount) {
    if (offset == null) {
      offset = 0;
    }
    this.offset += amount;
    return this;
  }

  /**
   * Gets the current offset.
   * @return the current offset
   */
  public Integer getOffset() {
    return this.offset;
  }

  /**
   * Removes the limit and offset from the query.
   * @return a reference to this object
   */
  public QueryBuilder<V> removeLimitAndOffset() {
    offset = null;
    limit = null;
    return this;
  }

  /**
   * Sets the statement ORDER BY clause in the form of<br><br>
   * <code>"ORDER BY &lt;property&gt; [ASC | DESC]"</code>
   * <br><br>
   * e.g. "type ASC, lastModifiedDateTime DESC". The "ORDER BY " keyword will be
   * ignored.
   * @param orderBy the statement order by without "ORDER BY"
   * @return a reference to this object
   */
  public QueryBuilder<V> orderBy(String orderBy) {
    Preconditions.checkNotNull(orderBy, "ORDER BY clause cannot be null");
    orderBy = removeKeyword(orderBy, ORDER_BY);
    this.orderBy = orderBy;
    return this;
  }

  /**
   * Adds a value to the statement in the form of a {@code Value}.
   *
   * @param key the value key
   * @param value the value
   * @return a reference to this object
   */
  public QueryBuilder<V> withBindVariableValue(String key, V value) {
    valueMap.put(key, value);
    return this;
  }

  /**
   * Adds all key value mappings.
   *
   * @param values the mappings of key to value of type <V>
   * @return a reference to this object
   */
  public QueryBuilder<V> withBindVariableValues(Map<String, V> values) {
    valueMap.putAll(values);
    return this;
  }

  /**
   * Returns an unmodifiable form of the key to value map.
   */
  public Map<String, V> getBindVariableMap() {
    return Collections.unmodifiableMap(valueMap);
  }

  /**
   * Checks that the query is valid.
   */
  protected void validateQuery() {
    Preconditions.checkState(limit != null || (limit == null && offset == null),
        "OFFSET cannot be set if LIMIT is not set.");
  }

  /**
   * Builds the query from the clauses.
   * @return the c query
   */
  public String buildQuery() {
    validateQuery();

    StringBuilder stringBuilder = new StringBuilder();
    if (!Strings.isNullOrEmpty(select)) {
      stringBuilder = stringBuilder.append(SELECT).append(" ").append(select).append(" ");
    }
    if (!Strings.isNullOrEmpty(from)) {
      stringBuilder = stringBuilder.append(FROM).append(" ").append(from).append(" ");
    }
    if (!Strings.isNullOrEmpty(where)) {
      stringBuilder = stringBuilder.append(WHERE).append(" ").append(where).append(" ");
    }
    if (!Strings.isNullOrEmpty(orderBy)) {
      stringBuilder = stringBuilder.append(ORDER_BY).append(" ").append(orderBy).append(" ");
    }
    if (limit != null) {
      stringBuilder = stringBuilder.append(LIMIT).append(" ").append(limit).append(" ");
    }
    if (offset != null) {
      stringBuilder = stringBuilder.append(OFFSET).append(" ").append(offset).append(" ");
    }
    return stringBuilder.toString().trim();
  }
}
