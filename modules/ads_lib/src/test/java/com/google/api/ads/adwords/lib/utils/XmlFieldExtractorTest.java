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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.w3c.dom.Document;

import java.io.ByteArrayInputStream;
import java.util.Map;

/**
 * Test for {@link XmlFieldExtractor}.
 */
@RunWith(JUnit4.class)
public class XmlFieldExtractorTest {

  private static final String REPORT_DOWNLOAD_ERROR = "<?xml version=\"1.0\" encoding=\"UTF-8\" "
      + "standalone=\"yes\"?><reportDownloadError><ApiError><type>"
      + "ReportDefinitionError.INVALID_FIELD_NAME_FOR_REPORT</type>"
      + "<trigger>AdFormatt</trigger><fieldPath>foobar</fieldPath></ApiError>"
      + "</reportDownloadError>";


  @Test
  public void testGetDocument() throws Exception {
    XmlFieldExtractor converter = new XmlFieldExtractor();
    Document doc =
        converter.getDocument(new ByteArrayInputStream(REPORT_DOWNLOAD_ERROR.getBytes()));
    assertNotNull(doc);
    assertEquals("reportDownloadError", doc.getDocumentElement().getTagName());
  }

  @Test
  public void testExtract() throws Exception {
    Map<String, String> ret = new XmlFieldExtractor().extract(
        new ByteArrayInputStream(REPORT_DOWNLOAD_ERROR.getBytes()), new String[] {"trigger"});
    assertEquals("AdFormatt", ret.get("trigger"));
  }

  @Test
  public void testExtract_fieldNotInXml() throws Exception {
    Map<String, String> ret = new XmlFieldExtractor().extract(
        new ByteArrayInputStream(REPORT_DOWNLOAD_ERROR.getBytes()), new String[] {"foo"});
    assertNull(ret.get("foo"));
  }

  @Test
  public void testExtract_multipleFields() throws Exception {
    Map<String, String> ret = new XmlFieldExtractor().extract(
        new ByteArrayInputStream(REPORT_DOWNLOAD_ERROR.getBytes()),
        new String[] {"type", "trigger", "fieldPath"});
    assertEquals("ReportDefinitionError.INVALID_FIELD_NAME_FOR_REPORT", ret.get("type"));
    assertEquals("AdFormatt", ret.get("trigger"));
    assertEquals("foobar", ret.get("fieldPath"));
  }

  @Test
  public void testConvert_fieldNotInXml() throws Exception {
    Map<String, String> ret = new XmlFieldExtractor().extract(
        new ByteArrayInputStream(REPORT_DOWNLOAD_ERROR.getBytes()), new String[] {"foo"});
    assertEquals(0, ret.size());
  }
}
