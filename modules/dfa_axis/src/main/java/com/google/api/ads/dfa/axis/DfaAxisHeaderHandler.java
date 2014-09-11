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

package com.google.api.ads.dfa.axis;

import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.AuthorizationHeaderHandler;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.api.ads.dfa.lib.auth.LoginTokenException;
import com.google.api.ads.dfa.lib.auth.LoginTokens;
import com.google.api.ads.dfa.lib.client.DfaServiceDescriptor;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.ads.dfa.lib.conf.DfaApiConfiguration;
import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Inject;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeaderElement;

/**
 * DFA implementation of {@link HeaderHandler}.
 *
 * @author Adam Rogal
 */
public class DfaAxisHeaderHandler implements HeaderHandler<DfaSession, DfaServiceDescriptor> {

  private static final String WSSE_NAMESPACE =
      "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";

  private final SoapClientHandlerInterface<Object> soapClientHandler;
  private final DfaApiConfiguration dfaApiConfiguration;
  private final AdsLibConfiguration adsLibConfiguration;
  private final LoginTokens loginTokens;
  private final UserAgentCombiner userAgentCombiner;
  private final AuthorizationHeaderHandler authorizationHeaderHandler;

  /**
   * Constructor.
   *
   * @param soapClientHandler the SOAP client handler
   * @param dfaApiConfiguration the DFA API configuration
   * @param loginTokens the login ticket provider
   * @param userAgentCombiner the full user agent provider
   * @param authorizationHeaderHandler the authorization header handler
   */
  @SuppressWarnings("unchecked") // All generics of SoapClientHandlerInterface
                                 // extend Object.
  @Inject
  public DfaAxisHeaderHandler(
      @SuppressWarnings("rawtypes") /* Due to problem with guice binding */
      SoapClientHandlerInterface soapClientHandler,
      DfaApiConfiguration dfaApiConfiguration,
      AdsLibConfiguration adsLibConfiguration,
      LoginTokens loginTokens,
      UserAgentCombiner userAgentCombiner,
      AuthorizationHeaderHandler authorizationHeaderHandler) {
    this.soapClientHandler = soapClientHandler;
    this.dfaApiConfiguration = dfaApiConfiguration;
    this.loginTokens = loginTokens;
    this.userAgentCombiner = userAgentCombiner;
    this.authorizationHeaderHandler = authorizationHeaderHandler;
    this.adsLibConfiguration = adsLibConfiguration;
  }

  /**
   * @see HeaderHandler#setHeaders(Object,
   *      com.google.api.ads.common.lib.client.AdsSession,
   *      com.google.api.ads.common.lib.client.AdsServiceDescriptor)
   */
  public void setHeaders(Object soapClient, DfaSession dfaSession,
      DfaServiceDescriptor dfaServiceDescriptor) throws AuthenticationException, ServiceException {
    if (dfaServiceDescriptor.getInterfaceClass().toString().endsWith("LoginRemote")){
      // Set the OAuth2 header on login service requests.
      if (dfaSession.getOAuth2Credential() != null) {
        authorizationHeaderHandler.setAuthorization(soapClient, dfaSession);
      }
    } else {
      // Set the WSSE authentication header on non-login service requests.
      String username = dfaSession.getUsername();
      String token = dfaSession.getToken();
      if (token == null) {
        token = generateAuthToken(dfaServiceDescriptor, dfaSession);
        dfaSession.setToken(token);
      }

      setWsseSecurityHeader(soapClient, username, token);
    }
    setRequestHeader(soapClient, dfaSession, dfaServiceDescriptor);

    soapClientHandler.setCompression(soapClient, adsLibConfiguration.isCompressionEnabled());
  }

  /**
   * Sets the WSSE security SOAP header.
   *
   * @param soapClient the SOAP client
   * @param username the DFA user profile username accessing the API
   * @param token the token generated for the given DFA username
   */
  private void setWsseSecurityHeader(Object soapClient, String username, String token) {
    try {
      QName securityNode = new QName(WSSE_NAMESPACE, "UsernameToken");
      SOAPHeaderElement usernameToken = soapClientHandler.createSoapHeaderElement(securityNode);
      setHeaderElement(usernameToken, "Username", username);
      setHeaderElement(usernameToken, "Password", token);
      usernameToken.setActor("");

      soapClientHandler.setHeader(soapClient, WSSE_NAMESPACE, "Security",
          usernameToken);
    } catch (SOAPException e) {
      throw new ServiceException("Could not set WSSE security header.", e);
    }
  }

  /**
   * Sets the {@code RequestHeader} SOAP header.
   *
   * @param soapClient the SOAP client
   * @param dfaSession the session associated with this client
   * @param dfaServiceDescriptor the descriptor for the current DFA service
   * @throws ServiceException thrown if setting the header fails
   */
  private void setRequestHeader(Object soapClient, DfaSession dfaSession,
      DfaServiceDescriptor dfaServiceDescriptor) {
    try {
      String namespace = dfaApiConfiguration.getNamespacePrefix() + "/"
          + dfaServiceDescriptor.getVersion();
      QName requestHeaderNode = new QName(namespace, "applicationName");
      SOAPHeaderElement appNameToken = soapClientHandler.createSoapHeaderElement(
          requestHeaderNode);
      appNameToken.addTextNode(
          userAgentCombiner.getUserAgent(dfaSession.getApplicationName()));
      appNameToken.setActor("");

      soapClientHandler.setHeader(soapClient, namespace, "RequestHeader",
          appNameToken);
    } catch (SOAPException e) {
      throw new ServiceException("Could not set application name header.", e);
    }
  }

  /**
   * Generates an authentication token for use with the current session.
   *
   * @param dfaServiceDescriptor the DFA service descriptor
   * @param dfaSession the session in use
   * @return an authentication token
   * @throws LoginTokenException thrown if generating a token fails
   */
  @VisibleForTesting
  protected String generateAuthToken(DfaServiceDescriptor dfaServiceDescriptor,
      DfaSession dfaSession) throws LoginTokenException {
    return loginTokens.generateToken(
        dfaServiceDescriptor.getInterfaceClass().getPackage().getName(), dfaSession);
  }

  /**
   * Helps set elements of the authentication header.
   *
   * @param usernameToken the UsernameToken element of a WSSE auth header
   * @param headerName the name of the element to put inside UsernameToken
   * @param headerValue the value to set for the element inside UsernameToken
   * @throws SOAPException thrown if there is an error setting the header
   */
  private void setHeaderElement(SOAPHeaderElement usernameToken, String headerName,
      String headerValue) throws SOAPException {
    SOAPElement usernameNode = usernameToken.addChildElement(headerName);
    usernameNode.addTextNode(headerValue);
  }
}
