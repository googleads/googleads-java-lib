// Copyright 2013 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils.v201402;

import com.google.api.ads.adwords.lib.utils.ReportDownloadResponseException;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * Exception wrapping the ReportDownloadError the server responded with. Will
 * populate the fieldPath, trigger and type fields if the XML can be parsed
 * successfully, otherwise errorText should have the HTTP response body.
 *
 * @author Kevin Winter
 */
public class DetailedReportDownloadResponseException extends ReportDownloadResponseException {

  private final String errorText;
  private String fieldPath;
  private String trigger;
  private String type;

  /**
   * Constructor.
   *
   * @param httpStatus http status code
   * @param errorText from the server
   */
  public DetailedReportDownloadResponseException(int httpStatus, String errorText) {
    super(httpStatus);
    this.errorText = errorText;
  }

  public String getErrorText() {
    return errorText;
  }

  @Override
  public String toString() {
    List<String> parts = Lists.newArrayList();
    parts.add("HTTP Response Code: " + this.getHttpStatus());
    if (!StringUtils.isEmpty(fieldPath)) {
      parts.add("FieldPath: " + fieldPath);
    }
    if (!StringUtils.isEmpty(trigger)) {
      parts.add("Trigger: " + trigger);
    }
    if (!StringUtils.isEmpty(type)) {
      parts.add("Type: " + type);
    }
    if (parts.size() == 1 && !StringUtils.isEmpty(errorText)) {
      parts.add("ErrorText: " + errorText);
    }
    return Joiner.on(", ").join(parts);
  }

  public String getFieldPath() {
    return fieldPath;
  }

  public String getTrigger() {
    return trigger;
  }

  public String getType() {
    return type;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }

  public void setType(String type) {
    this.type = type;
  }
}
