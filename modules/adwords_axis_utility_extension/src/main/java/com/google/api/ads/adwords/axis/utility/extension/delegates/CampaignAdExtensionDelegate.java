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
import com.google.api.ads.adwords.axis.v201309.cm.CampaignAdExtension;
import com.google.api.ads.adwords.axis.v201309.cm.CampaignAdExtensionOperation;
import com.google.api.ads.adwords.axis.v201309.cm.CampaignAdExtensionServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link CampaignAdExtension}.
 *
 * @author Julian Toledo
 */
public final class CampaignAdExtensionDelegate extends AbstractGetMutateDelegate<
    CampaignAdExtension, CampaignAdExtensionOperation, CampaignAdExtensionServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public CampaignAdExtensionDelegate(AdWordsSession adWordsSession, boolean includeBetaFields) {
    super(adWordsSession, SelectorFields.CampaignAdExtension.all(includeBetaFields),
        CampaignAdExtension.class, CampaignAdExtensionOperation.class,
        CampaignAdExtensionServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the service class for CampaignAdExtensionServiceInterface
   * @param includeBetaFields
   */
  public CampaignAdExtensionDelegate(AdWordsSession adWordsSession,
      CampaignAdExtensionServiceInterface service, boolean includeBetaFields) {
    super(adWordsSession, SelectorFields.CampaignAdExtension.all(includeBetaFields),
        CampaignAdExtension.class, CampaignAdExtensionOperation.class, service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public CampaignAdExtensionDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.CampaignAdExtension> selectorFields) {
    super(adWordsSession, selectorFields, CampaignAdExtension.class,
        CampaignAdExtensionOperation.class, CampaignAdExtensionServiceInterface.class);
  }

  /**
   * Retrieves CampaignAdExtensions by adExtensionId.
   *
   * @param adExtensionId
   * @return a list of CampaignAdExtensions matching the adExtensionId
   * @throws RemoteException for communication-related exceptions
   */
  public CampaignAdExtension getByAdExtensionId(Long adExtensionId) throws RemoteException {
    return getOneByField(SelectorFields.CampaignAdExtension.AD_EXTENSION_ID, adExtensionId);
  }

  /**
   * Retrieves CampaignAdExtensions by campaignIds.
   *
   * @param campaignIds
   * @return a list of CampaignAdExtensions matching the campaignIds
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignAdExtension> getByCampaignId(List<Long> campaignIds) throws RemoteException {
    return getByField(SelectorFields.CampaignAdExtension.CAMPAIGN_ID, campaignIds);
  }

  /**
   * Retrieves CampaignAdExtensions by campaignId.
   *
   * @param campaignId
   * @return a list of CampaignAdExtensions matching the campaignId
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignAdExtension> getByCampaignId(Long campaignId) throws RemoteException {
    return getByField(SelectorFields.CampaignAdExtension.CAMPAIGN_ID, campaignId);
  }

  /**
   * Retrieves CampaignAdExtensions by campaignId in the range (startIndex, numberResults).
   *
   * @param campaignId
   * @param startIndex index of the first result
   * @param numberResults number of results 
   * @return a list of CampaignAdExtensions matching the campaignId in the range
   *         (startIndex, numberResults)
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignAdExtension> getByCampaignId(Long campaignId, int startIndex,
      int numberResults) throws RemoteException {
    return getByField(SelectorFields.CampaignAdExtension.CAMPAIGN_ID, campaignId, startIndex,
        numberResults);
  }
}