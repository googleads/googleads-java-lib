//Copyright 2012 Google Inc. All Rights Reserved.
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

import com.google.api.ads.adwords.axis.utility.extension.exception.UtilityLibraryException;
import com.google.api.ads.adwords.axis.utility.extension.util.ListUtil;
import com.google.api.ads.adwords.axis.utility.extension.util.ReflectionUtil;
import com.google.api.ads.adwords.axis.utility.extension.util.SelectorFields.FieldType;
import com.google.api.ads.adwords.axis.v201406.cm.ListReturnValue;
import com.google.api.ads.adwords.axis.v201406.cm.Operation;
import com.google.api.ads.adwords.axis.v201406.cm.Operator;
import com.google.api.ads.adwords.axis.v201406.mcm.ManagedCustomerReturnValue;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.ObjectArrays;

import java.lang.reflect.Array;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Abstract class that encapsulates mutates and operations.
 *
 * @param <T> type of object that the Service works with, for example Campaign, AdGroup, etc.
 * @param <OperationT> type of the com.google.api.adwords.v201406.cm.Operation specific for
 *        the object T for example: CampaignOperation, AdGroupOperation, etc.
 * @param <S> the service interface class. This is a class representing a SOAP service.
 *
 * <p>
 * Implementation is not thread-safe,
 * because AdWordsSession and Apache Axis service objects are not thread-safe.
 * </p>
 *
 * @author Julian Toledo
 */
public abstract class AbstractGetMutateDelegate<T, OperationT extends Operation, S>
    extends AbstractGetDelegate<T, S> {

  private final Class<OperationT> classOperationT;

  /**
   * Constructor without fields, used in services that do not support Generic Selectors.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the service
   * @param classT type of object that the Service works with, for example Campaign, AdGroup, etc.
   * @param classOperationT sub-class of the
   *        com.google.api.adwords.v201406.cm.Operation specific for classT
   * @param classS the service interface class for the SOAP service
   */
  protected AbstractGetMutateDelegate(AdWordsSession adWordsSession, Class<T> classT,
      Class<OperationT> classOperationT, Class<S> classS) {
    super(adWordsSession, classT, classS);
    this.classOperationT = classOperationT;
  }

  /**
   * Constructor without fields, used in services that do not support Generic Selectors
   * and with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the service
   * @param classT type of object that the Service works with, for example Campaign, AdGroup, etc.
   * @param classOperationT sub-class of the
   *        com.google.api.adwords.v201406.cm.Operation specific for classT
   * @param service the custom service class for the SOAP service
   */
  protected AbstractGetMutateDelegate(AdWordsSession adWordsSession, Class<T> classT,
      Class<OperationT> classOperationT, S service) {
    super(adWordsSession, classT, service);
    this.classOperationT = classOperationT;
  }

  /**
   * Constructor with fields, used in services that support Generic Selectors.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   * @param classT type of object that the Service works with, for example Campaign, AdGroup, etc.
   * @param classOperationT sub-class of the
   *        com.google.api.adwords.v201406.cm.Operation specific for classT
   * @param classS the service interface class for the SOAP service
   */
  protected AbstractGetMutateDelegate(AdWordsSession adWordsSession,
      List<? extends FieldType<T>> selectorFields,
      Class<T> classT, Class<OperationT> classOperationT, Class<S> classS) {
    super(adWordsSession, classT, classS, selectorFields);
    this.classOperationT = classOperationT;
  }

  /**
   * Constructor with fields, used in services that support Generic Selectors.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   * @param classT type of object that the Service works with, for example Campaign, AdGroup, etc.
   * @param classOperationT sub-class of the
   *        com.google.api.adwords.v201406.cm.Operation specific for classT
   * @param service the custom service class for the SOAP service
   */
  protected AbstractGetMutateDelegate(AdWordsSession adWordsSession,
      List<? extends FieldType<T>> selectorFields, Class<T> classT,
          Class<OperationT> classOperationT, S service) {
    super(adWordsSession, classT, service, selectorFields);
    this.classOperationT = classOperationT;
  }

  /**
   * Calls getValue() for ListReturnValue's subclasses
   * OR ManagedCustomerReturnValue.getValue()
   * OR if not needed just converts T[] to List<T>.
   *
   * @param object generic Object with ListReturnValue OR ManagedCustomerReturnValue OR T[]
   *        the return object depends on the interface S
   * @return a list of <T> objects
   * @throws RemoteException if there is an error in the reflection call
   */
  private List<T> getValue(Object object) throws RemoteException {
    @SuppressWarnings("unchecked")
    Class<T[]> classArrayT = (Class<T[]>) Array.newInstance(getClassT(), 0).getClass();

    if (object instanceof ListReturnValue) {
      // Using reflection for listReturnValue.getValue() on Subclasses once
      T[] array =  classArrayT.cast(
          ReflectionUtil.invokeCount("getValue", object, object.getClass(), 1));
      return ListUtil.asList(array);

    } else if (object instanceof ManagedCustomerReturnValue) {
      // ManagedCustomerServiceInterface is a special case, it does not extend ListReturnValue
      return ListUtil.asList(
          classArrayT.cast(((ManagedCustomerReturnValue) object).getValue()));

    } else if (object.getClass().isArray()
        && object.getClass().getComponentType().equals(getClassT())) {
      return ListUtil.asList(classArrayT.cast(object));

    } else {
      throw new UtilityLibraryException("Error during reflection for "
          + object.getClass().getName() + ".getValue(), input not supported");
    }
  }

  /**
   * Creates one operation per item on the list using the operator provided
   * Executes by reflection {@code operation.setOperand(t)}.
   *
   * @param list a list of T API objects
   * @param operator the operator to
   * @return a List of <OperationT extends Operation> specific for the class T
   * @throws UtilityLibraryException if there is an error in the reflection call
   */
  private List<OperationT> createOperations(List<T> list, Operator operator) {
    List<OperationT> operations =  com.google.common.collect.Lists.newArrayList();
    for (T t : list) {
      try {
        // creating an instance of the Operation subClass
        OperationT operation = classOperationT.newInstance();
        // Using reflection for operation.setOperand(t) once
        ReflectionUtil.invokeCount("setOperand", operation, classOperationT, t, getClassT(), 1);
        operation.setOperator(operator);
        operations.add(operation);
      } catch (Exception e) {
        throw new UtilityLibraryException("Error during reflection for "
            + getClassT().getName() + ".setOperand(t)", e);
      }
    }
    return operations;
  }

  /**
   * Method to execute by reflection {@code getService().mutate(operations)}.
   *
   * @param operations a List<OperationT> of operations for the mutate call 
   * @return a generic Object for ListReturnValue or T[]
   *         the return object depends on the interface S
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  protected Object mutate(List<OperationT> operations) throws RemoteException {
    // Using reflection for getService().mutate(operations), retrying MAX_RETRY_COUNT times
    OperationT[] operationsArray = operations.toArray(
        ObjectArrays.newArray(classOperationT, operations.size()));
    return ReflectionUtil.invokeCount(
        "mutate", getService(), classS, operationsArray, MAX_RETRY_COUNT);
  }

  /**
   * Encapsulates one {@code ADD} mutate operation per item on the list.
   *
   * @param list a list of T object to insert
   * @return a list of T objects
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public List<T> insert(List<T> list) throws RemoteException {
    return getValue(mutate(createOperations(list, Operator.ADD)));
  }

  /**
   * Encapsulates one {@code ADD} mutate operation for the object.
   *
   * @param object the T object to insert 
   * @return one T object
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public T insert(T object) throws RemoteException {
    return Iterables.getOnlyElement(
        getValue(mutate(createOperations(ImmutableList.of(object), Operator.ADD))));
  }

  /**
   * Encapsulates one {@code SET} mutate operation per item on the list.
   *
   * @param list a list of T object to update
   * @return a list of T objects
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public List<T> update(List<T> list) throws RemoteException {
    return getValue(mutate(createOperations(list, Operator.SET)));
  }

  /**
   * Encapsulates one {@code SET} mutate operation for the object.
   *
   * @param object the T object to update 
   * @return one T object
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public T update(T object) throws RemoteException {
    return Iterables.getOnlyElement(
        getValue(mutate(createOperations(ImmutableList.of(object), Operator.SET))));
  }

  /**
   * Encapsulates one {@code REMOVE} mutate operation per item on the list.
   *
   * @param list a list of T object to remove
   * @return a list of <T> objects
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public List<T> remove(List<T> list) throws RemoteException {
    return getValue(mutate(createOperations(list, Operator.REMOVE)));
  }

  /**
   * Encapsulates one {@code REMOVE} mutate operation for the object.
   *
   * @param object the T object to remove 
   * @return one T object
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public T remove(T object) throws RemoteException {
    return Iterables.getOnlyElement(
        getValue(mutate(createOperations(ImmutableList.of(object), Operator.REMOVE))));
  }
}
