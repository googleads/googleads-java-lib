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

package com.google.api.ads.adwords.lib.utils;

import com.google.api.ads.common.lib.utils.AdsUtility;
import com.google.api.ads.common.lib.utils.UsesAdsUtilities;
import org.joda.time.LocalDate;

/** An AWQL report query for downloading AdWords API reports. */
public interface ReportQueryInterface {

  /** Builds an AWQL report query. */
  interface BuilderInterface extends QueryBuilderInterface<ReportQueryInterface> {

    @Override
    BuilderInterface fields(String... fields);

    @Override
    BuilderInterface fields(Iterable<String> fields);

    @Override
    ReportWhereBuilderInterface where(String field);

    @UsesAdsUtilities({AdsUtility.REPORT_QUERY_BUILDER})
    @Override
    ReportQueryInterface build();

    /**
     * Specifies a report type to be used as the FROM clause of a report query.
     *
     * @param reportType the report type to be used as the FROM clause
     * @return this builder itself for method chaining
     */
    BuilderInterface from(Enum<?> reportType);

    /**
     * Specifies a report type to be used as the FROM clause of a report query.
     *
     * @param reportType the report type to be used as the FROM clause
     * @return this builder itself for method chaining
     */
    BuilderInterface from(String reportType);

    /**
     * Specifies a date range for the DURING clause of a report query. Calling this method will
     * clear the stored date range and start and end dates.
     *
     * @param dateRange the date range to be used in the DURING clause
     * @return this builder itself for method chaining
     */
    BuilderInterface during(Enum<?> dateRange);

    /**
     * Specifies start and end dates for the DURING clause of a report query. Calling this method
     * will clear the stored date range and start and end dates.
     *
     * @param startDate the start date to be used in the DURING clause
     * @param endDate the end date to be used in the DURING clause
     * @return this builder itself for method chaining
     */
    BuilderInterface during(LocalDate startDate, LocalDate endDate);

    /**
     * A builder for the WHERE clause of queries.
     *
     * <p>This builder is not thread safe.
     *
     * <p>The {@code BuilderT} type parameter lets the methods here return the same type of {@code
     * BuilderInterface} that's returned from its associated {@code BuilderInterface}. For example,
     * we want the same return type from {@code builder.fields("X")} and {@code
     * builder.fields("X").where("Y").equalTo(99)}.
     *
     * @param <BuilderT> the specific type of {@code BuilderInterface} associated with this builder.
     */
    interface ReportWhereBuilderInterface<BuilderT extends BuilderInterface>
        extends QueryBuilderInterface.WhereBuilderInterface<ReportQueryInterface> {

      @Override
      BuilderT equalTo(String propertyValue);

      @Override
      BuilderT equalTo(int propertyValue);

      @Override
      BuilderT equalTo(long propertyValue);

      @Override
      BuilderT equalTo(boolean propertyValue);

      @Override
      BuilderT notEqualTo(String propertyValue);

      @Override
      BuilderT notEqualTo(int propertyValue);

      @Override
      BuilderT notEqualTo(long propertyValue);

      @Override
      BuilderT notEqualTo(boolean propertyValue);

      @Override
      BuilderT contains(String propertyValue);

      @Override
      BuilderT containsIgnoreCase(String propertyValue);

      @Override
      BuilderT doesNotContain(String propertyValue);

      @Override
      BuilderT doesNotContainIgnoreCase(String propertyValue);

      @Override
      BuilderT greaterThan(long propertyValue);

      @Override
      BuilderT greaterThan(int propertyValue);

      @Override
      BuilderT greaterThan(double propertyValue);

      @Override
      BuilderT greaterThanOrEqualTo(long propertyValue);

      @Override
      BuilderT greaterThanOrEqualTo(int propertyValue);

      @Override
      BuilderT greaterThanOrEqualTo(double propertyValue);

      @Override
      BuilderT lessThan(long propertyValue);

      @Override
      BuilderT lessThan(int propertyValue);

      @Override
      BuilderT lessThan(double propertyValue);

      @Override
      BuilderT lessThanOrEqualTo(long propertyValue);

      @Override
      BuilderT lessThanOrEqualTo(int propertyValue);

      @Override
      BuilderT lessThanOrEqualTo(double propertyValue);

      @Override
      BuilderT startsWith(String propertyValue);

      @Override
      BuilderT startsWithIgnoreCase(String propertyValue);

      @Override
      BuilderT in(String... values);

      @Override
      BuilderT in(int... values);

      @Override
      BuilderT in(long... values);

      @Override
      BuilderT in(double... values);

      @Override
      BuilderT in(boolean... values);

      @Override
      BuilderT notIn(String... values);

      @Override
      BuilderT notIn(int... values);

      @Override
      BuilderT notIn(long... values);

      @Override
      BuilderT notIn(double... values);

      @Override
      BuilderT notIn(boolean... values);

      @Override
      BuilderT containsAny(String... values);

      @Override
      BuilderT containsAny(int... values);

      @Override
      BuilderT containsAny(long... values);

      @Override
      BuilderT containsAny(double... values);

      @Override
      BuilderT containsAll(String... values);

      @Override
      BuilderT containsAll(int... values);

      @Override
      BuilderT containsAll(long... values);

      @Override
      BuilderT containsAll(double... values);

      @Override
      BuilderT containsNone(String... values);

      @Override
      BuilderT containsNone(int... values);

      @Override
      BuilderT containsNone(long... values);

      @Override
      BuilderT containsNone(double... values);
    }
  }
}
