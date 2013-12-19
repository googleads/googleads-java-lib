/**
 * MobileDisplayCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class MobileDisplayCreative  extends com.google.api.ads.dfa.axis.v1_19.HTMLCreativeBase  implements java.io.Serializable {
    private java.lang.String thirdPartyClickTrackingUrl;

    private java.lang.String thirdPartyImpressionTrackingUrl;

    public MobileDisplayCreative() {
    }

    public MobileDisplayCreative(
           long id,
           java.lang.String name,
           boolean active,
           long advertiserId,
           boolean archived,
           com.google.api.ads.dfa.axis.v1_19.CreativeFieldAssignment[] creativeFieldAssignments,
           long sizeId,
           long typeId,
           int version,
           java.lang.String HTMLCode,
           com.google.api.ads.dfa.axis.v1_19.HTMLCreativeAsset[] creativeAssets,
           java.lang.String thirdPartyClickTrackingUrl,
           java.lang.String thirdPartyImpressionTrackingUrl) {
        super(
            id,
            name,
            active,
            advertiserId,
            archived,
            creativeFieldAssignments,
            sizeId,
            typeId,
            version,
            HTMLCode,
            creativeAssets);
        this.thirdPartyClickTrackingUrl = thirdPartyClickTrackingUrl;
        this.thirdPartyImpressionTrackingUrl = thirdPartyImpressionTrackingUrl;
    }


    /**
     * Gets the thirdPartyClickTrackingUrl value for this MobileDisplayCreative.
     * 
     * @return thirdPartyClickTrackingUrl
     */
    public java.lang.String getThirdPartyClickTrackingUrl() {
        return thirdPartyClickTrackingUrl;
    }


    /**
     * Sets the thirdPartyClickTrackingUrl value for this MobileDisplayCreative.
     * 
     * @param thirdPartyClickTrackingUrl
     */
    public void setThirdPartyClickTrackingUrl(java.lang.String thirdPartyClickTrackingUrl) {
        this.thirdPartyClickTrackingUrl = thirdPartyClickTrackingUrl;
    }


    /**
     * Gets the thirdPartyImpressionTrackingUrl value for this MobileDisplayCreative.
     * 
     * @return thirdPartyImpressionTrackingUrl
     */
    public java.lang.String getThirdPartyImpressionTrackingUrl() {
        return thirdPartyImpressionTrackingUrl;
    }


    /**
     * Sets the thirdPartyImpressionTrackingUrl value for this MobileDisplayCreative.
     * 
     * @param thirdPartyImpressionTrackingUrl
     */
    public void setThirdPartyImpressionTrackingUrl(java.lang.String thirdPartyImpressionTrackingUrl) {
        this.thirdPartyImpressionTrackingUrl = thirdPartyImpressionTrackingUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileDisplayCreative)) return false;
        MobileDisplayCreative other = (MobileDisplayCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.thirdPartyClickTrackingUrl==null && other.getThirdPartyClickTrackingUrl()==null) || 
             (this.thirdPartyClickTrackingUrl!=null &&
              this.thirdPartyClickTrackingUrl.equals(other.getThirdPartyClickTrackingUrl()))) &&
            ((this.thirdPartyImpressionTrackingUrl==null && other.getThirdPartyImpressionTrackingUrl()==null) || 
             (this.thirdPartyImpressionTrackingUrl!=null &&
              this.thirdPartyImpressionTrackingUrl.equals(other.getThirdPartyImpressionTrackingUrl())));
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
        if (getThirdPartyClickTrackingUrl() != null) {
            _hashCode += getThirdPartyClickTrackingUrl().hashCode();
        }
        if (getThirdPartyImpressionTrackingUrl() != null) {
            _hashCode += getThirdPartyImpressionTrackingUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileDisplayCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "MobileDisplayCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyClickTrackingUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thirdPartyClickTrackingUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyImpressionTrackingUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thirdPartyImpressionTrackingUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
