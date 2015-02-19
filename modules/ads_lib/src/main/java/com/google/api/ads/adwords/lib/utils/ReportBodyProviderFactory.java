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

import com.google.common.base.Preconditions;

/**
 * Factory that returns the appropriate instance of {@link ReportBodyProvider} for a given
 * {@link ReportRequest}.
 *
 * @author Josh Radcliff
 */
class ReportBodyProviderFactory {

  /**
   * Returns the {@link ReportBodyProvider} for the given request.
   *
   * @throws NullPointerException if either {@code request} is null or
   *         {@code request.getRequestType()} is null
   */
  ReportBodyProvider getReportBodyProvider(ReportRequest request) {
    Preconditions.checkNotNull(request, "Null request");
    Preconditions.checkNotNull(request.getRequestType(), "Null request type");
    switch (request.getRequestType()) {
      case AWQL:
        return new AwqlReportBodyProvider(request.getReportRequestString(),
            request.getDownloadFormat().name());
      case XML:
        return new ReportDefinitionBodyProvider(request.getReportRequestString());
      default:
        throw new IllegalArgumentException(
            "Unrecognized request type: " + request.getRequestType());
    }
  }

}
