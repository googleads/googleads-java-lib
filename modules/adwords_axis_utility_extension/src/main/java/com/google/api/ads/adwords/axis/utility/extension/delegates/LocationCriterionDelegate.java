// Copyright 2013 Google Inc. All Rights Reserved.
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
import com.google.api.ads.adwords.axis.utility.extension.util.SelectorFields;
import com.google.api.ads.adwords.axis.v201502.cm.LocationCriterion;
import com.google.api.ads.adwords.axis.v201502.cm.LocationCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201502.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetDelegate for {@link LocationCriterion}.
 *
 * <p>
 * Implementation is not thread-safe,
 * because AdWordsSession and Apache Axis service objects are not thread-safe.
 * </p>
 *
 * @author Julian Toledo
 */
public final class LocationCriterionDelegate extends
    AbstractGetDelegate<LocationCriterion, LocationCriterionServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public LocationCriterionDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, LocationCriterion.class, LocationCriterionServiceInterface.class,
        SelectorFields.LocationCriterion.all());
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  LocationCriterionDelegate(AdWordsSession adWordsSession,
      LocationCriterionServiceInterface service) {
    super(adWordsSession, LocationCriterion.class, service,
        SelectorFields.LocationCriterion.all());
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public LocationCriterionDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.LocationCriterion> selectorFields) {
    super(adWordsSession, LocationCriterion.class, LocationCriterionServiceInterface.class,
        selectorFields);
  }

  /**
   * Retrieves all LocationCriterion for the ManagedCustomer associate with the adWordsSession.
   * Overrides AbstractGetDelegate get method because it does not need "getEntries()"
   *
   * @return All the LocationCriterion for the ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  @Override
  public List<LocationCriterion> get(Selector selector) throws RemoteException {
    LocationCriterion[] array = (LocationCriterion[]) getPage(selector);
     return ListUtil.asList(array);
  }

  /**
   * Retrieves LocationCriterion by locationCriterionId.
   *
   * @param locationCriterionId
   * @return a LocationCriterion matching the locationCriterionId
   * @throws RemoteException for communication-related exceptions
   */
  public LocationCriterion getById(Long locationCriterionId) throws RemoteException {
    return getOneByField(SelectorFields.LocationCriterion.ID, locationCriterionId);
  }

  /**
   * Retrieves LocationCriterion by locationCriterionIds.
   *
   * @param locationCriterionIds
   * @return a list of LocationCriterions matching the locationCriterionId
   * @throws RemoteException for communication-related exceptions
   */
  public List<LocationCriterion> getById(List<Long>  locationCriterionIds) throws RemoteException {
    return getByField(SelectorFields.LocationCriterion.ID, locationCriterionIds);
  }

  /**
   * Retrieves LocationCriterion by locationName.
   *
   * @param locationName
   * @return a list of LocationCriterions matching the locationCriterionId
   * @throws RemoteException for communication-related exceptions
   */
  public List<LocationCriterion> getByLocationName(String  locationName) throws RemoteException {
    return getByField(SelectorFields.LocationCriterion.LOCATION_NAME, locationName);
  }
}
