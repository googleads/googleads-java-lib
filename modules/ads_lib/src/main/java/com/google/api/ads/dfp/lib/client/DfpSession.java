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

import com.google.api.ads.common.lib.auth.ClientLoginCompatible;
import com.google.api.ads.common.lib.auth.OAuth2Compatible;
import com.google.api.ads.common.lib.client.AdsSession;
import com.google.api.ads.common.lib.conf.ConfigurationHelper;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.dfp.lib.utils.DfpInternals;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

import org.apache.commons.configuration.Configuration;
import org.slf4j.Logger;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * A {@code DfpSession} represents a single session of DFP use.
 *
 * <p>
 * Implementation is not thread-safe.
 * </p>
 *
 * @author Adam Rogal
 */
public class DfpSession implements AdsSession, OAuth2Compatible, ClientLoginCompatible {

  static final String DEPRECATION_MESSAGE = "ClientLogin is now deprecated. "
      + "Please switch to OAuth2. See OfflineCredentials for more information.";

  private String clientLoginToken;
  private String networkCode;
  private Credential oAuth2Credential;


  private final String applicationName;
  private final String endpoint;
  private final Logger libLogger;

  public static final String DEFAULT_ENDPOINT = "https://ads.google.com/";

  private static final String DEFAULT_APPLICATION_NAME = "INSERT_APPLICATION_NAME_HERE";

  /**
   * Private constructor.
   *
   * @param builder the DfpSession builder
   */
  private DfpSession(Builder builder) {
    this.applicationName = builder.applicationName;
    this.clientLoginToken = builder.clientLoginToken;
    this.endpoint = builder.endpoint;
    this.networkCode = builder.networkCode;
    this.oAuth2Credential = builder.oAuth2Credential;
    this.libLogger = builder.libLogger;

    if (builder.clientLoginToken != null) {
      this.setClientLoginToken(builder.clientLoginToken);
    }
  }

  /**
   * Gets the application name.
   */
  public String getApplicationName() {
    return applicationName;
  }

  /**
   * Gets the OAuth2 credentials.
   */
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
   * Gets the client login token.
   *
   * @deprecated It is encouraged that you switch to OAuth2 at your earliest
   *             convenience. Please see the OfflineCredentials utility for
   *             generating offline credentials easily.
   */
  @Deprecated
  public String getClientLoginToken() {
    return clientLoginToken;
  }

  /**
   * Sets the client login token. Any other authentication credentials on the
   * session will be removed.
   *
   * @deprecated It is encouraged that you switch to OAuth2 at your earliest
   *             convenience. Please see the OfflineCredentials utility for
   *             generating offline credentials easily.
   */
  @Deprecated
  public void setClientLoginToken(String clientLoginToken) {
    Preconditions.checkNotNull(clientLoginToken, "clientLoginToken cannot be null.");
    clearAuthentication();
    this.clientLoginToken = clientLoginToken;
    libLogger.warn(DEPRECATION_MESSAGE);
  }

  /**
   * Gets the endpoint.
   */
  public String getEndpoint() {
    return endpoint;
  }

  /**
   * Gets the network code.
   */
  public String getNetworkCode() {
    return networkCode;
  }

  /**
   * Sets the network code.
   */
  public void setNetworkCode(String networkCode) {
    this.networkCode = networkCode;
  }

  /**
   * Clears all the authentication credentials from this session.
   */
  private void clearAuthentication() {
    oAuth2Credential = null;
    clientLoginToken = null;
  }


  /**
   * Builder for {@code DfpSession}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   */
  public static class Builder implements com.google.api.ads.common.lib.utils.Builder<DfpSession> {

    private String applicationName;
    private String endpoint;
    private String clientLoginToken;
    private String networkCode;
    private Credential oAuth2Credential;


    private final Logger libLogger;
    private final ConfigurationHelper configHelper;

    /**
     * Constructor.
     */
    public Builder() {
      this(DfpInternals.getInstance().getAdsServiceLoggers().getLibLogger());
    }

    @VisibleForTesting
    Builder(Logger libLogger) {
       this(libLogger, new ConfigurationHelper());
    }

    private Builder(Logger libLogger, ConfigurationHelper configHelper) {
      this.libLogger = libLogger;
      this.configHelper = configHelper;
    }

    public Builder fromFile() throws ConfigurationLoadException {
      return fromFile(Builder.DEFAULT_CONFIGURATION_FILENAME);
    }

    public Builder fromFile(String path) throws ConfigurationLoadException {
      return from(configHelper.fromFile(path));
    }

    public Builder fromFile(File path) throws ConfigurationLoadException {
      return from(configHelper.fromFile(path));
    }

    public Builder fromFile(URL path) throws ConfigurationLoadException {
      return from(configHelper.fromFile(path));
    }

    /**
     * Reads properties from the provided {@link Configuration} object.<br>
     * <br>
     * Known properties:
     * <ul>
     * <li>api.dfp.applicationName</li>
     * <li>api.dfp.networkCode</li>
     * <li>api.dfp.endpoint</li>
     * <li>Deprecated: api.dfp.clientLoginToken - use OAuth2 instead.</li>
     * </ul>
     *
     * @param config the configuration
     * @return Builder populated from the configuration
     */
    public Builder from(Configuration config) {
      this.applicationName = config.getString("api.dfp.applicationName", null);
      this.networkCode = config.getString("api.dfp.networkCode", null);
      this.endpoint = config.getString("api.dfp.endpoint", null);
      this.clientLoginToken = config.getString("api.dfp.clientLoginToken", null);

      return this;
    }

    /**
     * Includes hard-coded ClientLogin token that will be used instead of
     * fetching a new one.
     *
     * @deprecated It is encouraged that you switch to OAuth2 at your earliest
     *             convenience. Please see the OfflineCredentials utility for
     *             generating offline credentials easily.
     */
    @Deprecated
    public Builder withClientLoginToken(String clientLoginToken) {
      clearAuthentication();
      this.clientLoginToken = clientLoginToken;
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
     * Includes network code. Required for most service calls.
     */
    public Builder withNetworkCode(String networkCode) {
      this.networkCode = networkCode;
      return this;
    }

    /**
     * Includes application name (any string of your choice). Required.
     */
    public Builder withApplicationName(String applicationName) {
      this.applicationName = applicationName;
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
      clientLoginToken = null;
    }

    /**
     * Builds the {@code DfpSession}.
     *
     * @return the built {@code DfpSession}
     * @throws ValidationException if the {@code DfpSession} did not validate
     */
    public DfpSession build() throws ValidationException {
      defaultOptionals();
      validate();
      return new DfpSession(this);
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
     * Validates the properties for the DFP session.
     */
    private void validate() throws ValidationException {
      // Check for at least one authentication mechanism.
      if (this.clientLoginToken == null
          && this.oAuth2Credential == null) {
        throw new ValidationException(
            "Either ClientLogin or OAuth2 authentication must be used.", "");
      }

      // Check that application name is not empty or the default.
      if (Strings.isNullOrEmpty(applicationName)
          || applicationName.contains(DEFAULT_APPLICATION_NAME)) {
        throw new ValidationException(String.format(
            "Application name must be set and not be the default [%s]", DEFAULT_APPLICATION_NAME),
            "applicationName");
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
