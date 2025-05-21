// Copyright 2025 Google LLC
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
 * UnsupportedCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202505;


/**
 * A {@code Creative} that isn't supported by this version of the
 * API. This object is readonly and
 *             when encountered should be reported on the Ad Manager
 * API forum.
 */
public class UnsupportedCreative  extends com.google.api.ads.admanager.axis.v202505.Creative  implements java.io.Serializable {
    /* The creative type that is unsupported by this API version. */
    private java.lang.String unsupportedCreativeType;

    public UnsupportedCreative() {
    }

    public UnsupportedCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.admanager.axis.v202505.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.admanager.axis.v202505.CreativePolicyViolation[] policyLabels,
           com.google.api.ads.admanager.axis.v202505.AppliedLabel[] appliedLabels,
           com.google.api.ads.admanager.axis.v202505.DateTime lastModifiedDateTime,
           com.google.api.ads.admanager.axis.v202505.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.admanager.axis.v202505.ThirdPartyDataDeclaration thirdPartyDataDeclaration,
           java.lang.Boolean adBadgingEnabled,
           java.lang.String unsupportedCreativeType) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            policyLabels,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            thirdPartyDataDeclaration,
            adBadgingEnabled);
        this.unsupportedCreativeType = unsupportedCreativeType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adBadgingEnabled", getAdBadgingEnabled())
            .add("advertiserId", getAdvertiserId())
            .add("appliedLabels", getAppliedLabels())
            .add("customFieldValues", getCustomFieldValues())
            .add("id", getId())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("policyLabels", getPolicyLabels())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .add("thirdPartyDataDeclaration", getThirdPartyDataDeclaration())
            .add("unsupportedCreativeType", getUnsupportedCreativeType())
            .toString();
    }

    /**
     * Gets the unsupportedCreativeType value for this UnsupportedCreative.
     * 
     * @return unsupportedCreativeType   * The creative type that is unsupported by this API version.
     */
    public java.lang.String getUnsupportedCreativeType() {
        return unsupportedCreativeType;
    }


    /**
     * Sets the unsupportedCreativeType value for this UnsupportedCreative.
     * 
     * @param unsupportedCreativeType   * The creative type that is unsupported by this API version.
     */
    public void setUnsupportedCreativeType(java.lang.String unsupportedCreativeType) {
        this.unsupportedCreativeType = unsupportedCreativeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnsupportedCreative)) return false;
        UnsupportedCreative other = (UnsupportedCreative) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.unsupportedCreativeType==null && other.getUnsupportedCreativeType()==null) || 
             (this.unsupportedCreativeType!=null &&
              this.unsupportedCreativeType.equals(other.getUnsupportedCreativeType())));
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
        if (getUnsupportedCreativeType() != null) {
            _hashCode += getUnsupportedCreativeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnsupportedCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "UnsupportedCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsupportedCreativeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "unsupportedCreativeType"));
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
