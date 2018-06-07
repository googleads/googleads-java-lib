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

package com.google.api.ads.adwords.lib.utils.v201806;

import static org.junit.Assert.assertEquals;

import com.google.api.ads.adwords.lib.jaxb.v201806.DownloadFormat;
import com.google.api.ads.adwords.lib.jaxb.v201806.ReportDefinition;
import com.google.api.ads.adwords.lib.utils.ReportRequest.RequestType;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link XmlReportDefinitionRequest}.
 */
@RunWith(JUnit4.class)
public class XmlReportDefinitionRequestTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {}

  @Test
  public void testConstructor_nullArgs_fails() {
    thrown.expect(NullPointerException.class);
    thrown.expectMessage("report definition");
    new XmlReportDefinitionRequest(null);
  }

  @Test
  public void testGetRequestType() {
    ReportDefinition reportDefinition = new ReportDefinition();
    reportDefinition.setDownloadFormat(DownloadFormat.GZIPPED_CSV);
    XmlReportDefinitionRequest request = new XmlReportDefinitionRequest(reportDefinition);
    assertEquals("Incorrect request type", RequestType.XML, request.getRequestType());
    assertEquals(
        "Incorrect download format", DownloadFormat.GZIPPED_CSV, request.getDownloadFormat());
  }
}
