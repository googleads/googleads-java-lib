// Copyright 2012 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.axis;

import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.conf.AdWordsApiConfiguration;
import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.AuthorizationHeaderHandler;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * AdWords implementation of {@link HeaderHandler} for Axis.
 *
 * @author Adam Rogal
 */
public class AdWordsAxisHeaderHandler implements
    HeaderHandler<AdWordsSession, AdWordsServiceDescriptor> {

  private final SoapClientHandlerInterface<Object> soapClientHandler;
  private final AdWordsApiConfiguration adWordsApiConfiguration;
  private final AuthorizationHeaderHandler authorizationHeaderHandler;
  private final UserAgentCombiner userAgentCombiner;

  /**
   * Constructor.
   *
   * @param soapClientHandler the SOAP client handler
   * @param adWordsApiConfiguration the AdWords API configuration
   * @param authorizationHeaderHandler the authorization header handler
   * @param userAgentCombiner the full user agent provider
   */
  @SuppressWarnings("unchecked") // All generics of SoapClientHandlerInterface
                                 // extend Object.
  @Inject
  public AdWordsAxisHeaderHandler(
      @SuppressWarnings("rawtypes") /* Due to problem with guice binding */
      SoapClientHandlerInterface soapClientHandler,
      AdWordsApiConfiguration adWordsApiConfiguration,
      AuthorizationHeaderHandler authorizationHeaderHandler,
      UserAgentCombiner userAgentCombiner) {
    this.soapClientHandler = soapClientHandler;
    this.adWordsApiConfiguration = adWordsApiConfiguration;
    this.authorizationHeaderHandler = authorizationHeaderHandler;
    this.userAgentCombiner = userAgentCombiner;
  }

  /**
   * @see HeaderHandler#setHeaders(Object,
   *      com.google.api.ads.common.lib.client.AdsSession,
   *      com.google.api.ads.common.lib.client.AdsServiceDescriptor)
   */
  public void setHeaders(Object soapClient, AdWordsSession adWordsSession,
      AdWordsServiceDescriptor adWordsServiceDescriptor) throws AuthenticationException,
      ServiceException {
    try {
      Object soapHeader = createSoapHeader(adWordsServiceDescriptor);

      BeanUtils.setProperty(soapHeader, "developerToken", adWordsSession.getDeveloperToken());
      BeanUtils.setProperty(soapHeader, "clientCustomerId", adWordsSession.getClientCustomerId());
      BeanUtils.setProperty(soapHeader, "userAgent",
          userAgentCombiner.getUserAgent(adWordsSession.getUserAgent()));
      BeanUtils.setProperty(soapHeader, "validateOnly", adWordsSession.isValidateOnly());
      BeanUtils.setProperty(soapHeader, "partialFailure", adWordsSession.isPartialFailure());

      setAuthenticationHeaders(soapClient, soapHeader, adWordsSession);

      String namespace =
          adWordsApiConfiguration.getNamespacePrefix() + "/"
              + adWordsServiceDescriptor.getPackageGroup() + "/"
              + adWordsServiceDescriptor.getVersion();
      soapClientHandler.setHeader(soapClient, namespace, "RequestHeader", soapHeader);
    } catch (InstantiationException e) {
      throw new ServiceException("Unexpected exception.", e);
    } catch (IllegalAccessException e) {
      throw new ServiceException("Unexpected exception.", e);
    } catch (ClassNotFoundException e) {
      throw new ServiceException("Unexpected exception.", e);
    } catch (InvocationTargetException e) {
      throw new ServiceException("Unexpected exception.", e);
    }
  }

  /**
   * Sets the authentication headers.
   *
   * @param soapClient the SOAP client
   * @param soapHeader the SOAP header
   * @param adWordsSession the AdWords session
   * @throws IllegalAccessException if there was a problem setting the header
   * @throws InvocationTargetException if there was a problem setting the header
   * @throws AuthenticationException  if there was a problem setting the header
   */
  @VisibleForTesting
  void setAuthenticationHeaders(Object soapClient, Object soapHeader, AdWordsSession adWordsSession)
      throws IllegalAccessException, InvocationTargetException,
      AuthenticationException {
    if (adWordsSession.getClientLoginToken() != null) {
      BeanUtils.setProperty(soapHeader, "authToken", adWordsSession.getClientLoginToken());
    } else {
      authorizationHeaderHandler.setAuthorization(soapClient, adWordsSession);
    }
  }

  /**
   * Creates a SOAP header.
   *
   * @param adsServiceDescriptor the ads service descriptor
   * @return the instantiated SOAP header
   * @throws ClassNotFoundException if the SOAP header class could not be found
   * @throws IllegalAccessException if the SOAP header class could not be
   *     created
   * @throws InstantiationException if the SOAP header class could not be
   *     created
   */
  @VisibleForTesting
  Object createSoapHeader(AdWordsServiceDescriptor adsServiceDescriptor)
      throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    Class<?> interfaceClass = adsServiceDescriptor.getInterfaceClass();
    String packageName = interfaceClass.getPackage().getName();
    List<String> packageParts = Lists.newArrayList(packageName.split("\\."));
    String parentPackage = Joiner.on(".").join(packageParts.subList(0, packageParts.size() - 1));
    return Class.forName(parentPackage + ".cm.SoapHeader").newInstance();
  }
}
