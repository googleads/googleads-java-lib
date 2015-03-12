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
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.client.reporting.ReportingConfiguration;
import com.google.api.ads.adwords.lib.conf.AdWordsLibConfiguration;
import com.google.api.ads.adwords.lib.utils.logging.AdWordsServiceLoggers;
import com.google.api.ads.adwords.lib.utils.logging.ReportServiceLogger;
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

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Tests functionality of the ReportRequestFactoryHelper.
 *
 * @author Kevin Winter
 * @author Joseph DiLallo
 */
@RunWith(Parameterized.class)
public class ReportRequestFactoryHelperTest {

  private static final GenericUrl ENDPOINT_URL = new GenericUrl("https://google.com/api/service");

  /** Version of the AdWords API. */
  private String version;

  /** The reporting configuration to use for the test. */
  private ReportingConfiguration reportingConfiguration;

  @Mock
  private AuthorizationHeaderProvider authorizationHeaderProvider;
  @Mock
  private Credential credential;
  @Mock
  private UserAgentCombiner userAgentCombiner;
  @Mock
  private AdWordsInternals internals;
  @Mock
  private AdWordsSession adWordsSession;
  @Mock
  private AdWordsLibConfiguration adWordsLibConfiguration;
  @Mock
  private AdWordsServiceLoggers adWordsServiceLoggers;
  @Mock
  private ReportServiceLogger reportServiceLogger;

  @Parameters
  public static Collection<Object[]> data() {
    Collection<Object[]> parameters = new ArrayList<Object[]>();
    Boolean[] booleanValues = new Boolean[]{ true, false, null };
    for (Boolean isSkipReportHeader : booleanValues) {
      for (Boolean isSkipReportSummary : booleanValues) {
        ReportingConfiguration reportingConfig = null;
        if (isSkipReportHeader != null || isSkipReportSummary != null) {
          reportingConfig = new ReportingConfiguration.Builder()
              .skipReportHeader(isSkipReportHeader)
              .skipReportSummary(isSkipReportSummary)
              .build();
        }
        parameters.add(new Object[] {"v201406", null});
        parameters.add(new Object[] {"v201406", reportingConfig});
        parameters.add(new Object[] {"v201409", null});
        parameters.add(new Object[] {"v201409", reportingConfig});
        parameters.add(new Object[] {"v201502", null});
        parameters.add(new Object[] {"v201502", reportingConfig});
        parameters.add(new Object[] {null, reportingConfig});
      }
    }

    return parameters;
  }
  
  /**
   * Values for these arguments are supplied by the {@link #data()} method.
   *
   * @param version version of the AdWords API
   */
  public ReportRequestFactoryHelperTest(String version,
      ReportingConfiguration reportingConfiguration) {
    this.version = version;
    this.reportingConfiguration = reportingConfiguration;
  }
  
  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    
    // Sets up mock behavior common to all tests.
    when(internals.getAuthorizationHeaderProvider()).thenReturn(authorizationHeaderProvider);
    when(internals.getUserAgentCombiner()).thenReturn(userAgentCombiner);
    when(internals.getAdWordsLibConfiguration()).thenReturn(adWordsLibConfiguration);
    when(internals.getAdWordsServiceLoggers()).thenReturn(adWordsServiceLoggers);
    when(adWordsServiceLoggers.getReportServiceLogger()).thenReturn(reportServiceLogger);
  }

  /**
   * Verifies the constructor pulls fields out of Internals.
   */
  @Test
  public void testConstructor() throws Exception {
    new ReportRequestFactoryHelper(adWordsSession, internals);

    verify(internals).getAuthorizationHeaderProvider();
    verify(internals).getUserAgentCombiner();
  }

  /**
   * Tests the factory builds the request properly for this test's attributes.
   */
  @Test
  public void testGetHttpRequestFactory()
      throws ValidationException, AuthenticationException, IOException {
    LowLevelHttpRequest lowLevelRequest = Mockito.mock(LowLevelHttpRequest.class);
    HttpTransport transport = createTransport(lowLevelRequest);
    when(internals.getHttpTransport()).thenReturn(transport);
    when(adWordsLibConfiguration.getReportDownloadTimeout()).thenReturn(42);
    AdWordsSession session = new AdWordsSession.Builder()
        .withDeveloperToken("foodevtoken")
        .withClientCustomerId("fooclientcustomerid")
        .withOAuth2Credential(credential)
        .withUserAgent("userAgent")
        .withReportingConfiguration(reportingConfiguration)
        .build();
    when(authorizationHeaderProvider.getAuthorizationHeader(session, ENDPOINT_URL.build()))
        .thenReturn("fooauthheader");
    when(userAgentCombiner.getUserAgent(anyString())).thenReturn("foouseragent");
    ReportRequestFactoryHelper helper = new ReportRequestFactoryHelper(session, internals);
    HttpRequestFactory requestFactory = helper.getHttpRequestFactory(ENDPOINT_URL.build(), version);

    HttpRequest request = requestFactory.buildPostRequest(
        ENDPOINT_URL, new AwqlReportBodyProvider("select 1", "csv").getHttpContent());
    assertEquals(42, request.getConnectTimeout());
    assertEquals(42, request.getReadTimeout());
    HttpHeaders headers = request.getHeaders();
    assertEquals("foodevtoken", headers.get("developerToken"));
    assertEquals("fooauthheader", headers.getAuthorization());
    assertEquals("fooclientcustomerid", headers.get("clientCustomerId"));
    assertTrue((headers.getUserAgent()).contains("foouseragent"));
    
    if (reportingConfiguration == null) {
      assertFalse("skipReportHeader should not be in the header if no reporting config is set",
          headers.containsKey("skipReportHeader"));
      assertFalse("skipReportSummary should not be in the header if no reporting config is set",
          headers.containsKey("skipReportSummary"));
    } else {
      String expectedSkipHeaderHeader =
          reportingConfiguration.isSkipReportHeader() != null
              ? Boolean.toString(reportingConfiguration.isSkipReportHeader())
              : null;
      String expectedSkipSummaryHeader =
          reportingConfiguration.isSkipReportSummary() != null
              ? Boolean.toString(reportingConfiguration.isSkipReportSummary())
              : null;
      assertEquals("skipReportHeader not equal to the reporting config setting",
          expectedSkipHeaderHeader, headers.get("skipReportHeader"));
      assertEquals("skipReportSummary not equal to the reporting config setting",
          expectedSkipSummaryHeader, headers.get("skipReportSummary"));
    }
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
