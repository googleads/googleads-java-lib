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
 * ProposalLineItemMarketplaceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Marketplace info for {@link ProposalLineItem} with a corresponding
 * deal in Marketplace.
 */
public class ProposalLineItemMarketplaceInfo  implements java.io.Serializable {
    /* The {@link AdExchangeEnvironment} of the marketplace web property
     * that is associated with this
     *                 line item.
     *                 This is only for {@link ProposalLineItem proposal
     * line items} with a corresponding deal in
     *                 Marketplace.
     *                 This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.AdExchangeEnvironment adExchangeEnvironment;

    public ProposalLineItemMarketplaceInfo() {
    }

    public ProposalLineItemMarketplaceInfo(
           com.google.api.ads.dfp.axis.v201802.AdExchangeEnvironment adExchangeEnvironment) {
           this.adExchangeEnvironment = adExchangeEnvironment;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adExchangeEnvironment", getAdExchangeEnvironment())
            .toString();
    }

    /**
     * Gets the adExchangeEnvironment value for this ProposalLineItemMarketplaceInfo.
     * 
     * @return adExchangeEnvironment   * The {@link AdExchangeEnvironment} of the marketplace web property
     * that is associated with this
     *                 line item.
     *                 This is only for {@link ProposalLineItem proposal
     * line items} with a corresponding deal in
     *                 Marketplace.
     *                 This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.AdExchangeEnvironment getAdExchangeEnvironment() {
        return adExchangeEnvironment;
    }


    /**
     * Sets the adExchangeEnvironment value for this ProposalLineItemMarketplaceInfo.
     * 
     * @param adExchangeEnvironment   * The {@link AdExchangeEnvironment} of the marketplace web property
     * that is associated with this
     *                 line item.
     *                 This is only for {@link ProposalLineItem proposal
     * line items} with a corresponding deal in
     *                 Marketplace.
     *                 This attribute is required.
     */
    public void setAdExchangeEnvironment(com.google.api.ads.dfp.axis.v201802.AdExchangeEnvironment adExchangeEnvironment) {
        this.adExchangeEnvironment = adExchangeEnvironment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProposalLineItemMarketplaceInfo)) return false;
        ProposalLineItemMarketplaceInfo other = (ProposalLineItemMarketplaceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adExchangeEnvironment==null && other.getAdExchangeEnvironment()==null) || 
             (this.adExchangeEnvironment!=null &&
              this.adExchangeEnvironment.equals(other.getAdExchangeEnvironment())));
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
        if (getAdExchangeEnvironment() != null) {
            _hashCode += getAdExchangeEnvironment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalLineItemMarketplaceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProposalLineItemMarketplaceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExchangeEnvironment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "adExchangeEnvironment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdExchangeEnvironment"));
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
