// Copyright 2025 Google LLC
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
 * HistoricalBasisVolumeSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202505;


/**
 * Settings to specify the volume of ad opportunities per day over
 * the {@link ForecastAdjustment}
 *             date range based on the traffic volume of a historical
 * reference period.
 *             
 *             <p>The daily historical traffic for the provided targeting
 * and date range is fetched, multiplied
 *             by the provided multiplier, and used as the daily expected
 * traffic for the adjustment.
 *             
 *             <p>The number of days included in the historical date
 * range does *not* need to be the same as the
 *             number of days included in the adjustment date range.
 */
public class HistoricalBasisVolumeSettings  implements java.io.Serializable {
    /* Whether the parent traffic forecast segment targeting's or
     * the {@code targeting}'s historical
     *                 volume data should be used.
     *                 <span class="constraint Required">This attribute is
     * required.</span> */
    private java.lang.Boolean useParentTrafficForecastSegmentTargeting;

    /* The targeting criteria to use as the source of the historical
     * volume data. This field is
     *                 required if {@code useParentTrafficForecastSegmentTargeting}
     * is false and ignored otherwise. */
    private com.google.api.ads.admanager.axis.v202505.Targeting targeting;

    /* The date range to use for the historical ad opportunity volume.
     * <span class="constraint Required">This attribute is required.</span> */
    private com.google.api.ads.admanager.axis.v202505.DateRange historicalDateRange;

    /* The multiplier to apply to the historical traffic volume, expressed
     * in thousandths of a
     *                 percent. For example, to set the forecasted traffic
     * as 130% of the historical traffic, this
     *                 value would be 130,000.
     *                 <span class="constraint Required">This attribute is
     * required.</span> */
    private java.lang.Long multiplierMilliPercent;

    public HistoricalBasisVolumeSettings() {
    }

    public HistoricalBasisVolumeSettings(
           java.lang.Boolean useParentTrafficForecastSegmentTargeting,
           com.google.api.ads.admanager.axis.v202505.Targeting targeting,
           com.google.api.ads.admanager.axis.v202505.DateRange historicalDateRange,
           java.lang.Long multiplierMilliPercent) {
           this.useParentTrafficForecastSegmentTargeting = useParentTrafficForecastSegmentTargeting;
           this.targeting = targeting;
           this.historicalDateRange = historicalDateRange;
           this.multiplierMilliPercent = multiplierMilliPercent;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("historicalDateRange", getHistoricalDateRange())
            .add("multiplierMilliPercent", getMultiplierMilliPercent())
            .add("targeting", getTargeting())
            .add("useParentTrafficForecastSegmentTargeting", getUseParentTrafficForecastSegmentTargeting())
            .toString();
    }

    /**
     * Gets the useParentTrafficForecastSegmentTargeting value for this HistoricalBasisVolumeSettings.
     * 
     * @return useParentTrafficForecastSegmentTargeting   * Whether the parent traffic forecast segment targeting's or
     * the {@code targeting}'s historical
     *                 volume data should be used.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public java.lang.Boolean getUseParentTrafficForecastSegmentTargeting() {
        return useParentTrafficForecastSegmentTargeting;
    }


    /**
     * Sets the useParentTrafficForecastSegmentTargeting value for this HistoricalBasisVolumeSettings.
     * 
     * @param useParentTrafficForecastSegmentTargeting   * Whether the parent traffic forecast segment targeting's or
     * the {@code targeting}'s historical
     *                 volume data should be used.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public void setUseParentTrafficForecastSegmentTargeting(java.lang.Boolean useParentTrafficForecastSegmentTargeting) {
        this.useParentTrafficForecastSegmentTargeting = useParentTrafficForecastSegmentTargeting;
    }


    /**
     * Gets the targeting value for this HistoricalBasisVolumeSettings.
     * 
     * @return targeting   * The targeting criteria to use as the source of the historical
     * volume data. This field is
     *                 required if {@code useParentTrafficForecastSegmentTargeting}
     * is false and ignored otherwise.
     */
    public com.google.api.ads.admanager.axis.v202505.Targeting getTargeting() {
        return targeting;
    }


    /**
     * Sets the targeting value for this HistoricalBasisVolumeSettings.
     * 
     * @param targeting   * The targeting criteria to use as the source of the historical
     * volume data. This field is
     *                 required if {@code useParentTrafficForecastSegmentTargeting}
     * is false and ignored otherwise.
     */
    public void setTargeting(com.google.api.ads.admanager.axis.v202505.Targeting targeting) {
        this.targeting = targeting;
    }


    /**
     * Gets the historicalDateRange value for this HistoricalBasisVolumeSettings.
     * 
     * @return historicalDateRange   * The date range to use for the historical ad opportunity volume.
     * <span class="constraint Required">This attribute is required.</span>
     */
    public com.google.api.ads.admanager.axis.v202505.DateRange getHistoricalDateRange() {
        return historicalDateRange;
    }


    /**
     * Sets the historicalDateRange value for this HistoricalBasisVolumeSettings.
     * 
     * @param historicalDateRange   * The date range to use for the historical ad opportunity volume.
     * <span class="constraint Required">This attribute is required.</span>
     */
    public void setHistoricalDateRange(com.google.api.ads.admanager.axis.v202505.DateRange historicalDateRange) {
        this.historicalDateRange = historicalDateRange;
    }


    /**
     * Gets the multiplierMilliPercent value for this HistoricalBasisVolumeSettings.
     * 
     * @return multiplierMilliPercent   * The multiplier to apply to the historical traffic volume, expressed
     * in thousandths of a
     *                 percent. For example, to set the forecasted traffic
     * as 130% of the historical traffic, this
     *                 value would be 130,000.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public java.lang.Long getMultiplierMilliPercent() {
        return multiplierMilliPercent;
    }


    /**
     * Sets the multiplierMilliPercent value for this HistoricalBasisVolumeSettings.
     * 
     * @param multiplierMilliPercent   * The multiplier to apply to the historical traffic volume, expressed
     * in thousandths of a
     *                 percent. For example, to set the forecasted traffic
     * as 130% of the historical traffic, this
     *                 value would be 130,000.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public void setMultiplierMilliPercent(java.lang.Long multiplierMilliPercent) {
        this.multiplierMilliPercent = multiplierMilliPercent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HistoricalBasisVolumeSettings)) return false;
        HistoricalBasisVolumeSettings other = (HistoricalBasisVolumeSettings) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.useParentTrafficForecastSegmentTargeting==null && other.getUseParentTrafficForecastSegmentTargeting()==null) || 
             (this.useParentTrafficForecastSegmentTargeting!=null &&
              this.useParentTrafficForecastSegmentTargeting.equals(other.getUseParentTrafficForecastSegmentTargeting()))) &&
            ((this.targeting==null && other.getTargeting()==null) || 
             (this.targeting!=null &&
              this.targeting.equals(other.getTargeting()))) &&
            ((this.historicalDateRange==null && other.getHistoricalDateRange()==null) || 
             (this.historicalDateRange!=null &&
              this.historicalDateRange.equals(other.getHistoricalDateRange()))) &&
            ((this.multiplierMilliPercent==null && other.getMultiplierMilliPercent()==null) || 
             (this.multiplierMilliPercent!=null &&
              this.multiplierMilliPercent.equals(other.getMultiplierMilliPercent())));
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
        if (getUseParentTrafficForecastSegmentTargeting() != null) {
            _hashCode += getUseParentTrafficForecastSegmentTargeting().hashCode();
        }
        if (getTargeting() != null) {
            _hashCode += getTargeting().hashCode();
        }
        if (getHistoricalDateRange() != null) {
            _hashCode += getHistoricalDateRange().hashCode();
        }
        if (getMultiplierMilliPercent() != null) {
            _hashCode += getMultiplierMilliPercent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HistoricalBasisVolumeSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "HistoricalBasisVolumeSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useParentTrafficForecastSegmentTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "useParentTrafficForecastSegmentTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historicalDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "historicalDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "DateRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiplierMilliPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "multiplierMilliPercent"));
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
