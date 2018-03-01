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
 * ManagedCustomerLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.mcm;


/**
 * Represents an AdWords manager-client link.
 */
public class ManagedCustomerLink  implements java.io.Serializable {
    /* The manager customer ID in this link. */
    private java.lang.Long managerCustomerId;

    /* The client customer ID in this link. */
    private java.lang.Long clientCustomerId;

    /* The status of the link. */
    private com.google.api.ads.adwords.axis.v201802.mcm.LinkStatus linkStatus;

    /* The pending descriptive name of the client for link invitations. */
    private java.lang.String pendingDescriptiveName;

    /* Whether the link is hidden.
     *                 
     *                 <p>Hiding accounts removes them from your manager
     * account views without unlinking them
     *                 in the AdWords UI. Ads in those accounts will continue
     * running normally. */
    private java.lang.Boolean isHidden;

    public ManagedCustomerLink() {
    }

    public ManagedCustomerLink(
           java.lang.Long managerCustomerId,
           java.lang.Long clientCustomerId,
           com.google.api.ads.adwords.axis.v201802.mcm.LinkStatus linkStatus,
           java.lang.String pendingDescriptiveName,
           java.lang.Boolean isHidden) {
           this.managerCustomerId = managerCustomerId;
           this.clientCustomerId = clientCustomerId;
           this.linkStatus = linkStatus;
           this.pendingDescriptiveName = pendingDescriptiveName;
           this.isHidden = isHidden;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("clientCustomerId", getClientCustomerId())
            .add("isHidden", getIsHidden())
            .add("linkStatus", getLinkStatus())
            .add("managerCustomerId", getManagerCustomerId())
            .add("pendingDescriptiveName", getPendingDescriptiveName())
            .toString();
    }

    /**
     * Gets the managerCustomerId value for this ManagedCustomerLink.
     * 
     * @return managerCustomerId   * The manager customer ID in this link.
     */
    public java.lang.Long getManagerCustomerId() {
        return managerCustomerId;
    }


    /**
     * Sets the managerCustomerId value for this ManagedCustomerLink.
     * 
     * @param managerCustomerId   * The manager customer ID in this link.
     */
    public void setManagerCustomerId(java.lang.Long managerCustomerId) {
        this.managerCustomerId = managerCustomerId;
    }


    /**
     * Gets the clientCustomerId value for this ManagedCustomerLink.
     * 
     * @return clientCustomerId   * The client customer ID in this link.
     */
    public java.lang.Long getClientCustomerId() {
        return clientCustomerId;
    }


    /**
     * Sets the clientCustomerId value for this ManagedCustomerLink.
     * 
     * @param clientCustomerId   * The client customer ID in this link.
     */
    public void setClientCustomerId(java.lang.Long clientCustomerId) {
        this.clientCustomerId = clientCustomerId;
    }


    /**
     * Gets the linkStatus value for this ManagedCustomerLink.
     * 
     * @return linkStatus   * The status of the link.
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.LinkStatus getLinkStatus() {
        return linkStatus;
    }


    /**
     * Sets the linkStatus value for this ManagedCustomerLink.
     * 
     * @param linkStatus   * The status of the link.
     */
    public void setLinkStatus(com.google.api.ads.adwords.axis.v201802.mcm.LinkStatus linkStatus) {
        this.linkStatus = linkStatus;
    }


    /**
     * Gets the pendingDescriptiveName value for this ManagedCustomerLink.
     * 
     * @return pendingDescriptiveName   * The pending descriptive name of the client for link invitations.
     */
    public java.lang.String getPendingDescriptiveName() {
        return pendingDescriptiveName;
    }


    /**
     * Sets the pendingDescriptiveName value for this ManagedCustomerLink.
     * 
     * @param pendingDescriptiveName   * The pending descriptive name of the client for link invitations.
     */
    public void setPendingDescriptiveName(java.lang.String pendingDescriptiveName) {
        this.pendingDescriptiveName = pendingDescriptiveName;
    }


    /**
     * Gets the isHidden value for this ManagedCustomerLink.
     * 
     * @return isHidden   * Whether the link is hidden.
     *                 
     *                 <p>Hiding accounts removes them from your manager
     * account views without unlinking them
     *                 in the AdWords UI. Ads in those accounts will continue
     * running normally.
     */
    public java.lang.Boolean getIsHidden() {
        return isHidden;
    }


    /**
     * Sets the isHidden value for this ManagedCustomerLink.
     * 
     * @param isHidden   * Whether the link is hidden.
     *                 
     *                 <p>Hiding accounts removes them from your manager
     * account views without unlinking them
     *                 in the AdWords UI. Ads in those accounts will continue
     * running normally.
     */
    public void setIsHidden(java.lang.Boolean isHidden) {
        this.isHidden = isHidden;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedCustomerLink)) return false;
        ManagedCustomerLink other = (ManagedCustomerLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.managerCustomerId==null && other.getManagerCustomerId()==null) || 
             (this.managerCustomerId!=null &&
              this.managerCustomerId.equals(other.getManagerCustomerId()))) &&
            ((this.clientCustomerId==null && other.getClientCustomerId()==null) || 
             (this.clientCustomerId!=null &&
              this.clientCustomerId.equals(other.getClientCustomerId()))) &&
            ((this.linkStatus==null && other.getLinkStatus()==null) || 
             (this.linkStatus!=null &&
              this.linkStatus.equals(other.getLinkStatus()))) &&
            ((this.pendingDescriptiveName==null && other.getPendingDescriptiveName()==null) || 
             (this.pendingDescriptiveName!=null &&
              this.pendingDescriptiveName.equals(other.getPendingDescriptiveName()))) &&
            ((this.isHidden==null && other.getIsHidden()==null) || 
             (this.isHidden!=null &&
              this.isHidden.equals(other.getIsHidden())));
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
        if (getManagerCustomerId() != null) {
            _hashCode += getManagerCustomerId().hashCode();
        }
        if (getClientCustomerId() != null) {
            _hashCode += getClientCustomerId().hashCode();
        }
        if (getLinkStatus() != null) {
            _hashCode += getLinkStatus().hashCode();
        }
        if (getPendingDescriptiveName() != null) {
            _hashCode += getPendingDescriptiveName().hashCode();
        }
        if (getIsHidden() != null) {
            _hashCode += getIsHidden().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagedCustomerLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "ManagedCustomerLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerCustomerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "managerCustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientCustomerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "clientCustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "linkStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "LinkStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingDescriptiveName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "pendingDescriptiveName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHidden");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "isHidden"));
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
