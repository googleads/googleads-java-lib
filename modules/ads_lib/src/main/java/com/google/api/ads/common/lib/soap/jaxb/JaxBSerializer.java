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

package com.google.api.ads.common.lib.soap.jaxb;

import org.apache.commons.lang.SerializationException;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

/**
 * Serializes a JAX-WS generated class to XML.
 *
 * @author Kevin Winter
 *
 * @param <T> Class we are serializing.
 */
public class JaxBSerializer<T> {

  private final Class<T> clazz;
  private final QName qname;
  private final JAXBContext jaxbContext;

  /**
   * Constructs a JAX-WS serializer for the specified class.
   *
   * @param clazz Class to serialize.
   * @param qname A QName representing the local name for the class - this will be used as the root
   *        tag name.
   */
  public JaxBSerializer(Class<T> clazz, QName qname) {
    this.clazz = clazz;
    this.qname = qname;
    try {
      this.jaxbContext = JAXBContext.newInstance(clazz);
    } catch (JAXBException e) {
      throw new SerializationException("Could not serialize object.", e);
    }
  }

  /**
   * Serializes the object.
   *
   * @throws SerializationException if we cannot serialize the object.
   */
  public String serialize(T object) {
    try {
      Marshaller marshaller = jaxbContext.createMarshaller();
      JAXBElement<T> element =
          new JAXBElement<T>(qname, clazz, object);
      StringWriter stringWriter = new StringWriter();
      marshaller.marshal(element, stringWriter);
      return stringWriter.toString();
    } catch (JAXBException e) {
      throw new SerializationException("Could not serialize object.", e);
    }
  }
}
