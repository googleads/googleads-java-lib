
package com.google.api.ads.adwords.jaxws.v201509.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Abstract class representing a request to estimate stats.
 *           
 * 
 * <p>Java class for EstimateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EstimateRequest.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimateRequest", propOrder = {
    "estimateRequestType"
})
@XmlSeeAlso({
    KeywordEstimateRequest.class,
    CampaignEstimateRequest.class,
    AdGroupEstimateRequest.class
})
public abstract class EstimateRequest {

    @XmlElement(name = "EstimateRequest.Type")
    protected String estimateRequestType;

    /**
     * Gets the value of the estimateRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimateRequestType() {
        return estimateRequestType;
    }

    /**
     * Sets the value of the estimateRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimateRequestType(String value) {
        this.estimateRequestType = value;
    }

}
