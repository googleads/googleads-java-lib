/**
 * ConversionTrackingSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.mcm;


/**
 * A collection of customer-wide settings related to AdWords Conversion
 * Tracking. Settings
 *             that apply at the conversion type level can be accessed
 * and modified though
 *             {@code ConversionTrackerService}.
 */
public class ConversionTrackingSettings  implements java.io.Serializable {
    /* When set to {@link ConversionOptimizerDeduplicationMode#MANY_PER_CLICK},
     * Conversion
     *                 Optimizer will focus on increasing the number of conversions
     * (e.g.: If a click results in
     *                 15 conversions, it will be more heavily favored than
     * a click that results in only one
     *                 conversion)
     *                 
     *                 <p>When set to {@link ConversionOptimizerDeduplicationMode#ONE_PER_CLICK},
     * Conversion
     *                 Optimizer will focus on increasing the number of clicks
     * that convert
     *                 (e.g.: If a click results in 15 conversions, it will
     * be just as favored as a click that results
     *                 in only one conversion) */
    private com.google.api.ads.adwords.axis.v201601.cm.ConversionDeduplicationMode conversionOptimizerMode;

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

    /* True if customer has selected to include advanced conversions
     * (such as cross-device
     *                 conversions) in the "Conversions" column, which is
     * used by any conversion-based bid
     *                 strategies; false otherwise. */
    private java.lang.Boolean optimizeOnEstimatedConversions;

    public ConversionTrackingSettings() {
    }

    public ConversionTrackingSettings(
           com.google.api.ads.adwords.axis.v201601.cm.ConversionDeduplicationMode conversionOptimizerMode,
           java.lang.Long effectiveConversionTrackingId,
           java.lang.Boolean usesCrossAccountConversionTracking,
           java.lang.Boolean optimizeOnEstimatedConversions) {
           this.conversionOptimizerMode = conversionOptimizerMode;
           this.effectiveConversionTrackingId = effectiveConversionTrackingId;
           this.usesCrossAccountConversionTracking = usesCrossAccountConversionTracking;
           this.optimizeOnEstimatedConversions = optimizeOnEstimatedConversions;
    }


    /**
     * Gets the conversionOptimizerMode value for this ConversionTrackingSettings.
     * 
     * @return conversionOptimizerMode   * When set to {@link ConversionOptimizerDeduplicationMode#MANY_PER_CLICK},
     * Conversion
     *                 Optimizer will focus on increasing the number of conversions
     * (e.g.: If a click results in
     *                 15 conversions, it will be more heavily favored than
     * a click that results in only one
     *                 conversion)
     *                 
     *                 <p>When set to {@link ConversionOptimizerDeduplicationMode#ONE_PER_CLICK},
     * Conversion
     *                 Optimizer will focus on increasing the number of clicks
     * that convert
     *                 (e.g.: If a click results in 15 conversions, it will
     * be just as favored as a click that results
     *                 in only one conversion)
     */
    public com.google.api.ads.adwords.axis.v201601.cm.ConversionDeduplicationMode getConversionOptimizerMode() {
        return conversionOptimizerMode;
    }


    /**
     * Sets the conversionOptimizerMode value for this ConversionTrackingSettings.
     * 
     * @param conversionOptimizerMode   * When set to {@link ConversionOptimizerDeduplicationMode#MANY_PER_CLICK},
     * Conversion
     *                 Optimizer will focus on increasing the number of conversions
     * (e.g.: If a click results in
     *                 15 conversions, it will be more heavily favored than
     * a click that results in only one
     *                 conversion)
     *                 
     *                 <p>When set to {@link ConversionOptimizerDeduplicationMode#ONE_PER_CLICK},
     * Conversion
     *                 Optimizer will focus on increasing the number of clicks
     * that convert
     *                 (e.g.: If a click results in 15 conversions, it will
     * be just as favored as a click that results
     *                 in only one conversion)
     */
    public void setConversionOptimizerMode(com.google.api.ads.adwords.axis.v201601.cm.ConversionDeduplicationMode conversionOptimizerMode) {
        this.conversionOptimizerMode = conversionOptimizerMode;
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
     * @return optimizeOnEstimatedConversions   * True if customer has selected to include advanced conversions
     * (such as cross-device
     *                 conversions) in the "Conversions" column, which is
     * used by any conversion-based bid
     *                 strategies; false otherwise.
     */
    public java.lang.Boolean getOptimizeOnEstimatedConversions() {
        return optimizeOnEstimatedConversions;
    }


    /**
     * Sets the optimizeOnEstimatedConversions value for this ConversionTrackingSettings.
     * 
     * @param optimizeOnEstimatedConversions   * True if customer has selected to include advanced conversions
     * (such as cross-device
     *                 conversions) in the "Conversions" column, which is
     * used by any conversion-based bid
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
            ((this.conversionOptimizerMode==null && other.getConversionOptimizerMode()==null) || 
             (this.conversionOptimizerMode!=null &&
              this.conversionOptimizerMode.equals(other.getConversionOptimizerMode()))) &&
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
        if (getConversionOptimizerMode() != null) {
            _hashCode += getConversionOptimizerMode().hashCode();
        }
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201601", "ConversionTrackingSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionOptimizerMode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201601", "conversionOptimizerMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ConversionDeduplicationMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveConversionTrackingId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201601", "effectiveConversionTrackingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usesCrossAccountConversionTracking");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201601", "usesCrossAccountConversionTracking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optimizeOnEstimatedConversions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201601", "optimizeOnEstimatedConversions"));
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
