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
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Writes report definition XML to an output stream in the correct format.
 *
 * @author Kevin Winter
 */
class ReportDefinitionBodyProvider implements ReportBodyProvider {

  private static final String REPORT_XML_KEY = "__rdxml";
  private final String reportDefinitionXml;

  /**
   * Constructs a ReportBodyProvider for ReportDefinition objects.
   *
   * @param reportDefinitionXml XML of the ReportDefinition to write.
   */
  ReportDefinitionBodyProvider(String reportDefinitionXml) {
    this.reportDefinitionXml = Preconditions.checkNotNull(Strings.emptyToNull(reportDefinitionXml),
        "Null or empty report definition XML");
  }

  @Override
  public HttpContent getHttpContent() {
    Map<String, String> data = Maps.newHashMap();
    data.put(REPORT_XML_KEY, reportDefinitionXml);
    return new UrlEncodedContent(data);
  }
}
