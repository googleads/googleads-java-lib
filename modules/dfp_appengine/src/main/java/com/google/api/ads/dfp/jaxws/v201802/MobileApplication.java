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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A mobile application that has been added to or "claimed" by the network to be used for
 *             targeting purposes.
 *             These mobile apps can come from various app stores.
 *           
 * 
 * <p>Java class for MobileApplication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileApplication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appStoreId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appStore" type="{https://www.google.com/apis/ads/publisher/v201802}MobileApplicationStore" minOccurs="0"/>
 *         &lt;element name="isArchived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="appStoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="developerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="platform" type="{https://www.google.com/apis/ads/publisher/v201802}MobileApplicationPlatform" minOccurs="0"/>
 *         &lt;element name="isFree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="downloadUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileApplication", propOrder = {
    "id",
    "displayName",
    "appStoreId",
    "appStore",
    "isArchived",
    "appStoreName",
    "developerName",
    "platform",
    "isFree",
    "downloadUrl"
})
public class MobileApplication {

    protected Long id;
    protected String displayName;
    protected String appStoreId;
    @XmlSchemaType(name = "string")
    protected MobileApplicationStore appStore;
    protected Boolean isArchived;
    protected String appStoreName;
    protected String developerName;
    @XmlSchemaType(name = "string")
    protected MobileApplicationPlatform platform;
    protected Boolean isFree;
    protected String downloadUrl;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the appStoreId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppStoreId() {
        return appStoreId;
    }

    /**
     * Sets the value of the appStoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppStoreId(String value) {
        this.appStoreId = value;
    }

    /**
     * Gets the value of the appStore property.
     * 
     * @return
     *     possible object is
     *     {@link MobileApplicationStore }
     *     
     */
    public MobileApplicationStore getAppStore() {
        return appStore;
    }

    /**
     * Sets the value of the appStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileApplicationStore }
     *     
     */
    public void setAppStore(MobileApplicationStore value) {
        this.appStore = value;
    }

    /**
     * Gets the value of the isArchived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsArchived() {
        return isArchived;
    }

    /**
     * Sets the value of the isArchived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsArchived(Boolean value) {
        this.isArchived = value;
    }

    /**
     * Gets the value of the appStoreName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppStoreName() {
        return appStoreName;
    }

    /**
     * Sets the value of the appStoreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppStoreName(String value) {
        this.appStoreName = value;
    }

    /**
     * Gets the value of the developerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperName() {
        return developerName;
    }

    /**
     * Sets the value of the developerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperName(String value) {
        this.developerName = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link MobileApplicationPlatform }
     *     
     */
    public MobileApplicationPlatform getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileApplicationPlatform }
     *     
     */
    public void setPlatform(MobileApplicationPlatform value) {
        this.platform = value;
    }

    /**
     * Gets the value of the isFree property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFree() {
        return isFree;
    }

    /**
     * Sets the value of the isFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFree(Boolean value) {
        this.isFree = value;
    }

    /**
     * Gets the value of the downloadUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * Sets the value of the downloadUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadUrl(String value) {
        this.downloadUrl = value;
    }

}
