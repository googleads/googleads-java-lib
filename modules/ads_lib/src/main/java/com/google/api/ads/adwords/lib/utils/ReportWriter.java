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

import java.io.IOException;
import java.io.OutputStream;

/**
 * Allows different types of reports to be written to an output stream.
 */
interface ReportWriter {

  /**
   * Writes parameters for this report download to the output stream.
   *
   * @param outputStream to write to.
   * @throws IOException if there was a problem writing to the stream.
   */
  void write(OutputStream outputStream) throws IOException;

  /**
   * Returns the report parameters that would be written (intended for logging).
   */
  String getReportParameters();
}
