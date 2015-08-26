// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.dfa.axis.utils;

import com.google.api.ads.dfa.lib.auth.TokenExpirationDetector;
import com.google.common.annotations.VisibleForTesting;

import org.apache.axis.AxisFault;

import java.lang.reflect.InvocationTargetException;

import javax.annotation.Nullable;

/**
 * Utility which detects Apache Axis exceptions returned from the DFA API due to expired DFA
 * tokens.
 */
public class DfaAxisTokenExpirationDetector implements TokenExpirationDetector {

  @VisibleForTesting
  protected static final long TOKEN_EXPIRED_CODE = 4;
  @VisibleForTesting
  protected static final String TOKEN_EXPIRED_MESSAGE = "Authentication token has expired.";

  /**
   * Determines if the given exception is an error from DFA signifying an expired DFA token.
   *
   * @param exception An exception returned from the DFA API. In the event the API did not return
   *     an exception, this will be {@code null}
   * @return true if the given exception signifies an expired DFA token, false otherwise
   */
  @Override
  public boolean isTokenExpiredException(@Nullable Throwable exception) {
    if (exception instanceof AxisFault) {
      Object errorCode;
      Object errorMessage;
      try {
        errorCode = exception.getClass().getMethod("getErrorCode").invoke(exception);
        errorMessage = exception.getClass().getMethod("getErrorMessage").invoke(exception);
      } catch (IllegalArgumentException e) {
        return false;
      } catch (SecurityException e) {
        return false;
      } catch (IllegalAccessException e) {
        return false;
      } catch (InvocationTargetException e) {
        return false;
      } catch (NoSuchMethodException e) {
        return false;
      }
      return errorCode.equals(TOKEN_EXPIRED_CODE) && errorMessage.equals(TOKEN_EXPIRED_MESSAGE);
    }
    return false;
  }
}
