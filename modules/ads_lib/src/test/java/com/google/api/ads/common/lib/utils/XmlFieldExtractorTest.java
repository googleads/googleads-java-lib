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

package com.google.api.ads.common.lib.utils;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.contains;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.same;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.xml.sax.SAXException;

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

  @Mock private Logger logger;
  private Supplier<DocumentBuilder> documentBuilderSupplier;
  private Supplier<XPath> xpathSupplier;
  private XmlFieldExtractor xmlFieldExtractor;
  
  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    documentBuilderSupplier =
        Suppliers.ofInstance(DocumentBuilderFactory.newInstance().newDocumentBuilder());
    xpathSupplier = Suppliers.ofInstance(XPathFactory.newInstance().newXPath());
    xmlFieldExtractor = new XmlFieldExtractor(logger, documentBuilderSupplier, xpathSupplier);
  }

  @Test
  public void testExtract_singleField() {
    Map<String, String> ret = xmlFieldExtractor.extract(
        new ByteArrayInputStream(REPORT_DOWNLOAD_ERROR.getBytes(UTF_8)), new String[] {"trigger"});
    assertEquals("AdFormatt", ret.get("trigger"));
  }

  @Test
  public void testExtract_fieldNotInXml() {
    Map<String, String> ret = xmlFieldExtractor.extract(
        new ByteArrayInputStream(REPORT_DOWNLOAD_ERROR.getBytes(UTF_8)), new String[] {"foo"});
    assertNull(ret.get("foo"));
  }

  @Test
  public void testExtract_multipleFields() {
    Map<String, String> ret = xmlFieldExtractor.extract(
        new ByteArrayInputStream(REPORT_DOWNLOAD_ERROR.getBytes(UTF_8)),
        new String[] {"type", "trigger", "fieldPath"});
    assertEquals("ReportDefinitionError.INVALID_FIELD_NAME_FOR_REPORT", ret.get("type"));
    assertEquals("AdFormatt", ret.get("trigger"));
    assertEquals("foobar", ret.get("fieldPath"));
  }

  @Test
  public void testConvert_fieldNotInXml_returnsEmptyMap() {
    Map<String, String> ret = xmlFieldExtractor.extract(
        new ByteArrayInputStream(REPORT_DOWNLOAD_ERROR.getBytes(UTF_8)), new String[] {"foo"});
    assertEquals(0, ret.size());
  }

  @Test
  public void testExtract_invalidXPath_returnsEmptyMap() {
    Map<String, String> ret =
        xmlFieldExtractor.extract(
            new ByteArrayInputStream(REPORT_DOWNLOAD_ERROR.getBytes(UTF_8)),
            new String[] {"not valid XPath"});
    assertEquals(0, ret.size());
    verify(logger, times(1)).warn(contains("not valid XPath"), isA(XPathExpressionException.class));
  }

  /**
   * Verifies that if the DocumentBuilder supplier returns null, the {@code extract} method will
   * return an empty map.
   */
  @Test
  public void testExtract_nullDocumentBuilder_returnsEmptyMap() {
    xmlFieldExtractor =
        new XmlFieldExtractor(logger, Suppliers.<DocumentBuilder>ofInstance(null), xpathSupplier);
    Map<String, String> ret =
        xmlFieldExtractor.extract(
            new ByteArrayInputStream(REPORT_DOWNLOAD_ERROR.getBytes(UTF_8)),
            new String[] {"trigger"});
    assertEquals(0, ret.size());
    verify(logger, times(1)).warn(contains("DocumentBuilder"));
  }

  @Test
  public void testExtract_IOExceptionThrown_returnsEmptyMap() throws IOException {
    InputStream mockInputStream = mock(InputStream.class);
    String message = "Intentionally throwing IOException";
    IOException exception = new IOException(message);
    when(mockInputStream.read()).thenThrow(exception);
    Map<String, String> ret = xmlFieldExtractor.extract(mockInputStream, new String[] {"trigger"});
    assertEquals(0, ret.size());
    verify(logger, times(1)).warn(contains("input"), same(exception));
  }

  @Test
  public void testExtract_invalidXml_returnsEmptyMap() {
    Map<String, String> ret =
        xmlFieldExtractor.extract(
            new ByteArrayInputStream("this is not XML".getBytes(UTF_8)), new String[] {"trigger"});
    assertEquals(0, ret.size());
    verify(logger, times(1)).warn(contains("XML"), isA(SAXException.class));
  }
}
