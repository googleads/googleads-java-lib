
package com.google.api.ads.dfp.jaxws.v201308;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a list of {@link RateCard} objects. Rate cards must be activated
 *             before being associated with proposal line items and products.
 *             
 *             @param rateCards the rate cards to be created
 *             @return the created rate cards.
 *           
 * 
 * <p>Java class for createRateCards element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createRateCards">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="rateCards" type="{https://www.google.com/apis/ads/publisher/v201308}RateCard" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rateCards"
})
@XmlRootElement(name = "createRateCards")
public class RateCardServiceInterfacecreateRateCards {

    protected List<RateCard> rateCards;

    /**
     * Gets the value of the rateCards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateCards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateCards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateCard }
     * 
     * 
     */
    public List<RateCard> getRateCards() {
        if (rateCards == null) {
            rateCards = new ArrayList<RateCard>();
        }
        return this.rateCards;
    }

}
