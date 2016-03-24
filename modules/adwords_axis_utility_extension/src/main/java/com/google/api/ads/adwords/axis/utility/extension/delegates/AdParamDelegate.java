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
import com.google.api.ads.adwords.axis.utils.v201603.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201603.cm.AdParam;
import com.google.api.ads.adwords.axis.v201603.cm.AdParamOperation;
import com.google.api.ads.adwords.axis.v201603.cm.AdParamServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link AdParam}.
 *
 * <p>
 * Implementation is not thread-safe,
 * because AdWordsSession and Apache Axis service objects are not thread-safe.
 * </p>
 */
public final class AdParamDelegate extends
    AbstractGetMutateDelegate<AdParam, AdParamOperation, AdParamServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public AdParamDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.AdParam.all(), AdParam.class, AdParamOperation.class,
        AdParamServiceInterface.class);
  }

  /**
   * Default Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  AdParamDelegate(AdWordsSession adWordsSession, AdParamServiceInterface service) {
    super(adWordsSession, SelectorFields.AdParam.all(), AdParam.class, AdParamOperation.class,
        service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public AdParamDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.AdParam> selectorFields) {
    super(adWordsSession, selectorFields, AdParam.class, AdParamOperation.class,
        AdParamServiceInterface.class);
  }

  /**
   * Retrieves AdParams by adGroupId.
   *
   * @param adGroupId
   * @return a list of AdParams matching the adGroupId
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdParam> getByAdGroupId(Long adGroupId) throws RemoteException {
    return getByField(SelectorFields.AdParam.ADGROUP_ID, adGroupId);
  }

  /**
   * Retrieves AdParams by adGroupId and criterionId.
   *
   * @param adGroupId
   * @param criterionId
   * @return a list of AdParams matching the adGroupId and criterionId
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdParam> getByAdGroupIdCriterionId(Long adGroupId, Long criterionId)
      throws RemoteException {
    SelectorBuilder builder = createSelectorBuilder()
      .equals(SelectorFields.AdParam.ADGROUP_ID.getField(), String.valueOf(adGroupId))
      .equals(SelectorFields.AdParam.CRITERION_ID.getField(), String.valueOf(criterionId));
    return get(builder.build());
  }
}
