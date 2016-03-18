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
import com.google.api.ads.adwords.axis.v201506.cm.Campaign;
import com.google.api.ads.adwords.axis.v201506.cm.CampaignLabel;
import com.google.api.ads.adwords.axis.v201506.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201506.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201506.cm.CampaignStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link Campaign}.
 *
 * <p>
 * Implementation is not thread-safe,
 * because AdWordsSession and Apache Axis service objects are not thread-safe.
 * </p>
 */
public final class CampaignDelegate extends
    AbstractGetMutateDelegate<Campaign, CampaignOperation, CampaignServiceInterface> {

  // We use another delegate for the Labels, just for the mutateLabel operation.
  private final CampaignLabelDelegate campaignLabelDelegate;

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public CampaignDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.Campaign.all(), Campaign.class, CampaignOperation.class,
        CampaignServiceInterface.class);
    campaignLabelDelegate = new CampaignLabelDelegate(adWordsSession, this.getService());
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  public CampaignDelegate(AdWordsSession adWordsSession, CampaignServiceInterface service) {
    super(adWordsSession, SelectorFields.Campaign.all(),
        Campaign.class, CampaignOperation.class, service);
    campaignLabelDelegate = new CampaignLabelDelegate(adWordsSession, service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public CampaignDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.Campaign> selectorFields) {
    super(adWordsSession, selectorFields, Campaign.class, CampaignOperation.class,
        CampaignServiceInterface.class);
    campaignLabelDelegate = new CampaignLabelDelegate(adWordsSession, this.getService());
  }

  /**
   * Retrieves Campaigns by campaignIds.
   *
   * @param campaignIds the Ids of the Campaigns
   * @return a list of Campaigns matching campaignIds
   * @throws RemoteException for communication-related exceptions
   */
  public List<Campaign> getByCampaignId(List<Long> campaignIds) throws RemoteException {
    return getByField(SelectorFields.Campaign.ID, campaignIds);
  }

  /**
   * Retrieves a Campaign by campaignId.
   *
   * @param campaignId the Id of the Campaign
   * @return a list of Campaigns matching campaignId
   * @throws RemoteException for communication-related exceptions
   */
  public Campaign getByCampaignId(Long campaignId) throws RemoteException {
    return getOneByField(SelectorFields.Campaign.ID, campaignId);
  }

  /**
   * Retrieves Campaigns by campaignStatus.
   *
   * @param campaignStatus the Status of the Campaign
   * @return a list of Campaigns matching campaignStatus
   * @throws RemoteException for communication-related exceptions
   */
  public List<Campaign> getByStatus(CampaignStatus campaignStatus) throws RemoteException {
    return getByField(SelectorFields.Campaign.STATUS, campaignStatus);
  }

  /**
   * Retrieves Campaigns by labelIds.
   *
   * @param labelIds the Ids of the Labels to retrieve the Campaigns
   * @return a list of Campaigns matching labelIds
   * @throws RemoteException for communication-related exceptions
   */
  public List<Campaign> getByLabelIds(List<Long> labelIds) throws RemoteException {
    return getByFieldContainsAny(SelectorFields.Campaign.LABELS, labelIds);
  }

  /**
   * Removes Campaign. Removing it sets the campaigns' statuses to {@code REMOVED} and performs a
   * Set.
   *
   * @param list the list of Campaigns to remove
   * @return the Campaigns removed
   * @throws RemoteException for communication-related exceptions
   */
  @Override
  public List<Campaign> remove(List<Campaign> list) throws RemoteException {
    for (Campaign campaign : list) {
      campaign.setStatus(CampaignStatus.REMOVED);
    }
    return update(list);
  }

  /**
   * Removes Campaign. Removing it sets the campaing's status to {@code REMOVED} and performs a Set.
   *
   * @param campaign the Campaign to remove
   * @return the Campaign removed
   * @throws RemoteException for communication-related exceptions
   */
  @Override
  public Campaign remove(Campaign campaign) throws RemoteException {
    campaign.setStatus(CampaignStatus.REMOVED);
    return update(campaign);
  }

  /**
   * Creates a link (CampaignLabel) between Campaigns and Labels.
   *
   * @param campaignLabels the CampaignLabels to add
   * @return the CampaignLabels added
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignLabel> insertCampaignLabel(List<CampaignLabel> campaignLabels)
      throws RemoteException {
    return campaignLabelDelegate.insert(campaignLabels);
  }

  /**
   * Creates a link (CampaignLabel) between Campaigns and Labels.
   *
   * @param campaignLabel the CampaignLabel to add
   * @return the CampaignLabel added
   * @throws RemoteException for communication-related exceptions
   */
  public CampaignLabel insertCampaignLabel(CampaignLabel campaignLabel) throws RemoteException {
    return campaignLabelDelegate.insert(campaignLabel);
  }

  /**
   * Removes a link (CampaignLabel) between Campaigns and Labels.
   *
   * @param campaignLabels the CampaignLabels to remove
   * @return the CampaignLabels removed
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignLabel> removeCampaignLabel(List<CampaignLabel> campaignLabels)
      throws RemoteException {
    return campaignLabelDelegate.remove(campaignLabels);
  }

  /**
   * Removes a link (CampaignLabel) between Campaigns and Labels.
   *
   * @param campaignLabel the CampaignLabel to remove
   * @return the CampaignLabel removed
   * @throws RemoteException for communication-related exceptions
   */
  public CampaignLabel removeCampaignLabel(CampaignLabel campaignLabel) throws RemoteException {
    return campaignLabelDelegate.remove(campaignLabel);
  }
}
