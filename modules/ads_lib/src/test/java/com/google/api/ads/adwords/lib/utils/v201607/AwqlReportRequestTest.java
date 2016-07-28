// Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils.v201607;

import static org.junit.Assert.assertEquals;

import com.google.api.ads.adwords.lib.jaxb.v201607.DownloadFormat;
import com.google.api.ads.adwords.lib.utils.ReportRequest.RequestType;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link AwqlReportRequest}.
 */
@RunWith(JUnit4.class)
public class AwqlReportRequestTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {}

  @Test
  public void testConstructor_nullArgs_fails() {
    thrown.expect(NullPointerException.class);
    thrown.expectMessage("query");
    new AwqlReportRequest(null, null);
  }

  @Test
  public void testConstructor_nullQuery_fails() {
    thrown.expect(NullPointerException.class);
    thrown.expectMessage("query");
    new AwqlReportRequest(null, DownloadFormat.CSV);
  }

  @Test
  public void testConstructor_nullFormat_fails() {
    thrown.expect(NullPointerException.class);
    thrown.expectMessage("download format");
    new AwqlReportRequest("SELECT foo, bar", null);
  }

  @Test
  public void testGetRequestType() {
    AwqlReportRequest request = new AwqlReportRequest("SELECT foo, bar", DownloadFormat.CSV);
    assertEquals("Incorrect request type", RequestType.AWQL, request.getRequestType());
  }
}
