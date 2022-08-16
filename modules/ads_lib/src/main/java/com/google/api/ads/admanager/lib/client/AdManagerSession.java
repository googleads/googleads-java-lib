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

import com.google.api.ads.common.lib.auth.OAuth2Compatible;
import com.google.api.ads.common.lib.client.AdsSession;
import com.google.api.ads.common.lib.conf.ConfigurationHelper;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.concurrent.ThreadSafe;
import org.apache.commons.configuration.Configuration;

/**
 * A {@code AdManagerSession} represents a single session of Ad Manager use.
 *
 * <p>Implementation is not thread-safe.
 */
public class AdManagerSession implements AdsSession, OAuth2Compatible {

  private String networkCode;
  private Credential oAuth2Credential;

  private final String applicationName;
  private final String endpoint;

  public static final String DEFAULT_ENDPOINT = "https://ads.google.com/";

  private static final String DEFAULT_APPLICATION_NAME = "INSERT_APPLICATION_NAME_HERE";

  /**
   * Private constructor.
   *
   * @param builder the AdManagerSession builder
   */
  private AdManagerSession(Builder builder) {
    this.applicationName = builder.applicationName;
    this.endpoint = builder.endpoint;
    this.networkCode = builder.networkCode;
    this.oAuth2Credential = builder.oAuth2Credential;
  }

  /** Gets the application name. */
  public String getApplicationName() {
    return applicationName;
  }

  /** Gets the OAuth2 credentials. */
  @Override
  public Credential getOAuth2Credential() {
    return oAuth2Credential;
  }

  /**
   * Sets the OAuth2 credential. Any other authentication credentials on the session will be
   * removed.
   */
  public void setOAuth2Credential(Credential oAuth2Credential) {
    Preconditions.checkNotNull(oAuth2Credential, "oAuth2Credential cannot be null.");
    clearAuthentication();
    this.oAuth2Credential = oAuth2Credential;
  }

  /** Gets the endpoint. */
  @Override
  public String getEndpoint() {
    return endpoint;
  }

  /** Gets the network code. */
  public String getNetworkCode() {
    return networkCode;
  }

  /** Sets the network code. */
  public void setNetworkCode(String networkCode) {
    this.networkCode = networkCode;
  }

  /** Clears all the authentication credentials from this session. */
  private void clearAuthentication() {
    oAuth2Credential = null;
  }

  /**
   * Returns a new {@link Builder} with all settings copied from this session. This is <em>not</em>
   * thread-safe unless this session is an {@link ImmutableAdManagerSession}.
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /** Immutable, thread-safe implementation of AdManagerSession. */
  @ThreadSafe
  public static final class ImmutableAdManagerSession extends AdManagerSession {
    private ImmutableAdManagerSession(Builder builder) {
      super(builder);
    }

    private void throwUnsupportedOperationException(String attributeName) {
      throw new UnsupportedOperationException(
          String.format("Cannot set %s. ImmutableAdManagerSession is immutable.", attributeName));
    }

    @Override
    public void setOAuth2Credential(Credential oAuth2Credential) {
      throwUnsupportedOperationException("oAuth2Credential");
    }

    @Override
    public void setNetworkCode(String networkCode) {
      throwUnsupportedOperationException("networkCode");
    }
  }

  /**
   * Builder for {@code AdManagerSession}.
   *
   * <p>Implementation is not thread-safe.
   */
  public static class Builder
      implements com.google.api.ads.common.lib.utils.Builder<AdManagerSession> {

    private String applicationName;
    private String endpoint;
    private String networkCode;
    private Credential oAuth2Credential;

    private final ConfigurationHelper configHelper;

    /**
     * Constructs an empty builder. To construct a builder initialized to the settings of an
     * existing {@link AdManagerSession}, use {@link AdManagerSession#newBuilder()} instead.
     */
    public Builder() {
      this.configHelper = new ConfigurationHelper();
    }

    private Builder(AdManagerSession adManagerSessionToClone) {
      this();
      this.applicationName = adManagerSessionToClone.getApplicationName();
      this.endpoint = adManagerSessionToClone.getEndpoint();
      this.networkCode = adManagerSessionToClone.getNetworkCode();
      this.oAuth2Credential = adManagerSessionToClone.getOAuth2Credential();
    }

    @Override
    public Builder fromFile() throws ConfigurationLoadException {
      return fromFile(Builder.DEFAULT_CONFIGURATION_FILENAME);
    }

    @Override
    public Builder fromFile(String path) throws ConfigurationLoadException {
      return from(configHelper.fromFile(path));
    }

    @Override
    public Builder fromFile(File path) throws ConfigurationLoadException {
      return from(configHelper.fromFile(path));
    }

    @Override
    public Builder fromFile(URL path) throws ConfigurationLoadException {
      return from(configHelper.fromFile(path));
    }

    /**
     * Reads properties from the provided {@link Configuration} object.<br>
     * <br>
     * Known properties:
     *
     * <ul>
     *   <li>api.admanager.applicationName
     *   <li>api.admanager.networkCode
     *   <li>api.admanager.endpoint
     * </ul>
     *
     * @param config the configuration
     * @return Builder populated from the configuration
     */
    @CanIgnoreReturnValue
    @Override
    public Builder from(Configuration config) {
      this.applicationName = config.getString("api.admanager.applicationName", null);
      this.networkCode = config.getString("api.admanager.networkCode", null);
      this.endpoint = config.getString("api.admanager.endpoint", null);

      return this;
    }

    /** Includes OAuth2 credential to be used for OAuth2 authentication. */
    @CanIgnoreReturnValue
    public Builder withOAuth2Credential(Credential oAuth2Credential) {
      clearAuthentication();
      this.oAuth2Credential = oAuth2Credential;
      return this;
    }

    /** Includes network code. Required for most service calls. */
    @CanIgnoreReturnValue
    public Builder withNetworkCode(String networkCode) {
      this.networkCode = networkCode;
      return this;
    }

    /** Includes application name (any string of your choice). Required. */
    @CanIgnoreReturnValue
    public Builder withApplicationName(String applicationName) {
      this.applicationName = applicationName;
      return this;
    }

    /** Override the endpoint server. Optional and defaults to https://ads.google.com/. */
    @CanIgnoreReturnValue
    public Builder withEndpoint(String endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    /** Clears all the authentication credentials from this session. */
    private void clearAuthentication() {
      oAuth2Credential = null;
    }

    /**
     * Builds the {@code AdManagerSession}.
     *
     * @return the built {@code AdManagerSession}
     * @throws ValidationException if the {@code AdManagerSession} did not validate
     */
    @Override
    public AdManagerSession build() throws ValidationException {
      defaultOptionals();
      validate();
      return new AdManagerSession(this);
    }

    /**
     * Builds a thread-safe {@link ImmutableAdManagerSession}.
     *
     * @return the built {@code ImmutableAdManagerSession}
     * @throws ValidationException if the attributes of this builder fail validation
     */
    public ImmutableAdManagerSession buildImmutable() throws ValidationException {
      defaultOptionals();
      validate();
      return new ImmutableAdManagerSession(this);
    }

    /** Fills in defaults if {@code null}. */
    private void defaultOptionals() {
      if (this.endpoint == null) {
        this.endpoint = DEFAULT_ENDPOINT;
      }
    }

    /** Validates the properties for the Ad Manager session. */
    private void validate() throws ValidationException {
      // Check for at least one authentication mechanism.
      if (this.oAuth2Credential == null) {
        throw new ValidationException("OAuth2 authentication must be used.", "");
      }

      // Check that application name is not empty or the default.
      if (Strings.nullToEmpty(applicationName).trim().isEmpty()
          || applicationName.contains(DEFAULT_APPLICATION_NAME)) {
        throw new ValidationException(
            String.format(
                "Application name must be set and not be the default [%s]",
                DEFAULT_APPLICATION_NAME),
            "applicationName");
      }

      // Make sure they specify a valid endpoint.
      try {
        URL unused = new URL(this.endpoint);
      } catch (MalformedURLException e) {
        throw new ValidationException(
            String.format("Endpoint [%s] not recognized as a valid URL.", this.endpoint),
            "endpoint",
            e);
      }
    }
  }
}
