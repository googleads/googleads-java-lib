// Copyright 2011, Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils;

/**
 * Exception thrown while downloading a report and was a transport-layer problem
 * with the request. Usually can be retried.
 *
 * @author Adam Rogal
 */
public class ReportException extends Exception {

  /**
   * Constructor.
   *
   * @param message the exception message
   * @param cause the exception cause
   */
  public ReportException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Constructor.
   *
   * @param message the exception message
   */
  public ReportException(String message) {
    super(message);
  }
}
