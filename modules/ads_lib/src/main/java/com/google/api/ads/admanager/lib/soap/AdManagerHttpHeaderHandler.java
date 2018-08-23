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

package com.google.api.ads.admanager.lib.soap;

import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.inject.Inject;

/** Handler used to set the HTTP headers on a SOAP client. */
public class AdManagerHttpHeaderHandler {


  @SuppressWarnings("rawtypes") /* See constructor comments. */
  private final SoapClientHandlerInterface soapClientHandler;

  /**
   * Constructor.
   *
   * @param soapClientHandler the SOAP client handler
   */
  @Inject
  public AdManagerHttpHeaderHandler(
      @SuppressWarnings(
              "rawtypes") /* Guice binding for SoapClientHandlerInterface does not include the type
                           * argument T because it is bound in the SOAP toolkit-agnostic configuration
                           * module. Therefore, must use the raw type here. */
          SoapClientHandlerInterface soapClientHandler) {
    this.soapClientHandler = soapClientHandler;
  }

  /** Sets the HTTP headers on the SOAP client. */
  @SuppressWarnings("unchecked") /* See constructor comments. */
  public void setHttpHeaders(Object soapClient, AdManagerSession adManagerSession) {
    Map<String, String> headersMap = Maps.newHashMap();
    soapClientHandler.putAllHttpHeaders(soapClient, headersMap);
  }

}
