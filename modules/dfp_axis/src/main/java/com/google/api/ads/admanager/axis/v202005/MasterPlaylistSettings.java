// Copyright 2020 Google LLC
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
 * MasterPlaylistSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202005;


/**
 * Settings for the HLS (HTTP Live Streaming) master playlist.
 */
public class MasterPlaylistSettings  implements java.io.Serializable {
    /* Indicates how the master playlist gets refreshed. This field
     * is optional and defaults to {@link
     *                 RefreshType#AUTOMATIC}. This field can only be modified
     * when the live stream is in a {@link
     *                 LiveStreamEventStatus#PAUSED} state. */
    private com.google.api.ads.admanager.axis.v202005.RefreshType refreshType;

    public MasterPlaylistSettings() {
    }

    public MasterPlaylistSettings(
           com.google.api.ads.admanager.axis.v202005.RefreshType refreshType) {
           this.refreshType = refreshType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("refreshType", getRefreshType())
            .toString();
    }

    /**
     * Gets the refreshType value for this MasterPlaylistSettings.
     * 
     * @return refreshType   * Indicates how the master playlist gets refreshed. This field
     * is optional and defaults to {@link
     *                 RefreshType#AUTOMATIC}. This field can only be modified
     * when the live stream is in a {@link
     *                 LiveStreamEventStatus#PAUSED} state.
     */
    public com.google.api.ads.admanager.axis.v202005.RefreshType getRefreshType() {
        return refreshType;
    }


    /**
     * Sets the refreshType value for this MasterPlaylistSettings.
     * 
     * @param refreshType   * Indicates how the master playlist gets refreshed. This field
     * is optional and defaults to {@link
     *                 RefreshType#AUTOMATIC}. This field can only be modified
     * when the live stream is in a {@link
     *                 LiveStreamEventStatus#PAUSED} state.
     */
    public void setRefreshType(com.google.api.ads.admanager.axis.v202005.RefreshType refreshType) {
        this.refreshType = refreshType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MasterPlaylistSettings)) return false;
        MasterPlaylistSettings other = (MasterPlaylistSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.refreshType==null && other.getRefreshType()==null) || 
             (this.refreshType!=null &&
              this.refreshType.equals(other.getRefreshType())));
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
        if (getRefreshType() != null) {
            _hashCode += getRefreshType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MasterPlaylistSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "MasterPlaylistSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refreshType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "refreshType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "RefreshType"));
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
