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

package com.google.api.ads.dfp.jaxws;

import com.google.api.ads.common.lib.client.HeaderHandler;
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
import com.google.common.collect.Maps;
import com.google.inject.Inject;

import java.util.Map;

import javax.xml.soap.Name;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;

/**
 * DFP implementation of {@link HeaderHandler} for JAX-WS.
 *
 * @author Joseph DiLallo
 * @author Jeff Sham
 */
public class DfpJaxWsHeaderHandler implements HeaderHandler<DfpSession, DfpServiceDescriptor> {

  private static final String REQUEST_HEADER_LOCAL_PART = "RequestHeader";

  private final SoapClientHandlerInterface<Object> soapClientHandler;
  private final DfpApiConfiguration dfpApiConfiguration;
  private final AuthorizationHeaderHandler authorizationHeaderHandler;
  private final DfpHttpHeaderHandler dfpHttpHeaderHandler;
  private final UserAgentCombiner userAgentCombiner;

  /**
   * Constructor.
   *
   * @param soapClientHandler the SOAP client handler
   * @param dfpApiConfiguration the DFP API configuration
   * @param authorizationHeaderHandler the authorization header handler
   * @param userAgentCombiner the full user agent provider
   */
  @SuppressWarnings("unchecked") // All generics of SoapClientHandlerInterface
                                 // extend Object.
  @Inject
  public DfpJaxWsHeaderHandler(
      @SuppressWarnings("rawtypes") /* Due to problem with guice binding */
      SoapClientHandlerInterface soapClientHandler,
      DfpApiConfiguration dfpApiConfiguration,
      AuthorizationHeaderHandler authorizationHeaderHandler,
      DfpHttpHeaderHandler dfpHttpHeaderHandler,
      UserAgentCombiner userAgentCombiner) {
    this.soapClientHandler = soapClientHandler;
    this.dfpApiConfiguration = dfpApiConfiguration;
    this.authorizationHeaderHandler = authorizationHeaderHandler;
    this.dfpHttpHeaderHandler = dfpHttpHeaderHandler;
    this.userAgentCombiner = userAgentCombiner;
  }

  /**
   * @see HeaderHandler#setHeaders(Object, com.google.api.ads.common.lib.client.AdsSession,
   *      com.google.api.ads.common.lib.client.AdsServiceDescriptor)
   */
  public void setHeaders(
      Object soapClient, DfpSession dfpSession, DfpServiceDescriptor dfpServiceDescriptor)
      throws AuthenticationException, ServiceException {
    dfpHttpHeaderHandler.setHttpHeaders(soapClient, dfpSession);

    Map<String, Object> headerData = readHeaderElements(dfpSession);
    setAuthenticationHeaders(soapClient, headerData, dfpSession);
    soapClientHandler.setHeader(
        soapClient, null, null, constructSoapHeader(headerData, dfpServiceDescriptor));
  }

  /**
   * Sets the authentication headers.
   *
   * @param soapClient the SOAP client
   * @param headerElements the map housing header elements
   * @param dfpSession the DFP session
   * @throws AuthenticationException if there was a problem getting/setting the
   *         header
   */
  @VisibleForTesting
  void setAuthenticationHeaders(Object soapClient, Map<String, Object> headerElements,
      DfpSession dfpSession) throws AuthenticationException {
    if (dfpSession.getClientLoginToken() != null) {
      headerElements.put("authentication", dfpSession.getClientLoginToken());
    } else {
      authorizationHeaderHandler.setAuthorization(soapClient, dfpSession);
    }
  }

  /**
   * Creates a map with data from the user's service session which is needed to
   * set DFP SOAP headers.
   *
   * @param dfpSession the user's session object
   * @return a map of HTTP header names to values
   */
  private Map<String, Object> readHeaderElements(DfpSession dfpSession) {
    Map<String, Object> mapToFill = Maps.newHashMap();
    mapToFill.put("networkCode", dfpSession.getNetworkCode());
    mapToFill.put("applicationName",
        userAgentCombiner.getUserAgent(dfpSession.getApplicationName()));
    return mapToFill;
  }

  /**
   * Constructs a SOAP header object ready to be attached to a JAX-WS client.
   *
   * @param headerData a map of SOAP header element names to values
   * @param dfpServiceDescriptor the descriptor of which service's headers are being created
   * @return a SOAP header object
   */
  private SOAPElement constructSoapHeader(
      Map<String, Object> headerData, DfpServiceDescriptor dfpServiceDescriptor) {
    String requestHeaderNamespace =
        dfpApiConfiguration.getNamespacePrefix() + "/" + dfpServiceDescriptor.getVersion();

    try {
      SOAPFactory soapFactory = SOAPFactory.newInstance();
      SOAPElement requestHeader =
          soapFactory.createElement(REQUEST_HEADER_LOCAL_PART, "ns1", requestHeaderNamespace);
      for (String headerElementName : headerData.keySet()) {
        if (headerData.get(headerElementName) != null) {
          SOAPElement newElement =
              requestHeader.addChildElement(headerElementName, "ns1", requestHeaderNamespace);
          if (headerElementName.equals("authentication")) {
            Name xsiTypeString =
                soapFactory.createName("type", "xsi", "http://www.w3.org/2001/XMLSchema-instance");
            newElement.addAttribute(xsiTypeString, "ns1:ClientLogin");
            SOAPElement tokenElement =
                newElement.addChildElement("token", "ns1", requestHeaderNamespace);
            tokenElement.addTextNode(headerData.get(headerElementName).toString());
          } else {
            newElement.addTextNode(headerData.get(headerElementName).toString());
          }
        }
      }
      return requestHeader;
    } catch (SOAPException e) {
      throw new ServiceException("Unexpected exception.", e);
    }
  }
}
