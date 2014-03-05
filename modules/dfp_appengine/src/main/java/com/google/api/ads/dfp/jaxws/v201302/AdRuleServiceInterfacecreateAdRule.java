
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@link AdRule}.
 *             
 *             The following fields are required:
 *             <ul>
 *             <li>{@link AdRule#id}</li>
 *             <li>{@link AdRule#name}</li>
 *             <li>{@link AdRule#priority}</li>
 *             <li>{@link AdRule#startDateTime}</li>
 *             <li>{@link AdRule#endDateTime}</li>
 *             <li>{@link AdRule#preroll}</li>
 *             <li>{@link AdRule#midroll}</li>
 *             <li>{@link AdRule#postroll}</li>
 *             </ul>
 *             
 *             @param adRule the ad rule to create
 *             @return the ad rule with its ID filled in
 *             @throws ApiException if there the ad rule is invalid or there is another
 *             error
 *           
 * 
 * <p>Java class for createAdRule element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createAdRule">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="adRule" type="{https://www.google.com/apis/ads/publisher/v201302}AdRule" minOccurs="0"/>
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
@XmlRootElement(name = "createAdRule")
public class AdRuleServiceInterfacecreateAdRule {

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
