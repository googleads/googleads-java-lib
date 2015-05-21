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

import com.google.api.ads.common.lib.auth.OAuth2Compatible;
import com.google.api.ads.common.lib.client.AdsSession;
import com.google.api.ads.common.lib.client.Endpoint;
import com.google.api.ads.common.lib.conf.ConfigurationHelper;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Strings;

import org.apache.commons.configuration.Configuration;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * A {@code DfaSession} represents a single session of DFA use.
 *
 * <p>
 * Implementation is not thread-safe.
 * </p>
 *
 * @author Adam Rogal
 */
public class DfaSession implements AdsSession, OAuth2Compatible {

  /**
   * Enum representing the endpoint server, aka environment.
   * @author Kevin Winter
   */
  public static enum Environment implements Endpoint {
    PRODUCTION("https://advertisersapi.doubleclick.net"),
    TEST("https://advertisersapitest.doubleclick.net");

    private final String endpoint;

    private Environment(String endpoint) {
      this.endpoint = endpoint;
    }

    /**
     * @return the endpoint
     */
    @Override
    public String getEndpoint() {
      return endpoint;
    }
  }

  private String authenticationToken;


  private final String username;
  private final String password;
  private final String applicationName;
  private final String endpoint;
  private final Credential oAuth2Credential;

  private static final String DEFAULT_APPLICATION_NAME = "INSERT_APPLICATION_NAME_HERE";

  /**
   * Private constructor.
   *
   * @param builder the DfaSession builder
   */
  private DfaSession(Builder builder) {
    this.applicationName = builder.applicationName;
    this.authenticationToken = builder.authenticationToken;
    this.endpoint = builder.endpoint;
    this.password = builder.password;
    this.username = builder.username;
    this.oAuth2Credential = builder.oAuth2Credential;
  }

  /**
   * Sets the token associated with this session.
   */
  public void setToken(String token) {
    this.authenticationToken = token;
  }

  /**
   * Gets the user name.
   */
  public String getUsername() {
    return username;
  }

  /**
   * Gets the password.
   */
  public String getPassword() {
    return password;
  }

  /**
   * Gets the token used for authentication.
   */
  public String getToken() {
    return authenticationToken;
  }

  /**
   * Gets the application name.
   */
  public String getApplicationName() {
    return applicationName;
  }

  /**
   * @return the endpoint
   */
  @Override
  public String getEndpoint() {
    return endpoint;
  }

  /**
   * Determines if the session is for the supplied
   * {@link DfaSession.Environment}.
   */
  public boolean isEnvironment(Endpoint environment) {
    return environment.getEndpoint().equals(this.endpoint);
  }

  /**
   * Gets the OAuth2 credentials.
   */
  @Override
  public Credential getOAuth2Credential() {
    return oAuth2Credential;
  }

  /**
   * Builder for DfaSession.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   */
  public static class Builder implements com.google.api.ads.common.lib.utils.Builder<DfaSession> {


    private String environmentString;
    private String username;
    private String password;
    private String authenticationToken;
    private String applicationName;
    private String endpoint;
    private Credential oAuth2Credential;

    private final ConfigurationHelper configHelper;

    /**
     * Constructor.
     */
    public Builder() {
      this.configHelper = new ConfigurationHelper();
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
     * Reads properties from the provided {@link Configuration} object.<br><br>
     * Known properties:
     * <ul>
     * <li>api.dfa.username</li>
     * <li>api.dfa.password</li>
     * <li>api.dfa.applicationName</li>
     * <li>api.dfa.token</li>
     * <li>api.dfa.environment, e.g. production or test</li>
     * </ul>
     *
     * @param config
     * @return Builder populated from the Configuration
     */
    @Override
    public Builder from(Configuration config) {
      this.username = config.getString("api.dfa.username", null);
      this.password = config.getString("api.dfa.password", null);
      this.applicationName = config.getString("api.dfa.applicationName", null);
      this.authenticationToken = config.getString("api.dfa.token", null);
      this.endpoint = config.getString("api.dfa.endpoint", null);
      environmentString = config.getString("api.dfa.environment", null);

      return this;
    }

    /**
     * Includes the specified environment, e.g.
     * {@link Environment#TEST}
     *
     * The environment and endpoint in DFA are currently synonymous. Setting an
     * environment will clear out any endpoint you have previously set.
     */
    public Builder withEnvironment(Environment environment) {
      this.endpoint = environment.getEndpoint();
      environmentString = null;
      return this;
    }

    /**
     * Override the endpoint server.
     *
     * The environment and endpoint in DFA are currently synonymous. Setting an
     * endpoint will clear out any environment you have previously set.
     */
    public Builder withEndpoint(String endpoint) {
      this.endpoint = endpoint;
      environmentString = null;
      return this;
    }

    /**
     * Includes username and password.
     *
     * @deprecated It is encouraged that you switch to OAuth2 at your earliest
     *             convenience. Please see the OfflineCredentials utility for
     *             generating offline credentials easily.
     */
    @Deprecated
    public Builder withUsernameAndPassword(String username, String password) {
      this.username = username;
      this.password = password;
      return this;
    }

    /**
     * Includes a username with a hard-coded token to be used instead of
     * fetching a new one.
     */
    public Builder withUsernameAndToken(String username, String token) {
      this.username = username;
      this.authenticationToken = token;
      return this;
    }

    /**
     * Includes a username with an OAuth2 credential used for generating DFA
     * tokens.
     */
    public Builder withUsernameAndOAuth2Credential(String username, Credential credential) {
      this.username = username;
      this.oAuth2Credential = credential;
      return this;
    }

    /**
     * Includes an OAuth2 credential.
     *
     * **WARNING** You should only use this method if your username is being
     * pulled in by {@link #fromFile()}. Otherwise, you should use
     * {@link #withUsernameAndOAuth2Credential(String, Credential)}
     */
    public Builder withOAuth2Credential(Credential credential) {
      this.oAuth2Credential = credential;
      return this;
    }

    /**
     * Includes application name.
     */
    public Builder withApplicationName(String applicationName) {
      this.applicationName = applicationName;
      return this;
    }

    /**
     * Builds the {@code DfaSession}.
     * @return the built {@code DfaSession}
     * @throws ValidationException if the {@code DfaSession} did not validate
     */
    @Override
    public DfaSession build() throws ValidationException {
      validate();
      return new DfaSession(this);
    }

    /**
     * Validates the properties for the DFA session.
     */
    private void validate() throws ValidationException {
      if (environmentString != null) {
        try {
          withEnvironment(Environment.valueOf(environmentString.toUpperCase()));
        } catch (IllegalArgumentException e) {
          throw new ValidationException(String.format("Environment [%s] not recognized.",
              environmentString), "api.dfa.environment", e);
        }
      }

      // Check for valid username.
      if (this.username == null) {
        throw new ValidationException("Username is required.", "username");
      }

      boolean usingPassword = this.password != null;
      boolean usingToken = this.authenticationToken != null;
      boolean usingOAuth2 = this.oAuth2Credential != null;

      // Check that at least one auth mechanism is being use.
      if (!usingPassword && !usingToken && !usingOAuth2) {
        throw new ValidationException(
            "One of username/password, username/token or username/OAuth2 must be used.",
            "");
      }

      // Check that only one auth mechanism is being used.
      if ((usingPassword && usingToken) || (usingPassword && usingOAuth2) ||
          (usingToken && usingOAuth2)) {
        throw new ValidationException(
            "You may only use one of username/password, username/token, and username/OAuth2 at " +
            "the same time.",
            "");
      }

      // Check that application name is not empty or the default.
      if (Strings.isNullOrEmpty(applicationName)
          || applicationName.contains(DEFAULT_APPLICATION_NAME)) {
        throw new ValidationException(String.format(
            "Application name must be set and not be the default [%s]", DEFAULT_APPLICATION_NAME),
            "applicationName");
      }

      // Make sure they specify an environment.
      try {
        new URL(this.endpoint);
      } catch (MalformedURLException e) {
        throw new ValidationException("Endpoint is required and must be a valid URL.",
            "endpoint", e);
      }
    }
  }
}
