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
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
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
  @VisibleForTesting public static final int MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR_DEFAULT = 5;

  // Property for the maximum wait time (in seconds) before retrying on rate limit error.
  public static final String MAX_WAIT_TIME_ON_RATE_EXCEEDED_ERROR_PROPERTY =
      "com.google.api.ads.adwords.extension.ratelimiter.ApiServicesRetryStrategy.maxWaitTimeOnRateExceededError";
  @VisibleForTesting public static final int MAX_WAIT_TIME_ON_RATE_EXCEEDED_ERROR_DEFAULT = 86400;

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
  private final ConcurrentMap<Long, AtomicLong> accountWaitUntil;

  private final DateProvider dateProvider;
  private final RandomProvider waitTimeNoiseFactor;

  public ApiServicesRetryStrategy() {
    this(
        new DefaultDateProvider(),
        new DefaultRandomProvider(),
        ConfigUtil.getIntConfigValue(
            MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR_PROPERTY,
            MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR_DEFAULT),
        ConfigUtil.getIntConfigValue(
            MAX_WAIT_TIME_ON_RATE_EXCEEDED_ERROR_PROPERTY,
            MAX_WAIT_TIME_ON_RATE_EXCEEDED_ERROR_DEFAULT));
  }

  @VisibleForTesting
  public ApiServicesRetryStrategy(
      DateProvider dateProvider,
      RandomProvider waitTimeNoiseFactor,
      int maxAttemptsOnRateExceededError,
      int maxWaitTimeOnRateExceededError) {
    this.dateProvider = dateProvider;
    this.waitTimeNoiseFactor = waitTimeNoiseFactor;
    this.maxAttemptsOnRateExceededError = maxAttemptsOnRateExceededError;
    this.maxWaitTimeOnRateExceededError = maxWaitTimeOnRateExceededError;

    this.tokenWaitUntil = new AtomicLong();
    this.accountWaitUntil = new ConcurrentHashMap<>();
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

    boolean done;
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
    final long minWaitTime = millisFromNow(waitForMillis);

    // Here we are assuming that the AtomicLong reference isn't changed once inserted. Therefore,
    // the content of this map grows with the number of account rate limits encountered. Future work
    // may address the problem of flushing this to reduce overall memory pressure.
    //
    // Overhead of AtomicLong is ~ size(long) 64 bytes,
    // if managing 100k customers this implies a total memory pressure of ~ 100000 * 64 = 6MB.
    //
    // Overhead of managing the map is 2 * 100k * (size(key) + size(reference)) = 24MB,
    // multiplying by factor of 2 to compensate for a map with 50% max load.
    //
    // An additional 36MB of RAM is a reasonable trade-off to simplify this implementation.

    AtomicLong recordedWaitTime =
        accountWaitUntil.computeIfAbsent(clientCustomerId, k -> new AtomicLong(minWaitTime));

    // This update algorithm will eventually terminate, but possibly not on the first iteration due
    // to concurrent updates. A better solution would be to use
    // AtomicLongMap.accumulateAndGet(K, long, LongBinaryOperator) from Guava 21.0, however this
    // would require bumping the Guava version for all Google Ads Java libraries and their
    // dependents.
    long snapshotTime = recordedWaitTime.get();
    while (snapshotTime < minWaitTime) {
      if (recordedWaitTime.compareAndSet(snapshotTime, minWaitTime)) {
        break;
      } else {
        snapshotTime = recordedWaitTime.get();
      }
    }
  }

  /** Calculate the wait time (in millis) before next AdWords API call is allowed. */
  private long calcWaitTime(long clientCustomerId, @Nullable Throwable throwable) {
    long nowInMillis = dateProvider.getNowInMillis();

    long waitForMillis = 0L;
    waitForMillis = Math.max(waitForMillis, tokenWaitUntil.get() - nowInMillis);
    waitForMillis = Math.max(waitForMillis, getAccountWaitTime(clientCustomerId) - nowInMillis);

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
    if (ReflectionUtil.isInstanceOf(throwable, "ApiException")) {
      try {
        Object[] errors = (Object[]) ReflectionUtil.invokeNoArgMethod(throwable, "getErrors");
        if (errors == null) {
          return false;
        }
        for (Object error : errors) {
          if (ReflectionUtil.isInstanceOf(error, "RateExceededError")) {
            String rateScope = (String) ReflectionUtil.invokeNoArgMethod(error, "getRateScope");
            Integer retryAfterSeconds =
                (Integer) ReflectionUtil.invokeNoArgMethod(error, "getRetryAfterSeconds");
            logger.info(
                "Encountered RateExceededError: scope={}, seconds={}.",
                rateScope,
                retryAfterSeconds);
            if (retryAfterSeconds == null) {
              logger.warn("Unexpected rate exceeed error, missing retryAfterSeconds");
            } else if (retryAfterSeconds != null) {
              long waitForMillis = getWaitUntilMillis(retryAfterSeconds.intValue());
              if ("DEVELOPER".equals(rateScope)) {
                updateTokenWaitTime(waitForMillis);
                return true;
              } else if ("ACCOUNT".equals(rateScope)) {
                updateAccountWaitTime(clientCustomerId, waitForMillis);
                return true;
              } else {
                logger.warn("Unknown RateExceededError scope: " + rateScope, throwable);
              }
            }
          }
        }
      } catch (RateLimiterReflectionException e) {
        // Failed during reflection analysis, just log and proceed.
        logger.error("Encountered error during analysis using reflection.", e);
      }
    }
    return false;
  }

  /**
   * Decides the actual wait time in milliseconds, by applying a random multiplier to
   * retryAfterSeconds.
   */
  private long getWaitUntilMillis(int retryAfterSeconds) {
    double multiplier = waitTimeNoiseFactor.get().nextDouble();
    multiplier =
        multiplier * (MAX_WAIT_TIME_MULTIPLIER - MIN_WAIT_TIME_MULTIPLIER)
            + MIN_WAIT_TIME_MULTIPLIER;
    double result = SECONDS.toMillis(retryAfterSeconds) * multiplier;
    return (long) result;
  }

  @VisibleForTesting
  long getAccountWaitTime(long account) {
    AtomicLong waitTime = accountWaitUntil.get(account);
    return waitTime == null ? 0L : waitTime.get();
  }

  @VisibleForTesting
  long getDeveloperWaitTime() {
    return tokenWaitUntil.get();
  }

  private long millisFromNow(long millis) {
    return dateProvider.getNowInMillis() + millis;
  }

  /**
   * Primarily to support testing, allow abstraction of wait time calculations and provision of
   * current system time.
   */
  @VisibleForTesting
  public interface DateProvider {

    /**
     * Return the number of milliseconds in local timezone since the UNIX epoch.
     *
     * @return the current time in milliseconds since epoch.
     */
    long getNowInMillis();
  }

  /**
   * Primarily to support testing, allow injecting different RNG to make the wait times more
   * predictable.
   */
  @VisibleForTesting
  public interface RandomProvider {

    /**
     * Provides an instance of Random.
     *
     * @return the random number generator.
     */
    Random get();
  }

  private static class DefaultDateProvider implements DateProvider {

    @Override
    public long getNowInMillis() {
      return DateTime.now().getMillis();
    }
  }

  private static class DefaultRandomProvider implements RandomProvider {

    @Override
    public Random get() {
      return ThreadLocalRandom.current();
    }
  }
}
