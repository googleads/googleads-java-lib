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

package com.google.api.ads.adwords.axis.utils.v201802;

import com.google.api.ads.adwords.axis.v201802.cm.DateRange;
import com.google.api.ads.adwords.axis.v201802.cm.OrderBy;
import com.google.api.ads.adwords.axis.v201802.cm.Paging;
import com.google.api.ads.adwords.axis.v201802.cm.Predicate;
import com.google.api.ads.adwords.axis.v201802.cm.PredicateOperator;
import com.google.api.ads.adwords.axis.v201802.cm.Selector;
import com.google.api.ads.adwords.axis.v201802.cm.SortOrder;
import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.utils.SelectorBuilderInterface;
import com.google.common.collect.Sets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import org.joda.time.DateTime;

/**
 * A builder for {@link Selector} objects.
 *
 * This builder is not thread safe.
 */
class SelectorBuilderImpl implements SelectorBuilderInterface<Selector> {

  protected static final String DEFAULT_DATE_FORMAT = "yyyyMMdd";

  private static final String ID_PROPERTY = "Id";

  private Set<String> fields = Sets.newLinkedHashSet();
  private Set<OrderBy> ordering = Sets.newLinkedHashSet();
  private Set<Predicate> predicates = Sets.newLinkedHashSet();
  private DateRange dateRange;
  private Paging paging;

  @Override
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

  @Override
  public SelectorBuilderImpl fields(String... fields) {
    this.fields = Sets.newLinkedHashSet();
    Collections.addAll(this.fields, fields);
    return this;
  }

  @Override
  public SelectorBuilderImpl fields(EntityField... fields) {
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

  @Override
  public SelectorBuilderImpl increaseOffsetBy(int additionalOffset) {
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

  @Override
  public SelectorBuilderImpl limit(int limit) {
    if (this.paging == null) {
      this.paging = new Paging();
    }
    this.paging.setNumberResults(limit);
    return this;
  }

  @Override
  public SelectorBuilderImpl offset(int offset) {
    if (this.paging == null) {
      this.paging = new Paging();
    }
    this.paging.setStartIndex(offset);
    return this;
  }

  @Override
  public SelectorBuilderImpl removeLimitAndOffset() {
    this.paging = null;
    return this;
  }

  @Override
  public SelectorBuilderImpl orderAscBy(String field) {
    OrderBy orderBy = new OrderBy();
    orderBy.setField(field);
    orderBy.setSortOrder(SortOrder.ASCENDING);

    this.ordering.add(orderBy);

    return this;
  }

  @Override
  public SelectorBuilderImpl orderAscBy(EntityField field) {
    return this.orderAscBy(field.name());
  }

  @Override
  public SelectorBuilderImpl orderDescBy(String field) {
    OrderBy orderBy = new OrderBy();
    orderBy.setField(field);
    orderBy.setSortOrder(SortOrder.DESCENDING);

    this.ordering.add(orderBy);

    return this;
  }

  @Override
  public SelectorBuilderImpl orderDescBy(EntityField field) {
    return this.orderDescBy(field.name());
  }

  @Override
  public SelectorBuilderImpl removeOrderBy(String field) {
    Iterator<OrderBy> iterator = this.ordering.iterator();
    while (iterator.hasNext()) {
      OrderBy order = iterator.next();
      if (order.getField().equals(field)) {
        iterator.remove();
      }
    }

    return this;
  }

  @Override
  public SelectorBuilderImpl removeOrderBy(EntityField field) {
    return this.removeOrderBy(field.name());
  }

  @Override
  public SelectorBuilderImpl forDateRange(DateTime start, DateTime end) {
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

  @Override
  public SelectorBuilderImpl equals(String field, String propertyValue) {
    return this.singleValuePredicate(field, propertyValue, PredicateOperator.EQUALS);
  }

  @Override
  public SelectorBuilderImpl equals(EntityField field, String propertyValue) {
    return this.equals(field.name(), propertyValue);
  }

  @Override
  public SelectorBuilderImpl notEquals(String field, String propertyValue) {
    return this.singleValuePredicate(field, propertyValue, PredicateOperator.NOT_EQUALS);
  }

  @Override
  public SelectorBuilderImpl notEquals(EntityField field, String propertyValue) {
    return this.notEquals(field.name(), propertyValue);
  }

  @Override
  public SelectorBuilderImpl contains(String field, String propertyValue) {
    return this.singleValuePredicate(field, propertyValue, PredicateOperator.CONTAINS);
  }

  @Override
  public SelectorBuilderImpl contains(EntityField field, String propertyValue) {
    return this.contains(field.name(), propertyValue);
  }

  @Override
  public SelectorBuilderImpl containsIgnoreCase(String field, String propertyValue) {
    return this.singleValuePredicate(field, propertyValue, PredicateOperator.CONTAINS_IGNORE_CASE);
  }

  @Override
  public SelectorBuilderImpl containsIgnoreCase(EntityField field, String propertyValue) {
    return this.containsIgnoreCase(field.name(), propertyValue);
  }

  @Override
  public SelectorBuilderImpl doesNotContain(String field, String propertyValue) {
    return this.singleValuePredicate(field, propertyValue, PredicateOperator.DOES_NOT_CONTAIN);
  }

  @Override
  public SelectorBuilderImpl doesNotContain(EntityField field, String propertyValue) {
    return this.doesNotContain(field.name(), propertyValue);
  }

  @Override
  public SelectorBuilderImpl doesNotContainIgnoreCase(String field, String propertyValue) {
    return this.singleValuePredicate(field, propertyValue,
        PredicateOperator.DOES_NOT_CONTAIN_IGNORE_CASE);
  }

  @Override
  public SelectorBuilderImpl doesNotContainIgnoreCase(EntityField field, String propertyValue) {
    return this.doesNotContainIgnoreCase(field.name(), propertyValue);
  }

  @Override
  public SelectorBuilderImpl greaterThan(String field, long propertyValue) {
    return this.singleValuePredicate(field, Long.toString(propertyValue),
        PredicateOperator.GREATER_THAN);
  }

  @Override
  public SelectorBuilderImpl greaterThan(EntityField field, long propertyValue) {
    return this.greaterThan(field.name(), propertyValue);
  }

  @Override
  public SelectorBuilderImpl greaterThanEquals(String field, long propertyValue) {
    return this.singleValuePredicate(field, Long.toString(propertyValue),
        PredicateOperator.GREATER_THAN_EQUALS);
  }

  @Override
  public SelectorBuilderImpl greaterThanEquals(EntityField field, long propertyValue) {
    return this.greaterThanEquals(field.name(), propertyValue);
  }

  @Override
  public SelectorBuilderImpl lessThan(String field, long propertyValue) {
    return this.singleValuePredicate(field, Long.toString(propertyValue),
        PredicateOperator.LESS_THAN);
  }

  @Override
  public SelectorBuilderImpl lessThan(EntityField field, long propertyValue) {
    return this.lessThan(field.name(), propertyValue);
  }

  @Override
  public SelectorBuilderImpl lessThanEquals(String field, long propertyValue) {
    return this.singleValuePredicate(field, Long.toString(propertyValue),
        PredicateOperator.LESS_THAN_EQUALS);
  }

  @Override
  public SelectorBuilderImpl lessThanEquals(EntityField field, long propertyValue) {
    return this.lessThanEquals(field.name(), propertyValue);
  }

  /**
   * Adds a predicate for the specified field, property value, and operator.
   */
  private SelectorBuilderImpl singleValuePredicate(String field, String propertyValue,
      PredicateOperator operator) {
    Predicate predicate = new Predicate();
    predicate.setField(field);
    predicate.setOperator(operator);

    String[] values = new String[1];
    values[0] = propertyValue;
    predicate.setValues(values);

    this.predicates.add(predicate);

    return this;
  }

  @Override
  public SelectorBuilderImpl equalsId(Long id) {
    return this.singleValuePredicate(ID_PROPERTY, id.toString(), PredicateOperator.EQUALS);
  }

  @Override
  public SelectorBuilderImpl in(String field, String... values) {
    return this.multipleValuePredicate(field, values, PredicateOperator.IN);
  }

  @Override
  public SelectorBuilderImpl in(EntityField field, String... values) {
    return this.in(field.name(), values);
  }

  @Override
  public SelectorBuilderImpl notIn(String field, String... values) {
    return this.multipleValuePredicate(field, values, PredicateOperator.NOT_IN);
  }

  @Override
  public SelectorBuilderImpl notIn(EntityField field, String... values) {
    return this.notIn(field.name(), values);
  }

  @Override
  public SelectorBuilderImpl containsAny(String field, String... values) {
    return this.multipleValuePredicate(field, values, PredicateOperator.CONTAINS_ANY);
  }

  @Override
  public SelectorBuilderImpl containsAny(EntityField field, String... values) {
    return this.containsAny(field.name(), values);
  }

  @Override
  public SelectorBuilderImpl containsAll(String field, String... values) {
    return this.multipleValuePredicate(field, values, PredicateOperator.CONTAINS_ALL);
  }

  @Override
  public SelectorBuilderImpl containsAll(EntityField field, String... values) {
    return this.containsAll(field.name(), values);
  }

  @Override
  public SelectorBuilderImpl containsNone(String field, String... values) {
    return this.multipleValuePredicate(field, values, PredicateOperator.CONTAINS_NONE);
  }

  @Override
  public SelectorBuilderImpl containsNone(EntityField field, String... values) {
    return this.containsNone(field.name(), values);
  }

  /**
   * Adds a predicate for the specified field, property values, and operator.
   */
  private SelectorBuilderImpl multipleValuePredicate(String field, String[] propertyValues,
      PredicateOperator operator) {
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
