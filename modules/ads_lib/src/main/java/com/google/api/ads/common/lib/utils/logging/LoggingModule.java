// Copyright 2011 Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.utils.logging;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Supplier;
import com.google.inject.AbstractModule;
import com.google.inject.Provider;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;
import javax.annotation.concurrent.ThreadSafe;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Module for logging.
 */
public class LoggingModule extends AbstractModule {

  private final String loggerPrefix;

  /**
   * Constructor.
   *
   * @param loggerPrefix the logger prefix.
   */
  public LoggingModule(String loggerPrefix) {
    this.loggerPrefix = loggerPrefix;
  }

  @Override
  protected void configure() {
    bind(AdsServiceLoggers.class);
    // DocumentBuilderFactory is *not* guaranteed to be thread-safe.
    bind(new TypeLiteral<Supplier<DocumentBuilder>>(){}).to( 
        DocumentBuilderSupplier.class);
    // Transformer is *not* guaranteed to be thread-safe.
    bind(new TypeLiteral<Supplier<Transformer>>(){}).to( 
        TransformerSupplier.class);
    // XPathFactory is *not* guaranteed to be thread-safe.
    bind(new TypeLiteral<Supplier<XPath>>(){}).to( 
        XPathSupplier.class);
    bind(PrettyPrinterInterface.class).to(PrettyPrinter.class);
    bind(Logger.class)
        .annotatedWith(Names.named("libLogger")).toInstance(AdsServiceLoggers.ADS_API_LIB_LOG);
    configureLogger(loggerPrefix, "soapXmlLogger");
    configureLogger(loggerPrefix, "requestInfoLogger");
  }

  protected void configureLogger(String prefix, String name) {
    bind(Logger.class).annotatedWith(Names.named(name)).toProvider(
        new LoggerProvider(prefix, name)).asEagerSingleton();
  }
 
  /**
   * Thread-safe supplier for {@link XPath} objects. This is necessary because
   * {@link XPathFactory} is <em>not</em> thread-safe.
   */
  @ThreadSafe
  private static final class XPathSupplier implements Supplier<XPath> {
    @Override
    public XPath get() {
      return XPathFactory.newInstance().newXPath();
    }
  }

  /**
   * Thread-safe supplier for {@link DocumentBuilder} objects. This is necessary because {@link
   * DocumentBuilderFactory} is <em>not</em> thread-safe.
   */
  @ThreadSafe
  @VisibleForTesting
  static final class DocumentBuilderSupplier implements Supplier<DocumentBuilder> {
    @Override
    public DocumentBuilder get() {
      DocumentBuilderFactory factory;
      try {
        factory = DocumentBuilderFactory.newInstance();
      } catch (FactoryConfigurationError e) {
        AdsServiceLoggers.ADS_API_LIB_LOG.warn(
            "Unable to instantiate a DocumentBuilderFactory. Error: " + e);
        return null;
      }

      try {
        return factory.newDocumentBuilder();
      } catch (ParserConfigurationException e) {
        AdsServiceLoggers.ADS_API_LIB_LOG.warn(
            "Unable to obtain a new DocumentBuilder. Error: " + e);
        return null;
      }
    }
  }

  /**
   * Thread-safe supplier for {@link Transformer} objects. This is necessary because {@link
   * TransformerFactory} is <em>not</em> thread-safe.
   */
  @ThreadSafe
  @VisibleForTesting
  static final class TransformerSupplier implements Supplier<Transformer> {
    @Override
    public Transformer get() {
      TransformerFactory factory;
      try {
        factory = TransformerFactory.newInstance();
      } catch (TransformerFactoryConfigurationError e) {
        AdsServiceLoggers.ADS_API_LIB_LOG.warn(
            "Unable to instantiate a TransformerFactory. Error: ", e);
        return null;
      }

      Transformer transformer;
      try {
        transformer = factory.newTransformer();
      } catch (TransformerConfigurationException e) {
        AdsServiceLoggers.ADS_API_LIB_LOG.warn("Unable to obtain a new Transformer. Error: ", e);
        return null;
      }

      // An incorrectly implemented factory could return null.
      if (transformer == null) {
        AdsServiceLoggers.ADS_API_LIB_LOG.warn("TransformerFactory returned a null instance.");
        return null;
      }

      try {
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
      } catch (IllegalArgumentException e) {
        // Ignore this exception since it indicates that the transformer does not support indent or
        // indent amount. This will only affect log output formatting and is therefore non-critical.
        AdsServiceLoggers.ADS_API_LIB_LOG.debug(
            "[NON-CRITICAL] XML in log messages may not be indented properly because Transformer "
                + "implementation does not support one or more indent options.",
            e);
      }
      return transformer;
    }
  }

  /**
   * Provider for Loggers.
   */
  private static final class LoggerProvider implements Provider<Logger> {

    private final String loggerPrefix;
    private final String logType;

    /**
     * Constructor.
     *
     * @param loggerPrefix the logger prefix
     * @param logType the log type (i.e. soap_xml)
     */
    public LoggerProvider(String loggerPrefix, String logType) {
      this.loggerPrefix = loggerPrefix;
      this.logType = logType;
    }

    @Override
    public Logger get() {
      return LoggerFactory.getLogger(loggerPrefix + "." + logType);
    }
  }
}
