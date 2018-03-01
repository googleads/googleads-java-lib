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
 * MoneyWithCurrency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a money amount with currency.
 */
public class MoneyWithCurrency  extends com.google.api.ads.adwords.axis.v201802.cm.ComparableValue  implements java.io.Serializable {
    /* The amount of money.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Money money;

    /* Currency code.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 3 and 3, inclusive, (trimmed).</span> */
    private java.lang.String currencyCode;

    public MoneyWithCurrency() {
    }

    public MoneyWithCurrency(
           java.lang.String comparableValueType,
           com.google.api.ads.adwords.axis.v201802.cm.Money money,
           java.lang.String currencyCode) {
        super(
            comparableValueType);
        this.money = money;
        this.currencyCode = currencyCode;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("comparableValueType", getComparableValueType())
            .add("currencyCode", getCurrencyCode())
            .add("money", getMoney())
            .toString();
    }

    /**
     * Gets the money value for this MoneyWithCurrency.
     * 
     * @return money   * The amount of money.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getMoney() {
        return money;
    }


    /**
     * Sets the money value for this MoneyWithCurrency.
     * 
     * @param money   * The amount of money.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public void setMoney(com.google.api.ads.adwords.axis.v201802.cm.Money money) {
        this.money = money;
    }


    /**
     * Gets the currencyCode value for this MoneyWithCurrency.
     * 
     * @return currencyCode   * Currency code.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 3 and 3, inclusive, (trimmed).</span>
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this MoneyWithCurrency.
     * 
     * @param currencyCode   * Currency code.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 3 and 3, inclusive, (trimmed).</span>
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoneyWithCurrency)) return false;
        MoneyWithCurrency other = (MoneyWithCurrency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.money==null && other.getMoney()==null) || 
             (this.money!=null &&
              this.money.equals(other.getMoney()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode())));
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
        if (getMoney() != null) {
            _hashCode += getMoney().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoneyWithCurrency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MoneyWithCurrency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("money");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "money"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "currencyCode"));
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
