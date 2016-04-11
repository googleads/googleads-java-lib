// Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.axis.utils.v201603;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.google.api.ads.adwords.axis.v201603.cm.CampaignStatus;
import com.google.api.ads.adwords.axis.v201603.cm.DateRange;
import com.google.api.ads.adwords.axis.v201603.cm.OrderBy;
import com.google.api.ads.adwords.axis.v201603.cm.Predicate;
import com.google.api.ads.adwords.axis.v201603.cm.PredicateOperator;
import com.google.api.ads.adwords.axis.v201603.cm.Selector;
import com.google.api.ads.adwords.axis.v201603.cm.SortOrder;
import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.v201603.cm.CampaignField;
import com.google.api.ads.adwords.lib.utils.AdWordsInternals;
import com.google.api.ads.common.lib.utils.AdsUtility;
import com.google.common.collect.Sets;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Set;

/**
 * Test case for the Axis implementation of the selector builder.
 */
@RunWith(JUnit4.class)
public class SelectorBuilderTest {

  /** 
   * Indicates if this test invokes any of the methods on SelectorBuilder with an
   * {@link EntityField} argument.   
   */
  private boolean isTestUsingFieldEnums;
  
  @Before
  public void setUp() {
    isTestUsingFieldEnums = false;
    AdWordsInternals.getInstance().getAdsUtilityRegistry().removeUtilities(
        AdWordsInternals.getInstance().getAdsUtilityRegistry().getRegisteredUtilities());
  }
  
  @After
  public void tearDown() {
    Set<AdsUtility> expectedUtilities = Sets.<AdsUtility>newTreeSet();
    expectedUtilities.add(AdsUtility.SELECTOR_BUILDER);
    if (isTestUsingFieldEnums) {
      expectedUtilities.add(AdsUtility.SELECTOR_FIELD);
    }
    assertEquals(expectedUtilities, 
        AdWordsInternals.getInstance().getAdsUtilityRegistry().getRegisteredUtilities());
  }
  
  /**
   * Tests the immutability of the selector
   */
  @Test
  @SuppressWarnings("unchecked")
  public void testSelectorBuilderImmutability() {
    DateFormat dateFormat = new SimpleDateFormat(SelectorBuilderImpl.DEFAULT_DATE_FORMAT);

    SelectorBuilder builder = new SelectorBuilder();

    DateTime start = new DateTime(2013, 3, 25, 0, 0, 0, 0);
    DateTime end = new DateTime(2013, 3, 26, 0, 0, 0, 0);
    String formatStart = dateFormat.format(start.toDate());
    String formatEnd = dateFormat.format(end.toDate());

    builder = builder.fields("Id", "Name", "Status").forDateRange(start, end);

    Selector selector = builder.build();

    assertEquals(formatStart, selector.getDateRange().getMin());
    assertEquals(formatEnd, selector.getDateRange().getMax());

    String formatEndPlusOne = dateFormat.format(end.plusDays(1).toDate());

    DateRange dateRange = new DateRange();
    dateRange.setMin(formatStart);
    dateRange.setMax(formatEndPlusOne);

    selector.setDateRange(dateRange);

    assertEquals(formatStart, selector.getDateRange().getMin());
    assertEquals(formatEndPlusOne, selector.getDateRange().getMax());

    Selector selectorRebuilt =
        builder.fields("Id", "Name", "Status").forDateRange(start, end).build();

    assertEquals(formatStart, selectorRebuilt.getDateRange().getMin());
    assertEquals(formatEnd, selectorRebuilt.getDateRange().getMax());

  }

  /**
   * Tests the adding of a new field
   */
  @Test
  @SuppressWarnings("unchecked")
  public void testFieldsBuild() {
    SelectorBuilder builder = new SelectorBuilder();
    isTestUsingFieldEnums = true;
    
    builder =
        builder.fields("Id", "Name", "Status", "StartDate", "EndDate", "ServingStatus", "Settings");

    Selector selector = builder.build();

    assertEquals(7, selector.getFields().length);

    assertEquals("Id", selector.getFields()[0]);
    assertEquals("Name", selector.getFields()[1]);
    assertEquals("Status", selector.getFields()[2]);
    assertEquals("StartDate", selector.getFields()[3]);
    assertEquals("EndDate", selector.getFields()[4]);
    assertEquals("ServingStatus", selector.getFields()[5]);
    assertEquals("Settings", selector.getFields()[6]);

    selector = builder.fields(CampaignField.Id,
        CampaignField.Name,
        CampaignField.Status,
        CampaignField.StartDate,
        CampaignField.EndDate,
        CampaignField.ServingStatus,
        CampaignField.Settings,
        CampaignField.Id,
        CampaignField.Amount).build();

    assertEquals(8, selector.getFields().length);

    assertEquals("Id", selector.getFields()[0]);
    assertEquals("Name", selector.getFields()[1]);
    assertEquals("Status", selector.getFields()[2]);
    assertEquals("StartDate", selector.getFields()[3]);
    assertEquals("EndDate", selector.getFields()[4]);
    assertEquals("ServingStatus", selector.getFields()[5]);
    assertEquals("Settings", selector.getFields()[6]);
    assertEquals("Amount", selector.getFields()[7]);

  }


  /**
   * Tests the removal of a new field
   */
  @Test
  @SuppressWarnings("unchecked")
  public void testFieldsRemove() {
    SelectorBuilder builder = new SelectorBuilder();

    builder =
        builder.fields("Id", "Name", "Status", "StartDate", "EndDate", "ServingStatus", "Settings");

    Selector selector = builder.build();

    assertEquals(7, selector.getFields().length);

    assertEquals("Id", selector.getFields()[0]);
    assertEquals("Name", selector.getFields()[1]);
    assertEquals("Status", selector.getFields()[2]);
    assertEquals("StartDate", selector.getFields()[3]);
    assertEquals("EndDate", selector.getFields()[4]);
    assertEquals("ServingStatus", selector.getFields()[5]);
    assertEquals("Settings", selector.getFields()[6]);

  }

  /**
   * Tests the predicate build for the ID field
   */
  @Test
  public void testPredicatesBuild() {
    SelectorBuilder builder = new SelectorBuilder();

    builder = builder.equalsId(10L);
    Selector selector = builder.build();

    assertNotNull(selector.getPredicates());
    assertEquals(1, selector.getPredicates().length);

    Predicate predicate = selector.getPredicates()[0];
    assertEquals("Id", predicate.getField());
    assertEquals(PredicateOperator.EQUALS, predicate.getOperator());
    assertNotNull(predicate.getValues());
    assertEquals(1, predicate.getValues().length);
    assertEquals("10", predicate.getValues()[0]);

  }

  /**
   * Tests the predicate with the IN clause
   */
  @Test
  public void testPredicatesInBuild() {
    SelectorBuilder builder = new SelectorBuilder();
    isTestUsingFieldEnums = true;

    builder = builder.in(CampaignField.Status, CampaignStatus.ENABLED.toString(),
        CampaignStatus.REMOVED.toString());
    Selector selector = builder.build();

    assertNotNull(selector.getPredicates());
    assertEquals(1, selector.getPredicates().length);

    Predicate predicate = selector.getPredicates()[0];
    assertEquals("Status", predicate.getField());
    assertEquals(PredicateOperator.IN, predicate.getOperator());
    assertNotNull(predicate.getValues());
    assertEquals(2, predicate.getValues().length);
    assertEquals(CampaignStatus.ENABLED.toString(), predicate.getValues()[0]);
    assertEquals(CampaignStatus.REMOVED.toString(), predicate.getValues()[1]);

  }

  /**
   * Tests the order by criteria
   */
  @Test
  public void testOrderByBuild() {
    SelectorBuilder builder = new SelectorBuilder();
    isTestUsingFieldEnums = true;
    
    builder = builder.orderAscBy(CampaignField.BidType);
    Selector selector = builder.build();

    assertNotNull(selector.getOrdering());
    assertEquals(1, selector.getOrdering().length);

    OrderBy orderBy = selector.getOrdering()[0];

    assertEquals("BidType", orderBy.getField());
    assertEquals(SortOrder.ASCENDING, orderBy.getSortOrder());

    builder.orderAscBy(CampaignField.Amount).orderDescBy(CampaignField.BidType);
    selector = builder.build();

    assertNotNull(selector.getOrdering());
    assertEquals(3, selector.getOrdering().length);

    orderBy = selector.getOrdering()[0];

    assertEquals("BidType", orderBy.getField());
    assertEquals(SortOrder.ASCENDING, orderBy.getSortOrder());

    orderBy = selector.getOrdering()[1];

    assertEquals("Amount", orderBy.getField());
    assertEquals(SortOrder.ASCENDING, orderBy.getSortOrder());

    orderBy = selector.getOrdering()[2];

    assertEquals("BidType", orderBy.getField());
    assertEquals(SortOrder.DESCENDING, orderBy.getSortOrder());

    // Removing the OrderBy for BidType
    selector = builder.removeOrderBy("BidType").build();

    assertNotNull(selector.getOrdering());
    assertEquals(1, selector.getOrdering().length);

    orderBy = selector.getOrdering()[0];

    assertEquals("Amount", orderBy.getField());
    assertEquals(SortOrder.ASCENDING, orderBy.getSortOrder());
  }

  /**
   * Tests that when a repeated ORDER BY clause is added to the selector, it is actually ignored.
   */
  @Test
  public void testOrderBySubstitution() {
    SelectorBuilder builder = new SelectorBuilder();
    isTestUsingFieldEnums = true;
    
    builder = builder.orderAscBy(CampaignField.BidType).orderDescBy(CampaignField.Amount);
    Selector selector = builder.build();

    assertNotNull(selector.getOrdering());
    assertEquals(2, selector.getOrdering().length);

    builder.orderAscBy(CampaignField.BidType);
    selector = builder.build();

    assertNotNull(selector.getOrdering());
    assertEquals(2, selector.getOrdering().length);

    OrderBy orderBy = selector.getOrdering()[0];

    assertEquals("BidType", orderBy.getField());
    assertEquals(SortOrder.ASCENDING, orderBy.getSortOrder());

    orderBy = selector.getOrdering()[1];

    assertEquals("Amount", orderBy.getField());
    assertEquals(SortOrder.DESCENDING, orderBy.getSortOrder());
  }

  /**
   * Tests the date range setting
   */
  @Test
  public void testDateRangeBuild() {
    DateFormat dateFormat = new SimpleDateFormat(SelectorBuilderImpl.DEFAULT_DATE_FORMAT);

    SelectorBuilder builder = new SelectorBuilder();

    DateTime start = new DateTime(2013, 3, 25, 0, 0, 0, 0);
    DateTime end = new DateTime(2013, 3, 26, 0, 0, 0, 0);
    String formatStart = dateFormat.format(start.toDate());
    String formatEnd = dateFormat.format(end.toDate());

    builder = builder.forDateRange(start, end);
    Selector selector = builder.build();

    assertEquals(formatStart, selector.getDateRange().getMin());
    assertEquals(formatEnd, selector.getDateRange().getMax());
  }

  /**
   * Tests the offset, limit and paging logic of the builder.
   */
  @Test
  public void testPagingAndLimits() {
    SelectorBuilder builder = new SelectorBuilder();

    builder = builder.offset(10);
    Selector selector = builder.build();

    assertNotNull(selector.getPaging());
    assertNotNull(selector.getPaging().getStartIndex());
    assertNull(selector.getPaging().getNumberResults());
    assertEquals(10, selector.getPaging().getStartIndex().intValue());

    selector = builder.offset(10).limit(20).build();

    assertNotNull(selector.getPaging());
    assertNotNull(selector.getPaging().getStartIndex());
    assertNotNull(selector.getPaging().getNumberResults());
    assertEquals(10, selector.getPaging().getStartIndex().intValue());
    assertEquals(20, selector.getPaging().getNumberResults().intValue());

    selector = builder.offset(10).limit(20).increaseOffsetBy(5).build();

    assertNotNull(selector.getPaging());
    assertNotNull(selector.getPaging().getStartIndex());
    assertNotNull(selector.getPaging().getNumberResults());
    assertEquals(15, selector.getPaging().getStartIndex().intValue());
    assertEquals(20, selector.getPaging().getNumberResults().intValue());

    selector = builder.offset(10).limit(20).increaseOffsetBy(5).removeLimitAndOffset().build();

    assertNull(selector.getPaging());

    selector = builder
        .offset(10)
        .limit(20)
        .increaseOffsetBy(5)
        .removeLimitAndOffset()
        .offset(55)
        .limit(4)
        .build();

    assertNotNull(selector.getPaging());
    assertNotNull(selector.getPaging().getStartIndex());
    assertNotNull(selector.getPaging().getNumberResults());
    assertEquals(55, selector.getPaging().getStartIndex().intValue());
    assertEquals(4, selector.getPaging().getNumberResults().intValue());

  }

  /**
   * Tests that the built selectors don't share internal Paging state.
   */
  @Test
  public void testUniqueInternalPagingState() {
    SelectorBuilder builder = new SelectorBuilder();
    isTestUsingFieldEnums = true;
    
    Selector selectorOne = builder.fields("Id").offset(10).build();
    Selector selectorTwo = builder.fields(CampaignField.Status).offset(345).build();

    assertEquals(10, selectorOne.getPaging().getStartIndex().intValue());
    assertEquals(345, selectorTwo.getPaging().getStartIndex().intValue());
  }

  /**
   * Tests that the built selectors don't share internal OrderBy state.
   */
  @Test
  public void testUniqueInternalOrderByState() {
    SelectorBuilder builder = new SelectorBuilder();
    isTestUsingFieldEnums = true;
    
    Selector selectorOne = builder.orderAscBy(CampaignField.Id).build();
    Selector selectorTwo = builder.build();

    OrderBy orderTwo = selectorTwo.getOrdering(0);
    orderTwo.setField("Status");

    assertEquals("Id", selectorOne.getOrdering(0).getField());
    assertEquals("Status", selectorTwo.getOrdering(0).getField());
  }

  /**
   * Tests that the built selectors don't share internal Predicate state.
   */
  @Test
  public void testUniqueInternalPredicateState() {
    SelectorBuilder builder = new SelectorBuilder();
    Selector selectorOne = builder.equals("Id", "test").build();
    Selector selectorTwo = builder.build();

    Predicate predicateTwo = selectorTwo.getPredicates(0);
    predicateTwo.setField("Status");

    assertEquals("Id", selectorOne.getPredicates(0).getField());
    assertEquals("Status", selectorTwo.getPredicates(0).getField());
  }

  /**
   * Tests that the built selectors don't share internal DateRange state.
   */
  @Test
  public void testUniqueInternalDateRangeState() {
    SelectorBuilder builder = new SelectorBuilder();
    DateFormat dateFormat = new SimpleDateFormat(SelectorBuilderImpl.DEFAULT_DATE_FORMAT);

    DateTime startOne = new DateTime(2013, 1, 1, 0, 0, 0, 0);
    DateTime endOne = new DateTime(2013, 1, 31, 0, 0, 0, 0);
    DateTime startTwo = new DateTime(2013, 2, 1, 0, 0, 0, 0);
    DateTime endTwo = new DateTime(2013, 2, 28, 0, 0, 0, 0);

    Selector selectorOne = builder.forDateRange(startOne, endOne).build();
    Selector selectorTwo = builder.forDateRange(startTwo, endTwo).build();

    assertEquals(dateFormat.format(startOne.toDate()), selectorOne.getDateRange().getMin());
    assertEquals(dateFormat.format(endOne.toDate()), selectorOne.getDateRange().getMax());
    assertEquals(dateFormat.format(startTwo.toDate()), selectorTwo.getDateRange().getMin());
    assertEquals(dateFormat.format(endTwo.toDate()), selectorTwo.getDateRange().getMax());
  }

}
