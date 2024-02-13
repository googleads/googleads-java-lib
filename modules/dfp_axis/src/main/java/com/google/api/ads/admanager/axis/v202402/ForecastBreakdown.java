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
 * ForecastBreakdown.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202402;


/**
 * Represents the breakdown entries for a list of targetings and/or
 * creatives.
 */
public class ForecastBreakdown  implements java.io.Serializable {
    /* The starting time of the represented breakdown. */
    private com.google.api.ads.admanager.axis.v202402.DateTime startTime;

    /* The end time of the represented breakdown. */
    private com.google.api.ads.admanager.axis.v202402.DateTime endTime;

    /* The forecast breakdown entries in the same order as in the
     * {@link
     *                 ForecastBreakdownOptions#targets} field. */
    private com.google.api.ads.admanager.axis.v202402.ForecastBreakdownEntry[] breakdownEntries;

    public ForecastBreakdown() {
    }

    public ForecastBreakdown(
           com.google.api.ads.admanager.axis.v202402.DateTime startTime,
           com.google.api.ads.admanager.axis.v202402.DateTime endTime,
           com.google.api.ads.admanager.axis.v202402.ForecastBreakdownEntry[] breakdownEntries) {
           this.startTime = startTime;
           this.endTime = endTime;
           this.breakdownEntries = breakdownEntries;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("breakdownEntries", getBreakdownEntries())
            .add("endTime", getEndTime())
            .add("startTime", getStartTime())
            .toString();
    }

    /**
     * Gets the startTime value for this ForecastBreakdown.
     * 
     * @return startTime   * The starting time of the represented breakdown.
     */
    public com.google.api.ads.admanager.axis.v202402.DateTime getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this ForecastBreakdown.
     * 
     * @param startTime   * The starting time of the represented breakdown.
     */
    public void setStartTime(com.google.api.ads.admanager.axis.v202402.DateTime startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this ForecastBreakdown.
     * 
     * @return endTime   * The end time of the represented breakdown.
     */
    public com.google.api.ads.admanager.axis.v202402.DateTime getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this ForecastBreakdown.
     * 
     * @param endTime   * The end time of the represented breakdown.
     */
    public void setEndTime(com.google.api.ads.admanager.axis.v202402.DateTime endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the breakdownEntries value for this ForecastBreakdown.
     * 
     * @return breakdownEntries   * The forecast breakdown entries in the same order as in the
     * {@link
     *                 ForecastBreakdownOptions#targets} field.
     */
    public com.google.api.ads.admanager.axis.v202402.ForecastBreakdownEntry[] getBreakdownEntries() {
        return breakdownEntries;
    }


    /**
     * Sets the breakdownEntries value for this ForecastBreakdown.
     * 
     * @param breakdownEntries   * The forecast breakdown entries in the same order as in the
     * {@link
     *                 ForecastBreakdownOptions#targets} field.
     */
    public void setBreakdownEntries(com.google.api.ads.admanager.axis.v202402.ForecastBreakdownEntry[] breakdownEntries) {
        this.breakdownEntries = breakdownEntries;
    }

    public com.google.api.ads.admanager.axis.v202402.ForecastBreakdownEntry getBreakdownEntries(int i) {
        return this.breakdownEntries[i];
    }

    public void setBreakdownEntries(int i, com.google.api.ads.admanager.axis.v202402.ForecastBreakdownEntry _value) {
        this.breakdownEntries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForecastBreakdown)) return false;
        ForecastBreakdown other = (ForecastBreakdown) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.breakdownEntries==null && other.getBreakdownEntries()==null) || 
             (this.breakdownEntries!=null &&
              java.util.Arrays.equals(this.breakdownEntries, other.getBreakdownEntries())));
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
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getBreakdownEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBreakdownEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBreakdownEntries(), i);
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
        new org.apache.axis.description.TypeDesc(ForecastBreakdown.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "ForecastBreakdown"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("breakdownEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "breakdownEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "ForecastBreakdownEntry"));
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
