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

/**
 * Wrapper for AdWords API report requests.
 */
public interface ReportRequest {

  /**
   * Return the report definition as a string.
   */
  public String getReportRequestString();
  
  /**
   * Return the version-specific DownloadFormat.
   */
  public Enum<?> getDownloadFormat();
  
  /**
   * Return the DefinitionType.
   */
  public RequestType getRequestType();
  
  /**
   * Return the version of the AdWords API ({@code vYYYYMM}).
   */
  public String getApiVersion();
  
  /**
   * Enumeration of the different types of report requests supported by the AdWords API.
   */
  public enum RequestType {
    XML, AWQL;
  }
}
