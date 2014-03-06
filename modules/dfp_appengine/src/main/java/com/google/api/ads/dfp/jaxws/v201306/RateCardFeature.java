
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The feature of a {@link RateCardCustomization}
 *           
 * 
 * <p>Java class for RateCardFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateCardFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RateCardFeature.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateCardFeature", propOrder = {
    "rateCardFeatureType"
})
@XmlSeeAlso({
    AdUnitRateCardFeature.class,
    BrowserRateCardFeature.class,
    PlacementRateCardFeature.class,
    UnknownRateCardFeature.class,
    OperatingSystemRateCardFeature.class,
    FrequencyCapRateCardFeature.class,
    GeographyRateCardFeature.class,
    UserDomainRateCardFeature.class,
    CustomTargetingRateCardFeature.class,
    BrowserLanguageRateCardFeature.class,
    BandwidthRateCardFeature.class
})
public abstract class RateCardFeature {

    @XmlElement(name = "RateCardFeature.Type")
    protected String rateCardFeatureType;

    /**
     * Gets the value of the rateCardFeatureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCardFeatureType() {
        return rateCardFeatureType;
    }

    /**
     * Sets the value of the rateCardFeatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCardFeatureType(String value) {
        this.rateCardFeatureType = value;
    }

}
