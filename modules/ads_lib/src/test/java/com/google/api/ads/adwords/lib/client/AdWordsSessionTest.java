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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.api.ads.adwords.lib.client.reporting.ReportingConfiguration;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link AdWordsSession}.
 *
 * @author Kevin Winter
 */
@RunWith(JUnit4.class)
public class AdWordsSessionTest {

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
    assertEquals("1234567890", session.getClientCustomerId());
    assertEquals("FooBar", session.getUserAgent());
    assertEquals("devTokendevTokendevTok", session.getDeveloperToken());
    assertFalse(session.isPartialFailure());
    assertNull("reporting configuration should be null if no reporting options are in the config",
        session.getReportingConfiguration());
  }

  /**
   * Tests that the builder correctly reads properties from a configuration when reporting
   * options are included in the configuration.
   */
  @Test
  public void testReadPropertiesFromConfigurationWithReportingConfig() throws ValidationException {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.adwords.clientCustomerId", "1234567890");
    config.setProperty("api.adwords.userAgent", "FooBar");
    config.setProperty("api.adwords.developerToken", "devTokendevTokendevTok");
    config.setProperty("api.adwords.isPartialFailure", "false");
    config.setProperty("api.adwords.reporting.skipHeader", "true");
    config.setProperty("api.adwords.reporting.skipSummary", "false");

    AdWordsSession session =
        new AdWordsSession.Builder().from(config).withOAuth2Credential(credential).build();
    assertEquals("1234567890", session.getClientCustomerId());
    assertEquals("FooBar", session.getUserAgent());
    assertEquals("devTokendevTokendevTok", session.getDeveloperToken());
    assertFalse(session.isPartialFailure());
    assertNotNull(
        "reporting configuration should not be null if reporting options are in the config",
        session.getReportingConfiguration());
    assertTrue(session.getReportingConfiguration().isSkipReportHeader());
    assertFalse(session.getReportingConfiguration().isSkipReportSummary());
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

    assertEquals("FooBar", adWordsSession.getUserAgent());
    assertSame(credential, adWordsSession.getOAuth2Credential());
    assertEquals(AdWordsSession.DEFAULT_ENDPOINT, adWordsSession.getEndpoint());
    assertEquals("developerToken", adWordsSession.getDeveloperToken());
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

    assertEquals("FooBar", adWordsSession.getUserAgent());
    assertSame(credential, adWordsSession.getOAuth2Credential());
    assertEquals("https://www.google.com", adWordsSession.getEndpoint());
    assertEquals("developerToken", adWordsSession.getDeveloperToken());
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
  public void testSetAuthentication_null() throws Exception {
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
  
  @Test
  public void testBuilder_withReportingConfiguration() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());
    
    ReportingConfiguration reportingConfiguration =
        new ReportingConfiguration.Builder().skipReportHeader(true).skipReportSummary(true).build();
    
    AdWordsSession adWordsSession = new AdWordsSession.Builder()
        .withUserAgent("FooBar")
        .withEndpoint("https://www.google.com")
        .withOAuth2Credential(credential)
        .withDeveloperToken("developerToken")
        .withReportingConfiguration(reportingConfiguration)
        .build();
    
    ReportingConfiguration sessionReportingConfig = adWordsSession.getReportingConfiguration();
    assertNotNull("reporting configuration should not be null when passed to the builder",
        sessionReportingConfig);
  }
}
