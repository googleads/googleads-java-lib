/**
 * InStreamNonLinearAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class InStreamNonLinearAd  implements java.io.Serializable {
    private java.lang.String adParameters;

    private java.lang.String clickThroughUrl;

    private int expandedHeight;

    private int expandedWidth;

    private java.lang.String fileName;

    private int height;

    private long id;

    private boolean maintainAspectRatio;

    private boolean scalable;

    private java.lang.String url;

    private int width;

    public InStreamNonLinearAd() {
    }

    public InStreamNonLinearAd(
           java.lang.String adParameters,
           java.lang.String clickThroughUrl,
           int expandedHeight,
           int expandedWidth,
           java.lang.String fileName,
           int height,
           long id,
           boolean maintainAspectRatio,
           boolean scalable,
           java.lang.String url,
           int width) {
           this.adParameters = adParameters;
           this.clickThroughUrl = clickThroughUrl;
           this.expandedHeight = expandedHeight;
           this.expandedWidth = expandedWidth;
           this.fileName = fileName;
           this.height = height;
           this.id = id;
           this.maintainAspectRatio = maintainAspectRatio;
           this.scalable = scalable;
           this.url = url;
           this.width = width;
    }


    /**
     * Gets the adParameters value for this InStreamNonLinearAd.
     * 
     * @return adParameters
     */
    public java.lang.String getAdParameters() {
        return adParameters;
    }


    /**
     * Sets the adParameters value for this InStreamNonLinearAd.
     * 
     * @param adParameters
     */
    public void setAdParameters(java.lang.String adParameters) {
        this.adParameters = adParameters;
    }


    /**
     * Gets the clickThroughUrl value for this InStreamNonLinearAd.
     * 
     * @return clickThroughUrl
     */
    public java.lang.String getClickThroughUrl() {
        return clickThroughUrl;
    }


    /**
     * Sets the clickThroughUrl value for this InStreamNonLinearAd.
     * 
     * @param clickThroughUrl
     */
    public void setClickThroughUrl(java.lang.String clickThroughUrl) {
        this.clickThroughUrl = clickThroughUrl;
    }


    /**
     * Gets the expandedHeight value for this InStreamNonLinearAd.
     * 
     * @return expandedHeight
     */
    public int getExpandedHeight() {
        return expandedHeight;
    }


    /**
     * Sets the expandedHeight value for this InStreamNonLinearAd.
     * 
     * @param expandedHeight
     */
    public void setExpandedHeight(int expandedHeight) {
        this.expandedHeight = expandedHeight;
    }


    /**
     * Gets the expandedWidth value for this InStreamNonLinearAd.
     * 
     * @return expandedWidth
     */
    public int getExpandedWidth() {
        return expandedWidth;
    }


    /**
     * Sets the expandedWidth value for this InStreamNonLinearAd.
     * 
     * @param expandedWidth
     */
    public void setExpandedWidth(int expandedWidth) {
        this.expandedWidth = expandedWidth;
    }


    /**
     * Gets the fileName value for this InStreamNonLinearAd.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this InStreamNonLinearAd.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the height value for this InStreamNonLinearAd.
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }


    /**
     * Sets the height value for this InStreamNonLinearAd.
     * 
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * Gets the id value for this InStreamNonLinearAd.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this InStreamNonLinearAd.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the maintainAspectRatio value for this InStreamNonLinearAd.
     * 
     * @return maintainAspectRatio
     */
    public boolean isMaintainAspectRatio() {
        return maintainAspectRatio;
    }


    /**
     * Sets the maintainAspectRatio value for this InStreamNonLinearAd.
     * 
     * @param maintainAspectRatio
     */
    public void setMaintainAspectRatio(boolean maintainAspectRatio) {
        this.maintainAspectRatio = maintainAspectRatio;
    }


    /**
     * Gets the scalable value for this InStreamNonLinearAd.
     * 
     * @return scalable
     */
    public boolean isScalable() {
        return scalable;
    }


    /**
     * Sets the scalable value for this InStreamNonLinearAd.
     * 
     * @param scalable
     */
    public void setScalable(boolean scalable) {
        this.scalable = scalable;
    }


    /**
     * Gets the url value for this InStreamNonLinearAd.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this InStreamNonLinearAd.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the width value for this InStreamNonLinearAd.
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }


    /**
     * Sets the width value for this InStreamNonLinearAd.
     * 
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InStreamNonLinearAd)) return false;
        InStreamNonLinearAd other = (InStreamNonLinearAd) obj;
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
            this.maintainAspectRatio == other.isMaintainAspectRatio() &&
            this.scalable == other.isScalable() &&
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
        _hashCode += (isMaintainAspectRatio() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isScalable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        _hashCode += getWidth();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InStreamNonLinearAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "InStreamNonLinearAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adParameters"));
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
        elemField.setFieldName("maintainAspectRatio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maintainAspectRatio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scalable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scalable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
