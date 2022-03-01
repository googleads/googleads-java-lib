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
 * DateRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202202;


/**
 * Represents a range of dates that has an upper and a lower bound.
 * 
 *             <p>An open ended date range can be described by only setting
 * either one of the bounds, the upper
 *             bound or the lower bound.
 */
public class DateRange  implements java.io.Serializable {
    /* The start date of this range. This field is optional and if
     * it is not set then there is no
     *                 lower bound on the date range. If this field is not
     * set then {@code endDate} must be specified. */
    private com.google.api.ads.admanager.axis.v202202.Date startDate;

    /* The end date of this range. This field is optional and if it
     * is not set then there is no upper
     *                 bound on the date range. If this field is not set
     * then {@code startDate} must be specified. */
    private com.google.api.ads.admanager.axis.v202202.Date endDate;

    public DateRange() {
    }

    public DateRange(
           com.google.api.ads.admanager.axis.v202202.Date startDate,
           com.google.api.ads.admanager.axis.v202202.Date endDate) {
           this.startDate = startDate;
           this.endDate = endDate;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("endDate", getEndDate())
            .add("startDate", getStartDate())
            .toString();
    }

    /**
     * Gets the startDate value for this DateRange.
     * 
     * @return startDate   * The start date of this range. This field is optional and if
     * it is not set then there is no
     *                 lower bound on the date range. If this field is not
     * set then {@code endDate} must be specified.
     */
    public com.google.api.ads.admanager.axis.v202202.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this DateRange.
     * 
     * @param startDate   * The start date of this range. This field is optional and if
     * it is not set then there is no
     *                 lower bound on the date range. If this field is not
     * set then {@code endDate} must be specified.
     */
    public void setStartDate(com.google.api.ads.admanager.axis.v202202.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this DateRange.
     * 
     * @return endDate   * The end date of this range. This field is optional and if it
     * is not set then there is no upper
     *                 bound on the date range. If this field is not set
     * then {@code startDate} must be specified.
     */
    public com.google.api.ads.admanager.axis.v202202.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this DateRange.
     * 
     * @param endDate   * The end date of this range. This field is optional and if it
     * is not set then there is no upper
     *                 bound on the date range. If this field is not set
     * then {@code startDate} must be specified.
     */
    public void setEndDate(com.google.api.ads.admanager.axis.v202202.Date endDate) {
        this.endDate = endDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateRange)) return false;
        DateRange other = (DateRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate())));
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
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "DateRange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "Date"));
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
