// Copyright 2014, Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfa.axis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.api.ads.common.lib.testing.MockHttpIntegrationTest;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.testing.SoapRequestXmlProvider;
import com.google.api.ads.dfa.axis.v1_20.PlacementRemote;
import com.google.api.ads.dfa.axis.v1_20.PlacementType;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.ads.dfa.lib.soap.testing.SoapResponseXmlProvider;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.common.collect.Lists;

import org.custommonkey.xmlunit.XMLAssert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests that a DFA Axis SOAP call can be made end-to-end when SOAP compression is enabled.
 * This test should be run in its own JVM because it makes changes to system properties that could
 * cause issues with other integration tests.
 */
@RunWith(JUnit4.class)
public class DfaAxisSoapCompressionIntegrationTest extends MockHttpIntegrationTest {

  private static final String API_VERSION = "v1.20";
  private static final String OAUTH_ACCESS_TOKEN = "ACCESS_TOKEN";

  @BeforeClass
  public static void setupClass() {
    System.setProperty("api.dfa.useCompression", "true");
  }
  
  /**
   * Tests making an Axis DFA API call with compression enabled.
   */
  @Test
  public void testGoldenSoap_oauth2() throws Exception {
    testHttpServer.setMockResponseBodies(Lists.newArrayList(
        SoapResponseXmlProvider.getTestSoapResponse(API_VERSION)));

    GoogleCredential credential = new GoogleCredential.Builder().setTransport(
        new NetHttpTransport()).setJsonFactory(new JacksonFactory()).build();

    DfaSession session = new DfaSession.Builder()
        .withUsernameAndOAuth2Credential("TEST_USERNAME", credential)
        .withApplicationName("TEST_APP")
        .withEndpoint(testHttpServer.getServerUrl())
        .build();
    session.setToken(OAUTH_ACCESS_TOKEN);
    
    PlacementRemote placementService =
        new DfaServices().get(session, PlacementRemote.class);
    PlacementType[] records = placementService.getPlacementTypes();

    assertEquals(7, records.length);
    assertTrue("Compression was enabled but the last request body was not compressed",
        testHttpServer.wasLastRequestBodyCompressed());
    XMLAssert.assertXMLEqual(
        SoapRequestXmlProvider.getGetPlacementTypesSoapRequest(API_VERSION, OAUTH_ACCESS_TOKEN),
        testHttpServer.getAllRequestBodies().get(0));
  }
}
