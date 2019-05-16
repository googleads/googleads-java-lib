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
 * TrafficForecastAdjustment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v201905;


/**
 * Represents a set of {@link TrafficForecastAdjustmentSegment} assigned
 * to a slice of inventory
 *             defined by a {@link TrafficTimeSeriesFilterCriteria}.
 */
public class TrafficForecastAdjustment  implements java.io.Serializable {
    /* The unique ID of the {@link TrafficForecastAdjustment}.
     *                 This attribute is read-only. */
    private java.lang.Long id;

    /* Filter criteria defining the slice of inventory to which the
     * adjustment is assigned. */
    private com.google.api.ads.admanager.axis.v201905.TrafficTimeSeriesFilterCriteria filterCriteria;

    /* Each adjustment segment is a forecast adjustment targeting
     * a continuous date range. */
    private com.google.api.ads.admanager.axis.v201905.TrafficForecastAdjustmentSegment[] forecastAdjustmentSegments;

    /* The {@link DateTime} this {@link TrafficForecastAdjustment}
     * was last modified. */
    private com.google.api.ads.admanager.axis.v201905.DateTime lastModifiedDateTime;

    public TrafficForecastAdjustment() {
    }

    public TrafficForecastAdjustment(
           java.lang.Long id,
           com.google.api.ads.admanager.axis.v201905.TrafficTimeSeriesFilterCriteria filterCriteria,
           com.google.api.ads.admanager.axis.v201905.TrafficForecastAdjustmentSegment[] forecastAdjustmentSegments,
           com.google.api.ads.admanager.axis.v201905.DateTime lastModifiedDateTime) {
           this.id = id;
           this.filterCriteria = filterCriteria;
           this.forecastAdjustmentSegments = forecastAdjustmentSegments;
           this.lastModifiedDateTime = lastModifiedDateTime;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("filterCriteria", getFilterCriteria())
            .add("forecastAdjustmentSegments", getForecastAdjustmentSegments())
            .add("id", getId())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .toString();
    }

    /**
     * Gets the id value for this TrafficForecastAdjustment.
     * 
     * @return id   * The unique ID of the {@link TrafficForecastAdjustment}.
     *                 This attribute is read-only.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this TrafficForecastAdjustment.
     * 
     * @param id   * The unique ID of the {@link TrafficForecastAdjustment}.
     *                 This attribute is read-only.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the filterCriteria value for this TrafficForecastAdjustment.
     * 
     * @return filterCriteria   * Filter criteria defining the slice of inventory to which the
     * adjustment is assigned.
     */
    public com.google.api.ads.admanager.axis.v201905.TrafficTimeSeriesFilterCriteria getFilterCriteria() {
        return filterCriteria;
    }


    /**
     * Sets the filterCriteria value for this TrafficForecastAdjustment.
     * 
     * @param filterCriteria   * Filter criteria defining the slice of inventory to which the
     * adjustment is assigned.
     */
    public void setFilterCriteria(com.google.api.ads.admanager.axis.v201905.TrafficTimeSeriesFilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
    }


    /**
     * Gets the forecastAdjustmentSegments value for this TrafficForecastAdjustment.
     * 
     * @return forecastAdjustmentSegments   * Each adjustment segment is a forecast adjustment targeting
     * a continuous date range.
     */
    public com.google.api.ads.admanager.axis.v201905.TrafficForecastAdjustmentSegment[] getForecastAdjustmentSegments() {
        return forecastAdjustmentSegments;
    }


    /**
     * Sets the forecastAdjustmentSegments value for this TrafficForecastAdjustment.
     * 
     * @param forecastAdjustmentSegments   * Each adjustment segment is a forecast adjustment targeting
     * a continuous date range.
     */
    public void setForecastAdjustmentSegments(com.google.api.ads.admanager.axis.v201905.TrafficForecastAdjustmentSegment[] forecastAdjustmentSegments) {
        this.forecastAdjustmentSegments = forecastAdjustmentSegments;
    }

    public com.google.api.ads.admanager.axis.v201905.TrafficForecastAdjustmentSegment getForecastAdjustmentSegments(int i) {
        return this.forecastAdjustmentSegments[i];
    }

    public void setForecastAdjustmentSegments(int i, com.google.api.ads.admanager.axis.v201905.TrafficForecastAdjustmentSegment _value) {
        this.forecastAdjustmentSegments[i] = _value;
    }


    /**
     * Gets the lastModifiedDateTime value for this TrafficForecastAdjustment.
     * 
     * @return lastModifiedDateTime   * The {@link DateTime} this {@link TrafficForecastAdjustment}
     * was last modified.
     */
    public com.google.api.ads.admanager.axis.v201905.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this TrafficForecastAdjustment.
     * 
     * @param lastModifiedDateTime   * The {@link DateTime} this {@link TrafficForecastAdjustment}
     * was last modified.
     */
    public void setLastModifiedDateTime(com.google.api.ads.admanager.axis.v201905.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficForecastAdjustment)) return false;
        TrafficForecastAdjustment other = (TrafficForecastAdjustment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.filterCriteria==null && other.getFilterCriteria()==null) || 
             (this.filterCriteria!=null &&
              this.filterCriteria.equals(other.getFilterCriteria()))) &&
            ((this.forecastAdjustmentSegments==null && other.getForecastAdjustmentSegments()==null) || 
             (this.forecastAdjustmentSegments!=null &&
              java.util.Arrays.equals(this.forecastAdjustmentSegments, other.getForecastAdjustmentSegments()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getFilterCriteria() != null) {
            _hashCode += getFilterCriteria().hashCode();
        }
        if (getForecastAdjustmentSegments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForecastAdjustmentSegments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForecastAdjustmentSegments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrafficForecastAdjustment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "TrafficForecastAdjustment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "filterCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "TrafficTimeSeriesFilterCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastAdjustmentSegments");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "forecastAdjustmentSegments"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "TrafficForecastAdjustmentSegment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "DateTime"));
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
