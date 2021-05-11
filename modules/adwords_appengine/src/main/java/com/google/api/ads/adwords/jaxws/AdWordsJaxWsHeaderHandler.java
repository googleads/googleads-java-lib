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

package com.google.api.ads.adwords.jaxws;

import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.conf.AdWordsApiConfiguration;
import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.AuthorizationHeaderHandler;
import com.google.api.ads.common.lib.soap.jaxws.JaxWsHandler;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.inject.Inject;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.ws.BindingProvider;

/**
 * AdWords implementation of {@link HeaderHandler} for JAX-WS.
 */
public class AdWordsJaxWsHeaderHandler implements
    HeaderHandler<AdWordsSession, AdWordsServiceDescriptor> {

  static final String REQUEST_HEADER_LOCAL_PART = "RequestHeader";

  private final JaxWsHandler soapClientHandler;
  private final AdWordsApiConfiguration adWordsApiConfiguration;
  private final AdsLibConfiguration adsLibConfiguration;
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
  @Inject
  public AdWordsJaxWsHeaderHandler(
      JaxWsHandler soapClientHandler,
      AdWordsApiConfiguration adWordsApiConfiguration,
      AdsLibConfiguration adsLibConfiguration,
      AuthorizationHeaderHandler authorizationHeaderHandler,
      UserAgentCombiner userAgentCombiner) {
    this.soapClientHandler = soapClientHandler;
    this.adWordsApiConfiguration = adWordsApiConfiguration;
    this.adsLibConfiguration = adsLibConfiguration;
    this.authorizationHeaderHandler = authorizationHeaderHandler;
    this.userAgentCombiner = userAgentCombiner;
  }

  /**
   * @see HeaderHandler#setHeaders(Object,
   *      com.google.api.ads.common.lib.client.AdsSession,
   *      com.google.api.ads.common.lib.client.AdsServiceDescriptor)
   */
  @Override
  public void setHeaders(Object soapClient, AdWordsSession adWordsSession,
      AdWordsServiceDescriptor adWordsServiceDescriptor) throws AuthenticationException,
      ServiceException {
    Preconditions.checkArgument(
        soapClient instanceof BindingProvider,
        "soapClient must be BindingProvider but was: %s",
        soapClient);
    BindingProvider bindingProvider = (BindingProvider) soapClient;

    Map<String, Object> headerData = readHeaderElements(adWordsSession);
    setAuthenticationHeaders(soapClient, headerData, adWordsSession);
    soapClientHandler.setHeader(
        bindingProvider, null, null, constructSoapHeader(headerData, adWordsServiceDescriptor));
    soapClientHandler.setCompression(bindingProvider, adsLibConfiguration.isCompressionEnabled());
    soapClientHandler.setRequestTimeout(
        bindingProvider, adsLibConfiguration.getSoapRequestTimeout());
  }

  /**
   * Sets the authentication headers.
   *
   * @param soapClient the SOAP client
   * @param headerElements the map housing header elements
   * @param adWordsSession the AdWords session
   * @throws AuthenticationException if there was a problem getting/setting the
   *         header
   */
  @VisibleForTesting
  void setAuthenticationHeaders(Object soapClient, Map<String, Object> headerElements,
      AdWordsSession adWordsSession) throws AuthenticationException {
    authorizationHeaderHandler.setAuthorization(soapClient, adWordsSession);
  }

  /**
   * Creates a map with data from the user's service session which is needed to
   * set AdWords SOAP headers.
   *
   * @param adWordsSession the user's session object
   * @return a map of HTTP header names to values
   */
  private Map<String, Object> readHeaderElements(AdWordsSession adWordsSession) {
    // The order here must match the order of the SoapHeader elements in the WSDL.
    Map<String, Object> mapToFill = Maps.newLinkedHashMap();
    mapToFill.put("clientCustomerId", adWordsSession.getClientCustomerId());
    mapToFill.put("developerToken", adWordsSession.getDeveloperToken());
    mapToFill.put("userAgent", userAgentCombiner.getUserAgent(adWordsSession.getUserAgent()));
    mapToFill.put("validateOnly", adWordsSession.isValidateOnly());
    mapToFill.put("partialFailure", adWordsSession.isPartialFailure());
    return mapToFill;
  }

  /**
   * Constructs a SOAP header object ready to be attached to a JAX-WS client.
   *
   * @param headerData a map of SOAP header element names to values
   * @param adWordsServiceDescriptor the descriptor of which service's headers
   *     are being created
   * @return a SOAP header object
   */
  private SOAPElement constructSoapHeader(Map<String, Object> headerData,
      AdWordsServiceDescriptor adWordsServiceDescriptor) {
    String requestHeaderNamespace =
        adWordsApiConfiguration.getNamespacePrefix() + "/"
            + adWordsServiceDescriptor.getPackageGroup() + "/"
            + adWordsServiceDescriptor.getVersion();

    String requestElementsNamespace =
        adWordsApiConfiguration.getNamespacePrefix() + "/cm/"
            + adWordsServiceDescriptor.getVersion();

    try {
      SOAPFactory soapFactory = SOAPFactory.newInstance();
      SOAPElement requestHeader = soapFactory.createElement(new QName(requestHeaderNamespace,
          REQUEST_HEADER_LOCAL_PART));
      for (String headerElementName : headerData.keySet()) {
        if (headerData.get(headerElementName) != null) {
          SOAPElement newElement = requestHeader.addChildElement(headerElementName, null,
              requestElementsNamespace);
          newElement.addTextNode(headerData.get(headerElementName).toString());
        }
      }
      return requestHeader;
    } catch (SOAPException e) {
      throw new ServiceException(
          "Unexpected exception constructing SOAP header for: " + adWordsServiceDescriptor, e);
    }
  }
}
