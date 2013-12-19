
package com.google.api.ads.adwords.jaxws.v201309.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Abstract class representing an reply to an {@link EstimateRequest}.
 *           
 * 
 * <p>Java class for Estimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Estimate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Estimate.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Estimate", propOrder = {
    "estimateType"
})
@XmlSeeAlso({
    KeywordEstimate.class,
    AdGroupEstimate.class,
    CampaignEstimate.class
})
public class Estimate {

    @XmlElement(name = "Estimate.Type")
    protected String estimateType;

    /**
     * Gets the value of the estimateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimateType() {
        return estimateType;
    }

    /**
     * Sets the value of the estimateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimateType(String value) {
        this.estimateType = value;
    }

}
