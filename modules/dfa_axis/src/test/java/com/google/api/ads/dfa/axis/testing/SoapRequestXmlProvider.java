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

package com.google.api.ads.dfa.axis.testing;

import static org.apache.commons.lang.CharEncoding.UTF_8;

import com.google.api.ads.common.lib.soap.testing.SoapXmlTemplater;
import com.google.api.ads.common.lib.utils.Streams;
import com.google.api.ads.dfa.axis.DfaAxisModule;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Provides DFA API SOAP responses.
 */
public class SoapRequestXmlProvider {

  private static final String PRODUCT_FRAMEWORK_NAME = "Dfa-Axis";

  /**
   * Get a request made using client login authentication.
   */
  public static String getGetPlacementTypesSoapRequest(String apiVersion, String token)
      throws IOException {
    String soapXml = Streams.readAll(
        SoapRequestXmlProvider.class.getResourceAsStream("test_request_get_placement_types.xml"),
        Charset.forName(UTF_8));
    soapXml = soapXml.replaceAll("#TOKEN#", token);
    return getTemplatedXml(soapXml, apiVersion);
  }

  /**
   * Get a request made using OAuth2 authentication.
   */
  public static String getAuthenticateSoapRequest(String apiVersion) throws IOException {
    String soapXml = Streams.readAll(
        SoapRequestXmlProvider.class.getResourceAsStream("test_request_authenticate.xml"),
        Charset.forName(UTF_8));
    return getTemplatedXml(soapXml, apiVersion);
  }

  /**
   * Get the templated SOAP XML.
   */
  private static String getTemplatedXml(String soapXml, String apiVersion) {
    return SoapXmlTemplater.templateRequest(
        soapXml, apiVersion, new DfaAxisModule(), PRODUCT_FRAMEWORK_NAME);
  }
}
