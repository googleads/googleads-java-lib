// Copyright 2011 Google Inc. All Rights Reserved.

package com.google.api.ads.common.lib.utils.logging;

import com.google.common.base.Supplier;
import com.google.inject.AbstractModule;
import com.google.inject.Provider;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.concurrent.ThreadSafe;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

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
   * Thread-safe supplier for {@link DocumentBuilder} objects. This is necessary because
   * {@link DocumentBuilderFactory} is <em>not</em> thread-safe.
   */
  @ThreadSafe
  private static final class DocumentBuilderSupplier implements Supplier<DocumentBuilder> {
    @Override
    public DocumentBuilder get() {
      try {
        return DocumentBuilderFactory.newInstance().newDocumentBuilder();
      } catch (ParserConfigurationException e) {
        AdsServiceLoggers.ADS_API_LIB_LOG.warn("Unable to initialize DocumentBuilder. Error: " + e);
        return null;
      }
    }
  }

  /**
   * Thread-safe supplier for {@link Transformer} objects. This is necessary because
   * {@link TransformerFactory} is <em>not</em> thread-safe.
   */
  @ThreadSafe
  private static final class TransformerSupplier implements Supplier<Transformer> {
    @Override
    public Transformer get() {
      Transformer transformer;
      try {
        transformer = TransformerFactory.newInstance().newTransformer();
      } catch (TransformerConfigurationException e) {
        AdsServiceLoggers.ADS_API_LIB_LOG.warn("Unable to initialize Transformer. Error: " + e);
        return null;
      } catch (TransformerFactoryConfigurationError e) {
        AdsServiceLoggers.ADS_API_LIB_LOG.warn("Unable to initialize Transformer. Error: " + e);
        return null;
      }
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
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
