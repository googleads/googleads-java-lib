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

import com.google.api.ads.common.lib.utils.Streams;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Handles legacy bangpipe errors.
 *
 * @author Kevin Winter
 */
public class LegacyErrorResponseHandler {

  private static final Logger logger = LoggerFactory.getLogger(
      AdHocReportDownloadHelper.class.getPackage().getName() + ".report_download");

  /** Regular expression used to detect errors messages in a response. */
  private static final String ERROR_MESSAGE_REGEX =
      "^.*!!![^|]*\\|\\|\\|([^|]*)\\|\\|\\|([^?]*)\\?\\?\\?.*$";

  /** Regex group number that report exception message is stored in. */
  private static final int ERROR_MESSAGE_GROUP = 2;

  /**
   * Processes a {@link RawReportDownloadResponse} into a
   * {@link ReportDownloadResponse}, unwrapping pre-v201209 error messages if
   * possible.
   *
   * @param response to process
   * @return Processed response.
   * @throws ReportException if we have trouble reading the input stream.
   */
  public ReportDownloadResponse handleResponse(RawReportDownloadResponse response)
      throws ReportException {
    if (response.getHttpStatus() == HttpURLConnection.HTTP_OK) {
      return new ReportDownloadResponse(
          response.getHttpStatus(), "SUCCESS", response.getInputStream());
    }
    try {
      // Anything other than success means the body has an error message.
      String responseMessage = Streams.readAll(response.getInputStream());
      Matcher matcher = Pattern.compile(ERROR_MESSAGE_REGEX).matcher(responseMessage);
      if (matcher.matches()) {
        responseMessage = matcher.group(ERROR_MESSAGE_GROUP);
      }
      logger.warn(responseMessage);
      return new ReportDownloadResponse(response.getHttpStatus(), responseMessage, null);
    } catch (IOException e) {
      throw new ReportException("Problem sending data to report download server.", e);
    }
  }
}
