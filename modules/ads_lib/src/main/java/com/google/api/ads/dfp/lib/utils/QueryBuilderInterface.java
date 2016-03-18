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

import java.util.Map;

/**
 * {@code QueryBuilderInterface} allows for queries to be constructed in parts.
 *
 * @param <V> the type of the API Value
 */
public interface QueryBuilderInterface<V> {

  /**
   * Sets the statement SELECT clause in the form of "a,b" or "*".
   * Only necessary for statements being sent to the
   * {@code PublisherQueryLanguageService}. The "SELECT " keyword will be
   * ignored.
   *
   * @param columns the statement select clause without "SELECT"
   * @return a reference to this object
   */
  QueryBuilderInterface<V> select(String columns);

  /**
   * Sets the statement FROM clause in the form of "table".
   * Only necessary for statements being sent to the
   * {@code PublisherQueryLanguageService}. The "FROM " keyword will be
   * ignored.
   *
   * @param table the statement from clause without "FROM"
   * @return a reference to this object
   */
  QueryBuilderInterface<V> from(String table);

  /**
   * Sets the statement WHERE clause in the form of<br><br>
   * <code>"WHERE &lt;condition&gt; {[AND | OR] &lt;condition&gt; ...}"</code>
   * <br><br>
   * e.g. "a = b OR b = c". The "WHERE " keyword will be ignored.
   * @param conditions the statement query without "WHERE"
   * @return a reference to this object
   */
  QueryBuilderInterface<V> where(String conditions);

  /**
   * Sets the statement LIMIT clause in the form of<br><br>
   * <code>"LIMIT &lt;count&gt;"</code>
   * <br><br>
   * e.g. 1000.
   * @param count the statement limit
   * @return a reference to this object
   */
  QueryBuilderInterface<V> limit(Integer count);

  /**
   * Sets the statement OFFSET clause in the form of<br><br>
   * <code>"OFFSET &lt;count&gt;"</code>
   * <br><br>
   * e.g. 200.
   * @param count the statement offset
   * @return a reference to this object
   */
  QueryBuilderInterface<V> offset(Integer count);

  /**
   * Increases the offset by the {@code amount}.
   * @param amount the amount to increase the offset
   * @return a reference to this object
   */
  QueryBuilderInterface<V> increaseOffsetBy(Integer amount);

  /**
   * Gets the current offset.
   * @return the current offset
   */
  Integer getOffset();

  /**
   * Removes the limit and offset from the query.
   * @return a reference to this object
   */
  QueryBuilderInterface<V> removeLimitAndOffset();

  /**
   * Sets the statement ORDER BY clause in the form of<br><br>
   * <code>"ORDER BY &lt;property&gt; [ASC | DESC]"</code>
   * <br><br>
   * e.g. "type ASC, lastModifiedDateTime DESC". The "ORDER BY " keyword will be
   * ignored.
   * @param orderBy the statement order by without "ORDER BY"
   * @return a reference to this object
   */
  QueryBuilderInterface<V> orderBy(String orderBy);

  /**
   * Puts a key-value into the bind variables.
   */
  QueryBuilderInterface<V> withBindVariableValue(String key, V value);

  /**
   * Gets an unmodifiable key-value map.
   */
  Map<String, V> getBindVariableMap();

  /**
   * Builds the query from the clauses.
   * @return the constructed query
   */
  String buildQuery();
}
