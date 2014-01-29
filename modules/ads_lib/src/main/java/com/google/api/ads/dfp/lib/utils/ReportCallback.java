// Copyright 2010 Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfp.lib.utils;

/**
 * {@code ReportCallback} is called on the completion of asynchronous report
 * downloads. It is either called with {@code ReportCallback#onSuccess} or with
 * {@code ReportCallback#onError(Exception))} if there was an exception.
 *
 * @author Adam Rogal
 */
public interface ReportCallback {
  /**
   * Called when the asynchronous call has completed successfully.
   */
  public void onSuccess();

  /**
   * Called when there has been a failure due to server-side processing.
   */
  public void onFailure();

  /**
   * Called when the wait thread is interrupted.
   */
  public void onInterruption();

  /**
   * Called when there was an exception preventing the completion of the
   * asynchronous request.
   *
   * @param e the exception representing the cause of failure
   */
  public void onException(Exception e);
}
