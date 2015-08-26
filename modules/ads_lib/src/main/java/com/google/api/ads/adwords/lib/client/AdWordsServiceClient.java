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

package com.google.api.ads.adwords.lib.client;

import com.google.api.ads.common.lib.client.AdsServiceClient;
import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.common.lib.soap.SoapServiceClient;
import com.google.api.ads.common.lib.utils.logging.AdsServiceLoggers;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

/**
 * Wrapper of underlying SOAP client which allows access for setting
 * headers retrieved from the session.
 */
public class AdWordsServiceClient extends AdsServiceClient<AdWordsSession,
                                                           AdWordsServiceDescriptor> {

  /**
   * Constructor.
   *
   * @param soapClient the SOAP client
   * @param adWordsServiceDescriptor the AdWords service descriptor
   * @param adWordsSession the AdWords session
   * @param soapClientHandler the SOAP client handler
   * @param adWordsHeaderHandler the AdWords header handler
   * @param adsServiceLoggers the ads service loggers
   */
  @SuppressWarnings("unchecked") // All generics of SoapClientHandlerInterface
                                 // extend Object.
  @Inject
  public AdWordsServiceClient(@Assisted("soapClient") Object soapClient,
      @Assisted("adsServiceDescriptor") AdWordsServiceDescriptor adWordsServiceDescriptor,
      @Assisted("adsSession") AdWordsSession adWordsSession,
      @SuppressWarnings({"rawtypes", "unchecked"})  /* Due to problem with guice binding */
      SoapClientHandlerInterface soapClientHandler,
      @SuppressWarnings({"rawtypes"})  /* Guice binding does not support template types */
      HeaderHandler adWordsHeaderHandler,
      AdsServiceLoggers adsServiceLoggers) {
    super(soapClient, adWordsSession, adWordsServiceDescriptor, soapClientHandler,
        adWordsHeaderHandler, adsServiceLoggers);
  }

  /**
   * @see SoapServiceClient#handleException
   */
  @Override
  protected Throwable handleException(Throwable e) {
    return super.handleException(e);
  }
}
