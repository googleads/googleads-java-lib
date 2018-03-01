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
 * CountryConstraint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Information about countries that were targeted that caused a policy
 * finding. If a
 *             CountryConstraint has 0 targeted countries and an empty
 * list of constrained countries, it means
 *             that the constraint applies globally.
 */
public class CountryConstraint  extends com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicConstraint  implements java.io.Serializable {
    /* The set of targeted country criterion IDs to which a policy
     * topic entry applies. */
    private long[] constrainedCountries;

    /* The total number of targeted countries. */
    private java.lang.Integer totalTargetedCountries;

    public CountryConstraint() {
    }

    public CountryConstraint(
           com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicConstraintPolicyTopicConstraintType constraintType,
           java.lang.String policyTopicConstraintType,
           long[] constrainedCountries,
           java.lang.Integer totalTargetedCountries) {
        super(
            constraintType,
            policyTopicConstraintType);
        this.constrainedCountries = constrainedCountries;
        this.totalTargetedCountries = totalTargetedCountries;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("constrainedCountries", getConstrainedCountries())
            .add("constraintType", getConstraintType())
            .add("policyTopicConstraintType", getPolicyTopicConstraintType())
            .add("totalTargetedCountries", getTotalTargetedCountries())
            .toString();
    }

    /**
     * Gets the constrainedCountries value for this CountryConstraint.
     * 
     * @return constrainedCountries   * The set of targeted country criterion IDs to which a policy
     * topic entry applies.
     */
    public long[] getConstrainedCountries() {
        return constrainedCountries;
    }


    /**
     * Sets the constrainedCountries value for this CountryConstraint.
     * 
     * @param constrainedCountries   * The set of targeted country criterion IDs to which a policy
     * topic entry applies.
     */
    public void setConstrainedCountries(long[] constrainedCountries) {
        this.constrainedCountries = constrainedCountries;
    }

    public long getConstrainedCountries(int i) {
        return this.constrainedCountries[i];
    }

    public void setConstrainedCountries(int i, long _value) {
        this.constrainedCountries[i] = _value;
    }


    /**
     * Gets the totalTargetedCountries value for this CountryConstraint.
     * 
     * @return totalTargetedCountries   * The total number of targeted countries.
     */
    public java.lang.Integer getTotalTargetedCountries() {
        return totalTargetedCountries;
    }


    /**
     * Sets the totalTargetedCountries value for this CountryConstraint.
     * 
     * @param totalTargetedCountries   * The total number of targeted countries.
     */
    public void setTotalTargetedCountries(java.lang.Integer totalTargetedCountries) {
        this.totalTargetedCountries = totalTargetedCountries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CountryConstraint)) return false;
        CountryConstraint other = (CountryConstraint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.constrainedCountries==null && other.getConstrainedCountries()==null) || 
             (this.constrainedCountries!=null &&
              java.util.Arrays.equals(this.constrainedCountries, other.getConstrainedCountries()))) &&
            ((this.totalTargetedCountries==null && other.getTotalTargetedCountries()==null) || 
             (this.totalTargetedCountries!=null &&
              this.totalTargetedCountries.equals(other.getTotalTargetedCountries())));
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
        if (getConstrainedCountries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConstrainedCountries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConstrainedCountries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalTargetedCountries() != null) {
            _hashCode += getTotalTargetedCountries().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CountryConstraint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CountryConstraint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("constrainedCountries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "constrainedCountries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTargetedCountries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "totalTargetedCountries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
