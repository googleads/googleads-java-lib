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
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.conf.AdWordsLibConfiguration;
import com.google.api.ads.common.lib.auth.AuthorizationHeaderProvider;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

/**
 * Tests functionality of the ReportRequestFactoryHelper.
 *
 * @author Kevin Winter
 * @author Joseph DiLallo
 */
@RunWith(JUnit4.class)
public class ReportRequestFactoryHelperTest {

  private static final GenericUrl ENDPOINT_URL = new GenericUrl("https://google.com/api/service");

  @Mock
  private AuthorizationHeaderProvider authorizationHeaderProvider;
  @Mock
  private UserAgentCombiner userAgentCombiner;
  @Mock
  private AdWordsInternals internals;
  @Mock
  private AdWordsSession adWordsSession;
  @Mock
  private AdWordsLibConfiguration adWordsLibConfiguration;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  /**
   * Verifies the constructor pulls fields out of Internals.
   */
  @Test
  public void testConstructor() throws Exception {
    when(internals.getAuthorizationHeaderProvider()).thenReturn(authorizationHeaderProvider);
    when(internals.getUserAgentCombiner()).thenReturn(userAgentCombiner);
    when(internals.getAdWordsLibConfiguration()).thenReturn(adWordsLibConfiguration);

    new ReportRequestFactoryHelper(adWordsSession, internals);

    verify(internals).getAuthorizationHeaderProvider();
    verify(internals).getUserAgentCombiner();
  }

  @Test
  public void testGetHttpRequestFactory() throws Exception {
    LowLevelHttpRequest lowLevelRequest = Mockito.mock(LowLevelHttpRequest.class);
    HttpTransport transport = createTransport(lowLevelRequest);
    when(internals.getHttpTransport()).thenReturn(transport);
    when(internals.getAuthorizationHeaderProvider()).thenReturn(authorizationHeaderProvider);
    when(internals.getUserAgentCombiner()).thenReturn(userAgentCombiner);
    when(internals.getAdWordsLibConfiguration()).thenReturn(adWordsLibConfiguration);
    when(adWordsLibConfiguration.getReportDownloadTimeout()).thenReturn(42);
    AdWordsSession session = new AdWordsSession.Builder().withDeveloperToken("foodevtoken")
        .withClientCustomerId("fooclientcustomerid").withClientLoginToken("fooclientlogintoken")
        .withUserAgent("userAgent")
        .build();
    when(authorizationHeaderProvider.getAuthorizationHeader(session, ENDPOINT_URL.build()))
        .thenReturn("GoogleLogin fooclientlogintoken");
    when(userAgentCombiner.getUserAgent(anyString())).thenReturn("foouseragent");
    ReportRequestFactoryHelper helper = new ReportRequestFactoryHelper(session, internals);
    HttpRequestFactory requestFactory = helper.getHttpRequestFactory(ENDPOINT_URL.build());
    HttpRequest request = requestFactory.buildPostRequest(
        ENDPOINT_URL, new AwqlReportBodyProvider("select 1", "csv").getHttpContent());
    assertEquals(42, request.getConnectTimeout());
    assertEquals(42, request.getReadTimeout());
    HttpHeaders headers = request.getHeaders();
    assertEquals("foodevtoken", headers.get("developerToken"));
    assertEquals("GoogleLogin fooclientlogintoken", headers.getAuthorization());
    assertEquals("fooclientcustomerid", headers.get("clientCustomerId"));
    assertTrue((headers.getUserAgent()).contains("foouseragent"));
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
