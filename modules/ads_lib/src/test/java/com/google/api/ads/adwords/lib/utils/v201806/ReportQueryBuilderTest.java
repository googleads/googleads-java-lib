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

package com.google.api.ads.adwords.lib.utils.v201806;

import static org.junit.Assert.assertEquals;

import com.google.api.ads.adwords.lib.jaxb.v201806.ReportDefinitionDateRangeType;
import com.google.api.ads.adwords.lib.jaxb.v201806.ReportDefinitionReportType;
import com.google.api.ads.adwords.lib.utils.AdWordsInternals;
import com.google.api.ads.adwords.lib.utils.ReportQueryInterface;
import com.google.api.ads.common.lib.utils.AdsUtility;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Test case for the report query builder. See {@link ReportQuery.Builder}. */
@RunWith(JUnit4.class)
public class ReportQueryBuilderTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Before
  public void setUp() {
    AdWordsInternals.getInstance().getAdsUtilityRegistry().popRegisteredUtilities();
  }

  /** Checks the utilities registry status. */
  public void checkUtilitiesState() {
    Set<AdsUtility> expectedUtilities = new HashSet<>();
    expectedUtilities.add(AdsUtility.REPORT_QUERY_BUILDER);
    assertEquals(
        expectedUtilities,
        AdWordsInternals.getInstance().getAdsUtilityRegistry().popRegisteredUtilities());
  }

  /** Tests building a report query. */
  @Test
  public void testBuild() {
    String expectedAwql =
        "SELECT CampaignId, CampaignName FROM CAMPAIGN_PERFORMANCE_REPORT WHERE "
            + "CampaignStatus = \"ENABLED\" DURING 20170101,20170131";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from(ReportDefinitionReportType.CAMPAIGN_PERFORMANCE_REPORT)
            .where("CampaignStatus").equalTo("ENABLED")
            .during(new LocalDate(2017, 1, 1), new LocalDate(2017, 1, 31))
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();
  }

  /** Tests building a report query using a copy constructor. */
  @Test
  public void testBuildWithCopyConstructor() {
    ReportQueryInterface.BuilderInterface oldBuilder =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from(ReportDefinitionReportType.CAMPAIGN_PERFORMANCE_REPORT)
            .where("CampaignStatus").notEqualTo("ENABLED")
            .during(new LocalDate(2017, 1, 1), new LocalDate(2017, 1, 31));

    ReportQueryInterface expectedReportQuery = oldBuilder.build();
    ReportQueryInterface newReportQuery = new ReportQuery.Builder(oldBuilder).build();

    assertEquals(expectedReportQuery, newReportQuery);
    checkUtilitiesState();
  }

  /** Tests failing to build a report query using a copy constructor. */
  @Test
  public void testBuildWithCopyConstructor_nullArg_fails() {
    thrown.expect(NullPointerException.class);
    thrown.expectMessage("query builder");
    new ReportQuery.Builder(null).build();
  }

  /** Tests building a report query with {@link Iterable} fields. */
  @Test
  public void testBuildWithIterableFields() {
    String expectedAwql = "SELECT CampaignId, CampaignName FROM AUDIENCE_PERFORMANCE_REPORT";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields(Arrays.asList("CampaignId", "CampaignName"))
            .from(ReportDefinitionReportType.AUDIENCE_PERFORMANCE_REPORT)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();
  }

  /** Tests building a report query duplicate fields. The order of the fields should be kept. */
  @Test
  public void testBuild_duplicateFieldsStay() {
    String expectedAwql = "SELECT Id, Impressions, Id FROM AUDIENCE_PERFORMANCE_REPORT";

    // fields() accepting varags.
    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "Impressions", "Id")
            .from(ReportDefinitionReportType.AUDIENCE_PERFORMANCE_REPORT)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();

    expectedAwql = "SELECT Id, Impressions, Id FROM AUDIENCE_PERFORMANCE_REPORT";

    // fields() accepting Iterable.
    reportQuery =
        new ReportQuery.Builder()
            .fields(Arrays.asList("Id", "Impressions", "Id"))
            .from(ReportDefinitionReportType.AUDIENCE_PERFORMANCE_REPORT)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
  }

  /** Tests building a report query with multiple "select"s. The last call should stick. */
  @Test
  public void testBuild_multipleSelects() {
    String expectedAwql = "SELECT Id FROM CRITERIA_PERFORMANCE_REPORT";

    // fields() accepting varags.
    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "Impressions", "Id")
            .fields("Id")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();

    expectedAwql = "SELECT Id FROM CRITERIA_PERFORMANCE_REPORT";

    // fields() accepting Iterable.
    reportQuery =
        new ReportQuery.Builder()
            .fields(Arrays.asList("Id", "Impressions", "Id"))
            .fields("Id")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
  }

  /** Tests building a report query with string report type. */
  @Test
  public void testBuildWithStringReportType() {
    String expectedAwql = "SELECT CampaignId, CampaignName FROM CAMPAIGN_PERFORMANCE_REPORT";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from("CAMPAIGN_PERFORMANCE_REPORT")
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();
  }

  /** Tests building a report query with a string WHERE value. */
  @Test
  public void testBuildStringwhereValue() {
    String expectedAwql =
        "SELECT CampaignId, CampaignName FROM ADGROUP_PERFORMANCE_REPORT WHERE "
            + "CampaignName CONTAINS_IGNORE_CASE \"google\"";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from(ReportDefinitionReportType.ADGROUP_PERFORMANCE_REPORT)
            .where("CampaignName").containsIgnoreCase("google")
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();
  }

  /** Tests building a report query with a numeric WHERE value. */
  @Test
  public void testBuildLongwhereValue() {
    String expectedAwql =
        "SELECT CampaignId, CampaignName FROM ADGROUP_PERFORMANCE_REPORT WHERE "
            + "AverageCpm >= 5";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from(ReportDefinitionReportType.ADGROUP_PERFORMANCE_REPORT)
            .where("AverageCpm").greaterThanOrEqualTo(5)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();
  }

  /** Tests building a report query with multiple string values of the WHERE clause. */
  @Test
  public void testBuildMultipleStringwhereValues() {
    String expectedAwql =
        "SELECT CampaignId, CampaignName FROM AD_PERFORMANCE_REPORT WHERE "
            + "CampaignName CONTAINS_ALL [\"white\", \"black\"]";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from(ReportDefinitionReportType.AD_PERFORMANCE_REPORT)
            .where("CampaignName").containsAll("white", "black")
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();
  }

  /** Tests building a report query with multiple long values of the WHERE clause. */
  @Test
  public void testBuildMultipleLongwhereValues() {
    String expectedAwql =
        "SELECT CampaignId, CampaignName FROM AD_PERFORMANCE_REPORT WHERE "
            + "CampaignId IN [1234, 5678]";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from(ReportDefinitionReportType.AD_PERFORMANCE_REPORT)
            .where("CampaignId").in(1234L, 5678L)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();
  }

  /** Tests building a report query with multiple WHERE clauses. */
  @Test
  public void testBuildMultiplewhereClauses() {
    String expectedAwql =
        "SELECT CampaignId, CampaignName FROM ADGROUP_PERFORMANCE_REPORT"
            + " WHERE Clicks >= 500 AND CampaignName CONTAINS_IGNORE_CASE \"promotion\""
            + " AND AdGroupName STARTS_WITH \"adwords_\""
            + " AND BiddingStrategyName STARTS_WITH_IGNORE_CASE \"europe\""
            + " AND CustomerDescriptiveName CONTAINS \"goog\""
            + " AND CustomerDescriptiveName DOES_NOT_CONTAIN \"asia\""
            + " AND AccountDescriptiveName DOES_NOT_CONTAIN_IGNORE_CASE \"group 3\""
            + " AND CampaignStatus != \"REMOVED\""
            + " AND AdGroupStatus NOT_IN [\"REMOVED\", \"PAUSED\"]"
            + " AND AdNetworkType1 CONTAINS_ANY [\"SEARCH\", \"DISPLAY\"]"
            + " AND AdNetworkType2 CONTAINS_NONE [\"YOUTUBE_SEARCH\", \"UNKNOWN\"]";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from(ReportDefinitionReportType.ADGROUP_PERFORMANCE_REPORT)
            .where("Clicks").greaterThanOrEqualTo(500)
            .where("CampaignName").containsIgnoreCase("promotion")
            .where("AdGroupName").startsWith("adwords_")
            .where("BiddingStrategyName").startsWithIgnoreCase("europe")
            .where("CustomerDescriptiveName").contains("goog")
            .where("CustomerDescriptiveName").doesNotContain("asia")
            .where("AccountDescriptiveName").doesNotContainIgnoreCase("group 3")
            .where("CampaignStatus").notEqualTo("REMOVED")
            .where("AdGroupStatus").notIn("REMOVED", "PAUSED")
            .where("AdNetworkType1").containsAny("SEARCH", "DISPLAY")
            .where("AdNetworkType2").containsNone("YOUTUBE_SEARCH", "UNKNOWN")
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();
  }

  /** Tests failing to build a report query due to {@code fields()} not called. */
  @Test
  public void testBuild_fails_fieldsNotCalled() {
    thrown.expect(IllegalStateException.class);
    thrown.expectMessage("use fields()");
    new ReportQuery.Builder().from(ReportDefinitionReportType.CAMPAIGN_PERFORMANCE_REPORT).build();
  }

  /** Tests failing to build a report query due to {@code from()} not called. */
  @Test
  public void testBuild_fails_fromNotCalled() {
    thrown.expect(IllegalStateException.class);
    thrown.expectMessage("use from()");
    new ReportQuery.Builder().fields("Id").build();
  }

  /** Tests building a report query with enum date range. */
  @Test
  public void testBuildWithEnumDateRange() {
    String expectedAwql =
        "SELECT CampaignId, CampaignName FROM CLICK_PERFORMANCE_REPORT "
            + "DURING THIS_WEEK_MON_TODAY";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from(ReportDefinitionReportType.CLICK_PERFORMANCE_REPORT)
            .during(ReportDefinitionDateRangeType.THIS_WEEK_MON_TODAY)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();
  }

  /** Tests the EQUAL_TO WHERE clause. */
  @Test
  public void testEqualToWhereClause() {
    String expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE Clicks = 200";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Clicks").equalTo(200)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();

    reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Clicks").equalTo(200L)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());

    expectedAwql =
        "SELECT CampaignId, CampaignName FROM CAMPAIGN_PERFORMANCE_REPORT "
            + "WHERE IsBudgetExplicitlyShared = true";

    reportQuery =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from(ReportDefinitionReportType.CAMPAIGN_PERFORMANCE_REPORT)
            .where("IsBudgetExplicitlyShared").equalTo(true)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
  }

  /** Tests the NOT_EQUAL_TO WHERE clause. */
  @Test
  public void testNotEqualToWhereClause() {
    String expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE Clicks != 200";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Clicks").notEqualTo(200)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();

    reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Clicks").notEqualTo(200L)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());

    expectedAwql =
        "SELECT CampaignId, CampaignName FROM CAMPAIGN_PERFORMANCE_REPORT "
            + "WHERE IsBudgetExplicitlyShared != true";

    reportQuery =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from(ReportDefinitionReportType.CAMPAIGN_PERFORMANCE_REPORT)
            .where("IsBudgetExplicitlyShared").notEqualTo(true)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
  }

  /** Tests the GREATER_THAN WHERE clause. */
  @Test
  public void testGreaterThanWhereClause() {
    String expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE Clicks > 200";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Clicks").greaterThan(200)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();

    expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE Clicks > 200";

    reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Clicks").greaterThan(200L)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());

    expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE Conversions > 200.550000";

    reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Conversions").greaterThan(200.550000)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
  }

  /** Tests the GREATER_THAN_OR_EQUAL_TO WHERE clause. */
  @Test
  public void testGreaterThanOrEqualToWhereClause() {
    String expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE Clicks >= 200";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Clicks").greaterThanOrEqualTo(200)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();

    expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE Clicks >= 200";

    reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Clicks").greaterThanOrEqualTo(200L)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());

    expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE Conversions >= 200.550000";

    reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Conversions").greaterThanOrEqualTo(200.550000)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
  }

  /** Tests the LESS_THAN WHERE clause. */
  @Test
  public void testLessThanWhereClause() {
    String expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE Clicks < 200";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Clicks").lessThan(200)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();

    expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE Clicks < 200";

    reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Clicks").lessThan(200L)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());

    expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE Conversions < 200.550000";

    reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Conversions").lessThan(200.550000)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
  }

  /** Tests the LESS_THAN_OR_EQUAL_TO WHERE clause. */
  @Test
  public void testLessThanOrEqualToWhereClause() {
    String expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE Clicks <= 200";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Clicks").lessThanOrEqualTo(200)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();

    reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Clicks").lessThanOrEqualTo(200L)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());

    expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE Conversions <= 200.550000";

    reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Conversions").lessThanOrEqualTo(200.550000)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
  }

  /** Tests the IN WHERE clause. */
  @Test
  public void testInWhereClause() {
    String expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE "
            + "CampaignName IN [\"asia\", \"europe\"]";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("CampaignName").in("asia", "europe")
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();

    expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE "
            + "CampaignId IN [1111, 2222]";

    reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("CampaignId").in(1111, 2222)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());

    expectedAwql =
        "SELECT CampaignId, CampaignName FROM CAMPAIGN_PERFORMANCE_REPORT WHERE "
            + "AveragePageviews IN [2.5, 3.5]";

    reportQuery =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from(ReportDefinitionReportType.CAMPAIGN_PERFORMANCE_REPORT)
            .where("AveragePageviews").in(2.5, 3.5)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());

    expectedAwql =
        "SELECT CampaignId, CampaignName FROM CAMPAIGN_PERFORMANCE_REPORT "
            + "WHERE IsBudgetExplicitlyShared IN [false, true]";

    reportQuery =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from(ReportDefinitionReportType.CAMPAIGN_PERFORMANCE_REPORT)
            .where("IsBudgetExplicitlyShared").in(false, true)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());

  }

  /** Tests the NOT_IN WHERE clause. */
  @Test
  public void testNotInWhereClause() {
    String expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE "
            + "Id NOT_IN [44444, 77777]";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Id").notIn(44444L, 77777L)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();

    expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE "
            + "CampaignId NOT_IN [1111, 2222]";

    reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("CampaignId").notIn(1111, 2222)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());

    expectedAwql =
        "SELECT CampaignId, CampaignName FROM CAMPAIGN_PERFORMANCE_REPORT WHERE "
            + "AveragePageviews NOT_IN [2.5, 3.5]";

    reportQuery =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from(ReportDefinitionReportType.CAMPAIGN_PERFORMANCE_REPORT)
            .where("AveragePageviews").notIn(2.5, 3.5)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());

    expectedAwql =
        "SELECT CampaignId, CampaignName FROM CAMPAIGN_PERFORMANCE_REPORT "
            + "WHERE IsBudgetExplicitlyShared NOT_IN [false, true]";

    reportQuery =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from(ReportDefinitionReportType.CAMPAIGN_PERFORMANCE_REPORT)
            .where("IsBudgetExplicitlyShared").notIn(false, true)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
  }

  /** Tests the CONTAINS_ANY WHERE clause. */
  @Test
  public void testContainsAnyWhereClause() {
    String expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE "
            + "Id CONTAINS_ANY [44444, 77777]";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Id").containsAny(44444L, 77777L)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();

    expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE "
            + "CampaignId CONTAINS_ANY [1111, 2222]";

    reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("CampaignId").containsAny(1111, 2222)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());

    expectedAwql =
        "SELECT CampaignId, CampaignName FROM CAMPAIGN_PERFORMANCE_REPORT WHERE "
            + "AveragePageviews CONTAINS_ANY [2.5, 3.5]";

    reportQuery =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from(ReportDefinitionReportType.CAMPAIGN_PERFORMANCE_REPORT)
            .where("AveragePageviews").containsAny(2.5, 3.5)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
  }

  /** Tests the CONTAINS_ALL WHERE clause. */
  @Test
  public void testContainsAllWhereClause() {
    String expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE "
            + "Id CONTAINS_ALL [44444, 77777]";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Id").containsAll(44444L, 77777L)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();

    expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE "
            + "CampaignId CONTAINS_ALL [1111, 2222]";

    reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("CampaignId").containsAll(1111, 2222)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());

    expectedAwql =
        "SELECT CampaignId, CampaignName FROM CAMPAIGN_PERFORMANCE_REPORT WHERE "
            + "AveragePageviews CONTAINS_ALL [2.5, 3.5]";

    reportQuery =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from(ReportDefinitionReportType.CAMPAIGN_PERFORMANCE_REPORT)
            .where("AveragePageviews").containsAll(2.5, 3.5)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
  }

  /** Tests the CONTAINS_NONE WHERE clause. */
  @Test
  public void testContainsNoneWhereClause() {
    String expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE "
            + "Id CONTAINS_NONE [44444, 77777]";

    ReportQueryInterface reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("Id").containsNone(44444L, 77777L)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
    checkUtilitiesState();

    expectedAwql =
        "SELECT Id, CampaignName FROM CRITERIA_PERFORMANCE_REPORT WHERE "
            + "CampaignId CONTAINS_NONE [1111, 2222]";

    reportQuery =
        new ReportQuery.Builder()
            .fields("Id", "CampaignName")
            .from(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT)
            .where("CampaignId").containsNone(1111, 2222)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());

    expectedAwql =
        "SELECT CampaignId, CampaignName FROM CAMPAIGN_PERFORMANCE_REPORT WHERE "
            + "AveragePageviews CONTAINS_NONE [2.5, 3.5]";

    reportQuery =
        new ReportQuery.Builder()
            .fields("CampaignId", "CampaignName")
            .from(ReportDefinitionReportType.CAMPAIGN_PERFORMANCE_REPORT)
            .where("AveragePageviews").containsNone(2.5, 3.5)
            .build();

    assertEquals(expectedAwql, reportQuery.toString());
  }
}
