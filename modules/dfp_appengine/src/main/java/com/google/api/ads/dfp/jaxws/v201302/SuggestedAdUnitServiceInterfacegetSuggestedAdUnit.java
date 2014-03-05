
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the SuggestedAdUnit uniquely identified by the given ID.
 *             
 *             @param suggestedAdUnitId the ID of the {@code SuggestedAdUnit}, which must already exist.
 *           
 * 
 * <p>Java class for getSuggestedAdUnit element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getSuggestedAdUnit">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="suggestedAdUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "suggestedAdUnitId"
})
@XmlRootElement(name = "getSuggestedAdUnit")
public class SuggestedAdUnitServiceInterfacegetSuggestedAdUnit {

    protected String suggestedAdUnitId;

    /**
     * Gets the value of the suggestedAdUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestedAdUnitId() {
        return suggestedAdUnitId;
    }

    /**
     * Sets the value of the suggestedAdUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestedAdUnitId(String value) {
        this.suggestedAdUnitId = value;
    }

}
