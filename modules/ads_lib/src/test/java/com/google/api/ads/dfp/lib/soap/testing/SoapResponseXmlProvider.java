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

package com.google.api.ads.dfp.lib.soap.testing;

import static java.nio.charset.StandardCharsets.UTF_8;

import com.google.api.ads.common.lib.soap.testing.SoapXmlTemplater;
import com.google.api.ads.common.lib.utils.Streams;

import java.io.IOException;

/**
 * Provides DFP API SOAP responses.
 * 
 * @author Adam Rogal
 */
public class SoapResponseXmlProvider {
  
  /**
   * Gets the test response.
   */
  public static String getTestSoapResponse(String apiVersion) throws IOException {
    String soapXml = Streams.readAll(
        SoapResponseXmlProvider.class.getResourceAsStream("test_response.xml"), UTF_8);
    return SoapXmlTemplater.templateResponse(soapXml, apiVersion);
  }
}
