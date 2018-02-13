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
 * MobileApplicationTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Provides line items the ability to target or exclude users' mobile
 * applications.
 */
public class MobileApplicationTargeting  implements java.io.Serializable {
    /* The {@link MobileApplication#id IDs} that are being targeted
     * or excluded by the
     *                 {@link LineItem}. */
    private long[] mobileApplicationIds;

    /* Indicates whether mobile apps should be targeted or excluded.
     * This attribute is optional
     *                 and defaults to {@code true}. */
    private java.lang.Boolean isTargeted;

    public MobileApplicationTargeting() {
    }

    public MobileApplicationTargeting(
           long[] mobileApplicationIds,
           java.lang.Boolean isTargeted) {
           this.mobileApplicationIds = mobileApplicationIds;
           this.isTargeted = isTargeted;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("isTargeted", getIsTargeted())
            .add("mobileApplicationIds", getMobileApplicationIds())
            .toString();
    }

    /**
     * Gets the mobileApplicationIds value for this MobileApplicationTargeting.
     * 
     * @return mobileApplicationIds   * The {@link MobileApplication#id IDs} that are being targeted
     * or excluded by the
     *                 {@link LineItem}.
     */
    public long[] getMobileApplicationIds() {
        return mobileApplicationIds;
    }


    /**
     * Sets the mobileApplicationIds value for this MobileApplicationTargeting.
     * 
     * @param mobileApplicationIds   * The {@link MobileApplication#id IDs} that are being targeted
     * or excluded by the
     *                 {@link LineItem}.
     */
    public void setMobileApplicationIds(long[] mobileApplicationIds) {
        this.mobileApplicationIds = mobileApplicationIds;
    }

    public long getMobileApplicationIds(int i) {
        return this.mobileApplicationIds[i];
    }

    public void setMobileApplicationIds(int i, long _value) {
        this.mobileApplicationIds[i] = _value;
    }


    /**
     * Gets the isTargeted value for this MobileApplicationTargeting.
     * 
     * @return isTargeted   * Indicates whether mobile apps should be targeted or excluded.
     * This attribute is optional
     *                 and defaults to {@code true}.
     */
    public java.lang.Boolean getIsTargeted() {
        return isTargeted;
    }


    /**
     * Sets the isTargeted value for this MobileApplicationTargeting.
     * 
     * @param isTargeted   * Indicates whether mobile apps should be targeted or excluded.
     * This attribute is optional
     *                 and defaults to {@code true}.
     */
    public void setIsTargeted(java.lang.Boolean isTargeted) {
        this.isTargeted = isTargeted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileApplicationTargeting)) return false;
        MobileApplicationTargeting other = (MobileApplicationTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mobileApplicationIds==null && other.getMobileApplicationIds()==null) || 
             (this.mobileApplicationIds!=null &&
              java.util.Arrays.equals(this.mobileApplicationIds, other.getMobileApplicationIds()))) &&
            ((this.isTargeted==null && other.getIsTargeted()==null) || 
             (this.isTargeted!=null &&
              this.isTargeted.equals(other.getIsTargeted())));
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
        if (getMobileApplicationIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMobileApplicationIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMobileApplicationIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsTargeted() != null) {
            _hashCode += getIsTargeted().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileApplicationTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MobileApplicationTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileApplicationIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "mobileApplicationIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTargeted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isTargeted"));
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
