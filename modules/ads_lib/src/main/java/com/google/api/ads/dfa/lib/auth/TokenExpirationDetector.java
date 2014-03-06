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

package com.google.api.ads.dfa.lib.auth;

import javax.annotation.Nullable;

/**
 * Utility which detects exceptions returned from the DFA API due to expired DFA tokens.
 *
 * @author Joseph DiLallo
 */
public interface TokenExpirationDetector {

  /**
   * Determines if the given exception is an error from DFA signifying an expired DFA token.
   *
   * @param exception An exception returned from the DFA API. In the event the API did not return
   *     an exception, this will be {@code null}
   * @return true if the given exception signifies an expired DFA token, false otherwise
   */
  boolean isTokenExpiredException(@Nullable Throwable exception);
}
