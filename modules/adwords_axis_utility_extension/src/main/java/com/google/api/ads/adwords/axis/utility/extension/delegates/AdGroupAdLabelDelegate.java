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
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAdLabel;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAdLabelOperation;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;

/**
 * Specific AbstractGetMutateDelegate for {@link AdGroupAdLabel}.
 *
 * <p>Labels are linked (ADD and REMOVE) to AdGroupAds using the AdGroupAdServiceInterface,
 * GETs in the other hand are in the LabelService.</p>
 *
 * <p>Implementation is not thread-safe, because AdWordsSession
 * and Apache Axis service objects are not thread-safe.</p>
 *
 * @author Julian Toledo
 */
public final class AdGroupAdLabelDelegate extends
    AbstractGetMutateDelegate<AdGroupAdLabel, AdGroupAdLabelOperation, AdGroupAdServiceInterface> {

  private static final String MUTATE_LABEL = "mutateLabel";

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  protected AdGroupAdLabelDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, new ArrayList<FieldType<AdGroupAdLabel>>(),
        AdGroupAdLabel.class, AdGroupAdLabelOperation.class,
        AdGroupAdServiceInterface.class, MUTATE_LABEL);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  AdGroupAdLabelDelegate(AdWordsSession adWordsSession,
      AdGroupAdServiceInterface service) {
    super(adWordsSession, new ArrayList<FieldType<AdGroupAdLabel>>(),
        AdGroupAdLabel.class, AdGroupAdLabelOperation.class, service, MUTATE_LABEL);
  }
}
