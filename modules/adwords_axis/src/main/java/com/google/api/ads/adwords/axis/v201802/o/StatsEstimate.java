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
 * StatsEstimate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * Represents a set of stats for a daily traffic estimate.
 *             
 *             <p>{@code averageCpc}, {@code averagePosition} and {@code
 * clickThroughRate} will be
 *             {@code null} when not defined and {@code clicksPerDay}
 * or {@code impressionsPerDay}
 *             is {@code 0}, respectively.</p>
 */
public class StatsEstimate  implements java.io.Serializable {
    /* The estimated average CPC. */
    private com.google.api.ads.adwords.axis.v201802.cm.Money averageCpc;

    /* The estimated average position. */
    private java.lang.Double averagePosition;

    /* The estimated click through rate. */
    private java.lang.Double clickThroughRate;

    /* The estimated number of clicks, in floating point representation. */
    private java.lang.Float clicksPerDay;

    /* The estimated number of impressions, in floating point representation. */
    private java.lang.Float impressionsPerDay;

    /* The estimated total cost. */
    private com.google.api.ads.adwords.axis.v201802.cm.Money totalCost;

    public StatsEstimate() {
    }

    public StatsEstimate(
           com.google.api.ads.adwords.axis.v201802.cm.Money averageCpc,
           java.lang.Double averagePosition,
           java.lang.Double clickThroughRate,
           java.lang.Float clicksPerDay,
           java.lang.Float impressionsPerDay,
           com.google.api.ads.adwords.axis.v201802.cm.Money totalCost) {
           this.averageCpc = averageCpc;
           this.averagePosition = averagePosition;
           this.clickThroughRate = clickThroughRate;
           this.clicksPerDay = clicksPerDay;
           this.impressionsPerDay = impressionsPerDay;
           this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("averageCpc", getAverageCpc())
            .add("averagePosition", getAveragePosition())
            .add("clickThroughRate", getClickThroughRate())
            .add("clicksPerDay", getClicksPerDay())
            .add("impressionsPerDay", getImpressionsPerDay())
            .add("totalCost", getTotalCost())
            .toString();
    }

    /**
     * Gets the averageCpc value for this StatsEstimate.
     * 
     * @return averageCpc   * The estimated average CPC.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getAverageCpc() {
        return averageCpc;
    }


    /**
     * Sets the averageCpc value for this StatsEstimate.
     * 
     * @param averageCpc   * The estimated average CPC.
     */
    public void setAverageCpc(com.google.api.ads.adwords.axis.v201802.cm.Money averageCpc) {
        this.averageCpc = averageCpc;
    }


    /**
     * Gets the averagePosition value for this StatsEstimate.
     * 
     * @return averagePosition   * The estimated average position.
     */
    public java.lang.Double getAveragePosition() {
        return averagePosition;
    }


    /**
     * Sets the averagePosition value for this StatsEstimate.
     * 
     * @param averagePosition   * The estimated average position.
     */
    public void setAveragePosition(java.lang.Double averagePosition) {
        this.averagePosition = averagePosition;
    }


    /**
     * Gets the clickThroughRate value for this StatsEstimate.
     * 
     * @return clickThroughRate   * The estimated click through rate.
     */
    public java.lang.Double getClickThroughRate() {
        return clickThroughRate;
    }


    /**
     * Sets the clickThroughRate value for this StatsEstimate.
     * 
     * @param clickThroughRate   * The estimated click through rate.
     */
    public void setClickThroughRate(java.lang.Double clickThroughRate) {
        this.clickThroughRate = clickThroughRate;
    }


    /**
     * Gets the clicksPerDay value for this StatsEstimate.
     * 
     * @return clicksPerDay   * The estimated number of clicks, in floating point representation.
     */
    public java.lang.Float getClicksPerDay() {
        return clicksPerDay;
    }


    /**
     * Sets the clicksPerDay value for this StatsEstimate.
     * 
     * @param clicksPerDay   * The estimated number of clicks, in floating point representation.
     */
    public void setClicksPerDay(java.lang.Float clicksPerDay) {
        this.clicksPerDay = clicksPerDay;
    }


    /**
     * Gets the impressionsPerDay value for this StatsEstimate.
     * 
     * @return impressionsPerDay   * The estimated number of impressions, in floating point representation.
     */
    public java.lang.Float getImpressionsPerDay() {
        return impressionsPerDay;
    }


    /**
     * Sets the impressionsPerDay value for this StatsEstimate.
     * 
     * @param impressionsPerDay   * The estimated number of impressions, in floating point representation.
     */
    public void setImpressionsPerDay(java.lang.Float impressionsPerDay) {
        this.impressionsPerDay = impressionsPerDay;
    }


    /**
     * Gets the totalCost value for this StatsEstimate.
     * 
     * @return totalCost   * The estimated total cost.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getTotalCost() {
        return totalCost;
    }


    /**
     * Sets the totalCost value for this StatsEstimate.
     * 
     * @param totalCost   * The estimated total cost.
     */
    public void setTotalCost(com.google.api.ads.adwords.axis.v201802.cm.Money totalCost) {
        this.totalCost = totalCost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatsEstimate)) return false;
        StatsEstimate other = (StatsEstimate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.averageCpc==null && other.getAverageCpc()==null) || 
             (this.averageCpc!=null &&
              this.averageCpc.equals(other.getAverageCpc()))) &&
            ((this.averagePosition==null && other.getAveragePosition()==null) || 
             (this.averagePosition!=null &&
              this.averagePosition.equals(other.getAveragePosition()))) &&
            ((this.clickThroughRate==null && other.getClickThroughRate()==null) || 
             (this.clickThroughRate!=null &&
              this.clickThroughRate.equals(other.getClickThroughRate()))) &&
            ((this.clicksPerDay==null && other.getClicksPerDay()==null) || 
             (this.clicksPerDay!=null &&
              this.clicksPerDay.equals(other.getClicksPerDay()))) &&
            ((this.impressionsPerDay==null && other.getImpressionsPerDay()==null) || 
             (this.impressionsPerDay!=null &&
              this.impressionsPerDay.equals(other.getImpressionsPerDay()))) &&
            ((this.totalCost==null && other.getTotalCost()==null) || 
             (this.totalCost!=null &&
              this.totalCost.equals(other.getTotalCost())));
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
        if (getAverageCpc() != null) {
            _hashCode += getAverageCpc().hashCode();
        }
        if (getAveragePosition() != null) {
            _hashCode += getAveragePosition().hashCode();
        }
        if (getClickThroughRate() != null) {
            _hashCode += getClickThroughRate().hashCode();
        }
        if (getClicksPerDay() != null) {
            _hashCode += getClicksPerDay().hashCode();
        }
        if (getImpressionsPerDay() != null) {
            _hashCode += getImpressionsPerDay().hashCode();
        }
        if (getTotalCost() != null) {
            _hashCode += getTotalCost().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatsEstimate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "StatsEstimate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCpc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "averageCpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averagePosition");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "averagePosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickThroughRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "clickThroughRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clicksPerDay");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "clicksPerDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressionsPerDay");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "impressionsPerDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCost");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "totalCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
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
