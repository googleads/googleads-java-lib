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

package com.google.api.ads.common.lib.auth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.api.ads.common.lib.testing.MockHttpIntegrationTest;
import com.google.api.client.auth.oauth2.Credential;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Integration tests for {@link OfflineCredentials}.
 *
 * @author Adam Rogal
 */
@RunWith(JUnit4.class)
public class OfflineCredentialsIntegrationTest extends MockHttpIntegrationTest {

  /**
   * Tests that the builder builds and gets an OAuth2 token correctly.
   */
  @Test
  public void testGenerateCredential() throws Exception {
    testHttpServer.setMockResponseBody(
        "{\"access_token\" : \"accessToken\","
        + "\"token_type\" : \"Bearer\","
        + "\"expires_in\" : 3600,"
        + "\"refresh_token\" : \"newRefreshToken\"}");

    OfflineCredentials offlineCredentials = new OfflineCredentials.Builder()
        .forApi(OfflineCredentials.Api.DFP)
        .withTokenUrlServer(testHttpServer.getServerUrl())
        .withClientSecrets("clientId", "clientSecret")
        .withRefreshToken("refreshToken")
        .build();

    Credential credential = offlineCredentials.generateCredential();

    assertTrue(testHttpServer.getLastRequestBody().contains("grant_type=refresh_token"));
    assertTrue(testHttpServer.getLastRequestBody().contains("refresh_token=refreshToken"));
    assertTrue(testHttpServer.getLastRequestBody().contains("client_id=clientId"));
    assertTrue(testHttpServer.getLastRequestBody().contains("client_secret=clientSecret"));

    assertEquals("accessToken", credential.getAccessToken());
    assertEquals("newRefreshToken", credential.getRefreshToken());
  }

  /**
   * Tests that the builder builds and gets an OAuth2 token correctly from a
   * file.
   */
  @Test
  public void testGenerateCredentialFromFile() throws Exception {
    testHttpServer.setMockResponseBody(
        "{\"access_token\" : \"accessToken\","
        + "\"token_type\" : \"Bearer\","
        + "\"expires_in\" : 3600,"
        + "\"refresh_token\" : \"newRefreshToken\"}");

    OfflineCredentials offlineCredentials =
        new OfflineCredentials.Builder()
            .forApi(OfflineCredentials.Api.DFP)
            .withTokenUrlServer(testHttpServer.getServerUrl())
            .fromFile(
                OfflineCredentialsIntegrationTest.class.getResource("props/ads-test.properties"))
            .build();

    Credential credential = offlineCredentials.generateCredential();

    assertTrue(testHttpServer.getLastRequestBody().contains("grant_type=refresh_token"));
    assertTrue(testHttpServer.getLastRequestBody().contains("refresh_token=refreshToken"));
    assertTrue(testHttpServer.getLastRequestBody().contains("client_id=clientId"));
    assertTrue(testHttpServer.getLastRequestBody().contains("client_secret=clientSecret"));

    assertEquals("accessToken", credential.getAccessToken());
    assertEquals("newRefreshToken", credential.getRefreshToken());
  }
}
