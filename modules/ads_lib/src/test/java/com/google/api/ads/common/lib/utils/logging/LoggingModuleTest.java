// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.common.lib.utils.logging;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.google.api.ads.common.lib.utils.logging.LoggingModule.DocumentBuilderSupplier;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.ErrorListener;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.URIResolver;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link LoggingModule}.
 *
 * <p>Tests in this class <em>must</em> run in their own JVM, since the class setup modifies system
 * properties and static variables.
 */
@RunWith(JUnit4.class)
public class LoggingModuleTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  @BeforeClass
  public static void setUpClass() throws Exception {
    // Sets the system property that will make TransformerFactory.newInstance() return an instance
    // of the MockTransformerFactory defined in this class.
    System.setProperty(
        "javax.xml.transform.TransformerFactory", MockTransformerFactory.class.getName());
    // Sets the system property that will make DocumentBuilderFactory.newInstance() return an
    // instance of the MockDocumentBuilderFactory defined in this class.
    System.setProperty(
        "javax.xml.parsers.DocumentBuilderFactory", MockDocumentBuilderFactory.class.getName());
  }

  @Before
  public void setUp() {
    MockTransformerFactory.isThrowInConstructor = false;
    MockTransformerFactory.isThrowInNewTransformer = false;
    MockDocumentBuilderFactory.isThrowInConstructor = false;
    MockDocumentBuilderFactory.isThrowInNewDocumentBuilder = false;
  }

  /**
   * Verifies that if the {@link Transformer} does not support an output property, the resulting
   * {@link IllegalArgumentException} is ignored and the transformer supplier for {@link
   * LoggingModule} will still return the {@link Transformer}.
   */
  @Test
  public void testUnsupportedProperty_ignoresIllegalArgumentException() {
    LoggingModule.TransformerSupplier supplier = new LoggingModule.TransformerSupplier();
    // Fetches a Transformer from the supplier and confirms no exceptions are thrown and the
    // Transformer is not null, even though it is configured to throw an exception when certain
    // properties are set.
    Transformer transformer = supplier.get();
    assertNotNull("Factory returned a null transformer", transformer);
    // Verifies that setOutputProperty was actually called. If it wasn't, nothing was actually
    // tested.
    verify(transformer, atLeastOnce()).setOutputProperty(eq(OutputKeys.INDENT), anyString());
  }

  /**
   * Verifies that if the TransformerFactory throws a configuration error from {@code newInstance},
   * the supplier from the logging module will return {@code null}.
   */
  @Test
  public void testTransformerFactoryNewInstanceConfigError_returnsNull() {
    MockTransformerFactory.isThrowInConstructor = true;
    LoggingModule.TransformerSupplier supplier = new LoggingModule.TransformerSupplier();
    Transformer transformer = supplier.get();
    assertNull(
        "Supplier should have returned null when a configuration error is thrown", transformer);
  }

  /**
   * Verifies that if the TransformerFactory throws a configuration exception from {@code
   * newTransformer}, the supplier from the logging module will return {@code null}.
   */
  @Test
  public void testTransformerFactoryNewTransformerConfigException_returnsNull() {
    MockTransformerFactory.isThrowInNewTransformer = true;
    LoggingModule.TransformerSupplier supplier = new LoggingModule.TransformerSupplier();
    Transformer transformer = supplier.get();
    assertNull(
        "Supplier should have returned null when a configuration exception is thrown", transformer);
  }

  /**
   * Verifies that if the DocumentBuilderFactory throws a configuration error from {@code
   * newInstance}, the supplier from the logging module will return {@code null}.
   */
  @Test
  public void testDocumentBuilderFactoryNewInstanceConfigError_returnsNull() {
    MockDocumentBuilderFactory.isThrowInConstructor = true;
    LoggingModule.DocumentBuilderSupplier supplier = new DocumentBuilderSupplier();
    DocumentBuilder builder = supplier.get();
    assertNull("Supplier should have returned null when a configuration error is thrown", builder);
  }

  /**
   * Verifies that if the DocumentBuilderFactory throws a configuration exception from {@code
   * newDocumentBuilder}, the supplier from the logging module will return {@code null}.
   */
  @Test
  public void testDocumentBuilderFactoryNewDocumentBuilderConfigException_returnsNull() {
    MockDocumentBuilderFactory.isThrowInNewDocumentBuilder = true;
    LoggingModule.DocumentBuilderSupplier supplier = new DocumentBuilderSupplier();
    DocumentBuilder builder = supplier.get();
    assertNull(
        "Supplier should have returned null when a configuration exception is thrown", builder);
  }

  /**
   * Transformer factory implementation that returns a mock Transformer that will throw an {@link
   * IllegalArgumentException} when an attempt is made to set specific output properties.
   */
  public static class MockTransformerFactory extends TransformerFactory {

    /**
     * If true, the constructor will throw a {@link
     * javax.xml.transform.TransformerFactoryConfigurationError}.
     */
    private static boolean isThrowInConstructor = false;
    /**
     * If true, newTransformer will throw a {@link
     * javax.xml.transform.TransformerConfigurationException}.
     */
    private static boolean isThrowInNewTransformer = false;

    public MockTransformerFactory() {
      super();
      if (isThrowInConstructor) {
        throw new TransformerFactoryConfigurationError("Intentionally throwing config error");
      }
    }

    @Override
    public Transformer newTransformer(Source source) throws TransformerConfigurationException {
      return newTransformer();
    }

    @Override
    public Transformer newTransformer() throws TransformerConfigurationException {
      if (isThrowInNewTransformer) {
        throw new TransformerConfigurationException("Intentionally throwing config exception");
      }
      Transformer transformer = mock(Transformer.class);
      doThrow(IllegalArgumentException.class)
          .when(transformer)
          .setOutputProperty(eq(OutputKeys.INDENT), anyString());
      return transformer;
    }

    @Override
    public Templates newTemplates(Source source) throws TransformerConfigurationException {
      return null;
    }

    @Override
    public Source getAssociatedStylesheet(Source source, String media, String title, String charset)
        throws TransformerConfigurationException {
      return null;
    }

    @Override
    public void setURIResolver(URIResolver resolver) {}

    @Override
    public URIResolver getURIResolver() {
      return null;
    }

    @Override
    public void setFeature(String name, boolean value) throws TransformerConfigurationException {}

    @Override
    public boolean getFeature(String name) {
      return false;
    }

    @Override
    public void setAttribute(String name, Object value) {}

    @Override
    public Object getAttribute(String name) {
      return null;
    }

    @Override
    public void setErrorListener(ErrorListener listener) {}

    @Override
    public ErrorListener getErrorListener() {
      return null;
    }
  }

  /** {@link DocumentBuilderFactory} that returns a mock {@link DocumentBuilder} for tests. */
  public static class MockDocumentBuilderFactory extends DocumentBuilderFactory {

    /**
     * If true, the constructor will throw a {@link javax.xml.parsers.FactoryConfigurationError}.
     */
    private static boolean isThrowInConstructor = false;
    /** If true, newDocumentBuilder will throw a {@link ParserConfigurationException}. */
    private static boolean isThrowInNewDocumentBuilder = false;

    public MockDocumentBuilderFactory() {
      super();
      if (isThrowInConstructor) {
        throw new FactoryConfigurationError("Intentionally throwing config error");
      }
    }

    @Override
    public DocumentBuilder newDocumentBuilder() throws ParserConfigurationException {
      if (isThrowInNewDocumentBuilder) {
        throw new ParserConfigurationException("Intentionally throwing config exception");
      }
      DocumentBuilder documentBuilder = mock(DocumentBuilder.class);
      return documentBuilder;
    }

    @Override
    public void setAttribute(String name, Object value) {}

    @Override
    public Object getAttribute(String name) {
      return null;
    }

    @Override
    public void setFeature(String name, boolean value) throws ParserConfigurationException {}

    @Override
    public boolean getFeature(String name) throws ParserConfigurationException {
      return false;
    }
  }
}
