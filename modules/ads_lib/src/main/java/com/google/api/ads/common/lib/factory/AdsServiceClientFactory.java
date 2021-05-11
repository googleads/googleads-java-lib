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

package com.google.api.ads.common.lib.factory;

import com.google.api.ads.common.lib.client.AdsServiceClient;
import com.google.api.ads.common.lib.client.AdsServiceDescriptor;
import com.google.api.ads.common.lib.client.AdsSession;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.factory.helper.AdsServiceClientFactoryHelper;
import com.google.common.collect.Sets;

import java.lang.reflect.Proxy;
import java.util.Set;

import javax.inject.Inject;

/**
 * Factory which creates ads service clients.
 *
 * @param <C> the type of {@link AdsServiceClient}
 * @param <S> the type of {@link AdsSession}
 * @param <D> the type of {@link AdsServiceDescriptor}
 */
public class AdsServiceClientFactory<C extends AdsServiceClient<S, D>,
                                     S extends AdsSession,
                                     D extends AdsServiceDescriptor> {

  private final AdsServiceClientFactoryHelper<C, S, D> adsServiceFactoryHelper;

  /**
   * Constructor.
   *
   * @param adsServiceClientFactoryHelper the ads service client factory helper.
   */
  @SuppressWarnings("unchecked")  /* Guice binding for AdsServiceClientFactoryHelper does not
                                   * include type arguments because AdsServiceClientFactoryHelper
                                   * is bound in the SOAP toolkit-agnostic AdsSoapModule module.
                                   * Therefore, must use the raw type here. */
  @Inject
  public AdsServiceClientFactory(
      @SuppressWarnings("rawtypes") /* See note above for an explanation of why suppressing
                                     * this warning is necessary. */
      AdsServiceClientFactoryHelper adsServiceClientFactoryHelper) {
    this.adsServiceFactoryHelper = adsServiceClientFactoryHelper;
  }

  /**
   * Gets a client given a session and the class of the desired stub interface.
   *
   * @param <T> the service type
   * @param adsSession the session associated with the desired
   *     client
   * @param interfaceClass the class type of the desired client
   * @return a client for the specified ads service
   * @throws ServiceException if the service client could not be created
   */
  public synchronized <T> T getServiceClient(S adsSession, Class<T> interfaceClass)
      throws ServiceException {
    adsServiceFactoryHelper.checkServiceClientPreconditions(adsSession, interfaceClass);
    String version = adsServiceFactoryHelper.determineVersion(interfaceClass);
    D adsServiceDescriptor =
        adsServiceFactoryHelper.createServiceDescriptor(interfaceClass, version);
    C adsServiceClient =
        adsServiceFactoryHelper.createAdsServiceClient(adsServiceDescriptor, adsSession);
    return createProxy(interfaceClass, adsServiceClient);
  }

  /**
   * Creates the proxy for the {@link AdsServiceClient}.
   *
   * @param <T> the service type
   * @param adsServiceClient the client to proxy
   * @return the proxy
   */
  <T> T createProxy(Class<T> interfaceClass, C adsServiceClient) {
    Set<Class<?>> interfaces = Sets.newHashSet(adsServiceClient.getClass().getInterfaces());
    interfaces.add(interfaceClass);
    Object proxy = Proxy.newProxyInstance(
        adsServiceClient.getSoapClient().getClass().getClassLoader(),
        interfaces.toArray(new Class[] {}), adsServiceClient);
    return interfaceClass.cast(proxy);
  }
}
