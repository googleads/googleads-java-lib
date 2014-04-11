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
import com.google.api.ads.adwords.axis.v201402.cm.ConversionTracker;
import com.google.api.ads.adwords.axis.v201402.cm.ConversionTrackerOperation;
import com.google.api.ads.adwords.axis.v201402.cm.ConversionTrackerServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link ConversionTracker}.
 *
 * @author Julian Toledo
 */
public final class ConversionTrackerDelegate extends AbstractGetMutateDelegate<ConversionTracker,
    ConversionTrackerOperation, ConversionTrackerServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public ConversionTrackerDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.ConversionTracker.all(), ConversionTracker.class,
        ConversionTrackerOperation.class, ConversionTrackerServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  public ConversionTrackerDelegate(AdWordsSession adWordsSession,
      ConversionTrackerServiceInterface service) {
    super(adWordsSession, SelectorFields.ConversionTracker.all(), ConversionTracker.class,
        ConversionTrackerOperation.class, service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public ConversionTrackerDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.ConversionTracker> selectorFields) {
    super(adWordsSession, selectorFields, ConversionTracker.class,
        ConversionTrackerOperation.class, ConversionTrackerServiceInterface.class);
  }

  /**
   * Retrieves ConversionTrackers by conversionTrackerId.
   *
   * @param conversionTrackerId
   * @return a list of ConversionTrackers matching conversionTrackerId
   * @throws RemoteException for communication-related exceptions
   */
  public ConversionTracker getById(long conversionTrackerId) throws RemoteException {
    return getOneByField(SelectorFields.ConversionTracker.ID, conversionTrackerId);
  }
}