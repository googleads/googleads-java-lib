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

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import javax.annotation.Nullable;

/**
 * The manager class that maintains mapping between {@link ApiRateLimitBucket} and corresponding
 * {@link ApiRetryStrategy}, as well as mapping betweeen AdWords API services / utilities and
 * corresponding {@link ApiRateLimitBucket}.
 */
public class ApiRetryStrategyManager {
  // Immutable mapping between {@link ApiRateLimitBucket} and {@link ApiRetryStrategy}.
  private static final ImmutableMap<ApiRateLimitBucket, ApiRetryStrategy> bucketToStrategy =
      ImmutableMap.<ApiRateLimitBucket, ApiRetryStrategy>builder()
          .put(ApiRateLimitBucket.REPORTING, ApiReportingRetryStrategy.newInstance())
          .put(ApiRateLimitBucket.OTHERS, ApiServicesRetryStrategy.newInstance())
          .build();

  private static final ImmutableSet<String> reportingClasses =
      ImmutableSet.of("ReportDownloaderInterface");

  /**
   * Get the {@link ApiRateLimitBucket} for the specified AdWords API service / utility name.
   *
   * @param name the specified AdWords API service / utility name
   * @param isUtility whether this is for some AdWords API utility
   * @return the corresponding {@link ApiRateLimitBucket} enum, or null if it's not supported by
   *     this rate limiter extension
   */
  private static @Nullable ApiRateLimitBucket getRateLimitBucket(String name, boolean isUtility) {
    if (isUtility) {
      // For utilities, we only support ReportDownloader but not others (such as BatchJobHelper).
      return reportingClasses.contains(name) ? ApiRateLimitBucket.REPORTING : null;
    } else {
      // For all AdWords API services, share the "OTHERS" bucket.
      return ApiRateLimitBucket.OTHERS;
    }
  }

  /**
   * Get the {@link ApiRetryStrategy} for the specified AdWords API service / utility name.
   *
   * @param name the specified AdWords API service / utility name
   * @param isUtility whether this is for some AdWords API utility, i.e., from calling {@link
   *     com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface#getUtility(com.google.api.ads.adwords.lib.client.AdWordsSession,
   *     Class)}.
   * @return the corresponding {@link ApiRetryStrategy} object, or null if it's not supported by
   *     this rate limiter extension
   */
  public static @Nullable ApiRetryStrategy getRetryStrategy(String name, boolean isUtility) {
    ApiRateLimitBucket bucket = getRateLimitBucket(name, isUtility);
    return bucket == null ? null : bucketToStrategy.get(bucket);
  }
}
