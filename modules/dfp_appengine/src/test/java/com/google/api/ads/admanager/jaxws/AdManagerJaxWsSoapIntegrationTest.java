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

package com.google.api.ads.admanager.jaxws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.google.api.ads.admanager.jaxws.factory.AdManagerServices;
import com.google.api.ads.admanager.jaxws.testing.SoapRequestXmlProvider;
import com.google.api.ads.admanager.jaxws.v202311.Company;
import com.google.api.ads.admanager.jaxws.v202311.CompanyServiceInterface;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.admanager.lib.soap.testing.SoapResponseXmlProvider;
import com.google.api.ads.common.lib.testing.MockHttpIntegrationTest;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.common.collect.Lists;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.Diff;

/** Tests that a Ad Manager JAX-WS SOAP call can be made end-to-end with compression disabled. */
@RunWith(JUnit4.class)
public class AdManagerJaxWsSoapIntegrationTest extends MockHttpIntegrationTest {

  private static final String API_VERSION = "v202311";

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @BeforeClass
  public static void setupClass() {
    System.setProperty("api.admanager.useCompression", "false");
  }

  /** Tests making a JAX-WS Ad Manager API call with OAuth2. */
  @Test
  public void testGoldenSoap_oauth2() throws Exception {
    testHttpServer.setMockResponseBody(SoapResponseXmlProvider.getTestSoapResponse(API_VERSION));

    GoogleCredential credential =
        new GoogleCredential.Builder()
            .setTransport(new NetHttpTransport())
            .setJsonFactory(GsonFactory.getDefaultInstance())
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
    List<Company> companies = companyService.createCompanies(Lists.newArrayList(new Company()));

    assertEquals(1234L, companies.get(0).getId().longValue());
    Diff diff =
        DiffBuilder.compare(SoapRequestXmlProvider.getOAuth2SoapRequest(API_VERSION))
            .withTest(testHttpServer.getLastRequestBody())
            .checkForSimilar()
            .build();
    assertFalse(diff.hasDifferences());
    assertFalse(
        "Did not request compression but request was compressed",
        testHttpServer.wasLastRequestBodyCompressed());
    assertEquals("Bearer TEST_ACCESS_TOKEN", testHttpServer.getLastAuthorizationHttpHeader());
  }
}
