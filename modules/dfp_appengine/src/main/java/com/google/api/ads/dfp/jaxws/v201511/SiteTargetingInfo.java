
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains information required for AdWords advertisers to place their ads.
 *           
 * 
 * <p>Java class for SiteTargetingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteTargetingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetingSiteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetingAdLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteTargetingInfo", propOrder = {
    "targetingDescription",
    "targetingSiteName",
    "targetingAdLocation"
})
@XmlSeeAlso({
    Placement.class
})
public class SiteTargetingInfo {

    protected String targetingDescription;
    protected String targetingSiteName;
    protected String targetingAdLocation;

    /**
     * Gets the value of the targetingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetingDescription() {
        return targetingDescription;
    }

    /**
     * Sets the value of the targetingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetingDescription(String value) {
        this.targetingDescription = value;
    }

    /**
     * Gets the value of the targetingSiteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetingSiteName() {
        return targetingSiteName;
    }

    /**
     * Sets the value of the targetingSiteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetingSiteName(String value) {
        this.targetingSiteName = value;
    }

    /**
     * Gets the value of the targetingAdLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetingAdLocation() {
        return targetingAdLocation;
    }

    /**
     * Sets the value of the targetingAdLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetingAdLocation(String value) {
        this.targetingAdLocation = value;
    }

}
