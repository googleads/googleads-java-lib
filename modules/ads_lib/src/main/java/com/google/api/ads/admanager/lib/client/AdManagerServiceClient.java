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

package com.google.api.ads.admanager.lib.client;

import com.google.api.ads.common.lib.client.AdsServiceClient;
import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.common.lib.soap.SoapServiceClient;
import com.google.api.ads.common.lib.utils.logging.AdsServiceLoggers;
import com.google.inject.assistedinject.Assisted;
import javax.inject.Inject;

/**
 * Wrapper of underlying SOAP client which allows access for setting headers retrieved from the
 * session.
 */
public class AdManagerServiceClient
    extends AdsServiceClient<AdManagerSession, AdManagerServiceDescriptor> {

  /**
   * Constructor.
   *
   * @param soapClient the SOAP client
   * @param adManagerServiceDescriptor the Ad Manager service descriptor
   * @param adManagerSession the Ad Manager session
   * @param soapClientHandler the SOAP client handler
   * @param adManagerHeaderHandler the Ad Manager header handler
   * @param adsServiceLoggers the ads service loggers
   */
  @SuppressWarnings("unchecked") /* See comments on soapClientHandler argument. */
  @Inject
  public AdManagerServiceClient(
      @Assisted("soapClient") Object soapClient,
      @Assisted("adsServiceDescriptor") AdManagerServiceDescriptor adManagerServiceDescriptor,
      @Assisted("adsSession") AdManagerSession adManagerSession,
      @SuppressWarnings(
              "rawtypes") /* Guice binding for SoapClientHandlerInterface does not include
                           * the type argument T because it is bound in the SOAP
                           * toolkit-agnostic configuration module. Therefore, must use
                           * the raw type here. */
          SoapClientHandlerInterface soapClientHandler,
      HeaderHandler<AdManagerSession, AdManagerServiceDescriptor> adManagerHeaderHandler,
      AdsServiceLoggers adsServiceLoggers) {
    super(
        soapClient,
        adManagerSession,
        adManagerServiceDescriptor,
        soapClientHandler,
        adManagerHeaderHandler,
        adsServiceLoggers);
  }

  /** @see SoapServiceClient#handleException */
  @Override
  protected Throwable handleException(Throwable e) {
    return super.handleException(e);
  }
}
