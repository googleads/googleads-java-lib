// Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.api.ads.admanager.axis.utils.v202502;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.api.ads.admanager.axis.v202502.BooleanValue;
import com.google.api.ads.admanager.axis.v202502.NumberValue;
import com.google.api.ads.admanager.axis.v202502.Statement;
import com.google.api.ads.admanager.axis.v202502.String_ValueMapEntry;
import com.google.api.ads.admanager.axis.v202502.TextValue;
import com.google.api.ads.admanager.axis.v202502.Value;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Test for {@link StatementBuilder}. */
@RunWith(JUnit4.class)
public class StatementBuilderTest {

  public StatementBuilderTest() {}

  @Test
  public void testSelect() {
    StatementBuilder statementBuilder = new StatementBuilder();
    Statement statement = statementBuilder.select("id, name").toStatement();
    assertEquals("SELECT id, name", statement.getQuery());
  }

  @Test
  public void testSelect_stripsSelect() {
    StatementBuilder statementBuilder = new StatementBuilder();
    Statement statement = statementBuilder.select("SELECT id, name").toStatement();
    assertEquals("SELECT id, name", statement.getQuery());
  }

  @Test
  public void testFrom() {
    StatementBuilder statementBuilder = new StatementBuilder();
    Statement statement = statementBuilder.from("line_item").toStatement();
    assertEquals("FROM line_item", statement.getQuery());
  }

  @Test
  public void testFrom_stripsFrom() {
    StatementBuilder statementBuilder = new StatementBuilder();
    Statement statement = statementBuilder.from("FROM line_item").toStatement();
    assertEquals("FROM line_item", statement.getQuery());
  }

  @Test
  public void testWhere() {
    StatementBuilder statementBuilder = new StatementBuilder();
    Statement statement = statementBuilder.where("id = 12345").toStatement();
    assertEquals("WHERE id = 12345", statement.getQuery());
  }

  @Test
  public void testWhere_stripsWhere() {
    StatementBuilder statementBuilder = new StatementBuilder();
    Statement statement = statementBuilder.where("WHERE id = 12345").toStatement();
    assertEquals("WHERE id = 12345", statement.getQuery());
  }

  @Test
  public void testOrderBy() {
    StatementBuilder statementBuilder = new StatementBuilder();
    Statement statement = statementBuilder.orderBy("id ASC").toStatement();
    assertEquals("ORDER BY id ASC", statement.getQuery());
  }

  @Test
  public void testOrderBy_stripsOrderBy() {
    StatementBuilder statementBuilder = new StatementBuilder();
    Statement statement = statementBuilder.orderBy("ORDER BY id ASC").toStatement();
    assertEquals("ORDER BY id ASC", statement.getQuery());
  }

  @Test
  public void testLimit() {
    StatementBuilder statementBuilder = new StatementBuilder();
    Statement statement = statementBuilder.limit(500).toStatement();
    assertEquals("LIMIT 500", statement.getQuery());
  }

  @Test
  public void testBindVariables_bool() {
    StatementBuilder statementBuilder = new StatementBuilder();
    Statement statement =
        statementBuilder.where("bool = :bool").withBindVariableValue("bool", true).toStatement();
    String_ValueMapEntry entry = statement.getValues(0);
    assertEquals("bool", entry.getKey());
    assertEquals(BooleanValue.class, entry.getValue().getClass());
    assertEquals(true, ((BooleanValue) entry.getValue()).getValue());
  }

  @Test
  public void testBindVariables_text() {
    StatementBuilder statementBuilder = new StatementBuilder();
    Statement statement =
        statementBuilder.where("text = :text").withBindVariableValue("text", "foo").toStatement();
    String_ValueMapEntry entry = statement.getValues(0);
    assertEquals("text", entry.getKey());
    assertEquals(TextValue.class, entry.getValue().getClass());
    assertEquals("foo", ((TextValue) entry.getValue()).getValue());
  }

  @Test
  public void testBindVariables_number() {
    StatementBuilder statementBuilder = new StatementBuilder();
    Statement statement =
        statementBuilder.where("number = :number").withBindVariableValue("number", 1).toStatement();
    String_ValueMapEntry entry = statement.getValues(0);
    assertEquals("number", entry.getKey());
    assertEquals(NumberValue.class, entry.getValue().getClass());
    assertEquals("1", ((NumberValue) entry.getValue()).getValue());
  }

  @Test
  public void testIncreaseOffset() {
    StatementBuilder statementBuilder = new StatementBuilder();
    Statement initialOffset = statementBuilder.limit(100).offset(100).toStatement();
    assertEquals("LIMIT 100 OFFSET 100", initialOffset.getQuery());
    Statement increasedOffset = statementBuilder.increaseOffsetBy(100).toStatement();
    assertEquals("LIMIT 100 OFFSET 200", increasedOffset.getQuery());
  }

  @Test
  public void testLimitOffsetDefaults() {
    StatementBuilder statementBuilder = new StatementBuilder();
    Statement initialOffset = statementBuilder.limit(100).toStatement();
    assertEquals("LIMIT 100", initialOffset.getQuery());
    Statement increasedOffset = statementBuilder.increaseOffsetBy(100).toStatement();
    assertEquals("LIMIT 100 OFFSET 100", increasedOffset.getQuery());
  }

  @Test
  public void testRemoveLimitAndOffset() {
    StatementBuilder statementBuilder = new StatementBuilder();
    Statement initialOffset = statementBuilder.where("id = 1").limit(100).offset(100).toStatement();
    assertEquals("WHERE id = 1 LIMIT 100 OFFSET 100", initialOffset.getQuery());
    Statement removed = statementBuilder.removeLimitAndOffset().toStatement();
    assertEquals("WHERE id = 1", removed.getQuery());
  }

  @Test
  public void testGetOffset() {
    StatementBuilder statementBuilder = new StatementBuilder().offset(1);
    assertEquals(1, statementBuilder.getOffset().intValue());
    statementBuilder.offset(100);
    assertEquals(100, statementBuilder.getOffset().intValue());
  }

  @Test
  public void testBuildQuery() {
    StatementBuilder statementBuilder =
        new StatementBuilder()
            .select("id, name")
            .from("line_item")
            .where("name like :prefix")
            .orderBy("id ASC")
            .limit(100)
            .offset(0)
            .withBindVariableValue("prefix", "debug-%");
    String expected =
        "SELECT id, name FROM line_item WHERE name like :prefix ORDER BY id ASC "
            + "LIMIT 100 OFFSET 0";
    assertEquals(expected, statementBuilder.buildQuery());
  }

  @Test
  public void testGetBindVariableMap() {
    StatementBuilder statementBuilder =
        new StatementBuilder()
            .where("number = :number and bool = :bool")
            .withBindVariableValue("number", 1)
            .withBindVariableValue("bool", false);
    Map<String, Value> map = statementBuilder.getBindVariableMap();
    assertEquals(2, map.size());
    assertEquals(NumberValue.class, map.get("number").getClass());
    assertEquals(BooleanValue.class, map.get("bool").getClass());
    assertEquals("1", ((NumberValue) map.get("number")).getValue());
    assertEquals(false, ((BooleanValue) map.get("bool")).getValue());
  }

  @Test
  public void testGetBindVariableMap_noEntries() {
    StatementBuilder statementBuilder = new StatementBuilder().where("id = 1");
    assertTrue(statementBuilder.getBindVariableMap().isEmpty());
  }
}
