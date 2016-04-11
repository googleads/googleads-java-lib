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

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.utils.AdsUtilityInvocationHandler;
import com.google.common.reflect.Reflection;

import java.lang.reflect.InvocationHandler;

/**
 * Helper class that handles AdHoc report downloads. Requests will be logged (header and payload) to
 * INFO. Successful reports will be logged (headers and response code) to INFO. Failed reports will
 * be logged in their entirety to WARN.
 */
public class AdHocReportDownloadHelper implements AdHocReportDownloadHelperInterface {

  private final AdHocReportDownloadHelperInterface impl;
  
  /**
   * Constructor that stores the session for authentication and uses the provided version to
   * determine the report endpoint.
   */
  public AdHocReportDownloadHelper(AdWordsSession session, String version) {
    InvocationHandler invocationHandler =
        new AdsUtilityInvocationHandler(
            new AdHocReportDownloadHelperImpl(session, version),
            AdWordsInternals.getInstance().getAdsUtilityRegistry());
    this.impl = Reflection.newProxy(AdHocReportDownloadHelperInterface.class, invocationHandler);
  }

  /**
   * Downloads a report and returns a ReportDownloadResponse with the results.
   *
   * @param reportRequest the report request.
   * @return encapsulated http response body and status code.
   * @throws ReportException If there is any exceptions making HTTP request to
   *         the server.
   */
  @Override
  public RawReportDownloadResponse downloadReport(ReportRequest reportRequest)
      throws ReportException {
    return impl.downloadReport(reportRequest);
  }
  
  /**
   * Returns the reportDownloadTimeout in milliseconds
   */
  @Override
  public int getReportDownloadTimeout() {
    return impl.getReportDownloadTimeout();
  }

  /**
   * Sets the reportDownloadTimeout (milliseconds).
   */
  @Override
  public void setReportDownloadTimeout(int reportDownloadTimeout) {
    impl.setReportDownloadTimeout(reportDownloadTimeout);
  }
}
