
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Bid multiplier used to modify the bid of an adgroup while running
 *             an experiment.
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for AdGroupExperimentBidMultipliers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupExperimentBidMultipliers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdGroupExperimentBidMultipliers.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupExperimentBidMultipliers", propOrder = {
    "adGroupExperimentBidMultipliersType"
})
@XmlSeeAlso({
    ManualCPMAdGroupExperimentBidMultipliers.class,
    ManualCPCAdGroupExperimentBidMultipliers.class
})
public abstract class AdGroupExperimentBidMultipliers {

    @XmlElement(name = "AdGroupExperimentBidMultipliers.Type")
    protected String adGroupExperimentBidMultipliersType;

    /**
     * Gets the value of the adGroupExperimentBidMultipliersType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdGroupExperimentBidMultipliersType() {
        return adGroupExperimentBidMultipliersType;
    }

    /**
     * Sets the value of the adGroupExperimentBidMultipliersType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdGroupExperimentBidMultipliersType(String value) {
        this.adGroupExperimentBidMultipliersType = value;
    }

}
