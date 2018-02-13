// Copyright 2017 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.jaxws.utils.v201710;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.jaxws.v201710.cm.AdGroupBidLandscape;
import com.google.api.ads.adwords.jaxws.v201710.cm.AdGroupBidLandscapePage;
import com.google.api.ads.adwords.jaxws.v201710.cm.BidLandscapeLandscapePoint;
import com.google.api.ads.adwords.jaxws.v201710.cm.CriterionBidLandscape;
import com.google.api.ads.adwords.jaxws.v201710.cm.CriterionBidLandscapePage;
import com.google.api.ads.adwords.jaxws.v201710.cm.Page;
import com.google.api.ads.adwords.jaxws.v201710.cm.SortOrder;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.MockitoAnnotations;

/** Test case for the service query. See {@link ServiceQuery}. */
@RunWith(JUnit4.class)
public class ServiceQueryTest {

  private ServiceQuery serviceQuery;
  private String expectedAwql;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Status").equalTo("ENABLED")
            .limit(0, 100)
            .orderBy("Name", SortOrder.DESCENDING)
            .build();
    expectedAwql = "SELECT Id, Name WHERE Status = \"ENABLED\" ORDER BY Name DESC LIMIT 0,100";
  }

  /** Tests using {@link ServiceQuery#hasNext(Page)} to check if there is still a next page. */
  @Test
  public void testHasNextWithSpecifiedPage() {
    // First iteration. There are no previous pages.
    Page page = null;
    assertTrue(serviceQuery.hasNext(page));

    page = mock(Page.class);
    when(page.getTotalNumEntries()).thenReturn(150);
    assertTrue(serviceQuery.hasNext(page));

    when(page.getTotalNumEntries()).thenReturn(50);
    assertFalse(serviceQuery.hasNext(page));
  }

  /**
   * Tests using {@link ServiceQuery#hasNext(AdGroupBidLandscapePage)} to check if there is still a
   * next page.
   */
  @Test
  public void testHasNextWithSpecifiedAdGroupBidLandscapePage() {
    // First iteration. There are no previous pages.
    AdGroupBidLandscapePage page = null;
    assertTrue(serviceQuery.hasNext(page));

    // Make ad group bid landscape page contain 400 bid landscape points (200 per ad group bid
    // landscape point).
    int numBidLandscapePoints = 200;
    BidLandscapeLandscapePoint bidLandscapeLandscapePoint = new BidLandscapeLandscapePoint();
    List<BidLandscapeLandscapePoint> bidLandscapeLandscapePoints = new ArrayList<>();
    bidLandscapeLandscapePoints.addAll(
        Collections.nCopies(numBidLandscapePoints, bidLandscapeLandscapePoint));
    AdGroupBidLandscape bidLandscape = mock(AdGroupBidLandscape.class);
    when(bidLandscape.getLandscapePoints()).thenReturn(bidLandscapeLandscapePoints);

    page = mock(AdGroupBidLandscapePage.class);
    when(page.getEntries()).thenReturn(ImmutableList.of(bidLandscape, bidLandscape));

    serviceQuery = new ServiceQuery.Builder().fields("Id", "Name").limit(0, 100).build();
    // 2 * 200 landscape points are greater than the page size that is 100.
    assertTrue(serviceQuery.hasNext(page));

    serviceQuery = new ServiceQuery.Builder().fields("Id", "Name").limit(0, 500).build();
    // 2 * 200 landscape points are less than the page size that is 500.
    assertFalse(serviceQuery.hasNext(page));
  }

  /**
   * Tests using {@link ServiceQuery#hasNext(CriterionBidLandscapePage)} to check if there is still
   * a next page.
   */
  @Test
  public void testHasNextWithSpecifiedCriterionBidLandscapePage() {
    // First iteration. There are no previous pages.
    CriterionBidLandscapePage page = null;
    assertTrue(serviceQuery.hasNext(page));

    // Make criterion bid landscape page contain 400 bid landscape points (200 per criterion bid
    // landscape point).
    int numBidLandscapePoints = 200;
    BidLandscapeLandscapePoint bidLandscapeLandscapePoint = new BidLandscapeLandscapePoint();
    List<BidLandscapeLandscapePoint> bidLandscapeLandscapePoints = new ArrayList<>();
    bidLandscapeLandscapePoints.addAll(
        Collections.nCopies(numBidLandscapePoints, bidLandscapeLandscapePoint));
    CriterionBidLandscape bidLandscape = mock(CriterionBidLandscape.class);
    when(bidLandscape.getLandscapePoints()).thenReturn(bidLandscapeLandscapePoints);

    page = mock(CriterionBidLandscapePage.class);
    when(page.getEntries()).thenReturn(ImmutableList.of(bidLandscape, bidLandscape));

    serviceQuery = new ServiceQuery.Builder().fields("Id", "Name").limit(0, 100).build();
    // 2 * 200 landscape points are greater than the page size that is 100.
    assertTrue(serviceQuery.hasNext(page));

    serviceQuery = new ServiceQuery.Builder().fields("Id", "Name").limit(0, 500).build();
    // 2 * 200 landscape points are less than the page size that is 500.
    assertFalse(serviceQuery.hasNext(page));
  }

  /**
   * Tests using {@link ServiceQuery#nextPage(Page)} by passing null.
   */
  @Test
  public void testNextPageWithNullSpecifiedPage() {
    Page page = null;

    serviceQuery.nextPage(page);
    assertEquals(expectedAwql, serviceQuery.toString());

    // LIMIT clause stays the same as long as the page is null.
    serviceQuery.nextPage(page);
    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /**
   * Tests using {@link ServiceQuery#nextPage(Page)} to get a next page of the result by
   * specifying the previous page.
   */
  @Test
  public void testNextPageWithSpecifiedPage() {
    Page page = mock(Page.class);
    when(page.getTotalNumEntries()).thenReturn(100);
    String expectedAwql =
        "SELECT Id, Name WHERE Status = \"ENABLED\" ORDER BY Name DESC LIMIT 100,100";

    serviceQuery.nextPage(page);

    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /**
   * Tests using {@link ServiceQuery#nextPage(AdGroupBidLandscapePage)} ] to get a next page of the
   * result by specifying the previous ad group bid landscape page.
   */
  @Test
  public void testNextPageWithSpecifiedAdGroupBidLandscapePage() {
    // Make ad group bid landscape page contain 400 bid landscape points (200 per ad group bid
    // landscape point).
    int numBidLandscapePoints = 200;
    BidLandscapeLandscapePoint bidLandscapeLandscapePoint = new BidLandscapeLandscapePoint();
    List<BidLandscapeLandscapePoint> bidLandscapeLandscapePoints = new ArrayList<>();
    bidLandscapeLandscapePoints.addAll(
        Collections.nCopies(numBidLandscapePoints, bidLandscapeLandscapePoint));
    AdGroupBidLandscape bidLandscape = mock(AdGroupBidLandscape.class);
    when(bidLandscape.getLandscapePoints()).thenReturn(bidLandscapeLandscapePoints);

    AdGroupBidLandscapePage page = mock(AdGroupBidLandscapePage.class);
    when(page.getEntries()).thenReturn(ImmutableList.of(bidLandscape, bidLandscape));

    expectedAwql =
        "SELECT Id, Name WHERE Status = \"ENABLED\" ORDER BY Name DESC LIMIT 400,100";
    serviceQuery.nextPage(page);
    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /**
   * Tests using {@link ServiceQuery#nextPage(AdGroupBidLandscapePage)} when the passed query is
   * null.
   */
  @Test
  public void testNextPageWithPassedNullAdGroupBidLandscapePage() {
    AdGroupBidLandscapePage page = null;

    serviceQuery.nextPage(page);
    assertEquals(expectedAwql, serviceQuery.toString());

    // LIMIT clause stays the same as long as the page is null.
    serviceQuery.nextPage(page);
    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /**
   * Tests using {@link ServiceQuery#nextPage(CriterionBidLandscapePage)} ] to get a next page of
   * the result by specifying the previous criterion bid landscape page.
   */
  @Test
  public void testNextPageWithSpecifiedCriterionBidLandscapePage() {
    // Make criterion bid landscape page contain 400 bid landscape points (200 per criterion bid
    // landscape point).
    int numBidLandscapePoints = 200;
    BidLandscapeLandscapePoint bidLandscapeLandscapePoint = new BidLandscapeLandscapePoint();
    List<BidLandscapeLandscapePoint> bidLandscapeLandscapePoints = new ArrayList<>();
    bidLandscapeLandscapePoints.addAll(
        Collections.nCopies(numBidLandscapePoints, bidLandscapeLandscapePoint));
    CriterionBidLandscape bidLandscape = mock(CriterionBidLandscape.class);
    when(bidLandscape.getLandscapePoints()).thenReturn(bidLandscapeLandscapePoints);

    CriterionBidLandscapePage page = mock(CriterionBidLandscapePage.class);
    when(page.getEntries()).thenReturn(ImmutableList.of(bidLandscape, bidLandscape));

    expectedAwql =
        "SELECT Id, Name WHERE Status = \"ENABLED\" ORDER BY Name DESC LIMIT 400,100";
    serviceQuery.nextPage(page);
    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /**
   * Tests using {@link ServiceQuery#nextPage(CriterionBidLandscapePage)} when the passed query is
   * null.
   */
  @Test
  public void testNextPageFailedWithPassedNullCriterionBidLandscapePage() {
    CriterionBidLandscapePage page = null;

    serviceQuery.nextPage(page);
    assertEquals(expectedAwql, serviceQuery.toString());

    // LIMIT clause stays the same as long as the page is null.
    serviceQuery.nextPage(page);
    assertEquals(expectedAwql, serviceQuery.toString());
  }

}

