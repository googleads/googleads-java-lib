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

import com.google.api.ads.adwords.lib.utils.AdWordsInternals;
import com.google.api.ads.adwords.lib.utils.ReportQueryInterface;
import com.google.api.ads.common.lib.utils.AdsUtilityInvocationHandler;
import com.google.common.base.Objects;
import com.google.common.reflect.Reflection;
import java.lang.reflect.InvocationHandler;
import org.joda.time.LocalDate;

/** A report query that embodies AWQL string for making reporting requests. */
public class ReportQuery implements ReportQueryInterface {

  private final String awqlQuery;

  /**
   * Constructs a report query object from the passed AWQL query.
   *
   * <p>This constructor should be called by {@link Builder} only.
   *
   * @param awqlQuery the AWQL query created by the report query builder
   */
  ReportQuery(String awqlQuery) {
    this.awqlQuery = awqlQuery;
  }

  @Override
  public String toString() {
    return awqlQuery;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof ReportQuery) {
      ReportQuery other = (ReportQuery) obj;
      return Objects.equal(this.awqlQuery, other.awqlQuery);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(awqlQuery);
  }

  /**
   * Builds a {@link ReportQuery} object.
   *
   * <p>This builder is not thread-safe.
   */
  public static class Builder implements BuilderInterface {
    
    /** The proxy whose invocation handler will handle ads utility registration. */
    private final BuilderInterface proxy;
    /** The underlying proxied BuilderImpl. Required for the copy constructor. */
    private final ReportQueryBuilderImpl proxiedImpl;

    /** Constructs a new report query builder. */
    public Builder() {
      proxiedImpl = new ReportQueryBuilderImpl(this);
      InvocationHandler invocationHandler =
          new AdsUtilityInvocationHandler(
              proxiedImpl, AdWordsInternals.getInstance().getAdsUtilityRegistry());
      this.proxy = Reflection.newProxy(BuilderInterface.class, invocationHandler);
    }

    /**
     * Constructs a new report query builder by copying all properties from the passed report query
     * builder.
     *
     * @param builderInterface the report query builder whose properties will be copied to.
     */
    public Builder(BuilderInterface builderInterface) {
      checkNotNull(builderInterface, "The report query builder cannot be null.");
      Builder builder = (Builder) builderInterface;
      proxiedImpl = new ReportQueryBuilderImpl(builder.proxiedImpl);
      InvocationHandler invocationHandler =
          new AdsUtilityInvocationHandler(
              proxiedImpl, AdWordsInternals.getInstance().getAdsUtilityRegistry());
      this.proxy = Reflection.newProxy(BuilderInterface.class, invocationHandler);
    }

    @Override
    @SuppressWarnings("unchecked")
    public ReportWhereBuilderInterface<Builder> where(String field) {
      return (ReportWhereBuilderInterface<Builder>) proxy.where(field);
    }

    @Override
    public Builder fields(String... fields) {
      proxy.fields(fields);
      return this;
    }

    @Override
    public Builder fields(Iterable<String> fields) {
      proxy.fields(fields);
      return this;
    }

    @Override
    public Builder from(Enum<?> reportType) {
      proxy.from(reportType);
      return this;
    }

    @Override
    public Builder from(String reportType) {
      proxy.from(reportType);
      return this;
    }

    @Override
    public Builder during(Enum<?> dateRange) {
      proxy.during(dateRange);
      return this;
    }

    @Override
    public Builder during(LocalDate startDate, LocalDate endDate) {
      proxy.during(startDate, endDate);
      return this;
    }

    @Override
    public ReportQuery build() {
      return (ReportQuery) proxy.build();
    }
  }
}

