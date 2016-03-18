
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the creative targeting criteria for a {@link LineItem}.
 *           
 * 
 * <p>Java class for CreativeTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreativeTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targeting" type="{https://www.google.com/apis/ads/publisher/v201511}Targeting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreativeTargeting", propOrder = {
    "name",
    "targeting"
})
public class CreativeTargeting {

    protected String name;
    protected Targeting targeting;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the targeting property.
     * 
     * @return
     *     possible object is
     *     {@link Targeting }
     *     
     */
    public Targeting getTargeting() {
        return targeting;
    }

    /**
     * Sets the value of the targeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Targeting }
     *     
     */
    public void setTargeting(Targeting value) {
        this.targeting = value;
    }

}
