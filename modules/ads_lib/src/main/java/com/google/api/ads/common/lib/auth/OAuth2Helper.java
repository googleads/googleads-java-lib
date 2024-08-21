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

import com.google.api.client.auth.oauth2.Credential;
import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import java.io.IOException;
import org.slf4j.Logger;

/**
 * OAuth2 helper functions.
 */
public class OAuth2Helper {

  private final Long refreshWindowSeconds;
  private final Logger libLogger;

  /**
   * Constructor.
   *
   * @param libLogger the lib logger
   * @param refreshWindowSeconds the refresh window in seconds
   */
  @Inject
  public OAuth2Helper(@Named("libLogger") Logger libLogger,
      @Named("oAuth2RefreshWindow") Long refreshWindowSeconds) {
    this.libLogger = libLogger;
    this.refreshWindowSeconds = refreshWindowSeconds;
  }

  /**
   * Refreshes the credential if within the refresh window.
   *
   * @throws IOException if there was an problem refreshing the token
   */
  public Credential refreshCredential(Credential credential) throws IOException {
    if (isCredentialRefreshable(credential)) {
      if (!callRefreshToken(credential)) {
        libLogger.warn("OAuth2 token could not be refreshed. "
            + "Add a refreshListener to the Credential to capture this failure.");
      }
    }
    return credential;
  }

  /**
   * Calls the refreshToken method on credential.
   *
   * @throws IOException if the credential could not be refreshed.
   */
  boolean callRefreshToken(Credential credential) throws IOException {
    return credential.refreshToken();
  }

  /**
   * Returns {@code true} if the credential can and should be refreshed.
   */
  @VisibleForTesting
  boolean isCredentialRefreshable(Credential credential) {
    return credential.getAccessToken() == null || credential.getExpiresInSeconds() != null
        && credential.getExpiresInSeconds() <= refreshWindowSeconds;
  }
}
