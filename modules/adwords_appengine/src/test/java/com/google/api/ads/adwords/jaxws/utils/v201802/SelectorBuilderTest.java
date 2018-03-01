// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.jaxws.utils.v201802;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.google.api.ads.adwords.jaxws.v201802.cm.CampaignStatus;
import com.google.api.ads.adwords.jaxws.v201802.cm.DateRange;
import com.google.api.ads.adwords.jaxws.v201802.cm.OrderBy;
import com.google.api.ads.adwords.jaxws.v201802.cm.Predicate;
import com.google.api.ads.adwords.jaxws.v201802.cm.PredicateOperator;
import com.google.api.ads.adwords.jaxws.v201802.cm.Selector;
import com.google.api.ads.adwords.jaxws.v201802.cm.SortOrder;
import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.v201802.cm.CampaignField;
import com.google.api.ads.adwords.lib.utils.AdWordsInternals;
import com.google.api.ads.common.lib.utils.AdsUtility;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Test case for the JAXWS implementation of the selector builder.
 */
@RunWith(JUnit4.class)
public class SelectorBuilderTest {

  @Before
  public void setUp() {
    AdWordsInternals.getInstance().getAdsUtilityRegistry().popRegisteredUtilities();
  }

  /**
   * Checks the utilities registry status.
   *
   * @param isTestUsingFieldEnums Indicates if this test invokes any of the methods on
   * SelectorBuilder with an {@link EntityField} argument.
   */
  public void checkUtilitiesState(final boolean isTestUsingFieldEnums) {
    Set<AdsUtility> expectedUtilities = new HashSet<>();
    expectedUtilities.add(AdsUtility.SELECTOR_BUILDER);
    if (isTestUsingFieldEnums) {
      expectedUtilities.add(AdsUtility.SELECTOR_FIELD);
    }
    assertEquals(expectedUtilities,
        AdWordsInternals.getInstance().getAdsUtilityRegistry().popRegisteredUtilities());
  }

  /**
   * Tests the immutability of the selector.
   */
  @Test
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

    checkUtilitiesState(false);
  }

  /**
   * Tests the adding of a new field.
   */
  @Test
  public void testFieldsBuild() {
    SelectorBuilder builder = new SelectorBuilder();

    builder =
        builder.fields("Id", "Name", "Status", "StartDate", "EndDate", "ServingStatus", "Settings");

    Selector selector = builder.build();

    assertEquals(7, selector.getFields().size());

    assertEquals("Id", selector.getFields().get(0));
    assertEquals("Name", selector.getFields().get(1));
    assertEquals("Status", selector.getFields().get(2));
    assertEquals("StartDate", selector.getFields().get(3));
    assertEquals("EndDate", selector.getFields().get(4));
    assertEquals("ServingStatus", selector.getFields().get(5));
    assertEquals("Settings", selector.getFields().get(6));

    selector = builder.fields("Id",
        "Name",
        "Status",
        "StartDate",
        "EndDate",
        "ServingStatus",
        "Settings",
        "Id",
        "AverageCpc").build();

    assertEquals(8, selector.getFields().size());

    assertEquals("Id", selector.getFields().get(0));
    assertEquals("Name", selector.getFields().get(1));
    assertEquals("Status", selector.getFields().get(2));
    assertEquals("StartDate", selector.getFields().get(3));
    assertEquals("EndDate", selector.getFields().get(4));
    assertEquals("ServingStatus", selector.getFields().get(5));
    assertEquals("Settings", selector.getFields().get(6));
    assertEquals("AverageCpc", selector.getFields().get(7));

    checkUtilitiesState(false);
  }

  /**
   * Tests the removal of fields.
   */
  @Test
  public void testFieldsRemove() {
    SelectorBuilder builder = new SelectorBuilder();

    builder =
        builder.fields("Id", "Name", "Status", "StartDate", "EndDate", "ServingStatus", "Settings");

    Selector selector = builder.build();

    assertEquals(7, selector.getFields().size());

    assertEquals("Id", selector.getFields().get(0));
    assertEquals("Name", selector.getFields().get(1));
    assertEquals("Status", selector.getFields().get(2));
    assertEquals("StartDate", selector.getFields().get(3));
    assertEquals("EndDate", selector.getFields().get(4));
    assertEquals("ServingStatus", selector.getFields().get(5));
    assertEquals("Settings", selector.getFields().get(6));

    checkUtilitiesState(false);
  }

  /**
   * Tests the predicate build for the ID field.
   */
  @Test
  public void testPredicatesBuild() {
    SelectorBuilder builder = new SelectorBuilder();

    builder = builder.equalsId(10L);
    Selector selector = builder.build();

    assertNotNull(selector.getPredicates());
    assertEquals(1, selector.getPredicates().size());

    Predicate predicate = selector.getPredicates().get(0);
    assertEquals("Id", predicate.getField());
    assertEquals(PredicateOperator.EQUALS, predicate.getOperator());
    assertNotNull(predicate.getValues());
    assertEquals(1, predicate.getValues().size());
    assertEquals("10", predicate.getValues().get(0));

    checkUtilitiesState(false);
  }

  /**
   * Tests the predicate with the IN clause.
   */
  @Test
  public void testPredicatesInBuild() {
    SelectorBuilder builder = new SelectorBuilder();

    builder =
        builder.in("Status", CampaignStatus.ENABLED.toString(), CampaignStatus.REMOVED.toString());
    Selector selector = builder.build();

    assertNotNull(selector.getPredicates());
    assertEquals(1, selector.getPredicates().size());

    Predicate predicate = selector.getPredicates().get(0);
    assertEquals("Status", predicate.getField());
    assertEquals(PredicateOperator.IN, predicate.getOperator());
    assertNotNull(predicate.getValues());
    assertEquals(2, predicate.getValues().size());
    assertEquals(CampaignStatus.ENABLED.toString(), predicate.getValues().get(0));
    assertEquals(CampaignStatus.REMOVED.toString(), predicate.getValues().get(1));

    checkUtilitiesState(false);
  }

  /**
   * Tests the order by criteria.
   */
  @Test
  public void testOrderByBuild() {
    SelectorBuilder builder = new SelectorBuilder();

    builder = builder.orderAscBy(CampaignField.AdvertisingChannelType);
    Selector selector = builder.build();

    assertNotNull(selector.getOrdering());
    assertEquals(1, selector.getOrdering().size());

    OrderBy orderBy = selector.getOrdering().get(0);

    assertEquals("AdvertisingChannelType", orderBy.getField());
    assertEquals(SortOrder.ASCENDING, orderBy.getSortOrder());

    builder.orderAscBy(CampaignField.Amount).orderDescBy(CampaignField.AdvertisingChannelType);
    selector = builder.build();

    assertNotNull(selector.getOrdering());
    assertEquals(3, selector.getOrdering().size());

    orderBy = selector.getOrdering().get(0);

    assertEquals("AdvertisingChannelType", orderBy.getField());
    assertEquals(SortOrder.ASCENDING, orderBy.getSortOrder());

    orderBy = selector.getOrdering().get(1);

    assertEquals("Amount", orderBy.getField());
    assertEquals(SortOrder.ASCENDING, orderBy.getSortOrder());

    orderBy = selector.getOrdering().get(2);

    assertEquals("AdvertisingChannelType", orderBy.getField());
    assertEquals(SortOrder.DESCENDING, orderBy.getSortOrder());

    // Removing the OrderBy for AdvertisingChannelType
    selector = builder.removeOrderBy("AdvertisingChannelType").build();

    assertNotNull(selector.getOrdering());
    assertEquals(1, selector.getOrdering().size());

    orderBy = selector.getOrdering().get(0);

    assertEquals("Amount", orderBy.getField());
    assertEquals(SortOrder.ASCENDING, orderBy.getSortOrder());

    checkUtilitiesState(true);
  }

  /**
   * Tests that when a repeated ORDER BY clause is added to the selector, it is actually ignored.
   */
  @Test
  public void testOrderBySubstitution() {
    SelectorBuilder builder = new SelectorBuilder();

    builder =
        builder.orderAscBy(CampaignField.AdvertisingChannelType).orderDescBy(CampaignField.Amount);
    Selector selector = builder.build();

    assertNotNull(selector.getOrdering());
    assertEquals(2, selector.getOrdering().size());

    builder.orderAscBy(CampaignField.AdvertisingChannelType);
    selector = builder.build();

    assertNotNull(selector.getOrdering());
    assertEquals(2, selector.getOrdering().size());

    OrderBy orderBy = selector.getOrdering().get(0);

    assertEquals("AdvertisingChannelType", orderBy.getField());
    assertEquals(SortOrder.ASCENDING, orderBy.getSortOrder());

    orderBy = selector.getOrdering().get(1);

    assertEquals("Amount", orderBy.getField());
    assertEquals(SortOrder.DESCENDING, orderBy.getSortOrder());

    checkUtilitiesState(true);
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

    checkUtilitiesState(false);
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

    selector = builder.offset(10).limit(20).removeLimitAndOffset().build();

    assertNull(selector.getPaging());

    selector = builder.offset(10).limit(20).removeLimitAndOffset().offset(55).limit(4).build();

    assertNotNull(selector.getPaging());
    assertNotNull(selector.getPaging().getStartIndex());
    assertNotNull(selector.getPaging().getNumberResults());
    assertEquals(55, selector.getPaging().getStartIndex().intValue());
    assertEquals(4, selector.getPaging().getNumberResults().intValue());

    checkUtilitiesState(false);
  }

  /**
   * Tests that the built selectors don't share internal Paging state.
   */
  @Test
  public void testUniqueInternalPagingState() {
    SelectorBuilder builder = new SelectorBuilder();
    Selector selectorOne = builder.fields("Id").offset(10).build();
    Selector selectorTwo = builder.fields("Status").offset(345).build();

    assertEquals(10, selectorOne.getPaging().getStartIndex().intValue());
    assertEquals(345, selectorTwo.getPaging().getStartIndex().intValue());

    checkUtilitiesState(false);
  }

  /**
   * Tests that the built selectors don't share internal OrderBy state.
   */
  @Test
  public void testUniqueInternalOrderByState() {
    SelectorBuilder builder = new SelectorBuilder();
    Selector selectorOne = builder.orderAscBy("Id").build();
    Selector selectorTwo = builder.build();

    OrderBy orderTwo = selectorTwo.getOrdering().get(0);
    orderTwo.setField("Status");

    assertEquals("Id", selectorOne.getOrdering().get(0).getField());
    assertEquals("Status", selectorTwo.getOrdering().get(0).getField());

    checkUtilitiesState(false);
  }

  /**
   * Tests that the built selectors don't share internal Predicate state.
   */
  @Test
  public void testUniqueInternalPredicateState() {
    SelectorBuilder builder = new SelectorBuilder();
    Selector selectorOne = builder.equals("Id", "test").build();
    Selector selectorTwo = builder.build();

    Predicate predicateTwo = selectorTwo.getPredicates().get(0);
    predicateTwo.setField("Status");

    assertEquals("Id", selectorOne.getPredicates().get(0).getField());
    assertEquals("Status", selectorTwo.getPredicates().get(0).getField());

    checkUtilitiesState(false);
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

    checkUtilitiesState(false);
  }
}
