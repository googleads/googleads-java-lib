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

package com.google.api.ads.admanager.jaxws;

import com.google.api.ads.admanager.lib.client.AdManagerServiceDescriptor;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.admanager.lib.conf.AdManagerApiConfiguration;
import com.google.api.ads.admanager.lib.soap.AdManagerHttpHeaderHandler;
import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.AuthorizationHeaderHandler;
import com.google.api.ads.common.lib.soap.jaxws.JaxWsHandler;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.inject.Inject;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.ws.BindingProvider;

/** Ad Manager implementation of {@link HeaderHandler} for JAX-WS. */
public class AdManagerJaxWsHeaderHandler
    implements HeaderHandler<AdManagerSession, AdManagerServiceDescriptor> {

  private static final String REQUEST_HEADER_LOCAL_PART = "RequestHeader";

  private final JaxWsHandler soapClientHandler;
  private final AdManagerApiConfiguration adManagerApiConfiguration;
  private final AdsLibConfiguration adsLibConfiguration;
  private final AuthorizationHeaderHandler authorizationHeaderHandler;
  private final AdManagerHttpHeaderHandler adManagerHttpHeaderHandler;
  private final UserAgentCombiner userAgentCombiner;

  /**
   * Constructor.
   *
   * @param soapClientHandler the SOAP client handler
   * @param adManagerApiConfiguration the Ad Manager API configuration
   * @param authorizationHeaderHandler the authorization header handler
   * @param userAgentCombiner the full user agent provider
   */
  @Inject
  public AdManagerJaxWsHeaderHandler(
      JaxWsHandler soapClientHandler,
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
    Preconditions.checkArgument(
        soapClient instanceof BindingProvider,
        "soapClient must be BindingProvider but was: %s",
        soapClient);
    BindingProvider bindingProvider = (BindingProvider) soapClient;

    adManagerHttpHeaderHandler.setHttpHeaders(soapClient, adManagerSession);

    Map<String, Object> headerData = readHeaderElements(adManagerSession);
    setAuthenticationHeaders(soapClient, adManagerSession);
    soapClientHandler.setHeader(
        bindingProvider, null, null, constructSoapHeader(headerData, adManagerServiceDescriptor));
    soapClientHandler.setCompression(bindingProvider, adsLibConfiguration.isCompressionEnabled());
    soapClientHandler.setRequestTimeout(
        bindingProvider, adsLibConfiguration.getSoapRequestTimeout());
  }

  /**
   * Sets the authentication headers.
   *
   * @param soapClient the SOAP client
   * @param adManagerSession the Ad Manager session
   * @throws AuthenticationException if there was a problem getting/setting the header
   */
  private void setAuthenticationHeaders(Object soapClient, AdManagerSession adManagerSession)
      throws AuthenticationException {
    authorizationHeaderHandler.setAuthorization(soapClient, adManagerSession);
  }

  /**
   * Creates a map with data from the user's service session which is needed to set Ad Manager SOAP
   * headers.
   *
   * @param adManagerSession the user's session object
   * @return a map of HTTP header names to values
   */
  private Map<String, Object> readHeaderElements(AdManagerSession adManagerSession) {
    // The order here must match the order of the SoapRequestHeader elements in the WSDL.
    Map<String, Object> mapToFill = Maps.newLinkedHashMap();
    mapToFill.put("networkCode", adManagerSession.getNetworkCode());
    mapToFill.put(
        "applicationName", userAgentCombiner.getUserAgent(adManagerSession.getApplicationName()));
    return mapToFill;
  }

  /**
   * Constructs a SOAP header object ready to be attached to a JAX-WS client.
   *
   * @param headerData a map of SOAP header element names to values
   * @param adManagerServiceDescriptor the descriptor of which service's headers are being created
   * @return a SOAP header object
   */
  private SOAPElement constructSoapHeader(
      Map<String, Object> headerData, AdManagerServiceDescriptor adManagerServiceDescriptor) {
    String requestHeaderNamespace =
        adManagerApiConfiguration.getNamespacePrefix()
            + "/"
            + adManagerServiceDescriptor.getVersion();

    try {
      SOAPFactory soapFactory = SOAPFactory.newInstance();
      SOAPElement requestHeader =
          soapFactory.createElement(REQUEST_HEADER_LOCAL_PART, "ns1", requestHeaderNamespace);
      for (String headerElementName : headerData.keySet()) {
        if (headerData.get(headerElementName) != null) {
          SOAPElement newElement =
              requestHeader.addChildElement(headerElementName, "ns1", requestHeaderNamespace);
          newElement.addTextNode(headerData.get(headerElementName).toString());
        }
      }
      return requestHeader;
    } catch (SOAPException e) {
      throw new ServiceException("Unexpected exception.", e);
    }
  }
}
