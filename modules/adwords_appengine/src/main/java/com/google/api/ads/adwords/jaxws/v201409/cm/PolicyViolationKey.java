
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Key of the violation. The key is used for referring to a violation when
 *             filing an exemption request.
 *           
 * 
 * <p>Java class for PolicyViolationKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyViolationKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="violatingText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyViolationKey", propOrder = {
    "policyName",
    "violatingText"
})
public class PolicyViolationKey {

    protected String policyName;
    protected String violatingText;

    /**
     * Gets the value of the policyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * Sets the value of the policyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyName(String value) {
        this.policyName = value;
    }

    /**
     * Gets the value of the violatingText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViolatingText() {
        return violatingText;
    }

    /**
     * Sets the value of the violatingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViolatingText(String value) {
        this.violatingText = value;
    }

}
