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

/**
 * Holder class for http status and response body.
 *
 * @author Kevin Winter
 */
public class RawReportDownloadResponse {

  private final int httpStatus;
  private final InputStream inputStream;

  public RawReportDownloadResponse(int httpStatus, InputStream inputStream) {
    this.httpStatus = httpStatus;
    this.inputStream = inputStream;
  }

  public int getHttpStatus() {
    return httpStatus;
  }

  public InputStream getInputStream() {
    return inputStream;
  }
}
