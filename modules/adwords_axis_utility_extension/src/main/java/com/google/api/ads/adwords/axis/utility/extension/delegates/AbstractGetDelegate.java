// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.axis.utility.extension.delegates;

import com.google.api.ads.adwords.axis.utility.extension.util.ListUtil;
import com.google.api.ads.adwords.axis.utility.extension.util.ReflectionUtil;
import com.google.api.ads.adwords.axis.utility.extension.util.SelectorFields;
import com.google.api.ads.adwords.axis.utility.extension.util.SelectorFields.FieldType;
import com.google.api.ads.adwords.axis.utils.v201506.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201506.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

import java.lang.reflect.Array;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Abstract class that encapsulates gets, fields and selectors.
 *
 * @param <T> type of object that the Service works with, for example Campaign, AdGroup, etc.
 * @param <S> the service interface class. This is a class representing a SOAP service.
 *
 * <p>
 * Implementation is not thread-safe,
 * because AdWordsSession and Apache Axis service objects are not thread-safe.
 * </p>
 *
 * @author Julian Toledo
 */
public abstract class AbstractGetDelegate<T, S> extends AbstractBaseDelegate<S> {

  private final Class<T> classT;

  private final String[] fields;

  private String getMethodName = "get";

  /**
   * Constructor without fields, used in services that do not support Generic Selectors.
   *
   * <p>Fields are not necessary for Services that do not use Generic Selectors.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the service
   * @param classT type of object that the Service works with, for example Campaign, AdGroup, etc.
   * @param classS the service interface class for the SOAP service
   */
  protected AbstractGetDelegate(AdWordsSession adWordsSession, Class<T> classT, Class<S> classS) {
    super(adWordsSession, classS);
    this.classT = classT;
    this.fields = null;
  }

  /**
   * Constructor without fields, used in services that do not support Generic Selectors
   * and with custom service.
   * 
   * <p>Fields are not necessary for Services that do not use Generic Selectors.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the service
   * @param classT type of object that the Service works with, for example Campaign, AdGroup, etc.
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  protected AbstractGetDelegate(AdWordsSession adWordsSession, Class<T> classT, S service) {
    super(adWordsSession, service);
    this.classT = classT;
    this.fields = null;
  }

  /**
   * Constructor with fields, used in services that support Generic Selectors.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the service
   * @param classT type of object that the Service works with, for example Campaign, AdGroup, etc.
   * @param classS the service interface class for the SOAP service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  protected AbstractGetDelegate(AdWordsSession adWordsSession, Class<T> classT,
      Class<S> classS, List<? extends FieldType<T>> selectorFields) {
    super(adWordsSession, classS);
    this.classT = classT;
    this.fields = SelectorFields.getFields(selectorFields);
  }

  /**
   * Constructor with fields, used in services that support Generic Selectors.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the service
   * @param classT type of object that the Service works with, for example Campaign, AdGroup, etc.
   * @param service the custom service class for the SOAP service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  protected AbstractGetDelegate(AdWordsSession adWordsSession, Class<T> classT, S service,
      List<? extends FieldType<T>> selectorFields) {
    super(adWordsSession, service);
    this.classT = classT;
    this.fields = SelectorFields.getFields(selectorFields);
  }

  /**
   * Returns the classT type.
   *
   * @return classT type of object that the Service works with, for example Campaign, AdGroup, etc.
   */
  public Class<T> getClassT() {
    return classT;
  }

  /**
   * Returns the name of the "get" method defined in the AdWords Service.
   *
   * @param getMethodName the name of the "get" method defined in the AdWords Service 
   */
  protected void setGetMethodName(String getMethodName) {
    this.getMethodName = getMethodName;
  }

  /**
   * Calls the appropriate Get method declared by the
   * ServiceInterface S.
   * 
   * <p>This method should be overridden by delegates for Services that do not
   * support Generic Selectors.
   *
   * @param selector should be a Generic Selector
   *        (com.google.api.adwords.v201506.cm.Selector) or a specific
   *        Selector appropriate to the ServiceInterface used that does not
   *        support Generic Selectors
   * @return a list of {@code <T>}
   * @throws RemoteException for communication-related exceptions
   */
  public List<T> get(Selector selector) throws RemoteException {    
    // Using reflection to execute Page.getEntries() once
    @SuppressWarnings("unchecked")
    Class<T[]> classArrayT = (Class<T[]>) Array.newInstance(getClassT(), 0).getClass();

    T[] array = classArrayT.cast(ReflectionUtil.invokeCount(
        "getEntries", getPage(selector), selector.getClass(), 1));
    return ListUtil.asList(array);
  }

  /**
   * Calls the appropriate Get method declared by the
   * ServiceInterface S. Gets the full page of elements without
   * calling getEntries.
   *
   * @param selector should be a Generic Selector
   *        (com.google.api.adwords.v201506.cm.Selector) or a specific
   *        Selector appropriate to the ServiceInterface used that does not
   *        support Generic Selectors
   * @return Object, because AdParamPage does not extend Page
   * @throws RemoteException for communication-related exceptions
   */
  protected Object getPage(Selector selector) throws RemoteException {
    // Using reflection to execute getService().get(selector), retrying MAX_RETRY_COUNT times
    return ReflectionUtil.invokeCount(
        getMethodName, getService(), classS, selector, MAX_RETRY_COUNT);
  }

  /**
   * Creates a Generic Selector Builder with all the fields declared in the subClass.
   */
  protected SelectorBuilder createSelectorBuilder() {
    return new SelectorBuilder().fields(fields);
  }

  /**
   * Creates a Generic Selector Builder with all the fields declared in the subClass and
   * adds a Predicate that says that the given field must have one of the given values.
   *
   * @param selectorField  field to be included in the predicate
   * @param fieldValues values for the field
   * @param startIndex index of the first result
   * @param numberResults number of results 
   * @return {@link SelectorBuilder}
   */
  private SelectorBuilder createSelectorBuilder(FieldType<T> selectorField, List<?> fieldValues,
      int startIndex, int numberResults) {

    SelectorBuilder selectorBuilder = createSelectorBuilder()
      .in(selectorField.getField(), ListUtil.asStringArray(fieldValues))
      .offset(startIndex).limit(numberResults);
    return selectorBuilder;
  }

  /**
   * Creates a Generic Selector Builder with all the fields declared in the subClass and
   * adds a Predicate that says that the given field must have one of the given values.
   *
   * @param selectorField  field to be included in the predicate
   * @param fieldValues values for the field
   * @return {@link SelectorBuilder}
   */
  private SelectorBuilder createSelectorBuilder(FieldType<T> selectorField, List<?> fieldValues) {

    SelectorBuilder selectorBuilder = createSelectorBuilder()
      .in(selectorField.getField(), ListUtil.asStringArray(fieldValues));
    return selectorBuilder;
  }

  /**
   * Gets all {@code <T>} objects using a Generic Selector without predicates.
   *
   * @return all the {@code <T>} objects for the ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<T> get() throws RemoteException {
    return get(createSelectorBuilder().build());
  }

  /**
   * Gets all {@code <T>} objects using a Generic Selector with Paging without predicates.
   *
   * @param startIndex index of the first result to retrieve
   * @param numberResults total number of result to retrieve
   * @return all the {@code <T>} objects for the ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<T> get(int startIndex, int numberResults) throws RemoteException {
    SelectorBuilder builder = createSelectorBuilder().offset(startIndex).limit(numberResults);
    return get(builder.build());
  }

  /**
   * Gets a single {@code <T>} object using a Generic Selector with a predicate for one field value,
   * null if the object does not exist and an exception if there are more than one matches.
   *
   * @param selectorField name of the field
   * @param fieldValue value for the field in the predicate
   * @return the first {@code <T>} object matching the fieldValue
   * @throws RemoteException for communication-related exceptions
   */
  protected T getOneByField(FieldType<T> selectorField, Object fieldValue)
      throws RemoteException {
    List<T> list = getByField(selectorField, fieldValue);
    if (!list.isEmpty()) {
      return Iterables.getOnlyElement(list);
    } else {
      return null;
    }
  }

  /**
   * Gets all the {@code <T>} objects using a Generic Selector with a predicate for one field value.
   *
   * @param selectorField name of the field
   * @param fieldValue value for the field in the predicate
   * @return all the {@code <T>} objects matching the fieldValue
   * @throws RemoteException for communication-related exceptions
   */
  protected List<T> getByField(FieldType<T> selectorField, Object fieldValue)
      throws RemoteException {
    return get(createSelectorBuilder(selectorField, ImmutableList.of(fieldValue)).build());
  }

  /**
   * Gets all the {@code <T>} objects using a Generic Selector with a predicate for a list of
   * values.
   *
   * @param selectorField name of the field
   * @param fieldValues list of values for the field in the predicate
   * @return all the {@code <T>} objects matching the fieldValues
   * @throws RemoteException for communication-related exceptions
   */
  protected List<T> getByField(FieldType<T> selectorField, List<Long> fieldValues)
      throws RemoteException {
    return get(createSelectorBuilder(selectorField, fieldValues).build());
  }

  /**
   * Gets all the {@code <T>} objects using a Generic Selector with a single predicate for a list of
   * values using pagination.
   *
   * @param selectorField name of the field
   * @param fieldValue list of values for the field in the predicate
   * @param startIndex index of the first result
   * @param numberResults number of results
   * @return all the {@code <T>} objects matching the fieldValues in the range (startIndex,
   *         numberResults)
   * @throws RemoteException for communication-related exceptions
   */
  protected List<T> getByField(FieldType<T> selectorField, long fieldValue, int startIndex,
      int numberResults) throws RemoteException {
    return get(createSelectorBuilder(
        selectorField, ImmutableList.of(fieldValue), startIndex, numberResults).build());
  }

  /**
   * Gets all the {@code <T>} objects using a Generic Selector with a predicate for a list of values
   * using pagination.
   *
   * @param selectorField name of the field
   * @param fieldValue list of values for the field in the predicate
   * @param startIndex index of the first result
   * @param numberResults number of results
   * @return all the {@code <T>} objects matching the fieldValues in the range (startIndex,
   *         numberResults)
   * @throws RemoteException for communication-related exceptions
   */
  protected List<T> getByField(FieldType<T> selectorField, String fieldValue, int startIndex,
      int numberResults) throws RemoteException {
    return get(createSelectorBuilder(
        selectorField, ImmutableList.of(fieldValue), startIndex, numberResults).build());
  }

  /**
   * Gets all the {@code <T>} objects using a Generic Selector with a containsAny predicate for a
   * list of values.
   *
   * @param selectorField name of the field
   * @param fieldValues list of values for the field in the predicate
   * @return all the {@code <T>} objects matching the fieldValues
   * @throws RemoteException for communication-related exceptions
   */
  protected List<T> getByFieldContainsAny(FieldType<T> selectorField, List<Long> fieldValues)
      throws RemoteException {
    return get(createSelectorBuilder()
      .containsAny(selectorField.getField(), ListUtil.asStringArray(fieldValues)).build());
  }
}
