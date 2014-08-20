
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Rule of a {@link FirstPartyAudienceSegment} that defines user's eligibility criteria to be part
 *             of a segment.
 *           
 * 
 * <p>Java class for FirstPartyAudienceSegmentRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirstPartyAudienceSegmentRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inventoryRule" type="{https://www.google.com/apis/ads/publisher/v201408}InventoryTargeting" minOccurs="0"/>
 *         &lt;element name="customCriteriaRule" type="{https://www.google.com/apis/ads/publisher/v201408}CustomCriteriaSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirstPartyAudienceSegmentRule", propOrder = {
    "inventoryRule",
    "customCriteriaRule"
})
public class FirstPartyAudienceSegmentRule {

    protected InventoryTargeting inventoryRule;
    protected CustomCriteriaSet customCriteriaRule;

    /**
     * Gets the value of the inventoryRule property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryTargeting }
     *     
     */
    public InventoryTargeting getInventoryRule() {
        return inventoryRule;
    }

    /**
     * Sets the value of the inventoryRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryTargeting }
     *     
     */
    public void setInventoryRule(InventoryTargeting value) {
        this.inventoryRule = value;
    }

    /**
     * Gets the value of the customCriteriaRule property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCriteriaSet }
     *     
     */
    public CustomCriteriaSet getCustomCriteriaRule() {
        return customCriteriaRule;
    }

    /**
     * Sets the value of the customCriteriaRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCriteriaSet }
     *     
     */
    public void setCustomCriteriaRule(CustomCriteriaSet value) {
        this.customCriteriaRule = value;
    }

}
