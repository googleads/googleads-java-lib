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
 * StoreSalesTransaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;


/**
 * Contains store sales transaction information.
 */
public class StoreSalesTransaction  implements java.io.Serializable {
    /* List of UserIdentifiers.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.UserIdentifier[] userIdentifiers;

    /* Transaction time.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.String transactionTime;

    /* Transaction amount. We support the ISO 4217 3-character currency
     * code. For example: USD, EUR.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.MoneyWithCurrency transactionAmount;

    /* Conversion name configured while creating ConversionType in
     * AdWords.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.String conversionName;

    public StoreSalesTransaction() {
    }

    public StoreSalesTransaction(
           com.google.api.ads.adwords.axis.v201802.rm.UserIdentifier[] userIdentifiers,
           java.lang.String transactionTime,
           com.google.api.ads.adwords.axis.v201802.rm.MoneyWithCurrency transactionAmount,
           java.lang.String conversionName) {
           this.userIdentifiers = userIdentifiers;
           this.transactionTime = transactionTime;
           this.transactionAmount = transactionAmount;
           this.conversionName = conversionName;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("conversionName", getConversionName())
            .add("transactionAmount", getTransactionAmount())
            .add("transactionTime", getTransactionTime())
            .add("userIdentifiers", getUserIdentifiers())
            .toString();
    }

    /**
     * Gets the userIdentifiers value for this StoreSalesTransaction.
     * 
     * @return userIdentifiers   * List of UserIdentifiers.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.UserIdentifier[] getUserIdentifiers() {
        return userIdentifiers;
    }


    /**
     * Sets the userIdentifiers value for this StoreSalesTransaction.
     * 
     * @param userIdentifiers   * List of UserIdentifiers.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setUserIdentifiers(com.google.api.ads.adwords.axis.v201802.rm.UserIdentifier[] userIdentifiers) {
        this.userIdentifiers = userIdentifiers;
    }

    public com.google.api.ads.adwords.axis.v201802.rm.UserIdentifier getUserIdentifiers(int i) {
        return this.userIdentifiers[i];
    }

    public void setUserIdentifiers(int i, com.google.api.ads.adwords.axis.v201802.rm.UserIdentifier _value) {
        this.userIdentifiers[i] = _value;
    }


    /**
     * Gets the transactionTime value for this StoreSalesTransaction.
     * 
     * @return transactionTime   * Transaction time.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.String getTransactionTime() {
        return transactionTime;
    }


    /**
     * Sets the transactionTime value for this StoreSalesTransaction.
     * 
     * @param transactionTime   * Transaction time.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setTransactionTime(java.lang.String transactionTime) {
        this.transactionTime = transactionTime;
    }


    /**
     * Gets the transactionAmount value for this StoreSalesTransaction.
     * 
     * @return transactionAmount   * Transaction amount. We support the ISO 4217 3-character currency
     * code. For example: USD, EUR.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.MoneyWithCurrency getTransactionAmount() {
        return transactionAmount;
    }


    /**
     * Sets the transactionAmount value for this StoreSalesTransaction.
     * 
     * @param transactionAmount   * Transaction amount. We support the ISO 4217 3-character currency
     * code. For example: USD, EUR.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setTransactionAmount(com.google.api.ads.adwords.axis.v201802.rm.MoneyWithCurrency transactionAmount) {
        this.transactionAmount = transactionAmount;
    }


    /**
     * Gets the conversionName value for this StoreSalesTransaction.
     * 
     * @return conversionName   * Conversion name configured while creating ConversionType in
     * AdWords.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.String getConversionName() {
        return conversionName;
    }


    /**
     * Sets the conversionName value for this StoreSalesTransaction.
     * 
     * @param conversionName   * Conversion name configured while creating ConversionType in
     * AdWords.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setConversionName(java.lang.String conversionName) {
        this.conversionName = conversionName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoreSalesTransaction)) return false;
        StoreSalesTransaction other = (StoreSalesTransaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userIdentifiers==null && other.getUserIdentifiers()==null) || 
             (this.userIdentifiers!=null &&
              java.util.Arrays.equals(this.userIdentifiers, other.getUserIdentifiers()))) &&
            ((this.transactionTime==null && other.getTransactionTime()==null) || 
             (this.transactionTime!=null &&
              this.transactionTime.equals(other.getTransactionTime()))) &&
            ((this.transactionAmount==null && other.getTransactionAmount()==null) || 
             (this.transactionAmount!=null &&
              this.transactionAmount.equals(other.getTransactionAmount()))) &&
            ((this.conversionName==null && other.getConversionName()==null) || 
             (this.conversionName!=null &&
              this.conversionName.equals(other.getConversionName())));
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
        if (getUserIdentifiers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserIdentifiers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserIdentifiers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionTime() != null) {
            _hashCode += getTransactionTime().hashCode();
        }
        if (getTransactionAmount() != null) {
            _hashCode += getTransactionAmount().hashCode();
        }
        if (getConversionName() != null) {
            _hashCode += getConversionName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoreSalesTransaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "StoreSalesTransaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIdentifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "userIdentifiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "UserIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "transactionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "transactionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "MoneyWithCurrency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "conversionName"));
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
