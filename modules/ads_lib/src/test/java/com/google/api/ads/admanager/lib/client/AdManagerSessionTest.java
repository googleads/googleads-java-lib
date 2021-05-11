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

package com.google.api.ads.admanager.lib.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.admanager.lib.client.AdManagerSession.Builder;
import com.google.api.ads.admanager.lib.client.AdManagerSession.ImmutableAdManagerSession;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.hamcrest.CustomTypeSafeMatcher;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.MockitoAnnotations;

/** Tests for {@link AdManagerSession}. */
@RunWith(Parameterized.class)
public class AdManagerSessionTest {

  /** Whether this test is testing immutable sessions. */
  private final boolean isImmutable;
  /** A Builder with all options explicitly set. */
  private final Builder allSettingsBuilder;
  /** A Credential suitable for use in this test. */
  private final Credential credential;

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Parameters(name = "{index}: isImmutable={0}")
  public static List<Object[]> data() {
    List<Object[]> data = Lists.newArrayList();
    data.add(new Object[] {false});
    data.add(new Object[] {true});
    return data;
  }

  public AdManagerSessionTest(boolean isImmutable) {
    this.isImmutable = isImmutable;
    this.credential = new Credential(BearerToken.authorizationHeaderAccessMethod());
    this.allSettingsBuilder =
        new AdManagerSession.Builder()
            .withApplicationName("FooBar")
            .withEndpoint("https://ads.google.com")
            .withOAuth2Credential(credential)
            .withNetworkCode("networkCode");
  }

  private AdManagerSession build(Builder builder) throws ValidationException {
    if (isImmutable) {
      return builder.buildImmutable();
    }
    return builder.build();
  }

  private Matcher<ValidationException> createTriggerMatcher(final Matcher<String> matcher) {
    return new CustomTypeSafeMatcher<ValidationException>("Trigger") {
      @Override
      protected boolean matchesSafely(ValidationException ve) {
        return matcher.matches(ve.getTrigger());
      }
    };
  }

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration() throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.admanager.email", "email");
    config.setProperty("api.admanager.password", "password");
    config.setProperty("api.admanager.applicationName", "FooBar");

    AdManagerSession session =
        new AdManagerSession.Builder().from(config).withOAuth2Credential(credential).build();
    assertEquals("FooBar", session.getApplicationName());
    assertSame(credential, session.getOAuth2Credential());
    assertEquals(AdManagerSession.DEFAULT_ENDPOINT, session.getEndpoint());
  }

  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_badEndpoint() throws ValidationException {
    String badEndpoint = "3efsdafasd";
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.admanager.email", "email");
    config.setProperty("api.admanager.password", "password");
    config.setProperty("api.admanager.applicationName", "FooBar");
    config.setProperty("api.admanager.endpoint", badEndpoint);

    thrown.expect(ValidationException.class);
    thrown.expect(createTriggerMatcher(Matchers.<String>equalTo("endpoint")));
    thrown.expectMessage(badEndpoint);
    build(new AdManagerSession.Builder().from(config).withOAuth2Credential(credential));
  }

  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_noApplicationName() throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();

    thrown.expect(ValidationException.class);
    thrown.expect(createTriggerMatcher(Matchers.<String>equalTo("applicationName")));

    build(new AdManagerSession.Builder().from(config).withOAuth2Credential(credential));
  }

  /**
   * Tests that the builder correctly reads properties from a configuration.
   */
  @Test
  public void testReadPropertiesFromConfiguration_defaultApplicationName()
      throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.admanager.applicationName", "INSERT_APPLICATION_NAME_HERE");

    thrown.expect(ValidationException.class);
    thrown.expect(createTriggerMatcher(Matchers.<String>equalTo("applicationName")));
    build(new AdManagerSession.Builder().from(config).withOAuth2Credential(credential));
  }

  /**
   * Tests that the builder builds correctly with a default endpoint.
   */
  @Test
  public void testBuilder_defaultEndpoint() throws Exception {
    AdManagerSession adManagerSession =
        build(
            new AdManagerSession.Builder()
                .withApplicationName("FooBar")
                .withOAuth2Credential(credential)
                .withNetworkCode("networkCode"));

    assertEquals("FooBar", adManagerSession.getApplicationName());
    assertSame(credential, adManagerSession.getOAuth2Credential());
    assertEquals(AdManagerSession.DEFAULT_ENDPOINT, adManagerSession.getEndpoint());
    assertEquals("networkCode", adManagerSession.getNetworkCode());
  }

  /**
   * Tests that the builder builds correctly for OAuth2.
   */
  @Test
  public void testBuilder_oAuth2() throws Exception {
    AdManagerSession adManagerSession = build(allSettingsBuilder);

    assertEquals("FooBar", adManagerSession.getApplicationName());
    assertSame(credential, adManagerSession.getOAuth2Credential());
    assertEquals("https://ads.google.com", adManagerSession.getEndpoint());
    assertEquals("networkCode", adManagerSession.getNetworkCode());
  }

  /**
   * Makes sure the builder returns a copy so that making (un-validated) changes
   * in the builder doesn't mutate previously built objects.
   */
  @Test
  public void testBuilder_returnsCopies() throws Exception {
    AdManagerSession.Builder builder =
        new AdManagerSession.Builder()
            .withApplicationName("FooBar")
            .withOAuth2Credential(credential)
            .withNetworkCode("networkCode");
    assertNotSame(builder.build(), builder.build());
  }

  /**
   * Tests that the builder does not build for no auths.
   */
  @Test
  public void testBuilder_noAuths() throws Exception {
    thrown.expect(ValidationException.class);
    thrown.expectMessage(Matchers.<String>equalTo("OAuth2 authentication must be used."));
    build(
        new AdManagerSession.Builder()
            .withApplicationName("FooBar")
            .withEndpoint("https://ads.google.com")
            .withNetworkCode("networkCode"));
  }

  /**
   * Tests that the builder does not build with no application name.
   */
  @Test
  public void testBuilder_noApplicationName() throws Exception {
    thrown.expect(ValidationException.class);
    thrown.expectMessage(
        Matchers.<String>equalTo(
            "Application name must be set and not be the default [INSERT_APPLICATION_NAME_HERE]"));
    build(
        new AdManagerSession.Builder()
            .withEndpoint("https://ads.google.com")
            .withNetworkCode("networkCode")
            .withOAuth2Credential(credential));
  }

  /**
   * Tests that the builder does not build with default application name.
   */
  @Test
  public void testBuilder_defaultApplicationName() throws Exception {
    thrown.expect(ValidationException.class);
    thrown.expectMessage(
        Matchers.<String>equalTo(
            "Application name must be set and not be the default [INSERT_APPLICATION_NAME_HERE]"));
    build(
        new AdManagerSession.Builder()
            .withEndpoint("https://ads.google.com")
            .withNetworkCode("networkCode")
            .withOAuth2Credential(credential)
            .withApplicationName("INSERT_APPLICATION_NAME_HERE"));
  }

  /**
   * Tests that the builder does not build with a whitespace application name.
   */
  @Test
  public void testBuilder_whitespaceApplicationName() throws Exception {
    thrown.expect(ValidationException.class);
    thrown.expectMessage(
        Matchers.<String>equalTo(
            "Application name must be set and not be the default [INSERT_APPLICATION_NAME_HERE]"));
    build(
        new AdManagerSession.Builder()
            .withEndpoint("https://ads.google.com")
            .withNetworkCode("networkCode")
            .withOAuth2Credential(credential)
            .withApplicationName("      "));
  }

  /**
   * Tests that setting authentication to null errors.
   */
  @Test
  public void testSetAutentication_null() throws Exception {
    AdManagerSession adManagerSession =
        build(
            new AdManagerSession.Builder()
                .withApplicationName("FooBar")
                .withEndpoint("https://ads.google.com")
                .withOAuth2Credential(credential)
                .withNetworkCode("networkCode"));
    if (isImmutable) {
      thrown.expect(UnsupportedOperationException.class);
    } else {
      thrown.expect(NullPointerException.class);
    }
    thrown.expectMessage("oAuth2Credential");
    adManagerSession.setOAuth2Credential(null);
  }

  /**
   * Tests that copy builder copies all values correctly.
   */
  @Test
  public void testImmutable_copyBuilder() throws Exception {
    AdManagerSession adManagerSession = build(allSettingsBuilder);

    AdManagerSession copy = build(adManagerSession.newBuilder());

    assertNotSame(adManagerSession, copy);
    for (Method method : ImmutableAdManagerSession.class.getMethods()) {
      if (method.getName().startsWith("get") && method.getParameterTypes().length == 1) {
        Object originalAttributeValue = method.invoke(adManagerSession);
        Object copyAttributeValue = method.invoke(copy);
        assertEquals(
            "Copied session value does not match original for getter: " + method.getName(),
            originalAttributeValue,
            copyAttributeValue);
      }
    }

    // The copy should point to the same OAuth2 credential as the original.
    assertSame(adManagerSession.getOAuth2Credential(), copy.getOAuth2Credential());
  }

  /**
   * Tests that copy constructor on {@link ImmutableAdManagerSession} copies all values correctly.
   */
  @Test
  public void testImmutable_setters_fail() throws Exception {
    if (!isImmutable) {
      assertTrue("Skipping immutability test because !isImmutable", true);
      return;
    }

    ImmutableAdManagerSession immutableDfpSession = allSettingsBuilder.buildImmutable();

    // Find each setter method and confirm that the immutable session throws an exception when the
    // method is invoked.
    for (Method method : ImmutableAdManagerSession.class.getMethods()) {
      if (method.getName().startsWith("set") && method.getParameterTypes().length == 1) {
        Class<?> parameterType = method.getParameterTypes()[0];
        String attributeName = method.getName().substring("set".length());
        String getterPrefix = "get";
        if (parameterType.equals(boolean.class) || parameterType.equals(Boolean.class)) {
          getterPrefix = "is";
        }

        String getMethodName =
            getterPrefix + attributeName.substring(0, 1).toUpperCase() + attributeName.substring(1);
        Method getMethod = ImmutableAdManagerSession.class.getMethod(getMethodName);

        // Get the attribute value from the original session to use in the setter method invocation
        // below.
        Object attributeValue = getMethod.invoke(immutableDfpSession);

        // Attempt to invoke the setter on the original session and verify that this
        // throws an UnsupportedOperationException.
        try {
          method.invoke(immutableDfpSession, attributeValue);
          fail(
              "Invocation of setter method "
                  + method.getName()
                  + " should have failed for an ImmutableAdManagerSession, but it succeeded");
        } catch (InvocationTargetException e) {
          assertEquals(
              "UnsupportedOperationException is expected on set",
              UnsupportedOperationException.class,
              e.getCause().getClass());
        }
      }
    }
  }
}
