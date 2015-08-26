// Copyright 2014 Google Inc. All Rights Reserved.
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

import com.google.api.ads.adwords.axis.utility.extension.util.SelectorFields.FieldType;
import com.google.api.ads.adwords.axis.v201506.cm.CampaignLabel;
import com.google.api.ads.adwords.axis.v201506.cm.CampaignLabelOperation;
import com.google.api.ads.adwords.axis.v201506.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;

/**
 * Specific AbstractGetMutateDelegate for {@link CampaignLabel}.
 *
 * <p>Labels are linked (ADD and REMOVE) to Campaigns using the CampaignServiceInterface,
 * GETs in the other hand are in the LabelService.</p>
 *
 * <p>Implementation is not thread-safe, because AdWordsSession
 * and Apache Axis service objects are not thread-safe.</p>
 */
public final class CampaignLabelDelegate extends
    AbstractGetMutateDelegate<CampaignLabel, CampaignLabelOperation, CampaignServiceInterface> {

  private static final String MUTATE_LABEL = "mutateLabel";

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  protected CampaignLabelDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, new ArrayList<FieldType<CampaignLabel>>(),
        CampaignLabel.class, CampaignLabelOperation.class,
        CampaignServiceInterface.class, MUTATE_LABEL);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  CampaignLabelDelegate(AdWordsSession adWordsSession, CampaignServiceInterface service) {
    super(adWordsSession, new ArrayList<FieldType<CampaignLabel>>(),
        CampaignLabel.class, CampaignLabelOperation.class, service, MUTATE_LABEL);
  }
}
