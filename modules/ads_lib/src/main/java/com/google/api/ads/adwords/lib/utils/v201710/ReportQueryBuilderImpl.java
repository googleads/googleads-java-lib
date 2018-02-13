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

package com.google.api.ads.adwords.lib.utils.v201710;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.api.ads.adwords.lib.jaxb.v201710.ReportDefinitionDateRangeType;
import com.google.api.ads.adwords.lib.jaxb.v201710.ReportDefinitionReportType;
import com.google.api.ads.adwords.lib.utils.QueryBuilder;
import com.google.api.ads.adwords.lib.utils.ReportQueryInterface;
import com.google.api.ads.adwords.lib.utils.ReportQueryInterface.BuilderInterface;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import java.util.List;
import org.joda.time.LocalDate;

/**
 * Builds a {@link ReportQuery} object.
 *
 * <p>This builder is not thread-safe.
 */
class ReportQueryBuilderImpl extends QueryBuilder<ReportQueryBuilderImpl, ReportQueryInterface>
    implements BuilderInterface {

  private static final String DURING_DATE_FORMAT = "yyyyMMdd";

  private final ReportQuery.Builder builder;
  private List<String> fields = Lists.newArrayList();
  private ReportDefinitionReportType from;
  private ReportDefinitionDateRangeType dateRange;
  private LocalDate startDate;
  private LocalDate endDate;

  /** Constructs a new report query builder. */
  ReportQueryBuilderImpl(ReportQuery.Builder builder) {
    super();
    this.builder = builder;
    this.fields = Lists.newArrayList();
    this.from = null;
    this.dateRange = null;
    this.startDate = null;
    this.endDate = null;
  }

  /**
   * Constructs a new report query builder by copying all properties from the passed report query
   * builder.
   *
   * @param builderImpl the report query builder whose properties will be copied to.
   */
  ReportQueryBuilderImpl(ReportQueryBuilderImpl builderImpl) {
    super(builderImpl);
    checkNotNull(builderImpl, "The report query builder cannot be null.");
    this.builder = builderImpl.builder;
    this.fields = Lists.newArrayList(builderImpl.fields);
    this.from = builderImpl.from;
    this.dateRange = builderImpl.dateRange;
    this.startDate = builderImpl.startDate;
    this.endDate = builderImpl.endDate;
  }

  @Override
  public ReportWhereBuilder where(String field) {
    WhereBuilder whereBuilderDelegate = this.new WhereBuilder(field);
    whereBuilders.add(whereBuilderDelegate);
    return new ReportWhereBuilder(whereBuilderDelegate);
  }

  @Override
  public ReportQuery.Builder fields(String... fields) {
    checkNotNull(fields, "Fields to be selected cannot be null.");
    this.fields = Lists.newArrayList(fields);
    return builder;
  }

  @Override
  public ReportQuery.Builder fields(Iterable<String> fields) {
    checkNotNull(fields, "Fields to be selected cannot be null.");
    this.fields = Lists.newArrayList(fields);
    return builder;
  }

  @Override
  public ReportQuery.Builder from(Enum<?> reportType) {
    checkNotNull(reportType, "The report type cannot be null.");
    this.from = (ReportDefinitionReportType) reportType;
    return builder;
  }

  @Override
  public ReportQuery.Builder from(String reportType) {
    return from(ReportDefinitionReportType.fromValue(reportType));
  }

  @Override
  public ReportQuery.Builder during(Enum<?> dateRange) {
    checkNotNull(dateRange, "The date range cannot be null.");
    this.startDate = null;
    this.endDate = null;
    this.dateRange = (ReportDefinitionDateRangeType) dateRange;
    return builder;
  }

  @Override
  public ReportQuery.Builder during(LocalDate startDate, LocalDate endDate) {
    checkNotNull(startDate, "The start date cannot be null.");
    checkNotNull(endDate, "The end date cannot be null.");
    this.dateRange = null;
    this.startDate = startDate;
    this.endDate = endDate;
    return builder;
  }

  @Override
  public ReportQuery build() {
    validate();
    StringBuilder stringBuilder = new StringBuilder();

    // Creates SELECT.
    stringBuilder.append("SELECT ");
    Joiner.on(", ").skipNulls().appendTo(stringBuilder, fields);

    // Creates FROM.
    stringBuilder.append(String.format(" FROM %s", from));

    // Creates WHERE.
    if (!whereBuilders.isEmpty()) {
      stringBuilder.append(
          String.format(" WHERE %s", Joiner.on(" AND ").skipNulls().join(whereBuilders)));
    }

    // Creates DURING.
    if (dateRange != null) {
      stringBuilder.append(String.format(" DURING %s", dateRange));
    } else if (startDate != null && endDate != null) {
      stringBuilder.append(
          String.format(
              " DURING %s,%s",
              startDate.toString(DURING_DATE_FORMAT), endDate.toString(DURING_DATE_FORMAT)));
    }

    return new ReportQuery(stringBuilder.toString());
  }

  private void validate() {
    if (fields.isEmpty()) {
      throw new IllegalStateException("Must use fields() to specify the SELECT clause first.");
    }
    if (from == null) {
      throw new IllegalStateException("Must use from() to specify the FROM clause first.");
    }
  }

  /** Implementation of the report where builder interface. */
  class ReportWhereBuilder implements ReportWhereBuilderInterface<ReportQuery.Builder> {

    private final QueryBuilder<ReportQueryBuilderImpl, ReportQueryInterface>.WhereBuilder
        whereBuilderDelegate;

    /**
     * Construct the WHERE builder with the specified where builder delegate.
     *
     * @param whereBuilderDelegate the where builder delegate
     */
    ReportWhereBuilder(
        QueryBuilder<ReportQueryBuilderImpl, ReportQueryInterface>.WhereBuilder
            whereBuilderDelegate) {
      this.whereBuilderDelegate = whereBuilderDelegate;
    }

    @Override
    public String toString() {
      return whereBuilderDelegate.toString();
    }

    @Override
    public ReportQuery.Builder equalTo(String propertyValue) {
      whereBuilderDelegate.equalTo(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder equalTo(int propertyValue) {
      whereBuilderDelegate.equalTo(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder equalTo(long propertyValue) {
      whereBuilderDelegate.equalTo(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder equalTo(boolean propertyValue) {
      whereBuilderDelegate.equalTo(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder notEqualTo(String propertyValue) {
      whereBuilderDelegate.notEqualTo(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder notEqualTo(int propertyValue) {
      whereBuilderDelegate.notEqualTo(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder notEqualTo(long propertyValue) {
      whereBuilderDelegate.notEqualTo(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder notEqualTo(boolean propertyValue) {
      whereBuilderDelegate.notEqualTo(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder contains(String propertyValue) {
      whereBuilderDelegate.contains(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder containsIgnoreCase(String propertyValue) {
      whereBuilderDelegate.containsIgnoreCase(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder doesNotContain(String propertyValue) {
      whereBuilderDelegate.doesNotContain(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder doesNotContainIgnoreCase(String propertyValue) {
      whereBuilderDelegate.doesNotContainIgnoreCase(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder greaterThan(long propertyValue) {
      whereBuilderDelegate.greaterThan(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder greaterThan(int propertyValue) {
      whereBuilderDelegate.greaterThan(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder greaterThan(double propertyValue) {
      whereBuilderDelegate.greaterThan(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder greaterThanOrEqualTo(long propertyValue) {
      whereBuilderDelegate.greaterThanOrEqualTo(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder greaterThanOrEqualTo(int propertyValue) {
      whereBuilderDelegate.greaterThanOrEqualTo(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder greaterThanOrEqualTo(double propertyValue) {
      whereBuilderDelegate.greaterThanOrEqualTo(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder lessThan(long propertyValue) {
      whereBuilderDelegate.lessThan(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder lessThan(int propertyValue) {
      whereBuilderDelegate.lessThan(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder lessThan(double propertyValue) {
      whereBuilderDelegate.lessThan(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder lessThanOrEqualTo(long propertyValue) {
      whereBuilderDelegate.lessThanOrEqualTo(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder lessThanOrEqualTo(int propertyValue) {
      whereBuilderDelegate.lessThanOrEqualTo(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder lessThanOrEqualTo(double propertyValue) {
      whereBuilderDelegate.lessThanOrEqualTo(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder startsWith(String propertyValue) {
      whereBuilderDelegate.startsWith(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder startsWithIgnoreCase(String propertyValue) {
      whereBuilderDelegate.startsWithIgnoreCase(propertyValue);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder in(String... values) {
      whereBuilderDelegate.in(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder in(int... values) {
      whereBuilderDelegate.in(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder in(long... values) {
      whereBuilderDelegate.in(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder in(double... values) {
      whereBuilderDelegate.in(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder in(boolean... values) {
      whereBuilderDelegate.in(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder notIn(String... values) {
      whereBuilderDelegate.notIn(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder notIn(int... values) {
      whereBuilderDelegate.notIn(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder notIn(long... values) {
      whereBuilderDelegate.notIn(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder notIn(double... values) {
      whereBuilderDelegate.notIn(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder notIn(boolean... values) {
      whereBuilderDelegate.notIn(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder containsAny(String... values) {
      whereBuilderDelegate.containsAny(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder containsAny(int... values) {
      whereBuilderDelegate.containsAny(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder containsAny(long... values) {
      whereBuilderDelegate.containsAny(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder containsAny(double... values) {
      whereBuilderDelegate.containsAny(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder containsAll(String... values) {
      whereBuilderDelegate.containsAll(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder containsAll(int... values) {
      whereBuilderDelegate.containsAll(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder containsAll(long... values) {
      whereBuilderDelegate.containsAll(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder containsAll(double... values) {
      whereBuilderDelegate.containsAll(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder containsNone(String... values) {
      whereBuilderDelegate.containsNone(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder containsNone(int... values) {
      whereBuilderDelegate.containsNone(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder containsNone(long... values) {
      whereBuilderDelegate.containsNone(values);
      return ReportQueryBuilderImpl.this.builder;
    }

    @Override
    public ReportQuery.Builder containsNone(double... values) {
      whereBuilderDelegate.containsNone(values);
      return ReportQueryBuilderImpl.this.builder;
    }
  }
}
