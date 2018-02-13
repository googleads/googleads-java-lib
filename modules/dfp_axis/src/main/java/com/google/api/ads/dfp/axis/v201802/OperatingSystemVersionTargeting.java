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
 * OperatingSystemVersionTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents operating system versions that are being targeted or
 * excluded by the {@link LineItem}.
 */
public class OperatingSystemVersionTargeting  implements java.io.Serializable {
    /* Operating system versions that are being targeted by the
     *                 {@link LineItem}. */
    private com.google.api.ads.dfp.axis.v201802.Technology[] targetedOperatingSystemVersions;

    /* Operating system versions that are being excluded by the
     *                 {@link LineItem}. */
    private com.google.api.ads.dfp.axis.v201802.Technology[] excludedOperatingSystemVersions;

    public OperatingSystemVersionTargeting() {
    }

    public OperatingSystemVersionTargeting(
           com.google.api.ads.dfp.axis.v201802.Technology[] targetedOperatingSystemVersions,
           com.google.api.ads.dfp.axis.v201802.Technology[] excludedOperatingSystemVersions) {
           this.targetedOperatingSystemVersions = targetedOperatingSystemVersions;
           this.excludedOperatingSystemVersions = excludedOperatingSystemVersions;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("excludedOperatingSystemVersions", getExcludedOperatingSystemVersions())
            .add("targetedOperatingSystemVersions", getTargetedOperatingSystemVersions())
            .toString();
    }

    /**
     * Gets the targetedOperatingSystemVersions value for this OperatingSystemVersionTargeting.
     * 
     * @return targetedOperatingSystemVersions   * Operating system versions that are being targeted by the
     *                 {@link LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.Technology[] getTargetedOperatingSystemVersions() {
        return targetedOperatingSystemVersions;
    }


    /**
     * Sets the targetedOperatingSystemVersions value for this OperatingSystemVersionTargeting.
     * 
     * @param targetedOperatingSystemVersions   * Operating system versions that are being targeted by the
     *                 {@link LineItem}.
     */
    public void setTargetedOperatingSystemVersions(com.google.api.ads.dfp.axis.v201802.Technology[] targetedOperatingSystemVersions) {
        this.targetedOperatingSystemVersions = targetedOperatingSystemVersions;
    }

    public com.google.api.ads.dfp.axis.v201802.Technology getTargetedOperatingSystemVersions(int i) {
        return this.targetedOperatingSystemVersions[i];
    }

    public void setTargetedOperatingSystemVersions(int i, com.google.api.ads.dfp.axis.v201802.Technology _value) {
        this.targetedOperatingSystemVersions[i] = _value;
    }


    /**
     * Gets the excludedOperatingSystemVersions value for this OperatingSystemVersionTargeting.
     * 
     * @return excludedOperatingSystemVersions   * Operating system versions that are being excluded by the
     *                 {@link LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.Technology[] getExcludedOperatingSystemVersions() {
        return excludedOperatingSystemVersions;
    }


    /**
     * Sets the excludedOperatingSystemVersions value for this OperatingSystemVersionTargeting.
     * 
     * @param excludedOperatingSystemVersions   * Operating system versions that are being excluded by the
     *                 {@link LineItem}.
     */
    public void setExcludedOperatingSystemVersions(com.google.api.ads.dfp.axis.v201802.Technology[] excludedOperatingSystemVersions) {
        this.excludedOperatingSystemVersions = excludedOperatingSystemVersions;
    }

    public com.google.api.ads.dfp.axis.v201802.Technology getExcludedOperatingSystemVersions(int i) {
        return this.excludedOperatingSystemVersions[i];
    }

    public void setExcludedOperatingSystemVersions(int i, com.google.api.ads.dfp.axis.v201802.Technology _value) {
        this.excludedOperatingSystemVersions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperatingSystemVersionTargeting)) return false;
        OperatingSystemVersionTargeting other = (OperatingSystemVersionTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedOperatingSystemVersions==null && other.getTargetedOperatingSystemVersions()==null) || 
             (this.targetedOperatingSystemVersions!=null &&
              java.util.Arrays.equals(this.targetedOperatingSystemVersions, other.getTargetedOperatingSystemVersions()))) &&
            ((this.excludedOperatingSystemVersions==null && other.getExcludedOperatingSystemVersions()==null) || 
             (this.excludedOperatingSystemVersions!=null &&
              java.util.Arrays.equals(this.excludedOperatingSystemVersions, other.getExcludedOperatingSystemVersions())));
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
        if (getTargetedOperatingSystemVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedOperatingSystemVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedOperatingSystemVersions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedOperatingSystemVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedOperatingSystemVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedOperatingSystemVersions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperatingSystemVersionTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "OperatingSystemVersionTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedOperatingSystemVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "targetedOperatingSystemVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Technology"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedOperatingSystemVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "excludedOperatingSystemVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Technology"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
