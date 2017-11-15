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

package com.google.api.ads.dfp.jaxws.utils.v201711;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.api.ads.dfp.jaxws.v201711.AdUnitTargeting;
import com.google.api.ads.dfp.jaxws.v201711.BooleanValue;
import com.google.api.ads.dfp.jaxws.v201711.ColumnType;
import com.google.api.ads.dfp.jaxws.v201711.Date;
import com.google.api.ads.dfp.jaxws.v201711.DateTime;
import com.google.api.ads.dfp.jaxws.v201711.DateTimeValue;
import com.google.api.ads.dfp.jaxws.v201711.DateValue;
import com.google.api.ads.dfp.jaxws.v201711.InventoryTargeting;
import com.google.api.ads.dfp.jaxws.v201711.NumberValue;
import com.google.api.ads.dfp.jaxws.v201711.ResultSet;
import com.google.api.ads.dfp.jaxws.v201711.Row;
import com.google.api.ads.dfp.jaxws.v201711.SetValue;
import com.google.api.ads.dfp.jaxws.v201711.Targeting;
import com.google.api.ads.dfp.jaxws.v201711.TargetingValue;
import com.google.api.ads.dfp.jaxws.v201711.TextValue;
import com.google.api.ads.dfp.jaxws.v201711.Value;
import com.google.common.collect.Lists;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Test for {@link Pql}.
 */
@RunWith(JUnit4.class)
public class PqlTest {

  private static final String TIME_ZONE_ID1 = "Asia/Shanghai";

  private ColumnType column1;
  private ColumnType column2;
  private ColumnType column3;

  private TextValue textValue1;
  private TextValue textValue2;
  private TextValue textValue3;
  private TextValue textValue4;
  private BooleanValue booleanValue1;
  private BooleanValue booleanValue2;
  private BooleanValue booleanValue3;
  private NumberValue numberValue1;
  private NumberValue numberValue2;
  private NumberValue numberValue3;
  private DateValue dateValue1;
  private DateTimeValue dateTimeValue1;
  private Targeting targeting1;
  private TargetingValue targetingValue1;
  private SetValue numberSetValue;
  private SetValue textSetValue;
  private SetValue dateSetValue;
  private SetValue dateTimeSetValue;
  private SetValue mixedSetValue;
  private SetValue commaTextSetValue;
  
  private DateTime dateTime1;
  private Date date1;

  @Rule
  public ExpectedException thrown = ExpectedException.none();
  
  public PqlTest() {}

  @Before
  public void setUp() throws Exception {
    column1 = new ColumnType();
    column1.setLabelName("column1");

    column2 = new ColumnType();
    column2.setLabelName("column2");

    column3 = new ColumnType();
    column3.setLabelName("column3");

    textValue1 = new TextValue();
    textValue1.setValue("value1");

    textValue2 = new TextValue();
    textValue2.setValue("value2");

    textValue3 = new TextValue();
    textValue3.setValue("value3");
    
    textValue4 = new TextValue();
    textValue4.setValue("comma,separated");

    booleanValue1 = new BooleanValue();
    booleanValue1.setValue(false);

    booleanValue2 = new BooleanValue();
    booleanValue2.setValue(true);

    booleanValue3 = new BooleanValue();
    booleanValue3.setValue(false);

    numberValue1 = new NumberValue();
    numberValue1.setValue("1");

    numberValue2 = new NumberValue();
    numberValue2.setValue("1.02");

    numberValue3 = new NumberValue();
    numberValue3.setValue("-1");

    dateTime1 = new DateTime();
    date1 = new Date();
    date1.setYear(2012);
    date1.setMonth(12);
    date1.setDay(2);
    dateTime1.setDate(date1);
    dateTime1.setHour(12);
    dateTime1.setMinute(45);
    dateTime1.setSecond(0);
    dateTime1.setTimeZoneID(TIME_ZONE_ID1);

    dateTimeValue1 = new DateTimeValue();
    dateTimeValue1.setValue(dateTime1);

    dateValue1 = new DateValue();
    dateValue1.setValue(date1);
    
    AdUnitTargeting adUnitTargeting = new AdUnitTargeting();
    adUnitTargeting.setAdUnitId("100");
    InventoryTargeting inventoryTargeting = new InventoryTargeting();
    inventoryTargeting.getTargetedAdUnits().add(adUnitTargeting);
    targeting1 = new Targeting();
    targeting1.setInventoryTargeting(inventoryTargeting);
    
    targetingValue1 = new TargetingValue();
    targetingValue1.setValue(targeting1);
    
    numberSetValue = new SetValue();
    numberSetValue.getValues().add(numberValue1);
    numberSetValue.getValues().add(numberValue3);
    
    textSetValue = new SetValue();
    textSetValue.getValues().add(textValue1);
    textSetValue.getValues().add(textValue2);
    
    dateSetValue = new SetValue();
    dateSetValue.getValues().add(dateValue1);
    
    dateTimeSetValue = new SetValue();
    dateTimeSetValue.getValues().add(dateTimeValue1);
    
    mixedSetValue = new SetValue();
    mixedSetValue.getValues().add(textValue1);
    mixedSetValue.getValues().add(dateTimeValue1);
    
    commaTextSetValue = new SetValue();
    commaTextSetValue.getValues().add(textValue1);
    commaTextSetValue.getValues().add(textValue4);
  }
  
  @Test
  public void testToString() {
    assertEquals("value1", Pql.toString(textValue1));
    assertEquals("false", Pql.toString(booleanValue1));
    assertEquals("1", Pql.toString(numberValue1));
    assertEquals("2012-12-02T12:45:00+08:00", Pql.toString(dateTimeValue1));
    assertEquals("2012-12-02", Pql.toString(dateValue1));
    assertEquals("2012-12-02", Pql.toString(dateSetValue));
    assertEquals("2012-12-02T12:45:00+08:00", Pql.toString(dateTimeSetValue));
    assertEquals("value1,\"comma,separated\"", Pql.toString(commaTextSetValue));
  }
  
  @Test
  public void testToString_null() {
    assertEquals("", Pql.toString(new TextValue()));
    assertEquals("", Pql.toString(new BooleanValue()));
    assertEquals("", Pql.toString(new NumberValue()));
    assertEquals("", Pql.toString(new DateTimeValue()));
    assertEquals("", Pql.toString(new DateValue()));
    assertEquals("", Pql.toString(new SetValue()));
  }

  @Test
  public void testToString_invalidValue() {
    thrown.expect(IllegalArgumentException.class);
    Pql.toString(new MyValue());
  }
  
  @Test
  public void testGetApiValue() {
    assertEquals("value1", Pql.getApiValue(textValue1));
    assertEquals(false, Pql.getApiValue(booleanValue1));
    assertEquals(1L, Pql.getApiValue(numberValue1));
    assertEquals(1.02, Pql.getApiValue(numberValue2));
    assertEquals(dateTime1, Pql.getApiValue(dateTimeValue1));
    assertEquals(date1, Pql.getApiValue(dateValue1));
    assertNull(Pql.getApiValue(new TextValue()));
  }
  
  @Test
  @SuppressWarnings("unchecked")
  public void testGetApiValue_numberSet() {
    Set<Object> apiValue = (Set<Object>) Pql.getApiValue(numberSetValue);
    assertTrue(apiValue.contains(1L));
    assertTrue(apiValue.contains(-1L));
    assertEquals(2, apiValue.size());
  }
  
  @Test
  @SuppressWarnings("unchecked")
  public void testGetApiValue_textSet() {
    Set<Object> apiValue = (Set<Object>) Pql.getApiValue(textSetValue);
    assertTrue(apiValue.contains("value1"));
    assertTrue(apiValue.contains("value2"));
    assertEquals(2, apiValue.size());
  }
  
  @Test
  @SuppressWarnings("unchecked")
  public void testGetApiValue_commaTextSet() {
    Set<Object> apiValue = (Set<Object>) Pql.getApiValue(commaTextSetValue);
    assertTrue(apiValue.contains("value1"));
    assertTrue(apiValue.contains("comma,separated"));
    assertEquals(2, apiValue.size());
  }
  
  @Test
  @SuppressWarnings("unchecked")
  public void testGetApiValue_dateSet() {
    Set<Object> apiValue = (Set<Object>) Pql.getApiValue(dateSetValue);
    assertTrue(apiValue.contains(date1));
    assertEquals(1, apiValue.size());
  }
  
  @Test
  @SuppressWarnings("unchecked")
  public void testGetApiValue_dateTimeSet() {
    Set<Object> apiValue = (Set<Object>) Pql.getApiValue(dateTimeSetValue);
    assertTrue(apiValue.contains(dateTime1));
    assertEquals(1, apiValue.size());
  }
  
  @Test
  public void testGetApiValue_mixedSet() {
    thrown.expect(IllegalArgumentException.class);
    Pql.getApiValue(mixedSetValue);
  }
    
  @Test
  public void testGetNativeValue() {
    assertEquals("value1", Pql.getNativeValue(textValue1));
    assertEquals(false, Pql.getNativeValue(booleanValue1));
    assertEquals(1L, Pql.getNativeValue(numberValue1));
    assertEquals(1.02, Pql.getNativeValue(numberValue2));
    assertEquals(DateTimes.toDateTime(dateTimeValue1.getValue()),
        Pql.getNativeValue(dateTimeValue1));
    assertEquals("2012-12-02", Pql.getNativeValue(dateValue1));
  }
  
  @Test
  @SuppressWarnings("unchecked")
  public void testGetNativeValue_numberSet() {
    Set<Object> nativeValue = (Set<Object>) Pql.getNativeValue(numberSetValue);
    assertTrue(nativeValue.contains(1L));
    assertTrue(nativeValue.contains(-1L));
    assertEquals(2, nativeValue.size());
  }
  
  @Test
  @SuppressWarnings("unchecked")
  public void testGetNativeValue_textSet() {
    Set<Object> nativeValue = (Set<Object>) Pql.getNativeValue(textSetValue);
    assertTrue(nativeValue.contains("value1"));
    assertTrue(nativeValue.contains("value2"));
    assertEquals(2, nativeValue.size());
  }
  
  @Test
  @SuppressWarnings("unchecked")
  public void testGetNativeValue_commaTextSet() {
    Set<Object> nativeValue = (Set<Object>) Pql.getNativeValue(commaTextSetValue);
    assertTrue(nativeValue.contains("value1"));
    assertTrue(nativeValue.contains("comma,separated"));
    assertEquals(2, nativeValue.size());
  }
  
  @Test
  @SuppressWarnings("unchecked")
  public void testGetNativeValue_dateSet() {
    Set<Object> nativeValue = (Set<Object>) Pql.getNativeValue(dateSetValue);
    assertTrue(nativeValue.contains("2012-12-02"));
    assertEquals(1, nativeValue.size());
  }
  
  @Test
  @SuppressWarnings("unchecked")
  public void testGetNativeValue_dateTimeSet() {
    Set<Object> nativeValue = (Set<Object>) Pql.getNativeValue(dateTimeSetValue);
    assertTrue(nativeValue.contains(DateTimes.toDateTime(dateTimeValue1.getValue())));
    assertEquals(1, nativeValue.size());
  }
  
  @Test
  public void testGetNativeValue_mixedSet() {
    thrown.expect(IllegalArgumentException.class);
    Pql.getNativeValue(mixedSetValue);
  }
  
  @Test
  @SuppressWarnings("unchecked")
  public void testGetCsvValue_numberSet() {
    assertEquals("1,-1", Pql.getCsvValue(numberSetValue));
  }
  
  @Test
  @SuppressWarnings("unchecked")
  public void testGetCsvValue_textSet() {
    assertEquals("value1,value2", Pql.getCsvValue(textSetValue));
  }
  
  @Test
  @SuppressWarnings("unchecked")
  public void testGetCsvValue_dateSet() {
    assertEquals("2012-12-02", Pql.getCsvValue(dateSetValue));
  }
  
  @Test
  @SuppressWarnings("unchecked")
  public void testGetCsvValue_dateTimeSet() {
    assertEquals(DateTimes.toStringWithTimeZone(dateTimeValue1.getValue()),
        Pql.getCsvValue(dateTimeSetValue));
  }
  
  @Test
  public void testGetCsvValue_mixedSet() {
    thrown.expect(IllegalArgumentException.class);
    Pql.getCsvValue(mixedSetValue);
  }
  
  @Test
  public void testGetCsvValue_commaTextSet() {
    assertEquals("value1,\"comma,separated\"", Pql.getCsvValue(commaTextSetValue));
  }
  
  @Test
  public void testGetCsvValue_targetingValue() {
    thrown.expect(IllegalArgumentException.class);
    Pql.getCsvValue(targetingValue1);
  }

  @Test
  public void testCreateValue() {
    assertEquals("value1", ((TextValue) Pql.createValue("value1")).getValue());
    assertEquals(false, ((BooleanValue) Pql.createValue(false)).isValue());
    assertEquals("1", ((NumberValue) Pql.createValue(1)).getValue());
    assertEquals("1", ((NumberValue) Pql.createValue(1L)).getValue());
    assertEquals("1.02", ((NumberValue) Pql.createValue(1.02)).getValue());
    assertEquals("2012-12-02T12:45:00+08:00",
        DateTimes.toStringWithTimeZone(((DateTimeValue) Pql.createValue(dateTime1)).getValue()));
    assertEquals("2012-12-02",
        DateTimes.toString(((DateValue) Pql.createValue(dateTime1.getDate())).getValue()));
  }
  
  @Test
  public void testCreateValue_numberSet() {
    Set<Long> numberSet = new LinkedHashSet<Long>();
    numberSet.add(1L);
    Value value1 = ((SetValue) Pql.createValue(numberSet)).getValues().get(0);
    assertEquals("1", ((NumberValue) value1).getValue());
  }
  
  @Test
  public void testCreateValue_textSet() {
    Set<String> textSet = new LinkedHashSet<String>();
    textSet.add("value1");
    Value value1 = ((SetValue) Pql.createValue(textSet)).getValues().get(0);
    assertEquals("value1", ((TextValue) value1).getValue());
  }
  
  @Test
  public void testCreateValue_commaTextSet() {
    Set<String> textSet = new LinkedHashSet<String>();
    textSet.add("value1");
    textSet.add("comma \",\" separated");
    Value value1 = ((SetValue) Pql.createValue(textSet)).getValues().get(0);
    Value value2 = ((SetValue) Pql.createValue(textSet)).getValues().get(1);
    assertEquals("value1", ((TextValue) value1).getValue());
    assertEquals("comma \",\" separated", ((TextValue) value2).getValue());
  }
  
  @Test
  public void testCreateValue_dateSet() {
    Set<Date> numberSet = new LinkedHashSet<Date>();
    numberSet.add(date1);
    Value value1 = ((SetValue) Pql.createValue(numberSet)).getValues().get(0);
    assertEquals("2012-12-02", 
        DateTimes.toString(((DateValue) value1).getValue()));
  }
  
  @Test
  public void testCreateValue_dateTimeSet() {
    Set<DateTime> dateTimeSet = new LinkedHashSet<DateTime>();
    dateTimeSet.add(dateTime1);
    Value value1 = ((SetValue) Pql.createValue(dateTimeSet)).getValues().get(0);
    assertEquals("2012-12-02T12:45:00+08:00", 
        DateTimes.toStringWithTimeZone(((DateTimeValue) value1).getValue()));
  }

  @Test
  public void testCreateValue_invalidType() {
    thrown.expect(IllegalArgumentException.class);
    Pql.createValue(new MyObject());
  }
  
  @Test
  public void testCreateValue_mixedSet() {
    Set<Object> mixedTypeSet = new LinkedHashSet<Object>();
    mixedTypeSet.add(dateTime1);
    mixedTypeSet.add("value1");
    thrown.expect(IllegalArgumentException.class);
    Pql.createValue(mixedTypeSet);
  }
  
  @Test
  public void testCreateValue_null() {
    assertEquals(null, ((TextValue) Pql.createValue(null)).getValue());
  }
  
  @Test
  public void testCreateValue_nestedSets() {
    Set<Object> set = new LinkedHashSet<Object>();
    Set<Object> innerSet = new LinkedHashSet<Object>();
    set.add(innerSet);
    thrown.expect(IllegalArgumentException.class);
    Pql.createValue(set);
  }

  @Test
  public void testGetColumnLabels() {
    ResultSet resultSet = new ResultSet();
    resultSet.getColumnTypes().addAll(Lists.newArrayList(column1, column2, column3));
    assertEquals(
        Lists.newArrayList("column1", "column2", "column3"), Pql.getColumnLabels(resultSet));
  }

  @Test
  public void testGetRowStringValues() {
    Row row = new Row();
    row.getValues().addAll(Lists.newArrayList(textValue1, booleanValue1, numberValue2,
        numberSetValue));
    assertEquals(Lists.newArrayList("value1", "false", "1.02", "1,-1"),
        Pql.getRowStringValues(row));
  }

  @Test
  public void testCombineResultSet() {
    Row row1 = new Row();
    row1.getValues().addAll(Lists.newArrayList(textValue1, booleanValue1, numberValue1));

    Row row2 = new Row();
    row2.getValues().addAll(Lists.newArrayList(textValue2, booleanValue2, numberValue2));

    Row row3 = new Row();
    row3.getValues().addAll(Lists.newArrayList(textValue3, booleanValue3, numberValue3));

    ResultSet resultSet1 = new ResultSet();
    resultSet1.getColumnTypes().addAll(Lists.newArrayList(column1, column2, column3));
    resultSet1.getRows().addAll(Lists.newArrayList(row1, row2));

    ResultSet resultSet2 = new ResultSet();
    resultSet2.getColumnTypes().addAll(Lists.newArrayList(column1, column2, column3));
    resultSet2.getRows().addAll(Lists.newArrayList(row3));

    ResultSet combinedResultSet = Pql.combineResultSets(resultSet1, resultSet2);

    assertEquals(3, combinedResultSet.getRows().size());
    assertEquals(
        Lists.newArrayList(column1, column2, column3), combinedResultSet.getColumnTypes());
    assertEquals(Lists.newArrayList(textValue1, booleanValue1, numberValue1),
        combinedResultSet.getRows().get(0).getValues());
    assertEquals(Lists.newArrayList(textValue2, booleanValue2, numberValue2),
        combinedResultSet.getRows().get(1).getValues());
    assertEquals(Lists.newArrayList(textValue3, booleanValue3, numberValue3),
        combinedResultSet.getRows().get(2).getValues());
  }

  @Test
  public void testCombineResultSet_badColumns() {
    Row row1 = new Row();
    row1.getValues().addAll(Lists.newArrayList(textValue1, booleanValue1, numberValue1));

    Row row2 = new Row();
    row2.getValues().addAll(Lists.newArrayList(textValue2, booleanValue2, numberValue2));

    Row row3 = new Row();
    row3.getValues().addAll(Lists.newArrayList(textValue3, booleanValue3));

    ResultSet resultSet1 = new ResultSet();
    resultSet1.getColumnTypes().addAll(Lists.newArrayList(column1, column2, column3));
    resultSet1.getRows().addAll(Lists.newArrayList(row1, row2));

    ResultSet resultSet2 = new ResultSet();
    resultSet2.getColumnTypes().addAll(Lists.newArrayList(column1, column2));
    resultSet2.getRows().addAll(Lists.newArrayList(row3));

    thrown.expect(IllegalArgumentException.class);
    Pql.combineResultSets(resultSet1, resultSet2);
  }

  private static class MyValue extends Value {}
  private static class MyObject extends Object {}
}
