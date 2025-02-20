// Copyright 2025 Google LLC
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
 * Creative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202502;


/**
 * A {@code Creative} represents the media for the ad being served.
 * 
 *             <p>Read more about creatives on the <a
 *             href="https://support.google.com/admanager/answer/3185155">Ad
 * Manager Help Center</a>.
 */
public abstract class Creative  implements java.io.Serializable {
    /* The ID of the advertiser that owns the creative. This attribute
     * is required. */
    private java.lang.Long advertiserId;

    /* Uniquely identifies the {@code Creative}. This value is read-only
     * and is assigned by Google
     *                 when the creative is created. This attribute is required
     * for updates. */
    private java.lang.Long id;

    /* The name of the creative. This attribute is required and has
     * a maximum length of 255
     *                 characters. */
    private java.lang.String name;

    /* The {@link Size} of the creative. This attribute is required
     * for creation and then is
     *                 read-only. */
    private com.google.api.ads.admanager.axis.v202502.Size size;

    /* The URL of the creative for previewing the media. This attribute
     * is read-only and is assigned
     *                 by Google when a creative is created. */
    private java.lang.String previewUrl;

    /* Set of policy labels detected for this creative.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202502.CreativePolicyViolation[] policyLabels;

    /* The set of labels applied to this creative. */
    private com.google.api.ads.admanager.axis.v202502.AppliedLabel[] appliedLabels;

    /* The date and time this creative was last modified. */
    private com.google.api.ads.admanager.axis.v202502.DateTime lastModifiedDateTime;

    /* The values of the custom fields associated with this creative. */
    private com.google.api.ads.admanager.axis.v202502.BaseCustomFieldValue[] customFieldValues;

    /* The third party companies associated with this creative.
     *                 
     *                 <p>This is distinct from any associated companies
     * that Google may detect programmatically. */
    private com.google.api.ads.admanager.axis.v202502.ThirdPartyDataDeclaration thirdPartyDataDeclaration;

    /* Whether the creative has ad badging enabled.
     *                 
     *                 <p>Defaults to false for {@code CreativeType.VAST_REDIRECT},
     * {@code CreativeType.THIRD_PARTY},
     *                 {@code CreativeType.AUDIO_VAST_REDIRECT}, {@code CreativeType.PROGRAMMATIC},
     * {@code
     *                 CreativeType.DFP_MOBILE_CREATIVE}, {@code CreativeType.FLASH_OVERLAY},
     * {@code
     *                 CreativeType.GRAPHICAL_INTERSTITIAL}, {@code CreativeType.LEGACY_DFP_CREATIVE},
     * {@code
     *                 CreativeType.MOBILE_AD_NETWORK_BACKFILL}, {@code CreativeType.MOBILE_VIDEO_INTERSTITIAL},
     * {@code CreativeType.SDK_MEDIATION} and {@code CreativeType.STANDARD_FLASH}
     * creative types.
     *                 
     *                 <p>. Defaults to true for all other creative types. */
    private java.lang.Boolean adBadgingEnabled;

    public Creative() {
    }

    public Creative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.admanager.axis.v202502.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.admanager.axis.v202502.CreativePolicyViolation[] policyLabels,
           com.google.api.ads.admanager.axis.v202502.AppliedLabel[] appliedLabels,
           com.google.api.ads.admanager.axis.v202502.DateTime lastModifiedDateTime,
           com.google.api.ads.admanager.axis.v202502.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.admanager.axis.v202502.ThirdPartyDataDeclaration thirdPartyDataDeclaration,
           java.lang.Boolean adBadgingEnabled) {
           this.advertiserId = advertiserId;
           this.id = id;
           this.name = name;
           this.size = size;
           this.previewUrl = previewUrl;
           this.policyLabels = policyLabels;
           this.appliedLabels = appliedLabels;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.customFieldValues = customFieldValues;
           this.thirdPartyDataDeclaration = thirdPartyDataDeclaration;
           this.adBadgingEnabled = adBadgingEnabled;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adBadgingEnabled", getAdBadgingEnabled())
            .add("advertiserId", getAdvertiserId())
            .add("appliedLabels", getAppliedLabels())
            .add("customFieldValues", getCustomFieldValues())
            .add("id", getId())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("policyLabels", getPolicyLabels())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .add("thirdPartyDataDeclaration", getThirdPartyDataDeclaration())
            .toString();
    }

    /**
     * Gets the advertiserId value for this Creative.
     * 
     * @return advertiserId   * The ID of the advertiser that owns the creative. This attribute
     * is required.
     */
    public java.lang.Long getAdvertiserId() {
        return advertiserId;
    }


    /**
     * Sets the advertiserId value for this Creative.
     * 
     * @param advertiserId   * The ID of the advertiser that owns the creative. This attribute
     * is required.
     */
    public void setAdvertiserId(java.lang.Long advertiserId) {
        this.advertiserId = advertiserId;
    }


    /**
     * Gets the id value for this Creative.
     * 
     * @return id   * Uniquely identifies the {@code Creative}. This value is read-only
     * and is assigned by Google
     *                 when the creative is created. This attribute is required
     * for updates.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Creative.
     * 
     * @param id   * Uniquely identifies the {@code Creative}. This value is read-only
     * and is assigned by Google
     *                 when the creative is created. This attribute is required
     * for updates.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Creative.
     * 
     * @return name   * The name of the creative. This attribute is required and has
     * a maximum length of 255
     *                 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Creative.
     * 
     * @param name   * The name of the creative. This attribute is required and has
     * a maximum length of 255
     *                 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the size value for this Creative.
     * 
     * @return size   * The {@link Size} of the creative. This attribute is required
     * for creation and then is
     *                 read-only.
     */
    public com.google.api.ads.admanager.axis.v202502.Size getSize() {
        return size;
    }


    /**
     * Sets the size value for this Creative.
     * 
     * @param size   * The {@link Size} of the creative. This attribute is required
     * for creation and then is
     *                 read-only.
     */
    public void setSize(com.google.api.ads.admanager.axis.v202502.Size size) {
        this.size = size;
    }


    /**
     * Gets the previewUrl value for this Creative.
     * 
     * @return previewUrl   * The URL of the creative for previewing the media. This attribute
     * is read-only and is assigned
     *                 by Google when a creative is created.
     */
    public java.lang.String getPreviewUrl() {
        return previewUrl;
    }


    /**
     * Sets the previewUrl value for this Creative.
     * 
     * @param previewUrl   * The URL of the creative for previewing the media. This attribute
     * is read-only and is assigned
     *                 by Google when a creative is created.
     */
    public void setPreviewUrl(java.lang.String previewUrl) {
        this.previewUrl = previewUrl;
    }


    /**
     * Gets the policyLabels value for this Creative.
     * 
     * @return policyLabels   * Set of policy labels detected for this creative.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202502.CreativePolicyViolation[] getPolicyLabels() {
        return policyLabels;
    }


    /**
     * Sets the policyLabels value for this Creative.
     * 
     * @param policyLabels   * Set of policy labels detected for this creative.
     *                 This attribute is read-only.
     */
    public void setPolicyLabels(com.google.api.ads.admanager.axis.v202502.CreativePolicyViolation[] policyLabels) {
        this.policyLabels = policyLabels;
    }

    public com.google.api.ads.admanager.axis.v202502.CreativePolicyViolation getPolicyLabels(int i) {
        return this.policyLabels[i];
    }

    public void setPolicyLabels(int i, com.google.api.ads.admanager.axis.v202502.CreativePolicyViolation _value) {
        this.policyLabels[i] = _value;
    }


    /**
     * Gets the appliedLabels value for this Creative.
     * 
     * @return appliedLabels   * The set of labels applied to this creative.
     */
    public com.google.api.ads.admanager.axis.v202502.AppliedLabel[] getAppliedLabels() {
        return appliedLabels;
    }


    /**
     * Sets the appliedLabels value for this Creative.
     * 
     * @param appliedLabels   * The set of labels applied to this creative.
     */
    public void setAppliedLabels(com.google.api.ads.admanager.axis.v202502.AppliedLabel[] appliedLabels) {
        this.appliedLabels = appliedLabels;
    }

    public com.google.api.ads.admanager.axis.v202502.AppliedLabel getAppliedLabels(int i) {
        return this.appliedLabels[i];
    }

    public void setAppliedLabels(int i, com.google.api.ads.admanager.axis.v202502.AppliedLabel _value) {
        this.appliedLabels[i] = _value;
    }


    /**
     * Gets the lastModifiedDateTime value for this Creative.
     * 
     * @return lastModifiedDateTime   * The date and time this creative was last modified.
     */
    public com.google.api.ads.admanager.axis.v202502.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this Creative.
     * 
     * @param lastModifiedDateTime   * The date and time this creative was last modified.
     */
    public void setLastModifiedDateTime(com.google.api.ads.admanager.axis.v202502.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the customFieldValues value for this Creative.
     * 
     * @return customFieldValues   * The values of the custom fields associated with this creative.
     */
    public com.google.api.ads.admanager.axis.v202502.BaseCustomFieldValue[] getCustomFieldValues() {
        return customFieldValues;
    }


    /**
     * Sets the customFieldValues value for this Creative.
     * 
     * @param customFieldValues   * The values of the custom fields associated with this creative.
     */
    public void setCustomFieldValues(com.google.api.ads.admanager.axis.v202502.BaseCustomFieldValue[] customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public com.google.api.ads.admanager.axis.v202502.BaseCustomFieldValue getCustomFieldValues(int i) {
        return this.customFieldValues[i];
    }

    public void setCustomFieldValues(int i, com.google.api.ads.admanager.axis.v202502.BaseCustomFieldValue _value) {
        this.customFieldValues[i] = _value;
    }


    /**
     * Gets the thirdPartyDataDeclaration value for this Creative.
     * 
     * @return thirdPartyDataDeclaration   * The third party companies associated with this creative.
     *                 
     *                 <p>This is distinct from any associated companies
     * that Google may detect programmatically.
     */
    public com.google.api.ads.admanager.axis.v202502.ThirdPartyDataDeclaration getThirdPartyDataDeclaration() {
        return thirdPartyDataDeclaration;
    }


    /**
     * Sets the thirdPartyDataDeclaration value for this Creative.
     * 
     * @param thirdPartyDataDeclaration   * The third party companies associated with this creative.
     *                 
     *                 <p>This is distinct from any associated companies
     * that Google may detect programmatically.
     */
    public void setThirdPartyDataDeclaration(com.google.api.ads.admanager.axis.v202502.ThirdPartyDataDeclaration thirdPartyDataDeclaration) {
        this.thirdPartyDataDeclaration = thirdPartyDataDeclaration;
    }


    /**
     * Gets the adBadgingEnabled value for this Creative.
     * 
     * @return adBadgingEnabled   * Whether the creative has ad badging enabled.
     *                 
     *                 <p>Defaults to false for {@code CreativeType.VAST_REDIRECT},
     * {@code CreativeType.THIRD_PARTY},
     *                 {@code CreativeType.AUDIO_VAST_REDIRECT}, {@code CreativeType.PROGRAMMATIC},
     * {@code
     *                 CreativeType.DFP_MOBILE_CREATIVE}, {@code CreativeType.FLASH_OVERLAY},
     * {@code
     *                 CreativeType.GRAPHICAL_INTERSTITIAL}, {@code CreativeType.LEGACY_DFP_CREATIVE},
     * {@code
     *                 CreativeType.MOBILE_AD_NETWORK_BACKFILL}, {@code CreativeType.MOBILE_VIDEO_INTERSTITIAL},
     * {@code CreativeType.SDK_MEDIATION} and {@code CreativeType.STANDARD_FLASH}
     * creative types.
     *                 
     *                 <p>. Defaults to true for all other creative types.
     */
    public java.lang.Boolean getAdBadgingEnabled() {
        return adBadgingEnabled;
    }


    /**
     * Sets the adBadgingEnabled value for this Creative.
     * 
     * @param adBadgingEnabled   * Whether the creative has ad badging enabled.
     *                 
     *                 <p>Defaults to false for {@code CreativeType.VAST_REDIRECT},
     * {@code CreativeType.THIRD_PARTY},
     *                 {@code CreativeType.AUDIO_VAST_REDIRECT}, {@code CreativeType.PROGRAMMATIC},
     * {@code
     *                 CreativeType.DFP_MOBILE_CREATIVE}, {@code CreativeType.FLASH_OVERLAY},
     * {@code
     *                 CreativeType.GRAPHICAL_INTERSTITIAL}, {@code CreativeType.LEGACY_DFP_CREATIVE},
     * {@code
     *                 CreativeType.MOBILE_AD_NETWORK_BACKFILL}, {@code CreativeType.MOBILE_VIDEO_INTERSTITIAL},
     * {@code CreativeType.SDK_MEDIATION} and {@code CreativeType.STANDARD_FLASH}
     * creative types.
     *                 
     *                 <p>. Defaults to true for all other creative types.
     */
    public void setAdBadgingEnabled(java.lang.Boolean adBadgingEnabled) {
        this.adBadgingEnabled = adBadgingEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Creative)) return false;
        Creative other = (Creative) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.advertiserId==null && other.getAdvertiserId()==null) || 
             (this.advertiserId!=null &&
              this.advertiserId.equals(other.getAdvertiserId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.previewUrl==null && other.getPreviewUrl()==null) || 
             (this.previewUrl!=null &&
              this.previewUrl.equals(other.getPreviewUrl()))) &&
            ((this.policyLabels==null && other.getPolicyLabels()==null) || 
             (this.policyLabels!=null &&
              java.util.Arrays.equals(this.policyLabels, other.getPolicyLabels()))) &&
            ((this.appliedLabels==null && other.getAppliedLabels()==null) || 
             (this.appliedLabels!=null &&
              java.util.Arrays.equals(this.appliedLabels, other.getAppliedLabels()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.customFieldValues==null && other.getCustomFieldValues()==null) || 
             (this.customFieldValues!=null &&
              java.util.Arrays.equals(this.customFieldValues, other.getCustomFieldValues()))) &&
            ((this.thirdPartyDataDeclaration==null && other.getThirdPartyDataDeclaration()==null) || 
             (this.thirdPartyDataDeclaration!=null &&
              this.thirdPartyDataDeclaration.equals(other.getThirdPartyDataDeclaration()))) &&
            ((this.adBadgingEnabled==null && other.getAdBadgingEnabled()==null) || 
             (this.adBadgingEnabled!=null &&
              this.adBadgingEnabled.equals(other.getAdBadgingEnabled())));
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
        if (getAdvertiserId() != null) {
            _hashCode += getAdvertiserId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getPreviewUrl() != null) {
            _hashCode += getPreviewUrl().hashCode();
        }
        if (getPolicyLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getCustomFieldValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFieldValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFieldValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThirdPartyDataDeclaration() != null) {
            _hashCode += getThirdPartyDataDeclaration().hashCode();
        }
        if (getAdBadgingEnabled() != null) {
            _hashCode += getAdBadgingEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Creative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "Creative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "advertiserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previewUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "previewUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "policyLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "CreativePolicyViolation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "appliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "customFieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "BaseCustomFieldValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyDataDeclaration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "thirdPartyDataDeclaration"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "ThirdPartyDataDeclaration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adBadgingEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "adBadgingEnabled"));
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
