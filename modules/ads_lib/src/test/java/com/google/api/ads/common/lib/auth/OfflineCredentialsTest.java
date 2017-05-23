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
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.auth.OfflineCredentials.ForApiBuilder;
import com.google.api.ads.common.lib.conf.ConfigurationHelper;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.ClientParametersAuthentication;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import java.io.IOException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Tests for {@link OfflineCredentials}.
 */
@RunWith(JUnit4.class)
public class OfflineCredentialsTest {

  @Mock ConfigurationHelper configurationHelper;
  @Mock OAuth2Helper oAuth2Helper;

  @Rule public ExpectedException thrown = ExpectedException.none();
  
  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  /**
   * Tests that the builder builds correctly.
   */
  @Test
  public void testBuilder() throws Exception {
    HttpTransport httpTransport = new NetHttpTransport();

    OfflineCredentials offlineCredentials = new OfflineCredentials.Builder()
        .forApi(OfflineCredentials.Api.DFP)
        .withClientSecrets("clientId", "clientSecret")
        .withRefreshToken("refreshToken")
        .withHttpTransport(httpTransport)
        .build();

    assertEquals("clientId", offlineCredentials.getClientId());
    assertEquals("clientSecret", offlineCredentials.getClientSecret());
    assertEquals("refreshToken", offlineCredentials.getRefreshToken());
    assertSame(httpTransport, offlineCredentials.getHttpTransport());
  }
  
  /**
   * Tests that the builder builds correctly using a service account key file.
   */
  @Test
  public void testBuilder_serviceAccount() throws Exception {
    OfflineCredentials offlineCredentials = new OfflineCredentials.Builder()
        .forApi(OfflineCredentials.Api.DFP)
        .withJsonKeyFilePath("jsonKeyFilePath")
        .build();

    assertEquals("jsonKeyFilePath", offlineCredentials.getJsonKeyFilePath());
  }
  
  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_dfp() throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientId", "clientId");
    config.setProperty("api.dfp.clientSecret", "clientSecret");
    config.setProperty("api.dfp.refreshToken", "refreshToken");
    
    OfflineCredentials offlineCredentials = new OfflineCredentials.Builder()
        .forApi(OfflineCredentials.Api.DFP)
        .from(config)
        .build();

    assertEquals("clientId", offlineCredentials.getClientId());
    assertEquals("clientSecret", offlineCredentials.getClientSecret());
    assertEquals("refreshToken", offlineCredentials.getRefreshToken());
  }
  
  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_dfpServiceAccount() throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.jsonKeyFilePath", "jsonKeyFilePath");
    
    OfflineCredentials offlineCredentials = new OfflineCredentials.Builder()
        .forApi(OfflineCredentials.Api.DFP)
        .from(config)
        .build();

    assertEquals("jsonKeyFilePath", offlineCredentials.getJsonKeyFilePath());
  }

  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_adwords() throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.adwords.clientId", "clientId");
    config.setProperty("api.adwords.clientSecret", "clientSecret");
    config.setProperty("api.adwords.refreshToken", "refreshToken");

    OfflineCredentials offlineCredentials = new OfflineCredentials.Builder()
        .forApi(OfflineCredentials.Api.ADWORDS)
        .from(config)
        .build();

    assertEquals("clientId", offlineCredentials.getClientId());
    assertEquals("clientSecret", offlineCredentials.getClientSecret());
    assertEquals("refreshToken", offlineCredentials.getRefreshToken());
  }
  
  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_adWordsServiceAccount() 
      throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.adwords.jsonKeyFilePath", "jsonKeyFilePath");
    
    OfflineCredentials offlineCredentials = new OfflineCredentials.Builder()
        .forApi(OfflineCredentials.Api.ADWORDS)
        .from(config)
        .build();

    assertEquals("jsonKeyFilePath", offlineCredentials.getJsonKeyFilePath());
  }

  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_properPrefix() throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientId", "clientIdDfp");
    config.setProperty("api.dfp.clientSecret", "clientSecretDfp");
    config.setProperty("api.dfp.refreshToken", "refreshTokenDfp");
    config.setProperty("api.adwords.clientId", "clientIdAdWords");
    config.setProperty("api.adwords.clientSecret", "clientSecretAdWords");
    config.setProperty("api.adwords.refreshToken", "refreshTokenAdWords");

    OfflineCredentials offlineCredentials = new OfflineCredentials.Builder()
        .forApi(OfflineCredentials.Api.DFP)
        .from(config)
        .build();

    assertEquals("clientIdDfp", offlineCredentials.getClientId());
    assertEquals("clientSecretDfp", offlineCredentials.getClientSecret());
    assertEquals("refreshTokenDfp", offlineCredentials.getRefreshToken());
  }
  
  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_properPrefixServiceAccount()
      throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.jsonKeyFilePath", "jsonKeyFilePathDfp");
    config.setProperty("api.adwords.jsonKeyFilePath", "jsonKeyFilePathAdWords");

    OfflineCredentials offlineCredentials = new OfflineCredentials.Builder()
        .forApi(OfflineCredentials.Api.DFP)
        .from(config)
        .build();

    assertEquals("jsonKeyFilePathDfp", offlineCredentials.getJsonKeyFilePath());
  }

  /**
   * Tests that the builder correctly fails on a bad configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_missingClientId() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientSecret", "clientSecret");
    config.setProperty("api.dfp.refreshToken", "refreshToken");

    thrown.expect(ValidationException.class);
    new OfflineCredentials.Builder()
        .forApi(OfflineCredentials.Api.DFP)
        .from(config)
        .build();
  }

  /**
   * Tests that the builder correctly fails on a bad configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_missingClientSecret() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientId", "clientId");
    config.setProperty("api.dfp.refreshToken", "refreshToken");

    thrown.expect(ValidationException.class);
    new OfflineCredentials.Builder()
        .forApi(OfflineCredentials.Api.DFP)
        .from(config)
        .build();
  }

  /**
   * Tests that the builder correctly fails on a bad configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_missingRefreshToken() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientId", "clientId");
    config.setProperty("api.dfp.clientSecret", "clientSecret");

    thrown.expect(ValidationException.class);
    new OfflineCredentials.Builder()
        .forApi(OfflineCredentials.Api.DFP)
        .from(config)
        .build();
  }
  
  /**
   * Tests that the builder does not fail when missing everything but a service account key.
   */
  @Test
  public void testReadPropertiesFromConfiguration_onlyKeyFilePath() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.jsonKeyFilePath", "jsonKeyFilePath");

    new OfflineCredentials.Builder()
        .forApi(OfflineCredentials.Api.DFP)
        .from(config)
        .build();
  }
  
  /**
   * Tests that the builder correctly fails on a bad configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_multipleOAuthTypes() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientSecret", "clientSecret");
    config.setProperty("api.dfp.jsonKeyFilePath", "jsonKeyFilePath");

    thrown.expect(ValidationException.class);
    new OfflineCredentials.Builder()
        .forApi(OfflineCredentials.Api.DFP)
        .from(config)
        .build();
  }

  /**
   * Tests that the builder correctly reads from a file.
   */
  @Test
  public void testReadPropertiesFromFile() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientId", "clientId");
    config.setProperty("api.dfp.clientSecret", "clientSecret");
    config.setProperty("api.dfp.refreshToken", "refreshToken");

    when(configurationHelper.fromFile("path")).thenReturn(config);

    ForApiBuilder builder = new OfflineCredentials.ForApiBuilder(
        configurationHelper, OfflineCredentials.Api.DFP, oAuth2Helper);

    OfflineCredentials offlineCredentials = builder.fromFile("path").build();

    assertEquals("clientId", offlineCredentials.getClientId());
    assertEquals("clientSecret", offlineCredentials.getClientSecret());
    assertEquals("refreshToken", offlineCredentials.getRefreshToken());
  }

  /**
   * Tests that the builder correctly reads from a file.
   */
  @Test
  public void testReadPropertiesFromFile_withOverride() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientId", "clientId");
    config.setProperty("api.dfp.clientSecret", "clientSecret");
    config.setProperty("api.dfp.refreshToken", "refreshToken");

    when(configurationHelper.fromFile("path")).thenReturn(config);

    ForApiBuilder builder = new OfflineCredentials.ForApiBuilder(
        configurationHelper, OfflineCredentials.Api.DFP, oAuth2Helper);

    OfflineCredentials offlineCredentials =
        builder.fromFile("path").withRefreshToken("overrideRefreshToken").build();

    assertEquals("clientId", offlineCredentials.getClientId());
    assertEquals("clientSecret", offlineCredentials.getClientSecret());
    assertEquals("overrideRefreshToken", offlineCredentials.getRefreshToken());
  }

  /**
   * Tests that the builder correctly identifies the file path.
   */
  @Test
  public void testReadPropertiesFromFile_refreshTokenBadWithFilePath() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientId", "clientId");
    config.setProperty("api.dfp.clientSecret", "clientSecret");

    when(configurationHelper.fromFile("/home/user/path")).thenReturn(config);

    ForApiBuilder builder = new OfflineCredentials.ForApiBuilder(
        configurationHelper, OfflineCredentials.Api.DFP, oAuth2Helper);

    thrown.expect(ValidationException.class);
    thrown.expectMessage("A refresh token must be set as api.dfp.refreshToken in /home/user/path."
        + "\nIt is required for offline credentials. If you need to create one, "
        + "see the GetRefreshToken example.");
    builder.fromFile("/home/user/path").build();
  }

  /**
   * Tests that the builder correctly leaves out the file path.
   */
  @Test
  public void testReadPropertiesFromFile_refreshTokenNoFilePath() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientId", "clientId");
    config.setProperty("api.dfp.clientSecret", "clientSecret");

    ForApiBuilder builder = new OfflineCredentials.ForApiBuilder(
        configurationHelper, OfflineCredentials.Api.DFP, oAuth2Helper);

    thrown.expect(ValidationException.class);
    thrown.expectMessage("A refresh token must be set."
        + "\nIt is required for offline credentials. If you need to create one, "
        + "see the GetRefreshToken example.");
    builder.from(config).build();
  }

  /**
   * Tests that the builder correctly identifies the file path.
   */
  @Test
  public void testReadPropertiesFromFile_clientIdTokenBadWithFilePath() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientSecret", "clientSecret");
    config.setProperty("api.dfp.refreshToken", "refreshToken");

    when(configurationHelper.fromFile("/home/user/path")).thenReturn(config);

    ForApiBuilder builder = new OfflineCredentials.ForApiBuilder(
        configurationHelper, OfflineCredentials.Api.DFP, oAuth2Helper);

    thrown.expect(ValidationException.class);
    thrown.expectMessage("Client ID must be set as api.dfp.clientId in /home/user/path."
        + "\nIf you do not have a client ID or secret, please create one in the API "
        + "console: https://console.developers.google.com/project");
    builder.fromFile("/home/user/path").build();
  }

  /**
   * Tests that the builder correctly leaves out the file path.
   */
  @Test
  public void testReadPropertiesFromFile_clientIdNoFilePath() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientSecret", "clientSecret");
    config.setProperty("api.dfp.refreshToken", "refreshToken");

    ForApiBuilder builder = new OfflineCredentials.ForApiBuilder(
        configurationHelper, OfflineCredentials.Api.DFP, oAuth2Helper);

    thrown.expect(ValidationException.class);
    thrown.expectMessage("Client ID must be set."
        + "\nIf you do not have a client ID or secret, please create one in the API "
        + "console: https://console.developers.google.com/project");
    builder.from(config).build();
  }

  /**
   * Tests that the builder correctly identifies the file path.
   */
  @Test
  public void testReadPropertiesFromFile_clientSecretTokenBadWithFilePath() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientId", "clientId");
    config.setProperty("api.dfp.refreshToken", "refreshToken");

    when(configurationHelper.fromFile("/home/user/path")).thenReturn(config);

    ForApiBuilder builder = new OfflineCredentials.ForApiBuilder(
        configurationHelper, OfflineCredentials.Api.DFP, oAuth2Helper);

    thrown.expect(ValidationException.class);
    thrown.expectMessage("Client secret must be set as api.dfp.clientSecret in /home/user/path."
        + "\nIf you do not have a client ID or secret, please create one in the API "
        + "console: https://console.developers.google.com/project");
    builder.fromFile("/home/user/path").build();
  }

  /**
   * Tests that the builder correctly leaves out the file path.
   */
  @Test
  public void testReadPropertiesFromFile_clientSecretNoFilePath() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientId", "clientId");
    config.setProperty("api.dfp.refreshToken", "refreshToken");

    ForApiBuilder builder = new OfflineCredentials.ForApiBuilder(
        configurationHelper, OfflineCredentials.Api.DFP, oAuth2Helper);

    thrown.expect(ValidationException.class);
    thrown.expectMessage("Client secret must be set."
        + "\nIf you do not have a client ID or secret, please create one in the API "
        + "console: https://console.developers.google.com/project");
    builder.from(config).build();
  }

  /**
   * Tests generating OAuth2 credentials.
   */
  @Test
  public void testGenerateCredential() throws Exception {
    HttpTransport httpTransport = new NetHttpTransport();

    OfflineCredentials offlineCredentials = new OfflineCredentials.Builder(oAuth2Helper)
        .forApi(OfflineCredentials.Api.DFP)
        .withClientSecrets("clientId", "clientSecret")
        .withRefreshToken("refreshToken")
        .withHttpTransport(httpTransport)
        .build();

    when(oAuth2Helper.callRefreshToken(Mockito.<Credential>anyObject())).thenReturn(true);

    Credential credential = offlineCredentials.generateCredential();

    assertEquals(
        "clientId",
        ((ClientParametersAuthentication) credential.getClientAuthentication()).getClientId());
    assertEquals(
        "clientSecret",
        ((ClientParametersAuthentication) credential.getClientAuthentication()).getClientSecret());
    assertEquals("refreshToken", credential.getRefreshToken());
    assertSame(httpTransport, credential.getTransport());
  }

  /**
   * Tests generating OAuth2 credentials.
   */
  @Test
  public void testGenerateCredential_defaultTransport() throws Exception {
    OfflineCredentials offlineCredentials = new OfflineCredentials.Builder(oAuth2Helper)
        .forApi(OfflineCredentials.Api.DFP)
        .withClientSecrets("clientId", "clientSecret")
        .withRefreshToken("refreshToken")
        .build();

    when(oAuth2Helper.callRefreshToken(Mockito.<Credential>anyObject())).thenReturn(true);

    Credential credential = offlineCredentials.generateCredential();

    assertEquals(
        "clientId",
        ((ClientParametersAuthentication) credential.getClientAuthentication()).getClientId());
    assertEquals(
        "clientSecret",
        ((ClientParametersAuthentication) credential.getClientAuthentication()).getClientSecret());
    assertEquals("refreshToken", credential.getRefreshToken());
    assertSame(ForApiBuilder.DEFAULT_HTTP_TRANSPORT, credential.getTransport());
  }

  /**
   * Tests generating OAuth2 credentials.
   */
  @Test
  public void testGenerateCredential_IOException() throws Exception {
    OfflineCredentials offlineCredentials = new OfflineCredentials.Builder(oAuth2Helper)
        .forApi(OfflineCredentials.Api.DFP)
        .withClientSecrets("clientId", "clientSecret")
        .withRefreshToken("refreshToken")
        .build();

    when(oAuth2Helper.callRefreshToken(Mockito.<Credential>anyObject()))
        .thenThrow(new IOException());

    thrown.expect(OAuthException.class);
    offlineCredentials.generateCredential();
  }
 
  /**
   * Tests generating OAuth2 credentials.
   */
  @Test
  public void testGenerateCredential_cantRefresh() throws Exception {
    OfflineCredentials offlineCredentials = new OfflineCredentials.Builder(oAuth2Helper)
        .forApi(OfflineCredentials.Api.DFP)
        .withClientSecrets("clientId", "clientSecret")
        .withRefreshToken("refreshToken")
        .build();

    when(oAuth2Helper.callRefreshToken(Mockito.<Credential>anyObject())).thenReturn(false);
    
    thrown.expect(OAuthException.class);
    offlineCredentials.generateCredential();
  }
}
