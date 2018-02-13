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
 * SetTopBoxCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code Creative} that will be served into cable set-top boxes.
 * There are no assets for this
 *             creative type, as they are hosted by external cable systems.
 */
public class SetTopBoxCreative  extends com.google.api.ads.dfp.axis.v201802.BaseVideoCreative  implements java.io.Serializable {
    /* An external asset identifier that is used in the cable system.
     * This attribute is read-only
     *                     after creation. */
    private java.lang.String externalAssetId;

    /* An identifier for the provider in the cable system. This attribute
     * is read-only after creation. */
    private java.lang.String providerId;

    /* IDs of regions where the creative is available to serve from
     * a local cable video-on-demand
     *                     server. This attribute is optional. */
    private java.lang.String[] availabilityRegionIds;

    /* The date and time that this creative can begin serving from
     * a local cable video-on-demand
     *                     server. This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.DateTime licenseWindowStartDateTime;

    /* The date and time that this creative can no longer be served
     * from a local cable video-on-demand
     *                     server. This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.DateTime licenseWindowEndDateTime;

    public SetTopBoxCreative() {
    }

    public SetTopBoxCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201802.CreativePolicyViolation[] policyViolations,
           com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues,
           java.lang.String destinationUrl,
           com.google.api.ads.dfp.axis.v201802.DestinationUrlType destinationUrlType,
           java.lang.Integer duration,
           java.lang.Boolean allowDurationOverride,
           com.google.api.ads.dfp.axis.v201802.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls,
           long[] companionCreativeIds,
           java.lang.String customParameters,
           com.google.api.ads.dfp.axis.v201802.SkippableAdType skippableAdType,
           java.lang.String vastPreviewUrl,
           com.google.api.ads.dfp.axis.v201802.SslScanResult sslScanResult,
           com.google.api.ads.dfp.axis.v201802.SslManualOverride sslManualOverride,
           java.lang.String externalAssetId,
           java.lang.String providerId,
           java.lang.String[] availabilityRegionIds,
           com.google.api.ads.dfp.axis.v201802.DateTime licenseWindowStartDateTime,
           com.google.api.ads.dfp.axis.v201802.DateTime licenseWindowEndDateTime) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            policyViolations,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            destinationUrl,
            destinationUrlType,
            duration,
            allowDurationOverride,
            trackingUrls,
            companionCreativeIds,
            customParameters,
            skippableAdType,
            vastPreviewUrl,
            sslScanResult,
            sslManualOverride);
        this.externalAssetId = externalAssetId;
        this.providerId = providerId;
        this.availabilityRegionIds = availabilityRegionIds;
        this.licenseWindowStartDateTime = licenseWindowStartDateTime;
        this.licenseWindowEndDateTime = licenseWindowEndDateTime;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiserId", getAdvertiserId())
            .add("allowDurationOverride", getAllowDurationOverride())
            .add("appliedLabels", getAppliedLabels())
            .add("availabilityRegionIds", getAvailabilityRegionIds())
            .add("companionCreativeIds", getCompanionCreativeIds())
            .add("customFieldValues", getCustomFieldValues())
            .add("customParameters", getCustomParameters())
            .add("destinationUrl", getDestinationUrl())
            .add("destinationUrlType", getDestinationUrlType())
            .add("duration", getDuration())
            .add("externalAssetId", getExternalAssetId())
            .add("id", getId())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("licenseWindowEndDateTime", getLicenseWindowEndDateTime())
            .add("licenseWindowStartDateTime", getLicenseWindowStartDateTime())
            .add("name", getName())
            .add("policyViolations", getPolicyViolations())
            .add("previewUrl", getPreviewUrl())
            .add("providerId", getProviderId())
            .add("size", getSize())
            .add("skippableAdType", getSkippableAdType())
            .add("sslManualOverride", getSslManualOverride())
            .add("sslScanResult", getSslScanResult())
            .add("trackingUrls", getTrackingUrls())
            .add("vastPreviewUrl", getVastPreviewUrl())
            .toString();
    }

    /**
     * Gets the externalAssetId value for this SetTopBoxCreative.
     * 
     * @return externalAssetId   * An external asset identifier that is used in the cable system.
     * This attribute is read-only
     *                     after creation.
     */
    public java.lang.String getExternalAssetId() {
        return externalAssetId;
    }


    /**
     * Sets the externalAssetId value for this SetTopBoxCreative.
     * 
     * @param externalAssetId   * An external asset identifier that is used in the cable system.
     * This attribute is read-only
     *                     after creation.
     */
    public void setExternalAssetId(java.lang.String externalAssetId) {
        this.externalAssetId = externalAssetId;
    }


    /**
     * Gets the providerId value for this SetTopBoxCreative.
     * 
     * @return providerId   * An identifier for the provider in the cable system. This attribute
     * is read-only after creation.
     */
    public java.lang.String getProviderId() {
        return providerId;
    }


    /**
     * Sets the providerId value for this SetTopBoxCreative.
     * 
     * @param providerId   * An identifier for the provider in the cable system. This attribute
     * is read-only after creation.
     */
    public void setProviderId(java.lang.String providerId) {
        this.providerId = providerId;
    }


    /**
     * Gets the availabilityRegionIds value for this SetTopBoxCreative.
     * 
     * @return availabilityRegionIds   * IDs of regions where the creative is available to serve from
     * a local cable video-on-demand
     *                     server. This attribute is optional.
     */
    public java.lang.String[] getAvailabilityRegionIds() {
        return availabilityRegionIds;
    }


    /**
     * Sets the availabilityRegionIds value for this SetTopBoxCreative.
     * 
     * @param availabilityRegionIds   * IDs of regions where the creative is available to serve from
     * a local cable video-on-demand
     *                     server. This attribute is optional.
     */
    public void setAvailabilityRegionIds(java.lang.String[] availabilityRegionIds) {
        this.availabilityRegionIds = availabilityRegionIds;
    }

    public java.lang.String getAvailabilityRegionIds(int i) {
        return this.availabilityRegionIds[i];
    }

    public void setAvailabilityRegionIds(int i, java.lang.String _value) {
        this.availabilityRegionIds[i] = _value;
    }


    /**
     * Gets the licenseWindowStartDateTime value for this SetTopBoxCreative.
     * 
     * @return licenseWindowStartDateTime   * The date and time that this creative can begin serving from
     * a local cable video-on-demand
     *                     server. This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getLicenseWindowStartDateTime() {
        return licenseWindowStartDateTime;
    }


    /**
     * Sets the licenseWindowStartDateTime value for this SetTopBoxCreative.
     * 
     * @param licenseWindowStartDateTime   * The date and time that this creative can begin serving from
     * a local cable video-on-demand
     *                     server. This attribute is optional.
     */
    public void setLicenseWindowStartDateTime(com.google.api.ads.dfp.axis.v201802.DateTime licenseWindowStartDateTime) {
        this.licenseWindowStartDateTime = licenseWindowStartDateTime;
    }


    /**
     * Gets the licenseWindowEndDateTime value for this SetTopBoxCreative.
     * 
     * @return licenseWindowEndDateTime   * The date and time that this creative can no longer be served
     * from a local cable video-on-demand
     *                     server. This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getLicenseWindowEndDateTime() {
        return licenseWindowEndDateTime;
    }


    /**
     * Sets the licenseWindowEndDateTime value for this SetTopBoxCreative.
     * 
     * @param licenseWindowEndDateTime   * The date and time that this creative can no longer be served
     * from a local cable video-on-demand
     *                     server. This attribute is optional.
     */
    public void setLicenseWindowEndDateTime(com.google.api.ads.dfp.axis.v201802.DateTime licenseWindowEndDateTime) {
        this.licenseWindowEndDateTime = licenseWindowEndDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetTopBoxCreative)) return false;
        SetTopBoxCreative other = (SetTopBoxCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.externalAssetId==null && other.getExternalAssetId()==null) || 
             (this.externalAssetId!=null &&
              this.externalAssetId.equals(other.getExternalAssetId()))) &&
            ((this.providerId==null && other.getProviderId()==null) || 
             (this.providerId!=null &&
              this.providerId.equals(other.getProviderId()))) &&
            ((this.availabilityRegionIds==null && other.getAvailabilityRegionIds()==null) || 
             (this.availabilityRegionIds!=null &&
              java.util.Arrays.equals(this.availabilityRegionIds, other.getAvailabilityRegionIds()))) &&
            ((this.licenseWindowStartDateTime==null && other.getLicenseWindowStartDateTime()==null) || 
             (this.licenseWindowStartDateTime!=null &&
              this.licenseWindowStartDateTime.equals(other.getLicenseWindowStartDateTime()))) &&
            ((this.licenseWindowEndDateTime==null && other.getLicenseWindowEndDateTime()==null) || 
             (this.licenseWindowEndDateTime!=null &&
              this.licenseWindowEndDateTime.equals(other.getLicenseWindowEndDateTime())));
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
        if (getExternalAssetId() != null) {
            _hashCode += getExternalAssetId().hashCode();
        }
        if (getProviderId() != null) {
            _hashCode += getProviderId().hashCode();
        }
        if (getAvailabilityRegionIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailabilityRegionIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailabilityRegionIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLicenseWindowStartDateTime() != null) {
            _hashCode += getLicenseWindowStartDateTime().hashCode();
        }
        if (getLicenseWindowEndDateTime() != null) {
            _hashCode += getLicenseWindowEndDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetTopBoxCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "SetTopBoxCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalAssetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "externalAssetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "providerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availabilityRegionIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "availabilityRegionIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseWindowStartDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "licenseWindowStartDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseWindowEndDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "licenseWindowEndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
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
