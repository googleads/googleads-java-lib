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

import java.lang.reflect.InvocationTargetException;

/**
 * Utility class for analyzing rate limit errors through reflection.
 */
public class ReflectionUtil {
  /**
   * Check whether an object is an instance of a specified class.
   *
   * @param obj the object to check
   * @param classSimpleName the simple name of the specified class.
   * @return true if the object is an instance of the specified class
   */
  public static boolean isInstanceOf(Object obj, String classSimpleName) {
    if (obj == null) {
      return false;
    }
    
    Class<?> currentClass = obj.getClass();
    while (currentClass != Object.class) {
      if (currentClass.getSimpleName().equals(classSimpleName)) {
        return true;
      } else {
        currentClass = currentClass.getSuperclass();
      }
    }
    return false;
  }
  
  /**
   * Invoke the specified method (with no argument) on the object.
   *
   * @param obj the object to call.
   * @param methodName the name of the method (with no argument)
   * @return the returned object from the invocation.
   * @throws RateLimiterException that wraps any exception during reflection
   */
  public static Object invokeNoArgMethod(Object obj, String methodName) {
    try {
      return obj.getClass().getMethod(methodName).invoke(obj);
    } catch (NoSuchMethodException
        | SecurityException
        | IllegalAccessException
        | IllegalArgumentException e) {
      throw new RateLimiterReflectionException(
          "Failed to reflect method \"" + methodName + "\" on object: " + obj, e);
    } catch (InvocationTargetException e) {
      throw new RateLimiterException(
          "Failed to invoke method \"" + methodName + "\" on object: " + obj, e);
    }
  }
}
