/**
 * RichMediaExitOverride.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class RichMediaExitOverride  implements java.io.Serializable {
    private java.lang.String clickThroughUrl;

    private long exitId;

    public RichMediaExitOverride() {
    }

    public RichMediaExitOverride(
           java.lang.String clickThroughUrl,
           long exitId) {
           this.clickThroughUrl = clickThroughUrl;
           this.exitId = exitId;
    }


    /**
     * Gets the clickThroughUrl value for this RichMediaExitOverride.
     * 
     * @return clickThroughUrl
     */
    public java.lang.String getClickThroughUrl() {
        return clickThroughUrl;
    }


    /**
     * Sets the clickThroughUrl value for this RichMediaExitOverride.
     * 
     * @param clickThroughUrl
     */
    public void setClickThroughUrl(java.lang.String clickThroughUrl) {
        this.clickThroughUrl = clickThroughUrl;
    }


    /**
     * Gets the exitId value for this RichMediaExitOverride.
     * 
     * @return exitId
     */
    public long getExitId() {
        return exitId;
    }


    /**
     * Sets the exitId value for this RichMediaExitOverride.
     * 
     * @param exitId
     */
    public void setExitId(long exitId) {
        this.exitId = exitId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaExitOverride)) return false;
        RichMediaExitOverride other = (RichMediaExitOverride) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clickThroughUrl==null && other.getClickThroughUrl()==null) || 
             (this.clickThroughUrl!=null &&
              this.clickThroughUrl.equals(other.getClickThroughUrl()))) &&
            this.exitId == other.getExitId();
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
        if (getClickThroughUrl() != null) {
            _hashCode += getClickThroughUrl().hashCode();
        }
        _hashCode += new Long(getExitId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaExitOverride.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaExitOverride"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickThroughUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clickThroughUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exitId"));
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
