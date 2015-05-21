// Copyright 2013 Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.auth;

import com.google.api.ads.common.lib.conf.ConfigurationHelper;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets.Details;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Strings;

import org.apache.commons.configuration.Configuration;

import java.io.File;
import java.net.URL;

/**
 * Builder for {@link GoogleClientSecrets}.
 *
 * @author Adam Rogal
 */
public class GoogleClientSecretsBuilder {

  /**
   * Enum representing the API that GoogleClientSecretsBuilder can be used for.
   */
  public static enum Api {
    ADWORDS("api.adwords."), DFA("api.dfa."), DFP("api.dfp.");

    private final String propKeyPrefix;

    private Api(String propKeyPrefix) {
      this.propKeyPrefix = propKeyPrefix;
    }

    /**
     * Gets the property key prefix.
     */
    public String getPropKeyPrefix() {
      return propKeyPrefix;
    }
  }

  /**
   * Constructor.
   */
  public GoogleClientSecretsBuilder() {}

  /**
   * Specifies which {@link Api} should this {@code GoogleClientSecrets} be
   * generated for. Should be called first before any other builder methods.
   */
  public GoogleClientSecretsForApiBuilder forApi(Api api) {
    return new GoogleClientSecretsForApiBuilder(api);
  }

  /**
   * Builder for {@link GoogleClientSecrets}.
   */
  public static class GoogleClientSecretsForApiBuilder
      implements com.google.api.ads.common.lib.utils.Builder<GoogleClientSecrets> {

    private final ConfigurationHelper configHelper;
    private final Api api;

    private String clientId;
    private String clientSecret;
    private String filePath;

    /**
     * Private constructor.
     *
     * @param api the API for the builder
     */
    private GoogleClientSecretsForApiBuilder(Api api) {
      this(new ConfigurationHelper(), api);
    }

    @VisibleForTesting
    GoogleClientSecretsForApiBuilder(ConfigurationHelper configHelper, Api api) {
      this.configHelper = configHelper;
      this.api = api;
    }

    /**
     * Sets the client ID & secret to create the OAuth2 Credential with. If you
     * do not have a client ID or secret, please create one in the API console:
     * https://console.developers.google.com
     */
    public GoogleClientSecretsForApiBuilder withClientSecrets(String clientId,
        String clientSecret) {
      this.clientId = clientId;
      this.clientSecret = clientSecret;
      return this;
    }

    @Override
    public GoogleClientSecrets build() throws ValidationException {
      validate();
      Details details = new Details();
      details.setClientId(clientId);
      details.setClientSecret(clientSecret);
      GoogleClientSecrets googleClientSecrets = new GoogleClientSecrets();
      googleClientSecrets.setInstalled(details);
      return googleClientSecrets;
    }

    /**
     * Validates the {@code GoogleClientSecrets} object.
     * @throws ValidationException if the {@code GoogleClientSecrets} did not
     *          validate
     */
    private void validate() throws ValidationException {
      if (Strings.isNullOrEmpty(clientId) || clientId.startsWith("INSERT_CLIENT_ID_HERE")) {
        throw new ValidationException(String.format(
            "Client ID must be set%s\nIf you do not have a client ID or secret, "
            + "please create one in the API console: https://console.developers.google.com",
            filePath != null ? generateFilePathWarning("clientId") : "."), "clientId");
      }

      if (Strings.isNullOrEmpty(clientSecret) || clientId.startsWith("INSERT_CLIENT_SECRET_HERE")) {
        throw new ValidationException(String.format(
            "Client secret must be set%s\nIf you do not have a client ID or secret, "
            + "please create one in the API console: https://console.developers.google.com",
            filePath != null ? generateFilePathWarning("clientSecret") : "."),
            "clientSecret");
      }
    }

    /**
     * Reads properties from the provided {@link Configuration} object
     * <br><br>
     * Understands the following properties suffixes:
     * <br><br>
     * <ul>
     * <li>clientId</li>
     * <li>clientSecret</li>
     * </ul><br>
     * For example, the AdWords OAuth2 client ID can be read from:
     * <code>api.adwords.clientId</code>
     *
     * @param config the configuration
     * @return Builder populated from the Configuration
     */
    @Override
    public GoogleClientSecretsForApiBuilder from(Configuration config) {
      clientId = config.getString(getPropertyKey("clientId"), null);
      clientSecret = config.getString(getPropertyKey("clientSecret"), null);
      return this;
    }

    /**
     * Reads properties from the provided {@link Configuration} object
     * <br><br>
     * Understands the following properties suffixes:
     * <br><br>
     * <ul>
     * <li>clientId</li>
     * <li>clientSecret</li>
     * </ul><br>
     * For example, the AdWords OAuth2 client ID can be read from:
     * <code>api.adwords.clientId</code>
     *
     * @param config the configuration
     * @param filePath the file path of the configuration
     * @return Builder populated from the Configuration
     */
    private GoogleClientSecretsForApiBuilder from(Configuration config, String filePath) {
      from(config);
      this.filePath = filePath;
      return this;
    }

    @Override
    public GoogleClientSecretsForApiBuilder fromFile(String path)
        throws ConfigurationLoadException {
      return from(configHelper.fromFile(path), path);
    }

    @Override
    public GoogleClientSecretsForApiBuilder fromFile(File path) throws ConfigurationLoadException {
      return from(configHelper.fromFile(path), path.getAbsolutePath());
    }

    @Override
    public GoogleClientSecretsForApiBuilder fromFile(URL path) throws ConfigurationLoadException {
      return from(configHelper.fromFile(path), path.toString());
    }

    @Override
    public GoogleClientSecretsForApiBuilder fromFile() throws ConfigurationLoadException {
      return fromFile(com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME);
    }

    /**
     * Adds the correct property key prefix to match the API.
     *
     * @param suffix the property suffix
     * @return property value for key
     */
    private String getPropertyKey(String suffix) {
      return api.getPropKeyPrefix() + suffix;
    }

    /**
     * Generates a file path warning for the key.
     */
    private String generateFilePathWarning(String key) {
      return String.format(" as %s in %s.", getPropertyKey(key), filePath);
    }
  }
}


