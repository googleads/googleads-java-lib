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
import com.google.api.ads.adwords.axis.v201402.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link AdGroupAd}.
 *
 * @author Julian Toledo
 */
public final class AdGroupAdDelegate extends
    AbstractGetMutateDelegate<AdGroupAd, AdGroupAdOperation, AdGroupAdServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public AdGroupAdDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.AdGroupAd.all(), AdGroupAd.class, AdGroupAdOperation.class,
        AdGroupAdServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  public AdGroupAdDelegate(AdWordsSession adWordsSession, AdGroupAdServiceInterface service) {
    super(adWordsSession, SelectorFields.AdGroupAd.all(), AdGroupAd.class, AdGroupAdOperation.class,
        service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public AdGroupAdDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.AdGroupAd> selectorFields) {
    super(adWordsSession, selectorFields, AdGroupAd.class, AdGroupAdOperation.class,
        AdGroupAdServiceInterface.class);
  }

  /**
   * Retrieves AdGroupAds by adIds.
   *
   * @param adId
   * @return a list of AdGroupAds matching the adIds
   *         or a RemoteException/ApiException in the client library call
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupAd getByAdId(Long adId) throws RemoteException {
    return getOneByField(SelectorFields.AdGroupAd.ID, adId);
  }

  /**
   * Retrieves AdGroupAds by adGroupIds.
   *
   * @param adGroupIds
   * @return a list of AdGroupAds matching the adGroupIds
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupAd> getByAdGroupId(List<Long> adGroupIds) throws RemoteException {
    return getByField(SelectorFields.AdGroupAd.ADGROUP_ID, adGroupIds);
  }

  /**
   * Retrieves AdGroupAds by adGroupId.
   *
   * @param adGroupId
   * @return a list of AdGroupAds matching the adGroupId
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupAd> getByAdGroupId(Long adGroupId) throws RemoteException {
    return getByField(SelectorFields.AdGroupAd.ADGROUP_ID, adGroupId);
  }

  /**
   * Retrieves AdGroupAds by adGroupId.
   *
   * @param adGroupId
   * @param numberResults number of results
   * @param startIndex index of the first result
   * @return a list of AdGroupAds matching the adGroupId in the range (startIndex, numberResults)
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupAd> getByAdGroupId(Long adGroupId, int startIndex, int numberResults)
      throws RemoteException {
    return getByField(SelectorFields.AdGroupAd.ADGROUP_ID, adGroupId, startIndex, numberResults);
  }
}