
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremiumFeature")
@XmlSeeAlso({
    AudienceSegmentPremiumFeature.class,
    DeviceCapabilityPremiumFeature.class,
    CustomTargetingPremiumFeature.class,
    BrowserPremiumFeature.class,
    BandwidthPremiumFeature.class,
    FrequencyCapPremiumFeature.class,
    DaypartPremiumFeature.class,
    DeviceManufacturerPremiumFeature.class,
    UnknownPremiumFeature.class,
    ContentBundlePremiumFeature.class,
    PlacementPremiumFeature.class,
    VideoPositionPremiumFeature.class,
    UserDomainPremiumFeature.class,
    BrowserLanguagePremiumFeature.class,
    MobileCarrierPremiumFeature.class,
    GeographyPremiumFeature.class,
    DeviceCategoryPremiumFeature.class,
    AdUnitPremiumFeature.class,
    OperatingSystemPremiumFeature.class
})
public abstract class PremiumFeature {


}
