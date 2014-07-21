
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Base class for all bidding schemes.
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for BiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiddingScheme">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BiddingScheme.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiddingScheme", propOrder = {
    "biddingSchemeType"
})
@XmlSeeAlso({
    EnhancedCpcBiddingScheme.class,
    ManualCpcBiddingScheme.class,
    TargetRoasBiddingScheme.class,
    ManualCpmBiddingScheme.class,
    PercentCpaBiddingScheme.class,
    BudgetOptimizerBiddingScheme.class,
    TargetSpendBiddingScheme.class,
    PageOnePromotedBiddingScheme.class,
    ConversionOptimizerBiddingScheme.class,
    TargetCpaBiddingScheme.class
})
public abstract class BiddingScheme {

    @XmlElement(name = "BiddingScheme.Type")
    protected String biddingSchemeType;

    /**
     * Gets the value of the biddingSchemeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiddingSchemeType() {
        return biddingSchemeType;
    }

    /**
     * Sets the value of the biddingSchemeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiddingSchemeType(String value) {
        this.biddingSchemeType = value;
    }

}
