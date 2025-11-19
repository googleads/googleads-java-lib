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
 * RequestBuyerAcceptance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202511;


/**
 * The action used to request acceptance from the buyer for the {@link
 * Proposal} through
 *             Marketplace. This action does check forecasting unless
 * {@link #allowOverbook} is set to {@code
 *             true}.
 */
public class RequestBuyerAcceptance  extends com.google.api.ads.admanager.axis.v202511.ProposalAction  implements java.io.Serializable {
    private java.lang.Boolean allowOverbook;

    public RequestBuyerAcceptance() {
    }

    public RequestBuyerAcceptance(
           java.lang.Boolean allowOverbook) {
        this.allowOverbook = allowOverbook;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("allowOverbook", getAllowOverbook())
            .toString();
    }

    /**
     * Gets the allowOverbook value for this RequestBuyerAcceptance.
     * 
     * @return allowOverbook
     */
    public java.lang.Boolean getAllowOverbook() {
        return allowOverbook;
    }


    /**
     * Sets the allowOverbook value for this RequestBuyerAcceptance.
     * 
     * @param allowOverbook
     */
    public void setAllowOverbook(java.lang.Boolean allowOverbook) {
        this.allowOverbook = allowOverbook;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestBuyerAcceptance)) return false;
        RequestBuyerAcceptance other = (RequestBuyerAcceptance) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allowOverbook==null && other.getAllowOverbook()==null) || 
             (this.allowOverbook!=null &&
              this.allowOverbook.equals(other.getAllowOverbook())));
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
        if (getAllowOverbook() != null) {
            _hashCode += getAllowOverbook().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestBuyerAcceptance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "RequestBuyerAcceptance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOverbook");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "allowOverbook"));
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
