/**
 * TextAdCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201302;


/**
 * A simple plain text-based {@code Creative}. This creative is only
 * available to small business
 *             networks.
 *             
 *             Starting in version v201306 this will be returned as a
 * {@link TemplateCreative}
 *             identified with a {@link TemplateCreative#creativeTemplateId}
 * of {@code 10000440}.
 */
public class TextAdCreative  extends com.google.api.ads.dfp.axis.v201302.HasDestinationUrlCreative  implements java.io.Serializable {
    /* The hover text that appears over the {@link linkTitle}. This
     * attribute is optional and has a
     *                     maximum length of 255 characters. */
    private java.lang.String hoverText;

    /* The target window that the link takes you to. This attribute
     * is required. */
    private com.google.api.ads.dfp.axis.v201302.TargetWindow targetWindow;

    /* The color of the {@link linkTitle}, either as a hexadecimal
     * value or a standard color
     *                     name from HTML specifications (e.g. #FFFFFF or
     * white). This attribute is required. */
    private java.lang.String linkColor;

    /* The link title that the user would click to go to the {@link
     * destintationUrl}.
     *                     This attribute is required and has a maximum length
     * of 255 characters. */
    private java.lang.String linkTitle;

    /* The text that appears following the {@link linkTitle}. This
     * attribute is optional and has a
     *                     maximum length of 255 characters. */
    private java.lang.String text;

    /* The color of the text, either as a hexadecimal value or a standard
     * color
     *                     name from the HTML specifications (e.g. #FFFFFF
     * or white). This attribute is optional
     *                     and defaults to black. */
    private java.lang.String textColor;

    public TextAdCreative() {
    }

    public TextAdCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201302.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201302.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201302.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201302.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String destinationUrl,
           java.lang.String hoverText,
           com.google.api.ads.dfp.axis.v201302.TargetWindow targetWindow,
           java.lang.String linkColor,
           java.lang.String linkTitle,
           java.lang.String text,
           java.lang.String textColor) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            creativeType,
            destinationUrl);
        this.hoverText = hoverText;
        this.targetWindow = targetWindow;
        this.linkColor = linkColor;
        this.linkTitle = linkTitle;
        this.text = text;
        this.textColor = textColor;
    }


    /**
     * Gets the hoverText value for this TextAdCreative.
     * 
     * @return hoverText   * The hover text that appears over the {@link linkTitle}. This
     * attribute is optional and has a
     *                     maximum length of 255 characters.
     */
    public java.lang.String getHoverText() {
        return hoverText;
    }


    /**
     * Sets the hoverText value for this TextAdCreative.
     * 
     * @param hoverText   * The hover text that appears over the {@link linkTitle}. This
     * attribute is optional and has a
     *                     maximum length of 255 characters.
     */
    public void setHoverText(java.lang.String hoverText) {
        this.hoverText = hoverText;
    }


    /**
     * Gets the targetWindow value for this TextAdCreative.
     * 
     * @return targetWindow   * The target window that the link takes you to. This attribute
     * is required.
     */
    public com.google.api.ads.dfp.axis.v201302.TargetWindow getTargetWindow() {
        return targetWindow;
    }


    /**
     * Sets the targetWindow value for this TextAdCreative.
     * 
     * @param targetWindow   * The target window that the link takes you to. This attribute
     * is required.
     */
    public void setTargetWindow(com.google.api.ads.dfp.axis.v201302.TargetWindow targetWindow) {
        this.targetWindow = targetWindow;
    }


    /**
     * Gets the linkColor value for this TextAdCreative.
     * 
     * @return linkColor   * The color of the {@link linkTitle}, either as a hexadecimal
     * value or a standard color
     *                     name from HTML specifications (e.g. #FFFFFF or
     * white). This attribute is required.
     */
    public java.lang.String getLinkColor() {
        return linkColor;
    }


    /**
     * Sets the linkColor value for this TextAdCreative.
     * 
     * @param linkColor   * The color of the {@link linkTitle}, either as a hexadecimal
     * value or a standard color
     *                     name from HTML specifications (e.g. #FFFFFF or
     * white). This attribute is required.
     */
    public void setLinkColor(java.lang.String linkColor) {
        this.linkColor = linkColor;
    }


    /**
     * Gets the linkTitle value for this TextAdCreative.
     * 
     * @return linkTitle   * The link title that the user would click to go to the {@link
     * destintationUrl}.
     *                     This attribute is required and has a maximum length
     * of 255 characters.
     */
    public java.lang.String getLinkTitle() {
        return linkTitle;
    }


    /**
     * Sets the linkTitle value for this TextAdCreative.
     * 
     * @param linkTitle   * The link title that the user would click to go to the {@link
     * destintationUrl}.
     *                     This attribute is required and has a maximum length
     * of 255 characters.
     */
    public void setLinkTitle(java.lang.String linkTitle) {
        this.linkTitle = linkTitle;
    }


    /**
     * Gets the text value for this TextAdCreative.
     * 
     * @return text   * The text that appears following the {@link linkTitle}. This
     * attribute is optional and has a
     *                     maximum length of 255 characters.
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this TextAdCreative.
     * 
     * @param text   * The text that appears following the {@link linkTitle}. This
     * attribute is optional and has a
     *                     maximum length of 255 characters.
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the textColor value for this TextAdCreative.
     * 
     * @return textColor   * The color of the text, either as a hexadecimal value or a standard
     * color
     *                     name from the HTML specifications (e.g. #FFFFFF
     * or white). This attribute is optional
     *                     and defaults to black.
     */
    public java.lang.String getTextColor() {
        return textColor;
    }


    /**
     * Sets the textColor value for this TextAdCreative.
     * 
     * @param textColor   * The color of the text, either as a hexadecimal value or a standard
     * color
     *                     name from the HTML specifications (e.g. #FFFFFF
     * or white). This attribute is optional
     *                     and defaults to black.
     */
    public void setTextColor(java.lang.String textColor) {
        this.textColor = textColor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TextAdCreative)) return false;
        TextAdCreative other = (TextAdCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hoverText==null && other.getHoverText()==null) || 
             (this.hoverText!=null &&
              this.hoverText.equals(other.getHoverText()))) &&
            ((this.targetWindow==null && other.getTargetWindow()==null) || 
             (this.targetWindow!=null &&
              this.targetWindow.equals(other.getTargetWindow()))) &&
            ((this.linkColor==null && other.getLinkColor()==null) || 
             (this.linkColor!=null &&
              this.linkColor.equals(other.getLinkColor()))) &&
            ((this.linkTitle==null && other.getLinkTitle()==null) || 
             (this.linkTitle!=null &&
              this.linkTitle.equals(other.getLinkTitle()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.textColor==null && other.getTextColor()==null) || 
             (this.textColor!=null &&
              this.textColor.equals(other.getTextColor())));
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
        if (getHoverText() != null) {
            _hashCode += getHoverText().hashCode();
        }
        if (getTargetWindow() != null) {
            _hashCode += getTargetWindow().hashCode();
        }
        if (getLinkColor() != null) {
            _hashCode += getLinkColor().hashCode();
        }
        if (getLinkTitle() != null) {
            _hashCode += getLinkTitle().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getTextColor() != null) {
            _hashCode += getTextColor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TextAdCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "TextAdCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoverText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "hoverText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "targetWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "TargetWindow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkColor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "linkColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "linkTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textColor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "textColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
