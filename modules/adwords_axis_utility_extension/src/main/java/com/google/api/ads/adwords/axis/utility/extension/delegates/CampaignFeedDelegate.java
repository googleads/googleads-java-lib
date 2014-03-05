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
import com.google.api.ads.adwords.axis.v201309.cm.CampaignFeed;
import com.google.api.ads.adwords.axis.v201309.cm.CampaignFeedOperation;
import com.google.api.ads.adwords.axis.v201309.cm.CampaignFeedServiceInterface;
import com.google.api.ads.adwords.axis.v201309.cm.CampaignFeedStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link CampaignFeed}.
 *
 * @author Julian Toledo
 */
public final class CampaignFeedDelegate extends
    AbstractGetMutateDelegate<CampaignFeed, CampaignFeedOperation, CampaignFeedServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public CampaignFeedDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.CampaignFeed.all(),
        CampaignFeed.class, CampaignFeedOperation.class, CampaignFeedServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  public CampaignFeedDelegate(AdWordsSession adWordsSession, CampaignFeedServiceInterface service) {
    super(adWordsSession, SelectorFields.CampaignFeed.all(),
        CampaignFeed.class, CampaignFeedOperation.class, service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public CampaignFeedDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.CampaignFeed> selectorFields) {
    super(adWordsSession, selectorFields, CampaignFeed.class, CampaignFeedOperation.class,
        CampaignFeedServiceInterface.class);
  }

  /**
   * Retrieves CampaignFeeds by feedId.
   *
   * @param feedId
   * @return a list of CampaignFeeds matching the feedId
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignFeed> getByFeedId(Long feedId) throws RemoteException {
    return getByField(SelectorFields.CampaignFeed.FEED_ID, feedId);
  }

  /**
   * Retrieves CampaignFeeds by campaignId.
   *
   * @param campaignId
   * @return a list of CampaignFeeds matching the campaignId
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignFeed> getByCampaignId(Long campaignId) throws RemoteException {
    return getByField(SelectorFields.CampaignFeed.CAMPAIGN_ID, campaignId);
  }



  /**
   * Retrieves CampaignFeeds by status.
   *
   * @param status
   * @return a list of CampaignFeeds matching the status
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignFeed> getByStatus(CampaignFeedStatus status) throws RemoteException {
    return getByField(SelectorFields.CampaignFeed.STATUS, status);
  }
}