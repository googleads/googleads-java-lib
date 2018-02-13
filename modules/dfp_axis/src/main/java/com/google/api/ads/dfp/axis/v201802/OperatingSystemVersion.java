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
 * OperatingSystemVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents a specific version of an operating system.
 */
public class OperatingSystemVersion  extends com.google.api.ads.dfp.axis.v201802.Technology  implements java.io.Serializable {
    /* The operating system major version. */
    private java.lang.Integer majorVersion;

    /* The operating system minor version. */
    private java.lang.Integer minorVersion;

    /* The operating system micro version. */
    private java.lang.Integer microVersion;

    public OperatingSystemVersion() {
    }

    public OperatingSystemVersion(
           java.lang.Long id,
           java.lang.String name,
           java.lang.Integer majorVersion,
           java.lang.Integer minorVersion,
           java.lang.Integer microVersion) {
        super(
            id,
            name);
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
        this.microVersion = microVersion;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("id", getId())
            .add("majorVersion", getMajorVersion())
            .add("microVersion", getMicroVersion())
            .add("minorVersion", getMinorVersion())
            .add("name", getName())
            .toString();
    }

    /**
     * Gets the majorVersion value for this OperatingSystemVersion.
     * 
     * @return majorVersion   * The operating system major version.
     */
    public java.lang.Integer getMajorVersion() {
        return majorVersion;
    }


    /**
     * Sets the majorVersion value for this OperatingSystemVersion.
     * 
     * @param majorVersion   * The operating system major version.
     */
    public void setMajorVersion(java.lang.Integer majorVersion) {
        this.majorVersion = majorVersion;
    }


    /**
     * Gets the minorVersion value for this OperatingSystemVersion.
     * 
     * @return minorVersion   * The operating system minor version.
     */
    public java.lang.Integer getMinorVersion() {
        return minorVersion;
    }


    /**
     * Sets the minorVersion value for this OperatingSystemVersion.
     * 
     * @param minorVersion   * The operating system minor version.
     */
    public void setMinorVersion(java.lang.Integer minorVersion) {
        this.minorVersion = minorVersion;
    }


    /**
     * Gets the microVersion value for this OperatingSystemVersion.
     * 
     * @return microVersion   * The operating system micro version.
     */
    public java.lang.Integer getMicroVersion() {
        return microVersion;
    }


    /**
     * Sets the microVersion value for this OperatingSystemVersion.
     * 
     * @param microVersion   * The operating system micro version.
     */
    public void setMicroVersion(java.lang.Integer microVersion) {
        this.microVersion = microVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperatingSystemVersion)) return false;
        OperatingSystemVersion other = (OperatingSystemVersion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.majorVersion==null && other.getMajorVersion()==null) || 
             (this.majorVersion!=null &&
              this.majorVersion.equals(other.getMajorVersion()))) &&
            ((this.minorVersion==null && other.getMinorVersion()==null) || 
             (this.minorVersion!=null &&
              this.minorVersion.equals(other.getMinorVersion()))) &&
            ((this.microVersion==null && other.getMicroVersion()==null) || 
             (this.microVersion!=null &&
              this.microVersion.equals(other.getMicroVersion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMajorVersion() != null) {
            _hashCode += getMajorVersion().hashCode();
        }
        if (getMinorVersion() != null) {
            _hashCode += getMinorVersion().hashCode();
        }
        if (getMicroVersion() != null) {
            _hashCode += getMicroVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperatingSystemVersion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "OperatingSystemVersion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "majorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "minorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("microVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "microVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
