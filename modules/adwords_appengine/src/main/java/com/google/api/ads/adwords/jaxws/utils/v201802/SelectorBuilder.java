// Copyright 2015 Google Inc. All Rights Reserved.
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

import com.google.api.ads.adwords.jaxws.v201802.cm.Selector;
import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.utils.AdWordsInternals;
import com.google.api.ads.adwords.lib.utils.SelectorBuilderInterface;
import com.google.api.ads.common.lib.utils.AdsUtilityInvocationHandler;
import com.google.common.reflect.Reflection;
import java.lang.reflect.InvocationHandler;
import org.joda.time.DateTime;

/**
 * A builder for {@link Selector} objects.
 *
 * This builder is not thread safe.
 */
public class SelectorBuilder implements SelectorBuilderInterface<Selector> {

  private final SelectorBuilderInterface<Selector> impl;

  @SuppressWarnings("unchecked")
  public SelectorBuilder() {
    InvocationHandler invocationHandler =
        new AdsUtilityInvocationHandler(
            new SelectorBuilderImpl(), AdWordsInternals.getInstance().getAdsUtilityRegistry());
    this.impl = Reflection.newProxy(SelectorBuilderInterface.class, invocationHandler);
  }

  @Override
  public Selector build() {
    return impl.build();
  }

  @Override
  public SelectorBuilder fields(String... fields) {
    impl.fields(fields);
    return this;
  }

  @Override
  public SelectorBuilder fields(EntityField... fields) {
    impl.fields(fields);
    return this;
  }

  @Override
  public SelectorBuilder increaseOffsetBy(int additionalOffset) {
    impl.increaseOffsetBy(additionalOffset);
    return this;
  }

  @Override
  public SelectorBuilder limit(int limit) {
    impl.limit(limit);
    return this;
  }

  @Override
  public SelectorBuilder offset(int offset) {
    impl.offset(offset);
    return this;
  }

  @Override
  public SelectorBuilder removeLimitAndOffset() {
    impl.removeLimitAndOffset();
    return this;
  }

  @Override
  public SelectorBuilder orderAscBy(String field) {
    impl.orderAscBy(field);
    return this;
  }

  @Override
  public SelectorBuilder orderAscBy(EntityField field) {
    impl.orderAscBy(field);
    return this;
  }

  @Override
  public SelectorBuilder orderDescBy(String field) {
    impl.orderDescBy(field);
    return this;
  }

  @Override
  public SelectorBuilder orderDescBy(EntityField field) {
    impl.orderDescBy(field);
    return this;
  }

  @Override
  public SelectorBuilder removeOrderBy(String field) {
    impl.removeOrderBy(field);
    return this;
  }

  @Override
  public SelectorBuilder removeOrderBy(EntityField field) {
    impl.removeOrderBy(field);
    return this;
  }

  @Override
  public SelectorBuilder forDateRange(DateTime start, DateTime end) {
    impl.forDateRange(start, end);
    return this;
  }

  @Override
  public SelectorBuilder equals(String field, String propertyValue) {
    impl.equals(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder equals(EntityField field, String propertyValue) {
    impl.equals(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder notEquals(String field, String propertyValue) {
    impl.notEquals(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder notEquals(EntityField field, String propertyValue) {
    impl.notEquals(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder contains(String field, String propertyValue) {
    impl.contains(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder contains(EntityField field, String propertyValue) {
    impl.contains(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder containsIgnoreCase(String field, String propertyValue) {
    impl.containsIgnoreCase(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder containsIgnoreCase(EntityField field, String propertyValue) {
    impl.containsIgnoreCase(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder doesNotContain(String field, String propertyValue) {
    impl.doesNotContain(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder doesNotContain(EntityField field, String propertyValue) {
    impl.doesNotContain(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder doesNotContainIgnoreCase(String field, String propertyValue) {
    impl.doesNotContainIgnoreCase(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder doesNotContainIgnoreCase(EntityField field, String propertyValue) {
    impl.doesNotContainIgnoreCase(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder greaterThan(String field, long propertyValue) {
    impl.greaterThan(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder greaterThan(EntityField field, long propertyValue) {
    impl.greaterThan(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder greaterThanEquals(String field, long propertyValue) {
    impl.greaterThanEquals(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder greaterThanEquals(EntityField field, long propertyValue) {
    impl.greaterThanEquals(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder lessThan(String field, long propertyValue) {
    impl.lessThan(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder lessThan(EntityField field, long propertyValue) {
    impl.lessThan(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder lessThanEquals(String field, long propertyValue) {
    impl.lessThanEquals(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder lessThanEquals(EntityField field, long propertyValue) {
    impl.lessThanEquals(field, propertyValue);
    return this;
  }

  @Override
  public SelectorBuilder equalsId(Long id) {
    impl.equalsId(id);
    return this;
  }

  @Override
  public SelectorBuilder in(String field, String... values) {
    impl.in(field, values);
    return this;
  }

  @Override
  public SelectorBuilder in(EntityField field, String... values) {
    impl.in(field, values);
    return this;
  }

  @Override
  public SelectorBuilder notIn(String field, String... values) {
    impl.notIn(field, values);
    return this;
  }

  @Override
  public SelectorBuilder notIn(EntityField field, String... values) {
    impl.notIn(field, values);
    return this;
  }

  @Override
  public SelectorBuilder containsAny(String field, String... values) {
    impl.containsAny(field, values);
    return this;
  }

  @Override
  public SelectorBuilder containsAny(EntityField field, String... values) {
    impl.containsAny(field, values);
    return this;
  }

  @Override
  public SelectorBuilder containsAll(String field, String... values) {
    impl.containsAll(field, values);
    return this;
  }

  @Override
  public SelectorBuilder containsAll(EntityField field, String... values) {
    impl.containsAll(field, values);
    return this;
  }

  @Override
  public SelectorBuilder containsNone(String field, String... values) {
    impl.containsNone(field, values);
    return this;
  }

  @Override
  public SelectorBuilder containsNone(EntityField field, String... values) {
    impl.containsNone(field, values);
    return this;
  }
}
