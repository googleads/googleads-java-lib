// Copyright 2018 Google LLC
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
 * GclidOfflineConversionAdjustmentFeed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * A conversion adjustment record for conversions uploaded with
 *             gclid and conversion occurrence time.
 *             Inherits from abstract class OfflineConversionAdjustmentFeed.
 */
public class GclidOfflineConversionAdjustmentFeed  extends com.google.api.ads.adwords.axis.v201809.cm.OfflineConversionAdjustmentFeed  implements java.io.Serializable {
    /* The google click ID associated with the conversion for this
     * adjustment.
     *                     Has to be provided with conversion occurrence
     * time to identify conversion.
     *                     Provided through GclidOfflineConversionAdjustmentFeed.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 512, inclusive, (trimmed).</span> */
    private java.lang.String googleClickId;

    /* The instant that the conversion for this adjustment occurred.
     * Provided with gclid to identify the conversion.
     *                     Provided through GclidOfflineConversionAdjustmentFeed.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span> */
    private java.lang.String conversionTime;

    public GclidOfflineConversionAdjustmentFeed() {
    }

    public GclidOfflineConversionAdjustmentFeed(
           java.lang.String conversionName,
           java.lang.String adjustmentTime,
           com.google.api.ads.adwords.axis.v201809.cm.OfflineConversionAdjustmentType adjustmentType,
           java.lang.Double adjustedValue,
           java.lang.String adjustedValueCurrencyCode,
           java.lang.String offlineConversionAdjustmentFeedType,
           java.lang.String googleClickId,
           java.lang.String conversionTime) {
        super(
            conversionName,
            adjustmentTime,
            adjustmentType,
            adjustedValue,
            adjustedValueCurrencyCode,
            offlineConversionAdjustmentFeedType);
        this.googleClickId = googleClickId;
        this.conversionTime = conversionTime;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adjustedValue", getAdjustedValue())
            .add("adjustedValueCurrencyCode", getAdjustedValueCurrencyCode())
            .add("adjustmentTime", getAdjustmentTime())
            .add("adjustmentType", getAdjustmentType())
            .add("conversionName", getConversionName())
            .add("conversionTime", getConversionTime())
            .add("googleClickId", getGoogleClickId())
            .add("offlineConversionAdjustmentFeedType", getOfflineConversionAdjustmentFeedType())
            .toString();
    }

    /**
     * Gets the googleClickId value for this GclidOfflineConversionAdjustmentFeed.
     * 
     * @return googleClickId   * The google click ID associated with the conversion for this
     * adjustment.
     *                     Has to be provided with conversion occurrence
     * time to identify conversion.
     *                     Provided through GclidOfflineConversionAdjustmentFeed.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 512, inclusive, (trimmed).</span>
     */
    public java.lang.String getGoogleClickId() {
        return googleClickId;
    }


    /**
     * Sets the googleClickId value for this GclidOfflineConversionAdjustmentFeed.
     * 
     * @param googleClickId   * The google click ID associated with the conversion for this
     * adjustment.
     *                     Has to be provided with conversion occurrence
     * time to identify conversion.
     *                     Provided through GclidOfflineConversionAdjustmentFeed.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 512, inclusive, (trimmed).</span>
     */
    public void setGoogleClickId(java.lang.String googleClickId) {
        this.googleClickId = googleClickId;
    }


    /**
     * Gets the conversionTime value for this GclidOfflineConversionAdjustmentFeed.
     * 
     * @return conversionTime   * The instant that the conversion for this adjustment occurred.
     * Provided with gclid to identify the conversion.
     *                     Provided through GclidOfflineConversionAdjustmentFeed.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     */
    public java.lang.String getConversionTime() {
        return conversionTime;
    }


    /**
     * Sets the conversionTime value for this GclidOfflineConversionAdjustmentFeed.
     * 
     * @param conversionTime   * The instant that the conversion for this adjustment occurred.
     * Provided with gclid to identify the conversion.
     *                     Provided through GclidOfflineConversionAdjustmentFeed.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     */
    public void setConversionTime(java.lang.String conversionTime) {
        this.conversionTime = conversionTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GclidOfflineConversionAdjustmentFeed)) return false;
        GclidOfflineConversionAdjustmentFeed other = (GclidOfflineConversionAdjustmentFeed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.googleClickId==null && other.getGoogleClickId()==null) || 
             (this.googleClickId!=null &&
              this.googleClickId.equals(other.getGoogleClickId()))) &&
            ((this.conversionTime==null && other.getConversionTime()==null) || 
             (this.conversionTime!=null &&
              this.conversionTime.equals(other.getConversionTime())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getGoogleClickId() != null) {
            _hashCode += getGoogleClickId().hashCode();
        }
        if (getConversionTime() != null) {
            _hashCode += getConversionTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GclidOfflineConversionAdjustmentFeed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "GclidOfflineConversionAdjustmentFeed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("googleClickId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "googleClickId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "conversionTime"));
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
