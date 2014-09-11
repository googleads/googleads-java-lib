// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.axis.utility.extension.util;

import com.google.api.ads.adwords.axis.utility.extension.exception.UtilityLibraryException;
import com.google.api.ads.adwords.axis.v201406.cm.ApiError;
import com.google.api.ads.adwords.axis.v201406.cm.ApiException;
import com.google.api.ads.adwords.axis.v201406.cm.InternalApiError;
import com.google.api.ads.adwords.axis.v201406.cm.RateExceededError;
import com.google.common.collect.Maps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.SocketException;
import java.rmi.RemoteException;
import java.util.HashMap;

/**
 * Reflection utilities class.
 *
 * @author Julian Toledo
 */
public class ReflectionUtil {

  static Logger log = LoggerFactory.getLogger(ReflectionUtil.class);

  // Hash for storing Class.getMethod results to improve performance
  private static HashMap<String, Method> methodsCache = Maps.newHashMap();

  /**
   * A reflection Invoke method with Retries for SocketException, InternalApiError
   * and RateExceededError with getRetryAfterSeconds sleep.
   *
   * @param methodName
   * @param obj the object the underlying method is invoked from
   * @param objClass the class of the object the underlying method is invoked from
   * @param invokeMaxCount number of maximum calls
   * @return Object, result from reflexion call
   * @throws RemoteException for communication-related exceptions
   */
  public static Object invokeCount(String methodName, Object obj, Class<?> objClass,
      int invokeMaxCount) throws RemoteException {
    return invokeCount(methodName, obj, objClass, null, null, invokeMaxCount);
  }

  /**
   * A reflection Invoke method with Retries for SocketException, InternalApiError
   * and RateExceededError with getRetryAfterSeconds sleep.
   *
   * @param methodName
   * @param obj the object the underlying method is invoked from
   * @param objClass the class of the object the underlying method is invoked from
   * @param args the arguments used for the method call
   * @param invokeMaxCount number of maximum calls
   * @return Object, result from reflexion call
   * @throws RemoteException for communication-related exceptions
   */
  public static Object invokeCount(String methodName, Object obj,  Class<?> objClass, Object args,
      int invokeMaxCount) throws RemoteException {
    return invokeCount(methodName, obj, objClass, args, args.getClass(), invokeMaxCount);
  }

  /**
   * A reflection Invoke method with Retries for SocketException, InternalApiError
   * and RateExceededError with getRetryAfterSeconds sleep.
   *
   * @param methodName
   * @param obj the object the underlying method is invoked from
   * @param objClass the class of the object the underlying method is invoked from
   * @param args the arguments used for the method call
   * @param argsClass the arguments Class used for the method call
   * @param invokeMaxCount the max number of calls
   * @return Object, result from reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public static Object invokeCount(String methodName, Object obj, Class<?> objClass,
      Object args, Class<?> argsClass, int invokeMaxCount) throws RemoteException {
    Method method;

    String className;
    // obj is null for Static methods
    if (obj == null) {
      className = objClass.getCanonicalName();
    } else {
      className = obj.getClass().getCanonicalName();
    }

    if (objClass != null) {
      className = objClass.getCanonicalName();
    } else {
      objClass = obj.getClass();
    }

    RemoteException remoteException = new RemoteException(
        "Error during reflection for " + className + "." + methodName);

    int invokeCount = 0;
    Boolean retry = true;
    while (retry && invokeCount < invokeMaxCount) {
      retry = false;
      invokeCount++;

      try {
        if (args != null) {
          // Searches the Hash for cached Methods using Class name, method name and args
          if (methodsCache.containsKey(
              className + methodName + argsClass.getCanonicalName())) {
            method = methodsCache.get(
                className + methodName + argsClass.getCanonicalName());
          } else {
            method = objClass.getMethod(methodName, argsClass);
            methodsCache.put(
                objClass.getCanonicalName() + methodName + argsClass.getCanonicalName(),
                method);
          }
          return method.invoke(obj, args);
        } else {
          // Searches the Hash for cached Methods using Class name, method name and args
          if (methodsCache.containsKey(obj.getClass().getCanonicalName() + methodName)) {
            method = methodsCache.get(obj.getClass().getCanonicalName() + methodName);
          } else {
            method = obj.getClass().getMethod(methodName);
            methodsCache.put(obj.getClass().getCanonicalName() + methodName, method);
          }
          return method.invoke(obj);
        }
      } catch (Exception e) {
        remoteException = UtilityLibraryException.getUnwrapApiExceptions(
            e, "Error during reflection for " + className + "." + methodName);

        Throwable cause = remoteException.getCause();

        if (cause != null
            && (cause.getClass().isAssignableFrom(SocketException.class)
              || cause.getClass().isAssignableFrom(InterruptedIOException.class)
              || cause.getClass().isAssignableFrom(ConnectException.class))) {

          // Retrying if SocketException/InterruptedIOException/ConnectException
          retry = true;

          log.warn("SocketException error, retrying last operation: "
              + className + "." + methodName
              + " (" + invokeCount  + "/" + invokeMaxCount + ")");

        } else if (remoteException.getClass().equals(ApiException.class)) {
          ApiException apiException = (ApiException) remoteException;
          ApiError[] errorArray = apiException.getErrors();
          for (ApiError apiError : errorArray) {
            if (apiError instanceof RateExceededError) {
              // Retrying if RateExceededError
              retry = true;
              try {
                int seconds = ((RateExceededError) apiError).getRetryAfterSeconds();

                log.warn("RateExceededError error, retrying last operation: "
                    + className + "." + methodName
                    + " (" + invokeCount + "/" + invokeMaxCount + ")"
                    + " waiting seconds: " + seconds);

                // wait the amount of secconds the server asked
                Thread.sleep(seconds * 1000);
              } catch (InterruptedException interruptedException) {
                throw remoteException;
              }
            }
            if (apiError instanceof InternalApiError) {
              // Retrying if InternalApiError
              retry = true;

              log.warn("InternalApiError error, retrying last operation: "
                  + className + "." + methodName
                  + " (" + invokeCount + "/" + invokeMaxCount + ")");
            }
          }
        }
      }
    }
    throw remoteException;
  }
}
