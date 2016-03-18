// Copyright 2015 Google Inc. All Rights Reserved.
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

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;

/**
 * Deserializes XML to an instance of a JAX-WS generated class.
 *
 * @param <T> Class we are deserializing.
 */
public class JaxBDeserializer<T> {

  private final Class<T> clazz;
  private final JAXBContext jaxbContext;

  /**
   * Constructs a JAX-WS deserializer for the specified class.
   *
   * @param clazz Class to deserialize.
   * @throws SerializationException if unable to construct the deserializer.
   */
  public JaxBDeserializer(Class<T> clazz) {
    this.clazz = clazz;
    try {
      this.jaxbContext = JAXBContext.newInstance(clazz);
    } catch (JAXBException e) {
      throw new SerializationException(
          String.format("Could not construct deserializer for class: %s.", clazz), e);
    }
  }

  /**
   * Deserializes the object.
   *
   * @throws SerializationException if we cannot deserialize the object.
   */
  public T deserialize(Source source) {
    try {
      Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
      JAXBElement<T> jaxbElement = unmarshaller.unmarshal(source, clazz);
      return jaxbElement.getValue();
    } catch (JAXBException e) {
      throw new SerializationException(
          String.format("Could not deserialize %s object from source %s.", clazz, source), e);
    }
  }
}
