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
import com.google.api.ads.common.lib.utils.logging.AdsServiceLoggers;
import com.google.inject.assistedinject.Assisted;

import javax.inject.Inject;

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
  @SuppressWarnings("unchecked") /* See comments on soapClientHandler argument. */
  @Inject
  public AdWordsServiceClient(
      @Assisted("soapClient") Object soapClient,
      @Assisted("adsServiceDescriptor") AdWordsServiceDescriptor adWordsServiceDescriptor,
      @Assisted("adsSession") AdWordsSession adWordsSession,
      @SuppressWarnings("rawtypes") /* Guice binding for SoapClientHandlerInterface does not include
                                     * the type argument T because it is bound in the SOAP
                                     * toolkit-agnostic configuration module. Therefore, must use
                                     * the raw type here. */
      SoapClientHandlerInterface soapClientHandler,
      HeaderHandler<AdWordsSession, AdWordsServiceDescriptor> adWordsHeaderHandler,
      AdsServiceLoggers adsServiceLoggers) {
    super(soapClient, adWordsSession, adWordsServiceDescriptor, soapClientHandler,
        adWordsHeaderHandler, adsServiceLoggers);
  }

}
