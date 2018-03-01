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
 * RemarketingSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.mcm;


/**
 * Customer-wide settings related to AdWords remarketing.
 */
public class RemarketingSettings  implements java.io.Serializable {
    /* The Adwords remarketing tag snippet for the customer.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String snippet;

    /* The google one global site tag for the customer.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String googleGlobalSiteTag;

    public RemarketingSettings() {
    }

    public RemarketingSettings(
           java.lang.String snippet,
           java.lang.String googleGlobalSiteTag) {
           this.snippet = snippet;
           this.googleGlobalSiteTag = googleGlobalSiteTag;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("googleGlobalSiteTag", getGoogleGlobalSiteTag())
            .add("snippet", getSnippet())
            .toString();
    }

    /**
     * Gets the snippet value for this RemarketingSettings.
     * 
     * @return snippet   * The Adwords remarketing tag snippet for the customer.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getSnippet() {
        return snippet;
    }


    /**
     * Sets the snippet value for this RemarketingSettings.
     * 
     * @param snippet   * The Adwords remarketing tag snippet for the customer.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setSnippet(java.lang.String snippet) {
        this.snippet = snippet;
    }


    /**
     * Gets the googleGlobalSiteTag value for this RemarketingSettings.
     * 
     * @return googleGlobalSiteTag   * The google one global site tag for the customer.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getGoogleGlobalSiteTag() {
        return googleGlobalSiteTag;
    }


    /**
     * Sets the googleGlobalSiteTag value for this RemarketingSettings.
     * 
     * @param googleGlobalSiteTag   * The google one global site tag for the customer.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setGoogleGlobalSiteTag(java.lang.String googleGlobalSiteTag) {
        this.googleGlobalSiteTag = googleGlobalSiteTag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemarketingSettings)) return false;
        RemarketingSettings other = (RemarketingSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.snippet==null && other.getSnippet()==null) || 
             (this.snippet!=null &&
              this.snippet.equals(other.getSnippet()))) &&
            ((this.googleGlobalSiteTag==null && other.getGoogleGlobalSiteTag()==null) || 
             (this.googleGlobalSiteTag!=null &&
              this.googleGlobalSiteTag.equals(other.getGoogleGlobalSiteTag())));
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
        if (getSnippet() != null) {
            _hashCode += getSnippet().hashCode();
        }
        if (getGoogleGlobalSiteTag() != null) {
            _hashCode += getGoogleGlobalSiteTag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemarketingSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "RemarketingSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "snippet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("googleGlobalSiteTag");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "googleGlobalSiteTag"));
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
