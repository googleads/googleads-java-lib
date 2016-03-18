
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The action used for retracting {@link Proposal} objects.
 *           
 * 
 * <p>Java class for RetractProposals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetractProposals">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201508}ProposalAction">
 *       &lt;sequence>
 *         &lt;element name="retractionDetails" type="{https://www.google.com/apis/ads/publisher/v201508}RetractionDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetractProposals", propOrder = {
    "retractionDetails"
})
public class RetractProposals
    extends ProposalAction
{

    protected RetractionDetails retractionDetails;

    /**
     * Gets the value of the retractionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RetractionDetails }
     *     
     */
    public RetractionDetails getRetractionDetails() {
        return retractionDetails;
    }

    /**
     * Sets the value of the retractionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetractionDetails }
     *     
     */
    public void setRetractionDetails(RetractionDetails value) {
        this.retractionDetails = value;
    }

}
