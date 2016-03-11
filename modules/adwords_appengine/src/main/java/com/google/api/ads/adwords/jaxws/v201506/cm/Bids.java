
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Base class for all bids.
 *           
 * 
 * <p>Java class for Bids complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bids">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bids.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bids", propOrder = {
    "bidsType"
})
@XmlSeeAlso({
    CpaBid.class,
    CpcBid.class,
    CpmBid.class
})
public abstract class Bids {

    @XmlElement(name = "Bids.Type")
    protected String bidsType;

    /**
     * Gets the value of the bidsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidsType() {
        return bidsType;
    }

    /**
     * Sets the value of the bidsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidsType(String value) {
        this.bidsType = value;
    }

}
