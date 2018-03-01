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
 * ConversionTrackingSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.mcm;


/**
 * A collection of customer-wide settings related to AdWords Conversion
 * Tracking. Settings
 *             that apply at the conversion type level can be accessed
 * and modified though
 *             {@code ConversionTrackerService}.
 */
public class ConversionTrackingSettings  implements java.io.Serializable {
    /* With Cross-Account Conversion Tracking, a manager can share
     * its conversion tracking ID among
     *                 the clients it manages. If a customer is using a manager's
     * conversion tracking ID we store
     *                 it as the customer's effective conversion tracking
     * ID.
     *                 
     *                 <p>This is the conversion tracking ID used for this
     * customer. If this is 0, the customer is
     *                 not using conversion tracking. If the customer is
     * using cross-account conversion tracking,
     *                 this conversion tracking ID has been shared from the
     * manager's account. Otherwise, for a
     *                 customer who is not using cross-account conversion
     * tracking, this is the customer's own
     *                 conversion tracking ID.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long effectiveConversionTrackingId;

    /* True if a customer is using cross-account conversion tracking.
     * False if the customer is not using conversion tracking, or if the
     * customer is using
     *                 his own conversion tracking ID.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Boolean usesCrossAccountConversionTracking;

    /* True if customer has selected to include cross-device conversions
     * in the "Conversions" column, which is used by any conversion-based
     * bid
     *                 strategies; false otherwise. */
    private java.lang.Boolean optimizeOnEstimatedConversions;

    public ConversionTrackingSettings() {
    }

    public ConversionTrackingSettings(
           java.lang.Long effectiveConversionTrackingId,
           java.lang.Boolean usesCrossAccountConversionTracking,
           java.lang.Boolean optimizeOnEstimatedConversions) {
           this.effectiveConversionTrackingId = effectiveConversionTrackingId;
           this.usesCrossAccountConversionTracking = usesCrossAccountConversionTracking;
           this.optimizeOnEstimatedConversions = optimizeOnEstimatedConversions;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("effectiveConversionTrackingId", getEffectiveConversionTrackingId())
            .add("optimizeOnEstimatedConversions", getOptimizeOnEstimatedConversions())
            .add("usesCrossAccountConversionTracking", getUsesCrossAccountConversionTracking())
            .toString();
    }

    /**
     * Gets the effectiveConversionTrackingId value for this ConversionTrackingSettings.
     * 
     * @return effectiveConversionTrackingId   * With Cross-Account Conversion Tracking, a manager can share
     * its conversion tracking ID among
     *                 the clients it manages. If a customer is using a manager's
     * conversion tracking ID we store
     *                 it as the customer's effective conversion tracking
     * ID.
     *                 
     *                 <p>This is the conversion tracking ID used for this
     * customer. If this is 0, the customer is
     *                 not using conversion tracking. If the customer is
     * using cross-account conversion tracking,
     *                 this conversion tracking ID has been shared from the
     * manager's account. Otherwise, for a
     *                 customer who is not using cross-account conversion
     * tracking, this is the customer's own
     *                 conversion tracking ID.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getEffectiveConversionTrackingId() {
        return effectiveConversionTrackingId;
    }


    /**
     * Sets the effectiveConversionTrackingId value for this ConversionTrackingSettings.
     * 
     * @param effectiveConversionTrackingId   * With Cross-Account Conversion Tracking, a manager can share
     * its conversion tracking ID among
     *                 the clients it manages. If a customer is using a manager's
     * conversion tracking ID we store
     *                 it as the customer's effective conversion tracking
     * ID.
     *                 
     *                 <p>This is the conversion tracking ID used for this
     * customer. If this is 0, the customer is
     *                 not using conversion tracking. If the customer is
     * using cross-account conversion tracking,
     *                 this conversion tracking ID has been shared from the
     * manager's account. Otherwise, for a
     *                 customer who is not using cross-account conversion
     * tracking, this is the customer's own
     *                 conversion tracking ID.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setEffectiveConversionTrackingId(java.lang.Long effectiveConversionTrackingId) {
        this.effectiveConversionTrackingId = effectiveConversionTrackingId;
    }


    /**
     * Gets the usesCrossAccountConversionTracking value for this ConversionTrackingSettings.
     * 
     * @return usesCrossAccountConversionTracking   * True if a customer is using cross-account conversion tracking.
     * False if the customer is not using conversion tracking, or if the
     * customer is using
     *                 his own conversion tracking ID.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getUsesCrossAccountConversionTracking() {
        return usesCrossAccountConversionTracking;
    }


    /**
     * Sets the usesCrossAccountConversionTracking value for this ConversionTrackingSettings.
     * 
     * @param usesCrossAccountConversionTracking   * True if a customer is using cross-account conversion tracking.
     * False if the customer is not using conversion tracking, or if the
     * customer is using
     *                 his own conversion tracking ID.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setUsesCrossAccountConversionTracking(java.lang.Boolean usesCrossAccountConversionTracking) {
        this.usesCrossAccountConversionTracking = usesCrossAccountConversionTracking;
    }


    /**
     * Gets the optimizeOnEstimatedConversions value for this ConversionTrackingSettings.
     * 
     * @return optimizeOnEstimatedConversions   * True if customer has selected to include cross-device conversions
     * in the "Conversions" column, which is used by any conversion-based
     * bid
     *                 strategies; false otherwise.
     */
    public java.lang.Boolean getOptimizeOnEstimatedConversions() {
        return optimizeOnEstimatedConversions;
    }


    /**
     * Sets the optimizeOnEstimatedConversions value for this ConversionTrackingSettings.
     * 
     * @param optimizeOnEstimatedConversions   * True if customer has selected to include cross-device conversions
     * in the "Conversions" column, which is used by any conversion-based
     * bid
     *                 strategies; false otherwise.
     */
    public void setOptimizeOnEstimatedConversions(java.lang.Boolean optimizeOnEstimatedConversions) {
        this.optimizeOnEstimatedConversions = optimizeOnEstimatedConversions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConversionTrackingSettings)) return false;
        ConversionTrackingSettings other = (ConversionTrackingSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.effectiveConversionTrackingId==null && other.getEffectiveConversionTrackingId()==null) || 
             (this.effectiveConversionTrackingId!=null &&
              this.effectiveConversionTrackingId.equals(other.getEffectiveConversionTrackingId()))) &&
            ((this.usesCrossAccountConversionTracking==null && other.getUsesCrossAccountConversionTracking()==null) || 
             (this.usesCrossAccountConversionTracking!=null &&
              this.usesCrossAccountConversionTracking.equals(other.getUsesCrossAccountConversionTracking()))) &&
            ((this.optimizeOnEstimatedConversions==null && other.getOptimizeOnEstimatedConversions()==null) || 
             (this.optimizeOnEstimatedConversions!=null &&
              this.optimizeOnEstimatedConversions.equals(other.getOptimizeOnEstimatedConversions())));
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
        if (getEffectiveConversionTrackingId() != null) {
            _hashCode += getEffectiveConversionTrackingId().hashCode();
        }
        if (getUsesCrossAccountConversionTracking() != null) {
            _hashCode += getUsesCrossAccountConversionTracking().hashCode();
        }
        if (getOptimizeOnEstimatedConversions() != null) {
            _hashCode += getOptimizeOnEstimatedConversions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConversionTrackingSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "ConversionTrackingSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveConversionTrackingId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "effectiveConversionTrackingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usesCrossAccountConversionTracking");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "usesCrossAccountConversionTracking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optimizeOnEstimatedConversions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "optimizeOnEstimatedConversions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
