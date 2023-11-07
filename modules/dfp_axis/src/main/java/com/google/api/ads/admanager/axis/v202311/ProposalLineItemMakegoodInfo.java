// Copyright 2023 Google LLC
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
 * ProposalLineItemMakegoodInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202311;


/**
 * Makegood info for a {@link ProposalLineItemDto}.
 */
public class ProposalLineItemMakegoodInfo  implements java.io.Serializable {
    /* The ID of the original proposal line item on which this makegood
     * is based.
     *                 This attribute is read-only. */
    private java.lang.Long originalProposalLineItemId;

    /* The publisher-provided reason why this makegood was initiated.
     * This is free form text.
     *                 
     *                 <p>The following predefined values can be used to
     * render predefined options in the UI.
     *                 
     *                 <p>UNDERDELIVERY: 'Impression underdelivery', SECONDARY_DELIVERY_TERMS:
     * 'Did not meet secondary
     *                 delivery terms ', PERFORMANCE: 'Performance issues', */
    private java.lang.String reason;

    public ProposalLineItemMakegoodInfo() {
    }

    public ProposalLineItemMakegoodInfo(
           java.lang.Long originalProposalLineItemId,
           java.lang.String reason) {
           this.originalProposalLineItemId = originalProposalLineItemId;
           this.reason = reason;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("originalProposalLineItemId", getOriginalProposalLineItemId())
            .add("reason", getReason())
            .toString();
    }

    /**
     * Gets the originalProposalLineItemId value for this ProposalLineItemMakegoodInfo.
     * 
     * @return originalProposalLineItemId   * The ID of the original proposal line item on which this makegood
     * is based.
     *                 This attribute is read-only.
     */
    public java.lang.Long getOriginalProposalLineItemId() {
        return originalProposalLineItemId;
    }


    /**
     * Sets the originalProposalLineItemId value for this ProposalLineItemMakegoodInfo.
     * 
     * @param originalProposalLineItemId   * The ID of the original proposal line item on which this makegood
     * is based.
     *                 This attribute is read-only.
     */
    public void setOriginalProposalLineItemId(java.lang.Long originalProposalLineItemId) {
        this.originalProposalLineItemId = originalProposalLineItemId;
    }


    /**
     * Gets the reason value for this ProposalLineItemMakegoodInfo.
     * 
     * @return reason   * The publisher-provided reason why this makegood was initiated.
     * This is free form text.
     *                 
     *                 <p>The following predefined values can be used to
     * render predefined options in the UI.
     *                 
     *                 <p>UNDERDELIVERY: 'Impression underdelivery', SECONDARY_DELIVERY_TERMS:
     * 'Did not meet secondary
     *                 delivery terms ', PERFORMANCE: 'Performance issues',
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ProposalLineItemMakegoodInfo.
     * 
     * @param reason   * The publisher-provided reason why this makegood was initiated.
     * This is free form text.
     *                 
     *                 <p>The following predefined values can be used to
     * render predefined options in the UI.
     *                 
     *                 <p>UNDERDELIVERY: 'Impression underdelivery', SECONDARY_DELIVERY_TERMS:
     * 'Did not meet secondary
     *                 delivery terms ', PERFORMANCE: 'Performance issues',
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProposalLineItemMakegoodInfo)) return false;
        ProposalLineItemMakegoodInfo other = (ProposalLineItemMakegoodInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.originalProposalLineItemId==null && other.getOriginalProposalLineItemId()==null) || 
             (this.originalProposalLineItemId!=null &&
              this.originalProposalLineItemId.equals(other.getOriginalProposalLineItemId()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        if (getOriginalProposalLineItemId() != null) {
            _hashCode += getOriginalProposalLineItemId().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalLineItemMakegoodInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "ProposalLineItemMakegoodInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalProposalLineItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "originalProposalLineItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "reason"));
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
