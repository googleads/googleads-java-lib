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

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.api.ads.adwords.jaxws.v201802.cm.AdGroupBidLandscape;
import com.google.api.ads.adwords.jaxws.v201802.cm.AdGroupBidLandscapePage;
import com.google.api.ads.adwords.jaxws.v201802.cm.CriterionBidLandscape;
import com.google.api.ads.adwords.jaxws.v201802.cm.CriterionBidLandscapePage;
import com.google.api.ads.adwords.jaxws.v201802.cm.Page;
import com.google.api.ads.adwords.jaxws.v201802.cm.SortOrder;
import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.utils.AdWordsInternals;
import com.google.api.ads.adwords.lib.utils.ServiceQueryInterface;
import com.google.api.ads.common.lib.utils.AdsUtilityInvocationHandler;
import com.google.common.base.Objects;
import com.google.common.reflect.Reflection;
import java.lang.reflect.InvocationHandler;
import javax.annotation.Nullable;

/** A service query that embodies AWQL string for making SOAP requests. */
public final class ServiceQuery implements ServiceQueryInterface<Page> {

  private final String partialAwqlQuery;
  private final int pageSize;
  private int startIndex;

  /**
   * Constructs a service query object using the passed partial AWQL query, the start index and the
   * page size.
   *
   * <p>This constructor should be called by {@link Builder} only.
   *
   * @param partialAwqlQuery the partial AWQL query without the LIMIT clause, created by the service
   *     query builder
   * @param startIndex the start index for the LIMIT clause
   * @param pageSize the page size for the LIMIT clause
   */
  ServiceQuery(String partialAwqlQuery, int startIndex, int pageSize) {
    this.partialAwqlQuery = partialAwqlQuery;
    this.startIndex = startIndex;
    this.pageSize = pageSize;
  }

  @Override
  public ServiceQuery nextPage(@Nullable Page page) {
    return (page == null) ? this : nextPage(this.pageSize);
  }

  /**
   * Sets the LIMIT clause of the AWQL to the next page calculated by using the total number of
   * landscape points in {@link AdGroupBidLandscapePage}. If {@code page} is null, this will not
   * change the LIMIT clause.
   *
   * <p>This method is meant to be used with {@code hasNext()}. The {@code page} is necessary when
   * using DataService, as its paging mechanism is different from other services. For details, see
   * https://developers.google.com/adwords/api/docs/guides/bid-landscapes#paging_through_results.
   *
   * @param page the ad group bid landscape page whose total number of landscape points will be
   *     used to increment the index in the LIMIT clause
   * @return this service query object
   */
  public ServiceQuery nextPage(@Nullable AdGroupBidLandscapePage page) {
    if (page == null) {
      return this;
    }
    int totalLandscapePointsInPage = 0;
    for (AdGroupBidLandscape adGroupBidLandscape : page.getEntries()) {
      totalLandscapePointsInPage += adGroupBidLandscape.getLandscapePoints().size();
    }
    return nextPage(totalLandscapePointsInPage);
  }

  /**
   * Sets the LIMIT clause of the AWQL to the next page calculated by using the total number of
   * landscape points in {@link CriterionBidLandscapePage}. If {@code page} is null, this will not
   * change the LIMIT clause.
   *
   * <p>This method is meant to be used with {@code hasNext()}. The {@code page} is necessary when
   * using DataService, as its paging mechanism is different from other services. For details, see
   * https://developers.google.com/adwords/api/docs/guides/bid-landscapes#paging_through_results.
   *
   * @param page the criterion bid landscape page whose total number of landscape points will be
   *     used to increment the index in the LIMIT clause
   * @return this service query object
   */
  public ServiceQuery nextPage(@Nullable CriterionBidLandscapePage page) {
    if (page == null) {
      return this;
    }
    int totalLandscapePointsInPage = 0;
    for (CriterionBidLandscape criterionBidLandscape : page.getEntries()) {
      totalLandscapePointsInPage += criterionBidLandscape.getLandscapePoints().size();
    }
    return nextPage(totalLandscapePointsInPage);
  }

  private ServiceQuery nextPage(int pageSize) {
    startIndex = startIndex + pageSize;
    return this;
  }

  @Override
  public boolean hasNext(@Nullable Page page) {
    return (page == null) || startIndex + pageSize < page.getTotalNumEntries();
  }

  /**
   * Checks if there is still an ad group bid landscape page left to query.
   *
   * <p>This method is meant to be used with {@link ServiceQuery#nextPage(AdGroupBidLandscapePage)}.
   * The {@code page} is necessary when using DataService, as its paging mechanism is different from
   * other services. For details, see
   * https://developers.google.com/adwords/api/docs/guides/bid-landscapes#paging_through_results.
   *
   * @param page the ad group bid landscape page whose total number of landscape points will be used
   *     to determine if there is still a page left
   * @return true if there is still a page left
   */
  public boolean hasNext(@Nullable AdGroupBidLandscapePage page) {
    if (page == null) {
      return true;
    }
    int totalLandscapePointsInPage = 0;
    for (AdGroupBidLandscape adGroupBidLandscape : page.getEntries()) {
      totalLandscapePointsInPage += adGroupBidLandscape.getLandscapePoints().size();
    }
    return totalLandscapePointsInPage >= pageSize;
  }

  /**
   * Checks if there is still an criterion bid landscape page left to query.
   *
   * <p>This method is meant to be used with {@link
   * ServiceQuery#nextPage(CriterionBidLandscapePage)}. The {@code page} is necessary when using
   * DataService, as its paging mechanism is different from other services. For details, see
   * https://developers.google.com/adwords/api/docs/guides/bid-landscapes#paging_through_results.
   *
   * @param page the criterion bid landscape page whose total number of landscape points will be
   *     used to determine if there is still a page left
   * @return true if there is still a page left
   */
  public boolean hasNext(@Nullable CriterionBidLandscapePage page) {
    if (page == null) {
      return true;
    }
    int totalLandscapePointsInPage = 0;
    for (CriterionBidLandscape criterionBidLandscape : page.getEntries()) {
      totalLandscapePointsInPage += criterionBidLandscape.getLandscapePoints().size();
    }
    return totalLandscapePointsInPage >= pageSize;
  }

  @Override
  public String toString() {
    return String.format("%s LIMIT %s,%s", partialAwqlQuery, startIndex, pageSize);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof ServiceQuery) {
      ServiceQuery other = (ServiceQuery) obj;
      return Objects.equal(this.partialAwqlQuery, other.partialAwqlQuery);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(partialAwqlQuery);
  }

  /**
   * Builds a {@link ServiceQuery} object.
   *
   * <p>This builder is not thread-safe.
   */
  public static class Builder implements BuilderInterface<Page, SortOrder> {

    /** The proxy whose invocation handler will handle ads utility registration. */
    private final BuilderInterface<Page, SortOrder> proxy;
    /** The underlying proxied BuilderImpl. Required for the copy constructor. */
    private final ServiceQueryBuilderImpl proxiedImpl;

    /** Constructs a new service query builder. */
    @SuppressWarnings("unchecked")
    public Builder() {
      proxiedImpl = new ServiceQueryBuilderImpl(this);
      InvocationHandler invocationHandler =
          new AdsUtilityInvocationHandler(
              proxiedImpl, AdWordsInternals.getInstance().getAdsUtilityRegistry());
      this.proxy = Reflection.newProxy(BuilderInterface.class, invocationHandler);
    }

    /**
     * Constructs a new service query builder by copying all properties from the passed service
     * query builder.
     *
     * @param builderInterface the service query builder whose properties will be copied to.
     */
    @SuppressWarnings("unchecked")
    public Builder(BuilderInterface<Page, SortOrder> builderInterface) {
      checkNotNull(builderInterface, "The service query builder cannot be null.");
      Builder builder = (Builder) builderInterface;
      proxiedImpl = new ServiceQueryBuilderImpl(builder.proxiedImpl);
      InvocationHandler invocationHandler =
          new AdsUtilityInvocationHandler(
              proxiedImpl, AdWordsInternals.getInstance().getAdsUtilityRegistry());
      this.proxy = Reflection.newProxy(BuilderInterface.class, invocationHandler);
    }

    @Override
    @SuppressWarnings("unchecked")
    public ServiceWhereBuilderInterface<Page, SortOrder, Builder> where(EntityField field) {
      return (ServiceWhereBuilderInterface<Page, SortOrder, Builder>) proxy.where(field);
    }

    @Override
    @SuppressWarnings("unchecked")
    public ServiceWhereBuilderInterface<Page, SortOrder, Builder> where(String field) {
      return (ServiceWhereBuilderInterface<Page, SortOrder, Builder>) proxy.where(field);
    }

    @Override
    public Builder fields(EntityField... fields) {
      proxy.fields(fields);
      return this;
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
    public ServiceQuery build() {
      return (ServiceQuery) proxy.build();
    }

    @Override
    public Builder orderBy(EntityField field) {
      proxy.orderBy(field);
      return this;
    }

    @Override
    public Builder orderBy(EntityField field, SortOrder order) {
      proxy.orderBy(field, order);
      return this;
    }

    @Override
    public Builder orderBy(String field) {
      proxy.orderBy(field);
      return this;
    }

    @Override
    public Builder orderBy(String field, SortOrder order) {
      proxy.orderBy(field, order);
      return this;
    }

    @Override
    public Builder limit(int startIndex, int pageSize) {
      proxy.limit(startIndex, pageSize);
      return this;
    }
  }
}
