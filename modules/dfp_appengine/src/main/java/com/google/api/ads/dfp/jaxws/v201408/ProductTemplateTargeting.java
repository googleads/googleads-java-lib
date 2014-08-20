
package com.google.api.ads.dfp.jaxws.v201408;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains targeting criteria for {@link ProductTemplate} objects.
 *             {@link ProposalLineItem Proposal line items} created from {@link Product products}
 *             of this template will have this criteria added to {@link ProposalLineItem#targeting}.
 *           
 * 
 * <p>Java class for ProductTemplateTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductTemplateTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geoTargeting" type="{https://www.google.com/apis/ads/publisher/v201408}GeoTargeting" minOccurs="0"/>
 *         &lt;element name="allowGeoTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inventoryTargeting" type="{https://www.google.com/apis/ads/publisher/v201408}InventoryTargeting" minOccurs="0"/>
 *         &lt;element name="allowAdUnitTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowPlacementTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customTargeting" type="{https://www.google.com/apis/ads/publisher/v201408}CustomCriteriaSet" minOccurs="0"/>
 *         &lt;element name="customizableCustomTargetingKeyIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="allowAudienceSegmentTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="userDomainTargeting" type="{https://www.google.com/apis/ads/publisher/v201408}UserDomainTargeting" minOccurs="0"/>
 *         &lt;element name="allowUserDomainTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bandwidthGroupTargeting" type="{https://www.google.com/apis/ads/publisher/v201408}BandwidthGroupTargeting" minOccurs="0"/>
 *         &lt;element name="allowBandwidthGroupTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="browserTargeting" type="{https://www.google.com/apis/ads/publisher/v201408}BrowserTargeting" minOccurs="0"/>
 *         &lt;element name="allowBrowserTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="browserLanguageTargeting" type="{https://www.google.com/apis/ads/publisher/v201408}BrowserLanguageTargeting" minOccurs="0"/>
 *         &lt;element name="allowBrowserLanguageTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="operatingSystemTargeting" type="{https://www.google.com/apis/ads/publisher/v201408}OperatingSystemTargeting" minOccurs="0"/>
 *         &lt;element name="allowOperatingSystemTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deviceCapabilityTargeting" type="{https://www.google.com/apis/ads/publisher/v201408}DeviceCapabilityTargeting" minOccurs="0"/>
 *         &lt;element name="allowDeviceCapabilityTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deviceCategoryTargeting" type="{https://www.google.com/apis/ads/publisher/v201408}DeviceCategoryTargeting" minOccurs="0"/>
 *         &lt;element name="allowDeviceCategoryTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mobileCarrierTargeting" type="{https://www.google.com/apis/ads/publisher/v201408}MobileCarrierTargeting" minOccurs="0"/>
 *         &lt;element name="allowMobileCarrierTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deviceManufacturerTargeting" type="{https://www.google.com/apis/ads/publisher/v201408}DeviceManufacturerTargeting" minOccurs="0"/>
 *         &lt;element name="mobileDeviceTargeting" type="{https://www.google.com/apis/ads/publisher/v201408}MobileDeviceTargeting" minOccurs="0"/>
 *         &lt;element name="mobileDeviceSubmodelTargeting" type="{https://www.google.com/apis/ads/publisher/v201408}MobileDeviceSubmodelTargeting" minOccurs="0"/>
 *         &lt;element name="allowMobileDeviceAndManufacturerTargetingCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductTemplateTargeting", propOrder = {
    "geoTargeting",
    "allowGeoTargetingCustomization",
    "inventoryTargeting",
    "allowAdUnitTargetingCustomization",
    "allowPlacementTargetingCustomization",
    "customTargeting",
    "customizableCustomTargetingKeyIds",
    "allowAudienceSegmentTargetingCustomization",
    "userDomainTargeting",
    "allowUserDomainTargetingCustomization",
    "bandwidthGroupTargeting",
    "allowBandwidthGroupTargetingCustomization",
    "browserTargeting",
    "allowBrowserTargetingCustomization",
    "browserLanguageTargeting",
    "allowBrowserLanguageTargetingCustomization",
    "operatingSystemTargeting",
    "allowOperatingSystemTargetingCustomization",
    "deviceCapabilityTargeting",
    "allowDeviceCapabilityTargetingCustomization",
    "deviceCategoryTargeting",
    "allowDeviceCategoryTargetingCustomization",
    "mobileCarrierTargeting",
    "allowMobileCarrierTargetingCustomization",
    "deviceManufacturerTargeting",
    "mobileDeviceTargeting",
    "mobileDeviceSubmodelTargeting",
    "allowMobileDeviceAndManufacturerTargetingCustomization"
})
public class ProductTemplateTargeting {

    protected GeoTargeting geoTargeting;
    protected Boolean allowGeoTargetingCustomization;
    protected InventoryTargeting inventoryTargeting;
    protected Boolean allowAdUnitTargetingCustomization;
    protected Boolean allowPlacementTargetingCustomization;
    protected CustomCriteriaSet customTargeting;
    @XmlElement(type = Long.class)
    protected List<Long> customizableCustomTargetingKeyIds;
    protected Boolean allowAudienceSegmentTargetingCustomization;
    protected UserDomainTargeting userDomainTargeting;
    protected Boolean allowUserDomainTargetingCustomization;
    protected BandwidthGroupTargeting bandwidthGroupTargeting;
    protected Boolean allowBandwidthGroupTargetingCustomization;
    protected BrowserTargeting browserTargeting;
    protected Boolean allowBrowserTargetingCustomization;
    protected BrowserLanguageTargeting browserLanguageTargeting;
    protected Boolean allowBrowserLanguageTargetingCustomization;
    protected OperatingSystemTargeting operatingSystemTargeting;
    protected Boolean allowOperatingSystemTargetingCustomization;
    protected DeviceCapabilityTargeting deviceCapabilityTargeting;
    protected Boolean allowDeviceCapabilityTargetingCustomization;
    protected DeviceCategoryTargeting deviceCategoryTargeting;
    protected Boolean allowDeviceCategoryTargetingCustomization;
    protected MobileCarrierTargeting mobileCarrierTargeting;
    protected Boolean allowMobileCarrierTargetingCustomization;
    protected DeviceManufacturerTargeting deviceManufacturerTargeting;
    protected MobileDeviceTargeting mobileDeviceTargeting;
    protected MobileDeviceSubmodelTargeting mobileDeviceSubmodelTargeting;
    protected Boolean allowMobileDeviceAndManufacturerTargetingCustomization;

    /**
     * Gets the value of the geoTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link GeoTargeting }
     *     
     */
    public GeoTargeting getGeoTargeting() {
        return geoTargeting;
    }

    /**
     * Sets the value of the geoTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoTargeting }
     *     
     */
    public void setGeoTargeting(GeoTargeting value) {
        this.geoTargeting = value;
    }

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
     * Gets the value of the inventoryTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryTargeting }
     *     
     */
    public InventoryTargeting getInventoryTargeting() {
        return inventoryTargeting;
    }

    /**
     * Sets the value of the inventoryTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryTargeting }
     *     
     */
    public void setInventoryTargeting(InventoryTargeting value) {
        this.inventoryTargeting = value;
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
     * Gets the value of the customTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCriteriaSet }
     *     
     */
    public CustomCriteriaSet getCustomTargeting() {
        return customTargeting;
    }

    /**
     * Sets the value of the customTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCriteriaSet }
     *     
     */
    public void setCustomTargeting(CustomCriteriaSet value) {
        this.customTargeting = value;
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
     * Gets the value of the userDomainTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link UserDomainTargeting }
     *     
     */
    public UserDomainTargeting getUserDomainTargeting() {
        return userDomainTargeting;
    }

    /**
     * Sets the value of the userDomainTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDomainTargeting }
     *     
     */
    public void setUserDomainTargeting(UserDomainTargeting value) {
        this.userDomainTargeting = value;
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
     * Gets the value of the bandwidthGroupTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link BandwidthGroupTargeting }
     *     
     */
    public BandwidthGroupTargeting getBandwidthGroupTargeting() {
        return bandwidthGroupTargeting;
    }

    /**
     * Sets the value of the bandwidthGroupTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandwidthGroupTargeting }
     *     
     */
    public void setBandwidthGroupTargeting(BandwidthGroupTargeting value) {
        this.bandwidthGroupTargeting = value;
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
     * Gets the value of the browserTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link BrowserTargeting }
     *     
     */
    public BrowserTargeting getBrowserTargeting() {
        return browserTargeting;
    }

    /**
     * Sets the value of the browserTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrowserTargeting }
     *     
     */
    public void setBrowserTargeting(BrowserTargeting value) {
        this.browserTargeting = value;
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
     * Gets the value of the browserLanguageTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link BrowserLanguageTargeting }
     *     
     */
    public BrowserLanguageTargeting getBrowserLanguageTargeting() {
        return browserLanguageTargeting;
    }

    /**
     * Sets the value of the browserLanguageTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrowserLanguageTargeting }
     *     
     */
    public void setBrowserLanguageTargeting(BrowserLanguageTargeting value) {
        this.browserLanguageTargeting = value;
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
     * Gets the value of the operatingSystemTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingSystemTargeting }
     *     
     */
    public OperatingSystemTargeting getOperatingSystemTargeting() {
        return operatingSystemTargeting;
    }

    /**
     * Sets the value of the operatingSystemTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingSystemTargeting }
     *     
     */
    public void setOperatingSystemTargeting(OperatingSystemTargeting value) {
        this.operatingSystemTargeting = value;
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
     * Gets the value of the deviceCapabilityTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceCapabilityTargeting }
     *     
     */
    public DeviceCapabilityTargeting getDeviceCapabilityTargeting() {
        return deviceCapabilityTargeting;
    }

    /**
     * Sets the value of the deviceCapabilityTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCapabilityTargeting }
     *     
     */
    public void setDeviceCapabilityTargeting(DeviceCapabilityTargeting value) {
        this.deviceCapabilityTargeting = value;
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
     * Gets the value of the deviceCategoryTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceCategoryTargeting }
     *     
     */
    public DeviceCategoryTargeting getDeviceCategoryTargeting() {
        return deviceCategoryTargeting;
    }

    /**
     * Sets the value of the deviceCategoryTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCategoryTargeting }
     *     
     */
    public void setDeviceCategoryTargeting(DeviceCategoryTargeting value) {
        this.deviceCategoryTargeting = value;
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
     * Gets the value of the mobileCarrierTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link MobileCarrierTargeting }
     *     
     */
    public MobileCarrierTargeting getMobileCarrierTargeting() {
        return mobileCarrierTargeting;
    }

    /**
     * Sets the value of the mobileCarrierTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileCarrierTargeting }
     *     
     */
    public void setMobileCarrierTargeting(MobileCarrierTargeting value) {
        this.mobileCarrierTargeting = value;
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
     * Gets the value of the deviceManufacturerTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceManufacturerTargeting }
     *     
     */
    public DeviceManufacturerTargeting getDeviceManufacturerTargeting() {
        return deviceManufacturerTargeting;
    }

    /**
     * Sets the value of the deviceManufacturerTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceManufacturerTargeting }
     *     
     */
    public void setDeviceManufacturerTargeting(DeviceManufacturerTargeting value) {
        this.deviceManufacturerTargeting = value;
    }

    /**
     * Gets the value of the mobileDeviceTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link MobileDeviceTargeting }
     *     
     */
    public MobileDeviceTargeting getMobileDeviceTargeting() {
        return mobileDeviceTargeting;
    }

    /**
     * Sets the value of the mobileDeviceTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileDeviceTargeting }
     *     
     */
    public void setMobileDeviceTargeting(MobileDeviceTargeting value) {
        this.mobileDeviceTargeting = value;
    }

    /**
     * Gets the value of the mobileDeviceSubmodelTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link MobileDeviceSubmodelTargeting }
     *     
     */
    public MobileDeviceSubmodelTargeting getMobileDeviceSubmodelTargeting() {
        return mobileDeviceSubmodelTargeting;
    }

    /**
     * Sets the value of the mobileDeviceSubmodelTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileDeviceSubmodelTargeting }
     *     
     */
    public void setMobileDeviceSubmodelTargeting(MobileDeviceSubmodelTargeting value) {
        this.mobileDeviceSubmodelTargeting = value;
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

}
