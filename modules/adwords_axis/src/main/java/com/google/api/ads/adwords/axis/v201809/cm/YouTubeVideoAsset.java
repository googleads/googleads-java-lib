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
 * YouTubeVideoAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * Represents a YouTube video asset.
 */
public class YouTubeVideoAsset  extends com.google.api.ads.adwords.axis.v201809.cm.Asset  implements java.io.Serializable {
    /* YouTube video ID. This is the 11 char string value used in
     * the Youtube video URL.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "YouTubeVideoId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String youTubeVideoId;

    public YouTubeVideoAsset() {
    }

    public YouTubeVideoAsset(
           java.lang.Long assetId,
           java.lang.String assetName,
           com.google.api.ads.adwords.axis.v201809.cm.AssetType assetSubtype,
           com.google.api.ads.adwords.axis.v201809.cm.AssetStatus assetStatus,
           java.lang.String assetType,
           java.lang.String youTubeVideoId) {
        super(
            assetId,
            assetName,
            assetSubtype,
            assetStatus,
            assetType);
        this.youTubeVideoId = youTubeVideoId;
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
            .add("youTubeVideoId", getYouTubeVideoId())
            .toString();
    }

    /**
     * Gets the youTubeVideoId value for this YouTubeVideoAsset.
     * 
     * @return youTubeVideoId   * YouTube video ID. This is the 11 char string value used in
     * the Youtube video URL.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "YouTubeVideoId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getYouTubeVideoId() {
        return youTubeVideoId;
    }


    /**
     * Sets the youTubeVideoId value for this YouTubeVideoAsset.
     * 
     * @param youTubeVideoId   * YouTube video ID. This is the 11 char string value used in
     * the Youtube video URL.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "YouTubeVideoId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setYouTubeVideoId(java.lang.String youTubeVideoId) {
        this.youTubeVideoId = youTubeVideoId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YouTubeVideoAsset)) return false;
        YouTubeVideoAsset other = (YouTubeVideoAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.youTubeVideoId==null && other.getYouTubeVideoId()==null) || 
             (this.youTubeVideoId!=null &&
              this.youTubeVideoId.equals(other.getYouTubeVideoId())));
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
        if (getYouTubeVideoId() != null) {
            _hashCode += getYouTubeVideoId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YouTubeVideoAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "YouTubeVideoAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("youTubeVideoId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "youTubeVideoId"));
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
