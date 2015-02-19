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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.utils.ReportRequest.RequestType;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.EnumSet;
import java.util.Set;

/**
 * Tests for {@link ReportBodyProviderFactory}.
 *
 * @author Josh Radcliff
 */
@RunWith(JUnit4.class)
public class ReportBodyProviderFactoryTest {

  private ReportBodyProviderFactory reportBodyProviderFactory;

  @Mock
  private ReportRequest reportRequest;

  public enum MockDownloadFormat {
    CSV
  }

  @Before
  public void setUp() throws Exception {
    reportBodyProviderFactory = new ReportBodyProviderFactory();
    MockitoAnnotations.initMocks(this);
    Mockito.<Enum<?>>when(reportRequest.getDownloadFormat()).thenReturn(MockDownloadFormat.CSV);
    when(reportRequest.getReportRequestString()).thenReturn("mock request string");
  }

  @Test
  public void testXmlRequestType() {
    when(reportRequest.getRequestType()).thenReturn(RequestType.XML);

    ReportBodyProvider reportBodyProvider =
        reportBodyProviderFactory.getReportBodyProvider(reportRequest);
    assertEquals("Should get a ReportDefintionReportBodyProvider",
        ReportDefinitionBodyProvider.class, reportBodyProvider.getClass());
  }

  @Test
  public void testAwqlRequestType() {
    when(reportRequest.getRequestType()).thenReturn(RequestType.AWQL);

    ReportBodyProvider reportBodyProvider =
        reportBodyProviderFactory.getReportBodyProvider(reportRequest);
    assertEquals("Should get an AwqlReportBodyProvider", AwqlReportBodyProvider.class,
        reportBodyProvider.getClass());
  }

  @Test(expected = NullPointerException.class)
  public void testNullRequestType() {
    reportBodyProviderFactory.getReportBodyProvider(reportRequest);
  }

  /**
   * Test that will detect if new instances are added to {@link RequestType} that are not covered by
   * the tests above.
   */
  @Test
  public void testOtherRequestTypes() {
    Set<RequestType> knownRequestTypes = EnumSet.of(RequestType.XML, RequestType.AWQL);
    for (RequestType requestType : RequestType.values()) {
      assertTrue("Unknown request type: " + requestType, knownRequestTypes.contains(requestType));
    }
  }
}
