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

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.reflect.AbstractInvocationHandler;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * {@link InvocationHandler} that automatically waits and retries on rate limit error.
 */
public class ApiInvocationHandlerWithRateLimiter extends AbstractInvocationHandler {
  private final Object objectToProxy;
  private final AdWordsSession session;
  private final ApiRateLimiter rateLimiter;
  
  public ApiInvocationHandlerWithRateLimiter(
      Object objectToProxy, AdWordsSession session, ApiRetryStrategy retryStrategy) {
    this.objectToProxy =
        Preconditions.checkNotNull(objectToProxy, "The argument 'objectToProxy' cannot be null!");
    this.session = Preconditions.checkNotNull(session, "The argument 'session' cannot be null!");
    
    Preconditions.checkNotNull(retryStrategy, "The argument 'retryStrategy' cannot be null!");
    this.rateLimiter = new ApiRateLimiter(retryStrategy);
  }
  
  @Override
  public Object handleInvocation(Object proxy, Method method, Object[] args) throws Throwable {
    Long clientCustomerId = AdWordsSessionUtil.getClientCustomerId(session);
    return rateLimiter.run(clientCustomerId, objectToProxy, method, args);
  }
  
  @VisibleForTesting
  protected AdWordsSession getAdWordsSession() {
    return session;
  }
}
