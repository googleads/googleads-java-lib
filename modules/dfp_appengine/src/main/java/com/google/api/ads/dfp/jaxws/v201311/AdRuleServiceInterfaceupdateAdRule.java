
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates a previously-created {@link AdRule}.
 *             
 *             @param adRule the ad rule that should be updated
 *             @return the updated ad rule
 *             @throws ApiException if there is an error updating the ad rule
 *           
 * 
 * <p>Java class for updateAdRule element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateAdRule">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="adRule" type="{https://www.google.com/apis/ads/publisher/v201311}AdRule" minOccurs="0"/>
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
    "adRule"
})
@XmlRootElement(name = "updateAdRule")
public class AdRuleServiceInterfaceupdateAdRule {

    protected AdRule adRule;

    /**
     * Gets the value of the adRule property.
     * 
     * @return
     *     possible object is
     *     {@link AdRule }
     *     
     */
    public AdRule getAdRule() {
        return adRule;
    }

    /**
     * Sets the value of the adRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdRule }
     *     
     */
    public void setAdRule(AdRule value) {
        this.adRule = value;
    }

}
