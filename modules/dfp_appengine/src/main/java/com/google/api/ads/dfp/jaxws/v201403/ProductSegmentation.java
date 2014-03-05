
package com.google.api.ads.dfp.jaxws.v201403;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Segmentations used to create products. Within a product template, for each segmentation,
 *             a product will be created for the combination of all other segments within other segmentations.
 *             <p>
 *             For example, a product with 3 segmentations with only 1 segment for each will produce
 *             {@code 1 x 1 x 1 = 1} product.
 *             A product with 3 segmentations with 2 segments for each will produce {@code 2 x 2 x 2 = 8}
 *             products.
 *           
 * 
 * <p>Java class for ProductSegmentation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSegmentation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geoSegment" type="{https://www.google.com/apis/ads/publisher/v201403}GeoTargeting" minOccurs="0"/>
 *         &lt;element name="adUnitSegments" type="{https://www.google.com/apis/ads/publisher/v201403}AdUnitTargeting" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="placementSegment" type="{https://www.google.com/apis/ads/publisher/v201403}PlacementTargeting" minOccurs="0"/>
 *         &lt;element name="customTargetingSegment" type="{https://www.google.com/apis/ads/publisher/v201403}CustomCriteria" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userDomainSegment" type="{https://www.google.com/apis/ads/publisher/v201403}UserDomainTargeting" minOccurs="0"/>
 *         &lt;element name="bandwidthSegment" type="{https://www.google.com/apis/ads/publisher/v201403}BandwidthGroupTargeting" minOccurs="0"/>
 *         &lt;element name="browserSegment" type="{https://www.google.com/apis/ads/publisher/v201403}BrowserTargeting" minOccurs="0"/>
 *         &lt;element name="browserLanguageSegment" type="{https://www.google.com/apis/ads/publisher/v201403}BrowserLanguageTargeting" minOccurs="0"/>
 *         &lt;element name="operatingSystemSegment" type="{https://www.google.com/apis/ads/publisher/v201403}OperatingSystemTargeting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSegmentation", propOrder = {
    "geoSegment",
    "adUnitSegments",
    "placementSegment",
    "customTargetingSegment",
    "userDomainSegment",
    "bandwidthSegment",
    "browserSegment",
    "browserLanguageSegment",
    "operatingSystemSegment"
})
public class ProductSegmentation {

    protected GeoTargeting geoSegment;
    protected List<AdUnitTargeting> adUnitSegments;
    protected PlacementTargeting placementSegment;
    protected List<CustomCriteria> customTargetingSegment;
    protected UserDomainTargeting userDomainSegment;
    protected BandwidthGroupTargeting bandwidthSegment;
    protected BrowserTargeting browserSegment;
    protected BrowserLanguageTargeting browserLanguageSegment;
    protected OperatingSystemTargeting operatingSystemSegment;

    /**
     * Gets the value of the geoSegment property.
     * 
     * @return
     *     possible object is
     *     {@link GeoTargeting }
     *     
     */
    public GeoTargeting getGeoSegment() {
        return geoSegment;
    }

    /**
     * Sets the value of the geoSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoTargeting }
     *     
     */
    public void setGeoSegment(GeoTargeting value) {
        this.geoSegment = value;
    }

    /**
     * Gets the value of the adUnitSegments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adUnitSegments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdUnitSegments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdUnitTargeting }
     * 
     * 
     */
    public List<AdUnitTargeting> getAdUnitSegments() {
        if (adUnitSegments == null) {
            adUnitSegments = new ArrayList<AdUnitTargeting>();
        }
        return this.adUnitSegments;
    }

    /**
     * Gets the value of the placementSegment property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementTargeting }
     *     
     */
    public PlacementTargeting getPlacementSegment() {
        return placementSegment;
    }

    /**
     * Sets the value of the placementSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementTargeting }
     *     
     */
    public void setPlacementSegment(PlacementTargeting value) {
        this.placementSegment = value;
    }

    /**
     * Gets the value of the customTargetingSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customTargetingSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomTargetingSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomCriteria }
     * 
     * 
     */
    public List<CustomCriteria> getCustomTargetingSegment() {
        if (customTargetingSegment == null) {
            customTargetingSegment = new ArrayList<CustomCriteria>();
        }
        return this.customTargetingSegment;
    }

    /**
     * Gets the value of the userDomainSegment property.
     * 
     * @return
     *     possible object is
     *     {@link UserDomainTargeting }
     *     
     */
    public UserDomainTargeting getUserDomainSegment() {
        return userDomainSegment;
    }

    /**
     * Sets the value of the userDomainSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDomainTargeting }
     *     
     */
    public void setUserDomainSegment(UserDomainTargeting value) {
        this.userDomainSegment = value;
    }

    /**
     * Gets the value of the bandwidthSegment property.
     * 
     * @return
     *     possible object is
     *     {@link BandwidthGroupTargeting }
     *     
     */
    public BandwidthGroupTargeting getBandwidthSegment() {
        return bandwidthSegment;
    }

    /**
     * Sets the value of the bandwidthSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandwidthGroupTargeting }
     *     
     */
    public void setBandwidthSegment(BandwidthGroupTargeting value) {
        this.bandwidthSegment = value;
    }

    /**
     * Gets the value of the browserSegment property.
     * 
     * @return
     *     possible object is
     *     {@link BrowserTargeting }
     *     
     */
    public BrowserTargeting getBrowserSegment() {
        return browserSegment;
    }

    /**
     * Sets the value of the browserSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrowserTargeting }
     *     
     */
    public void setBrowserSegment(BrowserTargeting value) {
        this.browserSegment = value;
    }

    /**
     * Gets the value of the browserLanguageSegment property.
     * 
     * @return
     *     possible object is
     *     {@link BrowserLanguageTargeting }
     *     
     */
    public BrowserLanguageTargeting getBrowserLanguageSegment() {
        return browserLanguageSegment;
    }

    /**
     * Sets the value of the browserLanguageSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrowserLanguageTargeting }
     *     
     */
    public void setBrowserLanguageSegment(BrowserLanguageTargeting value) {
        this.browserLanguageSegment = value;
    }

    /**
     * Gets the value of the operatingSystemSegment property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingSystemTargeting }
     *     
     */
    public OperatingSystemTargeting getOperatingSystemSegment() {
        return operatingSystemSegment;
    }

    /**
     * Sets the value of the operatingSystemSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingSystemTargeting }
     *     
     */
    public void setOperatingSystemSegment(OperatingSystemTargeting value) {
        this.operatingSystemSegment = value;
    }

}
