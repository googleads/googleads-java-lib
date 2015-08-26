// Copyright 2010, Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.exception;

/**
 * Exception for validation errors.
 */
public class ValidationException extends Exception {

  private String trigger;

  /**
   * Constructor.
   *
   * @param message the exception message
   * @param trigger the trigger of the validation exception
   */
  public ValidationException(String message, String trigger) {
    this(message, trigger, null);
  }

  /**
   * Constructor.
   *
   * @param message the exception message
   * @param trigger the trigger of the validation exception
   * @param cause the exception that caused this ValidationException
   */
  public ValidationException(String message, String trigger, Throwable cause) {
    super(message, cause);
    this.trigger = trigger;
  }

  public String getTrigger() {
    return trigger;
  }

  @Override
  public String toString() {
    return getMessage() + " caused by: [" + trigger + "]";
  }
}
