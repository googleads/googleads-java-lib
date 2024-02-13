// Copyright 2024 Google LLC
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
 * CustomPacingGoal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202402;


/**
 * An interval of a {@link CustomPacingCurve}. A custom pacing goal
 * contains a start time and an
 *             amount. The goal will apply until either the next custom
 * pacing goal's {@code getStartTime} or
 *             the line item's end time if it is the last goal.
 */
public class CustomPacingGoal  implements java.io.Serializable {
    /* The start date and time of the goal. This field is required
     * unless {@code
     *                 useLineItemStartDateTime} is true. */
    private com.google.api.ads.admanager.axis.v202402.DateTime startDateTime;

    /* Whether the {@link LineItem#startDateTime} should be used for
     * the start date and time of this
     *                 goal. This field is not persisted and if it is set
     * to true, the {@code startDateTime} field
     *                 will be populated by the line item's start time. */
    private java.lang.Boolean useLineItemStartDateTime;

    private java.lang.Long amount;

    public CustomPacingGoal() {
    }

    public CustomPacingGoal(
           com.google.api.ads.admanager.axis.v202402.DateTime startDateTime,
           java.lang.Boolean useLineItemStartDateTime,
           java.lang.Long amount) {
           this.startDateTime = startDateTime;
           this.useLineItemStartDateTime = useLineItemStartDateTime;
           this.amount = amount;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("amount", getAmount())
            .add("startDateTime", getStartDateTime())
            .add("useLineItemStartDateTime", getUseLineItemStartDateTime())
            .toString();
    }

    /**
     * Gets the startDateTime value for this CustomPacingGoal.
     * 
     * @return startDateTime   * The start date and time of the goal. This field is required
     * unless {@code
     *                 useLineItemStartDateTime} is true.
     */
    public com.google.api.ads.admanager.axis.v202402.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this CustomPacingGoal.
     * 
     * @param startDateTime   * The start date and time of the goal. This field is required
     * unless {@code
     *                 useLineItemStartDateTime} is true.
     */
    public void setStartDateTime(com.google.api.ads.admanager.axis.v202402.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the useLineItemStartDateTime value for this CustomPacingGoal.
     * 
     * @return useLineItemStartDateTime   * Whether the {@link LineItem#startDateTime} should be used for
     * the start date and time of this
     *                 goal. This field is not persisted and if it is set
     * to true, the {@code startDateTime} field
     *                 will be populated by the line item's start time.
     */
    public java.lang.Boolean getUseLineItemStartDateTime() {
        return useLineItemStartDateTime;
    }


    /**
     * Sets the useLineItemStartDateTime value for this CustomPacingGoal.
     * 
     * @param useLineItemStartDateTime   * Whether the {@link LineItem#startDateTime} should be used for
     * the start date and time of this
     *                 goal. This field is not persisted and if it is set
     * to true, the {@code startDateTime} field
     *                 will be populated by the line item's start time.
     */
    public void setUseLineItemStartDateTime(java.lang.Boolean useLineItemStartDateTime) {
        this.useLineItemStartDateTime = useLineItemStartDateTime;
    }


    /**
     * Gets the amount value for this CustomPacingGoal.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CustomPacingGoal.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomPacingGoal)) return false;
        CustomPacingGoal other = (CustomPacingGoal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.useLineItemStartDateTime==null && other.getUseLineItemStartDateTime()==null) || 
             (this.useLineItemStartDateTime!=null &&
              this.useLineItemStartDateTime.equals(other.getUseLineItemStartDateTime()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount())));
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
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getUseLineItemStartDateTime() != null) {
            _hashCode += getUseLineItemStartDateTime().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomPacingGoal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "CustomPacingGoal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useLineItemStartDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "useLineItemStartDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "amount"));
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
