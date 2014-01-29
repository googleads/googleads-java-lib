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

import com.google.common.annotations.VisibleForTesting;

import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.Serializer;
import org.apache.commons.lang.SerializationException;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.xml.namespace.QName;

/**
 * Serializes an Axis generated class to XML suitable for ReportDownloads.
 *
 * @author Kevin Winter
 *
 * @param <T> Class we are serializing.
 */
public class AxisReportDefinitionSerializer<T> {

  /** Regular expression used to match attributes in xml tags. */
  private static final String REMOVE_ATTRIBUTES_REGEX =
      "( )?(xmlns|xsi):(\\w)+=\".*?\"|ns\\d:|<\\?xml.*?>";

  /** Regular expression used to remove self closing tags. */
  private static final String REMOVE_SELF_CLOSING_TAG = "<\\w+( )?/>";

  private final Class<T> clazz;

  /**
   * Constructs an axis serializer for the specified class.
   */
  public AxisReportDefinitionSerializer(Class<T> clazz) {
    this.clazz = clazz;
  }

  /**
   * Serializes the report.
   *
   * @throws SerializationException if we cannot serialize the object.
   */
  public String serialize(T reportDefinition) {
    try {
      QName xmlType = getXmlType();
      Serializer serializer = getSerializer(xmlType);
      StringWriter writer = new StringWriter();
      SerializationContext context = new SerializationContext(writer);
      serializer.serialize(
          xmlType, null, reportDefinition, context);
      return sanitize(writer.toString());
    } catch (IllegalArgumentException e) {
      throw new SerializationException("Could not serialize report.", e);
    } catch (SecurityException e) {
      throw new SerializationException("Could not serialize report.", e);
    } catch (IllegalAccessException e) {
      throw new SerializationException("Could not serialize report.", e);
    } catch (InvocationTargetException e) {
      throw new SerializationException("Could not serialize report.", e);
    } catch (NoSuchMethodException e) {
      throw new SerializationException("Could not serialize report.", e);
    } catch (IOException e) {
      throw new SerializationException("Could not serialize report.", e);
    }
  }

  /**
   * Uses reflection to get a axis Serializer.
   */
  @VisibleForTesting
  Serializer getSerializer(QName xmlType)
      throws SecurityException,
      NoSuchMethodException,
      IllegalArgumentException,
      IllegalAccessException,
      InvocationTargetException {
    Method getSerializer = clazz.getMethod("getSerializer", String.class, Class.class, QName.class);
    return (Serializer) getSerializer.invoke(null, "reportDefinition", clazz, xmlType);
  }

  /**
   * Uses reflection to get the QName XmlType.
   */
  @VisibleForTesting
  QName getXmlType()
      throws IllegalArgumentException,
      IllegalAccessException,
      InvocationTargetException,
      SecurityException,
      NoSuchMethodException {
    Method getTypeDesc = clazz.getMethod("getTypeDesc");
    TypeDesc typeDesc = (TypeDesc) getTypeDesc.invoke(null);
    return typeDesc.getXmlType();
  }

  /**
   * Sanitizes the xml by removing all attributes, all self-closed tags as well as renames the root
   * element to <reportDefinition>
   *
   * @param string to sanitize.
   * @return Sanitized xml string suitable to send to the report download server.
   */
  @VisibleForTesting
  String sanitize(String string) {
    string = string.replaceAll(REMOVE_ATTRIBUTES_REGEX, "");
    string = string.replaceAll(REMOVE_SELF_CLOSING_TAG, "");
    string = string.replaceAll("ReportDefinition", "reportDefinition");
    return string;
  }
}
