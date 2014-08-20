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

package com.google.api.ads.adwords.lib.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.api.ads.common.lib.exception.ValidationException;
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
 * Tests for {@link AdWordsSession}.
 *
 * @author Kevin Winter
 */
@RunWith(JUnit4.class)
public class AdWordsSessionTest {

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
    config.setProperty("api.adwords.clientCustomerId", "1234567890");
    config.setProperty("api.adwords.userAgent", "FooBar");
    config.setProperty("api.adwords.developerToken", "devTokendevTokendevTok");
    config.setProperty("api.adwords.isPartialFailure", "false");

    AdWordsSession session =
        new AdWordsSession.Builder().from(config).withOAuth2Credential(credential).build();
    assertEquals(session.getClientCustomerId(), "1234567890");
    assertEquals(session.getUserAgent(), "FooBar");
    assertEquals(session.getDeveloperToken(), "devTokendevTokendevTok");
    assertEquals(session.isPartialFailure(), Boolean.FALSE);
    assertNull("reportMoneyInMicros should not be set if not explicitly specified in the config",
        session.isReportMoneyInMicros());
  }

  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_badEndpoint() {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    String badEndpoint = "3efsdafasd";
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.adwords.clientCustomerId", "1234567890");
    config.setProperty("api.adwords.userAgent", "FooBar");
    config.setProperty("api.adwords.developerToken", "devTokendevTokendevTok");
    config.setProperty("api.adwords.isPartialFailure", "false");
    config.setProperty("api.adwords.endpoint", "3efsdafasd");

    try {
      new AdWordsSession.Builder().from(config).withOAuth2Credential(credential).build();
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
  public void testReadPropertiesFromConfiguration_noUserAgent() {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());
    
    PropertiesConfiguration config = new PropertiesConfiguration();    

    try {
      new AdWordsSession.Builder()
          .from(config)
          .withDeveloperToken("devTokendevTokendevTok")
          .withOAuth2Credential(credential)
          .build();
      fail("Validation exception expected.");
    } catch (ValidationException e) {
      assertEquals("userAgent", e.getTrigger());      
    }
  }
  
  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_defaultUserAgent() {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());
    
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.adwords.userAgent", "INSERT_USERAGENT_HERE");

    try {
      new AdWordsSession.Builder()
          .from(config)
          .withDeveloperToken("devTokendevTokendevTok")
          .withOAuth2Credential(credential)
          .build();
      fail("Validation exception expected.");
    } catch (ValidationException e) {
      assertEquals("userAgent", e.getTrigger());      
    }
  }

  /**
   * Tests that the builder builds correctly with a default endpoint.
   */
  @Test
  public void testBuilder_defaultEndpoint() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    AdWordsSession adWordsSession = new AdWordsSession.Builder()
        .withUserAgent("FooBar")
        .withOAuth2Credential(credential)
        .withDeveloperToken("developerToken")
        .build();

    assertEquals(adWordsSession.getUserAgent(), "FooBar");
    assertSame(adWordsSession.getOAuth2Credential(), credential);
    assertEquals(adWordsSession.getEndpoint(), AdWordsSession.DEFAULT_ENDPOINT);
    assertEquals(adWordsSession.getDeveloperToken(), "developerToken");
  }

  /**
   * Tests that the builder builds correctly for OAuth2.
   */
  @Test
  public void testBuilder_oAuth2() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    AdWordsSession adWordsSession = new AdWordsSession.Builder()
        .withUserAgent("FooBar")
        .withEndpoint("https://www.google.com")
        .withOAuth2Credential(credential)
        .withDeveloperToken("developerToken")
        .build();

    assertEquals(adWordsSession.getUserAgent(), "FooBar");
    assertSame(adWordsSession.getOAuth2Credential(), credential);
    assertEquals(adWordsSession.getEndpoint(), "https://www.google.com");
    assertEquals(adWordsSession.getDeveloperToken(), "developerToken");
    assertNull("reportMoneyInMicros should not be set if not explicitly set in the builder",
        adWordsSession.isReportMoneyInMicros());
  }

  /**
   * Makes sure the builder returns a copy so that making (un-validated) changes
   * in the builder doesn't mutate previously built objects.
   */
  @Test
  public void testBuilder_returnsCopies() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    AdWordsSession.Builder builder = new AdWordsSession.Builder()
        .withUserAgent("FooBar")
        .withOAuth2Credential(credential)
        .withEndpoint("https://www.google.com")
        .withDeveloperToken("developerToken");
    assertNotSame(builder.build(), builder.build());
  }

  /**
   * Tests that the builder does not build for no auths.
   */
  @Test
  public void testBuilder_noAuths() throws Exception {
    try {
      new AdWordsSession.Builder()
          .withUserAgent("FooBar")
          .withEndpoint("https://www.google.com")
          .withDeveloperToken("developerToken").build();
      fail("Validation exception expected.");
    } catch (ValidationException e) {
      assertEquals("OAuth2 authentication must be used.", e.getMessage());
    }
  }
  
  /**
   * Tests that the builder does not build with no user agent.
   */
  @Test
  public void testBuilder_noUserAgent() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());
    
    try {
      new AdWordsSession.Builder()
          .withOAuth2Credential(credential)
          .withEndpoint("https://www.google.com")
          .withDeveloperToken("developerToken").build();
      fail("Validation exception expected.");
    } catch (ValidationException e) {
      assertEquals(
          "User agent must be set and not be the default [INSERT_USERAGENT_HERE]",
          e.getMessage());
    }
  }
  
  /**
   * Tests that the builder does not build with default user agent.
   */
  @Test
  public void testBuilder_defaultUserAgent() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());
    
    try {
      new AdWordsSession.Builder()
          .withOAuth2Credential(credential)
          .withEndpoint("https://www.google.com")
          .withUserAgent("INSERT_USERAGENT_HERE")
          .withDeveloperToken("developerToken").build();
      fail("Validation exception expected.");
    } catch (ValidationException e) {
      assertEquals(
          "User agent must be set and not be the default [INSERT_USERAGENT_HERE]",
          e.getMessage());
    }
  }

  /**
   * Tests that setting authentication to null errors.
   */
  @Test
  public void testSetAutentication_null() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());
    
    AdWordsSession adWordsSession = new AdWordsSession.Builder().withUserAgent("FooBar")
        .withEndpoint("https://www.google.com")
        .withOAuth2Credential(credential)
        .withDeveloperToken("developerToken")
        .build();

    try {
      adWordsSession.setOAuth2Credential(null);
      fail("NullPointerException expected");
    } catch (NullPointerException e) {
      assertTrue("Expected oAuth2Credential in error message",
          e.getMessage().contains("oAuth2Credential"));
    }
  }
  
  /**
   * Tests that isReportMoneyInMicros is properly set on the session when enabled. 
   */
  @Test
  public void testBuilder_moneyInMicrosEnabled() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    AdWordsSession adWordsSession = new AdWordsSession.Builder()
        .withUserAgent("FooBar")
        .withEndpoint("https://www.google.com")
        .withOAuth2Credential(credential)
        .withDeveloperToken("developerToken")
        .enableReportMoneyInMicros()
        .build();
    assertEquals("reportMoneyInMicros should be set when explicitly enabled in the builder",
        true, adWordsSession.isReportMoneyInMicros());
  }
  
  /**
   * Tests that isReportMoneyInMicros is properly set on the session when disabled. 
   */
  @Test
  public void testBuilder_moneyInMicrosDisabled() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    AdWordsSession adWordsSession = new AdWordsSession.Builder()
        .withUserAgent("FooBar")
        .withEndpoint("https://www.google.com")
        .withOAuth2Credential(credential)
        .withDeveloperToken("developerToken")
        .disableReportMoneyInMicros()
        .build();
    assertEquals("reportMoneyInMicros should be set when explicitly disabled in the builder",
        false, adWordsSession.isReportMoneyInMicros());
  }
}
