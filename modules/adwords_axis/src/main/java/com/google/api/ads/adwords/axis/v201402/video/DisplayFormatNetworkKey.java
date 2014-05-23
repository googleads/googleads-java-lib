/**
 * DisplayFormatNetworkKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * A SegmentKey for segmenting by {@link VideoAdDisplayFormat.Type}.
 */
public class DisplayFormatNetworkKey  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201402.video.VideoAdDisplayFormat format;

    private com.google.api.ads.adwords.axis.v201402.video.VideoAdNetwork network;

    public DisplayFormatNetworkKey() {
    }

    public DisplayFormatNetworkKey(
           com.google.api.ads.adwords.axis.v201402.video.VideoAdDisplayFormat format,
           com.google.api.ads.adwords.axis.v201402.video.VideoAdNetwork network) {
           this.format = format;
           this.network = network;
    }


    /**
     * Gets the format value for this DisplayFormatNetworkKey.
     * 
     * @return format
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoAdDisplayFormat getFormat() {
        return format;
    }


    /**
     * Sets the format value for this DisplayFormatNetworkKey.
     * 
     * @param format
     */
    public void setFormat(com.google.api.ads.adwords.axis.v201402.video.VideoAdDisplayFormat format) {
        this.format = format;
    }


    /**
     * Gets the network value for this DisplayFormatNetworkKey.
     * 
     * @return network
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoAdNetwork getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this DisplayFormatNetworkKey.
     * 
     * @param network
     */
    public void setNetwork(com.google.api.ads.adwords.axis.v201402.video.VideoAdNetwork network) {
        this.network = network;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DisplayFormatNetworkKey)) return false;
        DisplayFormatNetworkKey other = (DisplayFormatNetworkKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork())));
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
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DisplayFormatNetworkKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "DisplayFormatNetworkKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoAdDisplayFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoAdNetwork"));
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
