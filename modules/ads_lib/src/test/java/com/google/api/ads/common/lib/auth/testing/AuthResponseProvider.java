// Copyright 2014 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.common.lib.auth.testing;

import static org.apache.commons.lang.CharEncoding.UTF_8;

import com.google.api.ads.common.lib.utils.Streams;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Provides standard auth responses useful for testing.
 */
public class AuthResponseProvider {

  /**
   * Returns an OAuth response that will contain the specified values.
   */
  public static String getTestOAuthResponse(String accessToken, Long expirationInSeconds,
      String refreshToken) throws IOException {
    String response = Streams.readAll(
        AuthResponseProvider.class.getResourceAsStream("test_oauth_response.txt"),
        Charset.forName(UTF_8));
    return response.replace("#ACCESS_TOKEN#", accessToken)
        .replace("#EXPIRATION_SECONDS#", expirationInSeconds.toString())
        .replace("#REFRESH_TOKEN#", refreshToken);
  }
}
