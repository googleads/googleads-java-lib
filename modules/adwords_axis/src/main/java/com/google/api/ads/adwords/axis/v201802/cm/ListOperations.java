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
 * ListOperations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Describes the behavior of elements in a list. Instances of ListOperations
 * will always be defined
 *             alongside some list in an API POJO. The number of operators
 * in the ListOperations must be
 *             equal to the number of elements in the POJO list. Each
 * operator, together with its corresponding
 *             list element, describe an intended change.
 *             
 *             <p>For example, if in a request Campaign.selectiveOptimization
 * contains 2 conversionTypeIds,
 *             and the conversionTypeIdsOps is non-null, it must contain
 * 2 operators. If those operators are
 *             {PUT, REMOVE} then the API will add the first conversionTypeId
 * (if it doesn't
 *             already exist) and remove the second conversionTypeId
 * (if it exists).
 */
public class ListOperations  implements java.io.Serializable {
    /* Indicates that all contents of the list should be deleted.
     * If this is true, the list will be
     *                 cleared first, then proceed to the operators. */
    private java.lang.Boolean clear;

    /* The desired behavior of each element in the POJO list that
     * this ListOperation corresponds to.
     *                 This will contain the same number of elements as the
     * corresponding List<>. */
    private com.google.api.ads.adwords.axis.v201802.cm.ListOperationsListOperator[] operators;

    public ListOperations() {
    }

    public ListOperations(
           java.lang.Boolean clear,
           com.google.api.ads.adwords.axis.v201802.cm.ListOperationsListOperator[] operators) {
           this.clear = clear;
           this.operators = operators;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("clear", getClear())
            .add("operators", getOperators())
            .toString();
    }

    /**
     * Gets the clear value for this ListOperations.
     * 
     * @return clear   * Indicates that all contents of the list should be deleted.
     * If this is true, the list will be
     *                 cleared first, then proceed to the operators.
     */
    public java.lang.Boolean getClear() {
        return clear;
    }


    /**
     * Sets the clear value for this ListOperations.
     * 
     * @param clear   * Indicates that all contents of the list should be deleted.
     * If this is true, the list will be
     *                 cleared first, then proceed to the operators.
     */
    public void setClear(java.lang.Boolean clear) {
        this.clear = clear;
    }


    /**
     * Gets the operators value for this ListOperations.
     * 
     * @return operators   * The desired behavior of each element in the POJO list that
     * this ListOperation corresponds to.
     *                 This will contain the same number of elements as the
     * corresponding List<>.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ListOperationsListOperator[] getOperators() {
        return operators;
    }


    /**
     * Sets the operators value for this ListOperations.
     * 
     * @param operators   * The desired behavior of each element in the POJO list that
     * this ListOperation corresponds to.
     *                 This will contain the same number of elements as the
     * corresponding List<>.
     */
    public void setOperators(com.google.api.ads.adwords.axis.v201802.cm.ListOperationsListOperator[] operators) {
        this.operators = operators;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.ListOperationsListOperator getOperators(int i) {
        return this.operators[i];
    }

    public void setOperators(int i, com.google.api.ads.adwords.axis.v201802.cm.ListOperationsListOperator _value) {
        this.operators[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListOperations)) return false;
        ListOperations other = (ListOperations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clear==null && other.getClear()==null) || 
             (this.clear!=null &&
              this.clear.equals(other.getClear()))) &&
            ((this.operators==null && other.getOperators()==null) || 
             (this.operators!=null &&
              java.util.Arrays.equals(this.operators, other.getOperators())));
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
        if (getClear() != null) {
            _hashCode += getClear().hashCode();
        }
        if (getOperators() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperators());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperators(), i);
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
        new org.apache.axis.description.TypeDesc(ListOperations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ListOperations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clear");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "clear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operators");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "operators"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ListOperations.ListOperator"));
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
