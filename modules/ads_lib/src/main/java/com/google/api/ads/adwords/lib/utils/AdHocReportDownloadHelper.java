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

import com.google.api.ads.adwords.lib.utils.DetailedReportDownloadResponseException.Builder;
import com.google.api.ads.common.lib.utils.AdsUtilityInvocationHandler;
import com.google.api.ads.common.lib.utils.AdsUtilityRegistry;
import com.google.common.reflect.Reflection;
import com.google.inject.Inject;
import java.lang.reflect.InvocationHandler;

/**
 * Helper class that handles AdHoc report downloads. Requests will be logged (header and payload) to
 * INFO. Successful reports will be logged (headers and response code) to INFO. Failed reports will
 * be logged in their entirety to WARN.
 */
public class AdHocReportDownloadHelper implements AdHocReportDownloadHelperInterface {

  private final AdHocReportDownloadHelperInterface impl;

  /** Constructor used by Guice. */
  @Inject
  AdHocReportDownloadHelper(
      AdHocReportDownloadHelperImpl helperImpl, AdsUtilityRegistry adsUtilityRegistry) {
    InvocationHandler invocationHandler =
        new AdsUtilityInvocationHandler(helperImpl, adsUtilityRegistry);
    this.impl = Reflection.newProxy(AdHocReportDownloadHelperInterface.class, invocationHandler);
  }
  
  @Override
  public ReportDownloadResponse downloadReport(
      ReportRequest reportRequest, Builder exceptionBuilder)
      throws ReportException, ReportDownloadResponseException {
    return impl.downloadReport(reportRequest, exceptionBuilder);
  }

  @Override
  public RawReportDownloadResponse downloadReport(ReportRequest reportRequest)
      throws ReportException {
    return impl.downloadReport(reportRequest);
  }
  
  @Override
  public ReportDownloadResponse handleResponse(
      RawReportDownloadResponse rawResponse, Builder exceptionBuilder)
      throws ReportDownloadResponseException {
    return impl.handleResponse(rawResponse, exceptionBuilder);
  }

  @Override
  public int getReportDownloadTimeout() {
    return impl.getReportDownloadTimeout();
  }

  @Override
  public void setReportDownloadTimeout(int reportDownloadTimeout) {
    impl.setReportDownloadTimeout(reportDownloadTimeout);
  }
}
