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
 * ViewabilityProvider.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202208;


/**
 * Information required for {@link Company} of Type VIEWABILITY_PROVIDER.
 * It contains all of the
 *             data needed to capture viewability metrics.
 */
public class ViewabilityProvider  implements java.io.Serializable {
    /* The key for this ad verification vendor. */
    private java.lang.String vendorKey;

    /* The URL that hosts the verification script for this vendor. */
    private java.lang.String verificationScriptUrl;

    /* The parameters that will be passed to the verification script. */
    private java.lang.String verificationParameters;

    /* The URL that should be pinged if the verification script cannot
     * be run. */
    private java.lang.String verificationRejectionTrackerUrl;

    public ViewabilityProvider() {
    }

    public ViewabilityProvider(
           java.lang.String vendorKey,
           java.lang.String verificationScriptUrl,
           java.lang.String verificationParameters,
           java.lang.String verificationRejectionTrackerUrl) {
           this.vendorKey = vendorKey;
           this.verificationScriptUrl = verificationScriptUrl;
           this.verificationParameters = verificationParameters;
           this.verificationRejectionTrackerUrl = verificationRejectionTrackerUrl;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("vendorKey", getVendorKey())
            .add("verificationParameters", getVerificationParameters())
            .add("verificationRejectionTrackerUrl", getVerificationRejectionTrackerUrl())
            .add("verificationScriptUrl", getVerificationScriptUrl())
            .toString();
    }

    /**
     * Gets the vendorKey value for this ViewabilityProvider.
     * 
     * @return vendorKey   * The key for this ad verification vendor.
     */
    public java.lang.String getVendorKey() {
        return vendorKey;
    }


    /**
     * Sets the vendorKey value for this ViewabilityProvider.
     * 
     * @param vendorKey   * The key for this ad verification vendor.
     */
    public void setVendorKey(java.lang.String vendorKey) {
        this.vendorKey = vendorKey;
    }


    /**
     * Gets the verificationScriptUrl value for this ViewabilityProvider.
     * 
     * @return verificationScriptUrl   * The URL that hosts the verification script for this vendor.
     */
    public java.lang.String getVerificationScriptUrl() {
        return verificationScriptUrl;
    }


    /**
     * Sets the verificationScriptUrl value for this ViewabilityProvider.
     * 
     * @param verificationScriptUrl   * The URL that hosts the verification script for this vendor.
     */
    public void setVerificationScriptUrl(java.lang.String verificationScriptUrl) {
        this.verificationScriptUrl = verificationScriptUrl;
    }


    /**
     * Gets the verificationParameters value for this ViewabilityProvider.
     * 
     * @return verificationParameters   * The parameters that will be passed to the verification script.
     */
    public java.lang.String getVerificationParameters() {
        return verificationParameters;
    }


    /**
     * Sets the verificationParameters value for this ViewabilityProvider.
     * 
     * @param verificationParameters   * The parameters that will be passed to the verification script.
     */
    public void setVerificationParameters(java.lang.String verificationParameters) {
        this.verificationParameters = verificationParameters;
    }


    /**
     * Gets the verificationRejectionTrackerUrl value for this ViewabilityProvider.
     * 
     * @return verificationRejectionTrackerUrl   * The URL that should be pinged if the verification script cannot
     * be run.
     */
    public java.lang.String getVerificationRejectionTrackerUrl() {
        return verificationRejectionTrackerUrl;
    }


    /**
     * Sets the verificationRejectionTrackerUrl value for this ViewabilityProvider.
     * 
     * @param verificationRejectionTrackerUrl   * The URL that should be pinged if the verification script cannot
     * be run.
     */
    public void setVerificationRejectionTrackerUrl(java.lang.String verificationRejectionTrackerUrl) {
        this.verificationRejectionTrackerUrl = verificationRejectionTrackerUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewabilityProvider)) return false;
        ViewabilityProvider other = (ViewabilityProvider) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vendorKey==null && other.getVendorKey()==null) || 
             (this.vendorKey!=null &&
              this.vendorKey.equals(other.getVendorKey()))) &&
            ((this.verificationScriptUrl==null && other.getVerificationScriptUrl()==null) || 
             (this.verificationScriptUrl!=null &&
              this.verificationScriptUrl.equals(other.getVerificationScriptUrl()))) &&
            ((this.verificationParameters==null && other.getVerificationParameters()==null) || 
             (this.verificationParameters!=null &&
              this.verificationParameters.equals(other.getVerificationParameters()))) &&
            ((this.verificationRejectionTrackerUrl==null && other.getVerificationRejectionTrackerUrl()==null) || 
             (this.verificationRejectionTrackerUrl!=null &&
              this.verificationRejectionTrackerUrl.equals(other.getVerificationRejectionTrackerUrl())));
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
        if (getVendorKey() != null) {
            _hashCode += getVendorKey().hashCode();
        }
        if (getVerificationScriptUrl() != null) {
            _hashCode += getVerificationScriptUrl().hashCode();
        }
        if (getVerificationParameters() != null) {
            _hashCode += getVerificationParameters().hashCode();
        }
        if (getVerificationRejectionTrackerUrl() != null) {
            _hashCode += getVerificationRejectionTrackerUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewabilityProvider.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202208", "ViewabilityProvider"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202208", "vendorKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationScriptUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202208", "verificationScriptUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202208", "verificationParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationRejectionTrackerUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202208", "verificationRejectionTrackerUrl"));
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
