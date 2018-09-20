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
 * MediaBundleAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * Represents a media bundle asset.
 */
public class MediaBundleAsset  extends com.google.api.ads.adwords.axis.v201809.cm.Asset  implements java.io.Serializable {
    /* The raw data of a media bundle. Mutate only field. */
    private byte[] mediaBundleData;

    public MediaBundleAsset() {
    }

    public MediaBundleAsset(
           java.lang.Long assetId,
           java.lang.String assetName,
           com.google.api.ads.adwords.axis.v201809.cm.AssetType assetSubtype,
           com.google.api.ads.adwords.axis.v201809.cm.AssetStatus assetStatus,
           java.lang.String assetType,
           byte[] mediaBundleData) {
        super(
            assetId,
            assetName,
            assetSubtype,
            assetStatus,
            assetType);
        this.mediaBundleData = mediaBundleData;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("assetId", getAssetId())
            .add("assetName", getAssetName())
            .add("assetStatus", getAssetStatus())
            .add("assetSubtype", getAssetSubtype())
            .add("assetType", getAssetType())
            .add("mediaBundleData", getMediaBundleData())
            .toString();
    }

    /**
     * Gets the mediaBundleData value for this MediaBundleAsset.
     * 
     * @return mediaBundleData   * The raw data of a media bundle. Mutate only field.
     */
    public byte[] getMediaBundleData() {
        return mediaBundleData;
    }


    /**
     * Sets the mediaBundleData value for this MediaBundleAsset.
     * 
     * @param mediaBundleData   * The raw data of a media bundle. Mutate only field.
     */
    public void setMediaBundleData(byte[] mediaBundleData) {
        this.mediaBundleData = mediaBundleData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MediaBundleAsset)) return false;
        MediaBundleAsset other = (MediaBundleAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mediaBundleData==null && other.getMediaBundleData()==null) || 
             (this.mediaBundleData!=null &&
              java.util.Arrays.equals(this.mediaBundleData, other.getMediaBundleData())));
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
        if (getMediaBundleData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMediaBundleData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMediaBundleData(), i);
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
        new org.apache.axis.description.TypeDesc(MediaBundleAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "MediaBundleAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaBundleData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "mediaBundleData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
