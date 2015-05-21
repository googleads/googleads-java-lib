// Copyright 2014 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.axis.utils.v201409;

import com.google.api.ads.adwords.axis.v201409.cm.DateRange;
import com.google.api.ads.adwords.axis.v201409.cm.OrderBy;
import com.google.api.ads.adwords.axis.v201409.cm.Paging;
import com.google.api.ads.adwords.axis.v201409.cm.Predicate;
import com.google.api.ads.adwords.axis.v201409.cm.PredicateOperator;
import com.google.api.ads.adwords.axis.v201409.cm.Selector;
import com.google.api.ads.adwords.axis.v201409.cm.SortOrder;
import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.common.collect.Sets;

import org.joda.time.DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/**
 * A builder for {@link Selector} objects.
 *
 * This builder is not thread safe.
 *
 * @author Gustavo Moreira
 */
public class SelectorBuilder {

  /**
   * The default date format for the AdWords API
   */
  protected static final String DEFAULT_DATE_FORMAT = "yyyyMMdd";

  /**
   * The default Id property name on all entities
   */
  private static final String ID_PROPERTY = "Id";

  private Set<String> fields = Sets.newLinkedHashSet();
  private Set<OrderBy> ordering = Sets.newLinkedHashSet();
  private Set<Predicate> predicates = Sets.newLinkedHashSet();
  private DateRange dateRange;
  private Paging paging;

  /**
   * Builds a new Selector.
   *
   * <p>When a Selector is built by this method, the state of the builder doesn't change. If you
   * need to clean the builder, the best way to do it, is by creating a new instance.
   *
   * @return the new Selector containing all the configuration that was set previously.
   */
  public Selector build() {
    Selector selectorCopy = new Selector();

    Set<OrderBy> orderingCopy = this.copyOrderingSet();
    Set<Predicate> predicatesCopy = this.copyPredicatesSet();

    selectorCopy.setFields(this.fields.toArray(new String[this.fields.size()]));
    selectorCopy.setOrdering(orderingCopy.toArray(new OrderBy[this.ordering.size()]));
    selectorCopy.setPredicates(predicatesCopy.toArray(new Predicate[this.predicates.size()]));

    if (this.dateRange != null) {
      selectorCopy.setDateRange(new DateRange(this.dateRange.getMin(), this.dateRange.getMax()));
    }
    if (this.paging != null) {
      selectorCopy.setPaging(
          new Paging(this.paging.getStartIndex(), this.paging.getNumberResults()));
    }

    return selectorCopy;
  }

  /**
   * Copies the whole set of predicates, by creating new instances of each one in the given set.
   *
   * @return the new set of Predicate objects with different instance for each of the Predicate
   */
  private Set<Predicate> copyPredicatesSet() {
    Set<Predicate> predicatesCopy = Sets.newLinkedHashSet();
    for (Predicate predicate : this.predicates) {
      Predicate copyPredicate = new Predicate();
      copyPredicate.setField(predicate.getField());
      copyPredicate.setOperator(predicate.getOperator());
      copyPredicate.setValues(Arrays.copyOf(predicate.getValues(), predicate.getValues().length));
      predicatesCopy.add(copyPredicate);
    }
    return predicatesCopy;
  }

  /**
   * Copies the whole set of OrderBy objects, by creating new instances of each one in the given
   * set.
   *
   * @return the new set of OrderBy objects with different instance for each of the OrderBy
   */
  private Set<OrderBy> copyOrderingSet() {
    Set<OrderBy> orderingCopy = Sets.newLinkedHashSet();
    for (OrderBy order : this.ordering) {
      OrderBy copyOrder = new OrderBy();
      copyOrder.setField(order.getField());
      copyOrder.setSortOrder(order.getSortOrder());
      orderingCopy.add(copyOrder);
    }
    return orderingCopy;
  }

  /**
   * Chooses the set of fields that will be selected via the API.
   *
   * <p>Calling this method multiple times will overwrite the previous fields that were set.
   *
   * @param fields the set of fields of the given entity.
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder fields(String... fields) {
    this.fields = Sets.newLinkedHashSet();
    Collections.addAll(this.fields, fields);
    return this;
  }

  /**
   * Chooses the set of fields that will be selected via the API.
   *
   * <p>Calling this method multiple times will overwrite the previous fields that were set.
   *
   * @param fields the set of fields of the given entity as Java Enums.
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder fields(EntityField... fields) {
    return fields(this.enumFieldsToNames(fields));
  }

  /**
   * Returns the array of Strings resulting from calling {@code name()} on each field.
   * 
   * @param fields the array of fields as Java Enums.
   */
  private String[] enumFieldsToNames(EntityField... fields) {
    String[] fieldsNames = new String[fields.length];
    for (int i = 0; i < fields.length; i++) {
      fieldsNames[i] = fields[i].name();
    }
    return fieldsNames;
  }

  /**
   * Adds the given amount to the current offset.
   *
   * @param additionalOffset the amount that will be added to the offset
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder increaseOffsetBy(int additionalOffset) {
    if (this.paging == null) {
      this.paging = new Paging();
    }
    Integer startIndex = paging.getStartIndex();
    if (startIndex == null) {
      startIndex = 0;
    }
    this.paging.setStartIndex(startIndex + additionalOffset);
    return this;
  }

  /**
   * Sets the limit amount of results that will be brought back. Calling this method overrides the
   * previous limit value.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder limit(int limit) {
    if (this.paging == null) {
      this.paging = new Paging();
    }
    this.paging.setNumberResults(limit);
    return this;
  }

  /**
   * Sets the offset for the start point of the query. Calling this method overrides the previous
   * offset value.
   *
   * @param offset the offset
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder offset(int offset) {
    if (this.paging == null) {
      this.paging = new Paging();
    }
    this.paging.setStartIndex(offset);
    return this;
  }

  /**
   * Removes the offset and limit information from the selector.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder removeLimitAndOffset() {
    this.paging = null;
    return this;
  }

  /**
   * Adds the order by the given field, on ASCENDING sort.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder orderAscBy(String field) {
    OrderBy orderBy = new OrderBy();
    orderBy.setField(field);
    orderBy.setSortOrder(SortOrder.ASCENDING);

    this.ordering.add(orderBy);

    return this;
  }

  /**
   * Adds the order by the given field, on ASCENDING sort.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder orderAscBy(EntityField field) {
    return this.orderAscBy(field.name());
  }

  /**
   * Adds the order by the given field, on DESCENDING sort.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder orderDescBy(String field) {
    OrderBy orderBy = new OrderBy();
    orderBy.setField(field);
    orderBy.setSortOrder(SortOrder.DESCENDING);

    this.ordering.add(orderBy);

    return this;
  }

  /**
   * Adds the order by the given field, on DESCENDING sort.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder orderDescBy(EntityField field) {
    return this.orderDescBy(field.name());
  }

  /**
   * Removes the order that is associated with the given field.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder removeOrderBy(String field) {
    Iterator<OrderBy> iterator = this.ordering.iterator();
    while (iterator.hasNext()) {
      OrderBy order = iterator.next();
      if (order.getField().equals(field)) {
        iterator.remove();
      }
    }

    return this;
  }

  /**
   * Removes the order that is associated with the given field.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder removeOrderBy(EntityField field) {
    return this.removeOrderBy(field.name());
  }

  /**
   * Restricts the Selector by the date range.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder forDateRange(DateTime start, DateTime end) {
    if (this.dateRange == null) {
      this.dateRange = new DateRange();
    }
    DateFormat dateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
    if (start != null) {
      this.dateRange.setMin(dateFormat.format(start.toDate()));
    }
    if (end != null) {
      this.dateRange.setMax(dateFormat.format(end.toDate()));
    }
    return this;
  }

  /**
   * Adds the predicate <b>equals</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder equals(String field, String propertyValue) {
    return this.singleValuePredicate(field, propertyValue, PredicateOperator.EQUALS);
  }

  /**
   * Adds the predicate <b>equals</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder equals(EntityField field, String propertyValue) {
    return this.equals(field.name(), propertyValue);
  }

  /**
   * Adds the predicate <b>not equals</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder notEquals(String field, String propertyValue) {
    return this.singleValuePredicate(field, propertyValue, PredicateOperator.NOT_EQUALS);
  }

  /**
   * Adds the predicate <b>not equals</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder notEquals(EntityField field, String propertyValue) {
    return this.notEquals(field.name(), propertyValue);
  }

  /**
   * Adds the predicate <b>contains</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder contains(String field, String propertyValue) {
    return this.singleValuePredicate(field, propertyValue, PredicateOperator.CONTAINS);
  }

  /**
   * Adds the predicate <b>contains</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder contains(EntityField field, String propertyValue) {
    return this.contains(field.name(), propertyValue);
  }

  /**
   * Adds the predicate <b>contains ignore case</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder containsIgnoreCase(String field, String propertyValue) {
    return this.singleValuePredicate(field, propertyValue, PredicateOperator.CONTAINS_IGNORE_CASE);
  }

  /**
   * Adds the predicate <b>contains ignore case</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder containsIgnoreCase(EntityField field, String propertyValue) {
    return this.containsIgnoreCase(field.name(), propertyValue);
  }

  /**
   * Adds the predicate <b>does not contain</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder doesNotContain(String field, String propertyValue) {
    return this.singleValuePredicate(field, propertyValue, PredicateOperator.DOES_NOT_CONTAIN);
  }

  /**
   * Adds the predicate <b>does not contain</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder doesNotContain(EntityField field, String propertyValue) {
    return this.doesNotContain(field.name(), propertyValue);
  }

  /**
   * Adds the predicate <b>does not contain ignore case</b> to the selector for the given field and
   * value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder doesNotContainIgnoreCase(String field, String propertyValue) {
    return this.singleValuePredicate(field, propertyValue,
        PredicateOperator.DOES_NOT_CONTAIN_IGNORE_CASE);
  }

  /**
   * Adds the predicate <b>does not contain ignore case</b> to the selector for the given field and
   * value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder doesNotContainIgnoreCase(EntityField field, String propertyValue) {
    return this.doesNotContainIgnoreCase(field.name(), propertyValue);
  }

  /**
   * Adds the predicate <b>greater than</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder greaterThan(String field, long propertyValue) {
    return this.singleValuePredicate(field, Long.toString(propertyValue),
        PredicateOperator.GREATER_THAN);
  }

  /**
   * Adds the predicate <b>greater than</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder greaterThan(EntityField field, long propertyValue) {
    return this.greaterThan(field.name(), propertyValue);
  }

  /**
   * Adds the predicate <b>greater than equals</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder greaterThanEquals(String field, long propertyValue) {
    return this.singleValuePredicate(field, Long.toString(propertyValue),
        PredicateOperator.GREATER_THAN_EQUALS);
  }

  /**
   * Adds the predicate <b>greater than equals</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder greaterThanEquals(EntityField field, long propertyValue) {
    return this.greaterThanEquals(field.name(), propertyValue);
  }

  /**
   * Adds the predicate <b>less than</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder lessThan(String field, long propertyValue) {
    return this.singleValuePredicate(field, Long.toString(propertyValue),
        PredicateOperator.LESS_THAN);
  }

  /**
   * Adds the predicate <b>less than</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder lessThan(EntityField field, long propertyValue) {
    return this.lessThan(field.name(), propertyValue);
  }

  /**
   * Adds the predicate <b>less than equals</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder lessThanEquals(String field, long propertyValue) {
    return this.singleValuePredicate(field, Long.toString(propertyValue),
        PredicateOperator.LESS_THAN_EQUALS);
  }

  /**
   * Adds the predicate <b>less than equals</b> to the selector for the given field and value.
   *
   * @param propertyValue the property value as a String independently of the field type. The caller
   *        should take care of the formatting if it is necessary
   */
  public SelectorBuilder lessThanEquals(EntityField field, long propertyValue) {
    return this.lessThanEquals(field.name(), propertyValue);
  }

  /**
   * Selects the specified field
   *
   * @param propertyValue the value of the property
   * @return the builder itself to proceed the chain.
   */
  private SelectorBuilder singleValuePredicate(
      String field, String propertyValue, PredicateOperator operator) {
    Predicate predicate = new Predicate();
    predicate.setField(field);
    predicate.setOperator(operator);

    String[] values = new String[1];
    values[0] = propertyValue;
    predicate.setValues(values);

    this.predicates.add(predicate);

    return this;
  }

  /**
   * Adds the predicate <b>equals</b> to the selector for the entity Id and the given id value.
   *
   * @param id the ID of the current entity. This field represents different values for different
   *        entity types
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder equalsId(Long id) {
    return this.singleValuePredicate(ID_PROPERTY, id.toString(), PredicateOperator.EQUALS);
  }

  /**
   * Adds the predicate <b>in</b> to the selector for the given field and set of values.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder in(String field, String... values) {
    return this.multipleValuePredicate(field, values, PredicateOperator.IN);
  }

  /**
   * Adds the predicate <b>in</b> to the selector for the given field and set of values.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder in(EntityField field, String... values) {
    return this.in(field.name(), values);
  }

  /**
   * Adds the predicate <b>not in</b> to the selector for the given field and set of values.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder notIn(String field, String... values) {
    return this.multipleValuePredicate(field, values, PredicateOperator.NOT_IN);
  }

  /**
   * Adds the predicate <b>not in</b> to the selector for the given field and set of values.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder notIn(EntityField field, String... values) {
    return this.notIn(field.name(), values);
  }

  /**
   * Adds the predicate <b>contains any</b> to the selector for the given field and value.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder containsAny(String field, String... values) {
    return this.multipleValuePredicate(field, values, PredicateOperator.CONTAINS_ANY);
  }

  /**
   * Adds the predicate <b>contains any</b> to the selector for the given field and value.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder containsAny(EntityField field, String... values) {
    return this.containsAny(field.name(), values);
  }

  /**
   * Adds the predicate <b>contains all</b> to the selector for the given field and value.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder containsAll(String field, String... values) {
    return this.multipleValuePredicate(field, values, PredicateOperator.CONTAINS_ALL);
  }

  /**
   * Adds the predicate <b>contains all</b> to the selector for the given field and value.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder containsAll(EntityField field, String... values) {
    return this.containsAll(field.name(), values);
  }

  /**
   * Adds the predicate <b>contains none</b> to the selector for the given field and value.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder containsNone(String field, String... values) {
    return this.multipleValuePredicate(field, values, PredicateOperator.CONTAINS_NONE);
  }

  /**
   * Adds the predicate <b>contains none</b> to the selector for the given field and value.
   *
   * @return the builder itself to proceed the chain.
   */
  public SelectorBuilder containsNone(EntityField field, String... values) {
    return this.containsNone(field.name(), values);
  }

  /**
   * Selects the specified field.
   *
   * @param propertyValues the values of the properties. The array will be copied to prevent further
   *        modification
   * @return the builder itself to proceed the chain.
   */
  private SelectorBuilder multipleValuePredicate(
      String field, String[] propertyValues, PredicateOperator operator) {
    if (propertyValues == null) {
      return this;
    }

    Predicate predicate = new Predicate();
    predicate.setOperator(operator);
    predicate.setField(field);

    String[] values = Arrays.copyOf(propertyValues, propertyValues.length);

    predicate.setValues(values);

    this.predicates.add(predicate);

    return this;
  }

}
