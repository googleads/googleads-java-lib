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
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupBidLandscape;
import com.google.api.ads.adwords.axis.v201502.cm.DataServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetDelegate for {@link AdGroupBidLandscape}.
 *
 * <p>
 * Implementation is not thread-safe,
 * because AdWordsSession and Apache Axis service objects are not thread-safe.
 * </p>
 *
 * @author Julian Toledo
 */
public final class DataAdGroupBidLandscapeDelegate extends
    AbstractGetDelegate<AdGroupBidLandscape, DataServiceInterface> {

  public static final String GET_METHOD_NAME = "getAdGroupBidLandscape";

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public DataAdGroupBidLandscapeDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, AdGroupBidLandscape.class, DataServiceInterface.class,
        SelectorFields.AdGroupBidLandscape.all());
    // Changing the "get" method name for DataServiceInterface
    this.setGetMethodName(GET_METHOD_NAME);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  DataAdGroupBidLandscapeDelegate(AdWordsSession adWordsSession,
      DataServiceInterface service) {
    super(adWordsSession, AdGroupBidLandscape.class, service,
        SelectorFields.AdGroupBidLandscape.all());
    // Changing the "get" method name for DataServiceInterface
    this.setGetMethodName(GET_METHOD_NAME);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public DataAdGroupBidLandscapeDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.AdGroupBidLandscape> selectorFields) {
    super(adWordsSession, AdGroupBidLandscape.class, DataServiceInterface.class, selectorFields);
    // Changing the "get" method name for DataServiceInterface
    this.setGetMethodName(GET_METHOD_NAME);
  }

  /**
   * Retrieves AdGroupBidLandscapes by adGroupId.
   *
   * @param adGroupId
   * @return a list of AdGroupBidLandscapes matching the adGroupId
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupBidLandscape> getByAdGroupId(long adGroupId) throws RemoteException {
    return getByField(SelectorFields.AdGroupBidLandscape.ADGROUP_ID, adGroupId);
  }

  /**
   * Retrieves AdGroupBidLandscapes by campaignId.
   *
   * @param campaignId
   * @return a list of AdGroupBidLandscapes matching the campaignId
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupBidLandscape> getByCampaignId(long campaignId) throws RemoteException {
    return getByField(SelectorFields.AdGroupBidLandscape.CAMPAIGN_ID, campaignId);
  }
}
