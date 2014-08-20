// Copyright 2011, Google Inc. All Rights Reserved.
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
import com.google.api.client.googleapis.auth.clientlogin.ClientLoginResponseException;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Strings;

import org.apache.commons.configuration.Configuration;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * ClientLogin token provider.<br>
 * <br>
 * Example usage:
 * <pre><code>
 * ClientLoginTokens clientLoginTokens = new ClientLoginTokens.Builder()
 *     .forApi(ClientLoginTokens.Api.DFP)
 *     .fromFile()
 *     .build();
 * String clientLoginToken = clientLoginTokens.requestToken();</code></pre>
 * If you receive a CAPTCHA challenge you can supply the login token and captcha
 * in the requestToken function like:
 * <pre><code>
 * String clientLoginToken;
 * try {
 *   clientLoginToken = clientLoginTokens.requestToken();
 * } catch(ClientLoginException e) {
 *   if (e.getCaptchaInfo != null) {
 *      String loginCaptcha =
 *          // redirect user to e.getCaptchaInfo.getCaptchaUrl() to get CAPTCHA;
 *      String loginToken = captchaInformation.getCaptchaToken();
 *      clientLoginToken =
 *          clientLoginTokens.requestToken(loginCaptcha, loginToken);
 *   }
 * }</code></pre>
 *
 * @deprecated ClientLogin is now deprecated. It is encouraged to switch to
 *             OAuth2 at your earliest convenience. Please see the
 *             OfflineCredentials utility for generating offline credentials
 *             easily.
 *
 * @author Adam Rogal
 */
@Deprecated
public class ClientLoginTokens {

  /**
   * Enum representing the API that ClientLoginTokens can be used for.
   */
  public static enum Api {
    DFP("gam", "api.dfp.");

    private final String service;
    private final String propKeyPrefix;

    private Api(String service, String propKeyPrefix) {
      this.service = service;
      this.propKeyPrefix = propKeyPrefix;
    }

    /**
     * Gets the service.
     */
    public String getService() {
      return service;
    }

    /**
     * Gets the property key prefix.
     */
    public String getPropKeyPrefix() {
      return propKeyPrefix;
    }
  }

  @VisibleForTesting
  ClientLogin clientLogin;
  private String clientLoginTokenOverride;

  /**
   * Constructor.
   */
  @VisibleForTesting
  ClientLoginTokens(ClientLogin clientLogin) {
    this.clientLogin = clientLogin;
  }

  /**
   * Requests a token with the email and password, along with information used
   * to validate a CAPTCHA'ed account.
   *
   * @param captchaToken the CAPTCHA token. i.e.
   *        {@link com.google.api.client.googleapis.auth.clientlogin
   *               .ClientLogin.ErrorInfo#captchaToken ErrorInfo#captchaToken}
   * @param captchaAnswer the CAPTCHA answer. i.e. fetched from
   *        {@link com.google.api.client.googleapis.auth.clientlogin
   *        .ClientLogin.ErrorInfo#captchaUrl ErrorInfo#captchaUrl}
   * @return the client login token
   * @throws ClientLoginResponseException if the token could not be retrieved
   * @throws IOException if there was a problem making the request
   */
  public String requestToken(String captchaToken, String captchaAnswer)
      throws ClientLoginResponseException, IOException {
    if (clientLogin == null) {
      throw new IllegalStateException(
          "requestToken() and requestToken(captchaToken, captchaAnswer) can only be used with " +
          "ClientLoginTokens created from ClientLogin.Builder");
    }
    try {
      clientLogin.setCaptchaAnswer(captchaAnswer);
      clientLogin.setCaptchaToken(captchaToken);
      return requestToken();
    } finally {
      clientLogin.setCaptchaAnswer(null);
      clientLogin.setCaptchaToken(null);
    }
  }

  /**
   * Checks to see if we can use an existing clientLoginToken from file,
   * otherwise delegates to {@link ClientLoginTokens#requestToken()}.
   *
   * @return the client login token
   * @throws ClientLoginResponseException if the token could not be retrieved,
   *         possibly due to a {@link ClientLoginResponseException#getDetails()
   *         CAPTCHA} challenge
   * @throws IOException if there was a problem making the request
   */
  public String getToken() throws ClientLoginResponseException, IOException {
    return (clientLoginTokenOverride != null && !clientLoginTokenOverride.trim().isEmpty())
        ? clientLoginTokenOverride
        : requestToken();
  }

  /**
   * Requests a token with the email and password.
   *
   * @return the client login token
   * @throws ClientLoginResponseException if the token could not be retrieved, possibly
   *         due to a {@link ClientLoginResponseException#getDetails() CAPTCHA}
   *         challenge
   * @throws IOException if there was a problem making the request
   */
  public String requestToken() throws ClientLoginResponseException, IOException {
    if (clientLogin == null) {
      throw new IllegalStateException(
          "requestToken() and requestToken(captchaToken, captchaAnswer) can only be used with " +
          "ClientLoginTokens created from ClientLogin.Builder");
    }
    return clientLogin.requestToken();
  }

  /**
   * Pre-builder for ClientLoginTokens.
   */
  public static class Builder {

    /**
     * Specifies which {@link Api} should this {@code ClientLoginTokens} be used
     * for. Should be called first before any other builder methods.
     */
    public ForApiBuilder forApi(Api api) {
      return new ForApiBuilder(api);
    }
  }

  /**
   * Builder for ClientLoginTokens.
   */
  public static class ForApiBuilder implements
      com.google.api.ads.common.lib.utils.Builder<ClientLoginTokens> {

    // Use thread-safe global instance as default.
    private static final HttpTransport DEFAULT_HTTP_TRANSPORT = new NetHttpTransport();

    private final ConfigurationHelper configHelper;
    private final Api api;
    private final ClientLoginTokens clientLoginTokens;

    /**
     * Private constructor.
     *
     * @param api the API for the builder.
     */
    private ForApiBuilder(Api api) {
      this(new ConfigurationHelper(), new ClientLogin(), api);
    }

    @VisibleForTesting
    ForApiBuilder(ConfigurationHelper configHelper, ClientLogin clientLogin, Api api) {
      this.configHelper = configHelper;
      this.clientLoginTokens = new ClientLoginTokens(clientLogin);
      this.api = api;
    }

    public ForApiBuilder fromFile(String path) throws ConfigurationLoadException {
      return from(configHelper.fromFile(path));
    }

    public ForApiBuilder fromFile(File path) throws ConfigurationLoadException {
      return from(configHelper.fromFile(path));
    }

    public ForApiBuilder fromFile(URL path) throws ConfigurationLoadException {
      return from(configHelper.fromFile(path));
    }

    public ForApiBuilder fromFile() throws ConfigurationLoadException {
      return fromFile(com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME);
    }

    /**
     * Reads properties from the provided {@link Configuration} object
     * <br><br>
     * Known properties:
     * <ul>
     * <li>clientLoginServerUrl - e.g. https://www.google.com </li>
     * </ul>
     * Understands the following properties suffixes:
     * <br><br>
     * <ul>
     * <li>clientLoginToken</li>
     * <li>email</li>
     * <li>password</li>
     * </ul><br>
     * For example, the Dfp ClientLoginToken can be read from:
     * <code>api.dfp.clientLoginToken</code>
     *
     * @param config the configuration
     * @return Builder populated from the Configuration
     */
    public ForApiBuilder from(Configuration config) {
      clientLoginTokens.clientLoginTokenOverride =
          config.getString(getPropertyKey("clientLoginToken"), null);
      clientLoginTokens.clientLogin.setUsername(config.getString(getPropertyKey("email"), null));
      clientLoginTokens.clientLogin.setPassword(config.getString(getPropertyKey("password"), null));
      String clientLoginServerUrl = config.getString("clientLoginServerUrl", null);
      if (!Strings.isNullOrEmpty(clientLoginServerUrl)) {
        clientLoginTokens.clientLogin.setServerUrl(new GenericUrl(clientLoginServerUrl));
      }
      return this;
    }

    /**
     * Includes email & password to fetch client login token.
     */
    public ForApiBuilder withEmailAndPassword(String email, String password) {
      clientLoginTokens.clientLogin.setUsername(email);
      clientLoginTokens.clientLogin.setPassword(password);
      return this;
    }

    /**
     * Sets the {@link HttpTransport} to be used to make the request. By
     * default, {@link NetHttpTransport} will be used, but due to some
     * environment restrictions, you may want to use a different transport,
     * such as {@code UrlFetchTransport} for AppEngine.
     */
    public ForApiBuilder withHttpTransport(HttpTransport httpTransport) {
      clientLoginTokens.clientLogin.setTransport(httpTransport);
      return this;
    }

    /**
     * Sets the client login server that the token will be fetched typically in
     * the form of {@code https://www.google.com}
     */
    public ForApiBuilder withClientLoginServerUrl(String serverUrl) {
      clientLoginTokens.clientLogin.setServerUrl(new GenericUrl(serverUrl));
      return this;
    }

    /**
     * Validates the {@code ClientLoginTokens} object.
     * @throws ValidationException if the {@code ClientLoginTokens} did not
     *         validate
     */
    private void validate() throws ValidationException {
      if (!Strings.isNullOrEmpty(clientLoginTokens.clientLoginTokenOverride)
          && (!Strings.isNullOrEmpty(clientLoginTokens.clientLogin.getUsername())
              || !Strings.isNullOrEmpty(clientLoginTokens.clientLogin.getPassword()))) {
        throw new ValidationException(
            "Email and password or client login token should be set. Not both.", "");
      }

      if (Strings.isNullOrEmpty(clientLoginTokens.clientLoginTokenOverride)
          && (Strings.isNullOrEmpty(clientLoginTokens.clientLogin.getUsername())
              || Strings.isNullOrEmpty(clientLoginTokens.clientLogin.getPassword()))) {
        throw new ValidationException(
            "Email and password or client login token must be set.", "");
      }
    }

    public ClientLoginTokens build() throws ValidationException {
      validate();
      if (clientLoginTokens.clientLogin.getTransport() == null) {
        clientLoginTokens.clientLogin.setTransport(DEFAULT_HTTP_TRANSPORT);
      }
      clientLoginTokens.clientLogin.setAccountType("GOOGLE");
      clientLoginTokens.clientLogin.setAuthTokenType(api.getService());
      return clientLoginTokens;
    }

    /**
     * Adds the correct property key prefix to match the API.
     *
     * @param suffix the property suffix
     * @return property value for key
     */
    @VisibleForTesting
    String getPropertyKey(String suffix) {
      return api.getPropKeyPrefix() + suffix;
    }
  }
}
