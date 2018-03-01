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
 * ManagedCustomerOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.mcm;


/**
 * An operation to create or modify a managed customer.
 *             
 *             <p><b>Note:</b> The {@code REMOVE} operator is not supported.
 */
public class ManagedCustomerOperation  extends com.google.api.ads.adwords.axis.v201802.cm.Operation  implements java.io.Serializable {
    /* <span class="constraint Required">This field is required and
     * should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer operand;

    /* Email invitee.
     *                     
     *                     <p>Email address of the user who should be invited
     * on the created managed customer. Accessible
     *                     to whitelisted customers only.
     *                     
     *                     <p class="note"><b>Note:</b> This is only supported
     * for {@code ADD} operator.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span> */
    private java.lang.String inviteeEmail;

    /* Email invitee role.
     *                     
     *                     <p>The proposed role of 
     * @{code inviteeEmail} on the created managed customer. Accessible to
     * whitelisted customers only.
     *                     
     *                     <p class="note"><b>Note:</b> This is only supported
     * for {@code ADD} operator.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span> */
    private com.google.api.ads.adwords.axis.v201802.mcm.AccessRole inviteeRole;

    public ManagedCustomerOperation() {
    }

    public ManagedCustomerOperation(
           com.google.api.ads.adwords.axis.v201802.cm.Operator operator,
           java.lang.String operationType,
           com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer operand,
           java.lang.String inviteeEmail,
           com.google.api.ads.adwords.axis.v201802.mcm.AccessRole inviteeRole) {
        super(
            operator,
            operationType);
        this.operand = operand;
        this.inviteeEmail = inviteeEmail;
        this.inviteeRole = inviteeRole;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("inviteeEmail", getInviteeEmail())
            .add("inviteeRole", getInviteeRole())
            .add("operand", getOperand())
            .add("operationType", getOperationType())
            .add("operator", getOperator())
            .toString();
    }

    /**
     * Gets the operand value for this ManagedCustomerOperation.
     * 
     * @return operand   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer getOperand() {
        return operand;
    }


    /**
     * Sets the operand value for this ManagedCustomerOperation.
     * 
     * @param operand   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public void setOperand(com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer operand) {
        this.operand = operand;
    }


    /**
     * Gets the inviteeEmail value for this ManagedCustomerOperation.
     * 
     * @return inviteeEmail   * Email invitee.
     *                     
     *                     <p>Email address of the user who should be invited
     * on the created managed customer. Accessible
     *                     to whitelisted customers only.
     *                     
     *                     <p class="note"><b>Note:</b> This is only supported
     * for {@code ADD} operator.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     */
    public java.lang.String getInviteeEmail() {
        return inviteeEmail;
    }


    /**
     * Sets the inviteeEmail value for this ManagedCustomerOperation.
     * 
     * @param inviteeEmail   * Email invitee.
     *                     
     *                     <p>Email address of the user who should be invited
     * on the created managed customer. Accessible
     *                     to whitelisted customers only.
     *                     
     *                     <p class="note"><b>Note:</b> This is only supported
     * for {@code ADD} operator.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     */
    public void setInviteeEmail(java.lang.String inviteeEmail) {
        this.inviteeEmail = inviteeEmail;
    }


    /**
     * Gets the inviteeRole value for this ManagedCustomerOperation.
     * 
     * @return inviteeRole   * Email invitee role.
     *                     
     *                     <p>The proposed role of 
     * @{code inviteeEmail} on the created managed customer. Accessible to
     * whitelisted customers only.
     *                     
     *                     <p class="note"><b>Note:</b> This is only supported
     * for {@code ADD} operator.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.AccessRole getInviteeRole() {
        return inviteeRole;
    }


    /**
     * Sets the inviteeRole value for this ManagedCustomerOperation.
     * 
     * @param inviteeRole   * Email invitee role.
     *                     
     *                     <p>The proposed role of 
     * @{code inviteeEmail} on the created managed customer. Accessible to
     * whitelisted customers only.
     *                     
     *                     <p class="note"><b>Note:</b> This is only supported
     * for {@code ADD} operator.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     */
    public void setInviteeRole(com.google.api.ads.adwords.axis.v201802.mcm.AccessRole inviteeRole) {
        this.inviteeRole = inviteeRole;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedCustomerOperation)) return false;
        ManagedCustomerOperation other = (ManagedCustomerOperation) obj;
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
            ((this.inviteeEmail==null && other.getInviteeEmail()==null) || 
             (this.inviteeEmail!=null &&
              this.inviteeEmail.equals(other.getInviteeEmail()))) &&
            ((this.inviteeRole==null && other.getInviteeRole()==null) || 
             (this.inviteeRole!=null &&
              this.inviteeRole.equals(other.getInviteeRole())));
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
        if (getInviteeEmail() != null) {
            _hashCode += getInviteeEmail().hashCode();
        }
        if (getInviteeRole() != null) {
            _hashCode += getInviteeRole().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagedCustomerOperation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "ManagedCustomerOperation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operand");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "operand"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "ManagedCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inviteeEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "inviteeEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inviteeRole");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "inviteeRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "AccessRole"));
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
