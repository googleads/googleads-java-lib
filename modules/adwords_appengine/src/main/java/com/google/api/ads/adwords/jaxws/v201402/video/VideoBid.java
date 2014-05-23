
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201402.cm.Money;


/**
 * 
 *             Represents a bid on a criterion. It's basically just a wrapper around
 *             a Money object, so that we can model resetting a bid in terms of
 *             a Bid object with a null amount.
 *           
 * 
 * <p>Java class for VideoBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{https://adwords.google.com/api/adwords/cm/v201402}Money" minOccurs="0"/>
 *         &lt;element name="source" type="{https://adwords.google.com/api/adwords/video/v201402}VideoBid.Source" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoBid", propOrder = {
    "amount",
    "source"
})
public class VideoBid {

    protected Money amount;
    protected VideoBidSource source;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmount(Money value) {
        this.amount = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link VideoBidSource }
     *     
     */
    public VideoBidSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoBidSource }
     *     
     */
    public void setSource(VideoBidSource value) {
        this.source = value;
    }

}
