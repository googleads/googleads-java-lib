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

import com.google.api.ads.adwords.axis.v201402.mcm.Alert;
import com.google.api.ads.adwords.axis.v201402.mcm.AlertSelector;
import com.google.api.ads.adwords.axis.v201402.mcm.AlertServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;

import java.rmi.RemoteException;

/**
 * Specific AbstractBaseDelegate for {@link AlertServiceInterface}.
 *
 * @author Julian Toledo
 */
public final class AlertDelegate extends AbstractBaseDelegate<AlertServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the handler/service
   */
  public AlertDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, AlertServiceInterface.class);
  }
  
  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the handler/service
   * @param service the custom service class for the SOAP service
   */
  public AlertDelegate(AdWordsSession adWordsSession, AlertServiceInterface service) {
    super(adWordsSession, service);
  }


  /**
   * Retrieves all Alerts for the ManagedCustomer associate with the adWordsSession 
   * the AlertSelector does not need fields.
   *
   * @param alertSelector a {@code AlertSelector}
   * @return All the Alert for the ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public Alert[] get(AlertSelector alertSelector) throws RemoteException {
    return getService().get(alertSelector).getEntries();
  }
}