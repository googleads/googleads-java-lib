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

import com.google.common.base.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utility class for retrying operations.
 *
 * <p>It supports two custom handlers: {@code ExceptionChecker} and {@code WaitStrategy<V>}
 * that will be used to determine whether the operation's exception retriable, and calculate the
 * wait time before retry.
 *
 * @param <V> return value of the closure that is being run with retires.
 */
public class ApiRetryHelper<V> {
  private static final Logger logger = LoggerFactory.getLogger(ApiRetryHelper.class);

  private final long clientCustomerId;
  private final Callable<V> callable;
  private final String actionDescription; // Short description of the action.
  private final ApiRetryStrategy retryStrategy;

  public ApiRetryHelper(
      long clientCustomerId,
      Callable<V> callable,
      String actionDescription,
      ApiRetryStrategy retryStrategy) {
    this.clientCustomerId = clientCustomerId;
    
    this.callable = Preconditions.checkNotNull(callable, "Argument 'callable' cannot be null.");
    this.actionDescription =
        Preconditions.checkNotNull(
            actionDescription, "Argument 'actionDescription' cannot be null.");
    this.retryStrategy =
        Preconditions.checkNotNull(retryStrategy, "Argument 'retryStrategy' cannot be null.");
  }
  
  /**
   * Invoke the AdWords API call with retry logic.
   *
   * @throws ApiInvocationException the exception during AdWords API invocation
   * @return the returned result of the callable other than AlertProcessingException occurs, the
   *     thread is interrupted during waiting, or all retries are exhausted.
   */
  public V callWithRetries() throws ApiInvocationException {
    V result = null;
    Throwable lastError = null;
    
    for (int kthAttempt = 1; retryStrategy.canDoThisAttempt(kthAttempt); ++kthAttempt) {
      // Wait if the previous attempt failed.
      long waitForMillis =
          retryStrategy.calcWaitTimeBeforeCall(clientCustomerId, kthAttempt, lastError);
      if (waitForMillis > 0) {
        logger.info(
            "Thread \"{}\" is sleeping for {} millis.",
            Thread.currentThread().getName(),
            waitForMillis);
        try {
          Thread.sleep(waitForMillis);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
          throw new ApiInvocationException(
              "InterruptedException occurs while waiting to " + actionDescription, e.getCause());
        }
      }
      
      try {
        lastError = null;
        result = callable.call();
        break;
      } catch (IllegalAccessException e) {
        throw new RateLimiterException("Illegal access to invoke: " + actionDescription, e);
      } catch (InvocationTargetException e) {
        lastError = e.getCause();
      } catch (Exception e) {
        lastError = e;
      }
      
      // Check whether the error is retriable
      if (retryStrategy.shouldRetryOnError(clientCustomerId, lastError)) {
        logger.error(
            "Failed to call {} at exception check, attempt #{}.", actionDescription, kthAttempt);
      } else {
        logger.error(
            "Failed to call {} at exception check: encountered non-retriable {}, skip retry!",
            actionDescription,
            lastError.getClass().getName());
        throw new ApiInvocationException("Encountered non-retriable exception.", lastError);
      }
    }

    if (result == null) {
      String msg = "Failed to " + actionDescription + " after all retries.";
      logger.error(msg, lastError);
      throw new ApiInvocationException(msg, lastError);
    }

    return result;
  }
}
