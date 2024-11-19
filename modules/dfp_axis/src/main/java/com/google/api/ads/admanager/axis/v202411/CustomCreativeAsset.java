// Copyright 2024 Google LLC
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
 * CustomCreativeAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202411;


/**
 * A {@code CustomCreativeAsset} is an association between a {@link
 * CustomCreative} and an asset.
 *             Any assets that are associated with a creative can be
 * inserted into its HTML snippet.
 */
public class CustomCreativeAsset  implements java.io.Serializable {
    /* The name by which the associated asset will be referenced.
     * For example, if the value is "foo",
     *                 then the asset can be inserted into an HTML snippet
     * using the macro: "%%FILE:foo%%". */
    private java.lang.String macroName;

    /* The asset. This attribute is required. To view the asset, use
     * {@link CreativeAsset#assetUrl}. */
    private com.google.api.ads.admanager.axis.v202411.CreativeAsset asset;

    public CustomCreativeAsset() {
    }

    public CustomCreativeAsset(
           java.lang.String macroName,
           com.google.api.ads.admanager.axis.v202411.CreativeAsset asset) {
           this.macroName = macroName;
           this.asset = asset;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("asset", getAsset())
            .add("macroName", getMacroName())
            .toString();
    }

    /**
     * Gets the macroName value for this CustomCreativeAsset.
     * 
     * @return macroName   * The name by which the associated asset will be referenced.
     * For example, if the value is "foo",
     *                 then the asset can be inserted into an HTML snippet
     * using the macro: "%%FILE:foo%%".
     */
    public java.lang.String getMacroName() {
        return macroName;
    }


    /**
     * Sets the macroName value for this CustomCreativeAsset.
     * 
     * @param macroName   * The name by which the associated asset will be referenced.
     * For example, if the value is "foo",
     *                 then the asset can be inserted into an HTML snippet
     * using the macro: "%%FILE:foo%%".
     */
    public void setMacroName(java.lang.String macroName) {
        this.macroName = macroName;
    }


    /**
     * Gets the asset value for this CustomCreativeAsset.
     * 
     * @return asset   * The asset. This attribute is required. To view the asset, use
     * {@link CreativeAsset#assetUrl}.
     */
    public com.google.api.ads.admanager.axis.v202411.CreativeAsset getAsset() {
        return asset;
    }


    /**
     * Sets the asset value for this CustomCreativeAsset.
     * 
     * @param asset   * The asset. This attribute is required. To view the asset, use
     * {@link CreativeAsset#assetUrl}.
     */
    public void setAsset(com.google.api.ads.admanager.axis.v202411.CreativeAsset asset) {
        this.asset = asset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomCreativeAsset)) return false;
        CustomCreativeAsset other = (CustomCreativeAsset) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.macroName==null && other.getMacroName()==null) || 
             (this.macroName!=null &&
              this.macroName.equals(other.getMacroName()))) &&
            ((this.asset==null && other.getAsset()==null) || 
             (this.asset!=null &&
              this.asset.equals(other.getAsset())));
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
        if (getMacroName() != null) {
            _hashCode += getMacroName().hashCode();
        }
        if (getAsset() != null) {
            _hashCode += getAsset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomCreativeAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "CustomCreativeAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macroName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "macroName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "asset"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "CreativeAsset"));
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
