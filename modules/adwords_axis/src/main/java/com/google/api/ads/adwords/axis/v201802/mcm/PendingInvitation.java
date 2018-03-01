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
 * PendingInvitation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.mcm;


/**
 * Pending invitation result for the getPendingInvitations method.
 */
public class PendingInvitation  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer manager;

    private com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer client;

    private java.lang.String creationDate;

    private java.lang.String expirationDate;

    public PendingInvitation() {
    }

    public PendingInvitation(
           com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer manager,
           com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer client,
           java.lang.String creationDate,
           java.lang.String expirationDate) {
           this.manager = manager;
           this.client = client;
           this.creationDate = creationDate;
           this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("client", getClient())
            .add("creationDate", getCreationDate())
            .add("expirationDate", getExpirationDate())
            .add("manager", getManager())
            .toString();
    }

    /**
     * Gets the manager value for this PendingInvitation.
     * 
     * @return manager
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer getManager() {
        return manager;
    }


    /**
     * Sets the manager value for this PendingInvitation.
     * 
     * @param manager
     */
    public void setManager(com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer manager) {
        this.manager = manager;
    }


    /**
     * Gets the client value for this PendingInvitation.
     * 
     * @return client
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer getClient() {
        return client;
    }


    /**
     * Sets the client value for this PendingInvitation.
     * 
     * @param client
     */
    public void setClient(com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer client) {
        this.client = client;
    }


    /**
     * Gets the creationDate value for this PendingInvitation.
     * 
     * @return creationDate
     */
    public java.lang.String getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this PendingInvitation.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.lang.String creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the expirationDate value for this PendingInvitation.
     * 
     * @return expirationDate
     */
    public java.lang.String getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this PendingInvitation.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.lang.String expirationDate) {
        this.expirationDate = expirationDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PendingInvitation)) return false;
        PendingInvitation other = (PendingInvitation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.manager==null && other.getManager()==null) || 
             (this.manager!=null &&
              this.manager.equals(other.getManager()))) &&
            ((this.client==null && other.getClient()==null) || 
             (this.client!=null &&
              this.client.equals(other.getClient()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate())));
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
        if (getManager() != null) {
            _hashCode += getManager().hashCode();
        }
        if (getClient() != null) {
            _hashCode += getClient().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PendingInvitation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "PendingInvitation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manager");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "manager"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "ManagedCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "client"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "ManagedCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "expirationDate"));
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
