// Copyright 2016 Google Inc. All Rights Reserved.
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
package com.google.api.ads.admanager.axis.testing;

import java.net.URL;

/**
 * Provides a sample report for the Ad Manager API.
 */
public final class ReportProvider {
  
  public static final URL TEST_REPORT_RESOURCE = getTestReportResource("test_report.xml");
  
  /**
   * Get the resource URL for a test report given the resource name.
   */
  private static URL getTestReportResource(String resourceName) {
    return ReportProvider.class.getResource(resourceName);
  }
}
