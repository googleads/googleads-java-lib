// Copyright 2020 Google LLC
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
 * ChildPublisher.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202008;


/**
 * A {@code ChildPublisher} represents a network being managed as
 * part of Multiple Customer
 *             Management.
 */
public class ChildPublisher  implements java.io.Serializable {
    /* Type of delegation the parent has been approved to have over
     * the child. This field is
     *                 read-only, and set to the proposed delegation type
     * value {@code proposedDelegationType} upon
     *                 approval by the child network. The value remains null
     * if the parent network has not been
     *                 approved. */
    private com.google.api.ads.admanager.axis.v202008.DelegationType approvedDelegationType;

    /* Type of delegation the parent has proposed to have over the
     * child, pending approval of the
     *                 child network. Set the value of this field to the
     * delegation type you intend this network to
     *                 have over the child network. Upon approval by the
     * child network, its value is copied to {@code
     *                 approvedDelegationType}, and {@code proposedDelegationType}
     * is set to null. */
    private com.google.api.ads.admanager.axis.v202008.DelegationType proposedDelegationType;

    /* Status of the delegation relationship between parent and child. */
    private com.google.api.ads.admanager.axis.v202008.DelegationStatus status;

    /* Status of the child publisher's Ad Manager account based on
     * {@code ChildPublisher#status} as
     *                 well as Google's policy verification results. This
     * field is read-only. */
    private com.google.api.ads.admanager.axis.v202008.AccountStatus accountStatus;

    /* Network code of child network. */
    private java.lang.String childNetworkCode;

    public ChildPublisher() {
    }

    public ChildPublisher(
           com.google.api.ads.admanager.axis.v202008.DelegationType approvedDelegationType,
           com.google.api.ads.admanager.axis.v202008.DelegationType proposedDelegationType,
           com.google.api.ads.admanager.axis.v202008.DelegationStatus status,
           com.google.api.ads.admanager.axis.v202008.AccountStatus accountStatus,
           java.lang.String childNetworkCode) {
           this.approvedDelegationType = approvedDelegationType;
           this.proposedDelegationType = proposedDelegationType;
           this.status = status;
           this.accountStatus = accountStatus;
           this.childNetworkCode = childNetworkCode;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("accountStatus", getAccountStatus())
            .add("approvedDelegationType", getApprovedDelegationType())
            .add("childNetworkCode", getChildNetworkCode())
            .add("proposedDelegationType", getProposedDelegationType())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the approvedDelegationType value for this ChildPublisher.
     * 
     * @return approvedDelegationType   * Type of delegation the parent has been approved to have over
     * the child. This field is
     *                 read-only, and set to the proposed delegation type
     * value {@code proposedDelegationType} upon
     *                 approval by the child network. The value remains null
     * if the parent network has not been
     *                 approved.
     */
    public com.google.api.ads.admanager.axis.v202008.DelegationType getApprovedDelegationType() {
        return approvedDelegationType;
    }


    /**
     * Sets the approvedDelegationType value for this ChildPublisher.
     * 
     * @param approvedDelegationType   * Type of delegation the parent has been approved to have over
     * the child. This field is
     *                 read-only, and set to the proposed delegation type
     * value {@code proposedDelegationType} upon
     *                 approval by the child network. The value remains null
     * if the parent network has not been
     *                 approved.
     */
    public void setApprovedDelegationType(com.google.api.ads.admanager.axis.v202008.DelegationType approvedDelegationType) {
        this.approvedDelegationType = approvedDelegationType;
    }


    /**
     * Gets the proposedDelegationType value for this ChildPublisher.
     * 
     * @return proposedDelegationType   * Type of delegation the parent has proposed to have over the
     * child, pending approval of the
     *                 child network. Set the value of this field to the
     * delegation type you intend this network to
     *                 have over the child network. Upon approval by the
     * child network, its value is copied to {@code
     *                 approvedDelegationType}, and {@code proposedDelegationType}
     * is set to null.
     */
    public com.google.api.ads.admanager.axis.v202008.DelegationType getProposedDelegationType() {
        return proposedDelegationType;
    }


    /**
     * Sets the proposedDelegationType value for this ChildPublisher.
     * 
     * @param proposedDelegationType   * Type of delegation the parent has proposed to have over the
     * child, pending approval of the
     *                 child network. Set the value of this field to the
     * delegation type you intend this network to
     *                 have over the child network. Upon approval by the
     * child network, its value is copied to {@code
     *                 approvedDelegationType}, and {@code proposedDelegationType}
     * is set to null.
     */
    public void setProposedDelegationType(com.google.api.ads.admanager.axis.v202008.DelegationType proposedDelegationType) {
        this.proposedDelegationType = proposedDelegationType;
    }


    /**
     * Gets the status value for this ChildPublisher.
     * 
     * @return status   * Status of the delegation relationship between parent and child.
     */
    public com.google.api.ads.admanager.axis.v202008.DelegationStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ChildPublisher.
     * 
     * @param status   * Status of the delegation relationship between parent and child.
     */
    public void setStatus(com.google.api.ads.admanager.axis.v202008.DelegationStatus status) {
        this.status = status;
    }


    /**
     * Gets the accountStatus value for this ChildPublisher.
     * 
     * @return accountStatus   * Status of the child publisher's Ad Manager account based on
     * {@code ChildPublisher#status} as
     *                 well as Google's policy verification results. This
     * field is read-only.
     */
    public com.google.api.ads.admanager.axis.v202008.AccountStatus getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this ChildPublisher.
     * 
     * @param accountStatus   * Status of the child publisher's Ad Manager account based on
     * {@code ChildPublisher#status} as
     *                 well as Google's policy verification results. This
     * field is read-only.
     */
    public void setAccountStatus(com.google.api.ads.admanager.axis.v202008.AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the childNetworkCode value for this ChildPublisher.
     * 
     * @return childNetworkCode   * Network code of child network.
     */
    public java.lang.String getChildNetworkCode() {
        return childNetworkCode;
    }


    /**
     * Sets the childNetworkCode value for this ChildPublisher.
     * 
     * @param childNetworkCode   * Network code of child network.
     */
    public void setChildNetworkCode(java.lang.String childNetworkCode) {
        this.childNetworkCode = childNetworkCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChildPublisher)) return false;
        ChildPublisher other = (ChildPublisher) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.approvedDelegationType==null && other.getApprovedDelegationType()==null) || 
             (this.approvedDelegationType!=null &&
              this.approvedDelegationType.equals(other.getApprovedDelegationType()))) &&
            ((this.proposedDelegationType==null && other.getProposedDelegationType()==null) || 
             (this.proposedDelegationType!=null &&
              this.proposedDelegationType.equals(other.getProposedDelegationType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.childNetworkCode==null && other.getChildNetworkCode()==null) || 
             (this.childNetworkCode!=null &&
              this.childNetworkCode.equals(other.getChildNetworkCode())));
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
        if (getApprovedDelegationType() != null) {
            _hashCode += getApprovedDelegationType().hashCode();
        }
        if (getProposedDelegationType() != null) {
            _hashCode += getProposedDelegationType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getChildNetworkCode() != null) {
            _hashCode += getChildNetworkCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChildPublisher.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202008", "ChildPublisher"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvedDelegationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202008", "approvedDelegationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202008", "DelegationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposedDelegationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202008", "proposedDelegationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202008", "DelegationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202008", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202008", "DelegationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202008", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202008", "AccountStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childNetworkCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202008", "childNetworkCode"));
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
