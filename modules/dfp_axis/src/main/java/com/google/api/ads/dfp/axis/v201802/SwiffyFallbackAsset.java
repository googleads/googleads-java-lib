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
 * SwiffyFallbackAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A fallback swiffy asset used for flash creatives.
 */
public class SwiffyFallbackAsset  implements java.io.Serializable {
    /* The Swiffy asset. */
    private com.google.api.ads.dfp.axis.v201802.CreativeAsset asset;

    /* A list of {@link Html5Feature HTML5 features} required to play
     * this Swiffy fallback
     *                 asset correctly. */
    private com.google.api.ads.dfp.axis.v201802.Html5Feature[] html5Features;

    /* A list of localized messages that give detailed information
     * about the Swiffy
     *                 conversion. Does not contain error or warning messages. */
    private java.lang.String[] localizedInfoMessages;

    public SwiffyFallbackAsset() {
    }

    public SwiffyFallbackAsset(
           com.google.api.ads.dfp.axis.v201802.CreativeAsset asset,
           com.google.api.ads.dfp.axis.v201802.Html5Feature[] html5Features,
           java.lang.String[] localizedInfoMessages) {
           this.asset = asset;
           this.html5Features = html5Features;
           this.localizedInfoMessages = localizedInfoMessages;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("asset", getAsset())
            .add("html5Features", getHtml5Features())
            .add("localizedInfoMessages", getLocalizedInfoMessages())
            .toString();
    }

    /**
     * Gets the asset value for this SwiffyFallbackAsset.
     * 
     * @return asset   * The Swiffy asset.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeAsset getAsset() {
        return asset;
    }


    /**
     * Sets the asset value for this SwiffyFallbackAsset.
     * 
     * @param asset   * The Swiffy asset.
     */
    public void setAsset(com.google.api.ads.dfp.axis.v201802.CreativeAsset asset) {
        this.asset = asset;
    }


    /**
     * Gets the html5Features value for this SwiffyFallbackAsset.
     * 
     * @return html5Features   * A list of {@link Html5Feature HTML5 features} required to play
     * this Swiffy fallback
     *                 asset correctly.
     */
    public com.google.api.ads.dfp.axis.v201802.Html5Feature[] getHtml5Features() {
        return html5Features;
    }


    /**
     * Sets the html5Features value for this SwiffyFallbackAsset.
     * 
     * @param html5Features   * A list of {@link Html5Feature HTML5 features} required to play
     * this Swiffy fallback
     *                 asset correctly.
     */
    public void setHtml5Features(com.google.api.ads.dfp.axis.v201802.Html5Feature[] html5Features) {
        this.html5Features = html5Features;
    }

    public com.google.api.ads.dfp.axis.v201802.Html5Feature getHtml5Features(int i) {
        return this.html5Features[i];
    }

    public void setHtml5Features(int i, com.google.api.ads.dfp.axis.v201802.Html5Feature _value) {
        this.html5Features[i] = _value;
    }


    /**
     * Gets the localizedInfoMessages value for this SwiffyFallbackAsset.
     * 
     * @return localizedInfoMessages   * A list of localized messages that give detailed information
     * about the Swiffy
     *                 conversion. Does not contain error or warning messages.
     */
    public java.lang.String[] getLocalizedInfoMessages() {
        return localizedInfoMessages;
    }


    /**
     * Sets the localizedInfoMessages value for this SwiffyFallbackAsset.
     * 
     * @param localizedInfoMessages   * A list of localized messages that give detailed information
     * about the Swiffy
     *                 conversion. Does not contain error or warning messages.
     */
    public void setLocalizedInfoMessages(java.lang.String[] localizedInfoMessages) {
        this.localizedInfoMessages = localizedInfoMessages;
    }

    public java.lang.String getLocalizedInfoMessages(int i) {
        return this.localizedInfoMessages[i];
    }

    public void setLocalizedInfoMessages(int i, java.lang.String _value) {
        this.localizedInfoMessages[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SwiffyFallbackAsset)) return false;
        SwiffyFallbackAsset other = (SwiffyFallbackAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.asset==null && other.getAsset()==null) || 
             (this.asset!=null &&
              this.asset.equals(other.getAsset()))) &&
            ((this.html5Features==null && other.getHtml5Features()==null) || 
             (this.html5Features!=null &&
              java.util.Arrays.equals(this.html5Features, other.getHtml5Features()))) &&
            ((this.localizedInfoMessages==null && other.getLocalizedInfoMessages()==null) || 
             (this.localizedInfoMessages!=null &&
              java.util.Arrays.equals(this.localizedInfoMessages, other.getLocalizedInfoMessages())));
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
        if (getAsset() != null) {
            _hashCode += getAsset().hashCode();
        }
        if (getHtml5Features() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHtml5Features());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHtml5Features(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalizedInfoMessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalizedInfoMessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalizedInfoMessages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwiffyFallbackAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "SwiffyFallbackAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "asset"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeAsset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("html5Features");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "html5Features"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Html5Feature"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizedInfoMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "localizedInfoMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
