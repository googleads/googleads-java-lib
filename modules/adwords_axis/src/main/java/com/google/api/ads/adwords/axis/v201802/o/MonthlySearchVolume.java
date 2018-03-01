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
 * MonthlySearchVolume.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * A keyword response value representing search volume for a single
 * month. An
 *             instance with a {@code null} count is valid, indicating
 * that the information
 *             is unavailable.
 */
public class MonthlySearchVolume  implements java.io.Serializable {
    /* The year this search volume occurred in. (i.e. 2009) */
    private java.lang.Integer year;

    /* The month this search volume occurred in. Month is 1 indexed,
     * such that 1=January and 12=December. */
    private java.lang.Integer month;

    /* The approximate number of searches in this year/month. A {@code
     * null} count
     *                 means that data is unavailable or unknown. */
    private java.lang.Long count;

    public MonthlySearchVolume() {
    }

    public MonthlySearchVolume(
           java.lang.Integer year,
           java.lang.Integer month,
           java.lang.Long count) {
           this.year = year;
           this.month = month;
           this.count = count;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("count", getCount())
            .add("month", getMonth())
            .add("year", getYear())
            .toString();
    }

    /**
     * Gets the year value for this MonthlySearchVolume.
     * 
     * @return year   * The year this search volume occurred in. (i.e. 2009)
     */
    public java.lang.Integer getYear() {
        return year;
    }


    /**
     * Sets the year value for this MonthlySearchVolume.
     * 
     * @param year   * The year this search volume occurred in. (i.e. 2009)
     */
    public void setYear(java.lang.Integer year) {
        this.year = year;
    }


    /**
     * Gets the month value for this MonthlySearchVolume.
     * 
     * @return month   * The month this search volume occurred in. Month is 1 indexed,
     * such that 1=January and 12=December.
     */
    public java.lang.Integer getMonth() {
        return month;
    }


    /**
     * Sets the month value for this MonthlySearchVolume.
     * 
     * @param month   * The month this search volume occurred in. Month is 1 indexed,
     * such that 1=January and 12=December.
     */
    public void setMonth(java.lang.Integer month) {
        this.month = month;
    }


    /**
     * Gets the count value for this MonthlySearchVolume.
     * 
     * @return count   * The approximate number of searches in this year/month. A {@code
     * null} count
     *                 means that data is unavailable or unknown.
     */
    public java.lang.Long getCount() {
        return count;
    }


    /**
     * Sets the count value for this MonthlySearchVolume.
     * 
     * @param count   * The approximate number of searches in this year/month. A {@code
     * null} count
     *                 means that data is unavailable or unknown.
     */
    public void setCount(java.lang.Long count) {
        this.count = count;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MonthlySearchVolume)) return false;
        MonthlySearchVolume other = (MonthlySearchVolume) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.year==null && other.getYear()==null) || 
             (this.year!=null &&
              this.year.equals(other.getYear()))) &&
            ((this.month==null && other.getMonth()==null) || 
             (this.month!=null &&
              this.month.equals(other.getMonth()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount())));
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
        if (getYear() != null) {
            _hashCode += getYear().hashCode();
        }
        if (getMonth() != null) {
            _hashCode += getMonth().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MonthlySearchVolume.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "MonthlySearchVolume"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "count"));
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
