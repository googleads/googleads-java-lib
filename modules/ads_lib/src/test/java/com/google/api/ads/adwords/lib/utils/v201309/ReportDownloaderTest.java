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

package com.google.api.ads.adwords.lib.utils.v201309;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.utils.AdHocReportDownloadHelper;
import com.google.api.ads.adwords.lib.utils.RawReportDownloadResponse;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponse;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponseException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Tests for {@link ReportDownloader}.
 *
 * @author Kevin Winter
 */
@RunWith(JUnit4.class)
public class ReportDownloaderTest {

  private static final String GOLDEN_ERROR_XML = "<?xml version=\"1.0\" " +
      "encoding=\"UTF-8\" standalone=\"yes\"?><reportDownloadError>" +
      "<ApiError><type>ReportDefinitionError.INVALID_FIELD_NAME_FOR_REPORT</type>" +
      "<trigger>AdFormatt</trigger><fieldPath>foobar</fieldPath></ApiError></reportDownloadError>";

  private static final String ERROR_XML = "<reportDownloadError>" +
      "<ApiError><type>ReportDefinitionError.INVALID_FIELD_NAME_FOR_REPORT</type>" +
      "<trigger>AdFormatt</trigger><fieldPath>foobar</fieldPath></ApiError></reportDownloadError>";

  private static final String ERROR_TEXT = "A problem occurred processing your response";

  @Mock private AdWordsSession adWordsSession;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testSuccess() throws Exception {
    ByteArrayInputStream stream = new ByteArrayInputStream("Report data".getBytes());
    RawReportDownloadResponse rawResponse =
        new RawReportDownloadResponse(200, stream, AdHocReportDownloadHelper.REPORT_CHARSET);
    ReportDownloadResponse response =
        new ReportDownloader(adWordsSession).handleResponse(rawResponse);
    assertEquals(200, response.getHttpStatus());
    assertEquals(stream, response.getInputStream());
    assertEquals("SUCCESS", response.getHttpResponseMessage());
  }

  @Test
  public void testFailure_cannotReadStream() throws Exception {
    InputStream stream = Mockito.mock(InputStream.class);
    when(stream.read(isA(byte[].class))).thenThrow(new IOException());
    RawReportDownloadResponse rawResponse =
        new RawReportDownloadResponse(400, stream, AdHocReportDownloadHelper.REPORT_CHARSET);
    try {
      new ReportDownloader(adWordsSession).handleResponse(rawResponse);
      fail("Should have thrown an exception");
    } catch (ReportDownloadResponseException e) {
      assertEquals(400, e.getHttpStatus());
    }
  }

  @Test
  public void testFailure_validXmlResponse() throws Exception {
    InputStream stream = new ByteArrayInputStream(GOLDEN_ERROR_XML.getBytes());
    RawReportDownloadResponse rawResponse =
        new RawReportDownloadResponse(400, stream, AdHocReportDownloadHelper.REPORT_CHARSET);
    try {
      new ReportDownloader(adWordsSession).handleResponse(rawResponse);
      fail("Should have thrown an exception");
    } catch (DetailedReportDownloadResponseException e) {
      assertEquals(400, e.getHttpStatus());
      assertEquals("ReportDefinitionError.INVALID_FIELD_NAME_FOR_REPORT", e.getType());
      assertEquals("AdFormatt", e.getTrigger());
      assertEquals("foobar", e.getFieldPath());
    }
  }

  @Test
  public void testFailure_mostlyValidXmlResponse() throws Exception {
    InputStream stream = new ByteArrayInputStream(ERROR_XML.getBytes());
    RawReportDownloadResponse rawResponse =
        new RawReportDownloadResponse(400, stream, AdHocReportDownloadHelper.REPORT_CHARSET);
    try {
      new ReportDownloader(adWordsSession).handleResponse(rawResponse);
      fail("Should have thrown an exception");
    } catch (DetailedReportDownloadResponseException e) {
      assertEquals(400, e.getHttpStatus());
      assertEquals("ReportDefinitionError.INVALID_FIELD_NAME_FOR_REPORT", e.getType());
      assertEquals("AdFormatt", e.getTrigger());
      assertEquals("foobar", e.getFieldPath());
    }
  }

  @Test
  public void testFailure_invalidXmlResponse() throws Exception {
    InputStream stream = new ByteArrayInputStream(ERROR_TEXT.getBytes());
    RawReportDownloadResponse rawResponse =
        new RawReportDownloadResponse(400, stream, AdHocReportDownloadHelper.REPORT_CHARSET);
    try {
      new ReportDownloader(adWordsSession).handleResponse(rawResponse);
      fail("Should have thrown an exception");
    } catch (DetailedReportDownloadResponseException e) {
      assertEquals(400, e.getHttpStatus());
      assertEquals(ERROR_TEXT, e.getErrorText());
    }
  }

  @Test
  public void testReportDownloadTimeoutSetter() throws Exception {
    ReportDownloader reportDownloader = new ReportDownloader(adWordsSession);
    assertEquals(180000, reportDownloader.getReportDownloadTimeout());
    reportDownloader.setReportDownloadTimeout(42);
    assertEquals(42, reportDownloader.getReportDownloadTimeout());
  }
}
