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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.client.reporting.ReportingConfiguration;
import com.google.api.ads.adwords.lib.conf.AdWordsLibConfiguration;
import com.google.api.ads.adwords.lib.utils.testing.GenericAdWordsServices;
import com.google.api.ads.common.lib.auth.AuthorizationHeaderProvider;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/** Tests functionality of the ReportRequestFactoryHelper. */
@RunWith(Parameterized.class)
public class ReportRequestFactoryHelperTest {

  private static final GenericUrl ENDPOINT_URL = new GenericUrl("https://google.com/api/service");

  /** Version of the AdWords API. */
  private String version;

  /** The reporting configuration to use for the test. */
  private ReportingConfiguration reportingConfiguration;

  private HttpTransport transport;

  @Mock private AuthorizationHeaderProvider authorizationHeaderProvider;
  @Mock private Credential credential;
  @Mock private UserAgentCombiner userAgentCombiner;
  @Mock private AdWordsSession adWordsSession;
  @Mock private AdWordsLibConfiguration adWordsLibConfiguration;
  @Mock private LowLevelHttpRequest lowLevelRequest;
  @Mock private ReportResponseInterceptor reportResponseInterceptor;

  @Parameters(name = "version={0}, reportingConfiguration={1}")
  public static Collection<Object[]> data() {
    Collection<Object[]> parameters = new ArrayList<Object[]>();
    List<Boolean> booleanValues = Arrays.<Boolean>asList(true, false, null);
    List<String> versions = Arrays.<String>asList("v201710", "v201802");
    List<Integer> timeouts = Arrays.<Integer>asList(5_000_000, null);

    // Create a reporting configuration for all combinations of attribute values from the lists
    // above.
    List<ReportingConfiguration> reportingConfigs = new ArrayList<>();
    for (Boolean isSkipReportHeader : booleanValues) {
      for (Boolean isSkipColumnHeader : booleanValues) {
        for (Boolean isSkipReportSummary : booleanValues) {
          for (Boolean isIncludeZeroImpressions : booleanValues) {
            for (Boolean isUseRawEnumValues : booleanValues) {
              for (Integer timeout : timeouts) {
                ReportingConfiguration reportingConfig = null;
                if (isSkipReportHeader != null
                    || isSkipColumnHeader != null
                    || isSkipReportSummary != null
                    || isIncludeZeroImpressions != null
                    || isUseRawEnumValues != null
                    || timeout != null) {
                  reportingConfig =
                      new ReportingConfiguration.Builder()
                          .skipReportHeader(isSkipReportHeader)
                          .skipColumnHeader(isSkipColumnHeader)
                          .skipReportSummary(isSkipReportSummary)
                          .includeZeroImpressions(isIncludeZeroImpressions)
                          .useRawEnumValues(isUseRawEnumValues)
                          .reportDownloadTimeout(timeout)
                          .build();
                }
                reportingConfigs.add(reportingConfig);
              }
            }
          }
        }
      }
    }
    for (String version : versions) {
      for (ReportingConfiguration reportingConfig : reportingConfigs) {
        parameters.add(new Object[] {version, reportingConfig});
      }
    }
    // Also test the case where the reporting config is null.
    reportingConfigs.add(null);

    return parameters;
  }

  /**
   * Values for these arguments are supplied by the {@link #data()} method.
   *
   * @param version version of the AdWords API
   */
  public ReportRequestFactoryHelperTest(
      String version, ReportingConfiguration reportingConfiguration) {
    this.version = version;
    this.reportingConfiguration = reportingConfiguration;
  }

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);

    // Sets up mock behavior common to all tests.
    transport = createTransport(lowLevelRequest);
  }

  /** Verifies an instance can be obtained from AdWordsServices. */
  @Test
  public void testGetFromAdWordsServices() throws Exception {
    ReportRequestFactoryHelper helper =
        new GenericAdWordsServices()
            .getBootstrapper()
            .getInstanceOf(adWordsSession, ReportRequestFactoryHelper.class);
    assertNotNull("Helper from AdWordsServices is null", helper);
  }

  /** Tests the factory builds the request properly for this test's attributes. */
  @Test
  public void testGetHttpRequestFactory()
      throws ValidationException, AuthenticationException, IOException {
    final int timeoutFromLibConfig = 42;
    when(adWordsLibConfiguration.getReportDownloadTimeout()).thenReturn(timeoutFromLibConfig);
    AdWordsSession session =
        new AdWordsSession.Builder()
            .withDeveloperToken("foodevtoken")
            .withClientCustomerId("fooclientcustomerid")
            .withOAuth2Credential(credential)
            .withUserAgent("userAgent")
            .withReportingConfiguration(reportingConfiguration)
            .build();
    when(authorizationHeaderProvider.getAuthorizationHeader(session, ENDPOINT_URL.build()))
        .thenReturn("fooauthheader");
    when(userAgentCombiner.getUserAgent(anyString())).thenReturn("foouseragent");
    ReportRequestFactoryHelper helper =
        new ReportRequestFactoryHelper(
            session,
            authorizationHeaderProvider,
            userAgentCombiner,
            transport,
            adWordsLibConfiguration,
            reportResponseInterceptor);
    HttpRequestFactory requestFactory = helper.getHttpRequestFactory(ENDPOINT_URL.build(), version);

    HttpRequest request =
        requestFactory.buildPostRequest(
            ENDPOINT_URL, new AwqlReportBodyProvider("select 1", "csv").getHttpContent());
    HttpHeaders headers = request.getHeaders();
    assertEquals("foodevtoken", headers.get("developerToken"));
    assertEquals("fooauthheader", headers.getAuthorization());
    assertEquals("fooclientcustomerid", headers.get("clientCustomerId"));
    assertTrue((headers.getUserAgent()).contains("foouseragent"));

    if (reportingConfiguration == null) {
      assertFalse(
          "skipReportHeader should not be in the header if no reporting config is set",
          headers.containsKey("skipReportHeader"));
      assertFalse(
          "skipReportSummary should not be in the header if no reporting config is set",
          headers.containsKey("skipReportSummary"));
      assertEquals(
          "connect timeout is incorrect", timeoutFromLibConfig, request.getConnectTimeout());
      assertEquals("read timeout is incorrect", timeoutFromLibConfig, request.getReadTimeout());
    } else {
      Integer expectedTimeout = reportingConfiguration.getReportDownloadTimeout();
      if (expectedTimeout == null) {
        // Should fall back to the library level config value if the reporting config does not have
        // a timeout set.
        expectedTimeout = timeoutFromLibConfig;
      }
      assertEquals(
          "connect timeout is incorrect", expectedTimeout.intValue(), request.getConnectTimeout());
      assertEquals(
          "read timeout is incorrect", expectedTimeout.intValue(), request.getReadTimeout());
      assertEquals(
          "skipReportHeader not equal to the reporting config setting",
          toStringBoolean(reportingConfiguration.isSkipReportHeader()),
          headers.get("skipReportHeader"));
      assertEquals(
          "skipColumnHeader not equal to the reporting config setting",
          toStringBoolean(reportingConfiguration.isSkipColumnHeader()),
          headers.get("skipColumnHeader"));
      assertEquals(
          "skipReportSummary not equal to the reporting config setting",
          toStringBoolean(reportingConfiguration.isSkipReportSummary()),
          headers.get("skipReportSummary"));
      assertEquals(
          "includeZeroImpressions not equal to the reporting config setting",
          toStringBoolean(reportingConfiguration.isIncludeZeroImpressions()),
          headers.get("includeZeroImpressions"));
      assertEquals(
          "useRawEnumValues not equal to the reporting config setting",
          toStringBoolean(reportingConfiguration.isUseRawEnumValues()),
          headers.get("useRawEnumValues"));
    }
  }

  /** @return {@code null} if {@code bool == null}, else returns {@code toString} result. */
  private String toStringBoolean(@Nullable Boolean bool) {
    return bool == null ? null : Boolean.toString(bool);
  }

  private HttpTransport createTransport(final LowLevelHttpRequest request) {
    return new HttpTransport() {
      @Override
      protected LowLevelHttpRequest buildRequest(String method, String url) throws IOException {
        return request;
      }
    };
  }
}
