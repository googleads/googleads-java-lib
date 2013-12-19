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
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceClientFactoryInterface;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceDescriptorFactoryInterface;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.common.annotations.VisibleForTesting;

import java.net.MalformedURLException;

/**
 * Abstract helper for {@link AdsServiceClientFactoryHelper}.
 *
 * @param <C> the type of {@link AdsServiceClient}
 * @param <S> the type of {@link AdsSession}
 * @param <D> the type of {@link AdsServiceDescriptor}
 *
 * @author Adam Rogal
 */
public abstract class BaseAdsServiceClientFactoryHelper<C extends AdsServiceClient<S, D>,
                                                        S extends AdsSession,
                                                        D extends AdsServiceDescriptor>
    implements AdsServiceClientFactoryHelper<C, S, D> {

  private final AdsServiceClientFactoryInterface<C, S, D> adsServiceClientFactory;
  private final AdsServiceDescriptorFactoryInterface<D> adsServiceDescriptorFactory;
  private final SoapClientHandlerInterface<?> soapClientHandler;

  /**
   * Constructor.
   *
   * @param adsServiceClientFactory the Guice service client factory.
   */
  public BaseAdsServiceClientFactoryHelper(
      AdsServiceClientFactoryInterface<C, S, D> adsServiceClientFactory,
      AdsServiceDescriptorFactoryInterface<D> adsServiceDescriptorFactory,
      SoapClientHandlerInterface<?> soapClientHandler) {
    this.adsServiceClientFactory = adsServiceClientFactory;
    this.adsServiceDescriptorFactory = adsServiceDescriptorFactory;
    this.soapClientHandler = soapClientHandler;
  }

  /**
   * Creates an {@link AdsServiceClient} given an {@link AdsServiceDescriptor}
   * descriptor and an {@link AdsSession}.
   *
   * @param adsServiceDescriptor descriptor with information on ads service
   * @param adsSession the session associated with the desired
   *     client
   * @return the created {@link AdsServiceClient}
   * @throws ServiceException if the ads service client could not be created
   */
  public C createAdsServiceClient(D adsServiceDescriptor, S adsSession) throws ServiceException {
    Object soapClient = createSoapClient(adsServiceDescriptor);
    C adsServiceClient = createServiceClient(soapClient, adsServiceDescriptor, adsSession);
    try {
      adsServiceClient.setEndpointAddress(adsServiceDescriptor.getEndpointAddress(adsSession
          .getEndpoint()));
    } catch (MalformedURLException e) {
      throw new ServiceException("Unexpected exception", e);
    }
    return adsServiceClient;
  }

  /**
   * Creates the service client from the factory, descriptor, and SOAP client.
   */
  @VisibleForTesting
  C createServiceClient(Object soapClient, D adsServiceDescriptor, S adsSession) {
    return adsServiceClientFactory.create(soapClient, adsServiceDescriptor, adsSession);
  }

  /**
   * Creates an {@link AdsServiceDescriptor} for a specified service.
   *
   * @param interfaceClass the ads service that we want a descriptor for
   * @param version the version of the service
   * @return a descriptor of the requested service
   */
  public D createServiceDescriptor(Class<?> interfaceClass, String version) {
    return adsServiceDescriptorFactory.create(interfaceClass, version);
  }

  /**
   * Creates the SOAP client from the SOAP client handler.
   */
  @VisibleForTesting
  Object createSoapClient(D adsServiceDescriptor) {
    return soapClientHandler.createSoapClient(adsServiceDescriptor);
  }
}

