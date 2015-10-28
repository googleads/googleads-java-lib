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

import static org.junit.Assert.assertEquals;

import com.google.common.collect.Maps;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Map;

/**
 * Test for the {@link QueryBuilderTest} class.
 */
@RunWith(JUnit4.class)
public class QueryBuilderTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  public QueryBuilderTest() {}

  @Test
  public void testRemoveKeyword_matches() {
    assertEquals(QueryBuilder.removeKeyword("FROM table", "FROM"), "table");
    assertEquals(QueryBuilder.removeKeyword("from table", "FROM"), "table");
    assertEquals(QueryBuilder.removeKeyword("fRom table", "FROM"), "table");
    assertEquals(QueryBuilder.removeKeyword("FROM ", "FROM"), "");
    assertEquals(QueryBuilder.removeKeyword("FROM  ", "FROM"), " ");
  }

  @Test
  public void testRemoveKeyword_doesntMatch() {
    assertEquals(QueryBuilder.removeKeyword("FROM table", "SELECT"), "FROM table");
    assertEquals(QueryBuilder.removeKeyword("table", "FROM"), "table");
  }

  @Test
  public void testSelect_null() {
    thrown.expect(NullPointerException.class);
    thrown.expectMessage(Matchers.equalTo("SELECT clause cannot be null"));
    QueryBuilder<Object> builder = new QueryBuilder<Object>();
    builder.select(null);
  }

  @Test
  public void testFrom_null() {
    thrown.expect(NullPointerException.class);
    thrown.expectMessage(Matchers.equalTo("FROM clause cannot be null"));
    QueryBuilder<Object> builder = new QueryBuilder<Object>();
    builder.from(null);
  }

  @Test
  public void testWhere_null() {
    thrown.expect(NullPointerException.class);
    thrown.expectMessage(Matchers.equalTo("WHERE clause cannot be null"));
    QueryBuilder<Object> builder = new QueryBuilder<Object>();
    builder.where(null);
  }

  @Test
  public void testOrderBy_null() {
    thrown.expect(NullPointerException.class);
    thrown.expectMessage(Matchers.equalTo("ORDER BY clause cannot be null"));
    QueryBuilder<Object> builder = new QueryBuilder<Object>();
    builder.orderBy(null);
  }

  @Test
  public void testBuildQuery_pqlTable() {
    String expectedQuery =
        "SELECT * FROM table WHERE a = b AND b = c ORDER BY a ASC, b DESC LIMIT 200 OFFSET 0";
    String query = new QueryBuilder<Object>()
        .select("*")
        .from("table")
        .where("a = b AND b = c")
        .orderBy("a ASC, b DESC")
        .limit(200)
        .offset(0)
        .buildQuery();
    assertEquals(expectedQuery, query);
  }

  @Test
  public void testBuildQuery_notPqlTable() {
    String expectedQuery =
        "WHERE a = b AND b = c ORDER BY a ASC, b DESC LIMIT 200 OFFSET 0";
    String query = new QueryBuilder<Object>()
        .where("a = b AND b = c")
        .orderBy("a ASC, b DESC")
        .limit(200)
        .offset(0)
        .buildQuery();
    assertEquals(expectedQuery, query);
  }

  @Test
  public void testBuildQuery_noOffset() {
    String expectedQuery =
        "WHERE a = b AND b = c ORDER BY a ASC, b DESC LIMIT 200";
    String query = new QueryBuilder<Object>()
        .where("a = b AND b = c")
        .orderBy("a ASC, b DESC")
        .limit(200)
        .buildQuery();
    assertEquals(expectedQuery, query);
  }

  @Test
  public void testBuildQuery_justLimit() {
    String expectedQuery = "LIMIT 500";
    String query = new QueryBuilder<Object>()
        .limit(500)
        .buildQuery();
    assertEquals(expectedQuery, query);
  }

  @Test
  public void testBuildQuery_limitAndOffset() {
    String expectedQuery = "LIMIT 500 OFFSET 0";
    String query = new QueryBuilder<Object>()
        .limit(500)
        .offset(0)
        .buildQuery();
    assertEquals(expectedQuery, query);
  }

  @Test
  public void testBuildQuery_removeLimitAndOffset() {
    String expectedQueryBefore = "WHERE a = b ORDER BY a LIMIT 500 OFFSET 0";
    String expectedQueryAfter = "WHERE a = b ORDER BY a";

    QueryBuilder<Object> queryBuilder = new QueryBuilder<Object>()
        .limit(500)
        .offset(0)
        .where("a = b")
        .orderBy("a");

    assertEquals(expectedQueryBefore, queryBuilder.buildQuery());

    queryBuilder.removeLimitAndOffset();

    assertEquals(expectedQueryAfter, queryBuilder.buildQuery());
  }


  @Test
  public void testBuildQuery_empty() {
    String expectedQuery = "";
    String query = new QueryBuilder<Object>()
        .buildQuery();
    assertEquals(expectedQuery, query);
  }

  @Test
  public void testBuildQuery_OffsetWithoutLimit() {
    thrown.expect(IllegalStateException.class);
    thrown.expectMessage(Matchers.equalTo("OFFSET cannot be set if LIMIT is not set."));
    new QueryBuilder<Object>().offset(500).buildQuery();
  }

  @Test
  public void testBuildQuery_withBindingVariable() {
    String key = "key";
    String value = "value";

    QueryBuilder<Object> builder = new QueryBuilder<Object>();
    builder.withBindVariableValue(key, value);

    assertEquals(value, builder.getBindVariableMap().get(key));
  }

  @Test
  public void testBuildQuery_withBindVariableValues() {
    String key = "key";
    String value = "value";
    String key2 = "key2";
    String value2 = "value2";

    Map<String, Object> valueMap = Maps.newHashMap();
    valueMap.put(key, value);
    valueMap.put(key2, value2);

    QueryBuilder<Object> builder = new QueryBuilder<Object>();
    builder.withBindVariableValues(valueMap);

    assertEquals(value, builder.getBindVariableMap().get(key));
    assertEquals(value2, builder.getBindVariableMap().get(key2));
  }
}
