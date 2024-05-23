// Copyright 2023 Google LLC
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
 * CustomPacingCurve.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202311;


/**
 * A curve consisting of {@link CustomPacingGoal} objects that is
 * used to pace line item delivery.
 */
public class CustomPacingCurve  implements java.io.Serializable {
    /* The unit of the {@link CustomPacingGoalDto#amount} values. */
    private com.google.api.ads.admanager.axis.v202311.CustomPacingGoalUnit customPacingGoalUnit;

    /* The list of goals that make up the custom pacing curve. */
    private com.google.api.ads.admanager.axis.v202311.CustomPacingGoal[] customPacingGoals;

    public CustomPacingCurve() {
    }

    public CustomPacingCurve(
           com.google.api.ads.admanager.axis.v202311.CustomPacingGoalUnit customPacingGoalUnit,
           com.google.api.ads.admanager.axis.v202311.CustomPacingGoal[] customPacingGoals) {
           this.customPacingGoalUnit = customPacingGoalUnit;
           this.customPacingGoals = customPacingGoals;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("customPacingGoalUnit", getCustomPacingGoalUnit())
            .add("customPacingGoals", getCustomPacingGoals())
            .toString();
    }

    /**
     * Gets the customPacingGoalUnit value for this CustomPacingCurve.
     * 
     * @return customPacingGoalUnit   * The unit of the {@link CustomPacingGoalDto#amount} values.
     */
    public com.google.api.ads.admanager.axis.v202311.CustomPacingGoalUnit getCustomPacingGoalUnit() {
        return customPacingGoalUnit;
    }


    /**
     * Sets the customPacingGoalUnit value for this CustomPacingCurve.
     * 
     * @param customPacingGoalUnit   * The unit of the {@link CustomPacingGoalDto#amount} values.
     */
    public void setCustomPacingGoalUnit(com.google.api.ads.admanager.axis.v202311.CustomPacingGoalUnit customPacingGoalUnit) {
        this.customPacingGoalUnit = customPacingGoalUnit;
    }


    /**
     * Gets the customPacingGoals value for this CustomPacingCurve.
     * 
     * @return customPacingGoals   * The list of goals that make up the custom pacing curve.
     */
    public com.google.api.ads.admanager.axis.v202311.CustomPacingGoal[] getCustomPacingGoals() {
        return customPacingGoals;
    }


    /**
     * Sets the customPacingGoals value for this CustomPacingCurve.
     * 
     * @param customPacingGoals   * The list of goals that make up the custom pacing curve.
     */
    public void setCustomPacingGoals(com.google.api.ads.admanager.axis.v202311.CustomPacingGoal[] customPacingGoals) {
        this.customPacingGoals = customPacingGoals;
    }

    public com.google.api.ads.admanager.axis.v202311.CustomPacingGoal getCustomPacingGoals(int i) {
        return this.customPacingGoals[i];
    }

    public void setCustomPacingGoals(int i, com.google.api.ads.admanager.axis.v202311.CustomPacingGoal _value) {
        this.customPacingGoals[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomPacingCurve)) return false;
        CustomPacingCurve other = (CustomPacingCurve) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customPacingGoalUnit==null && other.getCustomPacingGoalUnit()==null) || 
             (this.customPacingGoalUnit!=null &&
              this.customPacingGoalUnit.equals(other.getCustomPacingGoalUnit()))) &&
            ((this.customPacingGoals==null && other.getCustomPacingGoals()==null) || 
             (this.customPacingGoals!=null &&
              java.util.Arrays.equals(this.customPacingGoals, other.getCustomPacingGoals())));
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
        if (getCustomPacingGoalUnit() != null) {
            _hashCode += getCustomPacingGoalUnit().hashCode();
        }
        if (getCustomPacingGoals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomPacingGoals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomPacingGoals(), i);
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
        new org.apache.axis.description.TypeDesc(CustomPacingCurve.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "CustomPacingCurve"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customPacingGoalUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "customPacingGoalUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "CustomPacingGoalUnit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customPacingGoals");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "customPacingGoals"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "CustomPacingGoal"));
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
