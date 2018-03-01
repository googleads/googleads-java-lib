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
 * ExtensionSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * A setting specifying when and which extensions should serve at
 * a given level (customer, campaign,
 *             or ad group).
 */
public class ExtensionSetting  implements java.io.Serializable {
    /* The list of feed items to add or modify. */
    private com.google.api.ads.adwords.axis.v201802.cm.ExtensionFeedItem[] extensions;

    /* Any platform (desktop, mobile) restrictions for feed items
     * being served. If set to DESKTOP or
     *                 MOBILE, only those feed items with the appropriate
     * device preference or no device preference
     *                 will serve. */
    private com.google.api.ads.adwords.axis.v201802.cm.ExtensionSettingPlatform platformRestrictions;

    public ExtensionSetting() {
    }

    public ExtensionSetting(
           com.google.api.ads.adwords.axis.v201802.cm.ExtensionFeedItem[] extensions,
           com.google.api.ads.adwords.axis.v201802.cm.ExtensionSettingPlatform platformRestrictions) {
           this.extensions = extensions;
           this.platformRestrictions = platformRestrictions;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("extensions", getExtensions())
            .add("platformRestrictions", getPlatformRestrictions())
            .toString();
    }

    /**
     * Gets the extensions value for this ExtensionSetting.
     * 
     * @return extensions   * The list of feed items to add or modify.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ExtensionFeedItem[] getExtensions() {
        return extensions;
    }


    /**
     * Sets the extensions value for this ExtensionSetting.
     * 
     * @param extensions   * The list of feed items to add or modify.
     */
    public void setExtensions(com.google.api.ads.adwords.axis.v201802.cm.ExtensionFeedItem[] extensions) {
        this.extensions = extensions;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.ExtensionFeedItem getExtensions(int i) {
        return this.extensions[i];
    }

    public void setExtensions(int i, com.google.api.ads.adwords.axis.v201802.cm.ExtensionFeedItem _value) {
        this.extensions[i] = _value;
    }


    /**
     * Gets the platformRestrictions value for this ExtensionSetting.
     * 
     * @return platformRestrictions   * Any platform (desktop, mobile) restrictions for feed items
     * being served. If set to DESKTOP or
     *                 MOBILE, only those feed items with the appropriate
     * device preference or no device preference
     *                 will serve.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ExtensionSettingPlatform getPlatformRestrictions() {
        return platformRestrictions;
    }


    /**
     * Sets the platformRestrictions value for this ExtensionSetting.
     * 
     * @param platformRestrictions   * Any platform (desktop, mobile) restrictions for feed items
     * being served. If set to DESKTOP or
     *                 MOBILE, only those feed items with the appropriate
     * device preference or no device preference
     *                 will serve.
     */
    public void setPlatformRestrictions(com.google.api.ads.adwords.axis.v201802.cm.ExtensionSettingPlatform platformRestrictions) {
        this.platformRestrictions = platformRestrictions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtensionSetting)) return false;
        ExtensionSetting other = (ExtensionSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extensions==null && other.getExtensions()==null) || 
             (this.extensions!=null &&
              java.util.Arrays.equals(this.extensions, other.getExtensions()))) &&
            ((this.platformRestrictions==null && other.getPlatformRestrictions()==null) || 
             (this.platformRestrictions!=null &&
              this.platformRestrictions.equals(other.getPlatformRestrictions())));
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
        if (getExtensions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtensions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtensions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlatformRestrictions() != null) {
            _hashCode += getPlatformRestrictions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtensionSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ExtensionSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ExtensionFeedItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platformRestrictions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "platformRestrictions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ExtensionSetting.Platform"));
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
