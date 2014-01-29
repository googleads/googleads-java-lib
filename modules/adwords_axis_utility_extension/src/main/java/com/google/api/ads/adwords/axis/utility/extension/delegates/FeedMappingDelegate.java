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
import com.google.api.ads.adwords.axis.v201309.cm.FeedMapping;
import com.google.api.ads.adwords.axis.v201309.cm.FeedMappingOperation;
import com.google.api.ads.adwords.axis.v201309.cm.FeedMappingServiceInterface;
import com.google.api.ads.adwords.axis.v201309.cm.FeedMappingStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link FeedMapping}.
 *
 * @author Julian Toledo
 */
public final class FeedMappingDelegate extends
    AbstractGetMutateDelegate<FeedMapping, FeedMappingOperation, FeedMappingServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public FeedMappingDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.FeedMapping.all(), FeedMapping.class,
        FeedMappingOperation.class, FeedMappingServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  public FeedMappingDelegate(AdWordsSession adWordsSession, FeedMappingServiceInterface service) {
    super(adWordsSession, SelectorFields.FeedMapping.all(),
        FeedMapping.class, FeedMappingOperation.class, service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public FeedMappingDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.FeedMapping> selectorFields) {
    super(adWordsSession, selectorFields, FeedMapping.class, FeedMappingOperation.class,
        FeedMappingServiceInterface.class);
  }

  /**
   * Retrieves FeedMappings by feedId.
   *
   * @param feedId
   * @return a list of FeedMappings matching the feedId
   * @throws RemoteException for communication-related exceptions
   */
  public List<FeedMapping> getByFeedId(Long feedId) throws RemoteException {
    return getByField(SelectorFields.FeedMapping.FEED_ID, feedId);
  }

  /**
   * Retrieves FeedMappings by feedMappingId.
   *
   * @param feedMappingId
   * @return a list of FeedMappings matching the feedMappingId
   * @throws RemoteException for communication-related exceptions
   */
  public List<FeedMapping> getByFeedMappingId(Long feedMappingId) throws RemoteException {
    return getByField(SelectorFields.FeedMapping.FEED_MAPPING_ID, feedMappingId);
  }

  /**
   * Retrieves FeedMappings by status.
   *
   * @param status
   * @return a list of FeedMappings matching the status
   * @throws RemoteException for communication-related exceptions
   */
  public List<FeedMapping> getByStatus(FeedMappingStatus status) throws RemoteException {
    return getByField(SelectorFields.FeedMapping.STATUS, status);
  }
}