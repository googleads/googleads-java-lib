// Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.extension.ratelimiter;

/**
 * This type is for errors during reflection check (in order to determine whether it's rate limit
 * error, and if so the detailed information).
 */
public class RateLimiterReflectionException extends RateLimiterException {
  public RateLimiterReflectionException(String message, Throwable cause) {
    super(message, cause);
  }
}
