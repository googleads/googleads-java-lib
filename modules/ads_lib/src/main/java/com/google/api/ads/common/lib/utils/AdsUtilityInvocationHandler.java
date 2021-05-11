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

package com.google.api.ads.common.lib.utils;

import com.google.common.reflect.AbstractInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * {@link InvocationHandler} that updates the {@link AdsUtilityRegistry} when a method call on the
 * proxied interface is annotated with {@link UsesAdsUtilities}.
 */
public class AdsUtilityInvocationHandler extends AbstractInvocationHandler {

  private final AdsUtilityRegistry adsUtilityRegistry;
  private final Object objectToProxy;

  public AdsUtilityInvocationHandler(Object objectToProxy, AdsUtilityRegistry adsUtilityRegistry) {
    this.adsUtilityRegistry = adsUtilityRegistry;
    this.objectToProxy = objectToProxy;
  }

  @Override
  public Object handleInvocation(Object proxy, Method method, Object[] args) throws Throwable {
    UsesAdsUtilities utilityAnnotation = method.getAnnotation(UsesAdsUtilities.class);
    if (utilityAnnotation != null && utilityAnnotation.value() != null) {
      for (AdsUtility utility : utilityAnnotation.value()) {
        this.adsUtilityRegistry.addUtility(utility);
      }
    }
    try {
      return method.invoke(objectToProxy, args);
    } catch (InvocationTargetException e) {
      if (e.getCause() != null) {
        throw e.getCause();
      }
      // An InvocationTargetException shouldn't have a null cause, but it's technically
      // possible since its constructors don't explicitly disallow null. In the unlikely
      // event that this happens, wrap the InvocationTargetException and throw it.
      throw new RuntimeException("Method invocation failed", e);
    }
  }
}
