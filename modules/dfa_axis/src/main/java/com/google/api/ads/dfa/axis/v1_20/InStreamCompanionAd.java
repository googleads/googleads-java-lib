/**
 * InStreamCompanionAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class InStreamCompanionAd  implements java.io.Serializable {
    private java.lang.String adParameters;

    private java.lang.String altText;

    private java.lang.String clickThroughUrl;

    private int expandedHeight;

    private int expandedWidth;

    private java.lang.String fileName;

    private int height;

    private long id;

    private java.lang.String url;

    private int width;

    public InStreamCompanionAd() {
    }

    public InStreamCompanionAd(
           java.lang.String adParameters,
           java.lang.String altText,
           java.lang.String clickThroughUrl,
           int expandedHeight,
           int expandedWidth,
           java.lang.String fileName,
           int height,
           long id,
           java.lang.String url,
           int width) {
           this.adParameters = adParameters;
           this.altText = altText;
           this.clickThroughUrl = clickThroughUrl;
           this.expandedHeight = expandedHeight;
           this.expandedWidth = expandedWidth;
           this.fileName = fileName;
           this.height = height;
           this.id = id;
           this.url = url;
           this.width = width;
    }


    /**
     * Gets the adParameters value for this InStreamCompanionAd.
     * 
     * @return adParameters
     */
    public java.lang.String getAdParameters() {
        return adParameters;
    }


    /**
     * Sets the adParameters value for this InStreamCompanionAd.
     * 
     * @param adParameters
     */
    public void setAdParameters(java.lang.String adParameters) {
        this.adParameters = adParameters;
    }


    /**
     * Gets the altText value for this InStreamCompanionAd.
     * 
     * @return altText
     */
    public java.lang.String getAltText() {
        return altText;
    }


    /**
     * Sets the altText value for this InStreamCompanionAd.
     * 
     * @param altText
     */
    public void setAltText(java.lang.String altText) {
        this.altText = altText;
    }


    /**
     * Gets the clickThroughUrl value for this InStreamCompanionAd.
     * 
     * @return clickThroughUrl
     */
    public java.lang.String getClickThroughUrl() {
        return clickThroughUrl;
    }


    /**
     * Sets the clickThroughUrl value for this InStreamCompanionAd.
     * 
     * @param clickThroughUrl
     */
    public void setClickThroughUrl(java.lang.String clickThroughUrl) {
        this.clickThroughUrl = clickThroughUrl;
    }


    /**
     * Gets the expandedHeight value for this InStreamCompanionAd.
     * 
     * @return expandedHeight
     */
    public int getExpandedHeight() {
        return expandedHeight;
    }


    /**
     * Sets the expandedHeight value for this InStreamCompanionAd.
     * 
     * @param expandedHeight
     */
    public void setExpandedHeight(int expandedHeight) {
        this.expandedHeight = expandedHeight;
    }


    /**
     * Gets the expandedWidth value for this InStreamCompanionAd.
     * 
     * @return expandedWidth
     */
    public int getExpandedWidth() {
        return expandedWidth;
    }


    /**
     * Sets the expandedWidth value for this InStreamCompanionAd.
     * 
     * @param expandedWidth
     */
    public void setExpandedWidth(int expandedWidth) {
        this.expandedWidth = expandedWidth;
    }


    /**
     * Gets the fileName value for this InStreamCompanionAd.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this InStreamCompanionAd.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the height value for this InStreamCompanionAd.
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }


    /**
     * Sets the height value for this InStreamCompanionAd.
     * 
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * Gets the id value for this InStreamCompanionAd.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this InStreamCompanionAd.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the url value for this InStreamCompanionAd.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this InStreamCompanionAd.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the width value for this InStreamCompanionAd.
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }


    /**
     * Sets the width value for this InStreamCompanionAd.
     * 
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InStreamCompanionAd)) return false;
        InStreamCompanionAd other = (InStreamCompanionAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adParameters==null && other.getAdParameters()==null) || 
             (this.adParameters!=null &&
              this.adParameters.equals(other.getAdParameters()))) &&
            ((this.altText==null && other.getAltText()==null) || 
             (this.altText!=null &&
              this.altText.equals(other.getAltText()))) &&
            ((this.clickThroughUrl==null && other.getClickThroughUrl()==null) || 
             (this.clickThroughUrl!=null &&
              this.clickThroughUrl.equals(other.getClickThroughUrl()))) &&
            this.expandedHeight == other.getExpandedHeight() &&
            this.expandedWidth == other.getExpandedWidth() &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            this.height == other.getHeight() &&
            this.id == other.getId() &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            this.width == other.getWidth();
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
        if (getAdParameters() != null) {
            _hashCode += getAdParameters().hashCode();
        }
        if (getAltText() != null) {
            _hashCode += getAltText().hashCode();
        }
        if (getClickThroughUrl() != null) {
            _hashCode += getClickThroughUrl().hashCode();
        }
        _hashCode += getExpandedHeight();
        _hashCode += getExpandedWidth();
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        _hashCode += getHeight();
        _hashCode += new Long(getId()).hashCode();
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        _hashCode += getWidth();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InStreamCompanionAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InStreamCompanionAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "altText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickThroughUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clickThroughUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandedHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expandedHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandedWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expandedWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
