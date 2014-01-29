/**
 * WidgetNetworkConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class WidgetNetworkConfig  implements java.io.Serializable {
    private boolean active;

    private double imageSize;

    private java.lang.String imageUrl;

    private java.lang.String staticDataURL;

    public WidgetNetworkConfig() {
    }

    public WidgetNetworkConfig(
           boolean active,
           double imageSize,
           java.lang.String imageUrl,
           java.lang.String staticDataURL) {
           this.active = active;
           this.imageSize = imageSize;
           this.imageUrl = imageUrl;
           this.staticDataURL = staticDataURL;
    }


    /**
     * Gets the active value for this WidgetNetworkConfig.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this WidgetNetworkConfig.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the imageSize value for this WidgetNetworkConfig.
     * 
     * @return imageSize
     */
    public double getImageSize() {
        return imageSize;
    }


    /**
     * Sets the imageSize value for this WidgetNetworkConfig.
     * 
     * @param imageSize
     */
    public void setImageSize(double imageSize) {
        this.imageSize = imageSize;
    }


    /**
     * Gets the imageUrl value for this WidgetNetworkConfig.
     * 
     * @return imageUrl
     */
    public java.lang.String getImageUrl() {
        return imageUrl;
    }


    /**
     * Sets the imageUrl value for this WidgetNetworkConfig.
     * 
     * @param imageUrl
     */
    public void setImageUrl(java.lang.String imageUrl) {
        this.imageUrl = imageUrl;
    }


    /**
     * Gets the staticDataURL value for this WidgetNetworkConfig.
     * 
     * @return staticDataURL
     */
    public java.lang.String getStaticDataURL() {
        return staticDataURL;
    }


    /**
     * Sets the staticDataURL value for this WidgetNetworkConfig.
     * 
     * @param staticDataURL
     */
    public void setStaticDataURL(java.lang.String staticDataURL) {
        this.staticDataURL = staticDataURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WidgetNetworkConfig)) return false;
        WidgetNetworkConfig other = (WidgetNetworkConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.active == other.isActive() &&
            this.imageSize == other.getImageSize() &&
            ((this.imageUrl==null && other.getImageUrl()==null) || 
             (this.imageUrl!=null &&
              this.imageUrl.equals(other.getImageUrl()))) &&
            ((this.staticDataURL==null && other.getStaticDataURL()==null) || 
             (this.staticDataURL!=null &&
              this.staticDataURL.equals(other.getStaticDataURL())));
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getImageSize()).hashCode();
        if (getImageUrl() != null) {
            _hashCode += getImageUrl().hashCode();
        }
        if (getStaticDataURL() != null) {
            _hashCode += getStaticDataURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WidgetNetworkConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "WidgetNetworkConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staticDataURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staticDataURL"));
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
