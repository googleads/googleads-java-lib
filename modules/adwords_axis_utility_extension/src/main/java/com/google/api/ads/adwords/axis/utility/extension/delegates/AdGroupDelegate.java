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
import com.google.api.ads.adwords.axis.v201506.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupLabel;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupOperation;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link AdGroup}.
 */
public final class AdGroupDelegate extends
    AbstractGetMutateDelegate<AdGroup, AdGroupOperation, AdGroupServiceInterface> {

  // We use another delegate for the Labels, just for the mutateLabel operation.
  private final AdGroupLabelDelegate adGroupLabelDelegate;

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public AdGroupDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.AdGroup.all(), AdGroup.class, AdGroupOperation.class,
        AdGroupServiceInterface.class);
    adGroupLabelDelegate = new AdGroupLabelDelegate(adWordsSession, this.getService());
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  AdGroupDelegate(AdWordsSession adWordsSession, AdGroupServiceInterface service) {
    super(adWordsSession, SelectorFields.AdGroup.all(),
        AdGroup.class, AdGroupOperation.class, service);
    adGroupLabelDelegate = new AdGroupLabelDelegate(adWordsSession, service);
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
    adGroupLabelDelegate = new AdGroupLabelDelegate(adWordsSession, this.getService());
  }

  /**
   * Retrieves AdGroups by adIds.
   *
   * @param adGroupId the Id of the AdGroup
   * @return a list of AdGroups matching the adGroupId
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroup getByAdGroupId(Long adGroupId) throws RemoteException {
    return getOneByField(SelectorFields.AdGroup.ID, adGroupId);
  }

  /**
   * Retrieves AdGroups by campaignIds.
   *
   * @param campaignIds the Ids of the Campaigns
   * @return a list of AdGroups matching the campaignIds
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroup> getByCampaignId(List<Long> campaignIds) throws RemoteException {
    return getByField(SelectorFields.AdGroup.CAMPAIGN_ID, campaignIds);
  }

  /**
   * Retrieves AdGroups by campaignId.
   *
   * @param campaignId the Id of the Campaign
   * @return a list of AdGroups matching the campaignId
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroup> getByCampaignId(Long campaignId) throws RemoteException {
    return getByField(SelectorFields.AdGroup.CAMPAIGN_ID, campaignId);
  }

  /**
   * Retrieves AdGroups by campaignId in the range (startIndex, numberResults).
   *
   * @param campaignId the Id of the Campaign
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
   * @param adGroupStatus the Status of the AdGroup
   * @return a list of AdGroups matching the campaignId
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroup> getByStatus(AdGroupStatus adGroupStatus) throws RemoteException {
    return getByField(SelectorFields.AdGroup.STATUS, adGroupStatus);
  }

  /**
   * Retrieves AdGroups by adGroupStatus in the range (startIndex, numberResults).
   *
   * @param adGroupStatus the Status of the AdGroup
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
   * Retrieves AdGroups by labelIds.
   *
   * @param labelIds the Ids of the Labels to retreive the AdGroups
   * @return a list of AdGroups matching labelIds
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroup> getByLabelIds(List<Long> labelIds) throws RemoteException {
    return getByFieldContainsAny(SelectorFields.AdGroup.LABELS, labelIds);
  }

  /**
   * Removes AdGroups. Removing it sets the ad groups' statuses to {@code REMOVED} and performs a
   * Set.
   *
   * @param list the list of AdGroups to remove
   * @return the AdGroups removed
   * @throws RemoteException for communication-related exceptions
   */
  @Override
  public List<AdGroup> remove(List<AdGroup> list) throws RemoteException {
    for (AdGroup adGroup : list) {
      adGroup.setStatus(AdGroupStatus.REMOVED);
    }
    return update(list);
  }

  /**
   * Removes AdGroup. Removing it sets the ad group's status to {@code REMOVED} and performs a Set.
   *
   * @param adGroup the AdGroup to remove
   * @return the AdGroup removed
   * @throws RemoteException for communication-related exceptions
   */
  @Override
  public AdGroup remove(AdGroup adGroup) throws RemoteException {
    adGroup.setStatus(AdGroupStatus.REMOVED);
    return update(adGroup);
  }

  /**
   * Creates a link (AdGroupLabel) between AdGroups and Labels.
   *
   * @param adGroupLabels the AdGroupLabels to add
   * @return the AdGroupLabels added
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupLabel> insertAdGroupLabel(List<AdGroupLabel> adGroupLabels)
      throws RemoteException {
    return adGroupLabelDelegate.insert(adGroupLabels);
  }

  /**
   * Creates a link (AdGroupLabel) between AdGroups and Labels.
   *
   * @param adGroupLabel the AdGroupLabel to add
   * @return the AdGroupLabel added
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupLabel insertAdGroupLabel(AdGroupLabel adGroupLabel)throws RemoteException {
    return adGroupLabelDelegate.insert(adGroupLabel);
  }

  /**
   * Removes a link (AdGroupLabel) between AdGroups and Labels.
   *
   * @param adGroupLabels the AdGroupLabels to remove
   * @return the AdGroupLabels removed
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupLabel> removeAdGroupLabel(List<AdGroupLabel> adGroupLabels)
      throws RemoteException {
    return adGroupLabelDelegate.remove(adGroupLabels);
  }

  /**
   * Removes a link (AdGroupLabel) between AdGroups and Labels.
   *
   * @param adGroupLabel the AdGroupLabel to remove
   * @return the AdGroupLabel removed
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupLabel removeAdGroupLabel(AdGroupLabel adGroupLabel) throws RemoteException {
    return adGroupLabelDelegate.remove(adGroupLabel);
  }
}
