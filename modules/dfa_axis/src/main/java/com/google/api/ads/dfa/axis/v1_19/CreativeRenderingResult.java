/**
 * CreativeRenderingResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class CreativeRenderingResult  implements java.io.Serializable {
    private long creativeId;

    private long renderingId;

    private long renderingVersion;

    public CreativeRenderingResult() {
    }

    public CreativeRenderingResult(
           long creativeId,
           long renderingId,
           long renderingVersion) {
           this.creativeId = creativeId;
           this.renderingId = renderingId;
           this.renderingVersion = renderingVersion;
    }


    /**
     * Gets the creativeId value for this CreativeRenderingResult.
     * 
     * @return creativeId
     */
    public long getCreativeId() {
        return creativeId;
    }


    /**
     * Sets the creativeId value for this CreativeRenderingResult.
     * 
     * @param creativeId
     */
    public void setCreativeId(long creativeId) {
        this.creativeId = creativeId;
    }


    /**
     * Gets the renderingId value for this CreativeRenderingResult.
     * 
     * @return renderingId
     */
    public long getRenderingId() {
        return renderingId;
    }


    /**
     * Sets the renderingId value for this CreativeRenderingResult.
     * 
     * @param renderingId
     */
    public void setRenderingId(long renderingId) {
        this.renderingId = renderingId;
    }


    /**
     * Gets the renderingVersion value for this CreativeRenderingResult.
     * 
     * @return renderingVersion
     */
    public long getRenderingVersion() {
        return renderingVersion;
    }


    /**
     * Sets the renderingVersion value for this CreativeRenderingResult.
     * 
     * @param renderingVersion
     */
    public void setRenderingVersion(long renderingVersion) {
        this.renderingVersion = renderingVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeRenderingResult)) return false;
        CreativeRenderingResult other = (CreativeRenderingResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.creativeId == other.getCreativeId() &&
            this.renderingId == other.getRenderingId() &&
            this.renderingVersion == other.getRenderingVersion();
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
        _hashCode += new Long(getCreativeId()).hashCode();
        _hashCode += new Long(getRenderingId()).hashCode();
        _hashCode += new Long(getRenderingVersion()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeRenderingResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeRenderingResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renderingId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "renderingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renderingVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "renderingVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
