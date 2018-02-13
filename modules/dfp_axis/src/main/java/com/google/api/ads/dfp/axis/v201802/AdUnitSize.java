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
 * AdUnitSize.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * An {@code AdUnitSize} represents the size of an ad in an ad unit.
 * This also represents
 *             the environment and companions of a particular ad in an
 * ad unit. In most cases, it is
 *             a simple size with just a width and a height (sometimes
 * representing an aspect ratio).
 */
public class AdUnitSize  implements java.io.Serializable {
    /* The permissible creative size that can be served inside this
     * ad unit. */
    private com.google.api.ads.dfp.axis.v201802.Size size;

    /* The environment type of the ad unit size. The default value
     * is
     *                 {@link EnvironmentType#BROWSER}. */
    private com.google.api.ads.dfp.axis.v201802.EnvironmentType environmentType;

    /* The companions for this ad unit size.
     *                 Companions are only valid if the environment is {@link
     * EnvironmentType#VIDEO_PLAYER}.
     *                 If the environment is {@link EnvironmentType#BROWSER}
     * including companions
     *                 results in an error. */
    private com.google.api.ads.dfp.axis.v201802.AdUnitSize[] companions;

    /* The full (including companion sizes, if applicable) display
     * string of the size,
     *                 e.g. {@code "300x250"} or {@code "300x250v (180x150)"} */
    private java.lang.String fullDisplayString;

    public AdUnitSize() {
    }

    public AdUnitSize(
           com.google.api.ads.dfp.axis.v201802.Size size,
           com.google.api.ads.dfp.axis.v201802.EnvironmentType environmentType,
           com.google.api.ads.dfp.axis.v201802.AdUnitSize[] companions,
           java.lang.String fullDisplayString) {
           this.size = size;
           this.environmentType = environmentType;
           this.companions = companions;
           this.fullDisplayString = fullDisplayString;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("companions", getCompanions())
            .add("environmentType", getEnvironmentType())
            .add("fullDisplayString", getFullDisplayString())
            .add("size", getSize())
            .toString();
    }

    /**
     * Gets the size value for this AdUnitSize.
     * 
     * @return size   * The permissible creative size that can be served inside this
     * ad unit.
     */
    public com.google.api.ads.dfp.axis.v201802.Size getSize() {
        return size;
    }


    /**
     * Sets the size value for this AdUnitSize.
     * 
     * @param size   * The permissible creative size that can be served inside this
     * ad unit.
     */
    public void setSize(com.google.api.ads.dfp.axis.v201802.Size size) {
        this.size = size;
    }


    /**
     * Gets the environmentType value for this AdUnitSize.
     * 
     * @return environmentType   * The environment type of the ad unit size. The default value
     * is
     *                 {@link EnvironmentType#BROWSER}.
     */
    public com.google.api.ads.dfp.axis.v201802.EnvironmentType getEnvironmentType() {
        return environmentType;
    }


    /**
     * Sets the environmentType value for this AdUnitSize.
     * 
     * @param environmentType   * The environment type of the ad unit size. The default value
     * is
     *                 {@link EnvironmentType#BROWSER}.
     */
    public void setEnvironmentType(com.google.api.ads.dfp.axis.v201802.EnvironmentType environmentType) {
        this.environmentType = environmentType;
    }


    /**
     * Gets the companions value for this AdUnitSize.
     * 
     * @return companions   * The companions for this ad unit size.
     *                 Companions are only valid if the environment is {@link
     * EnvironmentType#VIDEO_PLAYER}.
     *                 If the environment is {@link EnvironmentType#BROWSER}
     * including companions
     *                 results in an error.
     */
    public com.google.api.ads.dfp.axis.v201802.AdUnitSize[] getCompanions() {
        return companions;
    }


    /**
     * Sets the companions value for this AdUnitSize.
     * 
     * @param companions   * The companions for this ad unit size.
     *                 Companions are only valid if the environment is {@link
     * EnvironmentType#VIDEO_PLAYER}.
     *                 If the environment is {@link EnvironmentType#BROWSER}
     * including companions
     *                 results in an error.
     */
    public void setCompanions(com.google.api.ads.dfp.axis.v201802.AdUnitSize[] companions) {
        this.companions = companions;
    }

    public com.google.api.ads.dfp.axis.v201802.AdUnitSize getCompanions(int i) {
        return this.companions[i];
    }

    public void setCompanions(int i, com.google.api.ads.dfp.axis.v201802.AdUnitSize _value) {
        this.companions[i] = _value;
    }


    /**
     * Gets the fullDisplayString value for this AdUnitSize.
     * 
     * @return fullDisplayString   * The full (including companion sizes, if applicable) display
     * string of the size,
     *                 e.g. {@code "300x250"} or {@code "300x250v (180x150)"}
     */
    public java.lang.String getFullDisplayString() {
        return fullDisplayString;
    }


    /**
     * Sets the fullDisplayString value for this AdUnitSize.
     * 
     * @param fullDisplayString   * The full (including companion sizes, if applicable) display
     * string of the size,
     *                 e.g. {@code "300x250"} or {@code "300x250v (180x150)"}
     */
    public void setFullDisplayString(java.lang.String fullDisplayString) {
        this.fullDisplayString = fullDisplayString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdUnitSize)) return false;
        AdUnitSize other = (AdUnitSize) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.environmentType==null && other.getEnvironmentType()==null) || 
             (this.environmentType!=null &&
              this.environmentType.equals(other.getEnvironmentType()))) &&
            ((this.companions==null && other.getCompanions()==null) || 
             (this.companions!=null &&
              java.util.Arrays.equals(this.companions, other.getCompanions()))) &&
            ((this.fullDisplayString==null && other.getFullDisplayString()==null) || 
             (this.fullDisplayString!=null &&
              this.fullDisplayString.equals(other.getFullDisplayString())));
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
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getEnvironmentType() != null) {
            _hashCode += getEnvironmentType().hashCode();
        }
        if (getCompanions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompanions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompanions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFullDisplayString() != null) {
            _hashCode += getFullDisplayString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdUnitSize.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdUnitSize"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "environmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "EnvironmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "companions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdUnitSize"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullDisplayString");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "fullDisplayString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
