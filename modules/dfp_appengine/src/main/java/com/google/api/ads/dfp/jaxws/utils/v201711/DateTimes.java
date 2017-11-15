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

import com.google.api.ads.dfp.jaxws.v201711.Date;
import com.google.api.ads.dfp.jaxws.v201711.DateTime;
import com.google.api.ads.dfp.lib.utils.DateTimesHelper;
import java.util.Calendar;
import java.util.Locale;
import org.joda.time.Instant;

/**
 * A utility class for handling {@link DateTime} objects.
 */
public final class DateTimes {

  private static final DateTimesHelper<DateTime, Date> dateTimesHelper =
      new DateTimesHelper<DateTime, Date>(DateTime.class, Date.class);

  /**
   * DateTimes is not meant to be instantiated.
   */
  private DateTimes() {}

  /**
   * Converts a {@code Calendar} object to an API date time preserving the
   * time zone.
   */
  public static DateTime toDateTime(Calendar calendar) {
    return dateTimesHelper.toDateTime(calendar);
  }

  /**
   * Converts an {@code Instant} object to an API date time in the time zone
   * supplied.
   */
  public static DateTime toDateTime(Instant instant, String timeZoneId) {
    return dateTimesHelper.toDateTime(instant, timeZoneId);
  }

  /**
   * Converts a {@code DateTime} object to an API date time preserving the
   * time zone.
   */
  public static DateTime toDateTime(org.joda.time.DateTime dateTime) {
    return dateTimesHelper.toDateTime(dateTime);
  }

  /**
   * Converts a string in the form of {@code yyyy-MM-dd'T'HH:mm:ss} to an API
   * date time in the time zone supplied.
   */
  public static DateTime toDateTime(String dateTime, String timeZoneId) {
    return dateTimesHelper.toDateTime(dateTime, timeZoneId);
  }

  /**
   * Converts a string in the form of {@code yyyy-MM-dd'T'HH:mm:ss±HH:mm}, or
   * {@code yyyy-MM-dd'T'HH:mm:ssZ} for Etc/GMT, to an
   * API date time in the time zone supplied.
   */
  public static DateTime toDateTimeWithTimeZone(String dateTime) {
    return dateTimesHelper.toDateTimeWithTimeZone(dateTime);
  }

  /**
   * Converts an API date time to a {@code DateTime} preserving the time zone.
   */
  public static org.joda.time.DateTime toDateTime(DateTime dateTime) {
    return dateTimesHelper.toDateTime(dateTime);
  }

  /**
   * Gets a calendar for a {@code DateTime} using the default locale,
   * i.e. Locale.getDefault().
   */
  public static Calendar toCalendar(DateTime dateTime) {
    return dateTimesHelper.toCalendar(dateTime);
  }

  /**
   * Gets a calendar for a {@code DateTime} in the supplied locale.
   */
  public static Calendar toCalendar(DateTime dateTime, Locale locale) {
    return dateTimesHelper.toCalendar(dateTime, locale);
  }

  /**
   * Returns string representation of this date.
   *
   * @param date the date to stringify
   * @return a string representation of the {@code Date} in {@code yyyy-MM-dd}
   */
  public static String toString(Date date) {
    return dateTimesHelper.dateToString(date);
  }

  /**
   * Returns string representation of this date time. The string representation
   * does not include the time zone since using date times for filtering
   * does not use the time zone. If you need to convert the date time
   * into another time zone before filtering on it, please use
   * {@link #toStringForTimeZone(DateTime, String)} instead.
   *
   * @param dateTime the date time to stringify
   * @return a string representation of the {@code DateTime} in
   *          {@code yyyy-MM-dd'T'HH:mm:ss}
   */
  public static String toString(DateTime dateTime) {
    return dateTimesHelper.toString(dateTime);
  }

  /**
   * Returns string representation of this date time with time zone. If you need
   * to convert the date time into another time zone before filtering on it,
   * please use {@link #toStringForTimeZone(DateTime, String)} instead.
   *
   * @param dateTime the date time to stringify
   * @return a string representation of the {@code DateTime} in
   *          {@code yyyy-MM-dd'T'HH:mm:ss±HH:mm}, i.e.
   *          {@code 2013-09-013T12:02:03+08:00} or
   *          {@code 2013-09-013T12:02:03Z} for Etc/GMT.
   */
  public static String toStringWithTimeZone(DateTime dateTime) {
    return dateTimesHelper.toStringWithTimeZone(dateTime);
  }

  /**
   * Returns string representation of this date time with a different time
   * zone, preserving the millisecond instant.
   * <p>This method is useful for finding the local time in another time zone,
   * especially for filtering.
   * <p>For example, if this date time holds 12:30 in Europe/London, the result
   * from this method with Europe/Paris would be 13:30. You may also want to use
   * this with your network's time zone, i.e.
   * <pre><code> String timeZoneId = networkService.getCurrentNetwork().getTimeZone();
   * String statementPart =
   *     "startDateTime > "
   *         + DateTimes.toString(apiDateTime, timeZoneId);
   * //...
   * statementBuilder.where(statementPart);
   * </code></pre>
   * This method is in the same style of
   * {@link org.joda.time.DateTime#withZone(org.joda.time.DateTimeZone)}.
   *
   * @param dateTime the date time to stringify into a new time zone
   * @param newZoneId the time zone ID of the new zone
   * @return a string representation of the {@code DateTime} in
   *          {@code yyyy-MM-dd'T'HH:mm:ss}
   */
  public static String toStringForTimeZone(DateTime dateTime, String newZoneId) {
    return dateTimesHelper.toStringForTimeZone(dateTime, newZoneId);
  }
}
