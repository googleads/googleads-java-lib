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
import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Inject;

import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

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
  @SuppressWarnings("unchecked") // Guice lacks support for template type literals.
  @Inject
  public AdsServiceClientFactory(
      @SuppressWarnings("rawtypes") /* Guice lacks support for template type literals.*/
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
    return createServiceClientProxy(adsServiceDescriptor, adsServiceClient);
  }

  /**
   * Creates a proxy around the given {@link AdsServiceClient}.
   *
   * @param <T> the service type
   * @param adsServiceDescriptor descriptor with information on ads service
   * @param adsServiceClient client to be wrapped in a proxy
   * @return the proxy
   */
  @VisibleForTesting
  protected <T> T createServiceClientProxy(D adsServiceDescriptor, C adsServiceClient) {
    Set<Class<?>> interfaces = new HashSet<Class<?>>();
    Collections.addAll(interfaces, adsServiceClient.getClass().getInterfaces());
    interfaces.add(adsServiceDescriptor.getInterfaceClass());
    return createProxy(adsServiceClient, interfaces);
  }

  /**
   * Creates the proxy for the {@link AdsServiceClient}.
   *
   * @param <T> the service type
   * @param adsServiceClient the client to proxy
   * @param interfaces the interfaces to proxy
   * @return the proxy
   */
  <T> T createProxy(C adsServiceClient, Set<Class<?>> interfaces) {
    // Suppressing warning about casting the returned Proxy to generic class T.
    @SuppressWarnings("unchecked") T proxy = (T) Proxy.newProxyInstance(
        adsServiceClient.getSoapClient().getClass().getClassLoader(),
        interfaces.toArray(new Class[] {}), adsServiceClient);
    return proxy;
  }
}
