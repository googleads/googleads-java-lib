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
 * Exception thrown while fetching a report response or downloading a report.
 * Usually, this exception is not recoverable, but the {@code cause} can be
 * checked if needed.
 *
 * @author Adam Rogal
 */
public class ReportFailureException extends Exception {

  /**
   * Constructor.
   *
   * @param message the exception message
   * @param cause the exception cause
   */
  public ReportFailureException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Constructor.
   *
   * @param message the exception message
   */
  public ReportFailureException(String message) {
    super(message);
  }
}
