// Copyright 2012 Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfp.lib.utils;

import org.apache.commons.beanutils.PropertyUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.format.ISODateTimeFormat;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * A utility class for handling {@code DateTime} objects.
 *
 * @param <T> the {@code DateTime} type
 * @param <D> the {@code Date} type
 */
public class DateTimesHelper<T, D> {

  private static final String DATE_PATTERN = "%04d-%02d-%02d";

  private Class<T> dateTimeClass;
  private Class<D> dateClass;

  /**
   * Constructor.
   *
   * @param dateTimeClass the date time class
   * @param dateClass the date class
   */
  public DateTimesHelper(Class<T> dateTimeClass, Class<D> dateClass) {
    this.dateTimeClass = dateTimeClass;
    this.dateClass = dateClass;
  }

  /**
   * Converts a {@code Calendar} object to an API date time preserving the
   * time zone.
   */
  public T toDateTime(Calendar calendar) {
    return toDateTime(new DateTime(calendar));
  }

  /**
   * Converts an {@code Instant} object to an API date time in the time zone
   * supplied.
   */
  public T toDateTime(Instant instant, String timeZoneId) {
    return toDateTime(
        instant.toDateTime(DateTimeZone.forTimeZone(TimeZone.getTimeZone(timeZoneId))));
  }

  /**
   * Converts a {@code DateTime} object to an API date time preserving the
   * time zone.
   */
  public T toDateTime(DateTime dateTime) {
    try {
      D dateObj = dateClass.newInstance();
      PropertyUtils.setProperty(dateObj, "year", dateTime.getYear());
      PropertyUtils.setProperty(dateObj, "month", dateTime.getMonthOfYear());
      PropertyUtils.setProperty(dateObj, "day", dateTime.getDayOfMonth());

      T dateTimeObj = dateTimeClass.newInstance();
      PropertyUtils.setProperty(dateTimeObj, "date", dateObj);
      PropertyUtils.setProperty(dateTimeObj, "hour", dateTime.getHourOfDay());
      PropertyUtils.setProperty(dateTimeObj, "minute", dateTime.getMinuteOfHour());
      PropertyUtils.setProperty(dateTimeObj, "second", dateTime.getSecondOfMinute());
      PropertyUtils.setProperty(dateTimeObj, "timeZoneID", dateTime.getZone().toTimeZone().getID());

      return dateTimeObj;
    } catch (InstantiationException e) {
      throw new IllegalStateException("Could not instantiate class.", e);
    } catch (IllegalAccessException e) {
      throw new IllegalStateException("Could not instantiate class.", e);
    } catch (InvocationTargetException e) {
      throw new IllegalStateException("Could not set field.", e);
    } catch (NoSuchMethodException e) {
      throw new IllegalStateException("Could not set field.", e);
    }
  }

  /**
   * Converts a string in the form of {@code yyyy-MM-dd'T'HH:mm:ss} to an API
   * date time in the time zone supplied.
   */
  public T toDateTime(String dateTime, String timeZoneId) {
    return toDateTime(ISODateTimeFormat.dateHourMinuteSecond().parseDateTime(dateTime)
        .withZoneRetainFields(DateTimeZone.forTimeZone(TimeZone.getTimeZone(timeZoneId))));
  }

  /**
   * Converts a string in the form of {@code yyyy-MM-dd'T'HH:mm:ss±HH:mm} to an
   * API date time in the time zone supplied.
   */
  public T toDateTimeWithTimeZone(String dateTime) {
    return toDateTime(
        ISODateTimeFormat.dateTimeParser().withOffsetParsed().parseDateTime(dateTime));
  }

  /**
   * Returns string representation of this date.
   *
   * @param date the date to stringify
   * @return a string representation of the {@code Date} in {@code yyyy-MM-dd}
   */
  public String dateToString(D date) {
    try {
      return String.format(DATE_PATTERN, PropertyUtils.getProperty(date, "year"),
          PropertyUtils.getProperty(date, "month"), PropertyUtils.getProperty(date, "day"));
    } catch (IllegalAccessException e) {
      throw new IllegalStateException("Could not access class.", e);
    } catch (InvocationTargetException e) {
      throw new IllegalStateException("Could not get field.", e);
    } catch (NoSuchMethodException e) {
      throw new IllegalStateException("Could not get field.", e);
    }
  }

  /**
   * Converts an API date time to a {@code DateTime} preserving the time zone.
   */
  public DateTime toDateTime(T dateTime) {
    try {
      @SuppressWarnings("unchecked") // Expected class.
      D dateObj = (D) PropertyUtils.getProperty(dateTime, "date");
      return new DateTime(
          (Integer) PropertyUtils.getProperty(dateObj, "year"),
          (Integer) PropertyUtils.getProperty(dateObj, "month"),
          (Integer) PropertyUtils.getProperty(dateObj, "day"),
          (Integer) PropertyUtils.getProperty(dateTime, "hour"),
          (Integer) PropertyUtils.getProperty(dateTime, "minute"),
          (Integer) PropertyUtils.getProperty(dateTime, "second"),
          0,
          DateTimeZone.forTimeZone(
              TimeZone.getTimeZone((String) PropertyUtils.getProperty(dateTime, "timeZoneID"))));
    } catch (IllegalAccessException e) {
      throw new IllegalStateException("Could not access class.", e);
    } catch (InvocationTargetException e) {
      throw new IllegalStateException("Could not get field.", e);
    } catch (NoSuchMethodException e) {
      throw new IllegalStateException("Could not get field.", e);
    }
  }

  /**
   * Gets a calendar for a {@code DateTime} using the default locale,
   * i.e. Locale.getDefault().
   */
  public Calendar toCalendar(T dateTime) {
    return toDateTime(dateTime).toCalendar(Locale.getDefault());
  }

  /**
   * Gets a calendar for a {@code DateTime} in the supplied locale.
   */
  public Calendar toCalendar(T dateTime, Locale locale) {
    return toDateTime(dateTime).toCalendar(locale);
  }

  /**
   * Returns string representation of this date time. The string representation
   * does not include the time zone since using date times for filtering
   * does not use the time zone. If you need to convert the date time
   * into another time zone before filtering on it, please use
   * {@link #toStringForTimeZone(Object, String)} instead.
   *
   * @param dateTime the date time to stringify
   * @return a string representation of the {@code DateTime} in
   *          {@code yyyy-MM-dd'T'HH:mm:ss}
   */
  public String toString(T dateTime) {
    return toDateTime(dateTime).toString(ISODateTimeFormat.dateHourMinuteSecond());
  }

  /**
   * Returns string representation of this date time with time zone. If you need
   * to convert the date time into another time zone before filtering on it,
   * please use {@link #toStringForTimeZone(Object, String)} instead.
   *
   * @param dateTime the date time to stringify
   * @return a string representation of the {@code DateTime} in
   *          {@code yyyy-MM-dd'T'HH:mm:ss±HH:mm}, i.e.
   *          {@code 2013-09-013T12:02:03+08:00}
   */
  public String toStringWithTimeZone(T dateTime) {
    return toDateTime(dateTime).toString(ISODateTimeFormat.dateTimeNoMillis());
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
   * {@link DateTime#withZone(org.joda.time.DateTimeZone)}.
   *
   * @param dateTime the date time to stringify into a new time zone
   * @param newZoneID the time zone ID of the new zone
   * @return a string representation of the {@code DateTime} in
   *          {@code yyyy-MM-dd'T'HH:mm:ss}
   */
  public String toStringForTimeZone(T dateTime, String newZoneID) {
    return toDateTime(dateTime)
        .withZone(DateTimeZone.forTimeZone(TimeZone.getTimeZone(newZoneID)))
        .toString(ISODateTimeFormat.dateHourMinuteSecond());
  }
}
