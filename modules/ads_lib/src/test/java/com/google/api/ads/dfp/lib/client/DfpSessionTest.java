// Copyright 2011 Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfp.lib.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.verify;

import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth.OAuthParameters;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

/**
 * Tests for {@link DfpSession}.
 */
@RunWith(JUnit4.class)
public class DfpSessionTest {

  @Mock private Logger mockLibLogger;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration() throws ValidationException {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.email", "email");
    config.setProperty("api.dfp.password", "password");
    config.setProperty("api.dfp.applicationName", "FooBar");

    DfpSession session =
        new DfpSession.Builder().from(config).withOAuth2Credential(credential).build();
    assertEquals(session.getApplicationName(), "FooBar");
    assertSame(session.getOAuth2Credential(), credential);
    assertEquals(session.getEndpoint(), DfpSession.DEFAULT_ENDPOINT);
  }

  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_badEndpoint() {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    String badEndpoint = "3efsdafasd";
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.email", "email");
    config.setProperty("api.dfp.password", "password");
    config.setProperty("api.dfp.applicationName", "FooBar");
    config.setProperty("api.dfp.endpoint", "3efsdafasd");

    try {
      new DfpSession.Builder().from(config).withOAuth2Credential(credential).build();
      fail("Validation exception expected.");
    } catch (ValidationException e) {
      assertEquals("endpoint", e.getTrigger());
      assertTrue(e.getMessage().contains(badEndpoint));
    }
  }

  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_noApplicationName() {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    PropertiesConfiguration config = new PropertiesConfiguration();

    try {
      new DfpSession.Builder().from(config).withOAuth2Credential(credential).build();
      fail("Validation exception expected.");
    } catch (ValidationException e) {
      assertEquals("applicationName", e.getTrigger());
    }
  }

  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_defaultApplicationName() {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.applicationName", "INSERT_APPLICATION_NAME_HERE");

    try {
      new DfpSession.Builder().from(config).withOAuth2Credential(credential).build();
      fail("Validation exception expected.");
    } catch (ValidationException e) {
      assertEquals("applicationName", e.getTrigger());
    }
  }

  /**
   * Tests that client login deprecation is warned from properties.
   */
  @Test
  public void testReadPropertiesFromConfiguration_clientLoginDeprecationWarning() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfp.applicationName", "FooBar");
    config.setProperty("api.dfp.clientLoginToken", "clientLoginToken");

    new DfpSession.Builder(mockLibLogger).from(config).build();

    verify(mockLibLogger).warn(DfpSession.DEPRECATION_MESSAGE);
  }

  /**
   * Tests that the builder builds correctly with a default endpoint.
   */
  @Test
  public void testBuilder_defaultEndpoint() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    DfpSession dfpSession = new DfpSession.Builder()
        .withApplicationName("FooBar")
        .withOAuth2Credential(credential)
        .withNetworkCode("networkCode")
        .build();

    assertEquals(dfpSession.getApplicationName(), "FooBar");
    assertSame(dfpSession.getOAuth2Credential(), credential);
    assertEquals(dfpSession.getEndpoint(), DfpSession.DEFAULT_ENDPOINT);
    assertEquals(dfpSession.getNetworkCode(), "networkCode");
  }

  /**
   * Tests that the builder builds correctly for client login.
   */
  @Test
  public void testBuilder_clientLogin() throws Exception {
    DfpSession dfpSession = new DfpSession.Builder()
        .withApplicationName("FooBar")
        .withClientLoginToken("clientLoginToken")
        .withEndpoint("https://ads.google.com")
        .withNetworkCode("networkCode")
        .build();

    assertEquals(dfpSession.getApplicationName(), "FooBar");
    assertEquals(dfpSession.getClientLoginToken(), "clientLoginToken");
    assertEquals(dfpSession.getEndpoint(), "https://ads.google.com");
    assertEquals(dfpSession.getNetworkCode(), "networkCode");
  }

  /**
   * Tests that the builder  warns for client login.
   */
  @Test
  public void testBuilder_clientLoginDeprecationWarning() throws Exception {
    new DfpSession.Builder(mockLibLogger)
        .withApplicationName("FooBar")
        .withClientLoginToken("clientLoginToken")
        .withEndpoint("https://ads.google.com")
        .withNetworkCode("networkCode")
        .build();

    verify(mockLibLogger).warn(DfpSession.DEPRECATION_MESSAGE);
  }

  /**
   * Tests that the builder builds correctly for client login.
   */
  @Test
  public void testSetClientLoginDeprecationWarning() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    DfpSession dfpSession = new DfpSession.Builder(mockLibLogger)
        .withApplicationName("FooBar")
        .withOAuth2Credential(credential)
        .withEndpoint("https://ads.google.com")
        .withNetworkCode("networkCode")
        .build();

    dfpSession.setClientLoginToken("clientLoginToken");
    verify(mockLibLogger).warn(DfpSession.DEPRECATION_MESSAGE);
  }

  /**
   * Tests that the builder builds correctly for OAuth2.
   */
  @Test
  public void testBuilder_oAuth2() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    DfpSession dfpSession = new DfpSession.Builder()
        .withApplicationName("FooBar")
        .withEndpoint("https://ads.google.com")
        .withOAuth2Credential(credential)
        .withNetworkCode("networkCode")
        .build();

    assertEquals(dfpSession.getApplicationName(), "FooBar");
    assertSame(dfpSession.getOAuth2Credential(), credential);
    assertEquals(dfpSession.getEndpoint(), "https://ads.google.com");
    assertEquals(dfpSession.getNetworkCode(), "networkCode");
  }

  /**
   * Tests that the builder builds for multiple auths.
   */
  @Test
  public void testBuilder_clientLoginAndOAuth2() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    DfpSession dfpSession = new DfpSession.Builder()
        .withApplicationName("FooBar")
        .withEndpoint("https://ads.google.com")
        .withClientLoginToken("clientLogin")
        .withOAuth2Credential(credential)
        .withNetworkCode("networkCode")
        .build();

    assertSame(dfpSession.getOAuth2Credential(), credential);
  }

  /**
   * Makes sure the builder returns a copy so that making (un-validated) changes
   * in the builder doesn't mutate previously built objects.
   */
  @Test
  public void testBuilder_returnsCopies() throws Exception {
    DfpSession.Builder builder = new DfpSession.Builder()
        .withApplicationName("FooBar")
        .withClientLoginToken("clientLoginToken")
        .withNetworkCode("networkCode");
    assertNotSame(builder.build(), builder.build());
  }

  /**
   * Tests that the builder does not build for no auths.
   */
  @Test
  public void testBuilder_noAuths() throws Exception {
    try {
      new DfpSession.Builder()
          .withApplicationName("FooBar")
          .withEndpoint("https://ads.google.com")
          .withNetworkCode("networkCode")
          .build();
      fail("Validation exception expected.");
    } catch (ValidationException e) {
      assertEquals("Either ClientLogin or OAuth2 authentication must be used.", e.getMessage());
    }
  }

  /**
   * Tests that the builder does not build with no application name.
   */
  @Test
  public void testBuilder_noApplicationName() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    try {
      new DfpSession.Builder()
          .withEndpoint("https://ads.google.com")
          .withNetworkCode("networkCode")
          .withOAuth2Credential(credential)
          .build();
      fail("Validation exception expected.");
    } catch (ValidationException e) {
      assertEquals(
          "Application name must be set and not be the default [INSERT_APPLICATION_NAME_HERE]",
          e.getMessage());
    }
  }

  /**
   * Tests that the builder does not build with default application name.
   */
  @Test
  public void testBuilder_defaultApplicationName() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    try {
      new DfpSession.Builder()
          .withEndpoint("https://ads.google.com")
          .withNetworkCode("networkCode")
          .withOAuth2Credential(credential)
          .withApplicationName("INSERT_APPLICATION_NAME_HERE")
          .build();
      fail("Validation exception expected.");
    } catch (ValidationException e) {
      assertEquals(
          "Application name must be set and not be the default [INSERT_APPLICATION_NAME_HERE]",
          e.getMessage());
    }
  }

  /**
   * Tests that setting authentication clears out other types of authentication.
   */
  @Test
  public void testSetAutentication_clear() throws Exception {
    OAuthParameters oAuthParameters = new OAuthParameters();
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    DfpSession dfpSession = new DfpSession.Builder()
        .withApplicationName("FooBar")
        .withEndpoint("https://ads.google.com")
        .withClientLoginToken("clientLogin")
        .withNetworkCode("networkCode")
        .build();

    dfpSession.setOAuth2Credential(credential);
    assertSame(credential, dfpSession.getOAuth2Credential());
    assertNull(dfpSession.getClientLoginToken());

    dfpSession.setClientLoginToken("clientLogin");
    assertEquals("clientLogin", dfpSession.getClientLoginToken());
    assertNull(dfpSession.getOAuth2Credential());
  }

  /**
   * Verifies that when a second auth method is set into the builder the others are cleared.
   */
  @Test
  public void testBuilder_bothAuthsClientLoginFirst() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());
    DfpSession.Builder builder = new DfpSession.Builder()
        .withApplicationName("FooBar")
        .withOAuth2Credential(credential)
        .withClientLoginToken("foo")
        .withEndpoint("https://ads.google.com")
        .withNetworkCode("networkCode");
    assertEquals("foo", builder.build().getClientLoginToken());
  }

  /**
   * Verifies that when a second auth method is set into the builder the others are cleared.
   */
  @Test
  public void testBuilder_bothAuthsOAuth2First() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());
    DfpSession.Builder builder = new DfpSession.Builder()
        .withApplicationName("FooBar")
        .withClientLoginToken("foo")
        .withOAuth2Credential(credential)
        .withEndpoint("https://ads.google.com")
        .withNetworkCode("networkCode");
    assertSame(credential, builder.build().getOAuth2Credential());
  }

  /**
   * Tests that setting authentication to null errors.
   */
  @Test
  public void testSetAutentication_null() throws Exception {
    DfpSession dfpSession = new DfpSession.Builder()
        .withApplicationName("FooBar")
        .withEndpoint("https://ads.google.com")
        .withClientLoginToken("clientLogin")
        .withNetworkCode("networkCode")
        .build();

    try {
      dfpSession.setOAuth2Credential(null);
      fail("NullPointerException expected");
    } catch (NullPointerException e) {
      assertTrue("Expected oAuth2Credential in error message",
          e.getMessage().contains("oAuth2Credential"));
    }

    try {
      dfpSession.setClientLoginToken(null);
      fail("NullPointerException expected");
    } catch (NullPointerException e) {
      assertTrue("Expected clientLoginToken in error message",
          e.getMessage().contains("clientLoginToken"));
    }
  }

}
