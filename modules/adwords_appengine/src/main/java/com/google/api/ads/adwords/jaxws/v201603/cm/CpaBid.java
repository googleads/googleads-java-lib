
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             CPA Bids.
 *           
 * 
 * <p>Java class for CpaBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CpaBid">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}Bids">
 *       &lt;sequence>
 *         &lt;element name="bid" type="{https://adwords.google.com/api/adwords/cm/v201603}Money" minOccurs="0"/>
 *         &lt;element name="bidSource" type="{https://adwords.google.com/api/adwords/cm/v201603}BidSource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CpaBid", propOrder = {
    "bid",
    "bidSource"
})
public class CpaBid
    extends Bids
{

    protected Money bid;
    @XmlSchemaType(name = "string")
    protected BidSource bidSource;

    /**
     * Gets the value of the bid property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBid() {
        return bid;
    }

    /**
     * Sets the value of the bid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBid(Money value) {
        this.bid = value;
    }

    /**
     * Gets the value of the bidSource property.
     * 
     * @return
     *     possible object is
     *     {@link BidSource }
     *     
     */
    public BidSource getBidSource() {
        return bidSource;
    }

    /**
     * Sets the value of the bidSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidSource }
     *     
     */
    public void setBidSource(BidSource value) {
        this.bidSource = value;
    }

}
