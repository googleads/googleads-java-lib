
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Network settings for a Campaign.
 *           
 * 
 * <p>Java class for NetworkSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetGoogleSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="targetSearchNetwork" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="targetContentNetwork" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="targetPartnerSearchNetwork" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkSetting", propOrder = {
    "targetGoogleSearch",
    "targetSearchNetwork",
    "targetContentNetwork",
    "targetPartnerSearchNetwork"
})
public class NetworkSetting {

    protected Boolean targetGoogleSearch;
    protected Boolean targetSearchNetwork;
    protected Boolean targetContentNetwork;
    protected Boolean targetPartnerSearchNetwork;

    /**
     * Gets the value of the targetGoogleSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTargetGoogleSearch() {
        return targetGoogleSearch;
    }

    /**
     * Sets the value of the targetGoogleSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTargetGoogleSearch(Boolean value) {
        this.targetGoogleSearch = value;
    }

    /**
     * Gets the value of the targetSearchNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTargetSearchNetwork() {
        return targetSearchNetwork;
    }

    /**
     * Sets the value of the targetSearchNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTargetSearchNetwork(Boolean value) {
        this.targetSearchNetwork = value;
    }

    /**
     * Gets the value of the targetContentNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTargetContentNetwork() {
        return targetContentNetwork;
    }

    /**
     * Sets the value of the targetContentNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTargetContentNetwork(Boolean value) {
        this.targetContentNetwork = value;
    }

    /**
     * Gets the value of the targetPartnerSearchNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTargetPartnerSearchNetwork() {
        return targetPartnerSearchNetwork;
    }

    /**
     * Sets the value of the targetPartnerSearchNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTargetPartnerSearchNetwork(Boolean value) {
        this.targetPartnerSearchNetwork = value;
    }

}
