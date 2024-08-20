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

package com.google.api.ads.admanager.axis;

import com.google.api.ads.admanager.lib.client.AdManagerServiceDescriptor;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.admanager.lib.conf.AdManagerApiConfiguration;
import com.google.api.ads.admanager.lib.soap.AdManagerHttpHeaderHandler;
import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.AuthorizationHeaderHandler;
import com.google.api.ads.common.lib.soap.axis.AxisHandler;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.common.base.Preconditions;
import java.lang.reflect.InvocationTargetException;
import com.google.inject.Inject;
import org.apache.axis.client.Stub;
import org.apache.commons.beanutils.BeanUtils;

/** Ad Manager implementation of {@link HeaderHandler}. */
public class AdManagerAxisHeaderHandler
    implements HeaderHandler<AdManagerSession, AdManagerServiceDescriptor> {

  private final AxisHandler soapClientHandler;
  private final AdManagerApiConfiguration adManagerApiConfiguration;
  private final AuthorizationHeaderHandler authorizationHeaderHandler;
  private final AdManagerHttpHeaderHandler adManagerHttpHeaderHandler;
  private final UserAgentCombiner userAgentCombiner;
  private final AdsLibConfiguration adsLibConfiguration;

  /**
   * Constructor.
   *
   * @param soapClientHandler the SOAP client handler
   * @param adManagerApiConfiguration the Ad Manager API configuration
   * @param authorizationHeaderHandler the authorization header handler
   * @param adManagerHttpHeaderHandler the Ad Manager HTTP header handler
   * @param userAgentCombiner the full user agent provider
   */
  @Inject
  public AdManagerAxisHeaderHandler(
      AxisHandler soapClientHandler,
      AdManagerApiConfiguration adManagerApiConfiguration,
      AdsLibConfiguration adsLibConfiguration,
      AuthorizationHeaderHandler authorizationHeaderHandler,
      AdManagerHttpHeaderHandler adManagerHttpHeaderHandler,
      UserAgentCombiner userAgentCombiner) {
    this.soapClientHandler = soapClientHandler;
    this.adManagerApiConfiguration = adManagerApiConfiguration;
    this.adsLibConfiguration = adsLibConfiguration;
    this.authorizationHeaderHandler = authorizationHeaderHandler;
    this.adManagerHttpHeaderHandler = adManagerHttpHeaderHandler;
    this.userAgentCombiner = userAgentCombiner;
  }

  /**
   * @see HeaderHandler#setHeaders(Object, com.google.api.ads.common.lib.client.AdsSession,
   *     com.google.api.ads.common.lib.client.AdsServiceDescriptor)
   */
  @Override
  public void setHeaders(
      Object soapClient,
      AdManagerSession adManagerSession,
      AdManagerServiceDescriptor adManagerServiceDescriptor)
      throws AuthenticationException, ServiceException {
    try {
      Preconditions.checkArgument(
          soapClient instanceof Stub, "soapClient must be Stub but was: %s", soapClient);
      Stub stub = (Stub) soapClient;

      adManagerHttpHeaderHandler.setHttpHeaders(soapClient, adManagerSession);

      Object soapHeader = createSoapHeader(adManagerServiceDescriptor);

      BeanUtils.setProperty(
          soapHeader,
          "applicationName",
          userAgentCombiner.getUserAgent(adManagerSession.getApplicationName()));
      if (adManagerSession.getNetworkCode() != null) {
        BeanUtils.setProperty(soapHeader, "networkCode", adManagerSession.getNetworkCode());
      }

      setAuthenticationHeaders(soapClient, adManagerSession);

      String namespace =
          adManagerApiConfiguration.getNamespacePrefix()
              + "/"
              + adManagerServiceDescriptor.getVersion();
      soapClientHandler.setHeader(stub, namespace, "RequestHeader", soapHeader);
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
   * @param adManagerSession the Ad Manager session
   * @throws AuthenticationException if there was a problem getting/setting the authorization header
   * @throws IllegalArgumentException if there was a problem setting the header
   */
  private void setAuthenticationHeaders(Object soapClient, AdManagerSession adManagerSession)
      throws AuthenticationException {
    authorizationHeaderHandler.setAuthorization(soapClient, adManagerSession);
  }

  /**
   * Creates a SOAP header.
   *
   * @param adsServiceDescriptor the ads service descriptor
   * @return the instantiated SOAP header
   * @throws ClassNotFoundException if the SOAP header class could not be found
   * @throws IllegalAccessException if the SOAP header class could not be created
   * @throws InstantiationException if the SOAP header class could not be created
   */
  private Object createSoapHeader(AdManagerServiceDescriptor adsServiceDescriptor)
      throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    return Class.forName(
            adsServiceDescriptor.getInterfaceClass().getPackage().getName() + ".SoapRequestHeader")
        .newInstance();
  }
}
