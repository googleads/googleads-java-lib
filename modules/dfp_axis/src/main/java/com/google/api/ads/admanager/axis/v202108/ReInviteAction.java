// Copyright 2021 Google LLC
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
 * ReInviteAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202108;


/**
 * The action used by the parent network to invite a rejected or withdrawn
 * child publisher.
 */
public class ReInviteAction  extends com.google.api.ads.admanager.axis.v202108.CompanyAction  implements java.io.Serializable {
    /* The type of delegation the parent has proposed to have over
     * the child, pending approval of the
     *                     child publisher. */
    private com.google.api.ads.admanager.axis.v202108.DelegationType proposedDelegationType;

    /* The proposed revenue share that the parent publisher will receive
     * in millipercentage (values 0
     *                     to 100000) for Manage Account proposals. For example,
     * 15% is 15000 millipercent.
     *                     
     *                     <p>This field is ignored for Manage Inventory
     * proposals. */
    private java.lang.Long proposedRevenueShareMillipercent;

    public ReInviteAction() {
    }

    public ReInviteAction(
           com.google.api.ads.admanager.axis.v202108.DelegationType proposedDelegationType,
           java.lang.Long proposedRevenueShareMillipercent) {
        this.proposedDelegationType = proposedDelegationType;
        this.proposedRevenueShareMillipercent = proposedRevenueShareMillipercent;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("proposedDelegationType", getProposedDelegationType())
            .add("proposedRevenueShareMillipercent", getProposedRevenueShareMillipercent())
            .toString();
    }

    /**
     * Gets the proposedDelegationType value for this ReInviteAction.
     * 
     * @return proposedDelegationType   * The type of delegation the parent has proposed to have over
     * the child, pending approval of the
     *                     child publisher.
     */
    public com.google.api.ads.admanager.axis.v202108.DelegationType getProposedDelegationType() {
        return proposedDelegationType;
    }


    /**
     * Sets the proposedDelegationType value for this ReInviteAction.
     * 
     * @param proposedDelegationType   * The type of delegation the parent has proposed to have over
     * the child, pending approval of the
     *                     child publisher.
     */
    public void setProposedDelegationType(com.google.api.ads.admanager.axis.v202108.DelegationType proposedDelegationType) {
        this.proposedDelegationType = proposedDelegationType;
    }


    /**
     * Gets the proposedRevenueShareMillipercent value for this ReInviteAction.
     * 
     * @return proposedRevenueShareMillipercent   * The proposed revenue share that the parent publisher will receive
     * in millipercentage (values 0
     *                     to 100000) for Manage Account proposals. For example,
     * 15% is 15000 millipercent.
     *                     
     *                     <p>This field is ignored for Manage Inventory
     * proposals.
     */
    public java.lang.Long getProposedRevenueShareMillipercent() {
        return proposedRevenueShareMillipercent;
    }


    /**
     * Sets the proposedRevenueShareMillipercent value for this ReInviteAction.
     * 
     * @param proposedRevenueShareMillipercent   * The proposed revenue share that the parent publisher will receive
     * in millipercentage (values 0
     *                     to 100000) for Manage Account proposals. For example,
     * 15% is 15000 millipercent.
     *                     
     *                     <p>This field is ignored for Manage Inventory
     * proposals.
     */
    public void setProposedRevenueShareMillipercent(java.lang.Long proposedRevenueShareMillipercent) {
        this.proposedRevenueShareMillipercent = proposedRevenueShareMillipercent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReInviteAction)) return false;
        ReInviteAction other = (ReInviteAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.proposedDelegationType==null && other.getProposedDelegationType()==null) || 
             (this.proposedDelegationType!=null &&
              this.proposedDelegationType.equals(other.getProposedDelegationType()))) &&
            ((this.proposedRevenueShareMillipercent==null && other.getProposedRevenueShareMillipercent()==null) || 
             (this.proposedRevenueShareMillipercent!=null &&
              this.proposedRevenueShareMillipercent.equals(other.getProposedRevenueShareMillipercent())));
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
        if (getProposedDelegationType() != null) {
            _hashCode += getProposedDelegationType().hashCode();
        }
        if (getProposedRevenueShareMillipercent() != null) {
            _hashCode += getProposedRevenueShareMillipercent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReInviteAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "ReInviteAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposedDelegationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "proposedDelegationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DelegationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposedRevenueShareMillipercent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "proposedRevenueShareMillipercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
