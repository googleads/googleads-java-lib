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
 * BaseImageRedirectCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202205;


/**
 * The base type for creatives that load an image asset from a specified
 * URL.
 */
public abstract class BaseImageRedirectCreative  extends com.google.api.ads.admanager.axis.v202205.HasDestinationUrlCreative  implements java.io.Serializable {
    /* The URL where the actual asset resides. This attribute is required
     * and has a maximum length of
     *                     1024 characters. */
    private java.lang.String imageUrl;

    public BaseImageRedirectCreative() {
    }

    public BaseImageRedirectCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.admanager.axis.v202205.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.admanager.axis.v202205.CreativePolicyViolation[] policyLabels,
           com.google.api.ads.admanager.axis.v202205.AppliedLabel[] appliedLabels,
           com.google.api.ads.admanager.axis.v202205.DateTime lastModifiedDateTime,
           com.google.api.ads.admanager.axis.v202205.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.admanager.axis.v202205.ThirdPartyDataDeclaration thirdPartyDataDeclaration,
           java.lang.String destinationUrl,
           com.google.api.ads.admanager.axis.v202205.DestinationUrlType destinationUrlType,
           java.lang.String imageUrl) {
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
            destinationUrl,
            destinationUrlType);
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiserId", getAdvertiserId())
            .add("appliedLabels", getAppliedLabels())
            .add("customFieldValues", getCustomFieldValues())
            .add("destinationUrl", getDestinationUrl())
            .add("destinationUrlType", getDestinationUrlType())
            .add("id", getId())
            .add("imageUrl", getImageUrl())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("policyLabels", getPolicyLabels())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .add("thirdPartyDataDeclaration", getThirdPartyDataDeclaration())
            .toString();
    }

    /**
     * Gets the imageUrl value for this BaseImageRedirectCreative.
     * 
     * @return imageUrl   * The URL where the actual asset resides. This attribute is required
     * and has a maximum length of
     *                     1024 characters.
     */
    public java.lang.String getImageUrl() {
        return imageUrl;
    }


    /**
     * Sets the imageUrl value for this BaseImageRedirectCreative.
     * 
     * @param imageUrl   * The URL where the actual asset resides. This attribute is required
     * and has a maximum length of
     *                     1024 characters.
     */
    public void setImageUrl(java.lang.String imageUrl) {
        this.imageUrl = imageUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseImageRedirectCreative)) return false;
        BaseImageRedirectCreative other = (BaseImageRedirectCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.imageUrl==null && other.getImageUrl()==null) || 
             (this.imageUrl!=null &&
              this.imageUrl.equals(other.getImageUrl())));
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
        if (getImageUrl() != null) {
            _hashCode += getImageUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseImageRedirectCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "BaseImageRedirectCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "imageUrl"));
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
