/**
 * DisplayFormatKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * A SegmentKey for segmenting by {@link VideoAdDisplayFormat}.
 */
public class DisplayFormatKey  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201402.video.VideoAdDisplayFormat displayFormat;

    public DisplayFormatKey() {
    }

    public DisplayFormatKey(
           com.google.api.ads.adwords.axis.v201402.video.VideoAdDisplayFormat displayFormat) {
           this.displayFormat = displayFormat;
    }


    /**
     * Gets the displayFormat value for this DisplayFormatKey.
     * 
     * @return displayFormat
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoAdDisplayFormat getDisplayFormat() {
        return displayFormat;
    }


    /**
     * Sets the displayFormat value for this DisplayFormatKey.
     * 
     * @param displayFormat
     */
    public void setDisplayFormat(com.google.api.ads.adwords.axis.v201402.video.VideoAdDisplayFormat displayFormat) {
        this.displayFormat = displayFormat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DisplayFormatKey)) return false;
        DisplayFormatKey other = (DisplayFormatKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.displayFormat==null && other.getDisplayFormat()==null) || 
             (this.displayFormat!=null &&
              this.displayFormat.equals(other.getDisplayFormat())));
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
        if (getDisplayFormat() != null) {
            _hashCode += getDisplayFormat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DisplayFormatKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "DisplayFormatKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "displayFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoAdDisplayFormat"));
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
