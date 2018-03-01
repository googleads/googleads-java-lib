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
 * AdCallMetricsConversion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * A ConversionTracker for phone calls from conversion-tracked call
 * extensions and
 *             call-only ads.
 *             
 *             <p>A call made from the call extension is reported as
 * a conversion if it lasts longer
 *             than N seconds. This duration is 60 seconds by default.
 * Each call extension can
 *             specify the desired conversion configuration.</p>
 */
public class AdCallMetricsConversion  extends com.google.api.ads.adwords.axis.v201802.cm.ConversionTracker  implements java.io.Serializable {
    /* The phone-call duration (in seconds) after which a conversion
     * should be reported for this
     *                     AdCallMetricsConversion.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "PhoneCallDuration".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint InRange">This field must
     * be between 0 and 10000, inclusive.</span> */
    private java.lang.Long phoneCallDuration;

    public AdCallMetricsConversion() {
    }

    public AdCallMetricsConversion(
           java.lang.Long id,
           java.lang.Long originalConversionTypeId,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerStatus status,
           com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerCategory category,
           java.lang.String googleEventSnippet,
           java.lang.String googleGlobalSiteTag,
           com.google.api.ads.adwords.axis.v201802.cm.DataDrivenModelStatus dataDrivenModelStatus,
           java.lang.Long conversionTypeOwnerCustomerId,
           java.lang.Integer viewthroughLookbackWindow,
           java.lang.Integer ctcLookbackWindow,
           com.google.api.ads.adwords.axis.v201802.cm.ConversionDeduplicationMode countingType,
           java.lang.Double defaultRevenueValue,
           java.lang.String defaultRevenueCurrencyCode,
           java.lang.Boolean alwaysUseDefaultRevenueValue,
           java.lang.Boolean excludeFromBidding,
           com.google.api.ads.adwords.axis.v201802.cm.AttributionModelType attributionModelType,
           java.lang.String mostRecentConversionDate,
           java.lang.String lastReceivedRequestTime,
           java.lang.String conversionTrackerType,
           java.lang.Long phoneCallDuration) {
        super(
            id,
            originalConversionTypeId,
            name,
            status,
            category,
            googleEventSnippet,
            googleGlobalSiteTag,
            dataDrivenModelStatus,
            conversionTypeOwnerCustomerId,
            viewthroughLookbackWindow,
            ctcLookbackWindow,
            countingType,
            defaultRevenueValue,
            defaultRevenueCurrencyCode,
            alwaysUseDefaultRevenueValue,
            excludeFromBidding,
            attributionModelType,
            mostRecentConversionDate,
            lastReceivedRequestTime,
            conversionTrackerType);
        this.phoneCallDuration = phoneCallDuration;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("alwaysUseDefaultRevenueValue", getAlwaysUseDefaultRevenueValue())
            .add("attributionModelType", getAttributionModelType())
            .add("category", getCategory())
            .add("conversionTrackerType", getConversionTrackerType())
            .add("conversionTypeOwnerCustomerId", getConversionTypeOwnerCustomerId())
            .add("countingType", getCountingType())
            .add("ctcLookbackWindow", getCtcLookbackWindow())
            .add("dataDrivenModelStatus", getDataDrivenModelStatus())
            .add("defaultRevenueCurrencyCode", getDefaultRevenueCurrencyCode())
            .add("defaultRevenueValue", getDefaultRevenueValue())
            .add("excludeFromBidding", getExcludeFromBidding())
            .add("googleEventSnippet", getGoogleEventSnippet())
            .add("googleGlobalSiteTag", getGoogleGlobalSiteTag())
            .add("id", getId())
            .add("lastReceivedRequestTime", getLastReceivedRequestTime())
            .add("mostRecentConversionDate", getMostRecentConversionDate())
            .add("name", getName())
            .add("originalConversionTypeId", getOriginalConversionTypeId())
            .add("phoneCallDuration", getPhoneCallDuration())
            .add("status", getStatus())
            .add("viewthroughLookbackWindow", getViewthroughLookbackWindow())
            .toString();
    }

    /**
     * Gets the phoneCallDuration value for this AdCallMetricsConversion.
     * 
     * @return phoneCallDuration   * The phone-call duration (in seconds) after which a conversion
     * should be reported for this
     *                     AdCallMetricsConversion.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "PhoneCallDuration".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint InRange">This field must
     * be between 0 and 10000, inclusive.</span>
     */
    public java.lang.Long getPhoneCallDuration() {
        return phoneCallDuration;
    }


    /**
     * Sets the phoneCallDuration value for this AdCallMetricsConversion.
     * 
     * @param phoneCallDuration   * The phone-call duration (in seconds) after which a conversion
     * should be reported for this
     *                     AdCallMetricsConversion.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "PhoneCallDuration".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint InRange">This field must
     * be between 0 and 10000, inclusive.</span>
     */
    public void setPhoneCallDuration(java.lang.Long phoneCallDuration) {
        this.phoneCallDuration = phoneCallDuration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdCallMetricsConversion)) return false;
        AdCallMetricsConversion other = (AdCallMetricsConversion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.phoneCallDuration==null && other.getPhoneCallDuration()==null) || 
             (this.phoneCallDuration!=null &&
              this.phoneCallDuration.equals(other.getPhoneCallDuration())));
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
        if (getPhoneCallDuration() != null) {
            _hashCode += getPhoneCallDuration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdCallMetricsConversion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdCallMetricsConversion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneCallDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "phoneCallDuration"));
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
