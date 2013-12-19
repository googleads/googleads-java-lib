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

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.annotation.Nullable;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

/**
 * Utility class to extract fields from XML.
 *
 * @author Kevin Winter
 */
public class XmlFieldExtractor {

  private static final Logger logger = LoggerFactory.getLogger(
      AdHocReportDownloadHelper.class.getPackage().getName() + ".report_download");

  private DocumentBuilder builder;
  private XPath xpath;

  /**
   * Constructor.
   */
  public XmlFieldExtractor() {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    try {
      builder = factory.newDocumentBuilder();
    } catch (ParserConfigurationException e) {
      throw new IllegalStateException("Couldn't construct a DocumentBuilder", e);
    }
    xpath = XPathFactory.newInstance().newXPath();
  }

  /**
   * Locates the target fields in the specified XML and uses a wildcard XPath to
   * identify the first matching node and return it in a map.
   *
   * For example, for the xml: {@code <xml><bar>BAR</bar></xml></code>} and
   * field "bar", this class return a map with key "bar" and value "BAR".
   *
   * @param xml Stream of XML to process
   * @param fields List of fields to look for.
   * @returns Mapping of fieldname to value (only if field was located and not null).
   */
  public Map<String, String> extract(InputStream xml, String[] fields) {
    Map<String, String> parsedFields = Maps.newHashMap();
    try {
      Document doc = getDocument(xml);
      for (String field : fields) {
        try {
          String value = extract(doc, field);
          if (value != null) {
            parsedFields.put(field, value);
          }
        } catch (XPathExpressionException e) {
          // Ignore problems with the xpath.
          logger.warn("While processing xml, XPath invalid.", e);
        }
      }
    } catch (SAXException e) {
      logger.error("Couldn't process XML into a Document", e);
    } catch (IOException e) {
      logger.error("Problem reading input stream", e);
    }
    return parsedFields;
  }

  /**
   * Runs a wildcard xpath (i.e. "//field") to locate the provided field in the
   * document and returns the text content of the first matching node.
   *
   * @param doc Document to process.
   * @param field Field to look for.
   * @return Text content of first matching node or null for no match.
   * @throws XPathExpressionException If expression is invalid.
   */
  @Nullable
  private String extract(Document doc, String field) throws XPathExpressionException {
    XPathExpression expr = xpath.compile("//" + field);
    NodeList nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
    if (nl.getLength() > 0) {
      return nl.item(0).getTextContent();
    }
    return null;
  }

  /**
   * Parses the provided input stream into a document.
   */
  @VisibleForTesting
  Document getDocument(InputStream is) throws SAXException, IOException {
    return builder.parse(is);
  }
}
