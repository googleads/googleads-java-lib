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
 * DateTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202411;

public class DateTime  implements java.io.Serializable {
    private com.google.api.ads.admanager.axis.v202411.Date date;

    private java.lang.Integer hour;

    private java.lang.Integer minute;

    private java.lang.Integer second;

    private java.lang.String timeZoneId;

    public DateTime() {
    }

    public DateTime(
           com.google.api.ads.admanager.axis.v202411.Date date,
           java.lang.Integer hour,
           java.lang.Integer minute,
           java.lang.Integer second,
           java.lang.String timeZoneId) {
           this.date = date;
           this.hour = hour;
           this.minute = minute;
           this.second = second;
           this.timeZoneId = timeZoneId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("date", getDate())
            .add("hour", getHour())
            .add("minute", getMinute())
            .add("second", getSecond())
            .add("timeZoneId", getTimeZoneId())
            .toString();
    }

    /**
     * Gets the date value for this DateTime.
     * 
     * @return date
     */
    public com.google.api.ads.admanager.axis.v202411.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this DateTime.
     * 
     * @param date
     */
    public void setDate(com.google.api.ads.admanager.axis.v202411.Date date) {
        this.date = date;
    }


    /**
     * Gets the hour value for this DateTime.
     * 
     * @return hour
     */
    public java.lang.Integer getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this DateTime.
     * 
     * @param hour
     */
    public void setHour(java.lang.Integer hour) {
        this.hour = hour;
    }


    /**
     * Gets the minute value for this DateTime.
     * 
     * @return minute
     */
    public java.lang.Integer getMinute() {
        return minute;
    }


    /**
     * Sets the minute value for this DateTime.
     * 
     * @param minute
     */
    public void setMinute(java.lang.Integer minute) {
        this.minute = minute;
    }


    /**
     * Gets the second value for this DateTime.
     * 
     * @return second
     */
    public java.lang.Integer getSecond() {
        return second;
    }


    /**
     * Sets the second value for this DateTime.
     * 
     * @param second
     */
    public void setSecond(java.lang.Integer second) {
        this.second = second;
    }


    /**
     * Gets the timeZoneId value for this DateTime.
     * 
     * @return timeZoneId
     */
    public java.lang.String getTimeZoneId() {
        return timeZoneId;
    }


    /**
     * Sets the timeZoneId value for this DateTime.
     * 
     * @param timeZoneId
     */
    public void setTimeZoneId(java.lang.String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateTime)) return false;
        DateTime other = (DateTime) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.hour==null && other.getHour()==null) || 
             (this.hour!=null &&
              this.hour.equals(other.getHour()))) &&
            ((this.minute==null && other.getMinute()==null) || 
             (this.minute!=null &&
              this.minute.equals(other.getMinute()))) &&
            ((this.second==null && other.getSecond()==null) || 
             (this.second!=null &&
              this.second.equals(other.getSecond()))) &&
            ((this.timeZoneId==null && other.getTimeZoneId()==null) || 
             (this.timeZoneId!=null &&
              this.timeZoneId.equals(other.getTimeZoneId())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getHour() != null) {
            _hashCode += getHour().hashCode();
        }
        if (getMinute() != null) {
            _hashCode += getMinute().hashCode();
        }
        if (getSecond() != null) {
            _hashCode += getSecond().hashCode();
        }
        if (getTimeZoneId() != null) {
            _hashCode += getTimeZoneId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "DateTime"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "minute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("second");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "second"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "timeZoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
