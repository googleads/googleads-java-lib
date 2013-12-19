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

import com.google.common.annotations.VisibleForTesting;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.EmptyStackException;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * A utility class that pretty prints XML messages.
 *
 * @author Joseph DiLallo
 */
public final class PrettyPrinter implements PrettyPrinterInterface {

  private static final String INDENT_AMOUNT = "4";
  private static Transformer transformer;

  /**
   * Default constructor.
   */
  public PrettyPrinter() {
    try {
      transformer = TransformerFactory.newInstance().newTransformer();
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", INDENT_AMOUNT);
    } catch (TransformerConfigurationException e) {
      AdsServiceLoggers.ADS_API_LIB_LOG.warn("Unable to initialize XML PrettyPrinter. Error: " + e);
    } catch (TransformerFactoryConfigurationError e) {
      AdsServiceLoggers.ADS_API_LIB_LOG.warn("Unable to initialize XML PrettyPrinter. Error: " + e);
    }
  }

  /**
   * Testable constructor.
   */
  @VisibleForTesting
  PrettyPrinter(Transformer transformer) {
    PrettyPrinter.transformer = transformer;
  }

  /**
   * Transforms XML into a pretty-printed format. If there is an error
   * initializing the PrettyPrinter or transforming the XML message, the raw XML
   * message will be returned.
   *
   * @param xml the XML message to be pretty printed
   * @return the given message in pretty-printed format
   */
  public String prettyPrint(String xml) {
    if (transformer != null) {
      try {
        StreamResult result = new StreamResult(new StringWriter());
        transformer.transform(new StreamSource(new StringReader(xml)), result);
        return result.getWriter().toString();
      } catch (TransformerException e) {
        AdsServiceLoggers.ADS_API_LIB_LOG.warn("Unable to pretty print XML: {}", xml);
        return xml;
      } catch (NullPointerException e) {
        AdsServiceLoggers.ADS_API_LIB_LOG.warn("Unable to pretty print XML: {}", xml);
        return xml;
      } catch (ArrayIndexOutOfBoundsException e) {
        AdsServiceLoggers.ADS_API_LIB_LOG.warn("Unable to pretty print XML: {}", xml);
        return xml;
      } catch (EmptyStackException e) {
        AdsServiceLoggers.ADS_API_LIB_LOG.warn("Unable to pretty print XML: {}", xml);
        return xml;
      }
    } else {
      return xml;
    }
  }
}
