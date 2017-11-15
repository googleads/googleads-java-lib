// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains targeting criteria for {@link LineItem} objects. See
 *             {@link LineItem#targeting}.
 *           
 * 
 * <p>Java class for Targeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Targeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geoTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}GeoTargeting" minOccurs="0"/>
 *         &lt;element name="inventoryTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}InventoryTargeting" minOccurs="0"/>
 *         &lt;element name="dayPartTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}DayPartTargeting" minOccurs="0"/>
 *         &lt;element name="technologyTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}TechnologyTargeting" minOccurs="0"/>
 *         &lt;element name="customTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}CustomCriteriaSet" minOccurs="0"/>
 *         &lt;element name="userDomainTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}UserDomainTargeting" minOccurs="0"/>
 *         &lt;element name="contentTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}ContentTargeting" minOccurs="0"/>
 *         &lt;element name="videoPositionTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}VideoPositionTargeting" minOccurs="0"/>
 *         &lt;element name="mobileApplicationTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}MobileApplicationTargeting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Targeting", propOrder = {
    "geoTargeting",
    "inventoryTargeting",
    "dayPartTargeting",
    "technologyTargeting",
    "customTargeting",
    "userDomainTargeting",
    "contentTargeting",
    "videoPositionTargeting",
    "mobileApplicationTargeting"
})
public class Targeting {

    protected GeoTargeting geoTargeting;
    protected InventoryTargeting inventoryTargeting;
    protected DayPartTargeting dayPartTargeting;
    protected TechnologyTargeting technologyTargeting;
    protected CustomCriteriaSet customTargeting;
    protected UserDomainTargeting userDomainTargeting;
    protected ContentTargeting contentTargeting;
    protected VideoPositionTargeting videoPositionTargeting;
    protected MobileApplicationTargeting mobileApplicationTargeting;

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
     * Gets the value of the dayPartTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link DayPartTargeting }
     *     
     */
    public DayPartTargeting getDayPartTargeting() {
        return dayPartTargeting;
    }

    /**
     * Sets the value of the dayPartTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayPartTargeting }
     *     
     */
    public void setDayPartTargeting(DayPartTargeting value) {
        this.dayPartTargeting = value;
    }

    /**
     * Gets the value of the technologyTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link TechnologyTargeting }
     *     
     */
    public TechnologyTargeting getTechnologyTargeting() {
        return technologyTargeting;
    }

    /**
     * Sets the value of the technologyTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnologyTargeting }
     *     
     */
    public void setTechnologyTargeting(TechnologyTargeting value) {
        this.technologyTargeting = value;
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
     * Gets the value of the contentTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link ContentTargeting }
     *     
     */
    public ContentTargeting getContentTargeting() {
        return contentTargeting;
    }

    /**
     * Sets the value of the contentTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentTargeting }
     *     
     */
    public void setContentTargeting(ContentTargeting value) {
        this.contentTargeting = value;
    }

    /**
     * Gets the value of the videoPositionTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link VideoPositionTargeting }
     *     
     */
    public VideoPositionTargeting getVideoPositionTargeting() {
        return videoPositionTargeting;
    }

    /**
     * Sets the value of the videoPositionTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoPositionTargeting }
     *     
     */
    public void setVideoPositionTargeting(VideoPositionTargeting value) {
        this.videoPositionTargeting = value;
    }

    /**
     * Gets the value of the mobileApplicationTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link MobileApplicationTargeting }
     *     
     */
    public MobileApplicationTargeting getMobileApplicationTargeting() {
        return mobileApplicationTargeting;
    }

    /**
     * Sets the value of the mobileApplicationTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileApplicationTargeting }
     *     
     */
    public void setMobileApplicationTargeting(MobileApplicationTargeting value) {
        this.mobileApplicationTargeting = value;
    }

}
