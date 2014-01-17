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

package com.google.api.ads.common.lib.soap.testing;

import com.google.inject.AbstractModule;

/**
 * Templates SOAP XML used for testing.
 *
 * @author Adam Roga
 */
public class SoapXmlTemplater {

  /**
   * Gets the templated SOAP XML response.
   */
  public static String templateResponse(String soapXml, String apiVersion) {
    return templateGeneralValues(soapXml, apiVersion);
  }

  /**
   * Gets the templated SOAP XML request.
   */
  public static String templateRequest(String soapXml, String apiVersion,
      AbstractModule productFameworkModule, String productFrameworkName) {

    return templateGeneralValues(soapXml, apiVersion);
  }

  /**
   * Templates general values of a request or response.
   */
  private static String templateGeneralValues(String soapXml, String apiVersion) {
    return soapXml.replaceAll("#API_VERSION#", apiVersion)
        .replaceAll("#JAVA_VERSION#", System.getProperty("java.version"))
        .replaceAll("\n", "")
        .replaceAll(">\\s*<", "><");
  }
}
