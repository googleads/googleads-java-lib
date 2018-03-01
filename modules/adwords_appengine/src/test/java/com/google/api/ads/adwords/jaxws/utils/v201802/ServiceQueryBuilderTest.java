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

package com.google.api.ads.adwords.jaxws.utils.v201802;

import static org.junit.Assert.assertEquals;

import com.google.api.ads.adwords.jaxws.v201802.cm.SortOrder;
import com.google.api.ads.adwords.lib.selectorfields.v201802.cm.AdGroupField;
import com.google.api.ads.adwords.lib.selectorfields.v201802.cm.CampaignField;
import com.google.api.ads.adwords.lib.utils.AdWordsInternals;
import com.google.api.ads.common.lib.utils.AdsUtility;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Test case for the service query builder. See {@link ServiceQuery.Builder}. */
@RunWith(JUnit4.class)
public class ServiceQueryBuilderTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Before
  public void setUp() {
    AdWordsInternals.getInstance().getAdsUtilityRegistry().popRegisteredUtilities();
  }

  /** Checks the utilities registry status. */
  public void checkUtilitiesState() {
    Set<AdsUtility> expectedUtilities = new HashSet<>();
    expectedUtilities.add(AdsUtility.SERVICE_QUERY_BUILDER);
    assertEquals(
        expectedUtilities,
        AdWordsInternals.getInstance().getAdsUtilityRegistry().popRegisteredUtilities());
  }

  /** Tests building a service query. */
  @Test
  public void testBuild() {
    String expectedAwql =
        "SELECT Id, Name WHERE Status = \"ENABLED\" ORDER BY Name DESC LIMIT 0,100";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
           .fields("Id", "Name")
            .where("Status").equalTo("ENABLED")
            .limit(0, 100)
            .orderBy("Name", SortOrder.DESCENDING)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();
  }

  /** Tests building a service query using a copy constructor. */
  @Test
  public void testBuildWithCopyConstructor() {
    ServiceQuery.Builder oldBuilder =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Status").notEqualTo("ENABLED")
            .limit(0, 100)
            .orderBy("Name");

    ServiceQuery expectedServiceQuery = oldBuilder.build();
    ServiceQuery newServiceQuery = new ServiceQuery.Builder(oldBuilder).build();

    assertEquals(expectedServiceQuery, newServiceQuery);
    checkUtilitiesState();
  }

  /** Tests failing to build a service query using a copy constructor. */
  @Test
  public void testBuildWithCopyConstructor_nullArg_fails() {
    thrown.expect(NullPointerException.class);
    thrown.expectMessage("query builder");
    new ServiceQuery.Builder(null).build();
  }

  /** Tests building a service query with {@link Iterable} fields. */
  @Test
  public void testBuildWithIterableFields() {
    String expectedAwql = "SELECT Id, Name LIMIT 0,100";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder().fields(Sets.newHashSet("Id", "Name")).limit(0, 100).build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();
  }

  /**
   * Tests building a service query with {@link
   * com.google.api.ads.adwords.lib.selectorfields.EntityField} fields.
   */
  @Test
  public void testBuildWithEntityFields() {
    String expectedAwql = "SELECT Id, Name LIMIT 0,100";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields(CampaignField.Id, CampaignField.Name)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();
  }

  /** Tests building a service query duplicate fields. Only unique fields are retained. */
  @Test
  public void testBuild_onlyUniqueFieldsRetained() {
    String expectedAwql = "SELECT Id, Impressions LIMIT 0,200";

    // fields() accepting varags.
    ServiceQuery serviceQuery =
        new ServiceQuery.Builder().fields("Id", "Impressions", "Id").limit(0, 200).build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();

    // fields() accepting Iterable.
    serviceQuery =
        new ServiceQuery.Builder()
            .fields(Sets.newHashSet("Id", "Impressions", "Id"))
            .limit(0, 200)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /** Tests building a service query with multiple "select"s. The last call should stick. */
  @Test
  public void testBuild_multipleSelects() {
    String expectedAwql = "SELECT Id LIMIT 0,200";

    // fields() accepting varags.
    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Impressions", "Id")
            .fields("Id")
            .limit(0, 200)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();

    // fields() accepting Iterable.
    serviceQuery =
        new ServiceQuery.Builder()
            .fields(Sets.newHashSet("Id", "Impressions", "Id"))
            .fields(Sets.newHashSet("Id"))
            .limit(0, 200)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /** Tests building a service query with a WHERE entity field. */
  @Test
  public void testBuildWhereWithEntityField() {
    String expectedAwql = "SELECT Id, Name WHERE Name CONTAINS_IGNORE_CASE \"google\" LIMIT 0,50";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields(AdGroupField.Id, AdGroupField.Name)
            .where(AdGroupField.Name).containsIgnoreCase("google")
            .limit(0, 50)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();
  }

  /** Tests building a service query with a string WHERE value. */
  @Test
  public void testBuildStringWhereValue() {
    String expectedAwql = "SELECT Id, Name WHERE Name CONTAINS_IGNORE_CASE \"google\" LIMIT 0,50";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Name").containsIgnoreCase("google")
            .limit(0, 50)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();
  }

  /** Tests building a service query with a numeric WHERE value. */
  @Test
  public void testBuildLongWhereValue() {
    String expectedAwql = "SELECT Id, Name WHERE AverageCpm >= 5 LIMIT 0,50";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("AverageCpm").greaterThanOrEqualTo(5)
            .limit(0, 50)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();
  }

  /** Tests building a service query with multiple string values of the WHERE clause. */
  @Test
  public void testBuildMultipleStringWhereValues() {
    String expectedAwql =
        "SELECT Id, Name WHERE Name CONTAINS_ALL [\"white\", \"black\"] LIMIT 0,50";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Name").containsAll("white", "black")
            .limit(0, 50)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();
  }

  /** Tests building a service query with multiple long values of the WHERE clause. */
  @Test
  public void testBuildMultipleLongWhereValues() {
    String expectedAwql = "SELECT Id, Name WHERE Id IN [1234, 5678] LIMIT 0,50";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Id").in(1234L, 5678L)
            .limit(0, 50)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();
  }

  /** Tests building a service query with multiple WHERE clauses. */
  @Test
  public void testBuildMultipleWhereClauses() {
    String expectedAwql =
        "SELECT Id, Name"
            + " WHERE Clicks >= 500 AND Name CONTAINS_IGNORE_CASE \"promotion\""
            + " AND AdGroupName STARTS_WITH \"adwords_\""
            + " AND BiddingStrategyName STARTS_WITH_IGNORE_CASE \"europe\""
            + " AND CustomerDescriptiveName CONTAINS \"goog\""
            + " AND CustomerDescriptiveName DOES_NOT_CONTAIN \"asia\""
            + " AND AccountDescriptiveName DOES_NOT_CONTAIN_IGNORE_CASE \"group 3\""
            + " AND Status != \"REMOVED\""
            + " AND AdGroupStatus NOT_IN [\"REMOVED\", \"PAUSED\"]"
            + " AND AdNetworkType1 CONTAINS_ANY [\"SEARCH\", \"DISPLAY\"]"
            + " AND AdNetworkType2 CONTAINS_NONE [\"YOUTUBE_SEARCH\", \"UNKNOWN\"]"
            + " LIMIT 0,50";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Clicks").greaterThanOrEqualTo(500)
            .where("Name").containsIgnoreCase("promotion")
            .where("AdGroupName").startsWith("adwords_")
            .where("BiddingStrategyName").startsWithIgnoreCase("europe")
            .where("CustomerDescriptiveName").contains("goog")
            .where("CustomerDescriptiveName").doesNotContain("asia")
            .where("AccountDescriptiveName").doesNotContainIgnoreCase("group 3")
            .where("Status").notEqualTo("REMOVED")
            .where("AdGroupStatus").notIn("REMOVED", "PAUSED")
            .where("AdNetworkType1").containsAny("SEARCH", "DISPLAY")
            .where("AdNetworkType2").containsNone("YOUTUBE_SEARCH", "UNKNOWN")
            .limit(0, 50)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();
  }

  /** Tests failing to build a service query due to {@code fields()} not called. */
  @Test
  public void testBuild_fails_fieldsNotCalled() {
    thrown.expect(IllegalStateException.class);
    thrown.expectMessage("use fields()");
    new ServiceQuery.Builder().build();
  }

  /** Tests failing to build a service query due to {@code limit()} not called. */
  @Test
  public void testBuild_fails_limitNotCalled() {
    thrown.expect(IllegalStateException.class);
    thrown.expectMessage("use limit()");
    new ServiceQuery.Builder().fields("Id").build();
  }

  /** Tests failing to build a service query due to {@code limit()} called with zero page size. */
  @Test
  public void testBuild_fails_limitCalledWithZeroPageSize() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("Page size");
    new ServiceQuery.Builder().fields("Id").limit(0, 0).build();
  }

  /** Tests the EQUAL_TO WHERE clause. */
  @Test
  public void testEqualToWhereClause() {
    String expectedAwql = "SELECT Id, Name WHERE Clicks = 200 LIMIT 0,100";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Clicks").equalTo(200)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Clicks").equalTo(200L)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());

    expectedAwql = "SELECT Id, Name WHERE IsBudgetExplicitlyShared = true LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("IsBudgetExplicitlyShared").equalTo(true)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /** Tests the NOT_EQUAL_TO WHERE clause. */
  @Test
  public void testNotEqualToWhereClause() {
    String expectedAwql = "SELECT Id, Name WHERE Clicks != 200 LIMIT 0,100";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Clicks").notEqualTo(200)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Clicks").notEqualTo(200L)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());

    expectedAwql = "SELECT Id, Name WHERE IsBudgetExplicitlyShared != true LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("IsBudgetExplicitlyShared").notEqualTo(true)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /** Tests the GREATER_THAN WHERE clause. */
  @Test
  public void testGreaterThanWhereClause() {
    String expectedAwql = "SELECT Id, Name WHERE Clicks > 200 LIMIT 0,100";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Clicks").greaterThan(200)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();

    expectedAwql = "SELECT Id, Name WHERE Clicks > 200 LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Clicks").greaterThan(200L)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());

    expectedAwql = "SELECT Id, Name WHERE Conversions > 200.550000 LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Conversions").greaterThan(200.550000)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /** Tests the GREATER_THAN_OR_EQUAL_TO WHERE clause. */
  @Test
  public void testGreaterThanOrEqualToWhereClause() {
    String expectedAwql = "SELECT Id, Name WHERE Clicks >= 200 LIMIT 0,100";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Clicks").greaterThanOrEqualTo(200)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();

    expectedAwql = "SELECT Id, Name WHERE Clicks >= 200 LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Clicks").greaterThanOrEqualTo(200L)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());

    expectedAwql = "SELECT Id, Name WHERE Conversions >= 200.550000 LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Conversions").greaterThanOrEqualTo(200.550000)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /** Tests the LESS_THAN WHERE clause. */
  @Test
  public void testLessThanWhereClause() {
    String expectedAwql = "SELECT Id, Name WHERE Clicks < 200 LIMIT 0,100";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Clicks").lessThan(200)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();

    expectedAwql = "SELECT Id, Name WHERE Clicks < 200 LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Clicks").lessThan(200L)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());

    expectedAwql = "SELECT Id, Name WHERE Conversions < 200.550000 LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Conversions").lessThan(200.550000)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /** Tests the LESS_THAN_OR_EQUAL_TO WHERE clause. */
  @Test
  public void testLessThanOrEqualToWhereClause() {
    String expectedAwql = "SELECT Id, Name WHERE Clicks <= 200 LIMIT 0,100";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Clicks").lessThanOrEqualTo(200)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Clicks").lessThanOrEqualTo(200L)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());

    expectedAwql = "SELECT Id, Name WHERE Conversions <= 200.550000 LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Conversions").lessThanOrEqualTo(200.550000)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /** Tests the IN WHERE clause. */
  @Test
  public void testInWhereClause() {
    String expectedAwql = "SELECT Id, Name WHERE Name IN [\"asia\", \"europe\"] LIMIT 0,100";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Name").in("asia", "europe")
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();

    expectedAwql = "SELECT Id, Name WHERE Id IN [1111, 2222] LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Id").in(1111, 2222)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());

    expectedAwql = "SELECT Id, Name WHERE AveragePageviews IN [2.5, 3.5] LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("AveragePageviews").in(2.5, 3.5)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());

    expectedAwql = "SELECT Id, Name WHERE IsBudgetExplicitlyShared IN [false, true] LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("IsBudgetExplicitlyShared").in(false, true)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /** Tests the NOT_IN WHERE clause. */
  @Test
  public void testNotInWhereClause() {
    String expectedAwql = "SELECT Id, Name WHERE Id NOT_IN [44444, 77777] LIMIT 0,100";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Id").notIn(44444L, 77777L)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();

    expectedAwql = "SELECT Id, Name WHERE Id NOT_IN [1111, 2222] LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Id").notIn(1111, 2222)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());

    expectedAwql = "SELECT Id, Name WHERE AveragePageviews NOT_IN [2.5, 3.5] LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("AveragePageviews").notIn(2.5, 3.5)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());

    expectedAwql =
        "SELECT Id, Name WHERE IsBudgetExplicitlyShared NOT_IN [false, true] LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("IsBudgetExplicitlyShared").notIn(false, true)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /** Tests the CONTAINS_ANY WHERE clause. */
  @Test
  public void testContainsAnyWhereClause() {
    String expectedAwql = "SELECT Id, Name WHERE Id CONTAINS_ANY [44444, 77777] LIMIT 0,100";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Id").containsAny(44444L, 77777L).limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();

    expectedAwql = "SELECT Id, Name WHERE Id CONTAINS_ANY [1111, 2222] LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Id").containsAny(1111, 2222).limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());

    expectedAwql = "SELECT Id, Name WHERE AveragePageviews CONTAINS_ANY [2.5, 3.5] LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("AveragePageviews").containsAny(2.5, 3.5).limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /** Tests the CONTAINS_ALL WHERE clause. */
  @Test
  public void testContainsAllWhereClause() {
    String expectedAwql = "SELECT Id, Name WHERE Id CONTAINS_ALL [44444, 77777] LIMIT 0,100";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Id").containsAll(44444L, 77777L)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();

    expectedAwql = "SELECT Id, Name WHERE Id CONTAINS_ALL [1111, 2222] LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Id").containsAll(1111, 2222)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());

    expectedAwql = "SELECT Id, Name WHERE AveragePageviews CONTAINS_ALL [2.5, 3.5] LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("AveragePageviews").containsAll(2.5, 3.5)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /** Tests the CONTAINS_NONE WHERE clause. */
  @Test
  public void testContainsNoneWhereClause() {
    String expectedAwql = "SELECT Id, Name WHERE Id CONTAINS_NONE [44444, 77777] LIMIT 0,100";

    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Id").containsNone(44444L, 77777L)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();

    expectedAwql = "SELECT Id, Name WHERE Id CONTAINS_NONE [1111, 2222] LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("Id").containsNone(1111, 2222)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());

    expectedAwql = "SELECT Id, Name WHERE AveragePageviews CONTAINS_NONE [2.5, 3.5] LIMIT 0,100";

    serviceQuery =
        new ServiceQuery.Builder()
            .fields("Id", "Name")
            .where("AveragePageviews").containsNone(2.5, 3.5)
            .limit(0, 100)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
  }

  /** Tests building a service query with an entity field. */
  @Test
  public void testBuildWithEntityFieldOrderBy() {
    String expectedAwql =
        "SELECT Id, Name WHERE Status = \"ENABLED\" ORDER BY Name ASC LIMIT 0,100";

    // No explicit sort order.
    ServiceQuery serviceQuery =
        new ServiceQuery.Builder()
            .fields(CampaignField.Id, CampaignField.Name)
            .where(CampaignField.Status).equalTo("ENABLED")
            .limit(0, 100)
            .orderBy(CampaignField.Name)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();

    expectedAwql = "SELECT Id, Name WHERE Status = \"ENABLED\" ORDER BY Name DESC LIMIT 0,100";

    // With explicit sort order.
    serviceQuery =
        new ServiceQuery.Builder()
            .fields(CampaignField.Id, CampaignField.Name)
            .where(CampaignField.Status).equalTo("ENABLED")
            .limit(0, 100)
            .orderBy(CampaignField.Name, SortOrder.DESCENDING)
            .build();

    assertEquals(expectedAwql, serviceQuery.toString());
    checkUtilitiesState();
  }
}
