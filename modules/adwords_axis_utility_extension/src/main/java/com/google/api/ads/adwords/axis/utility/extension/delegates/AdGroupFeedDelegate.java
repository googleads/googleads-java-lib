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
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupFeed;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupFeedOperation;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupFeedServiceInterface;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupFeedStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link AdGroupFeed}.
 *
 * @author Julian Toledo
 */
public final class AdGroupFeedDelegate extends
    AbstractGetMutateDelegate<AdGroupFeed, AdGroupFeedOperation, AdGroupFeedServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public AdGroupFeedDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.AdGroupFeed.all(), AdGroupFeed.class,
        AdGroupFeedOperation.class, AdGroupFeedServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  AdGroupFeedDelegate(AdWordsSession adWordsSession, AdGroupFeedServiceInterface service) {
    super(adWordsSession, SelectorFields.AdGroupFeed.all(),
        AdGroupFeed.class, AdGroupFeedOperation.class, service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public AdGroupFeedDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.AdGroupFeed> selectorFields) {
    super(adWordsSession, selectorFields, AdGroupFeed.class, AdGroupFeedOperation.class,
        AdGroupFeedServiceInterface.class);
  }

  /**
   * Retrieves AdGroupFeeds by adGroupId.
   *
   * @param adGroupId
   * @return a list of AdGroupFeeds matching the adGroupId
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupFeed> getByAdGroupId(Long adGroupId) throws RemoteException {
    return getByField(SelectorFields.AdGroupFeed.ADGROUP_ID, adGroupId);
  }

  /**
   * Retrieves AdGroupFeeds by feedId.
   *
   * @param feedId
   * @return a list of AdGroupFeeds matching the feedId
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupFeed> getByFeedId(Long feedId) throws RemoteException {
    return getByField(SelectorFields.AdGroupFeed.FEED_ID, feedId);
  }

  /**
   * Retrieves AdGroupFeeds by status.
   *
   * @param status
   * @return a list of AdGroupFeeds matching the campaignId
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupFeed> getByStatus(AdGroupFeedStatus status) throws RemoteException {
    return getByField(SelectorFields.AdGroupFeed.STATUS, status);
  }
}
