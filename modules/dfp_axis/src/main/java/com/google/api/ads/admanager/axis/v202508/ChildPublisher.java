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
 * ChildPublisher.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202508;


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
    private com.google.api.ads.admanager.axis.v202508.DelegationType approvedDelegationType;

    /* Type of delegation the parent has proposed to have over the
     * child, pending approval of the
     *                 child network. Set the value of this field to the
     * delegation type you intend this network to
     *                 have over the child network. Upon approval by the
     * child network, its value is copied to {@code
     *                 approvedDelegationType}, and {@code proposedDelegationType}
     * is set to null. */
    private com.google.api.ads.admanager.axis.v202508.DelegationType proposedDelegationType;

    /* Invitation status of the delegation relationship between parent
     * and child. This field is
     *                 read-only. */
    private com.google.api.ads.admanager.axis.v202508.InvitationStatus invitationStatus;

    /* Status of the child publisher's Ad Manager account based on
     * {@code ChildPublisher#status} as
     *                 well as Google's policy verification results. This
     * field is read-only. */
    private com.google.api.ads.admanager.axis.v202508.AccountStatus accountStatus;

    /* Network code of child network. */
    private java.lang.String childNetworkCode;

    /* The child publisher's seller ID, as specified in the parent
     * publisher's sellers.json file.
     *                 
     *                 <p>This field is only relevant for Manage Inventory
     * child publishers. */
    private java.lang.String sellerId;

    /* The proposed revenue share that the parent publisher will receive
     * in millipercentage (values 0
     *                 to 100000) for Manage Account proposals. For example,
     * 15% is 15000 millipercent.
     *                 
     *                 <p>For updates, this field is read-only. Use company
     * actions to propose new revenue share
     *                 agreements for existing MCM children. This field is
     * ignored for Manage Inventory proposals. */
    private java.lang.Long proposedRevenueShareMillipercent;

    /* The child publisher's pending onboarding tasks.
     *                 
     *                 <p>This will only be populated if the child publisher's
     * {@code AccountStatus} is {@code
     *                 PENDING_GOOGLE_APPROVAL}.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202508.OnboardingTask[] onboardingTasks;

    public ChildPublisher() {
    }

    public ChildPublisher(
           com.google.api.ads.admanager.axis.v202508.DelegationType approvedDelegationType,
           com.google.api.ads.admanager.axis.v202508.DelegationType proposedDelegationType,
           com.google.api.ads.admanager.axis.v202508.InvitationStatus invitationStatus,
           com.google.api.ads.admanager.axis.v202508.AccountStatus accountStatus,
           java.lang.String childNetworkCode,
           java.lang.String sellerId,
           java.lang.Long proposedRevenueShareMillipercent,
           com.google.api.ads.admanager.axis.v202508.OnboardingTask[] onboardingTasks) {
           this.approvedDelegationType = approvedDelegationType;
           this.proposedDelegationType = proposedDelegationType;
           this.invitationStatus = invitationStatus;
           this.accountStatus = accountStatus;
           this.childNetworkCode = childNetworkCode;
           this.sellerId = sellerId;
           this.proposedRevenueShareMillipercent = proposedRevenueShareMillipercent;
           this.onboardingTasks = onboardingTasks;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("accountStatus", getAccountStatus())
            .add("approvedDelegationType", getApprovedDelegationType())
            .add("childNetworkCode", getChildNetworkCode())
            .add("invitationStatus", getInvitationStatus())
            .add("onboardingTasks", getOnboardingTasks())
            .add("proposedDelegationType", getProposedDelegationType())
            .add("proposedRevenueShareMillipercent", getProposedRevenueShareMillipercent())
            .add("sellerId", getSellerId())
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
    public com.google.api.ads.admanager.axis.v202508.DelegationType getApprovedDelegationType() {
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
    public void setApprovedDelegationType(com.google.api.ads.admanager.axis.v202508.DelegationType approvedDelegationType) {
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
    public com.google.api.ads.admanager.axis.v202508.DelegationType getProposedDelegationType() {
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
    public void setProposedDelegationType(com.google.api.ads.admanager.axis.v202508.DelegationType proposedDelegationType) {
        this.proposedDelegationType = proposedDelegationType;
    }


    /**
     * Gets the invitationStatus value for this ChildPublisher.
     * 
     * @return invitationStatus   * Invitation status of the delegation relationship between parent
     * and child. This field is
     *                 read-only.
     */
    public com.google.api.ads.admanager.axis.v202508.InvitationStatus getInvitationStatus() {
        return invitationStatus;
    }


    /**
     * Sets the invitationStatus value for this ChildPublisher.
     * 
     * @param invitationStatus   * Invitation status of the delegation relationship between parent
     * and child. This field is
     *                 read-only.
     */
    public void setInvitationStatus(com.google.api.ads.admanager.axis.v202508.InvitationStatus invitationStatus) {
        this.invitationStatus = invitationStatus;
    }


    /**
     * Gets the accountStatus value for this ChildPublisher.
     * 
     * @return accountStatus   * Status of the child publisher's Ad Manager account based on
     * {@code ChildPublisher#status} as
     *                 well as Google's policy verification results. This
     * field is read-only.
     */
    public com.google.api.ads.admanager.axis.v202508.AccountStatus getAccountStatus() {
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
    public void setAccountStatus(com.google.api.ads.admanager.axis.v202508.AccountStatus accountStatus) {
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


    /**
     * Gets the sellerId value for this ChildPublisher.
     * 
     * @return sellerId   * The child publisher's seller ID, as specified in the parent
     * publisher's sellers.json file.
     *                 
     *                 <p>This field is only relevant for Manage Inventory
     * child publishers.
     */
    public java.lang.String getSellerId() {
        return sellerId;
    }


    /**
     * Sets the sellerId value for this ChildPublisher.
     * 
     * @param sellerId   * The child publisher's seller ID, as specified in the parent
     * publisher's sellers.json file.
     *                 
     *                 <p>This field is only relevant for Manage Inventory
     * child publishers.
     */
    public void setSellerId(java.lang.String sellerId) {
        this.sellerId = sellerId;
    }


    /**
     * Gets the proposedRevenueShareMillipercent value for this ChildPublisher.
     * 
     * @return proposedRevenueShareMillipercent   * The proposed revenue share that the parent publisher will receive
     * in millipercentage (values 0
     *                 to 100000) for Manage Account proposals. For example,
     * 15% is 15000 millipercent.
     *                 
     *                 <p>For updates, this field is read-only. Use company
     * actions to propose new revenue share
     *                 agreements for existing MCM children. This field is
     * ignored for Manage Inventory proposals.
     */
    public java.lang.Long getProposedRevenueShareMillipercent() {
        return proposedRevenueShareMillipercent;
    }


    /**
     * Sets the proposedRevenueShareMillipercent value for this ChildPublisher.
     * 
     * @param proposedRevenueShareMillipercent   * The proposed revenue share that the parent publisher will receive
     * in millipercentage (values 0
     *                 to 100000) for Manage Account proposals. For example,
     * 15% is 15000 millipercent.
     *                 
     *                 <p>For updates, this field is read-only. Use company
     * actions to propose new revenue share
     *                 agreements for existing MCM children. This field is
     * ignored for Manage Inventory proposals.
     */
    public void setProposedRevenueShareMillipercent(java.lang.Long proposedRevenueShareMillipercent) {
        this.proposedRevenueShareMillipercent = proposedRevenueShareMillipercent;
    }


    /**
     * Gets the onboardingTasks value for this ChildPublisher.
     * 
     * @return onboardingTasks   * The child publisher's pending onboarding tasks.
     *                 
     *                 <p>This will only be populated if the child publisher's
     * {@code AccountStatus} is {@code
     *                 PENDING_GOOGLE_APPROVAL}.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202508.OnboardingTask[] getOnboardingTasks() {
        return onboardingTasks;
    }


    /**
     * Sets the onboardingTasks value for this ChildPublisher.
     * 
     * @param onboardingTasks   * The child publisher's pending onboarding tasks.
     *                 
     *                 <p>This will only be populated if the child publisher's
     * {@code AccountStatus} is {@code
     *                 PENDING_GOOGLE_APPROVAL}.
     *                 This attribute is read-only.
     */
    public void setOnboardingTasks(com.google.api.ads.admanager.axis.v202508.OnboardingTask[] onboardingTasks) {
        this.onboardingTasks = onboardingTasks;
    }

    public com.google.api.ads.admanager.axis.v202508.OnboardingTask getOnboardingTasks(int i) {
        return this.onboardingTasks[i];
    }

    public void setOnboardingTasks(int i, com.google.api.ads.admanager.axis.v202508.OnboardingTask _value) {
        this.onboardingTasks[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChildPublisher)) return false;
        ChildPublisher other = (ChildPublisher) obj;
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
            ((this.invitationStatus==null && other.getInvitationStatus()==null) || 
             (this.invitationStatus!=null &&
              this.invitationStatus.equals(other.getInvitationStatus()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.childNetworkCode==null && other.getChildNetworkCode()==null) || 
             (this.childNetworkCode!=null &&
              this.childNetworkCode.equals(other.getChildNetworkCode()))) &&
            ((this.sellerId==null && other.getSellerId()==null) || 
             (this.sellerId!=null &&
              this.sellerId.equals(other.getSellerId()))) &&
            ((this.proposedRevenueShareMillipercent==null && other.getProposedRevenueShareMillipercent()==null) || 
             (this.proposedRevenueShareMillipercent!=null &&
              this.proposedRevenueShareMillipercent.equals(other.getProposedRevenueShareMillipercent()))) &&
            ((this.onboardingTasks==null && other.getOnboardingTasks()==null) || 
             (this.onboardingTasks!=null &&
              java.util.Arrays.equals(this.onboardingTasks, other.getOnboardingTasks())));
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
        if (getInvitationStatus() != null) {
            _hashCode += getInvitationStatus().hashCode();
        }
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getChildNetworkCode() != null) {
            _hashCode += getChildNetworkCode().hashCode();
        }
        if (getSellerId() != null) {
            _hashCode += getSellerId().hashCode();
        }
        if (getProposedRevenueShareMillipercent() != null) {
            _hashCode += getProposedRevenueShareMillipercent().hashCode();
        }
        if (getOnboardingTasks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOnboardingTasks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOnboardingTasks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChildPublisher.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "ChildPublisher"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvedDelegationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "approvedDelegationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "DelegationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposedDelegationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "proposedDelegationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "DelegationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invitationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "invitationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "InvitationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "AccountStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childNetworkCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "childNetworkCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "sellerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposedRevenueShareMillipercent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "proposedRevenueShareMillipercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onboardingTasks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "onboardingTasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "OnboardingTask"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
