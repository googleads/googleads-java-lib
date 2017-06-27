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

import com.google.api.ads.adwords.lib.client.AdWordsSession.Builder;
import com.google.api.ads.adwords.lib.client.AdWordsSession.ImmutableAdWordsSession;
import com.google.api.ads.adwords.lib.client.reporting.ReportingConfiguration;
import com.google.api.ads.common.lib.exception.ValidationException;
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
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/** Tests for {@link AdWordsSession}. */
@RunWith(Parameterized.class)
public class AdWordsSessionTest {

  /** Whether this test is testing immutable sessions. */
  private final boolean isImmutable;
  /** A Builder with all options explicitly set. */
  private final Builder allSettingsBuilder;
  /** A Credential suitable for use in this test. */
  private final Credential credential;
  /** A ReportingConfiguration suitable for use in this test. */
  private final ReportingConfiguration reportingConfiguration;

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Parameters(name = "{index}: isImmutable={0}")
  public static List<Object[]> data() {
    List<Object[]> data = Lists.newArrayList();
    data.add(new Object[] {false});
    data.add(new Object[] {true});
    return data;
  }

  public AdWordsSessionTest(boolean isImmutable) {
    this.isImmutable = isImmutable;
    this.credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    this.reportingConfiguration =
        new ReportingConfiguration.Builder().skipReportHeader(true).skipReportSummary(true).build();

    this.allSettingsBuilder =
        new AdWordsSession.Builder()
            .withClientCustomerId("customer id")
            .withDeveloperToken("developer token")
            .withEndpoint("https://www.google.com")
            .enablePartialFailure()
            .enableValidateOnly()
            .withOAuth2Credential(credential)
            .withUserAgent("user agent")
            .withReportingConfiguration(reportingConfiguration);
  }

  private AdWordsSession build(Builder builder) throws ValidationException {
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

  /** Tests that the builder correctly reads properties from a configuration. */
  @Test
  public void testReadPropertiesFromConfiguration() throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.adwords.clientCustomerId", "1234567890");
    config.setProperty("api.adwords.userAgent", "FooBar");
    config.setProperty("api.adwords.developerToken", "devTokendevTokendevTok");
    config.setProperty("api.adwords.isPartialFailure", "false");

    AdWordsSession session =
        build(new AdWordsSession.Builder().from(config).withOAuth2Credential(credential));
    assertEquals("1234567890", session.getClientCustomerId());
    assertEquals("FooBar", session.getUserAgent());
    assertEquals("devTokendevTokendevTok", session.getDeveloperToken());
    assertFalse(session.isPartialFailure());
    ReportingConfiguration reportingConfig = session.getReportingConfiguration();
    assertNotNull("reporting configuration is null", reportingConfig);
    // Verify that the ReportingConfiguration's attributes are set to the expected default value
    // (null).
    assertNull(
        "include zero impressions is not null when no reporting options in config",
        reportingConfig.isIncludeZeroImpressions());
    assertNull(
        "skip column header is not null, but no reporting options in config",
        reportingConfig.isSkipColumnHeader());
    assertNull(
        "skip report header is not null, but no reporting options in config",
        reportingConfig.isSkipReportHeader());
    assertNull(
        "skip report summary is not null, but no reporting options in config",
        reportingConfig.isSkipReportSummary());
    assertNull(
        "use raw enum values is not null, but no reporting options in config",
        reportingConfig.isUseRawEnumValues());
    assertNull(
        "download timeout is not null, but no reporting options in config",
        reportingConfig.getReportDownloadTimeout());
  }

  /**
   * Tests that the builder correctly reads properties from a configuration when reporting options
   * are included in the configuration.
   */
  @Test
  public void testReadPropertiesFromConfigurationWithReportingConfig() throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.adwords.clientCustomerId", "1234567890");
    config.setProperty("api.adwords.userAgent", "FooBar");
    config.setProperty("api.adwords.developerToken", "devTokendevTokendevTok");
    config.setProperty("api.adwords.isPartialFailure", "false");
    config.setProperty("api.adwords.reporting.skipHeader", "true");
    config.setProperty("api.adwords.reporting.skipColumnHeader", "true");
    config.setProperty("api.adwords.reporting.skipSummary", "false");
    config.setProperty("api.adwords.reporting.useRawEnumValues", "false");
    config.setProperty("api.adwords.reportDownloadTimeout", 9999999);

    AdWordsSession session =
        build(new AdWordsSession.Builder().from(config).withOAuth2Credential(credential));
    assertEquals("1234567890", session.getClientCustomerId());
    assertEquals("FooBar", session.getUserAgent());
    assertEquals("devTokendevTokendevTok", session.getDeveloperToken());
    assertFalse(session.isPartialFailure());
    assertNotNull(
        "reporting configuration should not be null",
        session.getReportingConfiguration());
    assertTrue(session.getReportingConfiguration().isSkipReportHeader());
    assertTrue(session.getReportingConfiguration().isSkipColumnHeader());
    assertFalse(session.getReportingConfiguration().isSkipReportSummary());
    assertFalse(session.getReportingConfiguration().isUseRawEnumValues());
    assertEquals(
        9999999, session.getReportingConfiguration().getReportDownloadTimeout().intValue());
    assertNull(
        "includeZeroImpressions is not settable from ads.properties, so should be null",
        session.getReportingConfiguration().isIncludeZeroImpressions());
  }

  /** Tests that the builder correctly reads properties from a configuration. */
  @Test
  public void testReadPropertiesFromConfiguration_badEndpoint() throws ValidationException {
    String badEndpoint = "3efsdafasd";
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.adwords.clientCustomerId", "1234567890");
    config.setProperty("api.adwords.userAgent", "FooBar");
    config.setProperty("api.adwords.developerToken", "devTokendevTokendevTok");
    config.setProperty("api.adwords.isPartialFailure", "false");
    config.setProperty("api.adwords.endpoint", badEndpoint);

    thrown.expect(ValidationException.class);
    thrown.expect(createTriggerMatcher(Matchers.<String>equalTo("endpoint")));
    thrown.expectMessage(badEndpoint);
    build(new AdWordsSession.Builder().from(config).withOAuth2Credential(credential));
  }

  /** Tests that the builder correctly reads properties from a configuration. */
  @Test
  public void testReadPropertiesFromConfiguration_noUserAgent() throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();

    AdWordsSession adWordsSession =
        build(
            new AdWordsSession.Builder()
                .from(config)
                .withDeveloperToken("devTokendevTokendevTok")
                .withOAuth2Credential(credential));
    assertEquals(AdWordsSession.UNKNOWN_USER_AGENT, adWordsSession.getUserAgent());
  }

  /** Tests that the builder correctly reads properties from a configuration. */
  @Test
  public void testReadPropertiesFromConfiguration_defaultUserAgent() throws ValidationException {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.adwords.userAgent", "INSERT_USERAGENT_HERE");
    AdWordsSession adWordsSession =
        build(
            new AdWordsSession.Builder()
                .from(config)
                .withDeveloperToken("devTokendevTokendevTok")
                .withOAuth2Credential(credential));
    assertEquals(AdWordsSession.UNKNOWN_USER_AGENT, adWordsSession.getUserAgent());
  }

  /** Tests that the builder builds correctly with a default endpoint. */
  @Test
  public void testBuilder_defaultEndpoint() throws Exception {
    AdWordsSession adWordsSession =
        build(
            new AdWordsSession.Builder()
                .withUserAgent("FooBar")
                .withOAuth2Credential(credential)
                .withDeveloperToken("developerToken"));

    assertEquals("FooBar", adWordsSession.getUserAgent());
    assertSame(credential, adWordsSession.getOAuth2Credential());
    assertEquals(AdWordsSession.DEFAULT_ENDPOINT, adWordsSession.getEndpoint());
    assertEquals("developerToken", adWordsSession.getDeveloperToken());
  }

  /** Tests that the builder builds correctly for OAuth2. */
  @Test
  public void testBuilder_oAuth2() throws Exception {
    AdWordsSession adWordsSession =
        build(
            new AdWordsSession.Builder()
                .withUserAgent("FooBar")
                .withEndpoint("https://www.google.com")
                .withOAuth2Credential(credential)
                .withDeveloperToken("developerToken"));

    assertEquals("FooBar", adWordsSession.getUserAgent());
    assertSame(credential, adWordsSession.getOAuth2Credential());
    assertEquals("https://www.google.com", adWordsSession.getEndpoint());
    assertEquals("developerToken", adWordsSession.getDeveloperToken());
  }

  /**
   * Makes sure the builder returns a copy so that making (un-validated) changes in the builder
   * doesn't mutate previously built objects.
   */
  @Test
  public void testBuilder_returnsCopies() throws Exception {
    AdWordsSession.Builder builder =
        new AdWordsSession.Builder()
            .withUserAgent("FooBar")
            .withOAuth2Credential(credential)
            .withEndpoint("https://www.google.com")
            .withDeveloperToken("developerToken");
    assertNotSame(build(builder), build(builder));
  }

  /** Tests that the builder does not build for no auths. */
  @Test
  public void testBuilder_noAuths() throws Exception {
    thrown.expect(ValidationException.class);
    thrown.expectMessage("OAuth2");
    build(
        new AdWordsSession.Builder()
            .withUserAgent("FooBar")
            .withEndpoint("https://www.google.com")
            .withDeveloperToken("developerToken"));
  }

  /** Tests that the builder builds with the 'unknown' user agent if none specified. */
  @Test
  public void testBuilder_noUserAgent() throws Exception {
    AdWordsSession adWordsSession =
        build(
            new AdWordsSession.Builder()
                .withOAuth2Credential(credential)
                .withEndpoint("https://www.google.com")
                .withDeveloperToken("developerToken"));
    assertEquals(AdWordsSession.UNKNOWN_USER_AGENT, adWordsSession.getUserAgent());
  }

  /**
   * Tests that the builder builds with the 'unknown' user agent if the default user agent is
   * specified.
   */
  @Test
  public void testBuilder_defaultUserAgent() throws Exception {
    AdWordsSession adWordsSession =
        build(
            new AdWordsSession.Builder()
                .withOAuth2Credential(credential)
                .withEndpoint("https://www.google.com")
                .withUserAgent("INSERT_USERAGENT_HERE")
                .withDeveloperToken("developerToken"));
    assertEquals(AdWordsSession.UNKNOWN_USER_AGENT, adWordsSession.getUserAgent());
  }

  /** Tests that using a non-ASCII user agent will fail. */
  @Test
  public void testBuilder_nonAsciiUserAgent() throws Exception {
    String nonAsciiUserAgent = "スーパー";
    thrown.expect(ValidationException.class);
    thrown.expectMessage("User agent");
    thrown.expectMessage("ASCII");
    thrown.expectMessage(nonAsciiUserAgent);
    build(
        new AdWordsSession.Builder()
            .withOAuth2Credential(credential)
            .withUserAgent(nonAsciiUserAgent)
            .withEndpoint("https://www.google.com")
            .withDeveloperToken("developerToken"));
  }

  /** Tests that setting authentication to null errors. */
  @Test
  public void testSetAuthentication_null() throws Exception {
    AdWordsSession adWordsSession =
        build(
            new AdWordsSession.Builder()
                .withUserAgent("FooBar")
                .withEndpoint("https://www.google.com")
                .withOAuth2Credential(credential)
                .withDeveloperToken("developerToken"));

    if (isImmutable) {
      thrown.expect(UnsupportedOperationException.class);
    } else {
      thrown.expect(NullPointerException.class);
    }
    thrown.expectMessage("oAuth2Credential");
    adWordsSession.setOAuth2Credential(null);
  }

  @Test
  public void testBuilder_withReportingConfiguration() throws Exception {
    ReportingConfiguration reportingConfiguration =
        new ReportingConfiguration.Builder().skipReportHeader(true).skipReportSummary(true).build();

    AdWordsSession adWordsSession =
        build(
            new AdWordsSession.Builder()
                .withUserAgent("FooBar")
                .withEndpoint("https://www.google.com")
                .withOAuth2Credential(credential)
                .withDeveloperToken("developerToken")
                .withReportingConfiguration(reportingConfiguration));

    ReportingConfiguration sessionReportingConfig = adWordsSession.getReportingConfiguration();
    assertNotNull(
        "reporting configuration should not be null when passed to the builder",
        sessionReportingConfig);
  }

  /** Tests that the builder builds correctly with all available settings. */
  @Test
  public void testBuilder_allSettings() throws Exception {
    AdWordsSession adWordsSession = build(allSettingsBuilder);

    assertEquals("customer id", adWordsSession.getClientCustomerId());
    assertEquals("developer token", adWordsSession.getDeveloperToken());
    assertEquals("https://www.google.com", adWordsSession.getEndpoint());
    assertTrue(adWordsSession.isPartialFailure());
    assertTrue(adWordsSession.isValidateOnly());
    assertSame(credential, adWordsSession.getOAuth2Credential());
    assertEquals("user agent", adWordsSession.getUserAgent());
    assertSame(reportingConfiguration, adWordsSession.getReportingConfiguration());
  }

  /** Tests that copy builder copies all values correctly. */
  @Test
  public void testImmutable_copyBuilder() throws Exception {
    AdWordsSession adWordsSession = build(allSettingsBuilder);

    AdWordsSession copy = build(adWordsSession.newBuilder());

    assertNotSame(adWordsSession, copy);
    for (Method method : ImmutableAdWordsSession.class.getMethods()) {
      if (method.getName().startsWith("get") && method.getParameterTypes().length == 1) {
        Object originalAttributeValue = method.invoke(adWordsSession);
        Object copyAttributeValue = method.invoke(copy);
        assertEquals(
            "Copied session value does not match original for getter: " + method.getName(),
            originalAttributeValue,
            copyAttributeValue);
      }
    }

    // The copy should point to the same OAuth2 credential and reporting configuration as
    // the original.
    assertSame(adWordsSession.getOAuth2Credential(), copy.getOAuth2Credential());
    assertSame(adWordsSession.getReportingConfiguration(), copy.getReportingConfiguration());
  }

  /** Tests that copy constructor on {@link ImmutableAdWordsSession} copies all values correctly. */
  @Test
  public void testImmutable_setters_fail() throws Exception {
    if (!isImmutable) {
      assertTrue("Skipping immutability test because !isImmutable", true);
      return;
    }

    ImmutableAdWordsSession immutableAdWordsSession = allSettingsBuilder.buildImmutable();

    // Find each setter method and confirm that the immutable session throws an exception when the
    // method is invoked.
    for (Method method : ImmutableAdWordsSession.class.getMethods()) {
      if (method.getName().startsWith("set") && method.getParameterTypes().length == 1) {
        Class<?> parameterType = method.getParameterTypes()[0];
        String attributeName = method.getName().substring("set".length());
        String getterPrefix = "get";
        if (parameterType.equals(boolean.class) || parameterType.equals(Boolean.class)) {
          getterPrefix = "is";
        }

        String getMethodName =
            getterPrefix + attributeName.substring(0, 1).toUpperCase() + attributeName.substring(1);
        Method getMethod = ImmutableAdWordsSession.class.getMethod(getMethodName);

        // Get the attribute value from the original session to use in the setter method invocation
        // below.
        Object attributeValue = getMethod.invoke(immutableAdWordsSession);

        // Attempt to invoke the setter on the original session and verify that this
        // throws an UnsupportedOperationException.
        try {
          method.invoke(immutableAdWordsSession, attributeValue);
          fail(
              "Invocation of setter method "
                  + method.getName()
                  + " should have failed for an ImmutableAdWordsSession, but it succeeded");
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
