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

package com.google.api.ads.dfa.lib.client;

import com.google.api.ads.common.lib.client.AdsServiceClient;
import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.SoapCall;
import com.google.api.ads.common.lib.soap.SoapCallReturn;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.common.lib.utils.logging.AdsServiceLoggers;
import com.google.api.ads.dfa.lib.auth.LoginTokenException;
import com.google.api.ads.dfa.lib.auth.LoginTokens;
import com.google.api.ads.dfa.lib.auth.TokenExpirationDetector;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

/**
 * Wrapper of underlying SOAP client which allows access for setting
 * headers retrieved from the session.
 *
 * @author Adam Rogal
 * @author Joseph DiLallo
 */
public class DfaServiceClient extends AdsServiceClient<DfaSession, DfaServiceDescriptor> {

  private final TokenExpirationDetector tokenExpirationDetector;
  private final LoginTokens loginTokens;

  /**
   * Constructor.
   *
   * @param soapClient the SOAP client
   * @param dfaServiceDescriptor the DFA service descriptor
   * @param dfaSession the DFA session
   * @param soapClientHandler the SOAP client handler
   * @param dfaHeaderHandler the DFA header handler
   * @param adsServiceLoggers the ads service loggers
   * @param tokenExpirationDetector the detector for expired DFA token errors
   * @param loginTokens the utility for regenerating DFA tokens
   */
  @SuppressWarnings("unchecked") // All generics of SoapClientHandlerInterface
                                 // extend Object.
  @Inject
  public DfaServiceClient(@Assisted("soapClient") Object soapClient,
      @Assisted("adsServiceDescriptor") DfaServiceDescriptor dfaServiceDescriptor,
      @Assisted("adsSession") DfaSession dfaSession,
      @SuppressWarnings("rawtypes")  /* Due to problem with guice binding */
      SoapClientHandlerInterface soapClientHandler,
      @SuppressWarnings("rawtypes") /* Guice binding does not support template types */
      HeaderHandler dfaHeaderHandler,
      AdsServiceLoggers adsServiceLoggers,
      TokenExpirationDetector tokenExpirationDetector,
      LoginTokens loginTokens)
      throws ServiceException {
    super(soapClient, dfaSession, dfaServiceDescriptor, soapClientHandler, dfaHeaderHandler,
        adsServiceLoggers);
    this.tokenExpirationDetector = tokenExpirationDetector;
    this.loginTokens = loginTokens;
  }

  /**
   * Wraps calls to the SOAP client and listens for errors stating that the DFA token has expired.
   * In the event that the DFA token has expired, this method will refresh the token and retry the
   * SOAP call.
   *
   * @param soapCall the call to send to the SOAP client
   * @return the return value from the {@code soapCall}
   */
  @Override
  protected synchronized SoapCallReturn callSoapClient(SoapCall<Object> soapCall) {
    SoapCallReturn soapCallReturn = super.callSoapClient(soapCall);
    if (tokenExpirationDetector.isTokenExpiredException(soapCallReturn.getException())) {
      try {
        getAdsSession().setToken(loginTokens.generateToken(
            getAdsServiceDescriptor().getInterfaceClass().getPackage().getName(),
            getAdsSession()));
        setHeaders();
      } catch (LoginTokenException e) {
        return soapCallReturn;
      } catch (ServiceException e) {
        return soapCallReturn;
      } catch (AuthenticationException e) {
        return soapCallReturn;
      }
      soapCallReturn = super.callSoapClient(soapCall);
    }
    return soapCallReturn;
  }
}
