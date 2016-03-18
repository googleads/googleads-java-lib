// Copyright 2011, Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.common.lib.client;

import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;

/**
 * Interface for handling headers.
 */
public interface HeaderHandler<S extends AdsSession, D extends AdsServiceDescriptor> {

  /**
   * Sets the headers on the SOAP client using the session and descriptor.
   *
   * @param soapClient the SOAP client
   * @param adsSession the ads session
   * @param adsServiceDescriptor the ads service descriptor
   * @throws ServiceException if there was a problem setting the headers
   * @throws AuthenticationException if there was a problem authenticating the
   *     session
   */
  void setHeaders(Object soapClient, S adsSession, D adsServiceDescriptor)
      throws ServiceException, AuthenticationException;
  
  /**
   * No-op implementation of HeaderHandler 
   */
  public static class NoOpHeaderHandler<S extends AdsSession, D extends AdsServiceDescriptor>
    implements HeaderHandler<S, D>{

    @Override
    public void setHeaders(Object soapClient, S adsSession, D adsServiceDescriptor)
        throws ServiceException, AuthenticationException {
      // No-op
    }
  }
}
