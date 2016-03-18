
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents targeted or excluded ad units.
 *           
 * 
 * <p>Java class for AdUnitTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdUnitTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeDescendants" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdUnitTargeting", propOrder = {
    "adUnitId",
    "includeDescendants"
})
public class AdUnitTargeting {

    protected String adUnitId;
    protected Boolean includeDescendants;

    /**
     * Gets the value of the adUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdUnitId() {
        return adUnitId;
    }

    /**
     * Sets the value of the adUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdUnitId(String value) {
        this.adUnitId = value;
    }

    /**
     * Gets the value of the includeDescendants property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDescendants() {
        return includeDescendants;
    }

    /**
     * Sets the value of the includeDescendants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDescendants(Boolean value) {
        this.includeDescendants = value;
    }

}
