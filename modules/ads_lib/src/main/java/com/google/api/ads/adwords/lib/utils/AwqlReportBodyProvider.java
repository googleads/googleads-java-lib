// Copyright 2012 Google Inc. All Rights Reserved.
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

import com.google.api.client.http.HttpContent;
import com.google.api.client.http.UrlEncodedContent;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * {@link ReportBodyProvider} that handles writing AWQL reports in the correct format.
 *
 * @author Kevin Winter
 */
public class AwqlReportBodyProvider implements ReportBodyProvider {

  private static final String REPORT_QUERY_KEY = "__rdquery";
  private static final String FORMAT_KEY = "__fmt";

  private final String reportQuery;
  private final String format;

  /**
   * Constructs a ReportBodyProvider for AWQL reports.
   *
   * @param reportQuery Query to report on.
   * @param format Download format.
   */
  public AwqlReportBodyProvider(String reportQuery, String format) {
    this.reportQuery = reportQuery;
    this.format = format;
  }

  public HttpContent getHttpContent() {
    Map<String, String> data = Maps.newHashMap();
    data.put(REPORT_QUERY_KEY, reportQuery);
    data.put(FORMAT_KEY, format);
    return new UrlEncodedContent(data);
  }
}
