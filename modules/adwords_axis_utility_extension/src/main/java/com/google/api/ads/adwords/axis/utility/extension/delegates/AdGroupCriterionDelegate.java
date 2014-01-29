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

import com.google.api.ads.adwords.axis.utility.extension.util.SelectorFields;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201309.cm.CriterionType;
import com.google.api.ads.adwords.axis.v201309.cm.CriterionUse;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.collect.ImmutableList;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Specific AbstractGetMutateDelegate for {@link AdGroupCriterion}.
 *
 * <p>
 * Implementation is not thread-safe,
 * because AdWordsSession and Apache Axis service objects are not thread-safe.
 * </p>
 *
 * @author Julian Toledo
 */
public final class AdGroupCriterionDelegate extends AbstractGetMutateDelegate<AdGroupCriterion,
    AdGroupCriterionOperation, AdGroupCriterionServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public AdGroupCriterionDelegate(AdWordsSession adWordsSession, boolean includeBetaFields) {
    super(adWordsSession, SelectorFields.AdGroupCriterion.all(includeBetaFields),
        AdGroupCriterion.class, AdGroupCriterionOperation.class,
        AdGroupCriterionServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  public AdGroupCriterionDelegate(AdWordsSession adWordsSession,
      AdGroupCriterionServiceInterface service, boolean includeBetaFields) {
    super(adWordsSession, SelectorFields.AdGroupCriterion.all(includeBetaFields),
        AdGroupCriterion.class, AdGroupCriterionOperation.class, service);
  }  

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public AdGroupCriterionDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.AdGroupCriterion> selectorFields) {
    super(adWordsSession, selectorFields, AdGroupCriterion.class, AdGroupCriterionOperation.class,
        AdGroupCriterionServiceInterface.class);
  }

  /**
   * Retrieves AdGroupCriterions by adGroupId and criterionId (criterionId is not unique by itself).
   *
   * @param adGroupId
   * @param criterionId
   * @return a list of AdGroupCriterions matching the adGroupId and adGroupId
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupCriterion> getByAdGroupIdCriterionId(Long adGroupId, Long criterionId)
      throws RemoteException {
    Map<SelectorFields.AdGroupCriterion, List<String>> predicates =
        new HashMap<SelectorFields.AdGroupCriterion, List<String>>();
    predicates.put(SelectorFields.AdGroupCriterion.ADGROUP_ID,
        ImmutableList.of(String.valueOf(adGroupId)));
    predicates.put(SelectorFields.AdGroupCriterion.ID,
        ImmutableList.of(String.valueOf(criterionId)));
    return get(createSelectorMultipleFields(predicates));
  }

  /**
   * Retrieves AdGroupCriterions by adGroupIds.
   *
   * @param adGroupIds
   * @return a list of AdGroupCriterions matching adGroupIds
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupCriterion> getByAdGroupId(List<Long> adGroupIds) throws RemoteException {
    return getByField(SelectorFields.AdGroupCriterion.ADGROUP_ID, adGroupIds);
  }

  /**
   * Retrieves AdGroupCriterions by adGroupId.
   *
   * @param adGroupId
   * @return a list of AdGroupCriterions matching the adGroupId
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupCriterion> getByAdGroupId(Long adGroupId) throws RemoteException {
    return getByField(SelectorFields.AdGroupCriterion.ADGROUP_ID, adGroupId);
  }

  /**
   * Retrieves AdGroupCriterions by adGroupId in the range (startIndex, numberResults).
   *
   * @param adGroupId
   * @param startIndex index of the first result
   * @param numberResults number of results 
   * @return a list of AdGroupCriterions matching the adGroupId
   *         in the range (startIndex, numberResults)
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupCriterion> getByAdGroupId(Long adGroupId, int startIndex, int numberResults)
      throws RemoteException {
    return getByField(SelectorFields.AdGroupCriterion.ADGROUP_ID, adGroupId, startIndex,
        numberResults);
  }

  /**
   * Retrieves AdGroupCriterions by CriterionUse.
   *
   * @param criterionUse {@code CriterionUse}
   * @return a list of AdGroupCriterions matching the criterionUse
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupCriterion> getByCriterionUse(CriterionUse criterionUse)
      throws RemoteException {
    return getByField(SelectorFields.AdGroupCriterion.CRITERION_USE, criterionUse.getValue());
  }

  /**
   * Retrieves AdGroupCriterions by CriterionType.
   *
   * @param criterionType {@code CriterionType}
   * @return a list of AdGroupCriterions matching the criterionType
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupCriterion> getByCriterionType(CriterionType criterionType)
      throws RemoteException {
    return getByField(SelectorFields.AdGroupCriterion.CRITERIA_TYPE, criterionType.getValue());
  }

  /**
   * Retrieves AdGroupCriterions by CriterionUse and CriterionType.
   *
   * @param criterionUse {@code CriterionUse}
   * @param criterionType {@code CriterionType}
   * @return a list of AdGroupCriterions matching the criterionUse and criterionType
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupCriterion> getByCriterionUseCriterionType(CriterionUse criterionUse,
      CriterionType criterionType) throws RemoteException {
    Map<SelectorFields.AdGroupCriterion, List<String>> predicates =
        new HashMap<SelectorFields.AdGroupCriterion, List<String>>();
    predicates.put(SelectorFields.AdGroupCriterion.CRITERION_USE,
        ImmutableList.of(criterionUse.getValue()));
    predicates.put(SelectorFields.AdGroupCriterion.CRITERIA_TYPE,
        ImmutableList.of(criterionType.getValue()));
    return get(createSelectorMultipleFields(predicates));
  }

  /**
   * Retrieves AdGroupCriterions by adGroupId and CriterionUse.
   *
   * @param adGroupId
   * @param criterionUse {@code CriterionUse}
   * @return a list of AdGroupCriterions matching the adGroupId and criterionUse
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupCriterion> getByAdGroupIdCriterionUse(Long adGroupId,
      CriterionUse criterionUse) throws RemoteException {
    Map<SelectorFields.AdGroupCriterion, List<String>> predicates =
        new HashMap<SelectorFields.AdGroupCriterion, List<String>>();
    predicates.put(SelectorFields.AdGroupCriterion.ADGROUP_ID,
        ImmutableList.of(String.valueOf(adGroupId)));
    predicates.put(SelectorFields.AdGroupCriterion.CRITERION_USE,
        ImmutableList.of(criterionUse.getValue()));
    return get(createSelectorMultipleFields(predicates));
  }

  /**
   * Retrieves AdGroupCriterions by adGroupId and CriterionType.
   *
   * @param adGroupId
   * @param criterionType {@code CriterionType}
   * @return a list of AdGroupCriterions matching the adGroupId and criterionType
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupCriterion> getByAdGroupIdCriterionType(Long adGroupId,
      CriterionType criterionType) throws RemoteException {
    Map<SelectorFields.AdGroupCriterion, List<String>> predicates =
        new HashMap<SelectorFields.AdGroupCriterion, List<String>>();
    predicates.put(SelectorFields.AdGroupCriterion.ADGROUP_ID,
        ImmutableList.of(String.valueOf(adGroupId)));
    predicates.put(SelectorFields.AdGroupCriterion.CRITERIA_TYPE,
        ImmutableList.of(criterionType.getValue()));
    return get(createSelectorMultipleFields(predicates));
  }

  /**
   * Retrieves AdGroupCriterions by CriterionUse and CriterionType.
   *
   * @param adGroupId
   * @param criterionUse {@code CriterionUse}
   * @param criterionType {@code CriterionType}
   * @return a list of AdGroupCriterions matching the adGroupId, criterionUse and criterionType
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupCriterion> getByAdGroupIdCriterionUseCriterionType(Long adGroupId,
      CriterionUse criterionUse, CriterionType criterionType) throws RemoteException {
    Map<SelectorFields.AdGroupCriterion, List<String>> predicates =
        new HashMap<SelectorFields.AdGroupCriterion, List<String>>();
    predicates.put(SelectorFields.AdGroupCriterion.ADGROUP_ID,
        ImmutableList.of(String.valueOf(adGroupId)));
    predicates.put(SelectorFields.AdGroupCriterion.CRITERION_USE,
        ImmutableList.of(criterionUse.getValue()));
    predicates.put(SelectorFields.AdGroupCriterion.CRITERIA_TYPE,
        ImmutableList.of(criterionType.getValue()));
    return get(createSelectorMultipleFields(predicates));
  }
}
