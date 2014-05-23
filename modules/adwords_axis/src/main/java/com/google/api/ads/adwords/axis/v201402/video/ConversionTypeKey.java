/**
 * ConversionTypeKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Segment key for a conversion type.
 */
public class ConversionTypeKey  implements java.io.Serializable {
    private java.lang.Long conversionTypeId;

    private java.lang.String conversionTypeName;

    public ConversionTypeKey() {
    }

    public ConversionTypeKey(
           java.lang.Long conversionTypeId,
           java.lang.String conversionTypeName) {
           this.conversionTypeId = conversionTypeId;
           this.conversionTypeName = conversionTypeName;
    }


    /**
     * Gets the conversionTypeId value for this ConversionTypeKey.
     * 
     * @return conversionTypeId
     */
    public java.lang.Long getConversionTypeId() {
        return conversionTypeId;
    }


    /**
     * Sets the conversionTypeId value for this ConversionTypeKey.
     * 
     * @param conversionTypeId
     */
    public void setConversionTypeId(java.lang.Long conversionTypeId) {
        this.conversionTypeId = conversionTypeId;
    }


    /**
     * Gets the conversionTypeName value for this ConversionTypeKey.
     * 
     * @return conversionTypeName
     */
    public java.lang.String getConversionTypeName() {
        return conversionTypeName;
    }


    /**
     * Sets the conversionTypeName value for this ConversionTypeKey.
     * 
     * @param conversionTypeName
     */
    public void setConversionTypeName(java.lang.String conversionTypeName) {
        this.conversionTypeName = conversionTypeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConversionTypeKey)) return false;
        ConversionTypeKey other = (ConversionTypeKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conversionTypeId==null && other.getConversionTypeId()==null) || 
             (this.conversionTypeId!=null &&
              this.conversionTypeId.equals(other.getConversionTypeId()))) &&
            ((this.conversionTypeName==null && other.getConversionTypeName()==null) || 
             (this.conversionTypeName!=null &&
              this.conversionTypeName.equals(other.getConversionTypeName())));
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
        if (getConversionTypeId() != null) {
            _hashCode += getConversionTypeId().hashCode();
        }
        if (getConversionTypeName() != null) {
            _hashCode += getConversionTypeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConversionTypeKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "ConversionTypeKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "conversionTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "conversionTypeName"));
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
