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
import com.google.api.ads.admanager.axis.v202408.Company;
import com.google.api.ads.admanager.axis.v202408.CompanyServiceInterface;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.admanager.lib.soap.testing.SoapResponseXmlProvider;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.testing.AuthResponseProvider;
import com.google.api.ads.common.lib.testing.MockHttpIntegrationTest;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.common.collect.Lists;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.Diff;

/** Tests that a Ad Manager Axis SOAP call can be made end-to-end with compression disabled. */
@RunWith(JUnit4.class)
public class AdManagerAxisSoapIntegrationTest extends MockHttpIntegrationTest {

  private static final String API_VERSION = "v202408";

  @BeforeClass
  public static void setupClass() {
    System.setProperty("api.admanager.useCompression", "false");
  }

  /** Tests making a Axis Ad Manager API call with OAuth2. */
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
    Company[] companies = companyService.createCompanies(new Company[] {new Company()});

    assertEquals(1234L, companies[0].getId().longValue());
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

  /** Tests making a Axis Ad Manager API call with OfflineCredentials. */
  @Test
  public void testGoldenSoap_oauth2_offlineCredentials() throws Exception {
    testHttpServer.setMockResponseBodies(
        Lists.newArrayList(
            AuthResponseProvider.getTestOAuthResponse(
                "TEST_ACCESS_TOKEN_1", 1L, "newRefreshToken1"),
            AuthResponseProvider.getTestOAuthResponse(
                "TEST_ACCESS_TOKEN_2", 3600L, "newRefreshToken2"),
            SoapResponseXmlProvider.getTestSoapResponse(API_VERSION)));

    OfflineCredentials offlineCredentials =
        new OfflineCredentials.Builder()
            .forApi(OfflineCredentials.Api.AD_MANAGER)
            .withTokenUrlServer(testHttpServer.getServerUrl())
            .fromFile(
                AdManagerAxisSoapIntegrationTest.class.getResource("props/ads-test.properties"))
            .build();

    Credential credential = offlineCredentials.generateCredential();

    assertTrue(testHttpServer.getLastRequestBody().contains("grant_type=refresh_token"));
    assertTrue(testHttpServer.getLastRequestBody().contains("refresh_token=refreshToken"));
    assertTrue(testHttpServer.getLastRequestBody().contains("client_id=clientId"));
    assertTrue(testHttpServer.getLastRequestBody().contains("client_secret=clientSecret"));

    // Make sure the old token expires - the session builder should issue a request
    // for another access token.
    Thread.sleep(1000);

    assertEquals("TEST_ACCESS_TOKEN_1", credential.getAccessToken());

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
    Diff diff =
        DiffBuilder.compare(SoapRequestXmlProvider.getOAuth2SoapRequest(API_VERSION))
            .withTest(testHttpServer.getLastRequestBody())
            .checkForSimilar()
            .build();
    assertFalse(diff.hasDifferences());
    assertFalse(
        "Did not request compression but request was compressed",
        testHttpServer.wasLastRequestBodyCompressed());
    assertEquals("newRefreshToken2", credential.getRefreshToken());
    assertEquals("Bearer TEST_ACCESS_TOKEN_2", testHttpServer.getLastAuthorizationHttpHeader());
  }
}
