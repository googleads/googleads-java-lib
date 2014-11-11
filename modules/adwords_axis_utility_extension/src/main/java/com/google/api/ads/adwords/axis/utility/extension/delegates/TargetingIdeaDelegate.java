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

import com.google.api.ads.adwords.axis.v201409.o.TargetingIdea;
import com.google.api.ads.adwords.axis.v201409.o.TargetingIdeaSelector;
import com.google.api.ads.adwords.axis.v201409.o.TargetingIdeaServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * Specific AbstractBaseDelegate for {@link TargetingIdeaServiceInterface}.
 *
 * @author Julian Toledo
 */
public final class TargetingIdeaDelegate 
    extends AbstractBaseDelegate<TargetingIdeaServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public TargetingIdeaDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, TargetingIdeaServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  TargetingIdeaDelegate(AdWordsSession adWordsSession,
      TargetingIdeaServiceInterface service) {
    super(adWordsSession, service);
  }

  /**
   * Retrieves a small number of TargetingIdeas for the ManagedCustomer
   * associate with the adWordsSession, for a larger set use getBulkKeywordIdeas
   * The TargetingIdeaSelector does not need fields.
   *
   * @param targetingIdeaSelector a {@code TargetingIdeaSelector}
   * @return a small number of TargetingIdeas for the ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<TargetingIdea> get(TargetingIdeaSelector targetingIdeaSelector)
      throws RemoteException {
    return Arrays.asList(getService().get(targetingIdeaSelector).getEntries());
  }
}
