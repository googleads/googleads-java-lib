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
import com.google.api.ads.adwords.axis.utils.v201506.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201506.cm.CriterionBidLandscape;
import com.google.api.ads.adwords.axis.v201506.cm.DataServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetDelegate for {@link CriterionBidLandscape}.
 *
 * <p>
 * Implementation is not thread-safe,
 * because AdWordsSession and Apache Axis service objects are not thread-safe.
 * </p>
 */
public final class DataCriterionBidLandscapeDelegate extends
    AbstractGetDelegate<CriterionBidLandscape, DataServiceInterface> {

  public static final String GET_METHOD_NAME = "getCriterionBidLandscape";

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public DataCriterionBidLandscapeDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, CriterionBidLandscape.class, DataServiceInterface.class,
        SelectorFields.CriterionBidLandscape.all());
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
  DataCriterionBidLandscapeDelegate(AdWordsSession adWordsSession,
      DataServiceInterface service) {
    super(adWordsSession, CriterionBidLandscape.class, service,
        SelectorFields.CriterionBidLandscape.all());
    // Changing the "get" method name for DataServiceInterface
    this.setGetMethodName(GET_METHOD_NAME);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public DataCriterionBidLandscapeDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.CriterionBidLandscape> selectorFields) {
    super(adWordsSession, CriterionBidLandscape.class, DataServiceInterface.class, selectorFields);
    // Changing the "get" method name for DataServiceInterface
    this.setGetMethodName(GET_METHOD_NAME);
  }

  /**
   * Retrieves CriterionBidLandscapes by adGroupId and criterionId.
   * (CriterionId is not unique by itself).
   *
   * @param adGroupId
   * @param criterionId
   * @return a list of CriterionBidLandscapes matching the adGroupId and criterionId
   * @throws RemoteException for communication-related exceptions
   */
  public List<CriterionBidLandscape> getByAdGroupIdCriterionId(long adGroupId, long criterionId)
      throws RemoteException {
    SelectorBuilder builder = createSelectorBuilder()
      .equals(SelectorFields.CriterionBidLandscape.ADGROUP_ID.getField(), String.valueOf(adGroupId))
      .equals(
           SelectorFields.CriterionBidLandscape.CRITERION_ID.getField(),
           String.valueOf(criterionId));
    return get(builder.build());
  }

  /**
   * Retrieves CriterionBidLandscapes by adGroupId.
   *
   * @param adGroupId
   * @return a list of CriterionBidLandscapes matching the adGroupId
   * @throws RemoteException for communication-related exceptions
   */
  public List<CriterionBidLandscape> getByAdGroupId(long adGroupId) throws RemoteException {
    return getByField(SelectorFields.CriterionBidLandscape.ADGROUP_ID, adGroupId);
  }

  /**
   * Retrieves CriterionBidLandscapes by campaignId.
   *
   * @param campaignId
   * @return a list of CriterionBidLandscapes matching the campaignId
   * @throws RemoteException for communication-related exceptions
   */
  public List<CriterionBidLandscape> getByCampaignId(long campaignId) throws RemoteException {
    return getByField(SelectorFields.CriterionBidLandscape.CAMPAIGN_ID, campaignId);
  }
}
