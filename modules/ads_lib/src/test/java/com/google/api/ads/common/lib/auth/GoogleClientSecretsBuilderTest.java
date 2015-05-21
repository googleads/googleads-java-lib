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
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.auth.GoogleClientSecretsBuilder.GoogleClientSecretsForApiBuilder;
import com.google.api.ads.common.lib.conf.ConfigurationHelper;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Tests for {@link OfflineCredentials}.
 *
 * @author Adam Rogal
 */
@RunWith(JUnit4.class)
public class GoogleClientSecretsBuilderTest {

  @Mock private ConfigurationHelper configurationHelper;
  @Mock private OAuth2Helper oAuth2Helper;

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testGoogleSecretsReadPropertiesFromConfiguration() throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientId", "clientId");
    config.setProperty("api.dfp.clientSecret", "clientSecret");

    GoogleClientSecrets googleClientSecrets = new GoogleClientSecretsBuilder()
        .forApi(GoogleClientSecretsBuilder.Api.DFP)
        .from(config)
        .build();

    assertEquals(googleClientSecrets.getInstalled().getClientId(), "clientId");
    assertEquals(googleClientSecrets.getInstalled().getClientSecret(), "clientSecret");
  }

  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testGoogleSecretsReadPropertiesFromConfiguration_properPrefix()
      throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientId", "clientIdDfp");
    config.setProperty("api.dfp.clientSecret", "clientSecretDfp");
    config.setProperty("api.adwords.clientId", "clientIdAdWords");
    config.setProperty("api.adwords.clientSecret", "clientSecretAdWords");

    GoogleClientSecrets googleClientSecrets = new GoogleClientSecretsBuilder()
        .forApi(GoogleClientSecretsBuilder.Api.DFP)
        .from(config)
        .build();

    assertEquals(googleClientSecrets.getInstalled().getClientId(), "clientIdDfp");
    assertEquals(googleClientSecrets.getInstalled().getClientSecret(), "clientSecretDfp");
  }

  /**
   * Tests that the builder correctly fails on a bad configuration.
   */
  @Test
  public void testGoogleSecretsReadPropertiesFromConfiguration_missingClientId() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientSecret", "clientSecret");

    thrown.expect(ValidationException.class);
    new GoogleClientSecretsBuilder()
        .forApi(GoogleClientSecretsBuilder.Api.DFP)
        .from(config)
        .build();
  }

  /**
   * Tests that the builder correctly fails on a bad configuration.
   */
  @Test
  public void testGoogleSecretsReadPropertiesFromConfiguration_missingClientSecret()
      throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientId", "clientId");
    
    thrown.expect(ValidationException.class);
    new GoogleClientSecretsBuilder()
        .forApi(GoogleClientSecretsBuilder.Api.DFP)
        .from(config)
        .build();
  }

  /**
   * Tests that the builder correctly reads from a file.
   */
  @Test
  public void testGoogleSecretsReadPropertiesFromFile() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientId", "clientId");
    config.setProperty("api.dfp.clientSecret", "clientSecret");

    when(configurationHelper.fromFile("path")).thenReturn(config);

    GoogleClientSecretsForApiBuilder builder = new GoogleClientSecretsForApiBuilder(
        configurationHelper, GoogleClientSecretsBuilder.Api.DFP);

    GoogleClientSecrets googleClientSecrets = builder.fromFile("path").build();

    assertEquals(googleClientSecrets.getInstalled().getClientId(), "clientId");
    assertEquals(googleClientSecrets.getInstalled().getClientSecret(), "clientSecret");
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

    GoogleClientSecretsForApiBuilder builder = new GoogleClientSecretsForApiBuilder(
        configurationHelper, GoogleClientSecretsBuilder.Api.DFP);

    thrown.expect(ValidationException.class);
    thrown.expectMessage("Client ID must be set as api.dfp.clientId in /home/user/path."
        + "\nIf you do not have a client ID or secret, please create one in the API "
        + "console: https://console.developers.google.com");
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

    GoogleClientSecretsForApiBuilder builder = new GoogleClientSecretsForApiBuilder(
        configurationHelper, GoogleClientSecretsBuilder.Api.DFP);

    thrown.expect(ValidationException.class);
    thrown.expectMessage("Client ID must be set."
        + "\nIf you do not have a client ID or secret, please create one in the API "
        + "console: https://console.developers.google.com");
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

    GoogleClientSecretsForApiBuilder builder = new GoogleClientSecretsForApiBuilder(
        configurationHelper, GoogleClientSecretsBuilder.Api.DFP);

    thrown.expect(ValidationException.class);
    thrown.expectMessage("Client secret must be set as api.dfp.clientSecret in /home/user/path."
        + "\nIf you do not have a client ID or secret, please create one in the API "
        + "console: https://console.developers.google.com");
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

    GoogleClientSecretsForApiBuilder builder = new GoogleClientSecretsForApiBuilder(
        configurationHelper, GoogleClientSecretsBuilder.Api.DFP);

    thrown.expect(ValidationException.class);
    thrown.expectMessage("Client secret must be set."
        + "\nIf you do not have a client ID or secret, please create one in the API "
        + "console: https://console.developers.google.com");
    builder.from(config).build();
  }

  /**
   * Tests that the builder builds correctly.
   */
  @Test
  public void testBuilder() throws Exception {
    GoogleClientSecrets clientSecrets = new GoogleClientSecretsBuilder()
        .forApi(GoogleClientSecretsBuilder.Api.DFP)
        .withClientSecrets("clientId", "clientSecret")
        .build();

    assertNotNull(clientSecrets.getDetails());
    assertEquals(clientSecrets.getDetails().getClientId(), "clientId");
    assertEquals(clientSecrets.getDetails().getClientSecret(), "clientSecret");
  }

  /**
   * Tests that the builder correctly throws exception when client ID or client 
   * secret is a default value.
   */
  @Test
  public void testBuilder_defaultClientIdAndSecret() throws Exception {
    thrown.expect(ValidationException.class);
    thrown.expectMessage("Client ID must be set."
        + "\nIf you do not have a client ID or secret, please create one in the API "
        + "console: https://console.developers.google.com");
    new GoogleClientSecretsBuilder()
        .forApi(GoogleClientSecretsBuilder.Api.DFP)
        .withClientSecrets("INSERT_CLIENT_ID_HERE", "INSERT_CLIENT_SECRET_HERE")
        .build();
  }

  /**
   * Tests that the builder correctly throws exception when client ID is a 
   * default value.
   */
  @Test
  public void testReadPropertiesFromFile_defaultClientId() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientId", "INSERT_CLIENT_ID_HERE");

    GoogleClientSecretsForApiBuilder builder = new GoogleClientSecretsForApiBuilder(
        configurationHelper, GoogleClientSecretsBuilder.Api.DFP);

    thrown.expect(ValidationException.class);
    thrown.expectMessage("Client ID must be set."
        + "\nIf you do not have a client ID or secret, please create one in the API "
        + "console: https://console.developers.google.com");
    builder.from(config).build();
  }

  /**
   * Tests that the builder correctly throws exception when client secret is a 
   * default value.
   */
  @Test
  public void testReadPropertiesFromFile_defaultClientSecret() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientId", "clientId");
    config.setProperty("api.dfp.clientId", "INSERT_CLIENT_SECRET_HERE");

    GoogleClientSecretsForApiBuilder builder = new GoogleClientSecretsForApiBuilder(
        configurationHelper, GoogleClientSecretsBuilder.Api.DFP);

    thrown.expect(ValidationException.class);
    thrown.expectMessage("Client secret must be set."
        + "\nIf you do not have a client ID or secret, please create one in the API "
        + "console: https://console.developers.google.com");
    builder.from(config).build();
  }
}
