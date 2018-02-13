// Copyright 2018 Google Inc. All Rights Reserved.
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

/**
 * Size.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents the dimensions of an {@link AdUnit}, {@link LineItem}
 * or {@link Creative}.
 *             <p>
 *             For interstitial size (out-of-page), native, ignored and
 * fluid size, {@code Size} must be 1x1.
 */
public class Size  implements java.io.Serializable {
    /* The width of the {@link AdUnit}, {@link LineItem} or {@link
     * Creative}. */
    private java.lang.Integer width;

    /* The height of the {@link AdUnit}, {@link LineItem} or {@link
     * Creative}. */
    private java.lang.Integer height;

    /* True if this size represents an aspect ratio, false otherwise. */
    private java.lang.Boolean isAspectRatio;

    public Size() {
    }

    public Size(
           java.lang.Integer width,
           java.lang.Integer height,
           java.lang.Boolean isAspectRatio) {
           this.width = width;
           this.height = height;
           this.isAspectRatio = isAspectRatio;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("height", getHeight())
            .add("isAspectRatio", getIsAspectRatio())
            .add("width", getWidth())
            .toString();
    }

    /**
     * Gets the width value for this Size.
     * 
     * @return width   * The width of the {@link AdUnit}, {@link LineItem} or {@link
     * Creative}.
     */
    public java.lang.Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this Size.
     * 
     * @param width   * The width of the {@link AdUnit}, {@link LineItem} or {@link
     * Creative}.
     */
    public void setWidth(java.lang.Integer width) {
        this.width = width;
    }


    /**
     * Gets the height value for this Size.
     * 
     * @return height   * The height of the {@link AdUnit}, {@link LineItem} or {@link
     * Creative}.
     */
    public java.lang.Integer getHeight() {
        return height;
    }


    /**
     * Sets the height value for this Size.
     * 
     * @param height   * The height of the {@link AdUnit}, {@link LineItem} or {@link
     * Creative}.
     */
    public void setHeight(java.lang.Integer height) {
        this.height = height;
    }


    /**
     * Gets the isAspectRatio value for this Size.
     * 
     * @return isAspectRatio   * True if this size represents an aspect ratio, false otherwise.
     */
    public java.lang.Boolean getIsAspectRatio() {
        return isAspectRatio;
    }


    /**
     * Sets the isAspectRatio value for this Size.
     * 
     * @param isAspectRatio   * True if this size represents an aspect ratio, false otherwise.
     */
    public void setIsAspectRatio(java.lang.Boolean isAspectRatio) {
        this.isAspectRatio = isAspectRatio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Size)) return false;
        Size other = (Size) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.isAspectRatio==null && other.getIsAspectRatio()==null) || 
             (this.isAspectRatio!=null &&
              this.isAspectRatio.equals(other.getIsAspectRatio())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getIsAspectRatio() != null) {
            _hashCode += getIsAspectRatio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Size.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Size"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAspectRatio");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isAspectRatio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
