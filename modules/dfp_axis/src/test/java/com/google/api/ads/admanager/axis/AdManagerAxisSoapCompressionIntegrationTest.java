// Copyright 2012, Google Inc. All Rights Reserved.
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

package com.google.api.ads.admanager.axis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.testing.SoapRequestXmlProvider;
import com.google.api.ads.admanager.axis.v202108.Company;
import com.google.api.ads.admanager.axis.v202108.CompanyServiceInterface;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.admanager.lib.soap.testing.SoapResponseXmlProvider;
import com.google.api.ads.common.lib.testing.MockHttpIntegrationTest;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.Diff;

/**
 * Tests that a Ad Manager Axis SOAP call can be made end-to-end when SOAP compression is enabled.
 * This test should be run in its own JVM because it makes changes to system properties that could
 * cause issues with other integration tests.
 */
@RunWith(JUnit4.class)
public class AdManagerAxisSoapCompressionIntegrationTest extends MockHttpIntegrationTest {

  private static final String API_VERSION = "v202108";

  @BeforeClass
  public static void setupClass() {
    System.setProperty("api.admanager.useCompression", "true");
  }

  /** Tests making a Axis Ad Manager API call with OAuth2 and compression enabled. */
  @Test
  public void testGoldenSoap_oauth2() throws Exception {
    testHttpServer.setMockResponseBody(SoapResponseXmlProvider.getTestSoapResponse(API_VERSION));

    GoogleCredential credential =
        new GoogleCredential.Builder()
            .setTransport(new NetHttpTransport())
            .setJsonFactory(new JacksonFactory())
            .build();
    credential.setAccessToken("TEST_ACCESS_TOKEN");

    AdManagerSession session =
        new AdManagerSession.Builder()
            .withApplicationName("TEST_APP")
            .withOAuth2Credential(credential)
            .withEndpoint(testHttpServer.getServerUrl())
            .withNetworkCode("TEST_NETWORK_CODE")
            .build();

    CompanyServiceInterface companyService =
        new AdManagerServices().get(session, CompanyServiceInterface.class);
    Company[] companies = companyService.createCompanies(new Company[] {new Company()});

    assertEquals(1234L, companies[0].getId().longValue());
    assertTrue(
        "Compression was enabled but the last request body was not compressed",
        testHttpServer.wasLastRequestBodyCompressed());
    Diff diff =
        DiffBuilder.compare(SoapRequestXmlProvider.getOAuth2SoapRequest(API_VERSION))
            .withTest(testHttpServer.getLastRequestBody())
            .checkForSimilar()
            .build();
    assertFalse(diff.hasDifferences());
    assertEquals("Bearer TEST_ACCESS_TOKEN", testHttpServer.getLastAuthorizationHttpHeader());
  }
}
