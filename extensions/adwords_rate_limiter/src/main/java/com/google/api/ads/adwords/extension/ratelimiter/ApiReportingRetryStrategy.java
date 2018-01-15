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

import com.google.api.ads.adwords.lib.utils.DetailedReportDownloadResponseException;
import com.google.common.base.Strings;
import java.net.HttpURLConnection;

/**
 * The {@link ApiRetryStrategy} implementation for report downing bucket.
 *
 * <p>To change the default configuration, set the system properties {@value
 * #MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR_PROPERTY} and {@value
 * #BACKOFF_INTERVAL_ON_RATE_EXCEEDED_ERROR_PROPERTY} <em>before</em> calling {@link #newInstance()}
 * for the first time.
 */
public final class ApiReportingRetryStrategy implements ApiRetryStrategy {
  // Property for the maximum number of attempts on rate limit error.
  public static final String MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR_PROPERTY =
      "com.google.api.ads.adwords.extension.ratelimiter.ApiReportingRetryStrategy.maxAttemptsOnRateExceededError";
  private static final int MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR_DEFAULT = 3;

  // Property for the exponential backoff interval (in milliseconds) before retrying on rate limit
  // error.
  public static final String BACKOFF_INTERVAL_ON_RATE_EXCEEDED_ERROR_PROPERTY =
      "com.google.api.ads.adwords.extension.ratelimiter.ApiReportingRetryStrategy.backoffIntervalOnRateExceededError";
  private static final int BACKOFF_INTERVAL_ON_RATE_EXCEEDED_ERROR_DEFAULT = 1000 * 5;

  // Thread-safe helper for calculating {@link ApiReportingRetryStrategy} configuration.
  private static final class ConfigCalculator {
    private static final int MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR =
        ConfigUtil.getIntConfigValue(
            MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR_PROPERTY,
            MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR_DEFAULT);

    private static final int BACKOFF_INTERVAL_ON_RATE_EXCEEDED_ERROR =
        ConfigUtil.getIntConfigValue(
            BACKOFF_INTERVAL_ON_RATE_EXCEEDED_ERROR_PROPERTY,
            BACKOFF_INTERVAL_ON_RATE_EXCEEDED_ERROR_DEFAULT);
  }
  
  // The string to check against for rate limit error.
  private static final String RATE_EXCEEDED_ERROR = "RateExceededError";

  // Number of attempts on rate limit error.
  private final int maxAttemptsOnRateExceededError;
  // Number of exponential backoff interval (in milliseconds) before retrying on rate limit error.
  private final int backoffIntervalOnRateExceededError;
  
  private ApiReportingRetryStrategy() {
    this.maxAttemptsOnRateExceededError = ConfigCalculator.MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR;
    this.backoffIntervalOnRateExceededError =
        ConfigCalculator.BACKOFF_INTERVAL_ON_RATE_EXCEEDED_ERROR;
  }

  public static ApiReportingRetryStrategy newInstance() {
    return new ApiReportingRetryStrategy();
  }

  @Override
  public boolean canDoThisAttempt(int kthAttempt) {
    return kthAttempt <= maxAttemptsOnRateExceededError;
  }

  @Override
  public boolean shouldRetryOnError(long clientCustomerId, Throwable throwable) {
    // Do not care about clientCustomerId, just check RateExceededError.
    // By default it can retry (e.g., ReportException, ReportDownloadResponseException).
    boolean canRetry = true;

    if (throwable instanceof DetailedReportDownloadResponseException) {
      DetailedReportDownloadResponseException ex =
          (DetailedReportDownloadResponseException) throwable;
      int httpStatus = ex.getHttpStatus();
      String errorText = ex.getErrorText();

      // Rate limit error has httpStatus 400 and errorText containing "RateExceededError".
      boolean isRateLimitError =
          httpStatus == HttpURLConnection.HTTP_BAD_REQUEST
              && Strings.nullToEmpty(errorText).contains(RATE_EXCEEDED_ERROR);

      // Retry iff it's rate limit error.
      canRetry = isRateLimitError;
    }

    return canRetry;
  }

  @Override
  public long calcWaitTimeBeforeCall(long clientCustomerId, int kthAttempt, Throwable throwable) {
    // Do not care about clientCustomerId and throwable, just do exponential backoff.
    return kthAttempt == 1
        ? 0
        : (long) Math.scalb(backoffIntervalOnRateExceededError, kthAttempt - 1);
  }
}
