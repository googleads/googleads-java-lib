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

import com.google.api.ads.adwords.axis.v201502.o.CampaignEstimate;
import com.google.api.ads.adwords.axis.v201502.o.TrafficEstimatorSelector;
import com.google.api.ads.adwords.axis.v201502.o.TrafficEstimatorServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * Specific AbstractBaseDelegate for {@link TrafficEstimatorServiceInterface}.
 *
 * @author Julian Toledo
 */
public final class TrafficEstimatorDelegate
    extends AbstractBaseDelegate<TrafficEstimatorServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public TrafficEstimatorDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, TrafficEstimatorServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  TrafficEstimatorDelegate(AdWordsSession adWordsSession,
      TrafficEstimatorServiceInterface service) {
    super(adWordsSession, service);
  }

  /**
   * Retrieves all CampaignEstimates for the ManagedCustomer associate with the adWordsSession
   * the TrafficEstimatorSelector does not need fields.
   *
   * @param trafficEstimatorSelector a {@code TrafficEstimatorSelector}
   * @return All the CampaignEstimates for the ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignEstimate> get(TrafficEstimatorSelector trafficEstimatorSelector)
      throws RemoteException {
    return Arrays.asList(getService().get(trafficEstimatorSelector).getCampaignEstimates());
  }
}
