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

package com.google.api.ads.common.lib.soap;

import com.google.api.ads.common.lib.auth.AuthorizationHeaderProvider;
import com.google.api.ads.common.lib.client.AdsSession;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.inject.Inject;

import java.util.HashMap;

/**
 * Handler for {@code Authorization} headers that can be set on the SOAP
 * client.
 */
public class AuthorizationHeaderHandler {

  @SuppressWarnings("rawtypes") /* Due to problem with guice binding */
  private final SoapClientHandlerInterface soapClientHandler;
  private final AuthorizationHeaderProvider authorizationHeaderProvider;

  /**
   * Constructor.
   *
   * @param soapClientHandler the SOAP client handler
   * @param authorizationHeaderProvider the authorization header provider
   */
  @Inject
  public AuthorizationHeaderHandler(
      @SuppressWarnings("rawtypes") /* Due to problem with guice binding */
      SoapClientHandlerInterface soapClientHandler,
      AuthorizationHeaderProvider authorizationHeaderProvider) {
    this.soapClientHandler = soapClientHandler;
    this.authorizationHeaderProvider = authorizationHeaderProvider;
  }

  /**
   * Sets the authorization header created from the session on the soap client.
   *
   * @param soapClient the SOAP client to set the HTTP header on
   * @param adsSession the session
   * @throws AuthenticationException if the authorization header could not be
   *         created
   */
  @SuppressWarnings("unchecked")
  public void setAuthorization(Object soapClient, AdsSession adsSession)
      throws AuthenticationException {
    final String authorizationHeader =
        authorizationHeaderProvider.getAuthorizationHeader(adsSession,
            soapClientHandler.getEndpointAddress(soapClient));
    soapClientHandler.putAllHttpHeaders(soapClient, new HashMap<String, String>() {
      {
        put("Authorization", authorizationHeader);
      }
    });
  }
}
