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
import com.google.api.ads.adwords.axis.v201306.cm.Campaign;
import com.google.api.ads.adwords.axis.v201306.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201306.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201306.cm.CampaignStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link Campaign}.
 *
 * <p>
 * Implementation is not thread-safe,
 * because AdWordsSession and Apache Axis service objects are not thread-safe.
 * </p>
 *
 * @author Julian Toledo
 */
public final class CampaignDelegate extends
    AbstractGetMutateDelegate<Campaign, CampaignOperation, CampaignServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public CampaignDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.Campaign.all(), Campaign.class, CampaignOperation.class,
        CampaignServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  public CampaignDelegate(AdWordsSession adWordsSession, CampaignServiceInterface service) {
    super(adWordsSession, SelectorFields.Campaign.all(),
        Campaign.class, CampaignOperation.class, service);
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
  }

  /**
   * Retrieves Campaigns by campaignIds.
   *
   * @param campaignIds
   * @return a list of Campaigns matching campaignIds
   * @throws RemoteException for communication-related exceptions
   */
  public List<Campaign> getByCampaignId(List<Long> campaignIds) throws RemoteException {
    return getByField(SelectorFields.Campaign.ID, campaignIds);
  }

  /**
   * Retrieves a Campaign by campaignId.
   *
   * @param campaignId
   * @return a list of Campaigns matching campaignId
   * @throws RemoteException for communication-related exceptions
   */
  public Campaign getByCampaignId(Long campaignId) throws RemoteException {
    return getOneByField(SelectorFields.Campaign.ID, campaignId);
  }

  /**
   * Retrieves Campaigns by campaignStatus.
   *
   * @param campaignStatus
   * @return a list of Campaigns matching campaignStatus
   * @throws RemoteException for communication-related exceptions
   */
  public List<Campaign> getByStatus(CampaignStatus campaignStatus) throws RemoteException {
    return getByField(SelectorFields.Campaign.STATUS, campaignStatus);
  }

  /**
   * Removes Campaign. Removing it sets the campaigns' statuses to DELETED and performs a Set.
   *
   * @param list the list of Campaigns to remove
   * @return the Campaigns deleted
   * @throws RemoteException for communication-related exceptions
   */
  @Override
  public List<Campaign> remove(List<Campaign> list) throws RemoteException {
    for (Campaign campaign : list) {
      campaign.setStatus(CampaignStatus.DELETED);
    }
    return update(list);
  }

  /**
   * Removes Campaign. Removing it sets the campaing's status to DELETED and performs a Set.
   *
   * @param campaign the Campaign to remove
   * @return the Campaign deleted
   * @throws RemoteException for communication-related exceptions
   */
  @Override
  public Campaign remove(Campaign campaign) throws RemoteException {
    campaign.setStatus(CampaignStatus.DELETED);
    return update(campaign);
  }
}
