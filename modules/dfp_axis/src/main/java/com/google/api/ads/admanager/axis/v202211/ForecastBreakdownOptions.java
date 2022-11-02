// Copyright 2022 Google LLC
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
 * ForecastBreakdownOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202211;


/**
 * Configuration of forecast breakdown.
 */
public class ForecastBreakdownOptions  implements java.io.Serializable {
    /* The boundaries of time windows to configure time breakdown.
     * 
     *                 <p>By default, the time window of the forecasted {@link
     * LineItem} is assumed if none are
     *                 explicitly specified in this field. But if set, at
     * least two {@link DateTime}s are needed to
     *                 define the boundaries of minimally one time window.
     * 
     *                 <p>Also, the time boundaries are required to be in
     * the same time zone, in strictly ascending
     *                 order. */
    private com.google.api.ads.admanager.axis.v202211.DateTime[] timeWindows;

    /* For each time window, these are the breakdown targets.
     *                 If none specified, the targeting of the forecasted
     * {@link LineItem} is assumed. */
    private com.google.api.ads.admanager.axis.v202211.ForecastBreakdownTarget[] targets;

    public ForecastBreakdownOptions() {
    }

    public ForecastBreakdownOptions(
           com.google.api.ads.admanager.axis.v202211.DateTime[] timeWindows,
           com.google.api.ads.admanager.axis.v202211.ForecastBreakdownTarget[] targets) {
           this.timeWindows = timeWindows;
           this.targets = targets;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("targets", getTargets())
            .add("timeWindows", getTimeWindows())
            .toString();
    }

    /**
     * Gets the timeWindows value for this ForecastBreakdownOptions.
     * 
     * @return timeWindows   * The boundaries of time windows to configure time breakdown.
     * 
     *                 <p>By default, the time window of the forecasted {@link
     * LineItem} is assumed if none are
     *                 explicitly specified in this field. But if set, at
     * least two {@link DateTime}s are needed to
     *                 define the boundaries of minimally one time window.
     * 
     *                 <p>Also, the time boundaries are required to be in
     * the same time zone, in strictly ascending
     *                 order.
     */
    public com.google.api.ads.admanager.axis.v202211.DateTime[] getTimeWindows() {
        return timeWindows;
    }


    /**
     * Sets the timeWindows value for this ForecastBreakdownOptions.
     * 
     * @param timeWindows   * The boundaries of time windows to configure time breakdown.
     * 
     *                 <p>By default, the time window of the forecasted {@link
     * LineItem} is assumed if none are
     *                 explicitly specified in this field. But if set, at
     * least two {@link DateTime}s are needed to
     *                 define the boundaries of minimally one time window.
     * 
     *                 <p>Also, the time boundaries are required to be in
     * the same time zone, in strictly ascending
     *                 order.
     */
    public void setTimeWindows(com.google.api.ads.admanager.axis.v202211.DateTime[] timeWindows) {
        this.timeWindows = timeWindows;
    }

    public com.google.api.ads.admanager.axis.v202211.DateTime getTimeWindows(int i) {
        return this.timeWindows[i];
    }

    public void setTimeWindows(int i, com.google.api.ads.admanager.axis.v202211.DateTime _value) {
        this.timeWindows[i] = _value;
    }


    /**
     * Gets the targets value for this ForecastBreakdownOptions.
     * 
     * @return targets   * For each time window, these are the breakdown targets.
     *                 If none specified, the targeting of the forecasted
     * {@link LineItem} is assumed.
     */
    public com.google.api.ads.admanager.axis.v202211.ForecastBreakdownTarget[] getTargets() {
        return targets;
    }


    /**
     * Sets the targets value for this ForecastBreakdownOptions.
     * 
     * @param targets   * For each time window, these are the breakdown targets.
     *                 If none specified, the targeting of the forecasted
     * {@link LineItem} is assumed.
     */
    public void setTargets(com.google.api.ads.admanager.axis.v202211.ForecastBreakdownTarget[] targets) {
        this.targets = targets;
    }

    public com.google.api.ads.admanager.axis.v202211.ForecastBreakdownTarget getTargets(int i) {
        return this.targets[i];
    }

    public void setTargets(int i, com.google.api.ads.admanager.axis.v202211.ForecastBreakdownTarget _value) {
        this.targets[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForecastBreakdownOptions)) return false;
        ForecastBreakdownOptions other = (ForecastBreakdownOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timeWindows==null && other.getTimeWindows()==null) || 
             (this.timeWindows!=null &&
              java.util.Arrays.equals(this.timeWindows, other.getTimeWindows()))) &&
            ((this.targets==null && other.getTargets()==null) || 
             (this.targets!=null &&
              java.util.Arrays.equals(this.targets, other.getTargets())));
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
        if (getTimeWindows() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeWindows());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeWindows(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargets(), i);
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
        new org.apache.axis.description.TypeDesc(ForecastBreakdownOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "ForecastBreakdownOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeWindows");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "timeWindows"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targets");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "targets"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "ForecastBreakdownTarget"));
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
