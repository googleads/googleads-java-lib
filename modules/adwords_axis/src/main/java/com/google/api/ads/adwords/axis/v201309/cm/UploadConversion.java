/**
 * UploadConversion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * A conversion type that receives conversions by having them uploaded
 * through the OfflineConversionFeedService.
 *             
 *             After successfully creating a new UploadConversion, send
 * the name of this conversion type
 *             along with your conversion details to the OfflineConversionFeedService
 * to attribute those conversions to this conversion type.
 */
public class UploadConversion  extends com.google.api.ads.adwords.axis.v201309.cm.ConversionTracker  implements java.io.Serializable {
    /* The default value to be used when uploading offline conversions.
     * 
     *                     When uploading conversions, if there is no value
     * attached to the individual conversion, this
     *                     value will be used instead. If this value is not
     * set, "1" will be used as the conversion value.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UploadUserRevenueValue".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.String userRevenueValue;

    public UploadConversion() {
    }

    public UploadConversion(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201309.cm.ConversionTrackerStatus status,
           com.google.api.ads.adwords.axis.v201309.cm.ConversionTrackerCategory category,
           com.google.api.ads.adwords.axis.v201309.cm.ConversionTrackerStats stats,
           java.lang.Integer viewthroughLookbackWindow,
           java.lang.Boolean isProductAdsChargeable,
           java.lang.Integer productAdsChargeableConversionWindow,
           java.lang.Integer ctcLookbackWindow,
           java.lang.String conversionTrackerType,
           java.lang.String userRevenueValue) {
        super(
            id,
            name,
            status,
            category,
            stats,
            viewthroughLookbackWindow,
            isProductAdsChargeable,
            productAdsChargeableConversionWindow,
            ctcLookbackWindow,
            conversionTrackerType);
        this.userRevenueValue = userRevenueValue;
    }


    /**
     * Gets the userRevenueValue value for this UploadConversion.
     * 
     * @return userRevenueValue   * The default value to be used when uploading offline conversions.
     * 
     *                     When uploading conversions, if there is no value
     * attached to the individual conversion, this
     *                     value will be used instead. If this value is not
     * set, "1" will be used as the conversion value.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UploadUserRevenueValue".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getUserRevenueValue() {
        return userRevenueValue;
    }


    /**
     * Sets the userRevenueValue value for this UploadConversion.
     * 
     * @param userRevenueValue   * The default value to be used when uploading offline conversions.
     * 
     *                     When uploading conversions, if there is no value
     * attached to the individual conversion, this
     *                     value will be used instead. If this value is not
     * set, "1" will be used as the conversion value.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UploadUserRevenueValue".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setUserRevenueValue(java.lang.String userRevenueValue) {
        this.userRevenueValue = userRevenueValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadConversion)) return false;
        UploadConversion other = (UploadConversion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userRevenueValue==null && other.getUserRevenueValue()==null) || 
             (this.userRevenueValue!=null &&
              this.userRevenueValue.equals(other.getUserRevenueValue())));
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
        if (getUserRevenueValue() != null) {
            _hashCode += getUserRevenueValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadConversion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "UploadConversion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRevenueValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "userRevenueValue"));
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
