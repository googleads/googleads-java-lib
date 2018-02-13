// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * AdSenseSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Contains the AdSense configuration for an {@link AdUnit}.
 */
public class AdSenseSettings  implements java.io.Serializable {
    /* Specifies whether or not the {@link AdUnit} is enabled for
     * serving ads from
     *                 the AdSense content network. This attribute is optional
     * and defaults to the
     *                 ad unit's parent or ancestor's setting if one has
     * been set. If no ancestor
     *                 of the ad unit has set {@code adSenseEnabled}, the
     * attribute is
     *                 defaulted to {@code true}. */
    private java.lang.Boolean adSenseEnabled;

    /* Specifies the Hexadecimal border color, from {@code 000000}
     * to {@code
     *                 FFFFFF}. This attribute is optional and defaults to
     * the ad unit's parent or
     *                 ancestor's setting if one has been set. If no ancestor
     * of the ad unit has
     *                 set {@code borderColor}, the attribute is defaulted
     * to {@code FFFFFF}. */
    private java.lang.String borderColor;

    /* Specifies the Hexadecimal title color of an ad, from {@code
     * 000000} to
     *                 {@code FFFFFF}. This attribute is optional and defaults
     * to the ad unit's
     *                 parent or ancestor's setting if one has been set.
     * If no ancestor of the
     *                 ad unit has set {@code titleColor}, the attribute
     * is defaulted to {@code
     *                 0000FF}. */
    private java.lang.String titleColor;

    /* Specifies the Hexadecimal background color of an ad, from {@code
     * 000000} to
     *                 {@code FFFFFF}. This attribute is optional and defaults
     * to the ad unit's
     *                 parent or ancestor's setting if one has been set.
     * If no ancestor of the ad
     *                 unit has set {@code backgroundColor}, the attribute
     * is defaulted to {@code
     *                 FFFFFF}. */
    private java.lang.String backgroundColor;

    /* Specifies the Hexadecimal color of the text of an ad, from
     * {@code 000000}
     *                 to {@code FFFFFF}. This attribute is optional and
     * defaults to the ad unit's
     *                 parent or ancestor's setting if one has been set.
     * If no ancestor of the ad
     *                 unit has set {@code textColor}, the attribute is defaulted
     * to {@code
     *                 000000}. */
    private java.lang.String textColor;

    /* Specifies the Hexadecimal color of the URL of an ad, from {@code
     * 000000} to
     *                 {@code FFFFFF}. This attribute is optional and defaults
     * to the ad unit's
     *                 parent or ancestor's setting if one has been set.
     * If no ancestor of the ad
     *                 unit has set {@code urlColor}, the attribute is defaulted
     * to {@code 008000}
     *                 . */
    private java.lang.String urlColor;

    /* Specifies what kind of ad can be served by this {@link AdUnit}
     * from the
     *                 AdSense Content Network. This attribute is optional
     * and defaults to the ad
     *                 unit's parent or ancestor's setting if one has been
     * set. If no ancestor of
     *                 the ad unit has set {@code adType}, the attribute
     * is defaulted to {@link
     *                 AdType#TEXT_AND_IMAGE}. */
    private com.google.api.ads.dfp.axis.v201802.AdSenseSettingsAdType adType;

    /* Specifies the border-style of the {@link AdUnit}. This attribute
     * is
     *                 optional and defaults to the ad unit's parent or ancestor's
     * setting if one
     *                 has been set. If no ancestor of the ad unit has set
     * {@code borderStyle},
     *                 the attribute is defaulted to {@link BorderStyle#DEFAULT}. */
    private com.google.api.ads.dfp.axis.v201802.AdSenseSettingsBorderStyle borderStyle;

    /* Specifies the font family of the {@link AdUnit}. This attribute
     * is optional
     *                 and defaults to the ad unit's parent or ancestor's
     * setting if one has been
     *                 set. If no ancestor of the ad unit has set {@code
     * fontFamily}, the
     *                 attribute is defaulted to {@link FontFamily#DEFAULT}. */
    private com.google.api.ads.dfp.axis.v201802.AdSenseSettingsFontFamily fontFamily;

    /* Specifies the font size of the {@link AdUnit}. This attribute
     * is optional
     *                 and defaults to the ad unit's parent or ancestor's
     * setting if one has been
     *                 set. If no ancestor of the ad unit has set {@code
     * fontSize}, the
     *                 attribute is defaulted to {@link FontSize#DEFAULT}. */
    private com.google.api.ads.dfp.axis.v201802.AdSenseSettingsFontSize fontSize;

    public AdSenseSettings() {
    }

    public AdSenseSettings(
           java.lang.Boolean adSenseEnabled,
           java.lang.String borderColor,
           java.lang.String titleColor,
           java.lang.String backgroundColor,
           java.lang.String textColor,
           java.lang.String urlColor,
           com.google.api.ads.dfp.axis.v201802.AdSenseSettingsAdType adType,
           com.google.api.ads.dfp.axis.v201802.AdSenseSettingsBorderStyle borderStyle,
           com.google.api.ads.dfp.axis.v201802.AdSenseSettingsFontFamily fontFamily,
           com.google.api.ads.dfp.axis.v201802.AdSenseSettingsFontSize fontSize) {
           this.adSenseEnabled = adSenseEnabled;
           this.borderColor = borderColor;
           this.titleColor = titleColor;
           this.backgroundColor = backgroundColor;
           this.textColor = textColor;
           this.urlColor = urlColor;
           this.adType = adType;
           this.borderStyle = borderStyle;
           this.fontFamily = fontFamily;
           this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adSenseEnabled", getAdSenseEnabled())
            .add("adType", getAdType())
            .add("backgroundColor", getBackgroundColor())
            .add("borderColor", getBorderColor())
            .add("borderStyle", getBorderStyle())
            .add("fontFamily", getFontFamily())
            .add("fontSize", getFontSize())
            .add("textColor", getTextColor())
            .add("titleColor", getTitleColor())
            .add("urlColor", getUrlColor())
            .toString();
    }

    /**
     * Gets the adSenseEnabled value for this AdSenseSettings.
     * 
     * @return adSenseEnabled   * Specifies whether or not the {@link AdUnit} is enabled for
     * serving ads from
     *                 the AdSense content network. This attribute is optional
     * and defaults to the
     *                 ad unit's parent or ancestor's setting if one has
     * been set. If no ancestor
     *                 of the ad unit has set {@code adSenseEnabled}, the
     * attribute is
     *                 defaulted to {@code true}.
     */
    public java.lang.Boolean getAdSenseEnabled() {
        return adSenseEnabled;
    }


    /**
     * Sets the adSenseEnabled value for this AdSenseSettings.
     * 
     * @param adSenseEnabled   * Specifies whether or not the {@link AdUnit} is enabled for
     * serving ads from
     *                 the AdSense content network. This attribute is optional
     * and defaults to the
     *                 ad unit's parent or ancestor's setting if one has
     * been set. If no ancestor
     *                 of the ad unit has set {@code adSenseEnabled}, the
     * attribute is
     *                 defaulted to {@code true}.
     */
    public void setAdSenseEnabled(java.lang.Boolean adSenseEnabled) {
        this.adSenseEnabled = adSenseEnabled;
    }


    /**
     * Gets the borderColor value for this AdSenseSettings.
     * 
     * @return borderColor   * Specifies the Hexadecimal border color, from {@code 000000}
     * to {@code
     *                 FFFFFF}. This attribute is optional and defaults to
     * the ad unit's parent or
     *                 ancestor's setting if one has been set. If no ancestor
     * of the ad unit has
     *                 set {@code borderColor}, the attribute is defaulted
     * to {@code FFFFFF}.
     */
    public java.lang.String getBorderColor() {
        return borderColor;
    }


    /**
     * Sets the borderColor value for this AdSenseSettings.
     * 
     * @param borderColor   * Specifies the Hexadecimal border color, from {@code 000000}
     * to {@code
     *                 FFFFFF}. This attribute is optional and defaults to
     * the ad unit's parent or
     *                 ancestor's setting if one has been set. If no ancestor
     * of the ad unit has
     *                 set {@code borderColor}, the attribute is defaulted
     * to {@code FFFFFF}.
     */
    public void setBorderColor(java.lang.String borderColor) {
        this.borderColor = borderColor;
    }


    /**
     * Gets the titleColor value for this AdSenseSettings.
     * 
     * @return titleColor   * Specifies the Hexadecimal title color of an ad, from {@code
     * 000000} to
     *                 {@code FFFFFF}. This attribute is optional and defaults
     * to the ad unit's
     *                 parent or ancestor's setting if one has been set.
     * If no ancestor of the
     *                 ad unit has set {@code titleColor}, the attribute
     * is defaulted to {@code
     *                 0000FF}.
     */
    public java.lang.String getTitleColor() {
        return titleColor;
    }


    /**
     * Sets the titleColor value for this AdSenseSettings.
     * 
     * @param titleColor   * Specifies the Hexadecimal title color of an ad, from {@code
     * 000000} to
     *                 {@code FFFFFF}. This attribute is optional and defaults
     * to the ad unit's
     *                 parent or ancestor's setting if one has been set.
     * If no ancestor of the
     *                 ad unit has set {@code titleColor}, the attribute
     * is defaulted to {@code
     *                 0000FF}.
     */
    public void setTitleColor(java.lang.String titleColor) {
        this.titleColor = titleColor;
    }


    /**
     * Gets the backgroundColor value for this AdSenseSettings.
     * 
     * @return backgroundColor   * Specifies the Hexadecimal background color of an ad, from {@code
     * 000000} to
     *                 {@code FFFFFF}. This attribute is optional and defaults
     * to the ad unit's
     *                 parent or ancestor's setting if one has been set.
     * If no ancestor of the ad
     *                 unit has set {@code backgroundColor}, the attribute
     * is defaulted to {@code
     *                 FFFFFF}.
     */
    public java.lang.String getBackgroundColor() {
        return backgroundColor;
    }


    /**
     * Sets the backgroundColor value for this AdSenseSettings.
     * 
     * @param backgroundColor   * Specifies the Hexadecimal background color of an ad, from {@code
     * 000000} to
     *                 {@code FFFFFF}. This attribute is optional and defaults
     * to the ad unit's
     *                 parent or ancestor's setting if one has been set.
     * If no ancestor of the ad
     *                 unit has set {@code backgroundColor}, the attribute
     * is defaulted to {@code
     *                 FFFFFF}.
     */
    public void setBackgroundColor(java.lang.String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }


    /**
     * Gets the textColor value for this AdSenseSettings.
     * 
     * @return textColor   * Specifies the Hexadecimal color of the text of an ad, from
     * {@code 000000}
     *                 to {@code FFFFFF}. This attribute is optional and
     * defaults to the ad unit's
     *                 parent or ancestor's setting if one has been set.
     * If no ancestor of the ad
     *                 unit has set {@code textColor}, the attribute is defaulted
     * to {@code
     *                 000000}.
     */
    public java.lang.String getTextColor() {
        return textColor;
    }


    /**
     * Sets the textColor value for this AdSenseSettings.
     * 
     * @param textColor   * Specifies the Hexadecimal color of the text of an ad, from
     * {@code 000000}
     *                 to {@code FFFFFF}. This attribute is optional and
     * defaults to the ad unit's
     *                 parent or ancestor's setting if one has been set.
     * If no ancestor of the ad
     *                 unit has set {@code textColor}, the attribute is defaulted
     * to {@code
     *                 000000}.
     */
    public void setTextColor(java.lang.String textColor) {
        this.textColor = textColor;
    }


    /**
     * Gets the urlColor value for this AdSenseSettings.
     * 
     * @return urlColor   * Specifies the Hexadecimal color of the URL of an ad, from {@code
     * 000000} to
     *                 {@code FFFFFF}. This attribute is optional and defaults
     * to the ad unit's
     *                 parent or ancestor's setting if one has been set.
     * If no ancestor of the ad
     *                 unit has set {@code urlColor}, the attribute is defaulted
     * to {@code 008000}
     *                 .
     */
    public java.lang.String getUrlColor() {
        return urlColor;
    }


    /**
     * Sets the urlColor value for this AdSenseSettings.
     * 
     * @param urlColor   * Specifies the Hexadecimal color of the URL of an ad, from {@code
     * 000000} to
     *                 {@code FFFFFF}. This attribute is optional and defaults
     * to the ad unit's
     *                 parent or ancestor's setting if one has been set.
     * If no ancestor of the ad
     *                 unit has set {@code urlColor}, the attribute is defaulted
     * to {@code 008000}
     *                 .
     */
    public void setUrlColor(java.lang.String urlColor) {
        this.urlColor = urlColor;
    }


    /**
     * Gets the adType value for this AdSenseSettings.
     * 
     * @return adType   * Specifies what kind of ad can be served by this {@link AdUnit}
     * from the
     *                 AdSense Content Network. This attribute is optional
     * and defaults to the ad
     *                 unit's parent or ancestor's setting if one has been
     * set. If no ancestor of
     *                 the ad unit has set {@code adType}, the attribute
     * is defaulted to {@link
     *                 AdType#TEXT_AND_IMAGE}.
     */
    public com.google.api.ads.dfp.axis.v201802.AdSenseSettingsAdType getAdType() {
        return adType;
    }


    /**
     * Sets the adType value for this AdSenseSettings.
     * 
     * @param adType   * Specifies what kind of ad can be served by this {@link AdUnit}
     * from the
     *                 AdSense Content Network. This attribute is optional
     * and defaults to the ad
     *                 unit's parent or ancestor's setting if one has been
     * set. If no ancestor of
     *                 the ad unit has set {@code adType}, the attribute
     * is defaulted to {@link
     *                 AdType#TEXT_AND_IMAGE}.
     */
    public void setAdType(com.google.api.ads.dfp.axis.v201802.AdSenseSettingsAdType adType) {
        this.adType = adType;
    }


    /**
     * Gets the borderStyle value for this AdSenseSettings.
     * 
     * @return borderStyle   * Specifies the border-style of the {@link AdUnit}. This attribute
     * is
     *                 optional and defaults to the ad unit's parent or ancestor's
     * setting if one
     *                 has been set. If no ancestor of the ad unit has set
     * {@code borderStyle},
     *                 the attribute is defaulted to {@link BorderStyle#DEFAULT}.
     */
    public com.google.api.ads.dfp.axis.v201802.AdSenseSettingsBorderStyle getBorderStyle() {
        return borderStyle;
    }


    /**
     * Sets the borderStyle value for this AdSenseSettings.
     * 
     * @param borderStyle   * Specifies the border-style of the {@link AdUnit}. This attribute
     * is
     *                 optional and defaults to the ad unit's parent or ancestor's
     * setting if one
     *                 has been set. If no ancestor of the ad unit has set
     * {@code borderStyle},
     *                 the attribute is defaulted to {@link BorderStyle#DEFAULT}.
     */
    public void setBorderStyle(com.google.api.ads.dfp.axis.v201802.AdSenseSettingsBorderStyle borderStyle) {
        this.borderStyle = borderStyle;
    }


    /**
     * Gets the fontFamily value for this AdSenseSettings.
     * 
     * @return fontFamily   * Specifies the font family of the {@link AdUnit}. This attribute
     * is optional
     *                 and defaults to the ad unit's parent or ancestor's
     * setting if one has been
     *                 set. If no ancestor of the ad unit has set {@code
     * fontFamily}, the
     *                 attribute is defaulted to {@link FontFamily#DEFAULT}.
     */
    public com.google.api.ads.dfp.axis.v201802.AdSenseSettingsFontFamily getFontFamily() {
        return fontFamily;
    }


    /**
     * Sets the fontFamily value for this AdSenseSettings.
     * 
     * @param fontFamily   * Specifies the font family of the {@link AdUnit}. This attribute
     * is optional
     *                 and defaults to the ad unit's parent or ancestor's
     * setting if one has been
     *                 set. If no ancestor of the ad unit has set {@code
     * fontFamily}, the
     *                 attribute is defaulted to {@link FontFamily#DEFAULT}.
     */
    public void setFontFamily(com.google.api.ads.dfp.axis.v201802.AdSenseSettingsFontFamily fontFamily) {
        this.fontFamily = fontFamily;
    }


    /**
     * Gets the fontSize value for this AdSenseSettings.
     * 
     * @return fontSize   * Specifies the font size of the {@link AdUnit}. This attribute
     * is optional
     *                 and defaults to the ad unit's parent or ancestor's
     * setting if one has been
     *                 set. If no ancestor of the ad unit has set {@code
     * fontSize}, the
     *                 attribute is defaulted to {@link FontSize#DEFAULT}.
     */
    public com.google.api.ads.dfp.axis.v201802.AdSenseSettingsFontSize getFontSize() {
        return fontSize;
    }


    /**
     * Sets the fontSize value for this AdSenseSettings.
     * 
     * @param fontSize   * Specifies the font size of the {@link AdUnit}. This attribute
     * is optional
     *                 and defaults to the ad unit's parent or ancestor's
     * setting if one has been
     *                 set. If no ancestor of the ad unit has set {@code
     * fontSize}, the
     *                 attribute is defaulted to {@link FontSize#DEFAULT}.
     */
    public void setFontSize(com.google.api.ads.dfp.axis.v201802.AdSenseSettingsFontSize fontSize) {
        this.fontSize = fontSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdSenseSettings)) return false;
        AdSenseSettings other = (AdSenseSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adSenseEnabled==null && other.getAdSenseEnabled()==null) || 
             (this.adSenseEnabled!=null &&
              this.adSenseEnabled.equals(other.getAdSenseEnabled()))) &&
            ((this.borderColor==null && other.getBorderColor()==null) || 
             (this.borderColor!=null &&
              this.borderColor.equals(other.getBorderColor()))) &&
            ((this.titleColor==null && other.getTitleColor()==null) || 
             (this.titleColor!=null &&
              this.titleColor.equals(other.getTitleColor()))) &&
            ((this.backgroundColor==null && other.getBackgroundColor()==null) || 
             (this.backgroundColor!=null &&
              this.backgroundColor.equals(other.getBackgroundColor()))) &&
            ((this.textColor==null && other.getTextColor()==null) || 
             (this.textColor!=null &&
              this.textColor.equals(other.getTextColor()))) &&
            ((this.urlColor==null && other.getUrlColor()==null) || 
             (this.urlColor!=null &&
              this.urlColor.equals(other.getUrlColor()))) &&
            ((this.adType==null && other.getAdType()==null) || 
             (this.adType!=null &&
              this.adType.equals(other.getAdType()))) &&
            ((this.borderStyle==null && other.getBorderStyle()==null) || 
             (this.borderStyle!=null &&
              this.borderStyle.equals(other.getBorderStyle()))) &&
            ((this.fontFamily==null && other.getFontFamily()==null) || 
             (this.fontFamily!=null &&
              this.fontFamily.equals(other.getFontFamily()))) &&
            ((this.fontSize==null && other.getFontSize()==null) || 
             (this.fontSize!=null &&
              this.fontSize.equals(other.getFontSize())));
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
        if (getAdSenseEnabled() != null) {
            _hashCode += getAdSenseEnabled().hashCode();
        }
        if (getBorderColor() != null) {
            _hashCode += getBorderColor().hashCode();
        }
        if (getTitleColor() != null) {
            _hashCode += getTitleColor().hashCode();
        }
        if (getBackgroundColor() != null) {
            _hashCode += getBackgroundColor().hashCode();
        }
        if (getTextColor() != null) {
            _hashCode += getTextColor().hashCode();
        }
        if (getUrlColor() != null) {
            _hashCode += getUrlColor().hashCode();
        }
        if (getAdType() != null) {
            _hashCode += getAdType().hashCode();
        }
        if (getBorderStyle() != null) {
            _hashCode += getBorderStyle().hashCode();
        }
        if (getFontFamily() != null) {
            _hashCode += getFontFamily().hashCode();
        }
        if (getFontSize() != null) {
            _hashCode += getFontSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdSenseSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdSenseSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adSenseEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "adSenseEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("borderColor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "borderColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleColor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "titleColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundColor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "backgroundColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textColor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "textColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlColor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "urlColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "adType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdSenseSettings.AdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("borderStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "borderStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdSenseSettings.BorderStyle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fontFamily");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "fontFamily"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdSenseSettings.FontFamily"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fontSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "fontSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdSenseSettings.FontSize"));
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
