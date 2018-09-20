// Copyright 2018 Google LLC
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
 * TextAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * Represents a text asset.
 */
public class TextAsset  extends com.google.api.ads.adwords.axis.v201809.cm.Asset  implements java.io.Serializable {
    /* Text of the text asset.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span> */
    private java.lang.String assetText;

    public TextAsset() {
    }

    public TextAsset(
           java.lang.Long assetId,
           java.lang.String assetName,
           com.google.api.ads.adwords.axis.v201809.cm.AssetType assetSubtype,
           com.google.api.ads.adwords.axis.v201809.cm.AssetStatus assetStatus,
           java.lang.String assetType,
           java.lang.String assetText) {
        super(
            assetId,
            assetName,
            assetSubtype,
            assetStatus,
            assetType);
        this.assetText = assetText;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("assetId", getAssetId())
            .add("assetName", getAssetName())
            .add("assetStatus", getAssetStatus())
            .add("assetSubtype", getAssetSubtype())
            .add("assetText", getAssetText())
            .add("assetType", getAssetType())
            .toString();
    }

    /**
     * Gets the assetText value for this TextAsset.
     * 
     * @return assetText   * Text of the text asset.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public java.lang.String getAssetText() {
        return assetText;
    }


    /**
     * Sets the assetText value for this TextAsset.
     * 
     * @param assetText   * Text of the text asset.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public void setAssetText(java.lang.String assetText) {
        this.assetText = assetText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TextAsset)) return false;
        TextAsset other = (TextAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assetText==null && other.getAssetText()==null) || 
             (this.assetText!=null &&
              this.assetText.equals(other.getAssetText())));
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
        if (getAssetText() != null) {
            _hashCode += getAssetText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TextAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "TextAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "assetText"));
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
