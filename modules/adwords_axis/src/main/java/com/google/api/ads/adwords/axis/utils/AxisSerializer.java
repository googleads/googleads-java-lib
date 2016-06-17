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

package com.google.api.ads.adwords.axis.utils;

import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.Serializer;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.xml.namespace.QName;

/**
 * Serializes an Axis generated class to XML.
 */
public class AxisSerializer {

  public <T extends Serializable> void serialize(
      T objectToSerialize, SerializationContext serializationContext) {
    try {
      QName xmlType = getXmlType(objectToSerialize.getClass());
      getSerializer(xmlType, objectToSerialize.getClass())
          .serialize(xmlType, null, objectToSerialize, serializationContext);
    } catch (Exception e) {
      throw new RuntimeException("Failed to serialize: " + objectToSerialize, e);
    }
  }
  
  /**
   * Uses reflection to get an Axis Serializer.
   */
  private <T extends Serializable> Serializer getSerializer(QName xmlType, Class<T> clazz)
      throws SecurityException,
      NoSuchMethodException,
      IllegalArgumentException,
      IllegalAccessException,
      InvocationTargetException {
    Method getSerializer = clazz.getMethod("getSerializer", String.class, Class.class, QName.class);
    return (Serializer) getSerializer.invoke(null, null, clazz, xmlType);
  }

  /**
   * Uses reflection to get the QName XmlType.
   */
  private <T extends Serializable> QName getXmlType(Class<T> clazz)
      throws IllegalArgumentException,
      IllegalAccessException,
      InvocationTargetException,
      SecurityException,
      NoSuchMethodException {
    Method getTypeDesc = clazz.getMethod("getTypeDesc");
    TypeDesc typeDesc = (TypeDesc) getTypeDesc.invoke(null);
    return typeDesc.getXmlType();
  }

}
