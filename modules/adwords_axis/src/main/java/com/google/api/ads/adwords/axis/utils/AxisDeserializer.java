// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.axis.utils;

import com.google.api.ads.adwords.lib.utils.BatchJobMutateResultInterface;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.io.ByteSource;

import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.encoding.DeserializationContext;
import org.apache.axis.encoding.TypeMapping;
import org.apache.axis.encoding.TypeMappingRegistry;
import org.apache.axis.encoding.TypeMappingRegistryImpl;
import org.apache.axis.encoding.ser.BaseDeserializerFactory;
import org.apache.axis.encoding.ser.BaseSerializerFactory;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;
import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.server.AxisServer;
import org.xml.sax.InputSource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import javax.xml.namespace.QName;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * Utility for deserializing XML to Axis objects. 
 */
public class AxisDeserializer {
  private static final String SOAP_START_BODY =
      "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" "
      + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" "
      + "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
      + "<soapenv:Body>";

  private static final String SOAP_END_BODY = "</soapenv:Body></soapenv:Envelope>";

  private static final String INDENT_AMOUNT = "4";
  private static final AtomicReference<Transformer> transformerRef =
      new AtomicReference<Transformer>();

  /**
   * Returns the static Transformer instance of this class. Lazily constructs (in a thread-safe
   * manner) the instance on the first invocation. This is not in a static initializer block because
   * any errors need to be reported back to the caller.
   */
  private static Transformer getTransformer()
      throws TransformerConfigurationException, TransformerFactoryConfigurationError {
    if (transformerRef.get() == null) {
      Transformer transformer = TransformerFactory.newInstance().newTransformer();
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", INDENT_AMOUNT);
      
      // Set the atomic reference, discarding the new instance if another thread set it already.
      transformerRef.compareAndSet(null, transformer);
    }
    return transformerRef.get();
  }
  
  /**
   * Downloads BatchJob results from a download URL and deserializes them into a list.
   *
   * @param url the download URL from the BatchJob.
   * @param serviceTypeMappings the TypeMapping collection from services whose operations
   * BatchJobService supports.
   * @param resultClass the class of the BatchJobMutateResultInterface for the SOAP kit and API
   * version.
   * @param resultQName the QName of the BatchJobMutateResultInterface for the SOAP kit and API
   * version.
   * @param operandClass the class of the Operand for the SOAP kit and API version.
   * @param operandQName the QName of the Operand for the SOAP kit and API version.
   * @return the collection of downloaded BatchJobMutateResultInterface objects.
   */
  public <OperandT, ApiErrorT,
      ResultT extends BatchJobMutateResultInterface<OperandT, ApiErrorT>> List<ResultT>
      deserializeBatchJobMutateResults(URL url, List<TypeMapping> serviceTypeMappings,
          Class<ResultT> resultClass, QName resultQName, Class<OperandT> operandClass,
          QName operandQName) throws Exception {
    List<ResultT> results = Lists.newArrayList();
    
    // Build a wrapped input stream from the response.
    InputStream wrappedStream = buildWrappedInputStream(url.openStream());
    
    // Construct an Axis deserialization context.
    DeserializationContext deserializationContext = new DeserializationContext(
        new InputSource(wrappedStream), new MessageContext(new AxisServer()), Message.RESPONSE);
    
    // Register all type mappings with the deserialization context's registry.
    TypeMappingRegistry mappingRegistry = addTypeMappingDelegates(
        deserializationContext.getTypeMappingRegistry(), serviceTypeMappings);
    mappingRegistry = addTypeMappingDelegate(
        mappingRegistry, operandClass, operandQName, deserializationContext.getEncodingStyle());

    // Parse the wrapped input stream.
    deserializationContext.parse();

    // Read the deserialized mutate results from the parsed stream.
    SOAPEnvelope envelope = deserializationContext.getEnvelope();
    MessageElement body = envelope.getFirstBody();

    for (Iterator<?> iter = body.getChildElements(); iter.hasNext();) {
      Object child = iter.next();
      MessageElement childElm = (MessageElement) child;
      @SuppressWarnings("unchecked")
      ResultT mutateResult = (ResultT) childElm.getValueAsType(resultQName, resultClass);
      results.add(mutateResult);
    }
    return results;
  }

  /**
   * Returns a new input stream that wraps the download input stream in a SOAP body so
   * it can be parsed by Axis.
   */
  private InputStream buildWrappedInputStream(InputStream downloadInputStream)
      throws TransformerException, IOException {

    // Pass the download input stream through a transformer that removes the XML
    // declaration.
    Transformer omitXmlDeclarationTransformer = getTransformer();
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    StreamResult streamResult = new StreamResult(outputStream);
    Source xmlSource = new StreamSource(downloadInputStream);
    omitXmlDeclarationTransformer.transform(xmlSource, streamResult);
    
    return ByteSource.concat(
        ByteSource.wrap(SOAP_START_BODY.getBytes()),
        ByteSource.wrap(outputStream.toByteArray()),
        ByteSource.wrap(SOAP_END_BODY.getBytes())).openStream();
  }

  /**
   * Adds to {@code startingRegistry} a new delegate that contains the list of
   * type mappings.
   * @param startingRegistry the registry to which a new delegate will be added.
   * @param typeMappings the type mappings to register.
   * @return the new delegate (the new end of the delegate chain).
   */
  private TypeMappingRegistry addTypeMappingDelegates(
      TypeMappingRegistry startingRegistry, List<TypeMapping> typeMappings) {
    Preconditions.checkNotNull(typeMappings, "Null type mappings");
    Preconditions.checkArgument(!typeMappings.isEmpty(), "Empty type mappings");

    TypeMappingRegistry lastRegistry =
        Preconditions.checkNotNull(startingRegistry, "Null starting registry");
    for (TypeMapping typeMapping : typeMappings) {
      TypeMappingRegistryImpl typeMappingReg = new TypeMappingRegistryImpl(false);
      typeMappingReg.registerDefault(typeMapping);
      lastRegistry.delegate(typeMappingReg);
      lastRegistry = typeMappingReg;
    }

    // Return the last registry for further delegate chaining.
    return lastRegistry;
  }

  /**
   * Adds to {@code prevRegistry} a new delegate that has the specified class and name
   * registered.
   *
   * @param prevRegistry the registry to which the new delegate will be added.
   * @param clazz the Class to register.
   * @param qname the QName for {@code clazz}.
   * @param encodingStyle the encoding style.
   * @return the new delegate (the new end of the delegate chain).
   */
  private TypeMappingRegistry addTypeMappingDelegate(
      TypeMappingRegistry prevRegistry, Class<?> clazz, QName qname, String encodingStyle) {
    Preconditions.checkNotNull(clazz, "Null class");
    Preconditions.checkNotNull(qname, "Null qname");

    // Create a new registry and register the class/qname.
    TypeMappingRegistryImpl newRegistry = new TypeMappingRegistryImpl(false);
    TypeMapping typeMapping = newRegistry.getOrMakeTypeMapping(encodingStyle);
    typeMapping.register(clazz, qname,
        BaseSerializerFactory.createFactory(BeanSerializerFactory.class, clazz, qname),
        BaseDeserializerFactory.createFactory(BeanDeserializerFactory.class, clazz, qname));
    newRegistry.registerDefault(typeMapping);

    // Validate post-condition.
    Preconditions.checkState(
        newRegistry.getOrMakeTypeMapping(encodingStyle).isRegistered(clazz, qname),
        "Class %s and QName %s failed to register", clazz, qname);

    // Add the new registry as a delegate of the previous registry.
    prevRegistry.delegate(newRegistry);

    // Return the new registry for further delegate chaining.
    return newRegistry;
  }
}
