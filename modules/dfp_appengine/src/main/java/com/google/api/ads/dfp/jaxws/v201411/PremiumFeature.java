
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code PremiumFeature} represents the feature type to be applied as a premium on a
 *             {@link RateCard}.
 *           
 * 
 * <p>Java class for PremiumFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremiumFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PremiumFeature.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremiumFeature", propOrder = {
    "premiumFeatureType"
})
@XmlSeeAlso({
    DeviceManufacturerPremiumFeature.class,
    UnknownPremiumFeature.class,
    BrowserPremiumFeature.class,
    FrequencyCapPremiumFeature.class,
    DaypartPremiumFeature.class,
    UserDomainPremiumFeature.class,
    MobileCarrierPremiumFeature.class,
    OperatingSystemPremiumFeature.class,
    PlacementPremiumFeature.class,
    BandwidthPremiumFeature.class,
    DeviceCategoryPremiumFeature.class,
    BrowserLanguagePremiumFeature.class,
    AudienceSegmentPremiumFeature.class,
    AdUnitPremiumFeature.class,
    CustomTargetingPremiumFeature.class,
    GeographyPremiumFeature.class,
    DeviceCapabilityPremiumFeature.class
})
public abstract class PremiumFeature {

    @XmlElement(name = "PremiumFeature.Type")
    protected String premiumFeatureType;

    /**
     * Gets the value of the premiumFeatureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiumFeatureType() {
        return premiumFeatureType;
    }

    /**
     * Sets the value of the premiumFeatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiumFeatureType(String value) {
        this.premiumFeatureType = value;
    }

}
