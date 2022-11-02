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
 * TrafficDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202211;


/**
 * Defines a segment of traffic for which traffic data should be returned.
 */
public class TrafficDataRequest  implements java.io.Serializable {
    /* The {@link TargetingDto} that defines a segment of traffic.
     * <span class="constraint Required">This attribute is required.</span> */
    private com.google.api.ads.admanager.axis.v202211.Targeting targeting;

    /* The date range for which traffic data are requested. This range
     * may cover historical dates,
     *                 future dates, or both.
     *                 
     *                 <p>The data returned are not guaranteed to cover the
     * entire requested date range. If sufficient
     *                 data are not available to cover the entire requested
     * date range, a response may be returned
     *                 with a later start date, earlier end date, or both.
     * <span class="constraint Required">This attribute is required.</span> */
    private com.google.api.ads.admanager.axis.v202211.DateRange requestedDateRange;

    public TrafficDataRequest() {
    }

    public TrafficDataRequest(
           com.google.api.ads.admanager.axis.v202211.Targeting targeting,
           com.google.api.ads.admanager.axis.v202211.DateRange requestedDateRange) {
           this.targeting = targeting;
           this.requestedDateRange = requestedDateRange;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("requestedDateRange", getRequestedDateRange())
            .add("targeting", getTargeting())
            .toString();
    }

    /**
     * Gets the targeting value for this TrafficDataRequest.
     * 
     * @return targeting   * The {@link TargetingDto} that defines a segment of traffic.
     * <span class="constraint Required">This attribute is required.</span>
     */
    public com.google.api.ads.admanager.axis.v202211.Targeting getTargeting() {
        return targeting;
    }


    /**
     * Sets the targeting value for this TrafficDataRequest.
     * 
     * @param targeting   * The {@link TargetingDto} that defines a segment of traffic.
     * <span class="constraint Required">This attribute is required.</span>
     */
    public void setTargeting(com.google.api.ads.admanager.axis.v202211.Targeting targeting) {
        this.targeting = targeting;
    }


    /**
     * Gets the requestedDateRange value for this TrafficDataRequest.
     * 
     * @return requestedDateRange   * The date range for which traffic data are requested. This range
     * may cover historical dates,
     *                 future dates, or both.
     *                 
     *                 <p>The data returned are not guaranteed to cover the
     * entire requested date range. If sufficient
     *                 data are not available to cover the entire requested
     * date range, a response may be returned
     *                 with a later start date, earlier end date, or both.
     * <span class="constraint Required">This attribute is required.</span>
     */
    public com.google.api.ads.admanager.axis.v202211.DateRange getRequestedDateRange() {
        return requestedDateRange;
    }


    /**
     * Sets the requestedDateRange value for this TrafficDataRequest.
     * 
     * @param requestedDateRange   * The date range for which traffic data are requested. This range
     * may cover historical dates,
     *                 future dates, or both.
     *                 
     *                 <p>The data returned are not guaranteed to cover the
     * entire requested date range. If sufficient
     *                 data are not available to cover the entire requested
     * date range, a response may be returned
     *                 with a later start date, earlier end date, or both.
     * <span class="constraint Required">This attribute is required.</span>
     */
    public void setRequestedDateRange(com.google.api.ads.admanager.axis.v202211.DateRange requestedDateRange) {
        this.requestedDateRange = requestedDateRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficDataRequest)) return false;
        TrafficDataRequest other = (TrafficDataRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targeting==null && other.getTargeting()==null) || 
             (this.targeting!=null &&
              this.targeting.equals(other.getTargeting()))) &&
            ((this.requestedDateRange==null && other.getRequestedDateRange()==null) || 
             (this.requestedDateRange!=null &&
              this.requestedDateRange.equals(other.getRequestedDateRange())));
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
        if (getTargeting() != null) {
            _hashCode += getTargeting().hashCode();
        }
        if (getRequestedDateRange() != null) {
            _hashCode += getRequestedDateRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrafficDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "TrafficDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "requestedDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "DateRange"));
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
