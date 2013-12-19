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

import com.google.api.ads.adwords.lib.utils.AdWordsInternals;
import com.google.api.ads.common.lib.auth.ClientLoginCompatible;
import com.google.api.ads.common.lib.auth.OAuth2Compatible;
import com.google.api.ads.common.lib.client.AdsSession;
import com.google.api.ads.common.lib.conf.ConfigurationHelper;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

import org.apache.commons.configuration.Configuration;
import org.slf4j.Logger;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.annotation.Nullable;

/**
 * A {@code AdWordsSession} represents a single session of AdWords use.
 *
 * <p>
 * Implementation is not thread-safe.
 * </p>
 *
 * @author Adam Rogal
 */
public class AdWordsSession implements AdsSession, OAuth2Compatible, ClientLoginCompatible {

  static final String DEPRECATION_MESSAGE = "ClientLogin is now deprecated. "
      + "Please switch to OAuth2. See OfflineCredentials for more information.";

  private String clientLoginToken;
  private String clientCustomerId;
  private Boolean isValidateOnly;
  private Boolean isReportMoneyInMicros;
  private Boolean isPartialFailure;
  private Credential oAuth2Credential;

  private final String userAgent;
  private final String developerToken;
  private final String endpoint;
  private final Logger libLogger;

  public static final String DEFAULT_ENDPOINT = "https://adwords.google.com/";
  
  private static final String DEFAULT_USER_AGENT = "INSERT_USERAGENT_HERE";

  /**
   * Private constructor.
   *
   * @param builder the AdWordsSession builder
   */
  private AdWordsSession(Builder builder) {
    this.clientCustomerId = builder.clientCustomerId;
    this.developerToken = builder.developerToken;
    this.endpoint = builder.endpoint;
    this.isPartialFailure = builder.isPartialFailure;
    this.isReportMoneyInMicros = builder.isReportMoneyInMicros;
    this.isValidateOnly = builder.isValidateOnly;
    this.oAuth2Credential = builder.oAuth2Credential;
    this.userAgent = builder.userAgent;
    this.libLogger = builder.libLogger;

    if (builder.clientLoginToken != null) {
      this.setClientLoginToken(builder.clientLoginToken);
    }
  }

  /**
   * Gets the client customer ID.
   */
  public String getClientCustomerId() {
    return clientCustomerId;
  }

  /**
   * Sets the client customer ID.
   */
  public void setClientCustomerId(String clientCustomerId) {
    this.clientCustomerId = clientCustomerId;
  }

  /**
   * Returns {@code true} if the session should only validate the request.
   */
  @Nullable
  public Boolean isValidateOnly() {
    return isValidateOnly;
  }

  /**
   * Sets whether this session should only validate the request.
   */
  public void setValidateOnly(@Nullable Boolean isValidateOnly) {
    this.isValidateOnly = isValidateOnly;
  }

  /**
   * @return the userAgent
   */
  public String getUserAgent() {
    return userAgent;
  }

  /**
   * @return the developerToken
   */
  public String getDeveloperToken() {
    return developerToken;
  }

  /**
   * @return the isPartialFailure
   */
  @Nullable
  public Boolean isPartialFailure() {
    return isPartialFailure;
  }

  /**
   * Sets whether this session should allow partial failure.
   */
  public void setPartialFailure(@Nullable Boolean isPartialFailure) {
    this.isPartialFailure = isPartialFailure;
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
   * Sets the ClientLogin Token. Any other authentication credentials on the
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
   * Clears all the authentication credentials from this session.
   */
  private void clearAuthentication() {
    oAuth2Credential = null;
    clientLoginToken = null;
  }

  /**
   * @return the endpoint
   */
  public String getEndpoint() {
    return endpoint;
  }

  /**
   * @param reportMoneyInMicros the reportMoneyInMicros to set
   */
  public void setReportMoneyInMicros(@Nullable Boolean reportMoneyInMicros) {
    this.isReportMoneyInMicros = reportMoneyInMicros;
  }

  /**
   * @return the reportMoneyInMicros
   */
  @Nullable
  public Boolean isReportMoneyInMicros() {
    return isReportMoneyInMicros;
  }

  /**
   * Builder for AdWordsSession.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   */
  public static class Builder implements
      com.google.api.ads.common.lib.utils.Builder<AdWordsSession> {

    private String endpoint;
    private String clientLoginToken;
    private String userAgent;
    private String developerToken;
    private String clientCustomerId;
    private Boolean isPartialFailure;
    private Boolean isValidateOnly;
    private Boolean isReportMoneyInMicros = Boolean.FALSE;
    private Credential oAuth2Credential;

    private final Logger libLogger;
    private final ConfigurationHelper configHelper;

    /**
     * Constructor.
     */
    public Builder() {
      this(AdWordsInternals.getInstance().getAdsServiceLoggers().getLibLogger());
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
     * Reads properties from the provided {@link Configuration} object.<br><br>
     * Known properties:
     * <ul>
     * <li>api.adwords.clientCustomerId</li>
     * <li>api.adwords.userAgent</li>
     * <li>api.adwords.developerToken</li>
     * <li>api.adwords.isPartialFailure</li>
     * <li>api.adwords.endpoint</li>
     * <li>api.adwords.reportMoneyInMicros</li>
     * <li>Deprecated: api.adwords.clientLoginToken - use OAuth2 instead.</li>
     * </ul>
     *
     * @param config
     * @return Builder populated from the Configuration
     */
    public Builder from(Configuration config) {
      this.clientCustomerId = config.getString("api.adwords.clientCustomerId", null);
      this.userAgent = config.getString("api.adwords.userAgent", null);
      this.developerToken = config.getString("api.adwords.developerToken", null);
      this.isPartialFailure = config.getBoolean("api.adwords.isPartialFailure", null);
      this.endpoint = config.getString("api.adwords.endpoint", null);
      this.isReportMoneyInMicros = config.getBoolean("api.adwords.reportMoneyInMicros",
          Boolean.FALSE);
      this.clientLoginToken = config.getString("api.adwords.clientLoginToken", null);

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
     * Includes a developer token. Required.
     */
    public Builder withDeveloperToken(String developerToken) {
      this.developerToken = developerToken;
      return this;
    }

    /**
     * Includes user agent.
     */
    public Builder withUserAgent(String userAgent) {
      this.userAgent = userAgent;
      return this;
    }

    /**
     * Override the endpoint server. Optional and defaults to
     * https://adwords.google.com.
     */
    public Builder withEndpoint(String endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    /**
     * Includes a clientCustomerId.
     */
    public Builder withClientCustomerId(String clientCustomerId) {
      this.clientCustomerId = clientCustomerId;
      return this;
    }

    /**
     * Enables partial failure. Default is disabled.
     */
    public Builder enablePartialFailure() {
      this.isPartialFailure = true;
      return this;
    }

    /**
     * Enable downloading of money values in reports in micros.
     */
    public Builder enableReportMoneyInMicros() {
      this.isReportMoneyInMicros = true;
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
     * Builds the {@code AdWordsSession}.
     *
     * @return the built {@code AdWordsSession}
     * @throws ValidationException if the {@code AdWordsSession} did not validate
     */
    public AdWordsSession build() throws ValidationException {
      defaultOptionals();
      validate();
      return new AdWordsSession(this);
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
     * Validates the properties for the AdWords session.
     */
    private void validate() throws ValidationException {
      // Check for at least one authentication mechanism.
      if (this.clientLoginToken == null
          && this.oAuth2Credential == null) {
        throw new ValidationException(
            "ClientLogin or OAuth2 authentication must be used.", "");
      }

      // Check that the developer token is set.
      if (this.developerToken == null) {
        throw new ValidationException("A developer token must be set.", "developerToken");
      }
      
      // Check that user agent is not empty or the default.
      if (Strings.isNullOrEmpty(userAgent)
          || userAgent.contains(DEFAULT_USER_AGENT)) {
        throw new ValidationException(String.format(
            "User agent must be set and not be the default [%s]", DEFAULT_USER_AGENT),
            "userAgent");
      }

      // Make sure they specify an endpoint.
      try {
        new URL(this.endpoint);
      } catch (MalformedURLException e) {
        throw new ValidationException(String.format("Endpoint [%s] not recognized as a valid URL.",
            this.endpoint), "endpoint", e);
      }
    }
  }
}
