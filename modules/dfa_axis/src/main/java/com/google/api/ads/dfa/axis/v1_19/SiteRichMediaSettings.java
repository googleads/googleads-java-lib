/**
 * SiteRichMediaSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class SiteRichMediaSettings  implements java.io.Serializable {
    private java.lang.String alternateText;

    private java.lang.String frameAndLayerFooter;

    private java.lang.String frameAndLayerHeader;

    private java.lang.String iframeFooter;

    private java.lang.String iframeHeader;

    private java.lang.String targetWindow;

    public SiteRichMediaSettings() {
    }

    public SiteRichMediaSettings(
           java.lang.String alternateText,
           java.lang.String frameAndLayerFooter,
           java.lang.String frameAndLayerHeader,
           java.lang.String iframeFooter,
           java.lang.String iframeHeader,
           java.lang.String targetWindow) {
           this.alternateText = alternateText;
           this.frameAndLayerFooter = frameAndLayerFooter;
           this.frameAndLayerHeader = frameAndLayerHeader;
           this.iframeFooter = iframeFooter;
           this.iframeHeader = iframeHeader;
           this.targetWindow = targetWindow;
    }


    /**
     * Gets the alternateText value for this SiteRichMediaSettings.
     * 
     * @return alternateText
     */
    public java.lang.String getAlternateText() {
        return alternateText;
    }


    /**
     * Sets the alternateText value for this SiteRichMediaSettings.
     * 
     * @param alternateText
     */
    public void setAlternateText(java.lang.String alternateText) {
        this.alternateText = alternateText;
    }


    /**
     * Gets the frameAndLayerFooter value for this SiteRichMediaSettings.
     * 
     * @return frameAndLayerFooter
     */
    public java.lang.String getFrameAndLayerFooter() {
        return frameAndLayerFooter;
    }


    /**
     * Sets the frameAndLayerFooter value for this SiteRichMediaSettings.
     * 
     * @param frameAndLayerFooter
     */
    public void setFrameAndLayerFooter(java.lang.String frameAndLayerFooter) {
        this.frameAndLayerFooter = frameAndLayerFooter;
    }


    /**
     * Gets the frameAndLayerHeader value for this SiteRichMediaSettings.
     * 
     * @return frameAndLayerHeader
     */
    public java.lang.String getFrameAndLayerHeader() {
        return frameAndLayerHeader;
    }


    /**
     * Sets the frameAndLayerHeader value for this SiteRichMediaSettings.
     * 
     * @param frameAndLayerHeader
     */
    public void setFrameAndLayerHeader(java.lang.String frameAndLayerHeader) {
        this.frameAndLayerHeader = frameAndLayerHeader;
    }


    /**
     * Gets the iframeFooter value for this SiteRichMediaSettings.
     * 
     * @return iframeFooter
     */
    public java.lang.String getIframeFooter() {
        return iframeFooter;
    }


    /**
     * Sets the iframeFooter value for this SiteRichMediaSettings.
     * 
     * @param iframeFooter
     */
    public void setIframeFooter(java.lang.String iframeFooter) {
        this.iframeFooter = iframeFooter;
    }


    /**
     * Gets the iframeHeader value for this SiteRichMediaSettings.
     * 
     * @return iframeHeader
     */
    public java.lang.String getIframeHeader() {
        return iframeHeader;
    }


    /**
     * Sets the iframeHeader value for this SiteRichMediaSettings.
     * 
     * @param iframeHeader
     */
    public void setIframeHeader(java.lang.String iframeHeader) {
        this.iframeHeader = iframeHeader;
    }


    /**
     * Gets the targetWindow value for this SiteRichMediaSettings.
     * 
     * @return targetWindow
     */
    public java.lang.String getTargetWindow() {
        return targetWindow;
    }


    /**
     * Sets the targetWindow value for this SiteRichMediaSettings.
     * 
     * @param targetWindow
     */
    public void setTargetWindow(java.lang.String targetWindow) {
        this.targetWindow = targetWindow;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteRichMediaSettings)) return false;
        SiteRichMediaSettings other = (SiteRichMediaSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alternateText==null && other.getAlternateText()==null) || 
             (this.alternateText!=null &&
              this.alternateText.equals(other.getAlternateText()))) &&
            ((this.frameAndLayerFooter==null && other.getFrameAndLayerFooter()==null) || 
             (this.frameAndLayerFooter!=null &&
              this.frameAndLayerFooter.equals(other.getFrameAndLayerFooter()))) &&
            ((this.frameAndLayerHeader==null && other.getFrameAndLayerHeader()==null) || 
             (this.frameAndLayerHeader!=null &&
              this.frameAndLayerHeader.equals(other.getFrameAndLayerHeader()))) &&
            ((this.iframeFooter==null && other.getIframeFooter()==null) || 
             (this.iframeFooter!=null &&
              this.iframeFooter.equals(other.getIframeFooter()))) &&
            ((this.iframeHeader==null && other.getIframeHeader()==null) || 
             (this.iframeHeader!=null &&
              this.iframeHeader.equals(other.getIframeHeader()))) &&
            ((this.targetWindow==null && other.getTargetWindow()==null) || 
             (this.targetWindow!=null &&
              this.targetWindow.equals(other.getTargetWindow())));
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
        if (getAlternateText() != null) {
            _hashCode += getAlternateText().hashCode();
        }
        if (getFrameAndLayerFooter() != null) {
            _hashCode += getFrameAndLayerFooter().hashCode();
        }
        if (getFrameAndLayerHeader() != null) {
            _hashCode += getFrameAndLayerHeader().hashCode();
        }
        if (getIframeFooter() != null) {
            _hashCode += getIframeFooter().hashCode();
        }
        if (getIframeHeader() != null) {
            _hashCode += getIframeHeader().hashCode();
        }
        if (getTargetWindow() != null) {
            _hashCode += getTargetWindow().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SiteRichMediaSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "SiteRichMediaSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alternateText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frameAndLayerFooter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frameAndLayerFooter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frameAndLayerHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frameAndLayerHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iframeFooter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iframeFooter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iframeHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iframeHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetWindow"));
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
