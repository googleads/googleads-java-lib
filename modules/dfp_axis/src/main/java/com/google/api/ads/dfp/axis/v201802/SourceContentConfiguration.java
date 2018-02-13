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
 * SourceContentConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Parameters about this CDN configuration as a source of content.
 * This facilitates fetching the
 *             original content for conditioning and delivering the original
 * content as part of a modified
 *             stream.
 */
public class SourceContentConfiguration  implements java.io.Serializable {
    /* Configuration for how DAI should ingest media. At ingest time,
     * we match the url prefix of media
     *                 in a stream's playlist with an ingest location and
     * use the authentication credentials from the
     *                 corresponding ingest settings to download the media.
     * This value is required for a valid source
     *                 content configuration. */
    private com.google.api.ads.dfp.axis.v201802.MediaLocationSettings ingestSettings;

    /* Default configuration for how DAI should deliver the non-modified
     * media segments. At delivery
     *                 time, we replace the ingest location's url prefix
     * with the delivery location's URL prefix and
     *                 use the security policy from the delivery settings
     * to determine how DAI needs to deliver the
     *                 media so that users can access it. This value is required
     * for a valid source content
     *                 configuration. */
    private com.google.api.ads.dfp.axis.v201802.MediaLocationSettings defaultDeliverySettings;

    public SourceContentConfiguration() {
    }

    public SourceContentConfiguration(
           com.google.api.ads.dfp.axis.v201802.MediaLocationSettings ingestSettings,
           com.google.api.ads.dfp.axis.v201802.MediaLocationSettings defaultDeliverySettings) {
           this.ingestSettings = ingestSettings;
           this.defaultDeliverySettings = defaultDeliverySettings;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("defaultDeliverySettings", getDefaultDeliverySettings())
            .add("ingestSettings", getIngestSettings())
            .toString();
    }

    /**
     * Gets the ingestSettings value for this SourceContentConfiguration.
     * 
     * @return ingestSettings   * Configuration for how DAI should ingest media. At ingest time,
     * we match the url prefix of media
     *                 in a stream's playlist with an ingest location and
     * use the authentication credentials from the
     *                 corresponding ingest settings to download the media.
     * This value is required for a valid source
     *                 content configuration.
     */
    public com.google.api.ads.dfp.axis.v201802.MediaLocationSettings getIngestSettings() {
        return ingestSettings;
    }


    /**
     * Sets the ingestSettings value for this SourceContentConfiguration.
     * 
     * @param ingestSettings   * Configuration for how DAI should ingest media. At ingest time,
     * we match the url prefix of media
     *                 in a stream's playlist with an ingest location and
     * use the authentication credentials from the
     *                 corresponding ingest settings to download the media.
     * This value is required for a valid source
     *                 content configuration.
     */
    public void setIngestSettings(com.google.api.ads.dfp.axis.v201802.MediaLocationSettings ingestSettings) {
        this.ingestSettings = ingestSettings;
    }


    /**
     * Gets the defaultDeliverySettings value for this SourceContentConfiguration.
     * 
     * @return defaultDeliverySettings   * Default configuration for how DAI should deliver the non-modified
     * media segments. At delivery
     *                 time, we replace the ingest location's url prefix
     * with the delivery location's URL prefix and
     *                 use the security policy from the delivery settings
     * to determine how DAI needs to deliver the
     *                 media so that users can access it. This value is required
     * for a valid source content
     *                 configuration.
     */
    public com.google.api.ads.dfp.axis.v201802.MediaLocationSettings getDefaultDeliverySettings() {
        return defaultDeliverySettings;
    }


    /**
     * Sets the defaultDeliverySettings value for this SourceContentConfiguration.
     * 
     * @param defaultDeliverySettings   * Default configuration for how DAI should deliver the non-modified
     * media segments. At delivery
     *                 time, we replace the ingest location's url prefix
     * with the delivery location's URL prefix and
     *                 use the security policy from the delivery settings
     * to determine how DAI needs to deliver the
     *                 media so that users can access it. This value is required
     * for a valid source content
     *                 configuration.
     */
    public void setDefaultDeliverySettings(com.google.api.ads.dfp.axis.v201802.MediaLocationSettings defaultDeliverySettings) {
        this.defaultDeliverySettings = defaultDeliverySettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SourceContentConfiguration)) return false;
        SourceContentConfiguration other = (SourceContentConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ingestSettings==null && other.getIngestSettings()==null) || 
             (this.ingestSettings!=null &&
              this.ingestSettings.equals(other.getIngestSettings()))) &&
            ((this.defaultDeliverySettings==null && other.getDefaultDeliverySettings()==null) || 
             (this.defaultDeliverySettings!=null &&
              this.defaultDeliverySettings.equals(other.getDefaultDeliverySettings())));
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
        if (getIngestSettings() != null) {
            _hashCode += getIngestSettings().hashCode();
        }
        if (getDefaultDeliverySettings() != null) {
            _hashCode += getDefaultDeliverySettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SourceContentConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "SourceContentConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingestSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ingestSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MediaLocationSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultDeliverySettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "defaultDeliverySettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MediaLocationSettings"));
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
