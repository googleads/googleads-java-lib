
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a phone extension.
 *             
 *             <p>This type of ad extension attaches a phone number
 *             to a text ad, which lets customers call the advertiser directly from the ad.
 *             Phone extensions will appear as clickable phone numbers beneath the main text ad,
 *             and will be visible to high-end mobile device users who access google.com search,
 *             Voice search, Google Mobile App, or Google Maps for Mobile from their phone.
 *             </p>
 *             <p>Learn more about
 *             <a href="//support.google.com/adwords/bin/answer.py?answer=2453991">
 *             phone extensions</a>.
 *             </p>
 *           
 * 
 * <p>Java class for MobileExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileExtension">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201309}AdExtension">
 *       &lt;sequence>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCallTrackingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCallOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileExtension", propOrder = {
    "phoneNumber",
    "countryCode",
    "isCallTrackingEnabled",
    "isCallOnly"
})
public class MobileExtension
    extends AdExtension
{

    protected String phoneNumber;
    protected String countryCode;
    protected Boolean isCallTrackingEnabled;
    protected Boolean isCallOnly;

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the isCallTrackingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCallTrackingEnabled() {
        return isCallTrackingEnabled;
    }

    /**
     * Sets the value of the isCallTrackingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCallTrackingEnabled(Boolean value) {
        this.isCallTrackingEnabled = value;
    }

    /**
     * Gets the value of the isCallOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCallOnly() {
        return isCallOnly;
    }

    /**
     * Sets the value of the isCallOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCallOnly(Boolean value) {
        this.isCallOnly = value;
    }

}
