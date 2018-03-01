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
 * DisplayCallToAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents display-call-to-action specific data.
 */
public class DisplayCallToAction  implements java.io.Serializable {
    /* Text of the display-call-to-action. Maximum display width is
     * 15 characters.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.String text;

    /* Text color of the display-call-to-action. In hexadecimal, e.g.
     * #ffffff for white. */
    private java.lang.String textColor;

    /* Identifies the url data in Ad.urlData used for this DisplayCallToAction.
     * If not set, the url
     *                 defaults to {@link Ad#finalUrls}. */
    private java.lang.String urlId;

    public DisplayCallToAction() {
    }

    public DisplayCallToAction(
           java.lang.String text,
           java.lang.String textColor,
           java.lang.String urlId) {
           this.text = text;
           this.textColor = textColor;
           this.urlId = urlId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("text", getText())
            .add("textColor", getTextColor())
            .add("urlId", getUrlId())
            .toString();
    }

    /**
     * Gets the text value for this DisplayCallToAction.
     * 
     * @return text   * Text of the display-call-to-action. Maximum display width is
     * 15 characters.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this DisplayCallToAction.
     * 
     * @param text   * Text of the display-call-to-action. Maximum display width is
     * 15 characters.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the textColor value for this DisplayCallToAction.
     * 
     * @return textColor   * Text color of the display-call-to-action. In hexadecimal, e.g.
     * #ffffff for white.
     */
    public java.lang.String getTextColor() {
        return textColor;
    }


    /**
     * Sets the textColor value for this DisplayCallToAction.
     * 
     * @param textColor   * Text color of the display-call-to-action. In hexadecimal, e.g.
     * #ffffff for white.
     */
    public void setTextColor(java.lang.String textColor) {
        this.textColor = textColor;
    }


    /**
     * Gets the urlId value for this DisplayCallToAction.
     * 
     * @return urlId   * Identifies the url data in Ad.urlData used for this DisplayCallToAction.
     * If not set, the url
     *                 defaults to {@link Ad#finalUrls}.
     */
    public java.lang.String getUrlId() {
        return urlId;
    }


    /**
     * Sets the urlId value for this DisplayCallToAction.
     * 
     * @param urlId   * Identifies the url data in Ad.urlData used for this DisplayCallToAction.
     * If not set, the url
     *                 defaults to {@link Ad#finalUrls}.
     */
    public void setUrlId(java.lang.String urlId) {
        this.urlId = urlId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DisplayCallToAction)) return false;
        DisplayCallToAction other = (DisplayCallToAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.textColor==null && other.getTextColor()==null) || 
             (this.textColor!=null &&
              this.textColor.equals(other.getTextColor()))) &&
            ((this.urlId==null && other.getUrlId()==null) || 
             (this.urlId!=null &&
              this.urlId.equals(other.getUrlId())));
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
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getTextColor() != null) {
            _hashCode += getTextColor().hashCode();
        }
        if (getUrlId() != null) {
            _hashCode += getUrlId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DisplayCallToAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DisplayCallToAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textColor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "textColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "urlId"));
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
