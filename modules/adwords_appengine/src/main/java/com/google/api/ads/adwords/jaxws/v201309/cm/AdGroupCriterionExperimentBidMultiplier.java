
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Bid multiplier used to modify the bid of a criterion while running
 *             an experiment.
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for AdGroupCriterionExperimentBidMultiplier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupCriterionExperimentBidMultiplier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdGroupCriterionExperimentBidMultiplier.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupCriterionExperimentBidMultiplier", propOrder = {
    "adGroupCriterionExperimentBidMultiplierType"
})
@XmlSeeAlso({
    ManualCPCAdGroupCriterionExperimentBidMultiplier.class
})
public abstract class AdGroupCriterionExperimentBidMultiplier {

    @XmlElement(name = "AdGroupCriterionExperimentBidMultiplier.Type")
    protected String adGroupCriterionExperimentBidMultiplierType;

    /**
     * Gets the value of the adGroupCriterionExperimentBidMultiplierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdGroupCriterionExperimentBidMultiplierType() {
        return adGroupCriterionExperimentBidMultiplierType;
    }

    /**
     * Sets the value of the adGroupCriterionExperimentBidMultiplierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdGroupCriterionExperimentBidMultiplierType(String value) {
        this.adGroupCriterionExperimentBidMultiplierType = value;
    }

}
