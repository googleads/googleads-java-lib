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
 * AccountLabelReturnValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.mcm;


/**
 * Contains a list of AccountLabels.
 */
public class AccountLabelReturnValue  implements java.io.Serializable {
    /* List of account labels. */
    private com.google.api.ads.adwords.axis.v201802.mcm.AccountLabel[] labels;

    public AccountLabelReturnValue() {
    }

    public AccountLabelReturnValue(
           com.google.api.ads.adwords.axis.v201802.mcm.AccountLabel[] labels) {
           this.labels = labels;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("labels", getLabels())
            .toString();
    }

    /**
     * Gets the labels value for this AccountLabelReturnValue.
     * 
     * @return labels   * List of account labels.
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.AccountLabel[] getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this AccountLabelReturnValue.
     * 
     * @param labels   * List of account labels.
     */
    public void setLabels(com.google.api.ads.adwords.axis.v201802.mcm.AccountLabel[] labels) {
        this.labels = labels;
    }

    public com.google.api.ads.adwords.axis.v201802.mcm.AccountLabel getLabels(int i) {
        return this.labels[i];
    }

    public void setLabels(int i, com.google.api.ads.adwords.axis.v201802.mcm.AccountLabel _value) {
        this.labels[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountLabelReturnValue)) return false;
        AccountLabelReturnValue other = (AccountLabelReturnValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.labels==null && other.getLabels()==null) || 
             (this.labels!=null &&
              java.util.Arrays.equals(this.labels, other.getLabels())));
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
        if (getLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabels(), i);
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
        new org.apache.axis.description.TypeDesc(AccountLabelReturnValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "AccountLabelReturnValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "AccountLabel"));
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
