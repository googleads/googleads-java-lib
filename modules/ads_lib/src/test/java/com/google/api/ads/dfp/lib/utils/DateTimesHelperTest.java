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

import org.apache.commons.lang.builder.EqualsBuilder;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Test for {@link DateTimesHelper}.
 */
@RunWith(JUnit4.class)
public class DateTimesHelperTest {

  private DateTimesHelper<ApiDateTime, ApiDate> dateTimesHelper;

  private static final String TIME_ZONE_ID1 = "Asia/Shanghai";
  private static final String TIME_ZONE_ID2 = "PST8PDT";
  private static final String TIME_ZONE_ID3 = "GMT";

  private static final Locale LOCALE1 = Locale.CHINA;
  private static final Locale LOCALE2 = Locale.ENGLISH;
  private static final Locale LOCALE3 = Locale.UK;

  private ApiDateTime apiDateTime1;
  private ApiDateTime apiDateTime2;
  private ApiDateTime apiDateTime3;

  private DateTime jodaDateTime1;
  private DateTime jodaDateTime2;
  private DateTime jodaDateTime3;

  private Calendar calendar1;
  private Calendar calendar2;
  private Calendar calendar3;

  private Calendar calendarWithLocale1;
  private Calendar calendarWithLocale2;
  private Calendar calendarWithLocale3;

  private String stringDate1;
  private String stringDate2;
  private String stringDate3;

  private String stringDateTime1;
  private String stringDateTime2;
  private String stringDateTime3;

  private String stringDateTimeWithTimeZone1;
  private String stringDateTimeWithTimeZone2;
  private String stringDateTimeWithTimeZone3;

  public DateTimesHelperTest() {}

  @Before
  public void setUp() throws Exception {
    dateTimesHelper =
        new DateTimesHelper<DateTimesHelperTest.ApiDateTime, DateTimesHelperTest.ApiDate>(
            ApiDateTime.class, ApiDate.class);

    apiDateTime1 = new ApiDateTime();
    ApiDate apiDate1 = new ApiDate();
    apiDate1.year = 2012;
    apiDate1.month = 12;
    apiDate1.day = 2;
    apiDateTime1.date = apiDate1;
    apiDateTime1.hour = 12;
    apiDateTime1.minute = 45;
    apiDateTime1.second = 0;
    apiDateTime1.timeZoneID = TIME_ZONE_ID1;

    stringDate1 = "2012-12-02";
    stringDateTime1 = "2012-12-02T12:45:00";
    stringDateTimeWithTimeZone1 = "2012-12-02T12:45:00+08:00";

    jodaDateTime1 =
        new DateTime(DateTimeZone.forID(TIME_ZONE_ID1)).withYear(2012).withMonthOfYear(12)
            .withDayOfMonth(2).withHourOfDay(12).withMinuteOfHour(45).withSecondOfMinute(0)
            .withMillisOfSecond(0);

    calendar1 = Calendar.getInstance();
    calendar1.clear();
    calendar1.setTimeZone(DateTimeZone.forID(TIME_ZONE_ID1).toTimeZone());
    calendar1.set(2012, 11, 2, 12, 45, 0);

    calendarWithLocale1 = Calendar.getInstance(LOCALE1);
    calendarWithLocale1.clear();
    calendarWithLocale1.setTimeZone(DateTimeZone.forID(TIME_ZONE_ID1).toTimeZone());
    calendarWithLocale1.set(2012, 11, 2, 12, 45, 0);

    apiDateTime2 = new ApiDateTime();
    ApiDate apiDate2 = new ApiDate();
    apiDate2.year = 2004;
    apiDate2.month = 2;
    apiDate2.day = 29;
    apiDateTime2.date = apiDate2;
    apiDateTime2.hour = 0;
    apiDateTime2.minute = 0;
    apiDateTime2.second = 0;
    apiDateTime2.timeZoneID = TIME_ZONE_ID2;

    stringDate2 = "2004-02-29";
    stringDateTime2 = "2004-02-29T00:00:00";
    stringDateTimeWithTimeZone2 = "2004-02-29T00:00:00-08:00";

    jodaDateTime2 =
        new DateTime(DateTimeZone.forID(TIME_ZONE_ID2)).withYear(2004).withMonthOfYear(2)
            .withDayOfMonth(29).withHourOfDay(0).withMinuteOfHour(0).withSecondOfMinute(0)
            .withMillisOfSecond(0);

    calendar2 = Calendar.getInstance();
    calendar2.clear();
    calendar2.setTimeZone(DateTimeZone.forID(TIME_ZONE_ID2).toTimeZone());
    calendar2.set(2004, 1, 29, 0, 0, 0);

    calendarWithLocale2 = Calendar.getInstance(LOCALE2);
    calendarWithLocale2.clear();
    calendarWithLocale2.setTimeZone(DateTimeZone.forID(TIME_ZONE_ID2).toTimeZone());
    calendarWithLocale2.set(2004, 1, 29, 0, 0, 0);

    apiDateTime3 = new ApiDateTime();
    ApiDate apiDate3 = new ApiDate();
    apiDate3.year = 2007;
    apiDate3.month = 1;
    apiDate3.day = 1;
    apiDateTime3.date = apiDate3;
    apiDateTime3.hour = 18;
    apiDateTime3.minute = 0;
    apiDateTime3.second = 30;
    apiDateTime3.setTimeZoneID(TIME_ZONE_ID3);

    stringDate3 = "2007-01-01";
    stringDateTime3 = "2007-01-01T18:00:30";
    stringDateTimeWithTimeZone3 = "2007-01-01T18:00:30Z";

    jodaDateTime3 =
        new DateTime(DateTimeZone.forID(TIME_ZONE_ID3)).withYear(2007).withMonthOfYear(1)
            .withDayOfMonth(1).withHourOfDay(18).withMinuteOfHour(0).withSecondOfMinute(30)
            .withMillisOfSecond(0);

    calendar3 = Calendar.getInstance();
    calendar3.clear();
    calendar3.setTimeZone(DateTimeZone.forID(TIME_ZONE_ID3).toTimeZone());
    calendar3.set(2007, 0, 1, 18, 0, 30);

    calendarWithLocale3 = Calendar.getInstance(LOCALE3);
    calendarWithLocale3.clear();
    calendarWithLocale3.setTimeZone(DateTimeZone.forID(TIME_ZONE_ID3).toTimeZone());
    calendarWithLocale3.set(2007, 0, 1, 18, 0, 30);
  }

  @Test
  public void testToDateTime_fromInstantToApiDateTime() {
    assertEquals(apiDateTime1,
        dateTimesHelper.toDateTime(jodaDateTime1.toInstant(), TIME_ZONE_ID1));
    assertEquals(apiDateTime2,
        dateTimesHelper.toDateTime(jodaDateTime2.toInstant(), TIME_ZONE_ID2));
    assertEquals(apiDateTime3,
        dateTimesHelper.toDateTime(jodaDateTime3.toInstant(), TIME_ZONE_ID3));
  }

  @Test
  public void testToDateTime_fromCalendarToApiDateTime() {
    assertEquals(apiDateTime1, dateTimesHelper.toDateTime(calendar1));
    assertEquals(apiDateTime2, dateTimesHelper.toDateTime(calendar2));
    assertEquals(apiDateTime3, dateTimesHelper.toDateTime(calendar3));
  }

  @Test
  public void testToDateTime_fromStringToApiDateTime() {
    assertEquals(apiDateTime1, dateTimesHelper.toDateTime(stringDateTime1, TIME_ZONE_ID1));
    assertEquals(apiDateTime2, dateTimesHelper.toDateTime(stringDateTime2, TIME_ZONE_ID2));
    assertEquals(apiDateTime3, dateTimesHelper.toDateTime(stringDateTime3, TIME_ZONE_ID3));
  }

  @Test
  public void testToDateTime_fromStringToApiDateTimeWithTimeZone() {
    assertEquals(apiDateTime1,
        dateTimesHelper.toDateTimeWithTimeZone(stringDateTimeWithTimeZone1));
    assertEquals(apiDateTime2,
        dateTimesHelper.toDateTimeWithTimeZone(stringDateTimeWithTimeZone2));
    assertEquals(apiDateTime3,
        dateTimesHelper.toDateTimeWithTimeZone(stringDateTimeWithTimeZone3));
  }

  @Test
  public void testToDateTime_fromApiDateTimeToJoda() {
    Object joda = dateTimesHelper.toDateTime(apiDateTime3);
    assertEquals(jodaDateTime1, dateTimesHelper.toDateTime(apiDateTime1));
    assertEquals(jodaDateTime2, dateTimesHelper.toDateTime(apiDateTime2));
    assertEquals(jodaDateTime3, dateTimesHelper.toDateTime(apiDateTime3));
  }

  @Test
  public void testToCalendar_fromApiDate() {
    assertEquals(calendar1, dateTimesHelper.toCalendar(apiDateTime1));
    assertEquals(calendar2, dateTimesHelper.toCalendar(apiDateTime2));
    assertEquals(calendar3, dateTimesHelper.toCalendar(apiDateTime3));
  }

  @Test
  public void testToCalendar_fromApiDate_withLocales() {
    assertEquals(calendarWithLocale1, dateTimesHelper.toCalendar(apiDateTime1, LOCALE1));
    assertEquals(calendarWithLocale2, dateTimesHelper.toCalendar(apiDateTime2, LOCALE2));
    assertEquals(calendarWithLocale3, dateTimesHelper.toCalendar(apiDateTime3, LOCALE3));
  }

  @Test
  public void testToString_fromApiDate() {
    Assert.assertEquals(stringDate1, dateTimesHelper.dateToString(apiDateTime1.getDate()));
    Assert.assertEquals(stringDate2, dateTimesHelper.dateToString(apiDateTime2.getDate()));
    Assert.assertEquals(stringDate3, dateTimesHelper.dateToString(apiDateTime3.getDate()));
  }

  @Test
  public void testToString_fromApiDateTime() {
    Assert.assertEquals(stringDateTime1, dateTimesHelper.toString(apiDateTime1));
    Assert.assertEquals(stringDateTime2, dateTimesHelper.toString(apiDateTime2));
    Assert.assertEquals(stringDateTime3, dateTimesHelper.toString(apiDateTime3));
  }

  @Test
  public void testToStringWithTimeZone_fromApiDateTime() {
    Assert.assertEquals(stringDateTimeWithTimeZone1,
        dateTimesHelper.toStringWithTimeZone(apiDateTime1));
    Assert.assertEquals(stringDateTimeWithTimeZone2,
        dateTimesHelper.toStringWithTimeZone(apiDateTime2));
    Assert.assertEquals(stringDateTimeWithTimeZone3,
        dateTimesHelper.toStringWithTimeZone(apiDateTime3));
  }

  @Test
  public void testToStringForTimeZone_fromApiDate() {
    Assert.assertEquals(stringDateTime1,
        dateTimesHelper.toStringForTimeZone(apiDateTime1, TIME_ZONE_ID1));
    Assert.assertEquals(stringDateTime2,
        dateTimesHelper.toStringForTimeZone(apiDateTime2, TIME_ZONE_ID2));
    Assert.assertEquals(stringDateTime3,
        dateTimesHelper.toStringForTimeZone(apiDateTime3, TIME_ZONE_ID3));

    Assert.assertEquals(stringDateTime1, dateTimesHelper.toStringForTimeZone(
        dateTimesHelper.toDateTime(jodaDateTime1.withZone(DateTimeZone.forID(TIME_ZONE_ID2))),
        TIME_ZONE_ID1));
    Assert.assertEquals(stringDateTime2, dateTimesHelper.toStringForTimeZone(
        dateTimesHelper.toDateTime(jodaDateTime2.withZone(DateTimeZone.forID(TIME_ZONE_ID1))),
        TIME_ZONE_ID2));
    Assert.assertEquals(stringDateTime3, dateTimesHelper.toStringForTimeZone(
        dateTimesHelper.toDateTime(jodaDateTime3.withZone(DateTimeZone.forID(TIME_ZONE_ID1))),
        TIME_ZONE_ID3));
  }

  @Test
  public void testTransitive_apiJodaApi() {
    assertEquals(apiDateTime1,
        dateTimesHelper.toDateTime(dateTimesHelper.toDateTime(apiDateTime1)));
    assertEquals(apiDateTime2,
        dateTimesHelper.toDateTime(dateTimesHelper.toDateTime(apiDateTime2)));
    assertEquals(apiDateTime3,
        dateTimesHelper.toDateTime(dateTimesHelper.toDateTime(apiDateTime3)));
  }

  @Test
  public void testTransitive_apiStringApi() {
    assertEquals(apiDateTime1,
        dateTimesHelper.toDateTime(dateTimesHelper.toString(apiDateTime1), TIME_ZONE_ID1));
    assertEquals(apiDateTime2,
        dateTimesHelper.toDateTime(dateTimesHelper.toString(apiDateTime2), TIME_ZONE_ID2));
    assertEquals(apiDateTime3,
        dateTimesHelper.toDateTime(dateTimesHelper.toString(apiDateTime3), TIME_ZONE_ID3));
  }

  @Test
  public void testTransitive_apiCalendarApi() {
    assertEquals(apiDateTime1,
        dateTimesHelper.toDateTime(dateTimesHelper.toCalendar(apiDateTime1)));
    assertEquals(apiDateTime2,
        dateTimesHelper.toDateTime(dateTimesHelper.toCalendar(apiDateTime2)));
    assertEquals(apiDateTime3,
        dateTimesHelper.toDateTime(dateTimesHelper.toCalendar(apiDateTime3)));
  }

  @Test
  public void testTransitive_jodaApiJoda() {
    assertEquals(jodaDateTime1,
        dateTimesHelper.toDateTime(dateTimesHelper.toDateTime(jodaDateTime1)));
    assertEquals(jodaDateTime2,
        dateTimesHelper.toDateTime(dateTimesHelper.toDateTime(jodaDateTime2)));
    assertEquals(jodaDateTime3,
        dateTimesHelper.toDateTime(dateTimesHelper.toDateTime(jodaDateTime3)));
  }

  @Test
  public void testTransitive_calendarApiJoda() {
    assertEquals(jodaDateTime1, dateTimesHelper.toDateTime(dateTimesHelper.toDateTime(calendar1)));
    assertEquals(jodaDateTime2, dateTimesHelper.toDateTime(dateTimesHelper.toDateTime(calendar2)));
    assertEquals(jodaDateTime3, dateTimesHelper.toDateTime(dateTimesHelper.toDateTime(calendar3)));
  }

  @Test
  public void testTransitive_stringApiJoda() {
    assertEquals(jodaDateTime1,
        dateTimesHelper.toDateTime(dateTimesHelper.toDateTime(stringDateTime1, TIME_ZONE_ID1)));
    assertEquals(jodaDateTime2,
        dateTimesHelper.toDateTime(dateTimesHelper.toDateTime(stringDateTime2, TIME_ZONE_ID2)));
    assertEquals(jodaDateTime3,
        dateTimesHelper.toDateTime(dateTimesHelper.toDateTime(stringDateTime3, TIME_ZONE_ID3)));
  }

  @Test
  public void testTransitive_stringApiJodaWithTimeZone() {
    assertEquals(jodaDateTime1, dateTimesHelper.toDateTime(
        dateTimesHelper.toDateTimeWithTimeZone(stringDateTimeWithTimeZone1)));
    assertEquals(jodaDateTime2, dateTimesHelper.toDateTime(
        dateTimesHelper.toDateTimeWithTimeZone(stringDateTimeWithTimeZone2)));
    assertEquals(jodaDateTime3, dateTimesHelper.toDateTime(
        dateTimesHelper.toDateTimeWithTimeZone(stringDateTimeWithTimeZone3)));
  }

  @Test
  public void testTransitive_instantApiJoda() {
    assertEquals(jodaDateTime1, dateTimesHelper.toDateTime(
        dateTimesHelper.toDateTime(jodaDateTime1.toInstant(), TIME_ZONE_ID1)));
    assertEquals(jodaDateTime2, dateTimesHelper.toDateTime(
        dateTimesHelper.toDateTime(jodaDateTime2.toInstant(), TIME_ZONE_ID2)));
    assertEquals(jodaDateTime3, dateTimesHelper.toDateTime(
        dateTimesHelper.toDateTime(jodaDateTime3.toInstant(), TIME_ZONE_ID3)));
  }

  /**
   * Asserts Joda DateTimes have the same millis.
   */
  private static void assertEquals(DateTime expected, DateTime actual) {
    DateTime expectedCopy = new DateTime(expected).withMillisOfSecond(0);
    DateTime actualCopy = new DateTime(actual).withMillisOfSecond(0);
    Assert.assertEquals(expectedCopy.getMillis(), actualCopy.getMillis());
  }

  /**
   * Asserts Calendars have the same millis and locale (first day of week).
   */
  private static void assertEquals(Calendar expected, Calendar actual) {
    Assert.assertEquals(expected.getTimeInMillis(), actual.getTimeInMillis());
    Assert.assertEquals(expected.getFirstDayOfWeek(), actual.getFirstDayOfWeek());
  }

  /**
   * Asserts that two API date times are equal.
   */
  private static void assertEquals(ApiDateTime expected,
      ApiDateTime actual) {
    boolean equals = expected == actual || new EqualsBuilder()
        .append(expected.getDate().getYear(), actual.getDate().getYear())
        .append(expected.getDate().getMonth(), actual.getDate().getMonth())
        .append(expected.getDate().getDay(), actual.getDate().getDay())
        .append(expected.getHour(), actual.getHour())
        .append(expected.getMinute(), actual.getMinute())
        .append(expected.getSecond(), actual.getSecond())
        .append(
            DateTimeZone.forTimeZone(
                TimeZone.getTimeZone(expected.getTimeZoneID())).toTimeZone().getRawOffset(),
            DateTimeZone.forTimeZone(
                TimeZone.getTimeZone(actual.getTimeZoneID())).toTimeZone().getRawOffset())
        .isEquals();
    Assert.assertTrue(
        String.format("Expected: <%s> Actual: <%s>", toString(expected), toString(actual)),
        equals);
  }

  private static String toString(ApiDateTime apiDateTime) {
    return apiDateTime == null ? "null"
        : new StringBuilder().append("Year (").append(apiDateTime.getDate().getYear()).append(") ")
            .append("Month (").append(apiDateTime.getDate().getMonth()).append(") ")
            .append("Day (").append(apiDateTime.getDate().getDay()).append(") ")
            .append("Hour (").append(apiDateTime.getHour()).append(") ")
            .append("Minute (").append(apiDateTime.getMinute()).append(") ")
            .append("Second (").append(apiDateTime.getSecond()).append(") ")
            .append("TimeZoneID (").append(apiDateTime.getTimeZoneID()).append(") ")
            .toString();
  }

  /**
   * API DateTime class for testing.
   */
  public static class ApiDateTime {

    private String timeZoneID;
    private Integer hour;
    private Integer minute;
    private Integer second;
    private ApiDate date;

    public ApiDateTime() {}

    public String getTimeZoneID() {
      return timeZoneID;
    }

    public void setTimeZoneID(String timeZoneID) {
      this.timeZoneID = timeZoneID;
    }

    public Integer getHour() {
      return hour;
    }

    public void setHour(Integer hour) {
      this.hour = hour;
    }

    public Integer getMinute() {
      return minute;
    }

    public void setMinute(Integer minute) {
      this.minute = minute;
    }

    public Integer getSecond() {
      return second;
    }

    public void setSecond(Integer second) {
      this.second = second;
    }

    public ApiDate getDate() {
      return date;
    }

    public void setDate(ApiDate date) {
      this.date = date;
    }
  }

  /**
   * API Date class for testing.
   */
  public static class ApiDate {

    private Integer day;
    private Integer month;
    private Integer year;

    public ApiDate() {}

    public Integer getDay() {
      return day;
    }

    public void setDay(Integer day) {
      this.day = day;
    }

    public Integer getMonth() {
      return month;
    }

    public void setMonth(Integer month) {
      this.month = month;
    }

    public Integer getYear() {
      return year;
    }

    public void setYear(Integer year) {
      this.year = year;
    }
  }
}
