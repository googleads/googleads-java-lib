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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Specifies what targeting or attributes are customizable on a {@link ProductTemplate}.
 *           
 * 
 * <p>Java class for CustomizableAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomizableAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowGeoTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowAdUnitTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowPlacementTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowUserDomainTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowBandwidthGroupTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowBrowserTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowBrowserLanguageTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowOperatingSystemTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowDeviceCapabilityTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowDeviceCategoryTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowMobileApplicationTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowMobileCarrierTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowMobileDeviceAndManufacturerTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowAudienceSegmentTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isAllCustomTargetingKeysCustomizable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customizableCustomTargetingKeyIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="allowDaypartTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowFrequencyCapsCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowDeliverySettingsCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowCreativePlaceholdersCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizableAttributes", propOrder = {
    "allowGeoTargetingCustomization",
    "allowAdUnitTargetingCustomization",
    "allowPlacementTargetingCustomization",
    "allowUserDomainTargetingCustomization",
    "allowBandwidthGroupTargetingCustomization",
    "allowBrowserTargetingCustomization",
    "allowBrowserLanguageTargetingCustomization",
    "allowOperatingSystemTargetingCustomization",
    "allowDeviceCapabilityTargetingCustomization",
    "allowDeviceCategoryTargetingCustomization",
    "allowMobileApplicationTargetingCustomization",
    "allowMobileCarrierTargetingCustomization",
    "allowMobileDeviceAndManufacturerTargetingCustomization",
    "allowAudienceSegmentTargetingCustomization",
    "isAllCustomTargetingKeysCustomizable",
    "customizableCustomTargetingKeyIds",
    "allowDaypartTargetingCustomization",
    "allowFrequencyCapsCustomization",
    "allowDeliverySettingsCustomization",
    "allowCreativePlaceholdersCustomization"
})
public class CustomizableAttributes {

    protected Boolean allowGeoTargetingCustomization;
    protected Boolean allowAdUnitTargetingCustomization;
    protected Boolean allowPlacementTargetingCustomization;
    protected Boolean allowUserDomainTargetingCustomization;
    protected Boolean allowBandwidthGroupTargetingCustomization;
    protected Boolean allowBrowserTargetingCustomization;
    protected Boolean allowBrowserLanguageTargetingCustomization;
    protected Boolean allowOperatingSystemTargetingCustomization;
    protected Boolean allowDeviceCapabilityTargetingCustomization;
    protected Boolean allowDeviceCategoryTargetingCustomization;
    protected Boolean allowMobileApplicationTargetingCustomization;
    protected Boolean allowMobileCarrierTargetingCustomization;
    protected Boolean allowMobileDeviceAndManufacturerTargetingCustomization;
    protected Boolean allowAudienceSegmentTargetingCustomization;
    protected Boolean isAllCustomTargetingKeysCustomizable;
    @XmlElement(type = Long.class)
    protected List<Long> customizableCustomTargetingKeyIds;
    protected Boolean allowDaypartTargetingCustomization;
    protected Boolean allowFrequencyCapsCustomization;
    protected Boolean allowDeliverySettingsCustomization;
    protected Boolean allowCreativePlaceholdersCustomization;

    /**
     * Gets the value of the allowGeoTargetingCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowGeoTargetingCustomization() {
        return allowGeoTargetingCustomization;
    }

    /**
     * Sets the value of the allowGeoTargetingCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowGeoTargetingCustomization(Boolean value) {
        this.allowGeoTargetingCustomization = value;
    }

    /**
     * Gets the value of the allowAdUnitTargetingCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAdUnitTargetingCustomization() {
        return allowAdUnitTargetingCustomization;
    }

    /**
     * Sets the value of the allowAdUnitTargetingCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAdUnitTargetingCustomization(Boolean value) {
        this.allowAdUnitTargetingCustomization = value;
    }

    /**
     * Gets the value of the allowPlacementTargetingCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPlacementTargetingCustomization() {
        return allowPlacementTargetingCustomization;
    }

    /**
     * Sets the value of the allowPlacementTargetingCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPlacementTargetingCustomization(Boolean value) {
        this.allowPlacementTargetingCustomization = value;
    }

    /**
     * Gets the value of the allowUserDomainTargetingCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowUserDomainTargetingCustomization() {
        return allowUserDomainTargetingCustomization;
    }

    /**
     * Sets the value of the allowUserDomainTargetingCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowUserDomainTargetingCustomization(Boolean value) {
        this.allowUserDomainTargetingCustomization = value;
    }

    /**
     * Gets the value of the allowBandwidthGroupTargetingCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowBandwidthGroupTargetingCustomization() {
        return allowBandwidthGroupTargetingCustomization;
    }

    /**
     * Sets the value of the allowBandwidthGroupTargetingCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowBandwidthGroupTargetingCustomization(Boolean value) {
        this.allowBandwidthGroupTargetingCustomization = value;
    }

    /**
     * Gets the value of the allowBrowserTargetingCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowBrowserTargetingCustomization() {
        return allowBrowserTargetingCustomization;
    }

    /**
     * Sets the value of the allowBrowserTargetingCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowBrowserTargetingCustomization(Boolean value) {
        this.allowBrowserTargetingCustomization = value;
    }

    /**
     * Gets the value of the allowBrowserLanguageTargetingCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowBrowserLanguageTargetingCustomization() {
        return allowBrowserLanguageTargetingCustomization;
    }

    /**
     * Sets the value of the allowBrowserLanguageTargetingCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowBrowserLanguageTargetingCustomization(Boolean value) {
        this.allowBrowserLanguageTargetingCustomization = value;
    }

    /**
     * Gets the value of the allowOperatingSystemTargetingCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowOperatingSystemTargetingCustomization() {
        return allowOperatingSystemTargetingCustomization;
    }

    /**
     * Sets the value of the allowOperatingSystemTargetingCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowOperatingSystemTargetingCustomization(Boolean value) {
        this.allowOperatingSystemTargetingCustomization = value;
    }

    /**
     * Gets the value of the allowDeviceCapabilityTargetingCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowDeviceCapabilityTargetingCustomization() {
        return allowDeviceCapabilityTargetingCustomization;
    }

    /**
     * Sets the value of the allowDeviceCapabilityTargetingCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowDeviceCapabilityTargetingCustomization(Boolean value) {
        this.allowDeviceCapabilityTargetingCustomization = value;
    }

    /**
     * Gets the value of the allowDeviceCategoryTargetingCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowDeviceCategoryTargetingCustomization() {
        return allowDeviceCategoryTargetingCustomization;
    }

    /**
     * Sets the value of the allowDeviceCategoryTargetingCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowDeviceCategoryTargetingCustomization(Boolean value) {
        this.allowDeviceCategoryTargetingCustomization = value;
    }

    /**
     * Gets the value of the allowMobileApplicationTargetingCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowMobileApplicationTargetingCustomization() {
        return allowMobileApplicationTargetingCustomization;
    }

    /**
     * Sets the value of the allowMobileApplicationTargetingCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowMobileApplicationTargetingCustomization(Boolean value) {
        this.allowMobileApplicationTargetingCustomization = value;
    }

    /**
     * Gets the value of the allowMobileCarrierTargetingCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowMobileCarrierTargetingCustomization() {
        return allowMobileCarrierTargetingCustomization;
    }

    /**
     * Sets the value of the allowMobileCarrierTargetingCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowMobileCarrierTargetingCustomization(Boolean value) {
        this.allowMobileCarrierTargetingCustomization = value;
    }

    /**
     * Gets the value of the allowMobileDeviceAndManufacturerTargetingCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowMobileDeviceAndManufacturerTargetingCustomization() {
        return allowMobileDeviceAndManufacturerTargetingCustomization;
    }

    /**
     * Sets the value of the allowMobileDeviceAndManufacturerTargetingCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowMobileDeviceAndManufacturerTargetingCustomization(Boolean value) {
        this.allowMobileDeviceAndManufacturerTargetingCustomization = value;
    }

    /**
     * Gets the value of the allowAudienceSegmentTargetingCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAudienceSegmentTargetingCustomization() {
        return allowAudienceSegmentTargetingCustomization;
    }

    /**
     * Sets the value of the allowAudienceSegmentTargetingCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAudienceSegmentTargetingCustomization(Boolean value) {
        this.allowAudienceSegmentTargetingCustomization = value;
    }

    /**
     * Gets the value of the isAllCustomTargetingKeysCustomizable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllCustomTargetingKeysCustomizable() {
        return isAllCustomTargetingKeysCustomizable;
    }

    /**
     * Sets the value of the isAllCustomTargetingKeysCustomizable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllCustomTargetingKeysCustomizable(Boolean value) {
        this.isAllCustomTargetingKeysCustomizable = value;
    }

    /**
     * Gets the value of the customizableCustomTargetingKeyIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customizableCustomTargetingKeyIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomizableCustomTargetingKeyIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCustomizableCustomTargetingKeyIds() {
        if (customizableCustomTargetingKeyIds == null) {
            customizableCustomTargetingKeyIds = new ArrayList<Long>();
        }
        return this.customizableCustomTargetingKeyIds;
    }

    /**
     * Gets the value of the allowDaypartTargetingCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowDaypartTargetingCustomization() {
        return allowDaypartTargetingCustomization;
    }

    /**
     * Sets the value of the allowDaypartTargetingCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowDaypartTargetingCustomization(Boolean value) {
        this.allowDaypartTargetingCustomization = value;
    }

    /**
     * Gets the value of the allowFrequencyCapsCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowFrequencyCapsCustomization() {
        return allowFrequencyCapsCustomization;
    }

    /**
     * Sets the value of the allowFrequencyCapsCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowFrequencyCapsCustomization(Boolean value) {
        this.allowFrequencyCapsCustomization = value;
    }

    /**
     * Gets the value of the allowDeliverySettingsCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowDeliverySettingsCustomization() {
        return allowDeliverySettingsCustomization;
    }

    /**
     * Sets the value of the allowDeliverySettingsCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowDeliverySettingsCustomization(Boolean value) {
        this.allowDeliverySettingsCustomization = value;
    }

    /**
     * Gets the value of the allowCreativePlaceholdersCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowCreativePlaceholdersCustomization() {
        return allowCreativePlaceholdersCustomization;
    }

    /**
     * Sets the value of the allowCreativePlaceholdersCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowCreativePlaceholdersCustomization(Boolean value) {
        this.allowCreativePlaceholdersCustomization = value;
    }

}
