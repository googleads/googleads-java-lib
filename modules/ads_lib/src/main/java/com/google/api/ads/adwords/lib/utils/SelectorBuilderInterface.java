// Copyright 2016 Google Inc. All Rights Reserved.
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

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.common.lib.utils.AdsUtility;
import com.google.api.ads.common.lib.utils.UsesAdsUtilities;

import org.joda.time.DateTime;

/**
 * A builder for {@code Selector} objects.
 */
public interface SelectorBuilderInterface<SelectorT> {

  /**
   * Builds a new Selector.
   *
   * <p>When a Selector is built by this method, the state of the builder doesn't change. If you
   * need to clean the builder, the best way to do it, is by creating a new instance.
   *
   * @return the new Selector containing all the configuration that was set previously.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorT build();

  /**
   * Chooses the set of fields that will be selected via the API.
   *
   * <p>Calling this method multiple times will overwrite the previous fields that were set.
   *
   * @param fields the set of fields of the given entity.
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> fields(String... fields);

  /**
   * Chooses the set of fields that will be selected via the API.
   *
   * <p>Calling this method multiple times will overwrite the previous fields that were set.
   *
   * @param fields the set of fields of the given entity as Java Enums.
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> fields(EntityField... fields);

  /**
   * Adds the given amount to the current offset.
   *
   * @param additionalOffset the amount that will be added to the offset
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> increaseOffsetBy(int additionalOffset);

  /**
   * Sets the limit amount of results that will be brought back. Calling this method overrides the
   * previous limit value.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> limit(int limit);

  /**
   * Sets the offset for the start point of the query. Calling this method overrides the previous
   * offset value.
   *
   * @param offset the offset
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> offset(int offset);

  /**
   * Removes the offset and limit information from the selector.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> removeLimitAndOffset();

  /**
   * Adds the order by the given field, on ASCENDING sort.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> orderAscBy(String field);

  /**
   * Adds the order by the given field, on ASCENDING sort.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> orderAscBy(EntityField field);

  /**
   * Adds the order by the given field, on DESCENDING sort.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> orderDescBy(String field);

  /**
   * Adds the order by the given field, on DESCENDING sort.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> orderDescBy(EntityField field);

  /**
   * Removes the order that is associated with the given field.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> removeOrderBy(String field);

  /**
   * Removes the order that is associated with the given field.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> removeOrderBy(EntityField field);

  /**
   * Restricts the Selector by the date range.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> forDateRange(DateTime start, DateTime end);

  /**
   * Adds the predicate <b>equals</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> equals(String field, String propertyValue);

  /**
   * Adds the predicate <b>equals</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> equals(EntityField field, String propertyValue);

  /**
   * Adds the predicate <b>not equals</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> notEquals(String field, String propertyValue);

  /**
   * Adds the predicate <b>not equals</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> notEquals(EntityField field, String propertyValue);

  /**
   * Adds the predicate <b>contains</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> contains(String field, String propertyValue);

  /**
   * Adds the predicate <b>contains</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> contains(EntityField field, String propertyValue);

  /**
   * Adds the predicate <b>contains ignore case</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> containsIgnoreCase(String field, String propertyValue);

  /**
   * Adds the predicate <b>contains ignore case</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> containsIgnoreCase(EntityField field, String propertyValue);

  /**
   * Adds the predicate <b>does not contain</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> doesNotContain(String field, String propertyValue);

  /**
   * Adds the predicate <b>does not contain</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> doesNotContain(EntityField field, String propertyValue);

  /**
   * Adds the predicate <b>does not contain ignore case</b> to the selector for the given field and
   * value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> doesNotContainIgnoreCase(String field, String propertyValue);

  /**
   * Adds the predicate <b>does not contain ignore case</b> to the selector for the given field and
   * value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   * should take care of the formatting if it is necessary
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> doesNotContainIgnoreCase(
      EntityField field, String propertyValue);

  /**
   * Adds the predicate <b>greater than</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> greaterThan(String field, long propertyValue);

  /**
   * Adds the predicate <b>greater than</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  SelectorBuilderInterface<SelectorT> greaterThan(EntityField field, long propertyValue);

  /**
   * Adds the predicate <b>greater than equals</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> greaterThanEquals(String field, long propertyValue);

  /**
   * Adds the predicate <b>greater than equals</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> greaterThanEquals(EntityField field, long propertyValue);

  /**
   * Adds the predicate <b>less than</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> lessThan(String field, long propertyValue);

  /**
   * Adds the predicate <b>less than</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> lessThan(EntityField field, long propertyValue);

  /**
   * Adds the predicate <b>less than equals</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> lessThanEquals(String field, long propertyValue);

  /**
   * Adds the predicate <b>less than equals</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> lessThanEquals(EntityField field, long propertyValue);

  /**
   * Adds the predicate <b>equals</b> to the selector for the entity Id and the given id value.
   *
   * @param id the ID of the current entity. This field represents different values for different
   *        entity types
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> equalsId(Long id);

  /**
   * Adds the predicate <b>in</b> to the selector for the given field and set of values.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> in(String field, String... values);

  /**
   * Adds the predicate <b>in</b> to the selector for the given field and set of values.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> in(EntityField field, String... values);

  /**
   * Adds the predicate <b>not in</b> to the selector for the given field and set of values.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> notIn(String field, String... values);

  /**
   * Adds the predicate <b>not in</b> to the selector for the given field and set of values.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> notIn(EntityField field, String... values);

  /**
   * Adds the predicate <b>contains any</b> to the selector for the given field and value.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> containsAny(String field, String... values);

  /**
   * Adds the predicate <b>contains any</b> to the selector for the given field and value.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> containsAny(EntityField field, String... values);

  /**
   * Adds the predicate <b>contains all</b> to the selector for the given field and value.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> containsAll(String field, String... values);

  /**
   * Adds the predicate <b>contains all</b> to the selector for the given field and value.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> containsAll(EntityField field, String... values);

  /**
   * Adds the predicate <b>contains none</b> to the selector for the given field and value.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER})
  SelectorBuilderInterface<SelectorT> containsNone(String field, String... values);

  /**
   * Adds the predicate <b>contains none</b> to the selector for the given field and value.
   *
   * @return the builder itself to proceed the chain.
   */
  @UsesAdsUtilities({AdsUtility.SELECTOR_BUILDER, AdsUtility.SELECTOR_FIELD})
  SelectorBuilderInterface<SelectorT> containsNone(EntityField field, String... values);
}
