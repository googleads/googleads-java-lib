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

package com.google.api.ads.dfp.lib.soap;

import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.common.collect.Maps;
import com.google.inject.Inject;

import java.util.Map;

/**
 * Handler used to set the HTTP headers on a SOAP client.
 *
 * @author Adam Rogal
 */
public class DfpHttpHeaderHandler {


  @SuppressWarnings("rawtypes") /* Due to problem with guice binding */
  private final SoapClientHandlerInterface soapClientHandler;

  /**
   * Constructor.
   *
   * @param soapClientHandler the SOAP client handler
   */
  @Inject
  public DfpHttpHeaderHandler(
      @SuppressWarnings("rawtypes") /* Due to problem with guice binding */
      SoapClientHandlerInterface soapClientHandler) {
    this.soapClientHandler = soapClientHandler;
  }

  /**
   * Sets the HTTP headers on the SOAP client.
   */
  @SuppressWarnings("unchecked") /* Due to problem with guice binding */
  public void setHttpHeaders(Object soapClient, DfpSession dfpSession) {
    Map<String, String> headersMap = Maps.newHashMap();
    soapClientHandler.putAllHttpHeaders(soapClient, headersMap);
  }

}
