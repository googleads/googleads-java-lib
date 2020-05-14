// Copyright 2020 Google LLC
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
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202005;


/**
 * Settings to specify historical volume data that will be used as
 * the expected future traffic
 *             volume for a {@link ForecastAdjustment}.
 *             
 *             <p>The historical daily ad opportunity volumes are fetched
 * for the requested historical targeting
 *             and range, multiplied by the multiplier, and then translated
 * into the date range of this
 *             adjustment. The duration of the historical date range
 * does *not* need to be the same as the
 *             duration of this adjustment's date range.
 */
public class HistoricalBasisVolumeSettings  implements java.io.Serializable {
    /* Whether the parent traffic forecast segment targeting's or
     * the {@code targeting}'s historical
     *                 volume data should be used. This field is required. */
    private java.lang.Boolean useParentTrafficForecastSegmentTargeting;

    /* The targeting criteria to use as the source of the historical
     * volume data. This field is
     *                 required if {@code useParentTrafficForecastSegmentTargeting}
     * is false and ignored otherwise. */
    private com.google.api.ads.admanager.axis.v202005.Targeting targeting;

    /* The date range to use for the historical ad opportunity volume.
     * 
     *                 <p>The start date of the historical date range must
     * be less than 12 months before the end date
     *                 of the adjustment date range. */
    private com.google.api.ads.admanager.axis.v202005.DateRange historicalDateRange;

    /* The milli-percent multiplier applied to the historical volume
     * data. */
    private java.lang.Long multiplierMilliPercent;

    public HistoricalBasisVolumeSettings() {
    }

    public HistoricalBasisVolumeSettings(
           java.lang.Boolean useParentTrafficForecastSegmentTargeting,
           com.google.api.ads.admanager.axis.v202005.Targeting targeting,
           com.google.api.ads.admanager.axis.v202005.DateRange historicalDateRange,
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
     *                 volume data should be used. This field is required.
     */
    public java.lang.Boolean getUseParentTrafficForecastSegmentTargeting() {
        return useParentTrafficForecastSegmentTargeting;
    }


    /**
     * Sets the useParentTrafficForecastSegmentTargeting value for this HistoricalBasisVolumeSettings.
     * 
     * @param useParentTrafficForecastSegmentTargeting   * Whether the parent traffic forecast segment targeting's or
     * the {@code targeting}'s historical
     *                 volume data should be used. This field is required.
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
    public com.google.api.ads.admanager.axis.v202005.Targeting getTargeting() {
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
    public void setTargeting(com.google.api.ads.admanager.axis.v202005.Targeting targeting) {
        this.targeting = targeting;
    }


    /**
     * Gets the historicalDateRange value for this HistoricalBasisVolumeSettings.
     * 
     * @return historicalDateRange   * The date range to use for the historical ad opportunity volume.
     * 
     *                 <p>The start date of the historical date range must
     * be less than 12 months before the end date
     *                 of the adjustment date range.
     */
    public com.google.api.ads.admanager.axis.v202005.DateRange getHistoricalDateRange() {
        return historicalDateRange;
    }


    /**
     * Sets the historicalDateRange value for this HistoricalBasisVolumeSettings.
     * 
     * @param historicalDateRange   * The date range to use for the historical ad opportunity volume.
     * 
     *                 <p>The start date of the historical date range must
     * be less than 12 months before the end date
     *                 of the adjustment date range.
     */
    public void setHistoricalDateRange(com.google.api.ads.admanager.axis.v202005.DateRange historicalDateRange) {
        this.historicalDateRange = historicalDateRange;
    }


    /**
     * Gets the multiplierMilliPercent value for this HistoricalBasisVolumeSettings.
     * 
     * @return multiplierMilliPercent   * The milli-percent multiplier applied to the historical volume
     * data.
     */
    public java.lang.Long getMultiplierMilliPercent() {
        return multiplierMilliPercent;
    }


    /**
     * Sets the multiplierMilliPercent value for this HistoricalBasisVolumeSettings.
     * 
     * @param multiplierMilliPercent   * The milli-percent multiplier applied to the historical volume
     * data.
     */
    public void setMultiplierMilliPercent(java.lang.Long multiplierMilliPercent) {
        this.multiplierMilliPercent = multiplierMilliPercent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HistoricalBasisVolumeSettings)) return false;
        HistoricalBasisVolumeSettings other = (HistoricalBasisVolumeSettings) obj;
        if (obj == null) return false;
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "HistoricalBasisVolumeSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useParentTrafficForecastSegmentTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "useParentTrafficForecastSegmentTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historicalDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "historicalDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "DateRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiplierMilliPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "multiplierMilliPercent"));
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
