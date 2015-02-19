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

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.utils.ReportRequest.RequestType;
import com.google.api.ads.common.lib.testing.MockHttpIntegrationTest;
import com.google.api.ads.common.lib.utils.Streams;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.common.net.UrlEscapers;
import org.openqa.selenium.net.PortProber;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.net.ConnectException;
import java.nio.charset.StandardCharsets;

/**
 * Tests for {@link AdHocReportDownloadHelper}.
 *
 * @author Josh Radcliff
 */
public class AdHocReportDownloadHelperTest extends MockHttpIntegrationTest {

  private static final String VERSION = "v202012";

  private AdHocReportDownloadHelper helper;
  private GoogleCredential credential;

  @Mock
  private ReportRequest reportRequest;

  /** Enum of download format that's not version-specific */
  enum TestDownloadFormat {
    CSV
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

    helper = new AdHocReportDownloadHelper(session, VERSION);
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
   * Tests that the helper will throw a {@link ConnectException} wrapped in a
   * {@link ReportException} when the endpoint is for an unused port on localhost.
   */
  @Test(expected = ConnectException.class)
  public void testBadEndpoint_fails() throws Throwable {
    int port = PortProber.findFreePort();

    // Construct the session to use an endpoint that is NOT in use on localhost.
    AdWordsSession sessionWithBadEndpoint = new AdWordsSession.Builder()
        .withUserAgent("TEST_APP")
        .withOAuth2Credential(credential)
        .withEndpoint("https://localhost:" + port)
        .withDeveloperToken("TEST_DEVELOPER_TOKEN")
        .withClientCustomerId("TEST_CLIENT_CUSTOMER_ID")
        .build();
    helper = new AdHocReportDownloadHelper(sessionWithBadEndpoint, VERSION);

    // Set up the ReportRequest so it will pass basic validation.
    when(reportRequest.getRequestType()).thenReturn(RequestType.AWQL);

    String awqlString = "SELECT BadField1 FROM NOT_A_REPORT DURING NOT_A_TIME_PERIOD";
    when(reportRequest.getReportRequestString()).thenReturn(awqlString);

    try {
      helper.downloadReport(reportRequest);
    } catch (ReportException e) {
      // The cause should be a ConnectException (see expected annotation) since the endpoint
      // port is not in use.
      throw e.getCause();
    }
  }

  /**
   * Tests that validation on the XML report definition string is propagated by the helper.
   *
   * @throws Exception
   */
  @Test(expected = NullPointerException.class)
  public void testMissingXmlString_fails() throws Exception {
    when(reportRequest.getRequestType()).thenReturn(RequestType.XML);

    helper.downloadReport(reportRequest);
  }

  /**
   * Tests that validation on the AWQL report definition string is propagated by the helper.
   */
  @Test(expected = NullPointerException.class)
  public void testMissingAwqlString_fails() throws Exception {
    when(reportRequest.getRequestType()).thenReturn(RequestType.AWQL);

    helper.downloadReport(reportRequest);
  }

  /**
   * Tests that validation for {@link ReportRequest#getRequestType()} is propagated by the helper.
   */
  @Test(expected = NullPointerException.class)
  public void testMissingRequestType_fails() throws Exception {
    String awqlString = "SELECT BadField1 FROM NOT_A_REPORT DURING NOT_A_TIME_PERIOD";
    when(reportRequest.getReportRequestString()).thenReturn(awqlString);

    helper.downloadReport(reportRequest);
  }

  /**
   * Tests that the helper will properly capture an internal server error (500) status returned by
   * the mock HTTP server.
   */
  @Test
  public void testServerErrorStatus() throws Exception {
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
  public void testXmlRequest() throws Exception {
    when(reportRequest.getRequestType()).thenReturn(RequestType.XML);

    String xmlString =
        "<reportDefinition xmlns=\"https://adwords.google.com/api/adwords/cm/v201409\">"
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

    RawReportDownloadResponse response = helper.downloadReport(reportRequest);

    assertNotNull("Null response", response);
    assertEquals("Response status code not success", 200, response.getHttpStatus());
    assertEquals("Response charset incorrect", StandardCharsets.UTF_8, response.getCharset());
    assertEquals("Response contents incorrect", "test",
        Streams.readAll(response.getInputStream(), response.getCharset()));

    String lastRequestBody = testHttpServer.getLastRequestBody();
    assertThat("xml parameter value incorrect", lastRequestBody,
        containsString("__rdxml=" + UrlEscapers.urlFormParameterEscaper().escape(xmlString)));
  }

  /**
   * Tests that the helper will pass the expected HTTP request to the server for a valid AWQL-based
   * report request.
   */
  @Test
  public void testAwqlRequest() throws Exception {
    when(reportRequest.getRequestType()).thenReturn(RequestType.AWQL);

    String awqlString = "SELECT CampaignId, CampaignName, Impressions "
        + "FROM CAMPAIGN_PERFORMANCE_REPORT DURING THIS_MONTH";
    when(reportRequest.getReportRequestString()).thenReturn(awqlString);

    testHttpServer.setMockResponseBody("test");

    RawReportDownloadResponse response = helper.downloadReport(reportRequest);

    assertNotNull("Null response", response);
    assertEquals("Response status code not success", 200, response.getHttpStatus());
    assertEquals("Response charset incorrect", StandardCharsets.UTF_8, response.getCharset());
    assertEquals("Response contents incorrect", "test",
        Streams.readAll(response.getInputStream(), response.getCharset()));

    String lastRequestBody = testHttpServer.getLastRequestBody();
    assertThat("awql parameter value incorrect", lastRequestBody,
        containsString("__rdquery=" + UrlEscapers.urlFormParameterEscaper().escape(awqlString)));

    assertThat("format parameter incorrect", lastRequestBody, containsString("__fmt=CSV"));
  }
}
