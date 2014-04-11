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
import com.google.api.ads.adwords.axis.v201402.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201402.cm.AdGroupOperation;
import com.google.api.ads.adwords.axis.v201402.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201402.cm.AdGroupStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link AdGroup}.
 *
 * @author Julian Toledo
 */
public final class AdGroupDelegate extends
    AbstractGetMutateDelegate<AdGroup, AdGroupOperation, AdGroupServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public AdGroupDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.AdGroup.all(), AdGroup.class, AdGroupOperation.class,
        AdGroupServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  public AdGroupDelegate(AdWordsSession adWordsSession, AdGroupServiceInterface service) {
    super(adWordsSession, SelectorFields.AdGroup.all(),
        AdGroup.class, AdGroupOperation.class, service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public AdGroupDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.AdGroup> selectorFields) {
    super(adWordsSession, selectorFields, AdGroup.class, AdGroupOperation.class,
        AdGroupServiceInterface.class);
  }

  /**
   * Retrieves AdGroups by adIds.
   *
   * @param adGroupId
   * @return a list of AdGroups matching the adGroupId
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroup getByAdGroupId(Long adGroupId) throws RemoteException {
    return getOneByField(SelectorFields.AdGroup.ID, adGroupId);
  }

  /**
   * Retrieves AdGroups by campaignIds.
   *
   * @param campaignIds
   * @return a list of AdGroups matching the campaignIds
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroup> getByCampaignId(List<Long> campaignIds) throws RemoteException {
    return getByField(SelectorFields.AdGroup.CAMPAIGN_ID, campaignIds);
  }

  /**
   * Retrieves AdGroups by campaignId.
   *
   * @param campaignId
   * @return a list of AdGroups matching the campaignId
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroup> getByCampaignId(Long campaignId) throws RemoteException {
    return getByField(SelectorFields.AdGroup.CAMPAIGN_ID, campaignId);
  }

  /**
   * Retrieves AdGroups by campaignId in the range (startIndex, numberResults).
   *
   * @param campaignId
   * @param startIndex index of the first result
   * @param numberResults number of results 
   * @return a list of AdGroups matching the campaignId in the range (startIndex, numberResults)
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroup> getByCampaignId(Long campaignId, int startIndex, int numberResults)
      throws RemoteException {
    return getByField(SelectorFields.AdGroup.CAMPAIGN_ID, campaignId, startIndex, numberResults);
  }

  /**
   * Retrieves AdGroups by adGroupStatus.
   *
   * @param adGroupStatus
   * @return a list of AdGroups matching the campaignId
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroup> getByStatus(AdGroupStatus adGroupStatus) throws RemoteException {
    return getByField(SelectorFields.AdGroup.STATUS, adGroupStatus);
  }

  /**
   * Retrieves AdGroups by adGroupStatus in the range (startIndex, numberResults).
   *
   * @param adGroupStatus
   * @param startIndex index of the first result
   * @param numberResults number of results 
   * @return a list of AdGroups matching the campaignId in the range (startIndex, numberResults)
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroup> getByStatus(AdGroupStatus adGroupStatus, int startIndex, int numberResults)
      throws RemoteException {
    return getByField(SelectorFields.AdGroup.STATUS,
        adGroupStatus.getValue(), startIndex, numberResults);
  }

  /**
   * Removes AdGroups. Removing it sets the ad groups' statuses to DELETED and performs a Set.
   *
   * @param list the list of AdGroups to remove
   * @return the AdGroups deleted
   * @throws RemoteException for communication-related exceptions
   */
  @Override
  public List<AdGroup> remove(List<AdGroup> list) throws RemoteException {
    for (AdGroup adGroup : list) {
      adGroup.setStatus(AdGroupStatus.DELETED);
    }
    return update(list);
  }

  /**
   * Removes AdGroup. Removing it sets the ad group's status to DELETED and performs a Set.
   *
   * @param adGroup the AdGroup to remove
   * @return the AdGroup deleted
   * @throws RemoteException for communication-related exceptions
   */
  @Override
  public AdGroup remove(AdGroup adGroup) throws RemoteException {
    adGroup.setStatus(AdGroupStatus.DELETED);
    return update(adGroup);
  }
}
