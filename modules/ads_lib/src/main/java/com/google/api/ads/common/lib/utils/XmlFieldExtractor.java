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

import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import org.slf4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.annotation.Nullable;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

/**
 * Utility class to extract fields from XML.
 */
public class XmlFieldExtractor {

  private final Logger logger;
  private final Supplier<DocumentBuilder> documentBuilderSupplier;
  private final Supplier<XPath> xpathSupplier;

  @Inject
  public XmlFieldExtractor(
      @Named("soapXmlLogger") Logger soapXmlLogger,
      Supplier<DocumentBuilder> documentBuilderSupplier,
      Supplier<XPath> xpathSupplier) {
    this.documentBuilderSupplier = documentBuilderSupplier;
    this.xpathSupplier = xpathSupplier;
    this.logger = soapXmlLogger;
  }

  /**
   * Locates the target fields in the specified XML and uses a wildcard XPath to
   * identify the first matching node and return it in a map.
   *
   * <p>For example, for the xml: {@code <xml><bar>BAR</bar></xml></code>} and
   * field "bar", this class return a map with key "bar" and value "BAR".
   *
   * @param xml Stream of XML to process.
   * @param fields List of fields to look for.
   * @return Non-null map of fieldname to value. Will only contain entries for fields found
   * in the stream.
   */
  public Map<String, String> extract(InputStream xml, String[] fields) {
    Map<String, String> parsedFields = Maps.newHashMap();
    try {
      DocumentBuilder documentBuilder = documentBuilderSupplier.get();
      if (documentBuilder == null) {
        logger.warn("Could not create DocumentBuilder");
        return parsedFields;
      }
      Document doc = documentBuilder.parse(xml);
      for (String field : fields) {
        try {
          String value = extract(doc, field);
          if (value != null) {
            parsedFields.put(field, value);
          }
        } catch (XPathExpressionException e) {
          // Ignore problems with the xpath.
          logger.warn("Invalid XPath: " + field, e);
        }
      }
    } catch (SAXException e) {
      logger.warn("Couldn't process XML into a Document", e);
    } catch (IOException e) {
      logger.warn("Problem reading input stream", e);
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
    XPathExpression expr = xpathSupplier.get().compile("//" + field);
    NodeList nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
    if (nl.getLength() > 0) {
      return nl.item(0).getTextContent();
    }
    return null;
  }
}
