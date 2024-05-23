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
 * SecurityPolicySettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202308;


/**
 * A set of security requirements to authenticate against in order
 * to access video content.
 *             Different locations (e.g. different CDNs) can have different
 * security policies.
 */
public class SecurityPolicySettings  implements java.io.Serializable {
    /* Type of security policy. This determines which other fields
     * should be populated. This value is
     *                 required for a valid security policy. */
    private com.google.api.ads.admanager.axis.v202308.SecurityPolicyType securityPolicyType;

    /* Shared security key used to generate the Akamai HMAC token
     * for authenticating requests. This
     *                 field is only applicable when the value of {@link
     * #securityPolicyType} is equal to {@link
     *                 SecurityPolicyType#AKAMAI} and will be set to null
     * otherwise.
     *                 
     *                 <p>This field is required when the {@link CdnConfiguration#cdnConfigurationType}
     * is equal to
     *                 {@link CdnConfigurationType#LIVE_STREAM_SOURCE_CONTENT}
     * and this {@link SecurityPolicyDto} is
     *                 being configured for {@link SourceContentConfiguration#ingestSettings}. */
    private java.lang.String tokenAuthenticationKey;

    /* Whether the segment URLs should be signed using the {@link
     * #tokenAuthenticationKey} on the
     *                 server. This is only applicable for delivery media
     * locations that have token authentication
     *                 enabled. */
    private java.lang.Boolean disableServerSideUrlSigning;

    /* The type of origin forwarding used to support Akamai authentication
     * policies for the master
     *                 playlist. This field is not applicable to ingest locations,
     * and is only applicable to delivery
     *                 media locations with the {@link #securityPolicyType}
     * set to {@link SecurityPolicyType#AKAMAI}.
     *                 If set elsewhere it will be reset to null. */
    private com.google.api.ads.admanager.axis.v202308.OriginForwardingType originForwardingType;

    /* The origin path prefix provided by the publisher for the master
     * playlist. This field is only
     *                 applicable for delivery media locations with the value
     * of {@link #originForwardingType} set to
     *                 {@link OriginForwardingType#CONVENTIONAL}, and will
     * be set to null otherwise. */
    private java.lang.String originPathPrefix;

    /* The type of origin forwarding used to support Akamai authentication
     * policies for media
     *                 playlists. This setting can only be used with CDN
     * configurations with a {@code
     *                 cdnConfigurationType} of {@link CdnConfigurationType#LIVE_STREAM_SOURCE_CONTENT},
     * is not
     *                 applicable to ingest locations, and is only applicable
     * to delivery media locations with the
     *                 {@link #securityPolicyType} set to {@link SecurityPolicyType#AKAMAI}.
     * Valid options are {@code
     *                 OriginForwardingType#NONE} or {@code OriginForwardingType#ORIGIN_PATH}.
     * 
     *                 <p>This setting can only be used with CDN configurations
     * with a {@code cdnConfigurationType} of
     *                 {@link CdnConfigurationType#LIVE_STREAM_SOURCE_CONTENT}. */
    private com.google.api.ads.admanager.axis.v202308.OriginForwardingType mediaPlaylistOriginForwardingType;

    /* The origin path prefix provided by the publisher for the media
     * playlists. This field is only
     *                 applicable for delivery media locations with the value
     * of {@link
     *                 #mediaPlaylistOriginForwardingType} set to {@link
     * OriginForwardingType#CONVENTIONAL}, and will
     *                 be set to null otherwise. */
    private java.lang.String mediaPlaylistOriginPathPrefix;

    /* The name of the EdgeCacheKeyset on the Media CDN configuration
     * that will be used to validate
     *                 signed requests from DAI to ingest content. */
    private java.lang.String keysetName;

    /* The amount of time in seconds for which a request signed with
     * a short token will be valid. Only
     *                 required if signedRequestMaximumExpirationTtl has
     * been set in the Media CDN configuration. */
    private java.lang.Long signedRequestExpirationTtlSeconds;

    public SecurityPolicySettings() {
    }

    public SecurityPolicySettings(
           com.google.api.ads.admanager.axis.v202308.SecurityPolicyType securityPolicyType,
           java.lang.String tokenAuthenticationKey,
           java.lang.Boolean disableServerSideUrlSigning,
           com.google.api.ads.admanager.axis.v202308.OriginForwardingType originForwardingType,
           java.lang.String originPathPrefix,
           com.google.api.ads.admanager.axis.v202308.OriginForwardingType mediaPlaylistOriginForwardingType,
           java.lang.String mediaPlaylistOriginPathPrefix,
           java.lang.String keysetName,
           java.lang.Long signedRequestExpirationTtlSeconds) {
           this.securityPolicyType = securityPolicyType;
           this.tokenAuthenticationKey = tokenAuthenticationKey;
           this.disableServerSideUrlSigning = disableServerSideUrlSigning;
           this.originForwardingType = originForwardingType;
           this.originPathPrefix = originPathPrefix;
           this.mediaPlaylistOriginForwardingType = mediaPlaylistOriginForwardingType;
           this.mediaPlaylistOriginPathPrefix = mediaPlaylistOriginPathPrefix;
           this.keysetName = keysetName;
           this.signedRequestExpirationTtlSeconds = signedRequestExpirationTtlSeconds;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("disableServerSideUrlSigning", getDisableServerSideUrlSigning())
            .add("keysetName", getKeysetName())
            .add("mediaPlaylistOriginForwardingType", getMediaPlaylistOriginForwardingType())
            .add("mediaPlaylistOriginPathPrefix", getMediaPlaylistOriginPathPrefix())
            .add("originForwardingType", getOriginForwardingType())
            .add("originPathPrefix", getOriginPathPrefix())
            .add("securityPolicyType", getSecurityPolicyType())
            .add("signedRequestExpirationTtlSeconds", getSignedRequestExpirationTtlSeconds())
            .add("tokenAuthenticationKey", getTokenAuthenticationKey())
            .toString();
    }

    /**
     * Gets the securityPolicyType value for this SecurityPolicySettings.
     * 
     * @return securityPolicyType   * Type of security policy. This determines which other fields
     * should be populated. This value is
     *                 required for a valid security policy.
     */
    public com.google.api.ads.admanager.axis.v202308.SecurityPolicyType getSecurityPolicyType() {
        return securityPolicyType;
    }


    /**
     * Sets the securityPolicyType value for this SecurityPolicySettings.
     * 
     * @param securityPolicyType   * Type of security policy. This determines which other fields
     * should be populated. This value is
     *                 required for a valid security policy.
     */
    public void setSecurityPolicyType(com.google.api.ads.admanager.axis.v202308.SecurityPolicyType securityPolicyType) {
        this.securityPolicyType = securityPolicyType;
    }


    /**
     * Gets the tokenAuthenticationKey value for this SecurityPolicySettings.
     * 
     * @return tokenAuthenticationKey   * Shared security key used to generate the Akamai HMAC token
     * for authenticating requests. This
     *                 field is only applicable when the value of {@link
     * #securityPolicyType} is equal to {@link
     *                 SecurityPolicyType#AKAMAI} and will be set to null
     * otherwise.
     *                 
     *                 <p>This field is required when the {@link CdnConfiguration#cdnConfigurationType}
     * is equal to
     *                 {@link CdnConfigurationType#LIVE_STREAM_SOURCE_CONTENT}
     * and this {@link SecurityPolicyDto} is
     *                 being configured for {@link SourceContentConfiguration#ingestSettings}.
     */
    public java.lang.String getTokenAuthenticationKey() {
        return tokenAuthenticationKey;
    }


    /**
     * Sets the tokenAuthenticationKey value for this SecurityPolicySettings.
     * 
     * @param tokenAuthenticationKey   * Shared security key used to generate the Akamai HMAC token
     * for authenticating requests. This
     *                 field is only applicable when the value of {@link
     * #securityPolicyType} is equal to {@link
     *                 SecurityPolicyType#AKAMAI} and will be set to null
     * otherwise.
     *                 
     *                 <p>This field is required when the {@link CdnConfiguration#cdnConfigurationType}
     * is equal to
     *                 {@link CdnConfigurationType#LIVE_STREAM_SOURCE_CONTENT}
     * and this {@link SecurityPolicyDto} is
     *                 being configured for {@link SourceContentConfiguration#ingestSettings}.
     */
    public void setTokenAuthenticationKey(java.lang.String tokenAuthenticationKey) {
        this.tokenAuthenticationKey = tokenAuthenticationKey;
    }


    /**
     * Gets the disableServerSideUrlSigning value for this SecurityPolicySettings.
     * 
     * @return disableServerSideUrlSigning   * Whether the segment URLs should be signed using the {@link
     * #tokenAuthenticationKey} on the
     *                 server. This is only applicable for delivery media
     * locations that have token authentication
     *                 enabled.
     */
    public java.lang.Boolean getDisableServerSideUrlSigning() {
        return disableServerSideUrlSigning;
    }


    /**
     * Sets the disableServerSideUrlSigning value for this SecurityPolicySettings.
     * 
     * @param disableServerSideUrlSigning   * Whether the segment URLs should be signed using the {@link
     * #tokenAuthenticationKey} on the
     *                 server. This is only applicable for delivery media
     * locations that have token authentication
     *                 enabled.
     */
    public void setDisableServerSideUrlSigning(java.lang.Boolean disableServerSideUrlSigning) {
        this.disableServerSideUrlSigning = disableServerSideUrlSigning;
    }


    /**
     * Gets the originForwardingType value for this SecurityPolicySettings.
     * 
     * @return originForwardingType   * The type of origin forwarding used to support Akamai authentication
     * policies for the master
     *                 playlist. This field is not applicable to ingest locations,
     * and is only applicable to delivery
     *                 media locations with the {@link #securityPolicyType}
     * set to {@link SecurityPolicyType#AKAMAI}.
     *                 If set elsewhere it will be reset to null.
     */
    public com.google.api.ads.admanager.axis.v202308.OriginForwardingType getOriginForwardingType() {
        return originForwardingType;
    }


    /**
     * Sets the originForwardingType value for this SecurityPolicySettings.
     * 
     * @param originForwardingType   * The type of origin forwarding used to support Akamai authentication
     * policies for the master
     *                 playlist. This field is not applicable to ingest locations,
     * and is only applicable to delivery
     *                 media locations with the {@link #securityPolicyType}
     * set to {@link SecurityPolicyType#AKAMAI}.
     *                 If set elsewhere it will be reset to null.
     */
    public void setOriginForwardingType(com.google.api.ads.admanager.axis.v202308.OriginForwardingType originForwardingType) {
        this.originForwardingType = originForwardingType;
    }


    /**
     * Gets the originPathPrefix value for this SecurityPolicySettings.
     * 
     * @return originPathPrefix   * The origin path prefix provided by the publisher for the master
     * playlist. This field is only
     *                 applicable for delivery media locations with the value
     * of {@link #originForwardingType} set to
     *                 {@link OriginForwardingType#CONVENTIONAL}, and will
     * be set to null otherwise.
     */
    public java.lang.String getOriginPathPrefix() {
        return originPathPrefix;
    }


    /**
     * Sets the originPathPrefix value for this SecurityPolicySettings.
     * 
     * @param originPathPrefix   * The origin path prefix provided by the publisher for the master
     * playlist. This field is only
     *                 applicable for delivery media locations with the value
     * of {@link #originForwardingType} set to
     *                 {@link OriginForwardingType#CONVENTIONAL}, and will
     * be set to null otherwise.
     */
    public void setOriginPathPrefix(java.lang.String originPathPrefix) {
        this.originPathPrefix = originPathPrefix;
    }


    /**
     * Gets the mediaPlaylistOriginForwardingType value for this SecurityPolicySettings.
     * 
     * @return mediaPlaylistOriginForwardingType   * The type of origin forwarding used to support Akamai authentication
     * policies for media
     *                 playlists. This setting can only be used with CDN
     * configurations with a {@code
     *                 cdnConfigurationType} of {@link CdnConfigurationType#LIVE_STREAM_SOURCE_CONTENT},
     * is not
     *                 applicable to ingest locations, and is only applicable
     * to delivery media locations with the
     *                 {@link #securityPolicyType} set to {@link SecurityPolicyType#AKAMAI}.
     * Valid options are {@code
     *                 OriginForwardingType#NONE} or {@code OriginForwardingType#ORIGIN_PATH}.
     * 
     *                 <p>This setting can only be used with CDN configurations
     * with a {@code cdnConfigurationType} of
     *                 {@link CdnConfigurationType#LIVE_STREAM_SOURCE_CONTENT}.
     */
    public com.google.api.ads.admanager.axis.v202308.OriginForwardingType getMediaPlaylistOriginForwardingType() {
        return mediaPlaylistOriginForwardingType;
    }


    /**
     * Sets the mediaPlaylistOriginForwardingType value for this SecurityPolicySettings.
     * 
     * @param mediaPlaylistOriginForwardingType   * The type of origin forwarding used to support Akamai authentication
     * policies for media
     *                 playlists. This setting can only be used with CDN
     * configurations with a {@code
     *                 cdnConfigurationType} of {@link CdnConfigurationType#LIVE_STREAM_SOURCE_CONTENT},
     * is not
     *                 applicable to ingest locations, and is only applicable
     * to delivery media locations with the
     *                 {@link #securityPolicyType} set to {@link SecurityPolicyType#AKAMAI}.
     * Valid options are {@code
     *                 OriginForwardingType#NONE} or {@code OriginForwardingType#ORIGIN_PATH}.
     * 
     *                 <p>This setting can only be used with CDN configurations
     * with a {@code cdnConfigurationType} of
     *                 {@link CdnConfigurationType#LIVE_STREAM_SOURCE_CONTENT}.
     */
    public void setMediaPlaylistOriginForwardingType(com.google.api.ads.admanager.axis.v202308.OriginForwardingType mediaPlaylistOriginForwardingType) {
        this.mediaPlaylistOriginForwardingType = mediaPlaylistOriginForwardingType;
    }


    /**
     * Gets the mediaPlaylistOriginPathPrefix value for this SecurityPolicySettings.
     * 
     * @return mediaPlaylistOriginPathPrefix   * The origin path prefix provided by the publisher for the media
     * playlists. This field is only
     *                 applicable for delivery media locations with the value
     * of {@link
     *                 #mediaPlaylistOriginForwardingType} set to {@link
     * OriginForwardingType#CONVENTIONAL}, and will
     *                 be set to null otherwise.
     */
    public java.lang.String getMediaPlaylistOriginPathPrefix() {
        return mediaPlaylistOriginPathPrefix;
    }


    /**
     * Sets the mediaPlaylistOriginPathPrefix value for this SecurityPolicySettings.
     * 
     * @param mediaPlaylistOriginPathPrefix   * The origin path prefix provided by the publisher for the media
     * playlists. This field is only
     *                 applicable for delivery media locations with the value
     * of {@link
     *                 #mediaPlaylistOriginForwardingType} set to {@link
     * OriginForwardingType#CONVENTIONAL}, and will
     *                 be set to null otherwise.
     */
    public void setMediaPlaylistOriginPathPrefix(java.lang.String mediaPlaylistOriginPathPrefix) {
        this.mediaPlaylistOriginPathPrefix = mediaPlaylistOriginPathPrefix;
    }


    /**
     * Gets the keysetName value for this SecurityPolicySettings.
     * 
     * @return keysetName   * The name of the EdgeCacheKeyset on the Media CDN configuration
     * that will be used to validate
     *                 signed requests from DAI to ingest content.
     */
    public java.lang.String getKeysetName() {
        return keysetName;
    }


    /**
     * Sets the keysetName value for this SecurityPolicySettings.
     * 
     * @param keysetName   * The name of the EdgeCacheKeyset on the Media CDN configuration
     * that will be used to validate
     *                 signed requests from DAI to ingest content.
     */
    public void setKeysetName(java.lang.String keysetName) {
        this.keysetName = keysetName;
    }


    /**
     * Gets the signedRequestExpirationTtlSeconds value for this SecurityPolicySettings.
     * 
     * @return signedRequestExpirationTtlSeconds   * The amount of time in seconds for which a request signed with
     * a short token will be valid. Only
     *                 required if signedRequestMaximumExpirationTtl has
     * been set in the Media CDN configuration.
     */
    public java.lang.Long getSignedRequestExpirationTtlSeconds() {
        return signedRequestExpirationTtlSeconds;
    }


    /**
     * Sets the signedRequestExpirationTtlSeconds value for this SecurityPolicySettings.
     * 
     * @param signedRequestExpirationTtlSeconds   * The amount of time in seconds for which a request signed with
     * a short token will be valid. Only
     *                 required if signedRequestMaximumExpirationTtl has
     * been set in the Media CDN configuration.
     */
    public void setSignedRequestExpirationTtlSeconds(java.lang.Long signedRequestExpirationTtlSeconds) {
        this.signedRequestExpirationTtlSeconds = signedRequestExpirationTtlSeconds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityPolicySettings)) return false;
        SecurityPolicySettings other = (SecurityPolicySettings) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.securityPolicyType==null && other.getSecurityPolicyType()==null) || 
             (this.securityPolicyType!=null &&
              this.securityPolicyType.equals(other.getSecurityPolicyType()))) &&
            ((this.tokenAuthenticationKey==null && other.getTokenAuthenticationKey()==null) || 
             (this.tokenAuthenticationKey!=null &&
              this.tokenAuthenticationKey.equals(other.getTokenAuthenticationKey()))) &&
            ((this.disableServerSideUrlSigning==null && other.getDisableServerSideUrlSigning()==null) || 
             (this.disableServerSideUrlSigning!=null &&
              this.disableServerSideUrlSigning.equals(other.getDisableServerSideUrlSigning()))) &&
            ((this.originForwardingType==null && other.getOriginForwardingType()==null) || 
             (this.originForwardingType!=null &&
              this.originForwardingType.equals(other.getOriginForwardingType()))) &&
            ((this.originPathPrefix==null && other.getOriginPathPrefix()==null) || 
             (this.originPathPrefix!=null &&
              this.originPathPrefix.equals(other.getOriginPathPrefix()))) &&
            ((this.mediaPlaylistOriginForwardingType==null && other.getMediaPlaylistOriginForwardingType()==null) || 
             (this.mediaPlaylistOriginForwardingType!=null &&
              this.mediaPlaylistOriginForwardingType.equals(other.getMediaPlaylistOriginForwardingType()))) &&
            ((this.mediaPlaylistOriginPathPrefix==null && other.getMediaPlaylistOriginPathPrefix()==null) || 
             (this.mediaPlaylistOriginPathPrefix!=null &&
              this.mediaPlaylistOriginPathPrefix.equals(other.getMediaPlaylistOriginPathPrefix()))) &&
            ((this.keysetName==null && other.getKeysetName()==null) || 
             (this.keysetName!=null &&
              this.keysetName.equals(other.getKeysetName()))) &&
            ((this.signedRequestExpirationTtlSeconds==null && other.getSignedRequestExpirationTtlSeconds()==null) || 
             (this.signedRequestExpirationTtlSeconds!=null &&
              this.signedRequestExpirationTtlSeconds.equals(other.getSignedRequestExpirationTtlSeconds())));
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
        if (getSecurityPolicyType() != null) {
            _hashCode += getSecurityPolicyType().hashCode();
        }
        if (getTokenAuthenticationKey() != null) {
            _hashCode += getTokenAuthenticationKey().hashCode();
        }
        if (getDisableServerSideUrlSigning() != null) {
            _hashCode += getDisableServerSideUrlSigning().hashCode();
        }
        if (getOriginForwardingType() != null) {
            _hashCode += getOriginForwardingType().hashCode();
        }
        if (getOriginPathPrefix() != null) {
            _hashCode += getOriginPathPrefix().hashCode();
        }
        if (getMediaPlaylistOriginForwardingType() != null) {
            _hashCode += getMediaPlaylistOriginForwardingType().hashCode();
        }
        if (getMediaPlaylistOriginPathPrefix() != null) {
            _hashCode += getMediaPlaylistOriginPathPrefix().hashCode();
        }
        if (getKeysetName() != null) {
            _hashCode += getKeysetName().hashCode();
        }
        if (getSignedRequestExpirationTtlSeconds() != null) {
            _hashCode += getSignedRequestExpirationTtlSeconds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecurityPolicySettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "SecurityPolicySettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityPolicyType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "securityPolicyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "SecurityPolicyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenAuthenticationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "tokenAuthenticationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableServerSideUrlSigning");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "disableServerSideUrlSigning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originForwardingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "originForwardingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "OriginForwardingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originPathPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "originPathPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaPlaylistOriginForwardingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "mediaPlaylistOriginForwardingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "OriginForwardingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaPlaylistOriginPathPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "mediaPlaylistOriginPathPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keysetName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "keysetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signedRequestExpirationTtlSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "signedRequestExpirationTtlSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
