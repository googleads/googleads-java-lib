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

package com.google.api.ads.common.lib.auth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.auth.ClientLoginTokens.ForApiBuilder;
import com.google.api.ads.common.lib.conf.ConfigurationHelper;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Tests for {@link ClientLoginTokens}.
 *
 * @author Adam Rogal
 */
@RunWith(JUnit4.class)
public class ClientLoginTokensTest {

  @Mock ConfigurationHelper configurationHelper;

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

    ClientLoginTokens clientLoginTokens =
        new ClientLoginTokens.Builder()
            .forApi(ClientLoginTokens.Api.DFP)
            .withEmailAndPassword("foo", "bar")
            .withClientLoginServerUrl("https://server.url.com")
            .withHttpTransport(httpTransport)
            .build();

    assertEquals(clientLoginTokens.clientLogin.getUsername(), "foo");
    assertEquals(clientLoginTokens.clientLogin.getPassword(), "bar");
    assertEquals(clientLoginTokens.clientLogin.getServerUrl().toString(), "https://server.url.com");
    assertSame(clientLoginTokens.clientLogin.getTransport(), httpTransport);
    assertEquals(clientLoginTokens.clientLogin.getAuthTokenType(),
        ClientLoginTokens.Api.DFP.getService());
    assertEquals(clientLoginTokens.clientLogin.getAccountType(), "GOOGLE");
  }

  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration() throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.email", "email");
    config.setProperty("api.dfp.password", "password");
    config.setProperty("clientLoginServerUrl", "https://server.url.com");

    ClientLoginTokens clientLoginTokens =
        new ClientLoginTokens.Builder().forApi(ClientLoginTokens.Api.DFP).from(config).build();
    assertEquals(clientLoginTokens.clientLogin.getUsername(), "email");
    assertEquals(clientLoginTokens.clientLogin.getPassword(), "password");
    assertEquals(clientLoginTokens.clientLogin.getAuthTokenType(),
        ClientLoginTokens.Api.DFP.getService());
    assertEquals(clientLoginTokens.clientLogin.getServerUrl().toString(), "https://server.url.com");
  }

  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_properPrefix() throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.email", "emailDfp");
    config.setProperty("api.dfp.password", "passwordDfp");
    config.setProperty("api.adwords.email", "emailAdWords");
    config.setProperty("api.adwords.password", "passwordAdWords");
    config.setProperty("clientLoginServerUrl", "https://server.url.com");

    ClientLoginTokens clientLoginTokens =
        new ClientLoginTokens.Builder().forApi(ClientLoginTokens.Api.DFP).from(config).build();
    assertEquals(clientLoginTokens.clientLogin.getUsername(), "emailDfp");
    assertEquals(clientLoginTokens.clientLogin.getPassword(), "passwordDfp");
    assertEquals(clientLoginTokens.clientLogin.getAuthTokenType(),
        ClientLoginTokens.Api.DFP.getService());
    assertEquals(clientLoginTokens.clientLogin.getServerUrl().toString(), "https://server.url.com");
  }

  /**
   * Tests that the builder correctly fails on a bad configuration.
   */
  @Test(expected = ValidationException.class)
  public void testReadPropertiesFromConfiguration_badBothConfiguration() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.email", "email");
    config.setProperty("api.dfp.password", "password");
    config.setProperty("clientLoginServerUrl", "https://server.url.com");
    config.setProperty("api.dfp.clientLoginToken", "https://server.url.com");

    ClientLoginTokens clientLoginTokens =
        new ClientLoginTokens.Builder().forApi(ClientLoginTokens.Api.DFP).from(config).build();
  }

  /**
   * Tests that the builder correctly fails on a bad configuration.
   */
  @Test(expected = ValidationException.class)
  public void testReadPropertiesFromConfiguration_badNeitherConfiguration() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.adwords.email", "email");
    config.setProperty("api.adwords.password", "password");
    config.setProperty("clientLoginServerUrl", "https://server.url.com");

    ClientLoginTokens clientLoginTokens =
        new ClientLoginTokens.Builder().forApi(ClientLoginTokens.Api.DFP).from(config).build();
  }

  /**
   * Tests that the builder correctly reads from a file.
   */
  @Test
  public void testReadPropertiesFromFile() throws Exception {
    ClientLogin clientLogin = new ClientLogin();

    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.email", "email");
    config.setProperty("api.dfp.password", "password");
    config.setProperty("clientLoginServerUrl", "https://server.url.com");

    when(configurationHelper.fromFile("path")).thenReturn(config);

    ForApiBuilder builder = new ClientLoginTokens.ForApiBuilder(
        configurationHelper, clientLogin, ClientLoginTokens.Api.DFP);

    ClientLoginTokens clientLoginTokens = builder.fromFile("path").build();

    assertEquals(clientLoginTokens.clientLogin.getUsername(), "email");
    assertEquals(clientLoginTokens.clientLogin.getPassword(), "password");
    assertEquals(clientLoginTokens.clientLogin.getAuthTokenType(),
        ClientLoginTokens.Api.DFP.getService());
    assertEquals(clientLoginTokens.clientLogin.getServerUrl().toString(), "https://server.url.com");
  }

  /**
   * Tests that the underlying client login gets called.
   */
  @Test
  public void testRequest() throws Exception {
    ClientLogin clientLogin = Mockito.mock(ClientLogin.class);

    ClientLoginTokens clientLoginTokens = new ClientLoginTokens(clientLogin);

    when(clientLogin.requestToken()).thenReturn("theToken");

    assertEquals("theToken", clientLoginTokens.requestToken());
  }

  /**
   * Tests that captcha gets set and then nulled out.
   */
  @Test
  public void testRequestWithCaptcha() throws Exception {
    ClientLogin clientLogin = Mockito.mock(ClientLogin.class);
    ClientLoginTokens clientLoginTokens = new ClientLoginTokens(clientLogin);
    String captchaAnswer = "answer";
    String captchaToken = "token";

    when(clientLogin.requestToken()).thenReturn("theToken");

    assertEquals("theToken", clientLoginTokens.requestToken(captchaToken, captchaAnswer));

    verify(clientLogin).setCaptchaAnswer(captchaAnswer);
    verify(clientLogin).setCaptchaToken(captchaToken);
    verify(clientLogin).setCaptchaAnswer(null);
    verify(clientLogin).setCaptchaToken(null);
  }

  /**
   * Tests that the builder correctly reads from a file and overrides clientLoginToken.
   */
  @Test
  public void testReadPropertiesFromFile_overrideClientLoginToken() throws Exception {
    ClientLogin clientLogin = new ClientLogin();

    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.clientLoginToken", "AUTH_TOKEN");

    when(configurationHelper.fromFile("path")).thenReturn(config);

    ForApiBuilder builder = new ClientLoginTokens.ForApiBuilder(
        configurationHelper, clientLogin, ClientLoginTokens.Api.DFP);

    ClientLoginTokens clientLoginTokens = builder.fromFile("path").build();

    assertEquals("AUTH_TOKEN", clientLoginTokens.getToken());
  }
}
