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

package com.google.api.ads.dfp.axis;

import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.AuthorizationHeaderHandler;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.api.ads.dfp.lib.client.DfpServiceDescriptor;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.conf.DfpApiConfiguration;
import com.google.api.ads.dfp.lib.soap.DfpHttpHeaderHandler;
import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Inject;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * DFP implementation of {@link HeaderHandler}.
 *
 * @author Adam Rogal
 */
public class DfpAxisHeaderHandler implements HeaderHandler<DfpSession, DfpServiceDescriptor> {

  private final SoapClientHandlerInterface<Object> soapClientHandler;
  private final DfpApiConfiguration dfpApiConfiguration;
  private final AuthorizationHeaderHandler authorizationHeaderHandler;
  private final DfpHttpHeaderHandler dfpHttpHeaderHandler;
  private final UserAgentCombiner userAgentCombiner;
  private final AdsLibConfiguration adsLibConfiguration;

  /**
   * Constructor.
   *
   * @param soapClientHandler the SOAP client handler
   * @param dfpApiConfiguration the DFP API configuration
   * @param authorizationHeaderHandler the authorization header handler
   * @param dfpHttpHeaderHandler the DFP HTTP header handler
   * @param userAgentCombiner the full user agent provider
   */
  @SuppressWarnings("unchecked") // All generics of SoapClientHandlerInterface
                                 // extend Object.
  @Inject
  public DfpAxisHeaderHandler(
      @SuppressWarnings("rawtypes") /* Due to problem with guice binding */
      SoapClientHandlerInterface soapClientHandler,
      DfpApiConfiguration dfpApiConfiguration,
      AdsLibConfiguration adsLibConfiguration,
      AuthorizationHeaderHandler authorizationHeaderHandler,
      DfpHttpHeaderHandler dfpHttpHeaderHandler,
      UserAgentCombiner userAgentCombiner) {
    this.soapClientHandler = soapClientHandler;
    this.dfpApiConfiguration = dfpApiConfiguration;
    this.adsLibConfiguration = adsLibConfiguration;
    this.authorizationHeaderHandler = authorizationHeaderHandler;
    this.dfpHttpHeaderHandler = dfpHttpHeaderHandler;
    this.userAgentCombiner = userAgentCombiner;
  }

  /**
   * @see HeaderHandler#setHeaders(Object,
   *      com.google.api.ads.common.lib.client.AdsSession,
   *      com.google.api.ads.common.lib.client.AdsServiceDescriptor)
   */
  public void setHeaders(Object soapClient, DfpSession dfpSession,
      DfpServiceDescriptor dfpServiceDescriptor) throws AuthenticationException,
      ServiceException {
    try {
      dfpHttpHeaderHandler.setHttpHeaders(soapClient, dfpSession);

      Object soapHeader = createSoapHeader(dfpServiceDescriptor);

      BeanUtils.setProperty(soapHeader, "applicationName",
          userAgentCombiner.getUserAgent(dfpSession.getApplicationName()));
      if (dfpSession.getNetworkCode() != null) {
        BeanUtils.setProperty(soapHeader, "networkCode", dfpSession.getNetworkCode());
      }

      setAuthenticationHeaders(dfpServiceDescriptor, soapClient, soapHeader, dfpSession);

      String namespace =
          dfpApiConfiguration.getNamespacePrefix() + "/"
              + dfpServiceDescriptor.getVersion();
      soapClientHandler.setHeader(soapClient, namespace, "RequestHeader", soapHeader);
      soapClientHandler.setCompression(soapClient, adsLibConfiguration.isCompressionEnabled());
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
   * @param dfpServiceDescriptor the DFP service descriptor
   * @param soapClient the SOAP client
   * @param soapHeader the SOAP header
   * @param dfpSession the DFP session
   * @throws AuthenticationException if there was a problem getting/setting the
   *     authorization header
   * @throws IllegalArgumentException if there was a problem setting the header
   */
  @VisibleForTesting
  void setAuthenticationHeaders(DfpServiceDescriptor dfpServiceDescriptor, Object soapClient,
      Object soapHeader, DfpSession dfpSession) throws AuthenticationException {
    authorizationHeaderHandler.setAuthorization(soapClient, dfpSession);
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
  @VisibleForTesting
  Object createSoapHeader(DfpServiceDescriptor adsServiceDescriptor)
      throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    return Class.forName(adsServiceDescriptor.getInterfaceClass().getPackage().getName()
        + ".SoapRequestHeader").newInstance();
  }
}
