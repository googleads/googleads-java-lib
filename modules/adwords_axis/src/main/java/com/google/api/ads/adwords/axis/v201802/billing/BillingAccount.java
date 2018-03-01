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
 * BillingAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.billing;


/**
 * Represents an account to which invoices are sent in
 *             <a href="https://support.google.com/adwords/answer/2375371">consolidated
 * billing</a>.
 */
public class BillingAccount  implements java.io.Serializable {
    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private java.lang.String id;

    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private java.lang.String name;

    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private java.lang.String currencyCode;

    /* A 12 digit billing id assigned to the user by Google.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String primaryBillingId;

    /* An optional secondary billing id assigned to the user by Google. */
    private java.lang.String secondaryBillingId;

    public BillingAccount() {
    }

    public BillingAccount(
           java.lang.String id,
           java.lang.String name,
           java.lang.String currencyCode,
           java.lang.String primaryBillingId,
           java.lang.String secondaryBillingId) {
           this.id = id;
           this.name = name;
           this.currencyCode = currencyCode;
           this.primaryBillingId = primaryBillingId;
           this.secondaryBillingId = secondaryBillingId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("currencyCode", getCurrencyCode())
            .add("id", getId())
            .add("name", getName())
            .add("primaryBillingId", getPrimaryBillingId())
            .add("secondaryBillingId", getSecondaryBillingId())
            .toString();
    }

    /**
     * Gets the id value for this BillingAccount.
     * 
     * @return id   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this BillingAccount.
     * 
     * @param id   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this BillingAccount.
     * 
     * @return name   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BillingAccount.
     * 
     * @param name   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the currencyCode value for this BillingAccount.
     * 
     * @return currencyCode   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this BillingAccount.
     * 
     * @param currencyCode   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the primaryBillingId value for this BillingAccount.
     * 
     * @return primaryBillingId   * A 12 digit billing id assigned to the user by Google.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getPrimaryBillingId() {
        return primaryBillingId;
    }


    /**
     * Sets the primaryBillingId value for this BillingAccount.
     * 
     * @param primaryBillingId   * A 12 digit billing id assigned to the user by Google.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setPrimaryBillingId(java.lang.String primaryBillingId) {
        this.primaryBillingId = primaryBillingId;
    }


    /**
     * Gets the secondaryBillingId value for this BillingAccount.
     * 
     * @return secondaryBillingId   * An optional secondary billing id assigned to the user by Google.
     */
    public java.lang.String getSecondaryBillingId() {
        return secondaryBillingId;
    }


    /**
     * Sets the secondaryBillingId value for this BillingAccount.
     * 
     * @param secondaryBillingId   * An optional secondary billing id assigned to the user by Google.
     */
    public void setSecondaryBillingId(java.lang.String secondaryBillingId) {
        this.secondaryBillingId = secondaryBillingId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingAccount)) return false;
        BillingAccount other = (BillingAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.primaryBillingId==null && other.getPrimaryBillingId()==null) || 
             (this.primaryBillingId!=null &&
              this.primaryBillingId.equals(other.getPrimaryBillingId()))) &&
            ((this.secondaryBillingId==null && other.getSecondaryBillingId()==null) || 
             (this.secondaryBillingId!=null &&
              this.secondaryBillingId.equals(other.getSecondaryBillingId())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getPrimaryBillingId() != null) {
            _hashCode += getPrimaryBillingId().hashCode();
        }
        if (getSecondaryBillingId() != null) {
            _hashCode += getSecondaryBillingId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "BillingAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryBillingId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "primaryBillingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryBillingId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "secondaryBillingId"));
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
