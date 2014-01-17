
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains statistics such as impressions, clicks delivered and cost
 *             for {@link LineItemCreativeAssociation} objects.
 *           
 * 
 * <p>Java class for LineItemCreativeAssociationStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemCreativeAssociationStats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stats" type="{https://www.google.com/apis/ads/publisher/v201208}Stats" minOccurs="0"/>
 *         &lt;element name="costInOrderCurrency" type="{https://www.google.com/apis/ads/publisher/v201208}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemCreativeAssociationStats", propOrder = {
    "stats",
    "costInOrderCurrency"
})
public class LineItemCreativeAssociationStats {

    protected Stats stats;
    protected Money costInOrderCurrency;

    /**
     * Gets the value of the stats property.
     * 
     * @return
     *     possible object is
     *     {@link Stats }
     *     
     */
    public Stats getStats() {
        return stats;
    }

    /**
     * Sets the value of the stats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stats }
     *     
     */
    public void setStats(Stats value) {
        this.stats = value;
    }

    /**
     * Gets the value of the costInOrderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCostInOrderCurrency() {
        return costInOrderCurrency;
    }

    /**
     * Sets the value of the costInOrderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCostInOrderCurrency(Money value) {
        this.costInOrderCurrency = value;
    }

}
