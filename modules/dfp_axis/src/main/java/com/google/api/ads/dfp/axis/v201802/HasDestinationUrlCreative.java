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
 * HasDestinationUrlCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code Creative} that has a destination url
 */
public abstract class HasDestinationUrlCreative  extends com.google.api.ads.dfp.axis.v201802.Creative  implements java.io.Serializable {
    /* The URL that the user is directed to if they click on the creative.
     * This
     *                     attribute is required unless the {@link destinationUrlType}
     * is {@link DestinationUrlType#NONE},
     *                     and has a maximum length of 1024 characters. */
    private java.lang.String destinationUrl;

    /* The action that should be performed if the user clicks on the
     * creative.
     *                     This attribute is optional and defaults to {@link
     * DestinationUrlType#CLICK_TO_WEB}. */
    private com.google.api.ads.dfp.axis.v201802.DestinationUrlType destinationUrlType;

    public HasDestinationUrlCreative() {
    }

    public HasDestinationUrlCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201802.CreativePolicyViolation[] policyViolations,
           com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues,
           java.lang.String destinationUrl,
           com.google.api.ads.dfp.axis.v201802.DestinationUrlType destinationUrlType) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            policyViolations,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues);
        this.destinationUrl = destinationUrl;
        this.destinationUrlType = destinationUrlType;
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
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("policyViolations", getPolicyViolations())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .toString();
    }

    /**
     * Gets the destinationUrl value for this HasDestinationUrlCreative.
     * 
     * @return destinationUrl   * The URL that the user is directed to if they click on the creative.
     * This
     *                     attribute is required unless the {@link destinationUrlType}
     * is {@link DestinationUrlType#NONE},
     *                     and has a maximum length of 1024 characters.
     */
    public java.lang.String getDestinationUrl() {
        return destinationUrl;
    }


    /**
     * Sets the destinationUrl value for this HasDestinationUrlCreative.
     * 
     * @param destinationUrl   * The URL that the user is directed to if they click on the creative.
     * This
     *                     attribute is required unless the {@link destinationUrlType}
     * is {@link DestinationUrlType#NONE},
     *                     and has a maximum length of 1024 characters.
     */
    public void setDestinationUrl(java.lang.String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }


    /**
     * Gets the destinationUrlType value for this HasDestinationUrlCreative.
     * 
     * @return destinationUrlType   * The action that should be performed if the user clicks on the
     * creative.
     *                     This attribute is optional and defaults to {@link
     * DestinationUrlType#CLICK_TO_WEB}.
     */
    public com.google.api.ads.dfp.axis.v201802.DestinationUrlType getDestinationUrlType() {
        return destinationUrlType;
    }


    /**
     * Sets the destinationUrlType value for this HasDestinationUrlCreative.
     * 
     * @param destinationUrlType   * The action that should be performed if the user clicks on the
     * creative.
     *                     This attribute is optional and defaults to {@link
     * DestinationUrlType#CLICK_TO_WEB}.
     */
    public void setDestinationUrlType(com.google.api.ads.dfp.axis.v201802.DestinationUrlType destinationUrlType) {
        this.destinationUrlType = destinationUrlType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HasDestinationUrlCreative)) return false;
        HasDestinationUrlCreative other = (HasDestinationUrlCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.destinationUrl==null && other.getDestinationUrl()==null) || 
             (this.destinationUrl!=null &&
              this.destinationUrl.equals(other.getDestinationUrl()))) &&
            ((this.destinationUrlType==null && other.getDestinationUrlType()==null) || 
             (this.destinationUrlType!=null &&
              this.destinationUrlType.equals(other.getDestinationUrlType())));
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
        if (getDestinationUrl() != null) {
            _hashCode += getDestinationUrl().hashCode();
        }
        if (getDestinationUrlType() != null) {
            _hashCode += getDestinationUrlType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HasDestinationUrlCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "HasDestinationUrlCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "destinationUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationUrlType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "destinationUrlType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DestinationUrlType"));
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
