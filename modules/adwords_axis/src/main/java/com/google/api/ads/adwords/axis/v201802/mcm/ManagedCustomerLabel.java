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
 * ManagedCustomerLabel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.mcm;


/**
 * A label ID and customer ID the label applies to.
 */
public class ManagedCustomerLabel  implements java.io.Serializable {
    /* The ID of an existing label to be applied to the account.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long labelId;

    /* The 10-digit customer ID that identifies this account. Note
     * that this is a {@code long} (do not
     *                 include hyphens in the middle), just like {@link ManagedCustomer#customerId}.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span> */
    private java.lang.Long customerId;

    public ManagedCustomerLabel() {
    }

    public ManagedCustomerLabel(
           java.lang.Long labelId,
           java.lang.Long customerId) {
           this.labelId = labelId;
           this.customerId = customerId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("customerId", getCustomerId())
            .add("labelId", getLabelId())
            .toString();
    }

    /**
     * Gets the labelId value for this ManagedCustomerLabel.
     * 
     * @return labelId   * The ID of an existing label to be applied to the account.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getLabelId() {
        return labelId;
    }


    /**
     * Sets the labelId value for this ManagedCustomerLabel.
     * 
     * @param labelId   * The ID of an existing label to be applied to the account.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setLabelId(java.lang.Long labelId) {
        this.labelId = labelId;
    }


    /**
     * Gets the customerId value for this ManagedCustomerLabel.
     * 
     * @return customerId   * The 10-digit customer ID that identifies this account. Note
     * that this is a {@code long} (do not
     *                 include hyphens in the middle), just like {@link ManagedCustomer#customerId}.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     */
    public java.lang.Long getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this ManagedCustomerLabel.
     * 
     * @param customerId   * The 10-digit customer ID that identifies this account. Note
     * that this is a {@code long} (do not
     *                 include hyphens in the middle), just like {@link ManagedCustomer#customerId}.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     */
    public void setCustomerId(java.lang.Long customerId) {
        this.customerId = customerId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedCustomerLabel)) return false;
        ManagedCustomerLabel other = (ManagedCustomerLabel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.labelId==null && other.getLabelId()==null) || 
             (this.labelId!=null &&
              this.labelId.equals(other.getLabelId()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId())));
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
        if (getLabelId() != null) {
            _hashCode += getLabelId().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagedCustomerLabel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "ManagedCustomerLabel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "labelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "customerId"));
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
