
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A base rate that applies to a product template, product or product package
 *             item belonging to rate card.
 *           
 * 
 * <p>Java class for BaseRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rateCardId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRate", propOrder = {
    "rateCardId",
    "id"
})
@XmlSeeAlso({
    ProductPackageItemBaseRate.class,
    ProductTemplateBaseRate.class,
    UnknownBaseRate.class,
    ProductBaseRate.class
})
public abstract class BaseRate {

    protected Long rateCardId;
    protected Long id;

    /**
     * Gets the value of the rateCardId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRateCardId() {
        return rateCardId;
    }

    /**
     * Sets the value of the rateCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRateCardId(Long value) {
        this.rateCardId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

}
