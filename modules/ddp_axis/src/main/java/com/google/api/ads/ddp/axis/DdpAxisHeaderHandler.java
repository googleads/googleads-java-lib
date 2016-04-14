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

package com.google.api.ads.ddp.axis;

import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.AuthorizationHeaderHandler;
import com.google.api.ads.common.lib.soap.axis.AxisHandler;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.api.ads.ddp.lib.client.DdpServiceDescriptor;
import com.google.api.ads.ddp.lib.client.DdpSession;
import com.google.api.ads.ddp.lib.conf.DdpApiConfiguration;
import com.google.api.ads.ddp.lib.soap.DdpHttpHeaderHandler;
import com.google.common.base.Preconditions;

import org.apache.axis.client.Stub;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

import javax.inject.Inject;

/**
 * DDP implementation of {@link HeaderHandler}.
 */
public class DdpAxisHeaderHandler implements HeaderHandler<DdpSession, DdpServiceDescriptor> {

  private final AxisHandler soapClientHandler;
  private final DdpApiConfiguration ddpApiConfiguration;
  private final AuthorizationHeaderHandler authorizationHeaderHandler;
  private final DdpHttpHeaderHandler ddpHttpHeaderHandler;
  private final UserAgentCombiner userAgentCombiner;
  private final AdsLibConfiguration adsLibConfiguration;

  static final String REQUEST_HEADER_LOCAL_PART = "RequestHeader";

  /**
   * Constructor.
   *
   * @param soapClientHandler the SOAP client handler
   * @param ddpApiConfiguration the DDP API configuration
   * @param authorizationHeaderHandler the authorization header handler
   * @param ddpHttpHeaderHandler the DDP HTTP header handler
   * @param userAgentCombiner the full user agent provider
   */
  @Inject
  public DdpAxisHeaderHandler(
      AxisHandler soapClientHandler,
      DdpApiConfiguration ddpApiConfiguration,
      AdsLibConfiguration adsLibConfiguration,
      AuthorizationHeaderHandler authorizationHeaderHandler,
      DdpHttpHeaderHandler ddpHttpHeaderHandler,
      UserAgentCombiner userAgentCombiner) {
    this.soapClientHandler = soapClientHandler;
    this.ddpApiConfiguration = ddpApiConfiguration;
    this.adsLibConfiguration = adsLibConfiguration;
    this.authorizationHeaderHandler = authorizationHeaderHandler;
    this.ddpHttpHeaderHandler = ddpHttpHeaderHandler;
    this.userAgentCombiner = userAgentCombiner;
  }

  /**
   * @see HeaderHandler#setHeaders(Object,
   *      com.google.api.ads.common.lib.client.AdsSession,
   *      com.google.api.ads.common.lib.client.AdsServiceDescriptor)
   */
  @Override
  public void setHeaders(Object soapClient, DdpSession ddpSession,
      DdpServiceDescriptor ddpServiceDescriptor) throws AuthenticationException,
      ServiceException {
    try {
      Preconditions.checkArgument(
          soapClient instanceof Stub, "soapClient must be Stub but was: %s", soapClient);
      Stub stub = (Stub) soapClient;

      ddpHttpHeaderHandler.setHttpHeaders(soapClient, ddpSession);

      Object soapHeader = createSoapHeader(ddpServiceDescriptor);

      BeanUtils.setProperty(soapHeader, "userAgent",
          userAgentCombiner.getUserAgent(ddpSession.getUserAgent()));

      setAuthenticationHeaders(soapClient, ddpSession);

      String namespace =
          ddpApiConfiguration.getNamespacePrefix() + "/"
              + ddpServiceDescriptor.getPackageGroup() + "/"
              + ddpServiceDescriptor.getVersion();

      soapClientHandler.setHeader(stub, namespace, REQUEST_HEADER_LOCAL_PART, soapHeader);

      soapClientHandler.setHeaderChild(stub, REQUEST_HEADER_LOCAL_PART, "userAgent",
          userAgentCombiner.getUserAgent(ddpSession.getUserAgent()));

      soapClientHandler.setCompression(stub, adsLibConfiguration.isCompressionEnabled());
      soapClientHandler.setRequestTimeout(stub, adsLibConfiguration.getSoapRequestTimeout());
    } catch (InstantiationException e) {
      throw new ServiceException("Unexpected exception.", e);
    } catch (IllegalAccessException e) {
      throw new ServiceException("Unexpected exception.", e);
    } catch (ClassNotFoundException e) {
      throw new ServiceException("Unexpected exception.", e);
    } catch (InvocationTargetException e) {
      throw new ServiceException("Unexpected exception.", e);
    } catch (IllegalArgumentException e) {
      throw new ServiceException("Unexpected exception.", e);
    } catch (SecurityException e) {
      throw new ServiceException("Unexpected exception.", e);
    }
  }

  /**
   * Sets the authentication headers.
   *
   * @param soapClient the SOAP client
   * @param ddpSession the DDP session
   * @throws AuthenticationException if there was a problem getting/setting the
   *     authorization header
   * @throws IllegalArgumentException if there was a problem setting the header
   */
  private void setAuthenticationHeaders(
      Object soapClient,
      DdpSession ddpSession)
      throws AuthenticationException {
    authorizationHeaderHandler.setAuthorization(soapClient, ddpSession);
  }

  /**
   * Creates a SOAP header.
   *
   * @param adsServiceDescriptor the ads service descriptor
   * @return the instantiated SOAP header
   * @throws ClassNotFoundException if the SOAP header class could not be found
   * @throws IllegalAccessException if the SOAP header class could not be
   *         created
   * @throws InstantiationException if the SOAP header class could not be
   *         created
   */
  private Object createSoapHeader(DdpServiceDescriptor adsServiceDescriptor)
      throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    return Class.forName(adsServiceDescriptor.getInterfaceClass().getPackage().getName()
        + ".SoapHeader").newInstance();
  }
}
