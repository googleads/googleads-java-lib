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

package com.google.api.ads.adwords.lib.utils.logging;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.util.Data;
import com.google.api.client.util.GenericData;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Sets;
import com.google.inject.name.Named;

import org.slf4j.Logger;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.inject.Inject;

/**
 * Logger that logs report requests and responses according to the following rules.<br/>
 * <ul>
 *   <li>Log successful requests (header and payload) and responses to INFO.</li>
 *   <li>Log failed requests (header and payload) and responses to WARN.</li>
 * </ul>
 */
public class ReportServiceLogger {

  private final Logger reportLogger;

  /**
   * Headers whose value should not be logged because they contain sensitive information.
   * Entries are in lowercase, but scrubbing should be case-insensitive.
   */
  @VisibleForTesting
  static final Set<String> SCRUBBED_HEADERS =
      Sets.newHashSet("authorization", "authtoken", "password", "developertoken");

  @VisibleForTesting
  static final String SCRUBBED_HEADERS_VALUE = "REDACTED";

  /**
   * Constructor that takes an injected logger identified by name.
   * 
   * @param reportLogger underlying SLF4J logger for report service interactions
   */
  @Inject
  ReportServiceLogger(@Named(AdWordsLoggingModule.REPORT_LOGGER_NAME) Logger reportLogger) {
    this.reportLogger = reportLogger;
  }

  /**
   * Logs the request at the proper log level.
   */
  public void logRequest(String requestMethod, GenericUrl url, HttpContent requestContent,
      GenericData requestHeaders, boolean isSuccessful) {
    if (!isLoggable(isSuccessful)) {
      return;
    }

    log(String.format("Request made: %s %s%n", requestMethod, url), isSuccessful);

    StringBuilder messageBuilder = new StringBuilder();

    // Log headers.
    if (requestHeaders != null) {
      messageBuilder.append(getMapAsString(requestHeaders));
    }

    // Log request parameters.
    messageBuilder.append(String.format("%nParameters:%n"));
    if (requestContent instanceof UrlEncodedContent) {
      UrlEncodedContent encodedContent = (UrlEncodedContent) requestContent;
      messageBuilder.append(getMapAsString(Data.mapOf(encodedContent.getData())));
    } else if (requestContent != null) {
      ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
      try {
        requestContent.writeTo(byteStream);
        messageBuilder.append(byteStream.toString());
      } catch (IOException e) {
        messageBuilder.append("Unable to read request content due to exception: " + e);
      }
    }

    log(messageBuilder.toString(), isSuccessful);
  }

  /**
   * Logs the response at the proper log level based on its status code.
   */
  public void logResponse(int statusCode, String statusMessage, boolean isSuccessful) {
    if (!isLoggable(isSuccessful)) {
      return;
    }

    String responseInfo = String.format("Response received with status code %d and message: %s%n",
        statusCode, statusMessage);
    log(responseInfo, isSuccessful);
  }

  /**
   * Returns the underlying logger for report service interactions. 
   */
  public Logger getLogger() {
    return reportLogger;
  }
  
  /**
   * Converts the map of key/value pairs to a multi-line string (one line per key). Masks sensitive
   * information for a predefined set of header keys.
   *
   * @param map a non-null Map
   * @return a non-null String
   */
  private String getMapAsString(Map<String, Object> map) {
    StringBuilder messageBuilder = new StringBuilder();
    for (Entry<String, Object> mapEntry : map.entrySet()) {
      Object headerValue = mapEntry.getValue();
      // Perform a case-insensitive check if the header should be scrubbed.
      if (SCRUBBED_HEADERS.contains(mapEntry.getKey().toLowerCase())) {
        headerValue = SCRUBBED_HEADERS_VALUE;
      }
      messageBuilder.append(String.format("%s: %s%n", mapEntry.getKey(), headerValue));
    }
    return messageBuilder.toString();
  }

  private boolean isLoggable(boolean isSuccessful) {
    return isSuccessful ? reportLogger.isInfoEnabled() : reportLogger.isWarnEnabled();
  }

  private void log(String message, boolean isSuccessful) {
    if (isSuccessful) {
      reportLogger.info(message);
    } else {
      reportLogger.warn(message);
    }
  }
}
