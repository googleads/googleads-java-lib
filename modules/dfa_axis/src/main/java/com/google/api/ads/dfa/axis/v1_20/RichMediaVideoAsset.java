/**
 * RichMediaVideoAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class RichMediaVideoAsset  extends com.google.api.ads.dfa.axis.v1_20.RichMediaAsset  implements java.io.Serializable {
    private java.lang.String progressiveUrl;

    private java.lang.String streamingUrl;

    public RichMediaVideoAsset() {
    }

    public RichMediaVideoAsset(
           java.lang.String fileName,
           int fileSize,
           long id,
           long parentAssetId,
           java.lang.String type,
           java.lang.String progressiveUrl,
           java.lang.String streamingUrl) {
        super(
            fileName,
            fileSize,
            id,
            parentAssetId,
            type);
        this.progressiveUrl = progressiveUrl;
        this.streamingUrl = streamingUrl;
    }


    /**
     * Gets the progressiveUrl value for this RichMediaVideoAsset.
     * 
     * @return progressiveUrl
     */
    public java.lang.String getProgressiveUrl() {
        return progressiveUrl;
    }


    /**
     * Sets the progressiveUrl value for this RichMediaVideoAsset.
     * 
     * @param progressiveUrl
     */
    public void setProgressiveUrl(java.lang.String progressiveUrl) {
        this.progressiveUrl = progressiveUrl;
    }


    /**
     * Gets the streamingUrl value for this RichMediaVideoAsset.
     * 
     * @return streamingUrl
     */
    public java.lang.String getStreamingUrl() {
        return streamingUrl;
    }


    /**
     * Sets the streamingUrl value for this RichMediaVideoAsset.
     * 
     * @param streamingUrl
     */
    public void setStreamingUrl(java.lang.String streamingUrl) {
        this.streamingUrl = streamingUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaVideoAsset)) return false;
        RichMediaVideoAsset other = (RichMediaVideoAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.progressiveUrl==null && other.getProgressiveUrl()==null) || 
             (this.progressiveUrl!=null &&
              this.progressiveUrl.equals(other.getProgressiveUrl()))) &&
            ((this.streamingUrl==null && other.getStreamingUrl()==null) || 
             (this.streamingUrl!=null &&
              this.streamingUrl.equals(other.getStreamingUrl())));
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
        if (getProgressiveUrl() != null) {
            _hashCode += getProgressiveUrl().hashCode();
        }
        if (getStreamingUrl() != null) {
            _hashCode += getStreamingUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaVideoAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaVideoAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressiveUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "progressiveUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streamingUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "streamingUrl"));
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
