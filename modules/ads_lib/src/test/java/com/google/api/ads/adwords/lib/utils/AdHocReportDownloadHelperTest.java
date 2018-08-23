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

import static com.google.api.ads.adwords.lib.utils.AdHocReportDownloadHelperInterface.REPORT_CHARSET;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.utils.DetailedReportDownloadResponseException.Builder;
import com.google.api.ads.adwords.lib.utils.ReportRequest.RequestType;
import com.google.api.ads.adwords.lib.utils.testing.GenericAdWordsServices;
import com.google.api.ads.common.lib.testing.MockHttpIntegrationTest;
import com.google.api.ads.common.lib.testing.TestPortFinder;
import com.google.api.ads.common.lib.utils.Streams;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.common.collect.Lists;
import com.google.common.io.ByteSource;
import com.google.common.io.ByteStreams;
import com.google.common.net.UrlEscapers;
import java.io.InputStream;
import java.net.ConnectException;
import java.util.List;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Tests for {@link AdHocReportDownloadHelper}.
 */
@RunWith(Parameterized.class)
public class AdHocReportDownloadHelperTest extends MockHttpIntegrationTest {

  /**
   * Error XML for an invalid field name of "AdFormatt" (instead of "AdFormat").
   */
  private static final String ERROR_XML =
      "<reportDownloadError>"
          + "<ApiError><type>ReportDefinitionError.INVALID_FIELD_NAME_FOR_REPORT</type>"
          + "<trigger>AdFormatt</trigger><fieldPath>foobar</fieldPath></ApiError>"
          + "</reportDownloadError>";

  private final boolean isTestRawDownload;
  private AdHocReportDownloadHelper helper;
  private GoogleCredential credential;
  private Builder exceptionBuilder;

  @Mock
  private ReportRequest reportRequest;

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /** Enum of download format that's not version-specific */
  enum TestDownloadFormat {
    CSV
  }
  
  @Parameters(name = "isTestRawDownload = {0}")
  public static List<Object[]> parameters() {
    return Lists.newArrayList(new Object[] {Boolean.TRUE}, new Object[] {Boolean.FALSE});
  }
  
  /**
   * The {@code isTestRawDownload} parameter determines if the {@code testDownloadReport...}
   * tests will test {@link AdHocReportDownloadHelper#downloadReport(ReportRequest)} (true) or
   * {@link AdHocReportDownloadHelper#downloadReport(ReportRequest, Builder)} (false).
   */
  public AdHocReportDownloadHelperTest(boolean isTestRawDownload) {
    this.isTestRawDownload = isTestRawDownload;
  }

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    Enum<?> downloadFormat = TestDownloadFormat.CSV;
    Mockito.<Enum<?>>when(reportRequest.getDownloadFormat()).thenReturn(downloadFormat);

    credential = new GoogleCredential.Builder().setTransport(new NetHttpTransport())
        .setJsonFactory(new JacksonFactory()).build();
    credential.setAccessToken("TEST_ACCESS_TOKEN");

    AdWordsSession session = new AdWordsSession.Builder()
        .withUserAgent("TEST_APP")
        .withOAuth2Credential(credential)
        .withEndpoint(testHttpServer.getServerUrl())
        .withDeveloperToken("TEST_DEVELOPER_TOKEN")
        .withClientCustomerId("TEST_CLIENT_CUSTOMER_ID")
        .build();

    helper =
        new GenericAdWordsServices()
            .getBootstrapper()
            .getInstanceOf(session, AdHocReportDownloadHelper.class);
    exceptionBuilder = DetailedReportDownloadResponseException::new;
  }

  /**
   * Tests that {@link AdHocReportDownloadHelper#getReportDownloadTimeout()} retrieves the global
   * timeout if not set on the helper.
   */
  @Test
  public void testGetReportDownloadTimeout() {
    assertEquals(
        AdWordsInternals.getInstance().getAdWordsLibConfiguration().getReportDownloadTimeout(),
        helper.getReportDownloadTimeout());
  }

  /**
   * Tests that {@link AdHocReportDownloadHelper#setReportDownloadTimeout(int)} sets the
   * helper-specific timeout and does not affect the global timeout.
   */
  @Test
  public void testSetReportDownloadTimeout() {
    int internalsTimeout =
        AdWordsInternals.getInstance().getAdWordsLibConfiguration().getReportDownloadTimeout();
    assertEquals(internalsTimeout, helper.getReportDownloadTimeout());

    int helperTimeout = internalsTimeout + 10;
    helper.setReportDownloadTimeout(helperTimeout);
    
    assertEquals("Timeout on helper does not reflect changes made via setReportDownloadTimeout",
        helperTimeout, helper.getReportDownloadTimeout());

    assertEquals("Setting the timeout on a helper instance modified the global timeout",
        internalsTimeout,
        AdWordsInternals.getInstance().getAdWordsLibConfiguration().getReportDownloadTimeout());
  }

  /**
   * Helper method that invokes the correct overload of
   * {@code AdHocReportDownloadHelper.downloadReport} based on this test's {@code isTestRawDownload}
   * attribute.
   *
   * <p>
   * Return type is {@code void} because this should be used for download requests that are expected
   * to fail.
   */
  private void downloadReport() throws ReportException, ReportDownloadResponseException {
    if (isTestRawDownload) {
      helper.downloadReport(reportRequest);
    } else {
      helper.downloadReport(reportRequest, exceptionBuilder);
    }
  }
  
  /**
   * Tests that the helper will throw a {@link ConnectException} wrapped in a
   * {@link ReportException} when the endpoint is for an unused port on localhost.
   */
  @Test
  public void testDownloadReportWithBadEndpoint_fails() throws Throwable {
    int port = TestPortFinder.getInstance().checkOutUnusedPort();

    try {
      // Construct the session to use an endpoint that is NOT in use on localhost.
      AdWordsSession sessionWithBadEndpoint =
          new AdWordsSession.Builder()
              .withUserAgent("TEST_APP")
              .withOAuth2Credential(credential)
              .withEndpoint("https://localhost:" + port)
              .withDeveloperToken("TEST_DEVELOPER_TOKEN")
              .withClientCustomerId("TEST_CLIENT_CUSTOMER_ID")
              .build();
      helper =
          new GenericAdWordsServices()
              .getBootstrapper()
              .getInstanceOf(sessionWithBadEndpoint, AdHocReportDownloadHelper.class);
      // Set up the ReportRequest so it will pass basic validation.
      when(reportRequest.getRequestType()).thenReturn(RequestType.AWQL);
      String awqlString = "SELECT BadField1 FROM NOT_A_REPORT DURING NOT_A_TIME_PERIOD";
      when(reportRequest.getReportRequestString()).thenReturn(awqlString);
      // The cause should be a ConnectException (see expected annotation) since the endpoint
      // port is not in use.
      thrown.expect(ReportException.class);
      thrown.expectCause(Matchers.<Exception>instanceOf(ConnectException.class));
      downloadReport(); 
    } finally {
      TestPortFinder.getInstance().releaseUnusedPort(port);
    }
  }

  /**
   * Tests that validation on the XML report definition string is propagated by the helper.
   *
   * @throws Exception
   */
  @Test
  public void testDownloadReportWithMissingXmlString_fails() throws Exception {
    when(reportRequest.getRequestType()).thenReturn(RequestType.XML);
    thrown.expect(NullPointerException.class);
    downloadReport();
  }

  /**
   * Tests that validation on the AWQL report definition string is propagated by the helper.
   */
  @Test
  public void testDownloadReportWithMissingAwqlString_fails() throws Exception {
    when(reportRequest.getRequestType()).thenReturn(RequestType.AWQL);
    thrown.expect(NullPointerException.class);
    downloadReport();
  }

  /**
   * Tests that validation for {@link ReportRequest#getRequestType()} is propagated by the helper.
   */
  @Test
  public void testDownloadReportWithMissingRequestType_fails() throws Exception {
    String awqlString = "SELECT BadField1 FROM NOT_A_REPORT DURING NOT_A_TIME_PERIOD";
    when(reportRequest.getReportRequestString()).thenReturn(awqlString);
    thrown.expect(NullPointerException.class);
    downloadReport();
  }

  /**
   * Tests that the helper will properly capture an internal server error (500) status returned by
   * the mock HTTP server.
   */
  @Test
  public void testDownloadReportWithServerErrorStatus() throws Exception {
    when(reportRequest.getRequestType()).thenReturn(RequestType.AWQL);

    String awqlString = "SELECT BadField1 FROM NOT_A_REPORT DURING NOT_A_TIME_PERIOD";
    when(reportRequest.getReportRequestString()).thenReturn(awqlString);

    // Do not set the next response body on the test server. This will trigger an error
    // (500) from the test server.
    RawReportDownloadResponse response = helper.downloadReport(reportRequest);

    assertEquals("Response status code not failure", 500, response.getHttpStatus());
    assertEquals("", Streams.readAll(response.getInputStream(), response.getCharset()));
  }

  /**
   * Tests that the helper will pass the expected HTTP request to the server for a valid XML-based
   * report request.
   */
  @Test
  public void testDownloadReportWithValidXmlRequest() throws Exception {
    when(reportRequest.getRequestType()).thenReturn(RequestType.XML);

    String xmlString =
        "<reportDefinition xmlns=\"https://adwords.google.com/api/adwords/cm/v209902\">"
        + "  <selector>                                        "
        + "    <fields>CampaignId</fields>                     "
        + "    <fields>CampaignName</fields>                   "
        + "    <fields>Impressions</fields>                    "
        + "    <predicates>                                    "
        + "      <field>Status</field>                         "
        + "      <operator>IN</operator>                       "
        + "      <values>ENABLED</values>                      "
        + "      <values>PAUSED</values>                       "
        + "    </predicates>                                   "
        + "  </selector>                                       "
        + "  <reportName>Custom Adgroup Performance Report</reportName>"
        + "  <reportType>CAMPAIGN_PERFORMANCE_REPORT</reportType>"
        + "  <dateRangeType>LAST_7_DAYS</dateRangeType>        "
        + "  <downloadFormat>CSV</downloadFormat>              "
        + "</reportDefinition>                                 ";
    when(reportRequest.getReportRequestString()).thenReturn(xmlString);

    testHttpServer.setMockResponseBody("test");

    if (isTestRawDownload) {
      RawReportDownloadResponse response = helper.downloadReport(reportRequest);

      assertNotNull("Null response", response);
      assertEquals("Response status code not success", 200, response.getHttpStatus());
      assertEquals(
          "Response charset incorrect",
          REPORT_CHARSET,
          response.getCharset());
      assertEquals(
          "Response contents incorrect",
          "test",
          Streams.readAll(response.getInputStream(), response.getCharset()));
    } else {
      ReportDownloadResponse response = helper.downloadReport(reportRequest, exceptionBuilder);
      assertNotNull("Null response", response);
      assertEquals("Response status code not success", 200, response.getHttpStatus());
      assertEquals(
          "Response contents incorrect",
          "test",
          Streams.readAll(response.getInputStream(), REPORT_CHARSET));
    }

    String lastRequestBody = testHttpServer.getLastRequestBody();
    assertThat(
        "xml parameter value incorrect",
        lastRequestBody,
        containsString("__rdxml=" + UrlEscapers.urlFormParameterEscaper().escape(xmlString)));
  }

  /**
   * Tests that the helper will pass the expected HTTP request to the server for a valid AWQL-based
   * report request.
   */
  @Test
  public void testDownloadReportWithValidAwqlRequest() throws Exception {
    when(reportRequest.getRequestType()).thenReturn(RequestType.AWQL);

    String awqlString = "SELECT CampaignId, CampaignName, Impressions "
        + "FROM CAMPAIGN_PERFORMANCE_REPORT DURING THIS_MONTH";
    when(reportRequest.getReportRequestString()).thenReturn(awqlString);

    testHttpServer.setMockResponseBody("test");

    if (isTestRawDownload) {
      RawReportDownloadResponse response = helper.downloadReport(reportRequest);

      assertNotNull("Null response", response);
      assertEquals("Response status code not success", 200, response.getHttpStatus());
      assertEquals(
          "Response charset incorrect",
          REPORT_CHARSET,
          response.getCharset());
      assertEquals(
          "Response contents incorrect",
          "test",
          Streams.readAll(response.getInputStream(), response.getCharset()));
    } else {
      ReportDownloadResponse response = helper.downloadReport(reportRequest, exceptionBuilder);
      assertNotNull("Null response", response);
      assertEquals("Response status code not success", 200, response.getHttpStatus());
      assertEquals(
          "Response contents incorrect",
          "test",
          Streams.readAll(response.getInputStream(), REPORT_CHARSET));
    }

    String lastRequestBody = testHttpServer.getLastRequestBody();
    assertThat(
        "awql parameter value incorrect",
        lastRequestBody,
        containsString("__rdquery=" + UrlEscapers.urlFormParameterEscaper().escape(awqlString)));

    assertThat("format parameter incorrect", lastRequestBody, containsString("__fmt=CSV"));
  }
  
  @Test
  public void testHandleSuccessfulResponse() throws Exception {
    String responseBody = "Successful,report,response";
    RawReportDownloadResponse rawResponse =
        new RawReportDownloadResponse(
            200,
            ByteSource.wrap(responseBody.getBytes(REPORT_CHARSET)).openStream(),
            REPORT_CHARSET,
            "CSV");
    ReportDownloadResponse reportResponse = helper.handleResponse(rawResponse, exceptionBuilder);
    String actualResponseBody =
        new String(ByteStreams.toByteArray(reportResponse.getInputStream()), REPORT_CHARSET);
    assertEquals("Response body not expected value", responseBody, actualResponseBody);
  }

  @Test
  public void testHandleErrorResponse_fails() throws Exception {
    RawReportDownloadResponse rawResponse =
        new RawReportDownloadResponse(
            500,
            ByteSource.wrap(ERROR_XML.getBytes(REPORT_CHARSET)).openStream(),
            REPORT_CHARSET,
            "CSV");
    thrown.expect(DetailedReportDownloadResponseException.class);
    thrown.expect(Matchers.hasProperty("fieldPath", Matchers.equalTo("foobar")));
    thrown.expect(Matchers.hasProperty("trigger", Matchers.equalTo("AdFormatt")));
    thrown.expect(
        Matchers.hasProperty(
            "type", Matchers.equalTo("ReportDefinitionError.INVALID_FIELD_NAME_FOR_REPORT")));
    helper.handleResponse(rawResponse, exceptionBuilder);
  }

  @Test
  public void testHandleResponseWithNullInputStream_fails() throws Exception {
    RawReportDownloadResponse rawResponse =
        new RawReportDownloadResponse(
            500, (InputStream) null, AdHocReportDownloadHelper.REPORT_CHARSET, "CSV");
    thrown.expect(DetailedReportDownloadResponseException.class);
    helper.handleResponse(rawResponse, exceptionBuilder);
  }

  @Test
  public void testHandleResponseWithEmptyInputStream_fails() throws Exception {
    RawReportDownloadResponse rawResponse =
        new RawReportDownloadResponse(
            500, ByteSource.empty().openStream(), REPORT_CHARSET, "CSV");
    thrown.expect(DetailedReportDownloadResponseException.class);
    thrown.expect(Matchers.hasProperty("fieldPath", Matchers.nullValue()));
    thrown.expect(Matchers.hasProperty("trigger", Matchers.nullValue()));
    thrown.expect(Matchers.hasProperty("type", Matchers.nullValue()));
    helper.handleResponse(rawResponse, exceptionBuilder);
  }

  @Test
  public void testHandleResponseNullResponse_fails() throws Exception {
    thrown.expect(NullPointerException.class);
    thrown.expectMessage("Null response");
    helper.handleResponse(null, exceptionBuilder);
  }

  @Test
  public void testHandleResponseNullExceptionBuilder_fails() throws Exception {
    RawReportDownloadResponse rawResponse =
        new RawReportDownloadResponse(
            200,
            ByteSource.wrap("a,b,c".getBytes(REPORT_CHARSET)).openStream(),
            REPORT_CHARSET,
            "CSV");
    thrown.expect(NullPointerException.class);
    thrown.expectMessage("Null exception builder");
    helper.handleResponse(rawResponse, null);
  }
}
