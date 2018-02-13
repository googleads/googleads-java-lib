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
 * HasHtmlSnippetDynamicAllocationCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Dynamic allocation creative with a backfill code snippet.
 */
public abstract class HasHtmlSnippetDynamicAllocationCreative  extends com.google.api.ads.dfp.axis.v201802.BaseDynamicAllocationCreative  implements java.io.Serializable {
    /* The code snippet (ad tag) from Ad Exchange or AdSense to traffic
     * the dynamic allocation
     *                     creative. Only valid Ad Exchange or AdSense parameters
     * will be considered. Any extraneous HTML
     *                     or JavaScript will be ignored. */
    private java.lang.String codeSnippet;

    public HasHtmlSnippetDynamicAllocationCreative() {
    }

    public HasHtmlSnippetDynamicAllocationCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201802.CreativePolicyViolation[] policyViolations,
           com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues,
           java.lang.String codeSnippet) {
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
        this.codeSnippet = codeSnippet;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiserId", getAdvertiserId())
            .add("appliedLabels", getAppliedLabels())
            .add("codeSnippet", getCodeSnippet())
            .add("customFieldValues", getCustomFieldValues())
            .add("id", getId())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("policyViolations", getPolicyViolations())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .toString();
    }

    /**
     * Gets the codeSnippet value for this HasHtmlSnippetDynamicAllocationCreative.
     * 
     * @return codeSnippet   * The code snippet (ad tag) from Ad Exchange or AdSense to traffic
     * the dynamic allocation
     *                     creative. Only valid Ad Exchange or AdSense parameters
     * will be considered. Any extraneous HTML
     *                     or JavaScript will be ignored.
     */
    public java.lang.String getCodeSnippet() {
        return codeSnippet;
    }


    /**
     * Sets the codeSnippet value for this HasHtmlSnippetDynamicAllocationCreative.
     * 
     * @param codeSnippet   * The code snippet (ad tag) from Ad Exchange or AdSense to traffic
     * the dynamic allocation
     *                     creative. Only valid Ad Exchange or AdSense parameters
     * will be considered. Any extraneous HTML
     *                     or JavaScript will be ignored.
     */
    public void setCodeSnippet(java.lang.String codeSnippet) {
        this.codeSnippet = codeSnippet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HasHtmlSnippetDynamicAllocationCreative)) return false;
        HasHtmlSnippetDynamicAllocationCreative other = (HasHtmlSnippetDynamicAllocationCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codeSnippet==null && other.getCodeSnippet()==null) || 
             (this.codeSnippet!=null &&
              this.codeSnippet.equals(other.getCodeSnippet())));
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
        if (getCodeSnippet() != null) {
            _hashCode += getCodeSnippet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HasHtmlSnippetDynamicAllocationCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "HasHtmlSnippetDynamicAllocationCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeSnippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "codeSnippet"));
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
