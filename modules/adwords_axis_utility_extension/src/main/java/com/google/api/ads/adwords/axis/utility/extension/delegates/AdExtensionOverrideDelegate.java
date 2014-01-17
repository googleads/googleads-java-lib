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

import com.google.api.ads.adwords.axis.utility.extension.util.ListUtil;
import com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverride;
import com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverrideOperation;
import com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverrideSelector;
import com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverrideServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.primitives.Longs;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link AdExtensionOverride}.
 *
 * <p>
 * Implementation is not thread-safe,
 * because AdWordsSession and Apache Axis service objects are not thread-safe.
 * </p>
 *
 * @author Julian Toledo
 */
public final class AdExtensionOverrideDelegate
    extends AbstractGetMutateDelegate<AdExtensionOverride, AdExtensionOverrideOperation,
    AdExtensionOverrideServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public AdExtensionOverrideDelegate(AdWordsSession adWordsSession) {
    // Fields are not necessary for Services that do not use Generic Selectors
    super(adWordsSession, AdExtensionOverride.class, AdExtensionOverrideOperation.class,
        AdExtensionOverrideServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  public AdExtensionOverrideDelegate(AdWordsSession adWordsSession,
      AdExtensionOverrideServiceInterface service) {
    // Fields are not necessary for Services that do not use Generic Selectors
    super(adWordsSession, AdExtensionOverride.class, AdExtensionOverrideOperation.class,
        service);
  }

  /**
   * Retrieves all AdExtensionOverrides for the ManagedCustomer associate with the adWordsSession.
   * Overrides AwAbstractGetDelegate method to change to specific (non-generic) selector.
   *
   * @return All the AdExtensionOverrides for the ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  @Override
  public List<AdExtensionOverride> get() throws RemoteException {
    return get(new AdExtensionOverrideSelector());
  }

  /**
   * Retrieves all AdExtensionOverrides for the ManagedCustomer associate with the adWordsSession.
   * Overrides AwAbstractGetDelegate method to change to specific (non-generic) selector.
   *
   * @param selector the AdExtensionOverrideSelector for the service call
   * @return All the AdExtensionOverrides for the ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdExtensionOverride> get(AdExtensionOverrideSelector selector)
      throws RemoteException {
    return ListUtil.asList(getService().get(selector).getEntries());
  }

  /**
   * Retrieves AdExtensionOverrides by adIds.
   *
   * @param adIds a list of Ad id
   * @return a list of AdExtensionOverrides matching the adIds
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdExtensionOverride> getByAdId(List<Long> adIds) throws RemoteException {
    AdExtensionOverrideSelector selector = new AdExtensionOverrideSelector();
    if (adIds != null) {
      selector.setAdIds(Longs.toArray(adIds));
    }
    return get(selector);
  }

  /**
   * Retrieves AdExtensionOverrides by adIds.
   *
   * @param adId the Ad id
   * @return a list of AdExtensionOverrides matching the adIds
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdExtensionOverride> getByCampaignIdAdId(Long campaignId, Long adId)
      throws RemoteException {
    AdExtensionOverrideSelector selector = new AdExtensionOverrideSelector();
    if (adId != null) {
      selector.setAdIds(new long[]{adId});
    }
    if (campaignId != null) {
      selector.setCampaignIds(new long[]{campaignId});
    }
    return get(selector);
  }

  /**
   * Retrieves AdExtensionOverrides by adExtensionIds.
   *
   * @param adExtensionIds
   * @return a list of AdExtensionOverrides matching the adExtensionIds
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdExtensionOverride> getByAdExtensionId(List<Long> adExtensionIds)
      throws RemoteException {
    AdExtensionOverrideSelector selector = new AdExtensionOverrideSelector();
    if (adExtensionIds != null) {
      selector.setAdExtensionIds(Longs.toArray(adExtensionIds));
    }
    return get(selector);
  }

  /**
   * Retrieves AdExtensionOverrides by campaignIds.
   *
   * @param campaignIds
   * @return a list of AdExtensionOverrides matching the campaignIds
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdExtensionOverride> getByCampaignId(List<Long> campaignIds) throws RemoteException {
    AdExtensionOverrideSelector selector = new AdExtensionOverrideSelector();
    if (campaignIds != null) {
      selector.setCampaignIds(Longs.toArray(campaignIds));
    }
    return get(selector);
  }

  /**
   * Retrieves AdExtensionOverrides by campaignId.
   *
   * @param campaignId
   * @return a list of AdExtensionOverrides matching the campaignId
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdExtensionOverride> getByCampaignId(Long campaignId) throws RemoteException {
    AdExtensionOverrideSelector selector = new AdExtensionOverrideSelector();
    if (campaignId != null) {
      selector.setCampaignIds(new long[] { campaignId.longValue() });
    }
    return get(selector);
  }
}
