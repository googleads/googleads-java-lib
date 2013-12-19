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

package com.google.api.ads.dfa.lib.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.dfa.lib.client.DfaSession.Environment;
import com.google.api.client.auth.oauth2.Credential;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Test for the {@link DfaSession} class.
 *
 * @author Joseph DiLallo
 */
@RunWith(JUnit4.class)
public class DfaSessionTest {

  public DfaSessionTest() {}

  /**
   * Makes sure the builder returns a copy so that making (un-validated) changes
   * in the builder doesn't mutate previously built objects.
   */
  @Test
  public void testBuilder_returnsCopies() throws Exception {
    DfaSession.Builder builder = new DfaSession.Builder().withUsernameAndPassword("foo", "bar")
        .withApplicationName("1234567890").withEnvironment(Environment.TEST);
    assertNotSame(builder.build(), builder.build());
  }

  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration() throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfa.username", "email");
    config.setProperty("api.dfa.password", "password");
    config.setProperty("api.dfa.applicationName", "1234567890");
    config.setProperty("api.dfa.environment", "test");

    DfaSession session =
        new DfaSession.Builder().from(config).build();
    assertEquals(session.getUsername(), "email");
    assertEquals(session.getPassword(), "password");
    assertEquals(session.getApplicationName(), "1234567890");
    assertTrue(session.isEnvironment(DfaSession.Environment.TEST));
  }

  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_badEnvironment() {
    String badEnv = "3efsdafasd";
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfa.username", "email");
    config.setProperty("api.dfa.password", "password");
    config.setProperty("api.dfa.applicationName", "1234567890");
    config.setProperty("api.dfa.environment", "3efsdafasd");

    try {
      new DfaSession.Builder().from(config).build();
    } catch (ValidationException e) {
      assertEquals("api.dfa.environment", e.getTrigger());
      assertTrue(e.getMessage().contains(badEnv));
    }
  }

  @Test(expected = ValidationException.class)
  public void testBuilder_passwordAndTokenFails() throws ValidationException {
    new DfaSession.Builder()
        .withUsernameAndPassword("username", "password")
        .withUsernameAndToken("username", "token")
        .withEnvironment(DfaSession.Environment.PRODUCTION)
        .withApplicationName("1234567890")
        .build();
  }

  @Test(expected = ValidationException.class)
  public void testBuilder_passwordAndOAuth2Fails() throws ValidationException {
    new DfaSession.Builder()
        .withUsernameAndPassword("username", "password")
        .withUsernameAndOAuth2Credential("username", mock(Credential.class))
        .withEnvironment(DfaSession.Environment.PRODUCTION)
        .withApplicationName("1234567890")
        .build();
  }

  @Test(expected = ValidationException.class)
  public void testBuilder_oAuth2AndTokenFails() throws ValidationException {
    new DfaSession.Builder()
        .withUsernameAndOAuth2Credential("username", mock(Credential.class))
        .withUsernameAndToken("username", "token")
        .withEnvironment(DfaSession.Environment.PRODUCTION)
        .withApplicationName("1234567890")
        .build();
  }

  @Test(expected = ValidationException.class)
  public void testBuilder_usingAllAuthFails() throws ValidationException {
    new DfaSession.Builder()
        .withUsernameAndPassword("username", "password")
        .withUsernameAndOAuth2Credential("username", mock(Credential.class))
        .withUsernameAndToken("username", "token")
        .withEnvironment(DfaSession.Environment.PRODUCTION)
        .withApplicationName("1234567890")
        .build();
  }
  
  /**
   * Tests that the builder does not build with no application name.
   */
  @Test
  public void testBuilder_noApplicationName() throws Exception {    
    try {
      new DfaSession.Builder()          
          .withEndpoint("https://www.google.com")
          .withUsernameAndOAuth2Credential("username", mock(Credential.class))
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
    try {
      new DfaSession.Builder()          
          .withEndpoint("https://www.google.com")
          .withUsernameAndOAuth2Credential("username", mock(Credential.class))
          .withApplicationName("INSERT_APPLICATION_NAME_HERE")
          .build();
      fail("Validation exception expected.");
    } catch (ValidationException e) {
      assertEquals(
          "Application name must be set and not be the default [INSERT_APPLICATION_NAME_HERE]",
          e.getMessage());
    }
  }
}
