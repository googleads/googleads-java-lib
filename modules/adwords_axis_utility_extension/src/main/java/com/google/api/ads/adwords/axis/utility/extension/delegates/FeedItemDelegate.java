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
import com.google.api.ads.adwords.axis.v201506.cm.FeedItem;
import com.google.api.ads.adwords.axis.v201506.cm.FeedItemOperation;
import com.google.api.ads.adwords.axis.v201506.cm.FeedItemServiceInterface;
import com.google.api.ads.adwords.axis.v201506.cm.FeedItemStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link FeedItem}.
 *
 * @author Julian Toledo
 */
public final class FeedItemDelegate extends
    AbstractGetMutateDelegate<FeedItem, FeedItemOperation, FeedItemServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public FeedItemDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.FeedItem.all(), FeedItem.class, FeedItemOperation.class,
        FeedItemServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  FeedItemDelegate(AdWordsSession adWordsSession, FeedItemServiceInterface service) {
    super(adWordsSession, SelectorFields.FeedItem.all(), FeedItem.class,
        FeedItemOperation.class, service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public FeedItemDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.FeedItem> selectorFields) {
    super(adWordsSession, selectorFields, FeedItem.class, FeedItemOperation.class,
        FeedItemServiceInterface.class);
  }

  /**
   * Retrieves FeedItems by feedId.
   *
   * @param feedId
   * @return a list of FeedItems matching the feedId
   * @throws RemoteException for communication-related exceptions
   */
  public List<FeedItem> getByFeedId(Long feedId) throws RemoteException {
    return getByField(SelectorFields.FeedItem.FEED_ID, feedId);
  }

  /**
   * Retrieves FeedItems by feedItemId.
   *
   * @param feedItemId
   * @return a list of FeedItems matching the feedItemId
   * @throws RemoteException for communication-related exceptions
   */
  public List<FeedItem> getByFeedItemId(Long feedItemId) throws RemoteException {
    return getByField(SelectorFields.FeedItem.FEED_ITEM_ID, feedItemId);
  }

  /**
   * Retrieves FeedItems by status.
   *
   * @param status
   * @return a list of FeedItems matching the status
   * @throws RemoteException for communication-related exceptions
   */
  public List<FeedItem> getByStatus(FeedItemStatus status) throws RemoteException {
    return getByField(SelectorFields.FeedItem.STATUS, status);
  }
}
