// Copyright 2013 Google Inc. All Rights Reserved.
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
import com.google.api.ads.adwords.axis.v201402.cm.AdGroupBidModifier;
import com.google.api.ads.adwords.axis.v201402.cm.AdGroupBidModifierOperation;
import com.google.api.ads.adwords.axis.v201402.cm.AdGroupBidModifierServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link AdGroupBidModifier}.
 *
 * @author Julian Toledo
 */
public final class AdGroupBidModifierDelegate extends AbstractGetMutateDelegate<AdGroupBidModifier,
    AdGroupBidModifierOperation, AdGroupBidModifierServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public AdGroupBidModifierDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.AdGroupBidModifier.all(), AdGroupBidModifier.class,
        AdGroupBidModifierOperation.class, AdGroupBidModifierServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  public AdGroupBidModifierDelegate(AdWordsSession adWordsSession,
      AdGroupBidModifierServiceInterface service) {
    super(adWordsSession, SelectorFields.AdGroupBidModifier.all(),
        AdGroupBidModifier.class, AdGroupBidModifierOperation.class, service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public AdGroupBidModifierDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.AdGroupBidModifier> selectorFields) {
    super(adWordsSession, selectorFields, AdGroupBidModifier.class,
        AdGroupBidModifierOperation.class, AdGroupBidModifierServiceInterface.class);
  }

  /**
   * Retrieves AdGroupBidModifier by adGroupId.
   *
   * @param adGroupId
   * @return a list of AdGroupBidModifiers matching the adGroupId
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupBidModifier> getByAdGroupId(Long adGroupId) throws RemoteException {
    return getByField(SelectorFields.AdGroupBidModifier.ADGROUP_ID, adGroupId);
  }

  /**
   * Retrieves AdGroupBidModifiers by campaignId.
   *
   * @param campaignId
   * @return a list of AdGroupBidModifiers matching the campaignId
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupBidModifier> getByCampaignId(Long campaignId) throws RemoteException {
    return getByField(SelectorFields.AdGroupBidModifier.CAMPAIGN_ID, campaignId);
  }
}