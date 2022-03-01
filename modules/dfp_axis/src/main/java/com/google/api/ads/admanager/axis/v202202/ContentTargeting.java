// Copyright 2022 Google LLC
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
 * ContentTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202202;

public class ContentTargeting  implements java.io.Serializable {
    private long[] targetedContentIds;

    private long[] excludedContentIds;

    private long[] targetedVideoContentBundleIds;

    private long[] excludedVideoContentBundleIds;

    public ContentTargeting() {
    }

    public ContentTargeting(
           long[] targetedContentIds,
           long[] excludedContentIds,
           long[] targetedVideoContentBundleIds,
           long[] excludedVideoContentBundleIds) {
           this.targetedContentIds = targetedContentIds;
           this.excludedContentIds = excludedContentIds;
           this.targetedVideoContentBundleIds = targetedVideoContentBundleIds;
           this.excludedVideoContentBundleIds = excludedVideoContentBundleIds;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("excludedContentIds", getExcludedContentIds())
            .add("excludedVideoContentBundleIds", getExcludedVideoContentBundleIds())
            .add("targetedContentIds", getTargetedContentIds())
            .add("targetedVideoContentBundleIds", getTargetedVideoContentBundleIds())
            .toString();
    }

    /**
     * Gets the targetedContentIds value for this ContentTargeting.
     * 
     * @return targetedContentIds
     */
    public long[] getTargetedContentIds() {
        return targetedContentIds;
    }


    /**
     * Sets the targetedContentIds value for this ContentTargeting.
     * 
     * @param targetedContentIds
     */
    public void setTargetedContentIds(long[] targetedContentIds) {
        this.targetedContentIds = targetedContentIds;
    }

    public long getTargetedContentIds(int i) {
        return this.targetedContentIds[i];
    }

    public void setTargetedContentIds(int i, long _value) {
        this.targetedContentIds[i] = _value;
    }


    /**
     * Gets the excludedContentIds value for this ContentTargeting.
     * 
     * @return excludedContentIds
     */
    public long[] getExcludedContentIds() {
        return excludedContentIds;
    }


    /**
     * Sets the excludedContentIds value for this ContentTargeting.
     * 
     * @param excludedContentIds
     */
    public void setExcludedContentIds(long[] excludedContentIds) {
        this.excludedContentIds = excludedContentIds;
    }

    public long getExcludedContentIds(int i) {
        return this.excludedContentIds[i];
    }

    public void setExcludedContentIds(int i, long _value) {
        this.excludedContentIds[i] = _value;
    }


    /**
     * Gets the targetedVideoContentBundleIds value for this ContentTargeting.
     * 
     * @return targetedVideoContentBundleIds
     */
    public long[] getTargetedVideoContentBundleIds() {
        return targetedVideoContentBundleIds;
    }


    /**
     * Sets the targetedVideoContentBundleIds value for this ContentTargeting.
     * 
     * @param targetedVideoContentBundleIds
     */
    public void setTargetedVideoContentBundleIds(long[] targetedVideoContentBundleIds) {
        this.targetedVideoContentBundleIds = targetedVideoContentBundleIds;
    }

    public long getTargetedVideoContentBundleIds(int i) {
        return this.targetedVideoContentBundleIds[i];
    }

    public void setTargetedVideoContentBundleIds(int i, long _value) {
        this.targetedVideoContentBundleIds[i] = _value;
    }


    /**
     * Gets the excludedVideoContentBundleIds value for this ContentTargeting.
     * 
     * @return excludedVideoContentBundleIds
     */
    public long[] getExcludedVideoContentBundleIds() {
        return excludedVideoContentBundleIds;
    }


    /**
     * Sets the excludedVideoContentBundleIds value for this ContentTargeting.
     * 
     * @param excludedVideoContentBundleIds
     */
    public void setExcludedVideoContentBundleIds(long[] excludedVideoContentBundleIds) {
        this.excludedVideoContentBundleIds = excludedVideoContentBundleIds;
    }

    public long getExcludedVideoContentBundleIds(int i) {
        return this.excludedVideoContentBundleIds[i];
    }

    public void setExcludedVideoContentBundleIds(int i, long _value) {
        this.excludedVideoContentBundleIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentTargeting)) return false;
        ContentTargeting other = (ContentTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedContentIds==null && other.getTargetedContentIds()==null) || 
             (this.targetedContentIds!=null &&
              java.util.Arrays.equals(this.targetedContentIds, other.getTargetedContentIds()))) &&
            ((this.excludedContentIds==null && other.getExcludedContentIds()==null) || 
             (this.excludedContentIds!=null &&
              java.util.Arrays.equals(this.excludedContentIds, other.getExcludedContentIds()))) &&
            ((this.targetedVideoContentBundleIds==null && other.getTargetedVideoContentBundleIds()==null) || 
             (this.targetedVideoContentBundleIds!=null &&
              java.util.Arrays.equals(this.targetedVideoContentBundleIds, other.getTargetedVideoContentBundleIds()))) &&
            ((this.excludedVideoContentBundleIds==null && other.getExcludedVideoContentBundleIds()==null) || 
             (this.excludedVideoContentBundleIds!=null &&
              java.util.Arrays.equals(this.excludedVideoContentBundleIds, other.getExcludedVideoContentBundleIds())));
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
        if (getTargetedContentIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedContentIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedContentIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedContentIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedContentIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedContentIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetedVideoContentBundleIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedVideoContentBundleIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedVideoContentBundleIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedVideoContentBundleIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedVideoContentBundleIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedVideoContentBundleIds(), i);
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
        new org.apache.axis.description.TypeDesc(ContentTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "ContentTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedContentIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "targetedContentIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedContentIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "excludedContentIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedVideoContentBundleIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "targetedVideoContentBundleIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedVideoContentBundleIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "excludedVideoContentBundleIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
