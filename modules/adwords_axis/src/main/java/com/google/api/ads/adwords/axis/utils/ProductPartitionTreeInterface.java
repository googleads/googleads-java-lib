// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.axis.utils;

import com.google.api.ads.common.lib.utils.AdsUtility;
import com.google.api.ads.common.lib.utils.UsesAdsUtilities;

import java.util.List;

/**
 * An object to simplify the process of updating {@code ProductPartition} objects
 * for shopping campaigns.
 *
 * @param <PartitionNodeT> the {@code ProductPartitionNode} type for a specific API version and SOAP
 * toolkit.
 * @param <OperationT> the {@code AdGroupCriterionOperation} type for a specific API version and
 * SOAP toolkit.
 */
public interface ProductPartitionTreeInterface<PartitionNodeT, OperationT> {

  /**
   * Returns the ID of the ad group for this tree.
   */
  Long getAdGroupId();

  /**
   * Returns the root node of this tree. This <em>will not be null</em>.
   */
  PartitionNodeT getRoot();

  /**
   * Returns the {@code AdGroupCriterionOperation}s that will apply the changes made to this tree.
   */
  @UsesAdsUtilities({AdsUtility.PRODUCT_PARTITION_TREE})
  List<OperationT> getMutateOperations();
}
