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
 * MobileApplication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A mobile application that has been added to or "claimed" by the
 * network to be used for
 *             targeting purposes.
 *             These mobile apps can come from various app stores.
 */
public class MobileApplication  implements java.io.Serializable {
    /* Uniquely identifies the mobile application. This attribute
     * is read-only and is
     *                 assigned by Google when a mobile application is claimed. */
    private java.lang.Long id;

    /* The display name of the mobile application. This attribute
     * is required and
     *                 has a maximum length of 255 characters. */
    private java.lang.String displayName;

    /* The app store ID of the app to claim. This attribute is required
     * for creation and
     *                 then is read-only. */
    private java.lang.String appStoreId;

    /* The app store the mobile application belongs to. This attribute
     * is required for
     *                 creation and then is read-only. */
    private com.google.api.ads.dfp.axis.v201802.MobileApplicationStore appStore;

    /* The archival status of the mobile application. This attribute
     * is read-only. */
    private java.lang.Boolean isArchived;

    /* The name of the application on the app store. This attribute
     * is read-only
     *                 and populated by Google. */
    private java.lang.String appStoreName;

    /* The name of the developer of the mobile application. This attribute
     * is read-only
     *                 and populated by Google. */
    private java.lang.String developerName;

    /* The platform the mobile application runs on. This attribute
     * is read-only
     *                 and populated by Google. */
    private com.google.api.ads.dfp.axis.v201802.MobileApplicationPlatform platform;

    /* Whether the mobile application is free on the app store it
     * belongs to.
     *                 This attribute is read-only and populated by Google. */
    private java.lang.Boolean isFree;

    /* The download URL of the mobile application on the app store
     * it belongs to.
     *                 This attribute is read-only and populated by Google. */
    private java.lang.String downloadUrl;

    public MobileApplication() {
    }

    public MobileApplication(
           java.lang.Long id,
           java.lang.String displayName,
           java.lang.String appStoreId,
           com.google.api.ads.dfp.axis.v201802.MobileApplicationStore appStore,
           java.lang.Boolean isArchived,
           java.lang.String appStoreName,
           java.lang.String developerName,
           com.google.api.ads.dfp.axis.v201802.MobileApplicationPlatform platform,
           java.lang.Boolean isFree,
           java.lang.String downloadUrl) {
           this.id = id;
           this.displayName = displayName;
           this.appStoreId = appStoreId;
           this.appStore = appStore;
           this.isArchived = isArchived;
           this.appStoreName = appStoreName;
           this.developerName = developerName;
           this.platform = platform;
           this.isFree = isFree;
           this.downloadUrl = downloadUrl;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("appStore", getAppStore())
            .add("appStoreId", getAppStoreId())
            .add("appStoreName", getAppStoreName())
            .add("developerName", getDeveloperName())
            .add("displayName", getDisplayName())
            .add("downloadUrl", getDownloadUrl())
            .add("id", getId())
            .add("isArchived", getIsArchived())
            .add("isFree", getIsFree())
            .add("platform", getPlatform())
            .toString();
    }

    /**
     * Gets the id value for this MobileApplication.
     * 
     * @return id   * Uniquely identifies the mobile application. This attribute
     * is read-only and is
     *                 assigned by Google when a mobile application is claimed.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this MobileApplication.
     * 
     * @param id   * Uniquely identifies the mobile application. This attribute
     * is read-only and is
     *                 assigned by Google when a mobile application is claimed.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the displayName value for this MobileApplication.
     * 
     * @return displayName   * The display name of the mobile application. This attribute
     * is required and
     *                 has a maximum length of 255 characters.
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this MobileApplication.
     * 
     * @param displayName   * The display name of the mobile application. This attribute
     * is required and
     *                 has a maximum length of 255 characters.
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the appStoreId value for this MobileApplication.
     * 
     * @return appStoreId   * The app store ID of the app to claim. This attribute is required
     * for creation and
     *                 then is read-only.
     */
    public java.lang.String getAppStoreId() {
        return appStoreId;
    }


    /**
     * Sets the appStoreId value for this MobileApplication.
     * 
     * @param appStoreId   * The app store ID of the app to claim. This attribute is required
     * for creation and
     *                 then is read-only.
     */
    public void setAppStoreId(java.lang.String appStoreId) {
        this.appStoreId = appStoreId;
    }


    /**
     * Gets the appStore value for this MobileApplication.
     * 
     * @return appStore   * The app store the mobile application belongs to. This attribute
     * is required for
     *                 creation and then is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.MobileApplicationStore getAppStore() {
        return appStore;
    }


    /**
     * Sets the appStore value for this MobileApplication.
     * 
     * @param appStore   * The app store the mobile application belongs to. This attribute
     * is required for
     *                 creation and then is read-only.
     */
    public void setAppStore(com.google.api.ads.dfp.axis.v201802.MobileApplicationStore appStore) {
        this.appStore = appStore;
    }


    /**
     * Gets the isArchived value for this MobileApplication.
     * 
     * @return isArchived   * The archival status of the mobile application. This attribute
     * is read-only.
     */
    public java.lang.Boolean getIsArchived() {
        return isArchived;
    }


    /**
     * Sets the isArchived value for this MobileApplication.
     * 
     * @param isArchived   * The archival status of the mobile application. This attribute
     * is read-only.
     */
    public void setIsArchived(java.lang.Boolean isArchived) {
        this.isArchived = isArchived;
    }


    /**
     * Gets the appStoreName value for this MobileApplication.
     * 
     * @return appStoreName   * The name of the application on the app store. This attribute
     * is read-only
     *                 and populated by Google.
     */
    public java.lang.String getAppStoreName() {
        return appStoreName;
    }


    /**
     * Sets the appStoreName value for this MobileApplication.
     * 
     * @param appStoreName   * The name of the application on the app store. This attribute
     * is read-only
     *                 and populated by Google.
     */
    public void setAppStoreName(java.lang.String appStoreName) {
        this.appStoreName = appStoreName;
    }


    /**
     * Gets the developerName value for this MobileApplication.
     * 
     * @return developerName   * The name of the developer of the mobile application. This attribute
     * is read-only
     *                 and populated by Google.
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this MobileApplication.
     * 
     * @param developerName   * The name of the developer of the mobile application. This attribute
     * is read-only
     *                 and populated by Google.
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the platform value for this MobileApplication.
     * 
     * @return platform   * The platform the mobile application runs on. This attribute
     * is read-only
     *                 and populated by Google.
     */
    public com.google.api.ads.dfp.axis.v201802.MobileApplicationPlatform getPlatform() {
        return platform;
    }


    /**
     * Sets the platform value for this MobileApplication.
     * 
     * @param platform   * The platform the mobile application runs on. This attribute
     * is read-only
     *                 and populated by Google.
     */
    public void setPlatform(com.google.api.ads.dfp.axis.v201802.MobileApplicationPlatform platform) {
        this.platform = platform;
    }


    /**
     * Gets the isFree value for this MobileApplication.
     * 
     * @return isFree   * Whether the mobile application is free on the app store it
     * belongs to.
     *                 This attribute is read-only and populated by Google.
     */
    public java.lang.Boolean getIsFree() {
        return isFree;
    }


    /**
     * Sets the isFree value for this MobileApplication.
     * 
     * @param isFree   * Whether the mobile application is free on the app store it
     * belongs to.
     *                 This attribute is read-only and populated by Google.
     */
    public void setIsFree(java.lang.Boolean isFree) {
        this.isFree = isFree;
    }


    /**
     * Gets the downloadUrl value for this MobileApplication.
     * 
     * @return downloadUrl   * The download URL of the mobile application on the app store
     * it belongs to.
     *                 This attribute is read-only and populated by Google.
     */
    public java.lang.String getDownloadUrl() {
        return downloadUrl;
    }


    /**
     * Sets the downloadUrl value for this MobileApplication.
     * 
     * @param downloadUrl   * The download URL of the mobile application on the app store
     * it belongs to.
     *                 This attribute is read-only and populated by Google.
     */
    public void setDownloadUrl(java.lang.String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileApplication)) return false;
        MobileApplication other = (MobileApplication) obj;
        if (obj == null) return false;
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
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.appStoreId==null && other.getAppStoreId()==null) || 
             (this.appStoreId!=null &&
              this.appStoreId.equals(other.getAppStoreId()))) &&
            ((this.appStore==null && other.getAppStore()==null) || 
             (this.appStore!=null &&
              this.appStore.equals(other.getAppStore()))) &&
            ((this.isArchived==null && other.getIsArchived()==null) || 
             (this.isArchived!=null &&
              this.isArchived.equals(other.getIsArchived()))) &&
            ((this.appStoreName==null && other.getAppStoreName()==null) || 
             (this.appStoreName!=null &&
              this.appStoreName.equals(other.getAppStoreName()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.platform==null && other.getPlatform()==null) || 
             (this.platform!=null &&
              this.platform.equals(other.getPlatform()))) &&
            ((this.isFree==null && other.getIsFree()==null) || 
             (this.isFree!=null &&
              this.isFree.equals(other.getIsFree()))) &&
            ((this.downloadUrl==null && other.getDownloadUrl()==null) || 
             (this.downloadUrl!=null &&
              this.downloadUrl.equals(other.getDownloadUrl())));
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
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getAppStoreId() != null) {
            _hashCode += getAppStoreId().hashCode();
        }
        if (getAppStore() != null) {
            _hashCode += getAppStore().hashCode();
        }
        if (getIsArchived() != null) {
            _hashCode += getIsArchived().hashCode();
        }
        if (getAppStoreName() != null) {
            _hashCode += getAppStoreName().hashCode();
        }
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getPlatform() != null) {
            _hashCode += getPlatform().hashCode();
        }
        if (getIsFree() != null) {
            _hashCode += getIsFree().hashCode();
        }
        if (getDownloadUrl() != null) {
            _hashCode += getDownloadUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileApplication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MobileApplication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appStoreId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "appStoreId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appStore");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "appStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MobileApplicationStore"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appStoreName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "appStoreName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("developerName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "developerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platform");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "platform"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MobileApplicationPlatform"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFree");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isFree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "downloadUrl"));
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
