// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.common.lib.testing;

import com.google.api.client.http.HttpStatusCodes;

/** A mock response that determines the behavior of a {@link MockHttpServer}. */
public class MockResponse {
  private final String body;
  private final int httpStatus;
  private boolean isValidateUrlMatches;
  private String contentType;

  public String getBody() {
    return body;
  }

  public int getHttpStatus() {
    return httpStatus;
  }

  public MockResponse(String body) {
    this(body, HttpStatusCodes.STATUS_CODE_OK);
  }

  public MockResponse(String body, int httpStatus) {
    this.body = body;
    this.httpStatus = httpStatus;
    this.isValidateUrlMatches = true;
    this.contentType = "text/xml; charset=UTF-8";
  }

  public boolean isValidateUrlMatches() {
    return isValidateUrlMatches;
  }

  public void setValidateUrlMatches(boolean isValidateUrlMatches) {
    this.isValidateUrlMatches = isValidateUrlMatches;
  }

  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }
}
