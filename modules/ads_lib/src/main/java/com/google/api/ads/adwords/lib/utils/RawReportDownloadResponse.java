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
import java.nio.charset.Charset;

/**
 * Holder class for http status and response body.
 */
public class RawReportDownloadResponse {

  private final int httpStatus;
  private final InputStream inputStream;
  private final Charset charset;
  private final String downloadFormat;

  public RawReportDownloadResponse(int httpStatus, InputStream inputStream, Charset charset,
      String downloadFormat) {
    this.httpStatus = httpStatus;
    this.inputStream = inputStream;
    this.charset = charset;
    this.downloadFormat = downloadFormat;
  }

  public int getHttpStatus() {
    return httpStatus;
  }

  public InputStream getInputStream() {
    return inputStream;
  }
  
  public Charset getCharset() {
    return charset;
  }
  
  public String getDownloadFormat() {
    return downloadFormat;
  }
}
