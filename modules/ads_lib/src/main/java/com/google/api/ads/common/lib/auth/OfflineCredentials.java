// Copyright 2013, Google Inc. All Rights Reserved.
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
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.Internals;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.auth.oauth2.GoogleOAuthConstants;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.configuration.Configuration;

/**
 * OfflineCredentials offline OAuth2 provider.<br>
 * <br>
 * Example usage:
 * <pre><code>
 * Credential credential = new OfflineCredentials.Builder()
 *     .forApi(OfflineCredentials.Api.ADWORDS)
 *     .fromFile()
 *     .build()
 *     .generateCredential();
 * </code></pre>
 *
 * Generate a refresh token or service account key file and place
 * it in your ads.properties file to be read by this utility.
 */
public class OfflineCredentials {

  /** Interface outlining the values required for OAuth configuration. */
  public interface OAuthConfig {

    /**
     * Returns the property key prefix. This is the prefix that is in the properties file e.g.
     * api.adwords
     */
    String getPropertyKeyPrefix();

    /**
     * Returns the API OAuth scope.
     */
    String getScope();

    /**
     * Returns the internals object for the API that has the OAuth helper.
     */
    Internals getInternals();
  }

  /**
   * Enum representing the API that OfflineCredentials can be used for.
   */
  public static enum Api implements OAuthConfig {
    ADWORDS("api.adwords.", "https://www.googleapis.com/auth/adwords"),
    DFP("api.dfp.", "https://www.googleapis.com/auth/dfp");

    private final String propKeyPrefix;
    private final String scope;

    private Api(String propKeyPrefix, String scope) {
      this.propKeyPrefix =
          Preconditions.checkNotNull(propKeyPrefix, "Null property key prefix for: %s", this);
      this.scope = Preconditions.checkNotNull(scope, "Null scope for: %s", this);
    }

    @Override
    public String getPropertyKeyPrefix() {
      return propKeyPrefix;
    }

    @Override
    public String getScope() {
      return scope;
    }

    @Override
    public Internals getInternals() {
      switch (this) {
        case ADWORDS:
          return com.google.api.ads.adwords.lib.utils.AdWordsInternals.getInstance();
        case DFP:
          return com.google.api.ads.dfp.lib.utils.DfpInternals.getInstance();
        default:
          return null;
      }
    }
  }

  /**
   * A class defining a custom OAuth config. This can be used for APIs such as GMB or a whitelisted
   * API.
   */
  public static class CustomOAuthConfig implements OAuthConfig {
    private String propKeyPrefix;
    private String scope;
    private Internals internals;

    public CustomOAuthConfig(String propKeyPrefix, String scope, Internals internals) {
      this.propKeyPrefix = propKeyPrefix;
      this.scope = scope;
      this.internals = internals;
    }

    @Override
    public String getPropertyKeyPrefix() {
      return propKeyPrefix;
    }

    @Override
    public String getScope() {
      return scope;
    }

    @Override
    public Internals getInternals() {
      return internals;
    }
  }

  private final HttpTransport httpTransport;
  private final String refreshToken;
  private final String clientId;
  private final String clientSecret;
  private final OAuth2Helper oAuth2Helper;
  private final String tokenServerUrl;
  private final String jsonKeyFilePath;
  private final List<String> scopes;
  private final String serviceAccountUser;

  /**
   * Constructor.
   *
   * @param builder the builder for OfflineCredentials
   */
  private OfflineCredentials(ForApiBuilder builder) {
    this.httpTransport = builder.httpTransport;
    this.refreshToken = builder.refreshToken;
    this.clientId = builder.clientId;
    this.clientSecret = builder.clientSecret;
    this.oAuth2Helper = builder.oAuth2Helper;
    this.tokenServerUrl = builder.tokenServerUrl;
    this.jsonKeyFilePath = builder.jsonKeyFilePath;
    this.scopes = builder.scopes;
    this.serviceAccountUser = builder.serviceAccountUser;
  }

  /**
   * Gets the {@link HttpTransport} that will be used when
   * generating a {@link Credential}.
   */
  public HttpTransport getHttpTransport() {
    return httpTransport;
  }

  /**
   * Gets the refresh token that will be used to
   * generate a {@link Credential}.
   */
  public String getRefreshToken() {
    return refreshToken;
  }

  /**
   * Gets the client ID that will be used to
   * generate a {@link Credential}.
   */
  public String getClientId() {
    return clientId;
  }

  /**
   * Gets the client secret that will be used to
   * generate a {@link Credential}.
   */
  public String getClientSecret() {
    return clientSecret;
  }
  
  /**
   * Gets the file path to a JSON key file that will be used to
   * generate a service account {@link Credential}.
   */
  public String getJsonKeyFilePath() {
    return jsonKeyFilePath;
  }

  /**
   * Gets the service account user. Validation ensures this is only <em>potentially</em> set if
   * {@link #getJsonKeyFilePath()} is not {@code null}, in which case it is still optional.
   */
  @VisibleForTesting
  final String getServiceAccountUser() {
    return serviceAccountUser;
  }

  /**
   * Generates a new offline credential and immediately refreshes it.
   *
   * @return a newly refreshed offline credential.
   * @throws OAuthException if the credential could not be refreshed.
   */
  public Credential generateCredential() throws OAuthException {
    GoogleCredential credential = Strings.isNullOrEmpty(this.jsonKeyFilePath)
        ? generateCredentialFromClientSecrets()
        : generateCredentialFromKeyFile();
    try {
      if (!oAuth2Helper.callRefreshToken(credential)) {
        throw new OAuthException(
            "Credential could not be refreshed. A newly generated refresh token or "
            + "secret key may be required.");
      }
    } catch (IOException e) {
      throw new OAuthException("Credential could not be refreshed.", e);
    }
    return credential;
  }
  
  private GoogleCredential generateCredentialFromKeyFile() throws OAuthException {
    try {
      File jsonKeyFile = new File(jsonKeyFilePath);
      GoogleCredential credential = GoogleCredential.fromStream(
          Files.asByteSource(jsonKeyFile).openStream(),
          httpTransport,
          new JacksonFactory())
          .createScoped(this.scopes);
      if (Strings.isNullOrEmpty(this.serviceAccountUser)) {
        return credential;
      }
      // Creates a credential based on the instance created above, but adds the service account
      // user. Slightly wasteful because the instance created above will be discarded immediately,
      // but this ensures that the stream parsing and validation in GoogleCredential.fromStream is
      // used and not duplicated here.
      // The approach here is from the suggestion posted on issue 1007 for google-api-java-client:
      // https://github.com/google/google-api-java-client/issues/1007#issuecomment-264157989
      return new GoogleCredential.Builder()
          .setJsonFactory(credential.getJsonFactory())
          .setServiceAccountId(credential.getServiceAccountId())
          .setServiceAccountPrivateKey(credential.getServiceAccountPrivateKey())
          .setServiceAccountScopes(credential.getServiceAccountScopes())
          .setTransport(credential.getTransport())
          // Sets the service account user.
          .setServiceAccountUser(this.serviceAccountUser)
          .build();
    } catch (IOException e) {
      throw new OAuthException("Service account key file could not be loaded.", e);
    }
  }
  
  private GoogleCredential generateCredentialFromClientSecrets() {
    GoogleCredential credential = new GoogleCredential.Builder()
        .setTransport(httpTransport)
        .setJsonFactory(new JacksonFactory())
        .setClientSecrets(clientId, clientSecret)
        .setTokenServerEncodedUrl(tokenServerUrl)
        .build();
    credential.setRefreshToken(refreshToken);
    return credential;
  }

  /**
   * Pre-builder for OfflineCredentials.
   */
  public static class Builder {

    @Nullable
    private OAuth2Helper oAuth2Helper;

    /**
     * Default constructor.
     */
    public Builder() {
      this(null);
    }

    @VisibleForTesting
    Builder(@Nullable OAuth2Helper oAuth2Helper) {
      this.oAuth2Helper = oAuth2Helper;
    }

    /**
     * Specifies which {@link OAuthConfig} should this {@code OfflineCredentials} be
     * used for. Should be called first before any other builder methods.
     */
    public ForApiBuilder forApi(OAuthConfig oAuthConfig) {
      defaultOptionals(oAuthConfig);
      return new ForApiBuilder(oAuthConfig, oAuth2Helper);
    }

    private void defaultOptionals(OAuthConfig oAuthConfig) {
      if (oAuth2Helper == null) {
        oAuth2Helper = oAuthConfig.getInternals().getOAuth2Helper();
      }
    }
  }

  /**
   * Builder for OfflineCredentials.
   */
  public static class ForApiBuilder implements
      com.google.api.ads.common.lib.utils.Builder<OfflineCredentials> {

    // Use thread-safe global instance as default.
    @VisibleForTesting
    static final HttpTransport DEFAULT_HTTP_TRANSPORT = new NetHttpTransport();

    private HttpTransport httpTransport;
    private String refreshToken;
    private String clientId;
    private String clientSecret;
    private String configFilePath;
    private String tokenServerUrl;
    private String jsonKeyFilePath;
    private String serviceAccountUser;
    private List<String> scopes;

    private final ConfigurationHelper configHelper;
    private final OAuthConfig oAuthConfig;
    private final OAuth2Helper oAuth2Helper;

    /**
     * Private constructor.
     *
     * @param oAuthConfig the API OAuth configuration for the builder
     * @param oAuth2Helper the OAuth2 helper
     */
    private ForApiBuilder(OAuthConfig oAuthConfig, OAuth2Helper oAuth2Helper) {
      this(new ConfigurationHelper(), oAuthConfig, oAuth2Helper);
    }

    @VisibleForTesting
    ForApiBuilder(ConfigurationHelper configHelper, OAuthConfig oAuthConfig,
        OAuth2Helper oAuth2Helper) {
      this.configHelper = configHelper;
      this.oAuthConfig = oAuthConfig;
      this.oAuth2Helper = oAuth2Helper;
    }

    @Override
    public ForApiBuilder fromFile(String path) throws ConfigurationLoadException {
      return from(configHelper.fromFile(path), path.toString());
    }

    @Override
    public ForApiBuilder fromFile(File path) throws ConfigurationLoadException {
      return from(configHelper.fromFile(path), path.getAbsolutePath());
    }

    @Override
    public ForApiBuilder fromFile(URL path) throws ConfigurationLoadException {
      return from(configHelper.fromFile(path), path.toString());
    }

    @Override
    public ForApiBuilder fromFile() throws ConfigurationLoadException {
      return fromFile(com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME);
    }

    /**
     * Reads properties from the provided {@link Configuration} object
     * <br><br>
     * Understands the following properties suffixes:
     * <br><br>
     * <ul>
     * <li>refreshToken</li>
     * <li>clientId</li>
     * <li>clientSecret</li>
     * <li>jsonKeyFilePath</li>
     * </ul><br>
     * For example, the AdWords OAuth2 refresh token can be read from:
     * <code>api.adwords.refreshToken</code>
     *
     * @param config the configuration
     * @return Builder populated from the Configuration
     */
    @Override
    public ForApiBuilder from(Configuration config) {
      this.refreshToken = config.getString(getPropertyKey("refreshToken"), null);
      this.clientId = config.getString(getPropertyKey("clientId"), null);
      this.clientSecret = config.getString(getPropertyKey("clientSecret"), null);
      this.jsonKeyFilePath = config.getString(getPropertyKey("jsonKeyFilePath"), null);
      this.serviceAccountUser = config.getString(getPropertyKey("serviceAccountUser"), null);
      return this;
    }

    /**
     * Reads properties from the provided {@link Configuration} object
     * <br><br>
     * Understands the following properties suffixes:
     * <br><br>
     * <ul>
     * <li>refreshToken</li>
     * <li>clientId</li>
     * <li>clientSecret</li>
     * <li>jsonKeyFilePath</li>
     * <li>serviceAccountUser</li>
     * </ul><br>
     * For example, the AdWords OAuth2 refresh token can be read from:
     * <code>api.adwords.refreshToken</code>
     *
     * @param config the configuration
     * @param filePath the file path of the configuration
     * @return Builder populated from the Configuration
     */
    ForApiBuilder from(Configuration config, String filePath) {
      from(config);
      this.configFilePath = filePath;
      return this;
    }

    /**
     * Sets the client ID & secret to create the OAuth2 Credential with. If you
     * do not have a client ID or secret, please create one in the API console:
     * https://console.developers.google.com/project
     */
    public ForApiBuilder withClientSecrets(String clientId, String clientSecret) {
      this.clientId = clientId;
      this.clientSecret = clientSecret;
      return this;
    }

    /**
     * Sets the refresh token to create the OAuth2 Credential with. If you need
     * to create one, see the GetRefreshToken example.
     */
    public ForApiBuilder withRefreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
      return this;
    }
    
    /**
     * Sets the path to a JSON key file for authenticating with a service account.
     * If you do not have one, please create it in the API console:
     * https://console.developers.google.com/apis/credentials
     */
    public ForApiBuilder withJsonKeyFilePath(String jsonKeyFilePath) {
      this.jsonKeyFilePath = jsonKeyFilePath;
      return this;
    }

    /**
     * Sets the service account user to impersonate. This attribute is optional, and only applicable
     * to the service account flow.
     *
     * <p>See
     * https://developers.google.com/adwords/api/docs/guides/authentication#granting_impersonation_abilities
     * for details.
     *
     * @param serviceAccountUser the email address of the account to impersonate.
     */
    public ForApiBuilder withServiceAccountUser(String serviceAccountUser) {
      this.serviceAccountUser = serviceAccountUser;
      return this;
    }
    
    /**
     * Optionally sets scopes for authenticating with a service account. By default,
     * the scope will only be for the set {@link Api}. If you are using a refresh token,
     * the scope is set at the time the refresh token is generated, and this function is
     * a no-op.
     */
    public ForApiBuilder withScopes(List<String> scopes) {
      this.scopes = scopes;
      return this;
    }
    
    /**
     * Sets the {@link HttpTransport} to be used to make the request. By
     * default, {@link NetHttpTransport} will be used, but due to some
     * environment restrictions, you may want to use a different transport,
     * such as {@code UrlFetchTransport} for AppEngine.
     */
    public ForApiBuilder withHttpTransport(HttpTransport httpTransport) {
      this.httpTransport = httpTransport;
      return this;
    }

    /**
     * Sets the token server URL. This is a no-op when using a service account key file.
     * Set the token server URL in the key file instead. Not required and defaults to
     * https://accounts.google.com/o/oauth2/token
     */
    public ForApiBuilder withTokenUrlServer(String tokenServerUrl) {
      this.tokenServerUrl = tokenServerUrl;
      return this;
    }

    /**
     * Validates the {@code OfflineCredentials} object.
     * @throws ValidationException if the {@code OfflineCredentials} did not
     *          validate
     */
    private void validate() throws ValidationException {
      if (!Strings.isNullOrEmpty(this.jsonKeyFilePath)) {
        // Make sure attributes that are not related to service accounts are not set.
        boolean otherOAuthPropsSet =
            !Strings.isNullOrEmpty(this.clientId)
            || !Strings.isNullOrEmpty(this.clientSecret)
            || !Strings.isNullOrEmpty(refreshToken);
        if (otherOAuthPropsSet) {
          throw new ValidationException("Multiple OAuth formats set. Please specify either "
              + "a service account key file or a client ID and secret, not both.",
              this.configFilePath != null ? generateFilePathWarning("jsonKeyFilePath") : ".");
        }
        // Key file has everything we need for service accounts, so skip the remaining validation.
        return;
      }

      if (!Strings.isNullOrEmpty(this.serviceAccountUser)) {
        throw new ValidationException(
            "Service account user set, but no service account key file was specified.",
            "serviceAccountUser");
      }

      if (Strings.isNullOrEmpty(this.clientId)) {
        throw new ValidationException(String.format("Client ID must be set%s%n"
            + "If you do not have a client ID or secret, please create one in the API console: "
            + "https://console.developers.google.com/project",
            this.configFilePath != null ? generateFilePathWarning("clientId") : "."),
            "clientId");
      }

      if (Strings.isNullOrEmpty(this.clientSecret)) {
        throw new ValidationException(String.format("Client secret must be set%s%n"
            + "If you do not have a client ID or secret, please create one in the API console: "
            + "https://console.developers.google.com/project",
            this.configFilePath != null ? generateFilePathWarning("clientSecret") : "."),
            "clientSecret");
      }

      if (Strings.isNullOrEmpty(this.refreshToken)) {
        throw new ValidationException(String.format("A refresh token must be set%s%n"
            + "It is required for offline credentials. If you need to create one, see the "
            + "GetRefreshToken example.",
            this.configFilePath != null ? generateFilePathWarning("refreshToken") : "."),
            "refreshToken");
      }
    }

    /**
     * Generates a file path warning for the key.
     */
    private String generateFilePathWarning(String key) {
      return String.format(" as %s in %s.", getPropertyKey(key), this.configFilePath);
    }

    /**
     * Fills in defaults if {@code null}.
     */
    private void defaultOptionals() {
      if (this.httpTransport == null) {
        this.httpTransport = DEFAULT_HTTP_TRANSPORT;
      }

      if (this.tokenServerUrl == null) {
        this.tokenServerUrl = GoogleOAuthConstants.TOKEN_SERVER_URL;
      }
      
      if (this.scopes == null) {
        this.scopes = Lists.newArrayList(this.oAuthConfig.getScope());
      }
    }

    @Override
    public OfflineCredentials build() throws ValidationException {
      defaultOptionals();
      validate();
      return new OfflineCredentials(this);
    }

    /**
     * Adds the correct property key prefix to match the API.
     *
     * @param suffix the property suffix
     * @return property value for key
     */
    private String getPropertyKey(String suffix) {
      return oAuthConfig.getPropertyKeyPrefix() + suffix;
    }
  }
}
