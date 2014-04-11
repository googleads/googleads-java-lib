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
import com.google.api.ads.adwords.axis.utils.v201402.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201402.cm.CampaignCriterion;
import com.google.api.ads.adwords.axis.v201402.cm.CampaignCriterionOperation;
import com.google.api.ads.adwords.axis.v201402.cm.CampaignCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201402.cm.CriterionType;
import com.google.api.ads.adwords.lib.client.AdWordsSession;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link CampaignCriterion}.
 *
 * <p>
 * Implementation is not thread-safe,
 * because AdWordsSession and Apache Axis service objects are not thread-safe.
 * </p>
 *
 * @author Julian Toledo
 */
public final class CampaignCriterionDelegate extends AbstractGetMutateDelegate<CampaignCriterion,
    CampaignCriterionOperation, CampaignCriterionServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public CampaignCriterionDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.CampaignCriterion.all(), CampaignCriterion.class,
        CampaignCriterionOperation.class, CampaignCriterionServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  public CampaignCriterionDelegate(AdWordsSession adWordsSession,
      CampaignCriterionServiceInterface service) {
    super(adWordsSession, SelectorFields.CampaignCriterion.all(), CampaignCriterion.class,
        CampaignCriterionOperation.class, service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public CampaignCriterionDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.CampaignCriterion> selectorFields) {
    super(adWordsSession, selectorFields, CampaignCriterion.class,
        CampaignCriterionOperation.class, CampaignCriterionServiceInterface.class);
  }

  /**
   * Retrieves CampaignCriterions by campaignId and CriterionId.
   * (CriterionId is not unique by itself).
   *
   * @param campaignId
   * @param criterionId
   * @return a list of CampaignCriterions matching the adGroupId and adGroupId
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignCriterion> getByCampaignIdCriterionId(long campaignId, long criterionId)
      throws RemoteException {
    SelectorBuilder builder = createSelectorBuilder()
      .equals(SelectorFields.CampaignCriterion.CAMPAIGN_ID.getField(), String.valueOf(campaignId))
      .equals(SelectorFields.CampaignCriterion.ID.getField(), String.valueOf(criterionId));
    return get(builder.build());
  }

  /**
   * Retrieves CampaignCriterions by campaignIds.
   *
   * @param campaignIds
   * @return a list of CampaignCriterions matching campaignIds
   * @throws RemoteException for communication-related exceptions 
   */
  public List<CampaignCriterion> getByCampaignId(List<Long> campaignIds) throws RemoteException {
    return getByField(SelectorFields.CampaignCriterion.CAMPAIGN_ID, campaignIds);
  }

  /**
   * Retrieves CampaignCriterions by campaignId.
   *
   * @param campaignId
   * @return a list of CampaignCriterions matching campaignId
   * @throws RemoteException for communication-related exceptions 
   */
  public List<CampaignCriterion> getByCampaignId(Long campaignId) throws RemoteException {
    return getByField(SelectorFields.CampaignCriterion.CAMPAIGN_ID, campaignId);
  }

  /**
   * Retrieves CampaignCriterions by campaignId in the range (startIndex, numberResults).
   *
   * @param campaignId
   * @param startIndex index of the first result
   * @param numberResults number of results 
   * @return a list of CampaignCriterions matching the campaignId
   *         in the range (startIndex, numberResults)
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignCriterion> getByCampaignId(Long campaignId, int startIndex,
      int numberResults) throws RemoteException {
    return getByField(SelectorFields.CampaignCriterion.CAMPAIGN_ID, campaignId, startIndex,
        numberResults);
  }

  /**
   * Retrieves CampaignCriterions by CriterionType.
   *
   * @param criterionType {@code CriterionType}
   * @return a list of CampaignCriterions matching the criterionType
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignCriterion> getByCriterionType(CriterionType criterionType)
      throws RemoteException {
    return getByField(SelectorFields.CampaignCriterion.CRITERIA_TYPE, criterionType.getValue());
  }

  /**
   * Retrieves CampaignCriterions by campaignId and CriterionType.
   *
   * @param campaignId
   * @param criterionType {@code CriterionType}
   * @return a list of CampaignCriterions matching the campaignId and criterionType
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignCriterion> getByCampaignIdCriterionType(Long campaignId,
      CriterionType criterionType) throws RemoteException {
    SelectorBuilder builder = createSelectorBuilder()
      .equals(SelectorFields.CampaignCriterion.CAMPAIGN_ID.getField(), String.valueOf(campaignId))
      .equals(SelectorFields.CampaignCriterion.CRITERIA_TYPE.getField(), criterionType.getValue());
    return get(builder.build());
  }
}
