// Copyright 2013, Google Inc. All Rights Reserved.
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

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests that a DFA Axis SOAP call with an expired DFA token causes a new token to be generated.
 * After a new token is generated, the request should be retried.
 *
 * @author Joseph DiLallo
 */
@RunWith(JUnit4.class)
public class DfaAxisRefreshTokenIntegrationTest extends MockHttpIntegrationTest {

  private static final String API_VERSION = "v1.20";
  private static final String REGENERATED_TOKEN = "NEW_TOKEN";
  private static final String EXPIRED_TOKEN = "EXPIRED_TOKEN";
  private static final String OAUTH_ACCESS_TOKEN = "ACCESS_TOKEN";

  /**
   * Tests making an Axis DFA API call with an expired DFA token.
   */
  @Test
  public void testGoldenSoap_tokenExpired() throws Exception {
    testHttpServer.setMockResponseBodies(Lists.newArrayList(
        SoapResponseXmlProvider.getTestTokenExpiredResponse(API_VERSION),
        SoapResponseXmlProvider.getTestAuthenticateResponse(API_VERSION, REGENERATED_TOKEN),
        SoapResponseXmlProvider.getTestSoapResponse(API_VERSION)));

    GoogleCredential credential = new GoogleCredential.Builder().setTransport(
        new NetHttpTransport()).setJsonFactory(new JacksonFactory()).build();
    credential.setAccessToken(OAUTH_ACCESS_TOKEN);

    DfaSession session = new DfaSession.Builder()
        .withUsernameAndOAuth2Credential("TEST_USERNAME", credential)
        .withApplicationName("TEST_APP")
        .withEndpoint(testHttpServer.getServerUrl())
        .build();
    session.setToken(EXPIRED_TOKEN);

    PlacementRemote placementService =
        new DfaServices().get(session, PlacementRemote.class);
    PlacementType[] records = placementService.getPlacementTypes();

    assertEquals(7, records.length);
    assertEquals(Lists.newArrayList(null, "Bearer " + OAUTH_ACCESS_TOKEN, null),
        testHttpServer.getAllAuthorizationHttpHeaders());
    assertEquals(
        SoapRequestXmlProvider.getGetPlacementTypesSoapRequest(API_VERSION, EXPIRED_TOKEN),
        testHttpServer.getAllRequestBodies().get(0));
    assertEquals(
        SoapRequestXmlProvider.getAuthenticateSoapRequest(API_VERSION),
        testHttpServer.getAllRequestBodies().get(1));
    assertEquals(
        SoapRequestXmlProvider.getGetPlacementTypesSoapRequest(API_VERSION, REGENERATED_TOKEN),
        testHttpServer.getAllRequestBodies().get(2));
    assertEquals(REGENERATED_TOKEN, session.getToken());
  }
}
