// Copyright 2011, Google Inc. All Rights Reserved.
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

import com.google.api.ads.common.lib.conf.AdsApiConfiguration;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import org.slf4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.EmptyStackException;

import javax.annotation.Nullable;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

/**
 * A utility class that pretty prints XML messages.
 */
public final class PrettyPrinter implements PrettyPrinterInterface {

  private final Logger libLogger;
  private final ImmutableList<String> sensitiveXPathStrings;
  private final Supplier<XPath> xpathSupplier;
  private final Supplier<Transformer> transformerSupplier;
  private final Supplier<DocumentBuilder> documentBuilderSupplier;

  /**
   * Default constructor used by Guice. Takes {@link Supplier} instances for {@link XPath},
   * {@link Transformer}, and {@link DocumentBuilder} because the corresponding factory objects are
   * <em>not</em> thread-safe. The Guice modules creating these suppliers should guarantee that the
   * {@link Supplier} <em>is</em> thread-safe, however.
   * 
   * @param adsApiConfiguration the API configuration
   * @param libLogger the logger to use for errors
   * @param xpathSupplier a thread-safe supplier of {@link XPath} objects
   * @param transformerSupplier a thread-safe supplier of {@link Transformer} objects
   * @param documentBuilderSupplier a thread-safe supplier of {@link DocumentBuilder} objects
   */
  @Inject
  public PrettyPrinter(
      AdsApiConfiguration adsApiConfiguration,
      @Named("libLogger") Logger libLogger,
      Supplier<XPath> xpathSupplier,
      Supplier<Transformer> transformerSupplier,
      Supplier<DocumentBuilder> documentBuilderSupplier) {
    String[] sensitiveXPathsArray = adsApiConfiguration.getSensitiveXPaths();
    this.sensitiveXPathStrings =
        sensitiveXPathsArray == null
            ? ImmutableList.<String>of()
            : ImmutableList.<String>copyOf(sensitiveXPathsArray);
    this.libLogger = libLogger;
    this.xpathSupplier = xpathSupplier;
    this.transformerSupplier = transformerSupplier;
    this.documentBuilderSupplier = documentBuilderSupplier;
  }

  /**
   * Transforms XML into a pretty-printed format with sensitive strings removed.
   * If there is an error initializing formatting the XML message, the formatting
   * step will be skipped and the unformatted XML with sensitive strings removed
   * will be returned. 
   *
   * @param xml the XML message to be pretty printed
   * @return the given message in pretty-printed format
   */
  @Override
  public String prettyPrint(String xml) {
    if (xml == null) {
      return xml;
    }
    Source xmlSource = sanitizeXml(xml);
    if (xmlSource == null) {
      xmlSource = new StreamSource(new StringReader(xml));
    }
    String formattedXml = formatXml(xmlSource);
    return formattedXml != null ? formattedXml : xml;
  }

  /**
   * Formats/pretty prints the XML source.
   *
   * @return the formatted XML if formatting succeeded, else null
   */
  private String formatXml(@Nullable Source xmlSource) {
    Transformer transformer = transformerSupplier.get();
    if (xmlSource != null && transformer != null) {
      try {
        StreamResult result = new StreamResult(new StringWriter());
        transformer.transform(xmlSource, result);
        return result.getWriter().toString();
      } catch (TransformerException e) {
        libLogger.warn("Unable to pretty print XML: {}", e);
      } catch (NullPointerException e) {
        libLogger.warn("Unable to pretty print XML: {}", e);
      } catch (ArrayIndexOutOfBoundsException e) {
        libLogger.warn("Unable to pretty print XML: {}", e);
      } catch (EmptyStackException e) {
        libLogger.warn("Unable to pretty print XML: {}", e);
      }
    }
    return null;
  }

  /**
   * Removes any sensitive information (such as an AdWords API developer token) from the provided
   * XML.
   *
   * @return a Source if sanitizing was successful, or null if unable to parse and sanitize the
   * provided XML
   */
  private Source sanitizeXml(@Nullable String xml) {
    if (xml != null && !sensitiveXPathStrings.isEmpty()) {
      try {
        DocumentBuilder documentBuilder = documentBuilderSupplier.get();
        XPath xpath = xpathSupplier.get();
        if (documentBuilder != null && xpath != null) {
          Document doc = documentBuilder.parse(new InputSource(new StringReader(xml)));
          for (String xpathString : sensitiveXPathStrings) {
            XPathExpression expr = xpath.compile(xpathString);
            Node node = (Node) expr.evaluate(doc, XPathConstants.NODE);
            if (node != null && node.getTextContent() != null) {
              node.setTextContent("REDACTED");
            }
          }
          return new DOMSource(doc);
        }
      } catch (SAXException e) {
        libLogger.warn("Unable to parse XML: {}", e);
      } catch (IOException e) {
        libLogger.warn("Unable to parse XML: {}", e);
      } catch (XPathExpressionException e) {
        libLogger.warn("Unable to parse XML: {}", e);
      }
    }
    return null;
  }
}
