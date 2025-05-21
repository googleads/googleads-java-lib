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
 * MobileApplication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202505;


/**
 * A mobile application that has been added to or "claimed" by the
 * network to be used for targeting
 *             purposes. These mobile apps can come from various app
 * stores.
 */
public class MobileApplication  implements java.io.Serializable {
    /* Uniquely identifies the mobile application. This attribute
     * is read-only and is assigned by
     *                 Google when a mobile application is claimed. */
    private java.lang.Long id;

    /* Uniquely identifies the mobile application. This attribute
     * is read-only and is assigned by
     *                 Google when a mobile application is claimed. The {@link
     * #id} field is being deprecated in favor
     *                 of this new ID space. */
    private java.lang.Long applicationId;

    /* The display name of the mobile application. This attribute
     * is required and has a maximum length
     *                 of 255 characters. */
    private java.lang.String displayName;

    /* The app store ID of the app to claim. This attribute is required
     * for creation and then is
     *                 read-only. */
    private java.lang.String appStoreId;

    /* The app stores the mobile application belongs to. This attribute
     * is required for creation and
     *                 is mutable to allow for third party app store linking. */
    private com.google.api.ads.admanager.axis.v202505.MobileApplicationStore[] appStores;

    /* The archival status of the mobile application. This attribute
     * is read-only. */
    private java.lang.Boolean isArchived;

    /* The name of the application on the app store. This attribute
     * is read-only and populated by
     *                 Google. */
    private java.lang.String appStoreName;

    /* The application code used to identify the app in the SDK. This
     * attribute is read-only and
     *                 populated by Google.
     *                 
     *                 <p>Note that the UI refers to this as "App ID". */
    private java.lang.String applicationCode;

    /* The name of the developer of the mobile application. This attribute
     * is read-only and populated
     *                 by Google. */
    private java.lang.String developerName;

    /* The platform the mobile application runs on. This attribute
     * is read-only and populated by
     *                 Google. */
    private com.google.api.ads.admanager.axis.v202505.MobileApplicationPlatform platform;

    /* Whether the mobile application is free on the app store it
     * belongs to. This attribute is
     *                 read-only and populated by Google. */
    private java.lang.Boolean isFree;

    /* The download URL of the mobile application on the app store
     * it belongs to. This attribute is
     *                 read-only and populated by Google. */
    private java.lang.String downloadUrl;

    /* The approval status for the mobile application. */
    private com.google.api.ads.admanager.axis.v202505.MobileApplicationApprovalStatus approvalStatus;

    public MobileApplication() {
    }

    public MobileApplication(
           java.lang.Long id,
           java.lang.Long applicationId,
           java.lang.String displayName,
           java.lang.String appStoreId,
           com.google.api.ads.admanager.axis.v202505.MobileApplicationStore[] appStores,
           java.lang.Boolean isArchived,
           java.lang.String appStoreName,
           java.lang.String applicationCode,
           java.lang.String developerName,
           com.google.api.ads.admanager.axis.v202505.MobileApplicationPlatform platform,
           java.lang.Boolean isFree,
           java.lang.String downloadUrl,
           com.google.api.ads.admanager.axis.v202505.MobileApplicationApprovalStatus approvalStatus) {
           this.id = id;
           this.applicationId = applicationId;
           this.displayName = displayName;
           this.appStoreId = appStoreId;
           this.appStores = appStores;
           this.isArchived = isArchived;
           this.appStoreName = appStoreName;
           this.applicationCode = applicationCode;
           this.developerName = developerName;
           this.platform = platform;
           this.isFree = isFree;
           this.downloadUrl = downloadUrl;
           this.approvalStatus = approvalStatus;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("appStoreId", getAppStoreId())
            .add("appStoreName", getAppStoreName())
            .add("appStores", getAppStores())
            .add("applicationCode", getApplicationCode())
            .add("applicationId", getApplicationId())
            .add("approvalStatus", getApprovalStatus())
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
     * is read-only and is assigned by
     *                 Google when a mobile application is claimed.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this MobileApplication.
     * 
     * @param id   * Uniquely identifies the mobile application. This attribute
     * is read-only and is assigned by
     *                 Google when a mobile application is claimed.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the applicationId value for this MobileApplication.
     * 
     * @return applicationId   * Uniquely identifies the mobile application. This attribute
     * is read-only and is assigned by
     *                 Google when a mobile application is claimed. The {@link
     * #id} field is being deprecated in favor
     *                 of this new ID space.
     */
    public java.lang.Long getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this MobileApplication.
     * 
     * @param applicationId   * Uniquely identifies the mobile application. This attribute
     * is read-only and is assigned by
     *                 Google when a mobile application is claimed. The {@link
     * #id} field is being deprecated in favor
     *                 of this new ID space.
     */
    public void setApplicationId(java.lang.Long applicationId) {
        this.applicationId = applicationId;
    }


    /**
     * Gets the displayName value for this MobileApplication.
     * 
     * @return displayName   * The display name of the mobile application. This attribute
     * is required and has a maximum length
     *                 of 255 characters.
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this MobileApplication.
     * 
     * @param displayName   * The display name of the mobile application. This attribute
     * is required and has a maximum length
     *                 of 255 characters.
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the appStoreId value for this MobileApplication.
     * 
     * @return appStoreId   * The app store ID of the app to claim. This attribute is required
     * for creation and then is
     *                 read-only.
     */
    public java.lang.String getAppStoreId() {
        return appStoreId;
    }


    /**
     * Sets the appStoreId value for this MobileApplication.
     * 
     * @param appStoreId   * The app store ID of the app to claim. This attribute is required
     * for creation and then is
     *                 read-only.
     */
    public void setAppStoreId(java.lang.String appStoreId) {
        this.appStoreId = appStoreId;
    }


    /**
     * Gets the appStores value for this MobileApplication.
     * 
     * @return appStores   * The app stores the mobile application belongs to. This attribute
     * is required for creation and
     *                 is mutable to allow for third party app store linking.
     */
    public com.google.api.ads.admanager.axis.v202505.MobileApplicationStore[] getAppStores() {
        return appStores;
    }


    /**
     * Sets the appStores value for this MobileApplication.
     * 
     * @param appStores   * The app stores the mobile application belongs to. This attribute
     * is required for creation and
     *                 is mutable to allow for third party app store linking.
     */
    public void setAppStores(com.google.api.ads.admanager.axis.v202505.MobileApplicationStore[] appStores) {
        this.appStores = appStores;
    }

    public com.google.api.ads.admanager.axis.v202505.MobileApplicationStore getAppStores(int i) {
        return this.appStores[i];
    }

    public void setAppStores(int i, com.google.api.ads.admanager.axis.v202505.MobileApplicationStore _value) {
        this.appStores[i] = _value;
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
     * is read-only and populated by
     *                 Google.
     */
    public java.lang.String getAppStoreName() {
        return appStoreName;
    }


    /**
     * Sets the appStoreName value for this MobileApplication.
     * 
     * @param appStoreName   * The name of the application on the app store. This attribute
     * is read-only and populated by
     *                 Google.
     */
    public void setAppStoreName(java.lang.String appStoreName) {
        this.appStoreName = appStoreName;
    }


    /**
     * Gets the applicationCode value for this MobileApplication.
     * 
     * @return applicationCode   * The application code used to identify the app in the SDK. This
     * attribute is read-only and
     *                 populated by Google.
     *                 
     *                 <p>Note that the UI refers to this as "App ID".
     */
    public java.lang.String getApplicationCode() {
        return applicationCode;
    }


    /**
     * Sets the applicationCode value for this MobileApplication.
     * 
     * @param applicationCode   * The application code used to identify the app in the SDK. This
     * attribute is read-only and
     *                 populated by Google.
     *                 
     *                 <p>Note that the UI refers to this as "App ID".
     */
    public void setApplicationCode(java.lang.String applicationCode) {
        this.applicationCode = applicationCode;
    }


    /**
     * Gets the developerName value for this MobileApplication.
     * 
     * @return developerName   * The name of the developer of the mobile application. This attribute
     * is read-only and populated
     *                 by Google.
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this MobileApplication.
     * 
     * @param developerName   * The name of the developer of the mobile application. This attribute
     * is read-only and populated
     *                 by Google.
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the platform value for this MobileApplication.
     * 
     * @return platform   * The platform the mobile application runs on. This attribute
     * is read-only and populated by
     *                 Google.
     */
    public com.google.api.ads.admanager.axis.v202505.MobileApplicationPlatform getPlatform() {
        return platform;
    }


    /**
     * Sets the platform value for this MobileApplication.
     * 
     * @param platform   * The platform the mobile application runs on. This attribute
     * is read-only and populated by
     *                 Google.
     */
    public void setPlatform(com.google.api.ads.admanager.axis.v202505.MobileApplicationPlatform platform) {
        this.platform = platform;
    }


    /**
     * Gets the isFree value for this MobileApplication.
     * 
     * @return isFree   * Whether the mobile application is free on the app store it
     * belongs to. This attribute is
     *                 read-only and populated by Google.
     */
    public java.lang.Boolean getIsFree() {
        return isFree;
    }


    /**
     * Sets the isFree value for this MobileApplication.
     * 
     * @param isFree   * Whether the mobile application is free on the app store it
     * belongs to. This attribute is
     *                 read-only and populated by Google.
     */
    public void setIsFree(java.lang.Boolean isFree) {
        this.isFree = isFree;
    }


    /**
     * Gets the downloadUrl value for this MobileApplication.
     * 
     * @return downloadUrl   * The download URL of the mobile application on the app store
     * it belongs to. This attribute is
     *                 read-only and populated by Google.
     */
    public java.lang.String getDownloadUrl() {
        return downloadUrl;
    }


    /**
     * Sets the downloadUrl value for this MobileApplication.
     * 
     * @param downloadUrl   * The download URL of the mobile application on the app store
     * it belongs to. This attribute is
     *                 read-only and populated by Google.
     */
    public void setDownloadUrl(java.lang.String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }


    /**
     * Gets the approvalStatus value for this MobileApplication.
     * 
     * @return approvalStatus   * The approval status for the mobile application.
     */
    public com.google.api.ads.admanager.axis.v202505.MobileApplicationApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this MobileApplication.
     * 
     * @param approvalStatus   * The approval status for the mobile application.
     */
    public void setApprovalStatus(com.google.api.ads.admanager.axis.v202505.MobileApplicationApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileApplication)) return false;
        MobileApplication other = (MobileApplication) obj;
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
            ((this.applicationId==null && other.getApplicationId()==null) || 
             (this.applicationId!=null &&
              this.applicationId.equals(other.getApplicationId()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.appStoreId==null && other.getAppStoreId()==null) || 
             (this.appStoreId!=null &&
              this.appStoreId.equals(other.getAppStoreId()))) &&
            ((this.appStores==null && other.getAppStores()==null) || 
             (this.appStores!=null &&
              java.util.Arrays.equals(this.appStores, other.getAppStores()))) &&
            ((this.isArchived==null && other.getIsArchived()==null) || 
             (this.isArchived!=null &&
              this.isArchived.equals(other.getIsArchived()))) &&
            ((this.appStoreName==null && other.getAppStoreName()==null) || 
             (this.appStoreName!=null &&
              this.appStoreName.equals(other.getAppStoreName()))) &&
            ((this.applicationCode==null && other.getApplicationCode()==null) || 
             (this.applicationCode!=null &&
              this.applicationCode.equals(other.getApplicationCode()))) &&
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
              this.downloadUrl.equals(other.getDownloadUrl()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus())));
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
        if (getApplicationId() != null) {
            _hashCode += getApplicationId().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getAppStoreId() != null) {
            _hashCode += getAppStoreId().hashCode();
        }
        if (getAppStores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppStores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppStores(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsArchived() != null) {
            _hashCode += getIsArchived().hashCode();
        }
        if (getAppStoreName() != null) {
            _hashCode += getAppStoreName().hashCode();
        }
        if (getApplicationCode() != null) {
            _hashCode += getApplicationCode().hashCode();
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
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileApplication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "MobileApplication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "applicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appStoreId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "appStoreId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appStores");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "appStores"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "MobileApplicationStore"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "isArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appStoreName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "appStoreName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "applicationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("developerName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "developerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platform");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "platform"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "MobileApplicationPlatform"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFree");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "isFree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "downloadUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "MobileApplication.ApprovalStatus"));
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
