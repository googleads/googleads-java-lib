/**
 * PlatformVideoCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * Represents the platform criterion used for campaign scheduling.
 * This criterion is immutable
 */
public class PlatformVideoCriterion  extends com.google.api.ads.adwords.axis.v201406.video.BaseCriterion  implements java.io.Serializable {
    private java.lang.String platformName;

    public PlatformVideoCriterion() {
    }

    public PlatformVideoCriterion(
           java.lang.Long id,
           java.lang.String baseCriterionType,
           java.lang.String platformName) {
        super(
            id,
            baseCriterionType);
        this.platformName = platformName;
    }


    /**
     * Gets the platformName value for this PlatformVideoCriterion.
     * 
     * @return platformName
     */
    public java.lang.String getPlatformName() {
        return platformName;
    }


    /**
     * Sets the platformName value for this PlatformVideoCriterion.
     * 
     * @param platformName
     */
    public void setPlatformName(java.lang.String platformName) {
        this.platformName = platformName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlatformVideoCriterion)) return false;
        PlatformVideoCriterion other = (PlatformVideoCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.platformName==null && other.getPlatformName()==null) || 
             (this.platformName!=null &&
              this.platformName.equals(other.getPlatformName())));
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
        if (getPlatformName() != null) {
            _hashCode += getPlatformName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlatformVideoCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "PlatformVideoCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platformName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "platformName"));
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
