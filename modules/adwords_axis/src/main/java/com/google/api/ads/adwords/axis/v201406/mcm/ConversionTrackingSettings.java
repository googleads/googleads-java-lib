/**
 * ConversionTrackingSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.mcm;


/**
 * A collection of customer-wide settings related to AdWords Conversion
 * Tracking. Settings
 *             that apply a conversion type level can be accessed and
 * modified though
 *             {@code ConversionTrackerService}
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
    private com.google.api.ads.adwords.axis.v201406.cm.ConversionDeduplicationMode conversionOptimizerMode;

    public ConversionTrackingSettings() {
    }

    public ConversionTrackingSettings(
           com.google.api.ads.adwords.axis.v201406.cm.ConversionDeduplicationMode conversionOptimizerMode) {
           this.conversionOptimizerMode = conversionOptimizerMode;
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
    public com.google.api.ads.adwords.axis.v201406.cm.ConversionDeduplicationMode getConversionOptimizerMode() {
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
    public void setConversionOptimizerMode(com.google.api.ads.adwords.axis.v201406.cm.ConversionDeduplicationMode conversionOptimizerMode) {
        this.conversionOptimizerMode = conversionOptimizerMode;
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
              this.conversionOptimizerMode.equals(other.getConversionOptimizerMode())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConversionTrackingSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "ConversionTrackingSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionOptimizerMode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "conversionOptimizerMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "ConversionDeduplicationMode"));
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
