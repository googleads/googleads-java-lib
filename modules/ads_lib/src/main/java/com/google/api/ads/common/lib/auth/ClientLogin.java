// Copyright 2012 Google Inc. All Rights Reserved.
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

import com.google.api.client.googleapis.auth.clientlogin.ClientLoginResponseException;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpTransport;

import java.io.IOException;

/**
 * Wrapper for
 * {@link com.google.api.client.googleapis.auth.clientlogin.ClientLogin}.
 *
 * @author Adam Rogal
 */
public class ClientLogin {

  private com.google.api.client.googleapis.auth.clientlogin.ClientLogin clientLogin;

  public ClientLogin() {
    clientLogin = new com.google.api.client.googleapis.auth.clientlogin.ClientLogin();
  }

  public String getAccountType() {
    return clientLogin.accountType;
  }

  public void setAccountType(String accountType) {
    clientLogin.accountType = accountType;
  }

  public String getAuthTokenType() {
    return clientLogin.authTokenType;
  }

  public void setAuthTokenType(String authTokenType) {
    clientLogin.authTokenType = authTokenType;
  }

  public String getApplicationName() {
    return clientLogin.applicationName;
  }

  public void setApplicationName(String applicationName) {
    clientLogin.applicationName = applicationName;
  }

  public String getCaptchaAnswer() {
    return clientLogin.captchaAnswer;
  }

  public void setCaptchaAnswer(String captchaAnswer) {
    clientLogin.captchaAnswer = captchaAnswer;
  }

  public String getCaptchaToken() {
    return clientLogin.captchaToken;
  }

  public void setCaptchaToken(String captchaToken) {
    clientLogin.captchaToken = captchaToken;
  }

  public String getPassword() {
    return clientLogin.password;
  }

  public void setPassword(String password) {
    clientLogin.password = password;
  }

  public GenericUrl getServerUrl() {
    return clientLogin.serverUrl;
  }

  public void setServerUrl(GenericUrl serverUrl) {
    clientLogin.serverUrl = serverUrl;
  }

  public HttpTransport getTransport() {
    return clientLogin.transport;
  }

  public void setTransport(HttpTransport transport) {
    clientLogin.transport = transport;
  }

  public String getUsername() {
    return clientLogin.username;
  }

  public void setUsername(String username) {
    clientLogin.username = username;
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
  String requestToken() throws ClientLoginResponseException, IOException {
    return clientLogin.authenticate().auth;
  }
}
