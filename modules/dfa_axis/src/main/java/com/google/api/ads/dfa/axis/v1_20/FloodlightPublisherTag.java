/**
 * FloodlightPublisherTag.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class FloodlightPublisherTag  extends com.google.api.ads.dfa.axis.v1_20.FloodlightTag  implements java.io.Serializable {
    private boolean clickThrough;

    private long siteId;

    private boolean viewThrough;

    public FloodlightPublisherTag() {
    }

    public FloodlightPublisherTag(
           long id,
           java.lang.String name,
           java.lang.String url,
           boolean clickThrough,
           long siteId,
           boolean viewThrough) {
        super(
            id,
            name,
            url);
        this.clickThrough = clickThrough;
        this.siteId = siteId;
        this.viewThrough = viewThrough;
    }


    /**
     * Gets the clickThrough value for this FloodlightPublisherTag.
     * 
     * @return clickThrough
     */
    public boolean isClickThrough() {
        return clickThrough;
    }


    /**
     * Sets the clickThrough value for this FloodlightPublisherTag.
     * 
     * @param clickThrough
     */
    public void setClickThrough(boolean clickThrough) {
        this.clickThrough = clickThrough;
    }


    /**
     * Gets the siteId value for this FloodlightPublisherTag.
     * 
     * @return siteId
     */
    public long getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this FloodlightPublisherTag.
     * 
     * @param siteId
     */
    public void setSiteId(long siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the viewThrough value for this FloodlightPublisherTag.
     * 
     * @return viewThrough
     */
    public boolean isViewThrough() {
        return viewThrough;
    }


    /**
     * Sets the viewThrough value for this FloodlightPublisherTag.
     * 
     * @param viewThrough
     */
    public void setViewThrough(boolean viewThrough) {
        this.viewThrough = viewThrough;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FloodlightPublisherTag)) return false;
        FloodlightPublisherTag other = (FloodlightPublisherTag) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.clickThrough == other.isClickThrough() &&
            this.siteId == other.getSiteId() &&
            this.viewThrough == other.isViewThrough();
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
        _hashCode += (isClickThrough() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getSiteId()).hashCode();
        _hashCode += (isViewThrough() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FloodlightPublisherTag.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "FloodlightPublisherTag"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickThrough");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clickThrough"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewThrough");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viewThrough"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
