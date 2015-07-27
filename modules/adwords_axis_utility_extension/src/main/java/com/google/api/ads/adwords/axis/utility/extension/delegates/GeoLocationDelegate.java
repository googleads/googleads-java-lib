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

import com.google.api.ads.adwords.axis.utility.extension.exception.UtilityLibraryException;
import com.google.api.ads.adwords.axis.v201506.cm.Address;
import com.google.api.ads.adwords.axis.v201506.cm.GeoLocation;
import com.google.api.ads.adwords.axis.v201506.cm.GeoLocationSelector;
import com.google.api.ads.adwords.axis.v201506.cm.GeoLocationServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * Specific AbstractBaseDelegate for {@link GeoLocationServiceInterface}.
 *
 * @author Julian Toledo
 */
public final class GeoLocationDelegate extends AbstractBaseDelegate<GeoLocationServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public GeoLocationDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, GeoLocationServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  GeoLocationDelegate(AdWordsSession adWordsSession, GeoLocationServiceInterface service) {
    super(adWordsSession, service);
  }

  /**
   * Retrieves the GeoLocations for the list of addresses.
   *
   * @param addresses list of addresses {@code Address}
   * @return the list of GeoLocations matching the addresses
   * @throws RemoteException for communication-related exceptions
   */
  public List<GeoLocation> getGeoLocation(List<Address> addresses) throws RemoteException {
    GeoLocationSelector geoLocationSelector = new GeoLocationSelector();
    geoLocationSelector.setAddresses(addresses.toArray((new Address[] {})));
    return Arrays.asList(getService().get(geoLocationSelector));
  }

  /**
   * Retrieves the GeoLocations for an addresses.
   *
   * @param address a single {@code Address}
   * @return a single GeoLocation matching the addresses
   * @throws UtilityLibraryException if result is empty
   * @throws RemoteException for communication-related exceptions
   */
  public GeoLocation getGeoLocation(Address address) throws RemoteException {
    GeoLocationSelector geoLocationSelector = new GeoLocationSelector();
    geoLocationSelector.setAddresses(new Address[]{address});
    GeoLocation[] array = getService().get(geoLocationSelector);
    if (array != null && array.length > 0) {
      return array[0];
    } else {
      throw new UtilityLibraryException("Error: result empty for getGeoLocation");
    }
  }
}
