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

package com.google.api.ads.common.lib.factory.helper;

import com.google.api.ads.common.lib.client.AdsServiceClient;
import com.google.api.ads.common.lib.client.AdsServiceDescriptor;
import com.google.api.ads.common.lib.client.AdsSession;
import com.google.api.ads.common.lib.exception.ServiceException;

/**
 * Interface for helpers of factories which creates ads service clients.
 *
 *
 * @param <C> the subclass of {@link AdsServiceClient}
 * @param <S> the subclass of {@link AdsSession}
 * @param <D> the subclass of {@link AdsServiceDescriptor}
 */
public interface AdsServiceClientFactoryHelper<C extends AdsServiceClient<S, D>,
                                               S extends AdsSession,
                                               D extends AdsServiceDescriptor> {

  /**
   * Creates an {@link AdsServiceDescriptor} for a specified service.
   *
   * @param interfaceClass the ads service that we want a descriptor for
   * @param version of the service
   * @return a descriptor of the requested service
   */
   D createServiceDescriptor(Class<?> interfaceClass, String version);

   /**
    * Creates an {@link AdsServiceClient} for the descriptor, session, and
    * endpoint.
    *
    * @param adsServiceDescriptor the ads service descriptor
    * @param adsSession the session
    * @return the service client
    * @throws ServiceException if there was a problem creating the client
    */
   C createAdsServiceClient(D adsServiceDescriptor, S adsSession)
      throws ServiceException;

   /**
    * Determines what API version an ads service belongs to.
    *
    * @param interfaceClass the interface class of the service
    * @return a string representation of the version of this service
    */
    String determineVersion(Class<?> interfaceClass);

    /**
     * Checks preconditions of the session and interface and throws an exception
     * if the client cannot be generated.
     *
     * @param adsSession the session containing the authentication method
     * @param interfaceClass the ads service that a client is being generated for
     * @throws ServiceException if the preconditions are not met for service client
     *         creation
     */
    void checkServiceClientPreconditions(S adsSession, Class<?> interfaceClass)
        throws ServiceException;
}
