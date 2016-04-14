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

package com.google.api.ads.ddp.lib.client;

import com.google.api.ads.common.lib.auth.OAuth2Compatible;
import com.google.api.ads.common.lib.client.AdsSession;
import com.google.api.ads.common.lib.conf.ConfigurationHelper;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

import org.apache.commons.configuration.Configuration;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.annotation.concurrent.ThreadSafe;

/**
 * A {@code DdpSession} represents a single session of DDP use.
 *
 * <p>
 * Implementation is not thread-safe.
 * </p>
 */
public class DdpSession implements AdsSession, OAuth2Compatible {

  private Credential oAuth2Credential;


  private final String userAgent;
  private final String endpoint;

  public static final String DEFAULT_ENDPOINT = "https://ddp.googleapis.com";

  private static final String DEFAULT_USER_AGENT = "INSERT_USERAGENT_HERE";

  /**
   * Private constructor.
   *
   * @param builder the DdpSession builder
   */
  private DdpSession(Builder builder) {
    this.userAgent = builder.userAgent;
    this.endpoint = builder.endpoint;
    this.oAuth2Credential = builder.oAuth2Credential;
  }

  /**
   * Gets the application name.
   */
  public String getUserAgent() {
    return userAgent;
  }

  /**
   * Gets the OAuth2 credentials.
   */
  @Override
  public Credential getOAuth2Credential() {
    return oAuth2Credential;
  }

  /**
   * Sets the OAuth2 credential. Any other authentication credentials on the
   * session will be removed.
   */
  public void setOAuth2Credential(Credential oAuth2Credential) {
    Preconditions.checkNotNull(oAuth2Credential, "oAuth2Credential cannot be null.");
    clearAuthentication();
    this.oAuth2Credential = oAuth2Credential;
  }

  /**
   * Gets the endpoint.
   */
  @Override
  public String getEndpoint() {
    return endpoint;
  }

  /**
   * Clears all the authentication credentials from this session.
   */
  private void clearAuthentication() {
    oAuth2Credential = null;
  }


  /**
   * Returns a new {@link Builder} with all settings copied from this session. This is <em>not</em>
   * thread-safe unless this session is an {@link ImmutableDdpSession}.
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Immutable, thread-safe implementation of DdpSession.
   */
  @ThreadSafe
  public static final class ImmutableDdpSession extends DdpSession {
    private ImmutableDdpSession(Builder builder) {
      super(builder);
    }

    private void throwUnsupportedOperationException(String attributeName) {
      throw new UnsupportedOperationException(
          String.format(
              "Cannot set %s. ImmutableDdpSession is immutable.", attributeName));
    }

    @Override
    public void setOAuth2Credential(Credential oAuth2Credential) {
      throwUnsupportedOperationException("oAuth2Credential");
    }

  }

  /**
   * Builder for {@code DdpSession}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   */
  public static class Builder implements com.google.api.ads.common.lib.utils.Builder<DdpSession> {

    private String userAgent;
    private String endpoint;
    private Credential oAuth2Credential;


    private final ConfigurationHelper configHelper;

    /**
     * Constructs an empty builder. To construct a builder initialized to the settings of
     * an existing {@link DdpSession}, use {@link DdpSession#newBuilder()} instead.
     */
    public Builder() {
      this.configHelper = new ConfigurationHelper();
    }

    private Builder(DdpSession ddpSessionToClone) {
      this();
      this.userAgent = ddpSessionToClone.getUserAgent();
      this.endpoint = ddpSessionToClone.getEndpoint();
      this.oAuth2Credential = ddpSessionToClone.getOAuth2Credential();
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
     * <ul>
     * <li>api.ddp.applicationName</li>
     * <li>api.ddp.networkCode</li>
     * <li>api.ddp.endpoint</li>
     * </ul>
     *
     * @param config the configuration
     * @return Builder populated from the configuration
     */
    @Override
    public Builder from(Configuration config) {
      this.userAgent = config.getString("api.ddp.userAgent", null);
      this.endpoint = config.getString("api.ddp.endpoint", null);

      return this;
    }

    /**
     * Includes OAuth2 credential to be used for OAuth2 authentication.
     */
    public Builder withOAuth2Credential(Credential oAuth2Credential) {
      clearAuthentication();
      this.oAuth2Credential = oAuth2Credential;
      return this;
    }

    /**
     * Includes user agent (any string of your choice). Required.
     */
    public Builder withUserAgent(String userAgent) {
      this.userAgent = userAgent;
      return this;
    }

    /**
     * Override the endpoint server. Optional and defaults to
     * https://ads.google.com/.
     */
    public Builder withEndpoint(String endpoint) {
      this.endpoint = endpoint;
      return this;
    }


    /**
     * Clears all the authentication credentials from this session.
     */
    private void clearAuthentication() {
      oAuth2Credential = null;
    }

    /**
     * Builds the {@code DdpSession}.
     *
     * @return the built {@code DdpSession}
     * @throws ValidationException if the {@code DdpSession} did not validate
     */
    @Override
    public DdpSession build() throws ValidationException {
      defaultOptionals();
      validate();
      return new DdpSession(this);
    }

    /**
     * Builds a thread-safe {@link ImmutableDdpSession}.
     * @return the built {@code ImmutableDdpSession}
     * @throws ValidationException if the attributes of this builder fail validation
     */
    public ImmutableDdpSession buildImmutable() throws ValidationException {
      defaultOptionals();
      validate();
      return new ImmutableDdpSession(this);
    }

    /**
     * Fills in defaults if {@code null}.
     */
    private void defaultOptionals() {
      if (this.endpoint == null) {
        this.endpoint = DEFAULT_ENDPOINT;
      }
    }

    /**
     * Validates the properties for the DDP session.
     */
    private void validate() throws ValidationException {
      // Check for at least one authentication mechanism.
      if (this.oAuth2Credential == null) {
        throw new ValidationException(
            "OAuth2 authentication must be used.", "");
      }

      // Check that user agent is not empty or the default.
      if (Strings.isNullOrEmpty(userAgent)
          || userAgent.contains(DEFAULT_USER_AGENT)) {
        throw new ValidationException(String.format(
            "User agent must be set and not be the default [%s]", DEFAULT_USER_AGENT),
            "userAgent");
      }


      // Make sure they specify a valid endpoint.
      try {
        new URL(this.endpoint);
      } catch (MalformedURLException e) {
        throw new ValidationException(String.format("Endpoint [%s] not recognized as a valid URL.",
            this.endpoint), "endpoint", e);
      }
    }
  }
}
