
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the {@link AdRule} uniquely identified by the given ID.
 *             
 *             @param adRuleId the ID of the ad rule, which must already exist
 *             @return the {@code AdRule} uniquely identified by the given ID
 *             @throws ApiException if there is an error retrieving the ad rule
 *             or the ID is invalid
 *           
 * 
 * <p>Java class for getAdRule element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getAdRule">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="adRuleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "adRuleId"
})
@XmlRootElement(name = "getAdRule")
public class AdRuleServiceInterfacegetAdRule {

    protected Integer adRuleId;

    /**
     * Gets the value of the adRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdRuleId() {
        return adRuleId;
    }

    /**
     * Sets the value of the adRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdRuleId(Integer value) {
        this.adRuleId = value;
    }

}
