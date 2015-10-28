// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils.v201509;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.jaxb.v201509.DownloadFormat;
import com.google.api.ads.adwords.lib.jaxb.v201509.ReportDefinition;
import com.google.api.ads.adwords.lib.jaxb.v201509.ReportDefinitionDateRangeType;
import com.google.api.ads.adwords.lib.jaxb.v201509.ReportDefinitionReportType;
import com.google.api.ads.adwords.lib.jaxb.v201509.Selector;
import com.google.api.ads.adwords.lib.utils.AdHocReportDownloadHelper;
import com.google.api.ads.adwords.lib.utils.RawReportDownloadResponse;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponse;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponseException;
import com.google.api.ads.adwords.lib.utils.ReportException;
import com.google.api.ads.adwords.lib.utils.ReportRequest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Tests for {@link ReportDownloader}.
 */
@RunWith(Parameterized.class)
public class ReportDownloaderTest {

  private static final String GOLDEN_ERROR_XML = "<?xml version=\"1.0\" "
      + "encoding=\"UTF-8\" standalone=\"yes\"?><reportDownloadError>"
      + "<ApiError><type>ReportDefinitionError.INVALID_FIELD_NAME_FOR_REPORT</type>"
      + "<trigger>AdFormatt</trigger><fieldPath>foobar</fieldPath></ApiError>"
      + "</reportDownloadError>";

  private static final String ERROR_XML = "<reportDownloadError>"
      + "<ApiError><type>ReportDefinitionError.INVALID_FIELD_NAME_FOR_REPORT</type>"
      + "<trigger>AdFormatt</trigger><fieldPath>foobar</fieldPath></ApiError>"
      + "</reportDownloadError>";

  private static final String AWQL_REQUEST = "SELECT CampaignId, CampaignName, Impressions "
      + "FROM CAMPAIGN_PERFORMANCE_REPORT DURING THIS_MONTH";

  private static final String ERROR_TEXT = "A problem occurred processing your response";

  private ReportDownloader reportDownloader;
  private final boolean isUseAwql;
  
  @Mock private AdWordsSession adWordsSession;
  @Mock private AdHocReportDownloadHelper adHocDownloadHelper;

  @Parameters(name="isUseAwql={0}")
  public static Collection<Object[]> data() {
    Collection<Object[]> parameters = new ArrayList<Object[]>();
    parameters.add(new Object[] {Boolean.TRUE});
    parameters.add(new Object[] {Boolean.FALSE});
    return parameters;
  }
  
  public ReportDownloaderTest(boolean isUseAwql) {
    this.isUseAwql = isUseAwql;
  }
  
  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    reportDownloader = new ReportDownloader(adHocDownloadHelper);
  }

  /**
   * Invokes {@link ReportDownloader#downloadReport(ReportDefinition)} or
   * {@link ReportDownloader#downloadReport(String, DownloadFormat)}, depending on whether this
   * instance is configured to use AWQL.
   *
   * @param downloadFormat the DownloadFormat for the request
   * @param rawResponse the response to return from the mocked ad hoc helper
   */
  private ReportDownloadResponse downloadReport(DownloadFormat downloadFormat,
      RawReportDownloadResponse rawResponse) throws ReportException,
      ReportDownloadResponseException {
    when(adHocDownloadHelper.downloadReport(Matchers.<ReportRequest>any())).thenReturn(rawResponse);
    if (isUseAwql) {
      return reportDownloader.downloadReport(AWQL_REQUEST, downloadFormat);
    } else {
      ReportDefinition reportDefinition = new ReportDefinition();
      reportDefinition.setSelector(new Selector());
      reportDefinition.getSelector().getFields()
          .addAll(Arrays.asList("CampaignId", "CampaignName", "Impressions"));
      reportDefinition.setDateRangeType(ReportDefinitionDateRangeType.LAST_7_DAYS);
      reportDefinition.setReportName("Custom report");
      reportDefinition.setReportType(ReportDefinitionReportType.CAMPAIGN_PERFORMANCE_REPORT);
      return reportDownloader.downloadReport(reportDefinition);
    }
  }

  @Test
  public void testSuccess() throws Exception {
    ByteArrayInputStream stream = new ByteArrayInputStream("Report data".getBytes());
    RawReportDownloadResponse rawResponse =
        new RawReportDownloadResponse(200, stream, AdHocReportDownloadHelper.REPORT_CHARSET,
            DownloadFormat.CSV.name());
    ReportDownloadResponse response = downloadReport(DownloadFormat.CSV, rawResponse);
    assertEquals(200, response.getHttpStatus());
    assertEquals(stream, response.getInputStream());
    assertEquals("SUCCESS", response.getHttpResponseMessage());
  }

  @Test
  public void testFailure_cannotReadStream() throws Exception {
    InputStream stream = Mockito.mock(InputStream.class);
    when(stream.read(isA(byte[].class))).thenThrow(new IOException());
    RawReportDownloadResponse rawResponse =
        new RawReportDownloadResponse(400, stream, AdHocReportDownloadHelper.REPORT_CHARSET,
            DownloadFormat.CSV.name());
    try {
      downloadReport(DownloadFormat.CSV, rawResponse);
      fail("Should have thrown an exception");
    } catch (ReportDownloadResponseException e) {
      assertEquals(400, e.getHttpStatus());
    }
  }

  @Test
  public void testFailure_validXmlResponse() throws Exception {
    InputStream stream = new ByteArrayInputStream(GOLDEN_ERROR_XML.getBytes());
    RawReportDownloadResponse rawResponse =
        new RawReportDownloadResponse(400, stream, AdHocReportDownloadHelper.REPORT_CHARSET,
            DownloadFormat.XML.name());
    try {
      downloadReport(DownloadFormat.XML, rawResponse);
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
        new RawReportDownloadResponse(400, stream, AdHocReportDownloadHelper.REPORT_CHARSET,
            DownloadFormat.XML.name());
    try {
      downloadReport(DownloadFormat.XML, rawResponse);
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
        new RawReportDownloadResponse(400, stream, AdHocReportDownloadHelper.REPORT_CHARSET,
            DownloadFormat.XML.name());
    try {
      downloadReport(DownloadFormat.XML, rawResponse);
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
