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

import com.google.api.ads.adwords.lib.AdWordsPluginModule;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.common.reflect.Reflection;
import java.lang.reflect.InvocationHandler;

/** An AdWordsServices with built-in rate limit handling logic. */
public class AdWordsServicesWithRateLimiter implements AdWordsServicesInterface {
  private final AdWordsServicesInterface adWordsServices;

  public AdWordsServicesWithRateLimiter(AdWordsServicesInterface adwordsServices) {
    this.adWordsServices =
        adwordsServices.withPluginModule(
            new AdWordsPluginModule(new RateLimiterUserAgentProvider()));
  }
  
  /**
   * Gets a rate-limit-aware client for the service represented by the interface with a reference to
   * the session.
   *
   * <p>The objects returned by this method are not thread-safe.
   *
   * @param <T> the service type
   * @param session your current session
   * @param interfaceClass the service interface class. This is a class representing a SOAP service
   * @return the rate-limit-aware client for the service
   */
  @Override
  public <T> T get(AdWordsSession session, Class<T> interfaceClass) {
    T originalInterfaceObject = adWordsServices.get(session, interfaceClass);
    return getProxyObject(originalInterfaceObject, session, interfaceClass, false);
  }
  
  /**
   * Gets a rate-limit-aware instance of the utility represented by the utilityClass with a
   * reference to the session.
   *
   * <p>The objects returned by this method are not thread-safe.
   *
   * @param <T> the service type
   * @param session your current session
   * @param utilityClass the AdWords utility class
   * @return the rate-limit-aware client for the utility
   */
  @Override
  public <T> T getUtility(AdWordsSession session, Class<T> utilityClass) {
    T originalUtilityObject = adWordsServices.getUtility(session, utilityClass);
    return getProxyObject(originalUtilityObject, session, utilityClass, true);
  }

  /**
   * Decide whether this RateLimiter extension is applicable to the original service / utility
   * object. If so, wrap it in a proxy object with rate-limit-aware invocation handle; if not, just
   * return the original object.
   */
  private <T> T getProxyObject(
      T originalObject, AdWordsSession session, Class<T> cls, boolean isUtility) {
    // Find the retry strategy of this class type.
    ApiRetryStrategy retryStrategy =
        ApiRetryStrategyManager.getRetryStrategy(cls.getSimpleName(), isUtility);

    // If no corresponding retry strategy, just use the original object instead of a wrapping proxy.
    if (retryStrategy == null) {
      return originalObject;
    }

    InvocationHandler invocationHandler =
        new ApiInvocationHandlerWithRateLimiter(originalObject, session, retryStrategy);
    return Reflection.newProxy(cls, invocationHandler);
  }

  @Override
  public AdWordsServicesInterface withPluginModule(AdWordsPluginModule pluginModule) {
    throw new UnsupportedOperationException(
        "This AdWordsServices is already configured with an AdWordsPluginModule");
  }
}
