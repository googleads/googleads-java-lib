// Copyright 2013 Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfa.lib.soap.testing;

import static org.apache.commons.lang.CharEncoding.UTF_8;

import com.google.api.ads.common.lib.soap.testing.SoapXmlTemplater;
import com.google.api.ads.common.lib.utils.Streams;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Provides DFA API SOAP responses.
 *
 * @author Joseph DiLallo
 */
public class SoapResponseXmlProvider {

  /**
   * Gets the test response.
   */
  public static String getTestSoapResponse(String apiVersion) throws IOException {
    String soapXml = Streams.readAll(
        SoapResponseXmlProvider.class.getResourceAsStream("test_response.xml"),
        Charset.forName(UTF_8));
    return SoapXmlTemplater.templateResponse(soapXml, apiVersion);
  }

  /**
   * Gets the test authenticate response.
   */
  public static String getTestAuthenticateResponse(String apiVersion, String token)
      throws IOException {
    String soapXml = Streams.readAll(
        SoapResponseXmlProvider.class.getResourceAsStream("test_response_authenticate.xml"),
        Charset.forName(UTF_8));
    soapXml = soapXml.replaceAll("#TOKEN#", token);
    return SoapXmlTemplater.templateResponse(soapXml, apiVersion);
  }

  /**
   * Gets the test token expired response.
   */
  public static String getTestTokenExpiredResponse(String apiVersion) throws IOException {
    String soapXml = Streams.readAll(
        SoapResponseXmlProvider.class.getResourceAsStream("test_response_token_expired.xml"),
        Charset.forName(UTF_8));
    return SoapXmlTemplater.templateResponse(soapXml, apiVersion);
  }
}
