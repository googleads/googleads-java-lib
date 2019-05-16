// Copyright 2019 Google LLC
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
 * HistoricalAdjustment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v201905;


/**
 * Represents a {@link TrafficForecastAdjustmentSegment} whose {@link
 * BasisType} is {@link
 *             BasisType#HISTORICAL}.
 */
public class HistoricalAdjustment  implements java.io.Serializable {
    /* The future date range targeted for the adjustment. */
    private com.google.api.ads.admanager.axis.v201905.DateRange targetDateRange;

    /* The historical date range intended to be used as the reference. */
    private com.google.api.ads.admanager.axis.v201905.DateRange referenceDateRange;

    /* The multiplier intended to be applied to the historical data
     * in milli-percent.
     *                 For example, in order to represent 100% (which translates
     * to no traffic adjustment),
     *                 this value should be 100000. */
    private java.lang.Long milliPercentMultiplier;

    public HistoricalAdjustment() {
    }

    public HistoricalAdjustment(
           com.google.api.ads.admanager.axis.v201905.DateRange targetDateRange,
           com.google.api.ads.admanager.axis.v201905.DateRange referenceDateRange,
           java.lang.Long milliPercentMultiplier) {
           this.targetDateRange = targetDateRange;
           this.referenceDateRange = referenceDateRange;
           this.milliPercentMultiplier = milliPercentMultiplier;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("milliPercentMultiplier", getMilliPercentMultiplier())
            .add("referenceDateRange", getReferenceDateRange())
            .add("targetDateRange", getTargetDateRange())
            .toString();
    }

    /**
     * Gets the targetDateRange value for this HistoricalAdjustment.
     * 
     * @return targetDateRange   * The future date range targeted for the adjustment.
     */
    public com.google.api.ads.admanager.axis.v201905.DateRange getTargetDateRange() {
        return targetDateRange;
    }


    /**
     * Sets the targetDateRange value for this HistoricalAdjustment.
     * 
     * @param targetDateRange   * The future date range targeted for the adjustment.
     */
    public void setTargetDateRange(com.google.api.ads.admanager.axis.v201905.DateRange targetDateRange) {
        this.targetDateRange = targetDateRange;
    }


    /**
     * Gets the referenceDateRange value for this HistoricalAdjustment.
     * 
     * @return referenceDateRange   * The historical date range intended to be used as the reference.
     */
    public com.google.api.ads.admanager.axis.v201905.DateRange getReferenceDateRange() {
        return referenceDateRange;
    }


    /**
     * Sets the referenceDateRange value for this HistoricalAdjustment.
     * 
     * @param referenceDateRange   * The historical date range intended to be used as the reference.
     */
    public void setReferenceDateRange(com.google.api.ads.admanager.axis.v201905.DateRange referenceDateRange) {
        this.referenceDateRange = referenceDateRange;
    }


    /**
     * Gets the milliPercentMultiplier value for this HistoricalAdjustment.
     * 
     * @return milliPercentMultiplier   * The multiplier intended to be applied to the historical data
     * in milli-percent.
     *                 For example, in order to represent 100% (which translates
     * to no traffic adjustment),
     *                 this value should be 100000.
     */
    public java.lang.Long getMilliPercentMultiplier() {
        return milliPercentMultiplier;
    }


    /**
     * Sets the milliPercentMultiplier value for this HistoricalAdjustment.
     * 
     * @param milliPercentMultiplier   * The multiplier intended to be applied to the historical data
     * in milli-percent.
     *                 For example, in order to represent 100% (which translates
     * to no traffic adjustment),
     *                 this value should be 100000.
     */
    public void setMilliPercentMultiplier(java.lang.Long milliPercentMultiplier) {
        this.milliPercentMultiplier = milliPercentMultiplier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HistoricalAdjustment)) return false;
        HistoricalAdjustment other = (HistoricalAdjustment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetDateRange==null && other.getTargetDateRange()==null) || 
             (this.targetDateRange!=null &&
              this.targetDateRange.equals(other.getTargetDateRange()))) &&
            ((this.referenceDateRange==null && other.getReferenceDateRange()==null) || 
             (this.referenceDateRange!=null &&
              this.referenceDateRange.equals(other.getReferenceDateRange()))) &&
            ((this.milliPercentMultiplier==null && other.getMilliPercentMultiplier()==null) || 
             (this.milliPercentMultiplier!=null &&
              this.milliPercentMultiplier.equals(other.getMilliPercentMultiplier())));
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
        if (getTargetDateRange() != null) {
            _hashCode += getTargetDateRange().hashCode();
        }
        if (getReferenceDateRange() != null) {
            _hashCode += getReferenceDateRange().hashCode();
        }
        if (getMilliPercentMultiplier() != null) {
            _hashCode += getMilliPercentMultiplier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HistoricalAdjustment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "HistoricalAdjustment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "targetDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "DateRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "referenceDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "DateRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milliPercentMultiplier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "milliPercentMultiplier"));
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
