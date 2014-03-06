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

import java.io.InputStream;

import javax.annotation.Nullable;

/**
 * Holder class for http status and response body. If the request was
 * successful, the inputstream contains the response, otherwise the
 * httpResponseMessage will have the error.
 *
 * @author Kevin Winter
 */
public class ReportDownloadResponse {

  private final int httpStatus;
  private final String httpResponseMessage;
  private InputStream inputStream;

  public ReportDownloadResponse(
      int httpStatus, String httpResponseMessage, InputStream inputStream) {
    this.httpStatus = httpStatus;
    this.httpResponseMessage = httpResponseMessage;
    this.inputStream = inputStream;
  }

  public int getHttpStatus() {
    return httpStatus;
  }

  @Nullable
  public String getHttpResponseMessage() {
    return httpResponseMessage;
  }

  @Nullable
  public InputStream getInputStream() {
    return inputStream;
  }
}
