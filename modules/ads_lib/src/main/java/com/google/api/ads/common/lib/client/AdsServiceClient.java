// Copyright 2011, Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.client;

import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.common.lib.soap.SoapServiceClient;
import com.google.api.ads.common.lib.utils.logging.AdsServiceLoggers;

/**
 * The base class for all AdsServiceClients.
 * <p>
 * This class connects the user, handler, and underlying service client. It
 * fulfills:
 * <ul>
 * <li>Setting headers (along with their overrides).</li>
 * <li>Acting as an invocation wrapper for RPCs.</li>
 * <li>Setting the endpoint address.</li>
 * </ul>
 *
 * @param <S> the type of {@link AdsSession}
 * @param <D> the type of {@link AdsServiceDescriptor}
 */
public abstract class AdsServiceClient<S extends AdsSession,
    D extends AdsServiceDescriptor> extends SoapServiceClient<Object> {

  private S adsSession;
  private final D adsServiceDescriptor;
  private final AdsServiceLoggers adsServiceLoggers;
  private final HeaderHandler<S, D> headerHandler;

  /**
   * Constructor.
   *
   * @param soapClient the SOAP client
   * @param adsSession the session
   * @param adsServiceDescriptor the service descriptor
   * @param soapClientHandler the SOAP client handler
   * @param headerHandler the header handler
   * @param adsServiceLoggers the loggers
   */
  public AdsServiceClient(Object soapClient, S adsSession, D adsServiceDescriptor,
      SoapClientHandlerInterface<Object> soapClientHandler, HeaderHandler<S, D> headerHandler,
      AdsServiceLoggers adsServiceLoggers) {
    super(soapClientHandler, soapClient);
    this.adsSession = adsSession;
    this.adsServiceDescriptor = adsServiceDescriptor;
    this.adsServiceLoggers = adsServiceLoggers;
    this.headerHandler = headerHandler;
  }

  /**
   * Gets the ads session for this client.
   *
   * @return the ads session for this client
   */
  public S getAdsSession() {
    return adsSession;
  }

  /**
   * Gets the ads service descriptor for this client.
   *
   * @return the ads service descriptor for this client
   */
  public D getAdsServiceDescriptor() {
    return adsServiceDescriptor;
  }

  /**
   * Sets the ads session for this client.
   *
   * @param session the ads session to set for this client
   */
  public void setAdsSession(S session) {
    this.adsSession = session;
  }

  @Override
  protected void logSoapCall(RemoteCallReturn remoteCallReturn) {
    adsServiceLoggers.logRequest(remoteCallReturn);
  }

  @Override
  protected void setHeaders() throws ServiceException, AuthenticationException {
    getSoapClientHandler().clearHeaders(getSoapClient());
    headerHandler.setHeaders(getSoapClient(), adsSession, adsServiceDescriptor);
  }
}
