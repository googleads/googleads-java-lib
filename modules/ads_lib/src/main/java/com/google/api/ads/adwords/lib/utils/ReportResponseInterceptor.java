// Copyright 2014 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils;

import com.google.api.ads.adwords.lib.utils.logging.ReportServiceLogger;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseInterceptor;

import java.io.IOException;

/**
 * Implementation of HttpResponseInterceptor for AdWords reporting responses.
 * 
 * @author Josh Radcliff
 */
class ReportResponseInterceptor implements HttpResponseInterceptor {

  private final ReportServiceLogger reportServiceLogger;

  /**
   * @param reportServiceLogger the logger for reporting interactions.
   */
  public ReportResponseInterceptor(ReportServiceLogger reportServiceLogger) {
    this.reportServiceLogger = reportServiceLogger;
  }

  @Override
  public void interceptResponse(HttpResponse response) throws IOException {
    if (response == null) {
      return;
    }
    
    HttpRequest request = response.getRequest();
    if (request != null) {
      reportServiceLogger.logRequest(request.getRequestMethod(), request.getUrl(),
          request.getContent(), request.getHeaders(), response.isSuccessStatusCode());
    }
    reportServiceLogger.logResponse(response.getStatusCode(), response.getStatusMessage(),
        response.isSuccessStatusCode());
  }
}