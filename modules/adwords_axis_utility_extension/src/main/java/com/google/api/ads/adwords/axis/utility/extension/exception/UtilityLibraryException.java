//Copyright 2012 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.axis.utility.extension.exception;

import com.google.api.ads.adwords.axis.v201309.cm.ApiException;
import com.google.common.base.Throwables;

import org.apache.commons.lang.exception.ExceptionUtils;

import java.rmi.RemoteException;

/**
 * Exception class for Utility library errors.
 *
 * @author Julian Toledo
 */
public final class UtilityLibraryException extends RuntimeException {

  private static final long serialVersionUID = -4266064741447695525L;

  /**
   * Default Constructor.
   */
  public UtilityLibraryException() {
    super();
  }

  /**
   * Constructs a new exception with the specified detail message and cause.
   * 
   * @param message the detail message.
   */
  public UtilityLibraryException(String message) {
    super(message);
  }

  /**
   * Constructs a new exception with the specified detail message.
   * 
   * @param message the detail message.
   * @param cause the cause
   */
  public UtilityLibraryException(String message, Throwable cause) {
    super(message + ": " + ExceptionUtils.getRootCauseMessage(cause),
        ExceptionUtils.getRootCause(cause));
  }

  /**
   * Constructs a new exception with the specified cause.
   * 
   * @param cause the cause
   */
  public UtilityLibraryException(Throwable cause) {
    super(cause);
  }

  /**
   * Unwraps ApiException and RemoteException exceptions
   *
   * @param exception the {@code Exception} to unwrap
   * @param message custom message to include in the UtilityLibraryException
   * @throws RemoteException for communication-related exceptions
   */
  public static void throwUnwrapApiExceptions(Exception exception, String message)
      throws RemoteException {
    Throwable throwable = Throwables.getRootCause(exception);
    if (throwable.getClass().isAssignableFrom(ApiException.class)) {
      throw (ApiException) throwable;
    }
    if (throwable.getClass().isAssignableFrom(RemoteException.class)) {
      throw (RemoteException) throwable;
    }
    throw new UtilityLibraryException(message, exception);
  }

  /**
   * Unwraps ApiException and RemoteException exceptions
   *
   * @param exception the {@code Exception} to unwrap
   * @param message custom message to include in the UtilityLibraryException
   * @return the unwrapped RemoteException
   */
  public static RemoteException getUnwrapApiExceptions(Exception exception, String message) {
    Throwable throwable = Throwables.getRootCause(exception);

    if (throwable.getClass().isAssignableFrom(ApiException.class)
        && !throwable.getClass().equals(RemoteException.class)) {
      return (ApiException) throwable;
    }
    if (throwable.getClass().isAssignableFrom(RemoteException.class)) {
      return (RemoteException) throwable;
    }
    return new RemoteException(message + " " + throwable.getMessage(), throwable);
  }
}