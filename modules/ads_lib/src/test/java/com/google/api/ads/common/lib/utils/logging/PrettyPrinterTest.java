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

package com.google.api.ads.common.lib.utils.logging;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.conf.AdsApiConfiguration;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.EmptyStackException;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.builder.Input;
import org.xmlunit.diff.Diff;

/** Test for the {@link PrettyPrinter} class. */
@RunWith(JUnit4.class)
public class PrettyPrinterTest {

  @Mock private Supplier<XPath> xpathSupplier;
  @Mock private Supplier<DocumentBuilder> documentBuilderSupplier;
  @Mock private Supplier<Transformer> transformerSupplier;
  @Mock private AdsApiConfiguration adsApiConfiguration;
  @Mock private Logger logger;

  private static final String TEST_XML =
      "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Envelope>"
          + "<foo><bar><requestId>123456</requestId></bar></foo>"
          + "<larry>moe</larry>"
          + "</Envelope>";
  private static final String TEST_REQUEST_ID_XPATH = "/Envelope/foo/bar/requestId";
  private static final String TEST_SENSITIVE_XPATH = "/Envelope/larry";

  public PrettyPrinterTest() {}

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    when(xpathSupplier.get()).thenReturn(XPathFactory.newInstance().newXPath());
    when(documentBuilderSupplier.get())
        .thenReturn(DocumentBuilderFactory.newInstance().newDocumentBuilder());

    Transformer transformer = TransformerFactory.newInstance().newTransformer();
    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
    when(transformerSupplier.get()).thenReturn(transformer);

    when(adsApiConfiguration.getRequestIdXPath()).thenReturn(TEST_REQUEST_ID_XPATH);
  }

  /** Creates a new {@link PrettyPrinter} using this object's attributes. */
  private PrettyPrinter createPrettyPrinter() {
    PrettyPrinter prettyPrinter =
        new PrettyPrinter(
            adsApiConfiguration,
            logger,
            xpathSupplier,
            transformerSupplier,
            documentBuilderSupplier);
    return prettyPrinter;
  }

  /** Tests that unexpected exceptions in the transformer/format phase get logged correctly. */
  @Test
  public void testTransformerExceptions() throws TransformerException {
    String html =
        "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n<html><a></a></html>";
    List<Exception> exceptions =
        Lists.newArrayList(
            new NullPointerException(),
            new TransformerException("transformer exception"),
            new EmptyStackException());
    for (Exception exception : exceptions) {
      Transformer transformer = Mockito.mock(Transformer.class);
      Mockito.doThrow(exception)
          .when(transformer)
          .transform(Mockito.<Source>any(), Mockito.<Result>any());

      PrettyPrinter prettyPrinter =
          new PrettyPrinter(
              adsApiConfiguration,
              logger,
              xpathSupplier,
              Suppliers.ofInstance(transformer),
              documentBuilderSupplier);
      assertEquals(html, prettyPrinter.prettyPrint(html));
      verify(logger).warn("Unable to pretty print XML: {}", exception);
    }
  }

  /** Tests that unexpected exceptions in the sanitize phase get logged correctly. */
  @Test
  public void testSanitizeExceptions()
      throws IOException, SAXException, XPathExpressionException, ParserConfigurationException {
    List<Exception> exceptions =
        Lists.newArrayList(
            new SAXException(),
            new IOException(),
            new XPathExpressionException("sanitize exception"));

    when(adsApiConfiguration.getSensitiveXPaths()).thenReturn(new String[] {TEST_SENSITIVE_XPATH});

    for (Exception exception : exceptions) {
      // Depending on the type of exception, one of the following suppliers
      // will be replaced.
      Supplier<DocumentBuilder> documentBuilderSupplierOverride = this.documentBuilderSupplier;
      Supplier<XPath> xpathSupplierOverride = this.xpathSupplier;
      if (exception instanceof XPathExpressionException) {
        // If an XPathExpressionException, then mock the XPathExpression to throw the
        // exception.
        XPath xpath = Mockito.mock(XPath.class);
        XPathExpression xpathExpression = Mockito.mock(XPathExpression.class);
        Mockito.doThrow(exception)
            .when(xpathExpression)
            .evaluate(Mockito.any(), Mockito.<QName>any());
        when(xpath.compile(Mockito.anyString())).thenReturn(xpathExpression);
        xpathSupplierOverride = Suppliers.ofInstance(xpath);
      } else {
        // If not an XPathExpressionException, then mock the DocumentBuilder to throw
        // the exception.
        DocumentBuilder documentBuilder = Mockito.mock(DocumentBuilder.class);
        Mockito.doThrow(exception).when(documentBuilder).parse(Mockito.<InputSource>any());
        documentBuilderSupplierOverride = Suppliers.ofInstance(documentBuilder);
      }

      PrettyPrinter prettyPrinter =
          new PrettyPrinter(
              adsApiConfiguration,
              logger,
              xpathSupplierOverride,
              transformerSupplier,
              documentBuilderSupplierOverride);
      String prettyXml = prettyPrinter.prettyPrint(TEST_XML);
      assertNotEquals(
          "pretty XML should not be String.equals to the original (should be formatted)",
          TEST_XML,
          prettyXml);
      Source expected = Input.fromString(TEST_XML).build();
      Source actual = Input.fromString(prettyXml).build();
      Diff diff =
          DiffBuilder.compare(expected)
              .withTest(actual)
              .normalizeWhitespace()
              .checkForSimilar()
              .build();
      assertFalse(diff.hasDifferences());
    }
  }

  /** Tests that pretty printing works properly under normal circumstances. */
  @Test
  public void testPrettyPrint() throws SAXException, IOException, ParserConfigurationException {
    when(adsApiConfiguration.getSensitiveXPaths()).thenReturn(new String[] {TEST_SENSITIVE_XPATH});

    String prettyPrintedXml = createPrettyPrinter().prettyPrint(TEST_XML);
    String expectedXml = TEST_XML.replace("moe", "REDACTED");

    Source expected = Input.fromString(expectedXml).build();
    Source actual = Input.fromString(prettyPrintedXml).build();
    Diff diff =
        DiffBuilder.compare(expected)
            .withTest(actual)
            .normalizeWhitespace()
            .checkForSimilar()
            .build();
    assertFalse(diff.hasDifferences());
  }

  /**
   * Tests that when the Transformer supplier returns null, request ID is still extracted, but
   * formatting is skipped.
   */
  @Test
  public void testTransformerSupplierReturnsNull() {
    when(transformerSupplier.get()).thenReturn(null);
    String prettyPrintedXml = createPrettyPrinter().prettyPrint(TEST_XML);
    assertSame(
        "XML should not be formatted if Supplier<Transformer>.get returns null",
        TEST_XML,
        prettyPrintedXml);
  }

  /**
   * Tests that when the DocumentBuilder supplier returns null, request ID is not extracted, but
   * formatting still occurs.
   */
  @Test
  public void testDocumentBuilderSupplierReturnsNull() {
    when(documentBuilderSupplier.get()).thenReturn(null);
    String prettyPrintedXml = createPrettyPrinter().prettyPrint(TEST_XML);
    assertNotNull(prettyPrintedXml);
    assertNotEquals(
        "XML should still be formatted, even if Supplier<DocumentBuilder>.get returns null",
        TEST_XML,
        prettyPrintedXml);
  }

  /**
   * Tests that when the XPath supplier returns null, request ID is not extracted, but formatting
   * still occurs.
   */
  @Test
  public void testXPathSupplierReturnsNull() {
    when(xpathSupplier.get()).thenReturn(null);
    String prettyPrintedXml = createPrettyPrinter().prettyPrint(TEST_XML);
    assertNotNull(prettyPrintedXml);
    assertNotEquals(
        "XML should still be formatted, even if XPathSupplier.get returns null",
        TEST_XML,
        prettyPrintedXml);
  }
}
