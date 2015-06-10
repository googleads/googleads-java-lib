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
import com.google.api.ads.adwords.axis.v201502.cm.Feed;
import com.google.api.ads.adwords.axis.v201502.cm.FeedOperation;
import com.google.api.ads.adwords.axis.v201502.cm.FeedServiceInterface;
import com.google.api.ads.adwords.axis.v201502.cm.FeedStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link Feed}.
 *
 * @author Julian Toledo
 */
public final class FeedDelegate extends
    AbstractGetMutateDelegate<Feed, FeedOperation, FeedServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public FeedDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.Feed.all(), Feed.class, FeedOperation.class,
        FeedServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  FeedDelegate(AdWordsSession adWordsSession, FeedServiceInterface service) {
    super(adWordsSession, SelectorFields.Feed.all(), Feed.class, FeedOperation.class, service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public FeedDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.Feed> selectorFields) {
    super(adWordsSession, selectorFields, Feed.class, FeedOperation.class,
        FeedServiceInterface.class);
  }

  /**
   * Retrieves Feeds by feedId.
   *
   * @param feedId
   * @return a list of Feeds matching the feedId
   * @throws RemoteException for communication-related exceptions
   */
  public List<Feed> getByFeedId(Long feedId) throws RemoteException {
    return getByField(SelectorFields.Feed.ID, feedId);
  }

  /**
   * Retrieves Feeds by name.
   *
   * @param name
   * @return a list of Feeds matching the name
   * @throws RemoteException for communication-related exceptions
   */
  public List<Feed> getByName(String name) throws RemoteException {
    return getByField(SelectorFields.Feed.NAME, name);
  }

  /**
   * Retrieves Feeds by status.
   *
   * @param status
   * @return a list of Feeds matching the status
   * @throws RemoteException for communication-related exceptions
   */
  public List<Feed> getByStatus(FeedStatus status) throws RemoteException {
    return getByField(SelectorFields.Feed.FEED_STATUS, status);
  }
}
