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
 * HlsSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * {@link LiveStream} settings that are specific to the HTTP live
 * streaming (HLS) protocol.
 */
public class HlsSettings  implements java.io.Serializable {
    /* Indicates the type of the playlist associated with this live
     * stream. The playlist type is
     *                 analagous to the EXT-X-PLAYLIST-TYPE HLS tag. This
     * field is optional and will default to {@link
     *                 PlaylistType#LIVE}. */
    private com.google.api.ads.dfp.axis.v201802.PlaylistType playlistType;

    public HlsSettings() {
    }

    public HlsSettings(
           com.google.api.ads.dfp.axis.v201802.PlaylistType playlistType) {
           this.playlistType = playlistType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("playlistType", getPlaylistType())
            .toString();
    }

    /**
     * Gets the playlistType value for this HlsSettings.
     * 
     * @return playlistType   * Indicates the type of the playlist associated with this live
     * stream. The playlist type is
     *                 analagous to the EXT-X-PLAYLIST-TYPE HLS tag. This
     * field is optional and will default to {@link
     *                 PlaylistType#LIVE}.
     */
    public com.google.api.ads.dfp.axis.v201802.PlaylistType getPlaylistType() {
        return playlistType;
    }


    /**
     * Sets the playlistType value for this HlsSettings.
     * 
     * @param playlistType   * Indicates the type of the playlist associated with this live
     * stream. The playlist type is
     *                 analagous to the EXT-X-PLAYLIST-TYPE HLS tag. This
     * field is optional and will default to {@link
     *                 PlaylistType#LIVE}.
     */
    public void setPlaylistType(com.google.api.ads.dfp.axis.v201802.PlaylistType playlistType) {
        this.playlistType = playlistType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HlsSettings)) return false;
        HlsSettings other = (HlsSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.playlistType==null && other.getPlaylistType()==null) || 
             (this.playlistType!=null &&
              this.playlistType.equals(other.getPlaylistType())));
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
        if (getPlaylistType() != null) {
            _hashCode += getPlaylistType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HlsSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "HlsSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("playlistType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "playlistType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "PlaylistType"));
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
