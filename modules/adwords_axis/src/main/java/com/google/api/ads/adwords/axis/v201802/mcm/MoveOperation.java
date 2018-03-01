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
 * MoveOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.mcm;


/**
 * Operation for moving ManagedCustomer links. See {@link ManagedCustomerService#mutateManager}.
 */
public class MoveOperation  extends com.google.api.ads.adwords.axis.v201802.cm.Operation  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomerLink operand;

    /* The ID of the old Manager. */
    private java.lang.Long oldManagerCustomerId;

    public MoveOperation() {
    }

    public MoveOperation(
           com.google.api.ads.adwords.axis.v201802.cm.Operator operator,
           java.lang.String operationType,
           com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomerLink operand,
           java.lang.Long oldManagerCustomerId) {
        super(
            operator,
            operationType);
        this.operand = operand;
        this.oldManagerCustomerId = oldManagerCustomerId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("oldManagerCustomerId", getOldManagerCustomerId())
            .add("operand", getOperand())
            .add("operationType", getOperationType())
            .add("operator", getOperator())
            .toString();
    }

    /**
     * Gets the operand value for this MoveOperation.
     * 
     * @return operand
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomerLink getOperand() {
        return operand;
    }


    /**
     * Sets the operand value for this MoveOperation.
     * 
     * @param operand
     */
    public void setOperand(com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomerLink operand) {
        this.operand = operand;
    }


    /**
     * Gets the oldManagerCustomerId value for this MoveOperation.
     * 
     * @return oldManagerCustomerId   * The ID of the old Manager.
     */
    public java.lang.Long getOldManagerCustomerId() {
        return oldManagerCustomerId;
    }


    /**
     * Sets the oldManagerCustomerId value for this MoveOperation.
     * 
     * @param oldManagerCustomerId   * The ID of the old Manager.
     */
    public void setOldManagerCustomerId(java.lang.Long oldManagerCustomerId) {
        this.oldManagerCustomerId = oldManagerCustomerId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoveOperation)) return false;
        MoveOperation other = (MoveOperation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operand==null && other.getOperand()==null) || 
             (this.operand!=null &&
              this.operand.equals(other.getOperand()))) &&
            ((this.oldManagerCustomerId==null && other.getOldManagerCustomerId()==null) || 
             (this.oldManagerCustomerId!=null &&
              this.oldManagerCustomerId.equals(other.getOldManagerCustomerId())));
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
        if (getOperand() != null) {
            _hashCode += getOperand().hashCode();
        }
        if (getOldManagerCustomerId() != null) {
            _hashCode += getOldManagerCustomerId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoveOperation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "MoveOperation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operand");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "operand"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "ManagedCustomerLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldManagerCustomerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "oldManagerCustomerId"));
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
