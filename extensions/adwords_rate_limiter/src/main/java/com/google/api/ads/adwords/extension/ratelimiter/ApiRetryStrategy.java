// Copyright 2017 Google Inc. All Rights Reserved.
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

/** Generic strategy interface for retry logic. */
public interface ApiRetryStrategy {
  /**
   * Check whether it should perform current (kth) attempt.
   *
   * @param kthAttempt this is the kth attempt of calling the AdWords API function
   * @return wehther this attempt should be granted (true) or blocked (false)
   */
  public boolean canDoThisAttempt(final int kthAttempt);

  /**
   * Check whether the encountered error should be retried.
   *
   * @param clientCustomerId the client customer ID when calling the AdWords API function
   * @param throwable the excountered error
   * @return whether the AdWords API call should be retried after encountering the speicified error
   */
  public boolean shouldRetryOnError(long clientCustomerId, Throwable throwable);

  /**
   * Calculate wait time (in millis) before the retrying the AdWords API call.
   *
   * @param clientCustomerId the client customer ID
   * @param kthAttempt this is the kth attempt of calling the AdWords API function
   * @param throwable the encountered error
   * @return the wait time (in millis) before retrying the AdWords API call
   */
  public long calcWaitTimeBeforeCall(long clientCustomerId, int kthAttempt, Throwable throwable);
}
