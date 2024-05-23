// Copyright 2023 Google LLC
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
 * DaiEncodingProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202311;


/**
 * A {@link DaiEncodingProfile} contains data about a publisher's
 * encoding profiles. Ad Manager
 *             Dynamic Ad Insertion (DAI) uses the profile information
 * about the content to select an
 *             appropriate ad transcode to play for the particular video.
 */
public class DaiEncodingProfile  implements java.io.Serializable {
    /* The unique ID of the {@link DaiEncodingProfile}. This value
     * is read-only and is assigned by
     *                 Google. */
    private java.lang.Long id;

    /* The name of the {@link DaiEncodingProfile}. This value is required
     * to create an encoding
     *                 profile and may be at most 64 characters. The name
     * field can contain alphanumeric characters
     *                 and symbols other than the following: ", ', =, !,
     * +, #, *, ~, ;, ^, (, ), <, >, [, ], the white
     *                 space character. */
    private java.lang.String name;

    /* The status of this {@link DaiEncodingProfile}.
     *                 
     *                 <p>DAI encoding profiles are created in the {@link
     * DaiEncodingProfileStatus#ACTIVE} state. The
     *                 status can only be modified through the {@link
     *                 DaiEncodingProfileService#performDaiEncodingProfileAction}
     * method.
     *                 
     *                 <p>Only active profiles will be allowed to be associated
     * with live streams. */
    private com.google.api.ads.admanager.axis.v202311.DaiEncodingProfileStatus status;

    /* The variant playlist type that this {@link DaiEncodingProfile}
     * represents. */
    private com.google.api.ads.admanager.axis.v202311.VariantType variantType;

    /* The digital container type of the underlying media. This is
     * required for {@code MEDIA} and
     *                 {@code IFRAME} variant types. */
    private com.google.api.ads.admanager.axis.v202311.ContainerType containerType;

    /* Information about the video media, if present. This field will
     * only be set if the media
     *                 contains video, or is an {@code IFRAME} variant type. */
    private com.google.api.ads.admanager.axis.v202311.VideoSettings videoSettings;

    /* Information about the audio media, if present. This field will
     * only be set if the media
     *                 contains audio. Only {@code MEDIA} and {@code IFRAME}
     * variant types can set audio. */
    private com.google.api.ads.admanager.axis.v202311.AudioSettings audioSettings;

    /* Whether to allow the creation or modification of this {@link
     * DaiEncodingProfile} if its
     *                 settings do not match one of the encoding profiles
     * that is supported by Google DAI.
     *                 
     *                 <p>Note that this field will not persist on the encoding
     * profile itself, and will only affect
     *                 the current request. */
    private java.lang.Boolean persistUnmatchedProfiles;

    public DaiEncodingProfile() {
    }

    public DaiEncodingProfile(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.admanager.axis.v202311.DaiEncodingProfileStatus status,
           com.google.api.ads.admanager.axis.v202311.VariantType variantType,
           com.google.api.ads.admanager.axis.v202311.ContainerType containerType,
           com.google.api.ads.admanager.axis.v202311.VideoSettings videoSettings,
           com.google.api.ads.admanager.axis.v202311.AudioSettings audioSettings,
           java.lang.Boolean persistUnmatchedProfiles) {
           this.id = id;
           this.name = name;
           this.status = status;
           this.variantType = variantType;
           this.containerType = containerType;
           this.videoSettings = videoSettings;
           this.audioSettings = audioSettings;
           this.persistUnmatchedProfiles = persistUnmatchedProfiles;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("audioSettings", getAudioSettings())
            .add("containerType", getContainerType())
            .add("id", getId())
            .add("name", getName())
            .add("persistUnmatchedProfiles", getPersistUnmatchedProfiles())
            .add("status", getStatus())
            .add("variantType", getVariantType())
            .add("videoSettings", getVideoSettings())
            .toString();
    }

    /**
     * Gets the id value for this DaiEncodingProfile.
     * 
     * @return id   * The unique ID of the {@link DaiEncodingProfile}. This value
     * is read-only and is assigned by
     *                 Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this DaiEncodingProfile.
     * 
     * @param id   * The unique ID of the {@link DaiEncodingProfile}. This value
     * is read-only and is assigned by
     *                 Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this DaiEncodingProfile.
     * 
     * @return name   * The name of the {@link DaiEncodingProfile}. This value is required
     * to create an encoding
     *                 profile and may be at most 64 characters. The name
     * field can contain alphanumeric characters
     *                 and symbols other than the following: ", ', =, !,
     * +, #, *, ~, ;, ^, (, ), <, >, [, ], the white
     *                 space character.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DaiEncodingProfile.
     * 
     * @param name   * The name of the {@link DaiEncodingProfile}. This value is required
     * to create an encoding
     *                 profile and may be at most 64 characters. The name
     * field can contain alphanumeric characters
     *                 and symbols other than the following: ", ', =, !,
     * +, #, *, ~, ;, ^, (, ), <, >, [, ], the white
     *                 space character.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this DaiEncodingProfile.
     * 
     * @return status   * The status of this {@link DaiEncodingProfile}.
     *                 
     *                 <p>DAI encoding profiles are created in the {@link
     * DaiEncodingProfileStatus#ACTIVE} state. The
     *                 status can only be modified through the {@link
     *                 DaiEncodingProfileService#performDaiEncodingProfileAction}
     * method.
     *                 
     *                 <p>Only active profiles will be allowed to be associated
     * with live streams.
     */
    public com.google.api.ads.admanager.axis.v202311.DaiEncodingProfileStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DaiEncodingProfile.
     * 
     * @param status   * The status of this {@link DaiEncodingProfile}.
     *                 
     *                 <p>DAI encoding profiles are created in the {@link
     * DaiEncodingProfileStatus#ACTIVE} state. The
     *                 status can only be modified through the {@link
     *                 DaiEncodingProfileService#performDaiEncodingProfileAction}
     * method.
     *                 
     *                 <p>Only active profiles will be allowed to be associated
     * with live streams.
     */
    public void setStatus(com.google.api.ads.admanager.axis.v202311.DaiEncodingProfileStatus status) {
        this.status = status;
    }


    /**
     * Gets the variantType value for this DaiEncodingProfile.
     * 
     * @return variantType   * The variant playlist type that this {@link DaiEncodingProfile}
     * represents.
     */
    public com.google.api.ads.admanager.axis.v202311.VariantType getVariantType() {
        return variantType;
    }


    /**
     * Sets the variantType value for this DaiEncodingProfile.
     * 
     * @param variantType   * The variant playlist type that this {@link DaiEncodingProfile}
     * represents.
     */
    public void setVariantType(com.google.api.ads.admanager.axis.v202311.VariantType variantType) {
        this.variantType = variantType;
    }


    /**
     * Gets the containerType value for this DaiEncodingProfile.
     * 
     * @return containerType   * The digital container type of the underlying media. This is
     * required for {@code MEDIA} and
     *                 {@code IFRAME} variant types.
     */
    public com.google.api.ads.admanager.axis.v202311.ContainerType getContainerType() {
        return containerType;
    }


    /**
     * Sets the containerType value for this DaiEncodingProfile.
     * 
     * @param containerType   * The digital container type of the underlying media. This is
     * required for {@code MEDIA} and
     *                 {@code IFRAME} variant types.
     */
    public void setContainerType(com.google.api.ads.admanager.axis.v202311.ContainerType containerType) {
        this.containerType = containerType;
    }


    /**
     * Gets the videoSettings value for this DaiEncodingProfile.
     * 
     * @return videoSettings   * Information about the video media, if present. This field will
     * only be set if the media
     *                 contains video, or is an {@code IFRAME} variant type.
     */
    public com.google.api.ads.admanager.axis.v202311.VideoSettings getVideoSettings() {
        return videoSettings;
    }


    /**
     * Sets the videoSettings value for this DaiEncodingProfile.
     * 
     * @param videoSettings   * Information about the video media, if present. This field will
     * only be set if the media
     *                 contains video, or is an {@code IFRAME} variant type.
     */
    public void setVideoSettings(com.google.api.ads.admanager.axis.v202311.VideoSettings videoSettings) {
        this.videoSettings = videoSettings;
    }


    /**
     * Gets the audioSettings value for this DaiEncodingProfile.
     * 
     * @return audioSettings   * Information about the audio media, if present. This field will
     * only be set if the media
     *                 contains audio. Only {@code MEDIA} and {@code IFRAME}
     * variant types can set audio.
     */
    public com.google.api.ads.admanager.axis.v202311.AudioSettings getAudioSettings() {
        return audioSettings;
    }


    /**
     * Sets the audioSettings value for this DaiEncodingProfile.
     * 
     * @param audioSettings   * Information about the audio media, if present. This field will
     * only be set if the media
     *                 contains audio. Only {@code MEDIA} and {@code IFRAME}
     * variant types can set audio.
     */
    public void setAudioSettings(com.google.api.ads.admanager.axis.v202311.AudioSettings audioSettings) {
        this.audioSettings = audioSettings;
    }


    /**
     * Gets the persistUnmatchedProfiles value for this DaiEncodingProfile.
     * 
     * @return persistUnmatchedProfiles   * Whether to allow the creation or modification of this {@link
     * DaiEncodingProfile} if its
     *                 settings do not match one of the encoding profiles
     * that is supported by Google DAI.
     *                 
     *                 <p>Note that this field will not persist on the encoding
     * profile itself, and will only affect
     *                 the current request.
     */
    public java.lang.Boolean getPersistUnmatchedProfiles() {
        return persistUnmatchedProfiles;
    }


    /**
     * Sets the persistUnmatchedProfiles value for this DaiEncodingProfile.
     * 
     * @param persistUnmatchedProfiles   * Whether to allow the creation or modification of this {@link
     * DaiEncodingProfile} if its
     *                 settings do not match one of the encoding profiles
     * that is supported by Google DAI.
     *                 
     *                 <p>Note that this field will not persist on the encoding
     * profile itself, and will only affect
     *                 the current request.
     */
    public void setPersistUnmatchedProfiles(java.lang.Boolean persistUnmatchedProfiles) {
        this.persistUnmatchedProfiles = persistUnmatchedProfiles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DaiEncodingProfile)) return false;
        DaiEncodingProfile other = (DaiEncodingProfile) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.variantType==null && other.getVariantType()==null) || 
             (this.variantType!=null &&
              this.variantType.equals(other.getVariantType()))) &&
            ((this.containerType==null && other.getContainerType()==null) || 
             (this.containerType!=null &&
              this.containerType.equals(other.getContainerType()))) &&
            ((this.videoSettings==null && other.getVideoSettings()==null) || 
             (this.videoSettings!=null &&
              this.videoSettings.equals(other.getVideoSettings()))) &&
            ((this.audioSettings==null && other.getAudioSettings()==null) || 
             (this.audioSettings!=null &&
              this.audioSettings.equals(other.getAudioSettings()))) &&
            ((this.persistUnmatchedProfiles==null && other.getPersistUnmatchedProfiles()==null) || 
             (this.persistUnmatchedProfiles!=null &&
              this.persistUnmatchedProfiles.equals(other.getPersistUnmatchedProfiles())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getVariantType() != null) {
            _hashCode += getVariantType().hashCode();
        }
        if (getContainerType() != null) {
            _hashCode += getContainerType().hashCode();
        }
        if (getVideoSettings() != null) {
            _hashCode += getVideoSettings().hashCode();
        }
        if (getAudioSettings() != null) {
            _hashCode += getAudioSettings().hashCode();
        }
        if (getPersistUnmatchedProfiles() != null) {
            _hashCode += getPersistUnmatchedProfiles().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DaiEncodingProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "DaiEncodingProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "DaiEncodingProfileStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variantType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "variantType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "VariantType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("containerType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "containerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "ContainerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "videoSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "VideoSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "audioSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "AudioSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistUnmatchedProfiles");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "persistUnmatchedProfiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
