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

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayInputStream;

/**
 * Test for {@link LegacyErrorResponseHandler}.
 *
 * @author Kevin Winter
 */
@RunWith(JUnit4.class)
public class LegacyErrorResponseHandlerTest {

  private static final String BANGPIPE_ERROR =
      "!!!2|||-1|||ReportDefinitionError.INVALID_FIELD_NAME_FOR_REPORT @ ; trigger:'AdFormatt'???";

  private static final String ERROR_IN_BANGPIPE =
      "ReportDefinitionError.INVALID_FIELD_NAME_FOR_REPORT @ ; trigger:'AdFormatt'";

  @Test
  public void testSuccess() throws Exception {
    ByteArrayInputStream stream = new ByteArrayInputStream("Report data".getBytes());
    RawReportDownloadResponse rawResponse = new RawReportDownloadResponse(200, stream);
    ReportDownloadResponse response = new LegacyErrorResponseHandler().handleResponse(rawResponse);
    assertEquals(200, response.getHttpStatus());
    assertEquals(stream, response.getInputStream());
    assertEquals("SUCCESS", response.getHttpResponseMessage());
  }

  @Test
  public void testFailure_noBangPipe() throws Exception {
    ByteArrayInputStream stream = new ByteArrayInputStream("Something went wrong".getBytes());
    RawReportDownloadResponse rawResponse = new RawReportDownloadResponse(400, stream);
    ReportDownloadResponse response = new LegacyErrorResponseHandler().handleResponse(rawResponse);
    assertEquals(400, response.getHttpStatus());
    assertEquals("Something went wrong", response.getHttpResponseMessage());
  }

  @Test
  public void testFailure_withBangPipe() throws Exception {
    ByteArrayInputStream stream = new ByteArrayInputStream(BANGPIPE_ERROR.getBytes());
    RawReportDownloadResponse rawResponse = new RawReportDownloadResponse(400, stream);
    ReportDownloadResponse response = new LegacyErrorResponseHandler().handleResponse(rawResponse);
    assertEquals(400, response.getHttpStatus());
    assertEquals(ERROR_IN_BANGPIPE, response.getHttpResponseMessage());
  }
}
