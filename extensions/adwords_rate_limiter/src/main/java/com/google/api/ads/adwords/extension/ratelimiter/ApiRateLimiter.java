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
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/**
 * A rate limiter implementation that handles RateExceededError for AdWords API applications.
 */
public final class ApiRateLimiter {
  private final ApiRetryStrategy retryStrategy;

  public ApiRateLimiter(ApiRetryStrategy retryStrategy) {
    this.retryStrategy =
        Preconditions.checkNotNull(retryStrategy, "The argument 'retryStrategy' cannot be null!");
  }

  /**
   * The core method for invoking AdWords API call and handling RateExceededError.
   *
   * <p>To align with AdWords API services, it also throws ApiException and RemoteException.
   *
   * @param clientCustomerId the client customer ID for invoking the call
   * @param obj the object being invoked in AdWords API call
   * @param method the AdWords API call to invoke
   * @param args the arguments used for the AdWords API call
   * @throws Throwable the encountered error
   * @return the result of running the AdWords API call
   */
  public Object run(
      long clientCustomerId, final Object obj, final Method method, final Object[] args)
      throws Throwable {
    Callable<Object> callable =
        new Callable<Object>() {
          @Override
          public Object call() throws Exception {
            return method.invoke(obj, args);
          }
        };
    String actionDescription = method.getClass().getSimpleName() + "." + method.getName();
    ApiRetryHelper<Object> retryHelper =
        new ApiRetryHelper<Object>(clientCustomerId, callable, actionDescription, retryStrategy);

    try {
      return retryHelper.callWithRetries();
    } catch (ApiInvocationException e) {
      throw e.getCause();
    }
  }
}
