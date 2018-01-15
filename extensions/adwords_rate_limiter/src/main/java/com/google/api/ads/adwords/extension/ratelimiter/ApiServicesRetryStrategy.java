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

import static java.util.concurrent.TimeUnit.SECONDS;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.util.concurrent.AtomicLongMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The {@link ApiRetryStrategy} implementation for AdWords API services (excluding reporting).
 *
 * <p>To change the default configuration, set the system properties {@value
 * #MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR_PROPERTY} and {@value
 * #MAX_WAIT_TIME_ON_RATE_EXCEEDED_ERROR_PROPERTY} <em>before</em> calling {@link #newInstance()}
 * for the first time.
 */
public final class ApiServicesRetryStrategy implements ApiRetryStrategy {
  private static final Logger logger = LoggerFactory.getLogger(ApiServicesRetryStrategy.class);

  // Property for the maximum number of attempts on rate limit error.
  public static final String MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR_PROPERTY =
      "com.google.api.ads.adwords.extension.ratelimiter.ApiServicesRetryStrategy.maxAttemptsOnRateExceededError";
  private static final int MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR_DEFAULT = 5;

  // Property for the maximum wait time (in seconds) before retrying on rate limit error.
  public static final String MAX_WAIT_TIME_ON_RATE_EXCEEDED_ERROR_PROPERTY =
      "com.google.api.ads.adwords.extension.ratelimiter.ApiServicesRetryStrategy.maxWaitTimeOnRateExceededError";
  private static final int MAX_WAIT_TIME_ON_RATE_EXCEEDED_ERROR_DEFAULT = 86400;

  // Thread-safe helper for calculating {@link ApiServicesRetryStrategy} configuration.
  private static final class ConfigCalculator {
    private static final int MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR =
        ConfigUtil.getIntConfigValue(
            MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR_PROPERTY,
            MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR_DEFAULT);

    private static final int MAX_WAIT_TIME_ON_RATE_EXCEEDED_ERROR =
        ConfigUtil.getIntConfigValue(
            MAX_WAIT_TIME_ON_RATE_EXCEEDED_ERROR_PROPERTY,
            MAX_WAIT_TIME_ON_RATE_EXCEEDED_ERROR_DEFAULT);
  }

  // The min/max range of random multiplier for waiting time before retry.
  @VisibleForTesting static final int MIN_WAIT_TIME_MULTIPLIER = 1;
  @VisibleForTesting static final int MAX_WAIT_TIME_MULTIPLIER = 2;

  // Number of attempts on rate limit error, 0 means infinite attempts.
  private final int maxAttemptsOnRateExceededError;
  // Maximum wait time (in seconds) before retrying rate limit error, 0 means always wait.
  // If the calculated wait time exceeds this value, it will immediately stop retry.
  private final int maxWaitTimeOnRateExceededError;

  // Wait until time (in millis of DateTime) for token scope.
  private final AtomicLong tokenWaitUntil;
  // Wait until time (in millis of DateTime) for account scope.
  private final AtomicLongMap<Long> accountWaitUntil;

  private ApiServicesRetryStrategy() {
    this.maxAttemptsOnRateExceededError = ConfigCalculator.MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR;
    this.maxWaitTimeOnRateExceededError = ConfigCalculator.MAX_WAIT_TIME_ON_RATE_EXCEEDED_ERROR;

    this.tokenWaitUntil = new AtomicLong();
    this.accountWaitUntil = AtomicLongMap.create();
  }

  public static ApiServicesRetryStrategy newInstance() {
    return new ApiServicesRetryStrategy();
  }

  @Override
  public boolean canDoThisAttempt(int kthAttempt) {
    return (maxAttemptsOnRateExceededError == 0 || kthAttempt <= maxAttemptsOnRateExceededError);
  }

  @Override
  public boolean shouldRetryOnError(long clientCustomerId, Throwable throwable) {
    // Retry on RateExceededError within the invocation.
    return checkRateExceededErrorAndUpdateWaitTime(clientCustomerId, throwable);
  }

  @Override
  public long calcWaitTimeBeforeCall(long clientCustomerId, int kthAttempt, Throwable throwable) {
    // Do not care about kthAttempt, just check when it can make next AdWords API call.
    return calcWaitTime(clientCustomerId, throwable);
  }

  /**
   * Update the wait time for TOKEN scope.
   *
   * @param waitForMillis the wait time in milliseconds
   */
  private void updateTokenWaitTime(long waitForMillis) {
    final long newTime = millisFromNow(waitForMillis);

    boolean done = true;
    do {
      long oldTime = tokenWaitUntil.get();
      // If the new wait until time exceeds current one, update it; otherwise just skip the loop.
      if (oldTime < newTime) {
        done = tokenWaitUntil.compareAndSet(oldTime, newTime);
      } else {
        done = true;
      }
    } while (!done);
  }

  /**
   * Update the wait time for ACCOUNT scope.
   *
   * @param clientCustomerId the client customer ID
   * @param waitForMillis the wait time in milliseconds
   */
  private void updateAccountWaitTime(long clientCustomerId, long waitForMillis) {
    final long newTime = millisFromNow(waitForMillis);

    boolean done = true;
    do {
      long oldTime = accountWaitUntil.get(clientCustomerId);
      // If the new wait until time exceeds current one, update it; otherwise
      // just skip the loop.
      if (oldTime < newTime) {
        done = (oldTime == accountWaitUntil.getAndAdd(clientCustomerId, newTime - oldTime));
      } else {
        done = true;
      }
    } while (!done);
  }

  /** Calculate the wait time (in millis) before next AdWords API call is allowed. */
  private long calcWaitTime(long clientCustomerId, @Nullable Throwable throwable) {
    long nowInMillis = nowInMillis();

    long waitForMillis = 0L;
    waitForMillis = Math.max(waitForMillis, tokenWaitUntil.get() - nowInMillis);
    waitForMillis = Math.max(waitForMillis, accountWaitUntil.get(clientCustomerId) - nowInMillis);

    if (waitForMillis > 0
        && maxWaitTimeOnRateExceededError > 0
        && waitForMillis > SECONDS.toMillis(maxWaitTimeOnRateExceededError)) {
      throw new RateLimiterException(
          "Need to wait too long (more than " + maxWaitTimeOnRateExceededError + " seconds).",
          throwable);
    }

    return waitForMillis;
  }

  /** Check whether the invocation causes RateExceededError, and update wait time accordingly. */
  private boolean checkRateExceededErrorAndUpdateWaitTime(
      long clientCustomerId, Throwable throwable) {
    boolean hasRateExceededError = false;

    if (ReflectionUtil.isInstanceOf(throwable, "ApiException")) {
      try {
        Object[] errors = (Object[]) ReflectionUtil.invokeNoArgMethod(throwable, "getErrors");
        for (Object error : errors) {
          if (ReflectionUtil.isInstanceOf(error, "RateExceededError")) {
            String rateScope = (String) ReflectionUtil.invokeNoArgMethod(error, "getRateScope");
            Integer retryAfterSeconds =
                (Integer) ReflectionUtil.invokeNoArgMethod(error, "getRetryAfterSeconds");
            logger.info(
                "Encountered RateExceededError: scope={}, seconds={}.",
                rateScope,
                retryAfterSeconds);

            if (retryAfterSeconds != null) {
              long waitForMillis = getActualWaitTime(retryAfterSeconds.intValue());

              if ("DEVELOPER".equals(rateScope)) {
                updateTokenWaitTime(waitForMillis);
              } else if ("ACCOUNT".equals(rateScope)) {
                updateAccountWaitTime(clientCustomerId, waitForMillis);
              } else {
                // Should not happen.
                throw new AssertionError(
                    "Unknown RateExceededError scope: " + rateScope, throwable);
              }
            }

            // Found an RateExceededError, skip the rest in error list.
            hasRateExceededError = true;
            break;
          }
        }
      } catch (RateLimiterReflectionException e) {
        // Failed during reflection analysis, just log and proceed.
        logger.error("Encountered error during analysis using reflection.", e);
      }
    }

    return hasRateExceededError;
  }

  private static long nowInMillis() {
    return DateTime.now().getMillis();
  }

  private static long millisFromNow(long millis) {
    return nowInMillis() + millis;
  }

  /**
   * Decides the actual wait time in milliseconds, by applying a random multiplier to
   * retryAfterSeconds.
   */
  private static long getActualWaitTime(int retryAfterSeconds) {
    double multiplier =
        ThreadLocalRandom.current().nextDouble(MIN_WAIT_TIME_MULTIPLIER, MAX_WAIT_TIME_MULTIPLIER);
    double result = SECONDS.toMillis(retryAfterSeconds) * multiplier;
    return (long) result;
  }
}
